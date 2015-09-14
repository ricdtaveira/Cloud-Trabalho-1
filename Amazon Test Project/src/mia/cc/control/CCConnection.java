package mia.cc.control;

import mia.cc.control.credentials.CCCredential;
import mia.cc.control.credentials.CCCredentialFactory;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;

public class CCConnection {

	private CCCredential credential;
	private AWSCredentials credentials;
	private AmazonEC2 ec2;
	
	private static CCConnection instance;

	public static CCConnection getInstance() {
		if(instance == null)
		{
			instance = new CCConnection();
		}
		return instance;
	}

	private CCConnection()
	{
		credential = CCCredentialFactory.getInstance().getCredential();
		credentials = new ProfileCredentialsProvider(credential.getProfileCredentialsProvider()).getCredentials();
		ec2 = new AmazonEC2Client(credentials);
	}
	
	public AmazonEC2 getEc2() {
		return ec2;
	}
}
