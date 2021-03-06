package mia.cc.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mia.cc.control.credentials.CCCredential;
import mia.cc.control.credentials.CCCredentialFactory;
import mia.cc.models.CCInstance;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;

public class QueryExample {

	public static void main(String[] args) {
		CCCredential credential = CCCredentialFactory.getInstance().getCredential();
		
		AWSCredentials credentials = new ProfileCredentialsProvider(credential.getProfileCredentialsProvider()).getCredentials();
        AmazonEC2 ec2 = new AmazonEC2Client(credentials);
        
        DescribeAvailabilityZonesResult availabilityZonesResult = ec2.describeAvailabilityZones();
        System.out.println("Availability Zones: " + availabilityZonesResult.getAvailabilityZones().size());

        DescribeInstancesResult describeInstancesRequest = ec2.describeInstances();
        List<Reservation> reservations = describeInstancesRequest.getReservations();
        Set<Instance> instances = new HashSet<Instance>();

        for (Reservation reservation : reservations) {
            instances.addAll(reservation.getInstances());
        }

        System.out.println("Amazon EC2 instance(s): " + instances.size());
        for(Instance instance : instances)
        {
        	CCInstance insta = new CCInstance(instance);
        	System.out.println(insta);
        }
	}
}
