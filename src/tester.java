import java.io.File;


public class tester {
	public static void main(String[] args) {
		file fil = new file(new File("README.md"));
		
		filehandler fh = new filehandler("randomfiles");
		
		
		System.out.println(fh.getFile());

	}

}
