package Programmieren2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOFile2 {

	public static void main(String[] args) {
		File file = new File("/Users/Viktoria/Documents/PR2/Tiles2.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			String outputText = "Hello File - First output :-)";
			oos.writeObject(outputText);
			/*for (char c : outputText.toCharArray()) {
				fos.write((int)c);
			}*/
			fos.flush();
			if(file.exists()){
				System.out.println("Datei angelegt und Inhalt geschrieben");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
		
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
