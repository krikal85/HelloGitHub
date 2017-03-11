package Programmieren2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class filein {

	public static void main(String[] args)  {
		
		File file = new File("/Users/Viktoria/Documents/PR2/Tiles.txt");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			int byteRead;
			while((byteRead = fis.read()) != -1){
				char[] ch = Character.toChars(byteRead);
				System.out.println(ch[0]);
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
