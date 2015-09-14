package mia.cc.control.credentials;

/**
 * Classe Factory para buscar a credencial correta do usuário
 * @author Yvens
 *
 */
public class CCCredentialFactory {

	private static CCCredentialFactory instance;

	public static CCCredentialFactory getInstance() {
		if(instance == null)
		{
			//TODO mudar aqui o usuário
			instance = new CCCredentialFactory(CCCredentialUser.YVENS);
		}
		return instance;
	}

	private CCCredential credential;

	private CCCredentialFactory(CCCredentialUser user) {
		switch (user) {
		case RICARDO:
			credential = CCCredential.credentialsRicardo;
			break;
		case YVENS:
			credential = CCCredential.credentialsYvens;
			break;
		}
	}

	public CCCredential getCredential() {
		return credential;
	}
}
