package HK_IWI_PR1.src.org.campus02.rec;

public class Demo {

	public static void main(String[] args) {
		
		Maze maze = new Maze();
		System.out.println(maze.toString());
				
		MazeRunner solver = new MazeRunner(maze);
		solver.solve();
		
	}

}
