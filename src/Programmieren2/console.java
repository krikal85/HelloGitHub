package Programmieren2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class console {

	public static void main(String[] args) {
		File file = new File("/Users/Viktoria/Documents/PR2/Tiles3.txt");
		System.out.println("Bitte gib einen Text ein: ");
		FileOutputStream fos = null;
	
			try {
				fos = new FileOutputStream(file);
				int byteRead;
				do {
					byteRead = System.in.read();
					fos.write(byteRead);
				} while (byteRead != 88 && byteRead!=120);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
	}
}
