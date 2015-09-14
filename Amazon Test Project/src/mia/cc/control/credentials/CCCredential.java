package mia.cc.control.credentials;

/**
 * Classe para armazenar as informa��es das credenciais do usu�rio
 * @author Yvens
 *
 */
public class CCCredential {

	/*
	 * Aqui s�o as credenciais j� fixas da equipe
	 */
	public static CCCredential credentialsYvens   = new CCCredential("yvens", "ec2.us-east-1.amazonaws.com", "keyname", "default");
	//TODO ajustar aqui com as tuas credenciais
	public static CCCredential credentialsRicardo = new CCCredential("ricardo", "ec2.us-east-1.amazonaws.com", "keyname", "default");
	
	private String profileCredentialsProvider;
	private String endPoint;
	private String keyName;
	private String securityGroup;
	
	/**
	 * Construtor default, privado, de credenciais
	 * @param profileCredentialsProvider
	 * @param endPoint
	 * @param keyName
	 * @param securityGroup
	 */
	private CCCredential(String profileCredentialsProvider, String endPoint,
			String keyName, String securityGroup) {
		this.profileCredentialsProvider = profileCredentialsProvider;
		this.endPoint = endPoint;
		this.keyName = keyName;
		this.securityGroup = securityGroup;
	}

	/*
	 * Apenas m�todos do tipo GET
	 */
	public String getProfileCredentialsProvider() {
		return profileCredentialsProvider;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public String getKeyName() {
		return keyName;
	}
	public String getSecurityGroup() {
		return securityGroup;
	}
	
}
