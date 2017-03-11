package Programmieren2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BifferedInputStream {
public static void main(String[] args) {
	File file = new File("/Users/Viktoria/Documents/PR2/Tiles.txt");
	FileInputStream fis = null;
	
	try {
		fis = new FileInputStream(file);
		int byteRead= 0;
		BufferedInputStream bis = new BufferedInputStream(fis);
		while((byteRead = bis.read()) != -1){
			char[] ch = Character.toChars(byteRead);
			System.out.print(ch[0]);
		}
		//fis.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}finally{
		if(fis!=null){
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
