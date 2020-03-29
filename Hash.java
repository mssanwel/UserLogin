import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Hash{
	
	public static String execute(String passwordToHash){
		
    String generatedPassword = null;
	MessageDigest md=null;
	try {
		md = MessageDigest.getInstance("SHA-256");
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    md.update(passwordToHash.getBytes());
    byte[] bytes = md.digest();
    StringBuilder sb = new StringBuilder();
    for(int i=0; i< bytes.length ;i++)
    {
        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
    }
    generatedPassword = sb.toString();
    return generatedPassword;
	}
}