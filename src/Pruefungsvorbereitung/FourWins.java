package Pruefungsvorbereitung;


public class FourWins {
	private int sizeX =0;
	private int sizeY=0;
	private char charArray [] [];
	
	public FourWins (int sizeX, int sizeY){
		this.sizeX = sizeX;
		this.sizeY= sizeY;
		
		this.charArray = new char [sizeX] [sizeY] ;
		
		for (int x=0; x< charArray.length; x++){
			for (int y=0; y<sizeX; y++){
				charArray[x][y]=' ';
			}
		}
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	
	public boolean playerA(int x, int y){
		if (charArray [x] [y]== ' '){
			charArray [x] [y] = 'A';
			return true;
		}
		else{
			System.out.println("Leider schon besetzt");
			return false;
		}
	}

	public boolean playerB(int x, int y){
		if (charArray [x] [y]== ' '){
			charArray [x] [y] = 'B';
			return true;
		}
		else{
			System.out.println("Leider schon besetzt");
			return false;
		}
	}
	
	private char forInRow(){
		char lastChar =' ';
		int countSameChar =0;
		
		
		for (int y=0; y <charArray[0].length; y++){
			for(int x=0; x< charArray.length; x++){
				if (charArray[x][y]!=lastChar){
					lastChar = charArray[x][y];
					countSameChar=1;
				}
				else if (charArray[x][y]!=' '){
					countSameChar++;
				}
				
				if (countSameChar == 4){
					return lastChar;
				}
			}
			countSameChar=0;
			lastChar =' ';
		}
		return '-';
	}
	
	private char forInColumn(){
		char lastChar =' ';
		int countSameChar =0;
		
		for (int x=0; x<charArray.length;x++){
			for (int y=0; y<charArray[0].length;y++){
				if(charArray[x][y]!=lastChar){
					lastChar=charArray[x][y];
					countSameChar=0;
				}
				else if (charArray[x][y]!=' '){
					countSameChar++;
				}
				
				if(countSameChar==4){
					return lastChar;
				}
			}
			lastChar=' ';
			countSameChar=0;
		}
		return '-';
	}
	
	public char winner(){
		if(forInColumn()!='-'){
			return forInColumn();
		}
		return forInRow();
	}
	
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
