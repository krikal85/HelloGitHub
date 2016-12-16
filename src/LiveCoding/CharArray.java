package LiveCoding;

public class CharArray {

	private char [] newArray;
	public static int countObjects;
	
	public CharArray (char [] newArray){
		this.newArray = newArray;
		countObjects++;
		//return newArray;
	}
	
	public void print(){
		for (int i = 0; i <this.newArray.length;i++){
			System.out.print(this.newArray[i]);
			
		}
		System.out.println();
	}
	
	public void print(int start, int end){
		if(start >= 0 
				&& end >= start
				&& end < newArray.length){
			for (int i = start; i < end; i++){
				System.out.print(this.newArray[i]);
			}
		}
		System.out.println();
	}
	
	public int length(){
		//this.newArray.length;
		return this.newArray.length;
	}
	
	
}
