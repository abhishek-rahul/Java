package EC2Reboot;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.RebootInstancesRequest;
import com.amazonaws.services.ec2.model.RebootInstancesResult;

public class RebootInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	       final String USAGE =
	               "To run this example, supply an instance id\n" +
	               "Ex: RebootInstance <instance_id>\n";
/*
	           if (args.length != 1) {
	               System.out.println(USAGE);
	               System.exit(1); 
	           }
*/
	           String instance_id = "i-6d0f0ff1";
	           final AmazonEC2 ec2 = AmazonEC2ClientBuilder.defaultClient();
	           RebootInstancesRequest request = new RebootInstancesRequest()
	               .withInstanceIds(instance_id);
	           RebootInstancesResult response = ec2.rebootInstances(request);

	           System.out.printf(
	               "Successfully rebooted instance %s", instance_id);
	}

}
