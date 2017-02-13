package org.campus02.rec;

import java.util.ArrayList;

public class Folder extends FSEntry {

	private ArrayList<FSEntry> files = new ArrayList<>();
	private ArrayList<FSEntry> folders = new ArrayList<>();
	
	public Folder(String name) {
		super(name);
	}
	
	public void putEntry(File entry) {
		files.add(entry);
	}
	
	public void putEntry(Folder entry) {
		folders.add(entry);
	}
			
	@Override
	public void print() {
		System.out.print(getName()+": Folder");
	}
	
	public void printAll() {
		for (FSEntry folder : folders) {
			folder.print();
		
		}
		for (FSEntry fsEntry : files) {
			fsEntry.print();
		}
	}
	
	public void listAllContent(String prefixPath) {
		for (FSEntry file : files) {
			file.print();
		}
		for (FSEntry folder : folders) {
			Folder f = (Folder) folder;
			f.listAllContent(folder.getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.print(prefixPath);
		for (FSEntry file : files) {
			file.print();
		}
		for (FSEntry folder : folders) {
			Folder f  =(Folder) folder;
			f.listAllContent(folder.getName());
		}*/
		
	}
	
	public void printTree(String indent) {
		System.out.println(indent+"+"+getName()+"/");
		for (FSEntry file : files) {
			
			System.out.print(indent+"  -");
			file.print();
		}
		for (FSEntry folder : folders) {
			Folder f = (Folder) folder;
			f.printTree(indent+"  ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		/*System.out.println(indent+"+"+this.getName()+"/");
		
		for (FSEntry file : files) {
			System.out.print(indent + "  -");
			file.print();
		}
		
		for (FSEntry folder : folders){
			
			//Downcast
			Folder f = (Folder) folder;
			indent +="  ";
			f.printTree(indent);
		}
		
		
	}*/

}
