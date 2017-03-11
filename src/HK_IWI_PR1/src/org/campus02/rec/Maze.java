package HK_IWI_PR1.src.org.campus02.rec;

public class Maze {
	
	public static final char WALL_CHAR = '#';
	public static final char START_CHAR = 'S';
	public static final char EXIT_CHAR = 'E';
	public static final char VISIT_CHAR = '*';
	public static final char FREE_CHAR = ' ';
	
	private final char[][] maze = {
			{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
			{'#', ' ', ' ', 'S', '#', ' ', '#', ' ', ' ', '#'},
			{'#', ' ', '#', '#', '#', ' ', '#', '#', ' ', '#'},
			{'#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#'},
			{'#', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#'},
			{'#', '#', '#', ' ', '#', '#', ' ', ' ', ' ', '#'},
			{'#', ' ', '#', ' ', ' ', '#', '#', '#', '#', '#'},
			{'#', ' ', ' ', ' ', ' ', ' ', '#', 'E', '#', '#'},
			{'#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', '#'},
			{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
		};
	
	@Override
	public String toString() {
		String myMaze ="";
		for (int x = 0; x < maze.length; x++) {
			for (int y = 0; y < maze.length; y++) {
				
				myMaze = ""+maze[x][y];
			}
			
		}
		return "";
	}
	
	public CoordPair findStartPosition() {
		//TODO
		return null;
	}
	
	public CoordPair findExitPosition() {
		//TODO
		return null;
	}
		
	public boolean isWallOrVisited(CoordPair cp) {
		//TODO
		return false;
	}
	
	public boolean isExitPosition(CoordPair cp) {
		//TODO
		return false;
	}
	
	public void markPosition(CoordPair cp) {
		//TODO
	}
	
	public void unmarkPosition(CoordPair cp) {
		//TODO
	}
}
