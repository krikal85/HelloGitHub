package LiveCoding;

public class turmRechner {

	public static void main(String[] args) {
		int startValue = 2;
		int i = 2;
		
		for(i=2;i<10;i++){
			System.out.println(startValue+"x"+i);
			startValue = startValue*i;
		}
		
		for(i=2;i<10;i++){
			System.out.println(startValue+"/"+i);
			startValue = startValue/i;
			if(i == 9){
				System.out.println(startValue);	
			}
		}
		
	}

}
