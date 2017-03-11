package Programmieren2;

import java.io.File;

public class DemoFile {

	public static void main(String[] args) {
		File file = new File("/Users/Viktoria/Documents/PR2");
		
		long length = 0;
		for(File files : file.listFiles()) {
			if(!files.isDirectory()){
				length += files.length();
			}
		}
		System.out.println("Gesamtgröße "+length);
		
	}

}
