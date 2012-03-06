import java.io.File;


public class tester {
	public static void main(String[] args) {
		filehandler fh = new filehandler(new File("lol.md5"));
		
		System.out.println(fh.verifyMd5Hashes());

	}

}
