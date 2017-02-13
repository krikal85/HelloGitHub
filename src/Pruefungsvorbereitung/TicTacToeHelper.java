package Pruefungsvorbereitung;

public class TicTacToeHelper {
	
	public static void main(String[] args) {
		char[][] myBoard = generateEmptyBoard(3);
		myBoard[0][0]='O';
		myBoard[0][1]='X';
		myBoard[0][2]='O';
		myBoard[1][0]='O';
		myBoard[1][2]='O';
		myBoard[2][0]='O';
		myBoard[2][2]='X';
		
		printBoard(myBoard);
		//System.out.println(validateBoard(myBoard, 2));
		System.out.println("Gewinner: "+winner(myBoard));
		
	}
	
	public static char[][] generateEmptyBoard(int size){
		char[][] chart = new char[size][size];
		for (int x = 0; x < size; x++) {
			for(int y= 0; y< size; y++){
				chart[x][y] = ' ';
				
			}
			
		}
		return chart;
	}

	public static boolean validateBoard(char[][] board, int size){
		if(board.length != size){
			return false;
		}
		
		else{
				
			int a=0;
			int b = 0;
			for (int x = 0; x < size; x++) {
				for(int y= 0; y< size; y++){
					b=y;
					
				}
				a=x;
			}
			
			if (a==b){
				return true;
			}
			else
				return false;
			}
		}
	
	public static void printBoard(char[][] board){
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				System.out.print(board[x][y]+"\t");
				
			}
			System.out.println();
		}
	}
	
	public static char winner(char[][] board){
		
		char vor=' ';
		char gewinner =' ';
		int count =0;
		
		for (int x = 0; x < board.length ; x++) {
			for (int y = 0; y < board.length; y++) {
				if(board[y][x]!=vor){
					count=1;
					vor = board[y][x];
				} 
				else
					count++;
				if (count == 3){
					gewinner=board[y][x];
				}
				
			}
			
		}
		return gewinner;
	}
}
