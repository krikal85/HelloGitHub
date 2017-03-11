package Programmieren2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;

public class IOBspPerson {

	public static void main(String[] args) {
		Person2 viki = new Person2("Viktoria","Schlaipfer");
		
		File file = new File("/Users/Viktoria/Documents/PR2/personoutput.txt");
		FileInputStream fis = null;
		
		FileOutputStream fos = null;
		
		Person2 person = readPerson();
		System.out.println(person);
		
			try {
				
				fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//String person = viki.getNachname()+" "+viki.getVorname();
				oos.writeObject(viki);
				fos.flush();
				
				fis = new FileInputStream(file);
				//BufferedInputStream bis = new BufferedInputStream(fis);
				
				
				
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					fos.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			

	}
	
	public static Person2 readPerson(){
		
		File file = new File("/Users/Viktoria/Documents/PR2/personoutput.txt");
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			return (Person2) ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}

}
