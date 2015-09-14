package mia.cc.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;
import com.amazonaws.services.ec2.model.RunInstancesRequest;

public class RunExample {
	
public static void main(String[] args) throws Exception {
		
		AWSCredentials credentials = new ProfileCredentialsProvider("yvens").getCredentials();
        AmazonEC2 ec2 = new AmazonEC2Client(credentials);
        
        ec2.setEndpoint("ec2.us-east-1.amazonaws.com");
        
//    	CreateKeyPairRequest createKeyPairRequest = new CreateKeyPairRequest();
//    	createKeyPairRequest.withKeyName("keyname");
//    	CreateKeyPairResult createKeyPairResult = ec2.createKeyPair(createKeyPairRequest);
//    	KeyPair keyPair = new KeyPair();
//    	keyPair = createKeyPairResult.getKeyPair();
//    	String privateKey = keyPair.getKeyMaterial();
    	
    	RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
    		        	
    	runInstancesRequest.withImageId("ami-0032e468")
	                     .withInstanceType("t1.micro")
	                     .withMinCount(1)
	                     .withMaxCount(1)
	                     .withKeyName("keyname")
	                     .withSecurityGroups("default");
	  
    	ec2.runInstances(runInstancesRequest);
    	
        DescribeInstancesResult describeInstancesRequest = ec2.describeInstances();
        List<Reservation> reservations = describeInstancesRequest.getReservations();
        Set<Instance> instances = new HashSet<Instance>();

        for (Reservation reservation : reservations) {
            instances.addAll(reservation.getInstances());
        }

        System.out.println("Amazon EC2 instance(s): " + instances.size());
        for(Instance instance : instances)
        {
        	System.out.println(instance);
        }
    }

}
