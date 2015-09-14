package mia.cc.test;

import java.util.List;

import mia.cc.control.credentials.CCCredential;
import mia.cc.control.credentials.CCCredentialFactory;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.amazonaws.services.ec2.model.DescribeImagesResult;
import com.amazonaws.services.ec2.model.Filter;
import com.amazonaws.services.ec2.model.Image;

public class DescribeImagesExample {

	public static void main(String[] args) {
		CCCredential credential = CCCredentialFactory.getInstance().getCredential();

		AWSCredentials credentials = new ProfileCredentialsProvider(credential.getProfileCredentialsProvider()).getCredentials();
		AmazonEC2 ec2 = new AmazonEC2Client(credentials);

		Filter filter = new Filter();
		filter.setName("architecture");
		filter.withValues("i386");
		
		DescribeImagesRequest request = new DescribeImagesRequest();
		request.getFilters().add(filter);
		
		DescribeImagesResult result = ec2.describeImages(request);
		List<Image> images = result.getImages();
		
		for(Image image : images)
		{
			System.out.println(image.toString());
		}

	}
}
