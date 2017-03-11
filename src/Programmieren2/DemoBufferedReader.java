package Programmieren2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {

	public static void main(String[] args) {
		File file = new File("/Users/Viktoria/Documents/PR2/Tiles.txt");
		//FileReader fr = null;
		BufferedReader br = null;
		try {
		//	fr = new FileReader(file);
			br = new BufferedReader(new FileReader("/Users/Viktoria/Documents/PR2/Tiles.txt"));
			
			String line;
			
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
			//	fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		

	}

}
