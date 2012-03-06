/**
 * file.java
 * Av: Daniel G. Razafimandimby og Vegard Langås
 * 
 * Lisens: Modified BSD License aka BSD 3-clause license
 * Oblig 7 Datakommunikasjon og Sikkerhet 2011/2012 HiN
 * 
 * */

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
	
	//Konstruktør for scanning av mapper
	public file(File file){
		this.file = file;
		md5Hash = getMd5Hash(file);
	}
	//Konstruktør for scanning av linjer
	public file (String md5line)
	{
		String temp[] = md5line.split("\t");
		
		this.md5Hash = temp[0];
		this.file = new File(temp[1]);
	}
	
	//Returnerer om md5hashen som har blitt lagret i objektet
	//stemmer over ens med den faktiske filen
	public boolean isMD5Valid()
	{
		return this.md5Hash.equals(getMd5Hash(this.file));
	}

	//Lager md5-hash
	//Basert på http://www.javalobby.org/java/forums/t84420.html
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
	
	//Returnerer linje til lagring i fil.
	public String toString(){
		return md5Hash + "\t" + file.getPath() + "\n";
	}
	
	

}
