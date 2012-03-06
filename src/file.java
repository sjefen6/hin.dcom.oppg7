import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class file {
	private File file;
	private String md5Hash;
	
	public file(File file){
		this.file = file;
		md5Hash = getMd5Hash(file);
	}

	private String getMd5Hash(File file2) {	
		byte[] buffer = new byte[8192];
		int read = 0;
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			InputStream is = new FileInputStream(file2);
			while( (read = is.read(buffer)) > 0) {
				digest.update(buffer, 0, read);
			}		
			byte[] md5sum = digest.digest();
			BigInteger bigInt = new BigInteger(1, md5sum);
			String output = bigInt.toString(16);
			is.close();
			return output;
		}
		catch(IOException e) {
			return "false";
		} catch (NoSuchAlgorithmException e) {
			return "false";
		}
	}
	
	public String toString(){
		return md5Hash + "\t" + file.getPath() + "\n";
	}
	
	

}
