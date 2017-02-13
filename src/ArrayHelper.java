
public class ArrayHelper {

	public static void main(String[] args) {
		int[] numbers = {8,5,1,9,0,4};
		arrangeOrder(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+"\t");
		}

	}
	
	public static void arrangeOrder(int[] numbers){
		int first =0;
		int second =0;
		boolean test = true;
		while(test){
			test = false;
			for (int i = 0; i < numbers.length-1; i++) {
				first = numbers[i];
				second = numbers[i+1];
				if(numbers[i]>numbers[i+1]){
					
					numbers[i]=second;
					numbers[i+1]=first;
					test = true;
					//arrangeOrder(numbers);
					//System.out.println("First: "+first+" Second: "+second);	
				}
				
					
			}
		}
		
	
		
	}

}
