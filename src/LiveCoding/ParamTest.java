package LiveCoding;

public class ParamTest {

	public static void main(String[] args) {
		String result = printRectanguleArea("Fl�che",4,5);
		System.out.println(result);

	}

	public static String printRectanguleArea(String text,int a,int b){
		int area = a*b;
		return text+" "+area;
	}
}
