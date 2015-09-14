import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.RunInstancesRequest;

public class RunExample {

	public static void main(String[] args) throws Exception {
		
		AWSCredentials credentials = new ProfileCredentialsProvider("default").getCredentials();
        AmazonEC2 ec2 = new AmazonEC2Client(credentials);
        
        ec2.setEndpoint("ec2.us-east-1.amazonaws.com");
        
    	RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
    		        	
    	runInstancesRequest.withImageId("ami-0032e468")
	                     .withInstanceType("t1.micro")
	                     .withMinCount(1)
	                     .withMaxCount(1)
	                     .withKeyName("ronaldo")
	                     .withSecurityGroups("default");
	  
    	ec2.runInstances(runInstancesRequest);
    }
}
