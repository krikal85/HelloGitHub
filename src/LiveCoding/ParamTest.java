package LiveCoding;

public class ParamTest {

	public static void main(String[] args) {
		String result = printRectanguleArea("Fläche",4,5);
		System.out.println(result);

	}

	public static String printRectanguleArea(String text,int a,int b){
		int area = a*b;
		return text+" "+area;
	}
}
