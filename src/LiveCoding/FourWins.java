package LiveCoding;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class FourWins {
	private int sizeX;
	private int sizeY;
	private char [] [] charArray;
	
	public FourWins (int sizeX, int sizeY){
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.charArray = new char[sizeX][sizeY];
		
		for(int i = 0; i < sizeY;i++){
			for(int j = 0; j < sizeX;j++){
				charArray[j] [i]='m';
				//System.out.print(charArray[j][i]+"\t");
			
			}
			//System.out.println();
		}
		
	}

	public int getSizeX() {
		return sizeX;
	}

/*	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}*/

	public int getSizeY() {
		return sizeY;
	}

/*	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}*/
	
	public boolean validate (int x, int y){
		if(x < sizeX && y < sizeY){
			//System.out.println("Validate x: "+x+" Size x: "+sizeX);
			return true;
		}
		/*else if(y < sizeY){
			System.out.println("Validate y: "+y+" Size y: "+sizeY);
			return true;
		}*/
		else{
			return false;
		}
		
	}
	
	public boolean playerA(int x, int y){
		
		if(!validate(x,y)){
			//System.out.println("Zahl zu groß");
			return false;
		}
		else{
			
			if (charArray [x][y] =='m'){
				charArray[x][y]='A';
				return true;
			}
			System.out.println("schon besetzt");
			return false;
		}
	}
	
	public boolean playerB(int x, int y){
		if(!validate(x,y)){
			
			return false;
		}
		else{
			
			if (charArray [x][y] =='m'){
				charArray[x][y]='B';
				//System.out.println(fourInRow());
				
				return true;
			}
			System.out.println("schon besetzt");
			return false;
		}
	
	}
	private char fourInRow(){
		//Initalialize Variables
		int fourB = 0;
		int fourA = 0;
		int i=0;
		int j=0;
		char row = ' ';
		
		while(j<sizeY){
			
			for(i = 0;i<sizeX;i++){
							
				if(charArray[i][j]== 'B'&& fourB < 4){
					fourB ++;
				}
				else if(charArray[i][j]== 'A'&& fourA < 4){
					fourA ++;
				}
				if (fourB == 4){
					row = 'B';
					return row;
				}
				if (fourA == 4){
					row = 'A';
					fourA = 0;
					return row;
				}
				else {
					row = '-';
				}
			}
			j++;
			fourB = 0;
			fourA = 0;
		}
		return row;
	}
	
	private char fourInColumn(){
		//Initalialize Variables
		int fourB = 0;
		int fourA = 0;
		int i=0;
		int j=0;
		char column = ' ';
		
		while(i<sizeX){
			
			for(j = 0;j<sizeY;j++){
							
				if(charArray[i][j]== 'B'&& fourB < 4){
					fourB ++;
				}
				else if(charArray[i][j]== 'A'&& fourA < 4){
					fourA ++;
				}
				if (fourB == 4){
					column = 'B';
					return column;
				}
				if (fourA == 4){
					column = 'A';
					fourA = 0;
					return column;
				}
				else {
					column = '-';
				}
			}
			i++;
			fourB = 0;
			fourA = 0;
		}
		return column;
	}
	
	public char winner(){
		
		char row = fourInRow();
		char column = fourInColumn();
		if (row!='-')
			return row;
		else if(column!='-')
			return column;
		else
			return row;
	}
	

//print Array
	public void printCharArray(){
		for(int i = 0; i < sizeY;i++){
			for(int j = 0; j < sizeX;j++){
				//charArray[j] [i]=' ';
				System.out.print(charArray[j][i]+"\t");
			
			}
			System.out.println();
		}
	}
}