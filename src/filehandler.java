import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JFileChooser;

public class filehandler {
	private ArrayList<file> fileArray;

	public filehandler(String location) {
		fileArray = new ArrayList<file>();
		fileArray.addAll(scan(new File(location)));
	}

	public filehandler(File md5file) {
		fileArray = new ArrayList<file>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(md5file));

			String line;
			while ((line = br.readLine()) != null) {
				fileArray.add(new file(line));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean verifyMd5Hashes() {
		for (file f : fileArray) {
			if (!f.isMD5Valid()) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Based on:
	 * https://github.com/narvik-studentradio/Playlist-Fucker/blob/master
	 * /src/FileHandeler.java
	 */
	public boolean save() {
		JFileChooser chooser = new JFileChooser();

		int status = chooser.showSaveDialog(null);

		// Hvis brukeren ikke velger en plassering og filnavn
		if (status != JFileChooser.APPROVE_OPTION) {
			return false;
		} else { // Hvis brukeren velger en plassering og filnavn
			File outFile = chooser.getSelectedFile();
			try { // Fors¿ker Œ skrive filen
				BufferedWriter fileOut = new BufferedWriter(new FileWriter(
						outFile));
				fileOut.write(getFile());
				fileOut.flush();
				fileOut.close();
				return true;
			} catch (IOException e) { // Hvis det feiler så har jeg ikke mye å
										// fåreslå, kanskje programmet ikke har
										// skrivetilgang
				// Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
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
	 * produsert/tilpasset av Vegard LangÂs for NSR.
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
