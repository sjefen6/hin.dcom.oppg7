import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class filehandler {
	private ArrayList<file> fileArray;

	public filehandler(String location) {
		fileArray = new ArrayList<file>();
		fileArray.addAll(scan(new File(location)));
	}
	
	public filehandler(File md5file)
	{
		
	}

	
	// Genererer string som kan puttes i fil.
	public String getFile() {
		String temp = "";
		for (file f : fileArray) {
			temp += f.toString();
		}
		return temp;
	}

	/*
	 * Based on:
	 * https://github.com/narvik-studentradio/Music-Player/blob/master/
	 * src/contentCollection.java
	 * 
	 * Denne metoden kartlegger rekursivt filer. Koden tidligere
	 * produsert/tilpasset av Vegard Langås for NSR.
	 */
	private Collection<? extends file> scan(File path) {		
		ArrayList<file> tempSongs = new ArrayList<file>();
		File[] listOfFiles = path.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				tempSongs.add(new file(listOfFiles[i]));
			} else if (listOfFiles[i].isDirectory()) {
				tempSongs.addAll(scan(listOfFiles[i]));
			}
		}
		return tempSongs;
	}

}
