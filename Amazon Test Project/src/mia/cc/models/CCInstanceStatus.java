package mia.cc.models;

/**
 * Classe para representar os diferentes status de uma instância (computador) na amazon
 * @author Yvens
 *
 */
public enum CCInstanceStatus 
{
	NULL, PENDING, RUNNING, SHUTTING_DOWN, TERMINATED, STOPPING, STOPPED;
	
	/**
	 * Retirado de: http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/ec2/model/InstanceState.html
	 *  0 : pending

		16 : running
		
		32 : shutting-down
		
		48 : terminated
		
		64 : stopping
		
		80 : stopped
	 * @param code
	 * @return retorna o enum correspondente ao status da instância
	 */
	public static CCInstanceStatus getStatus(Integer code)
	{
		switch(code)
		{
			case 0: return PENDING;
			case 16: return RUNNING;
			case 32: return SHUTTING_DOWN;
			case 48: return TERMINATED;
			case 64: return STOPPING;
			case 80: return STOPPED;
		}
		
		return NULL;
	}
}
