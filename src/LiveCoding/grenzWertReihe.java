package LiveCoding;

public class grenzWertReihe {

	public static void main(String[] args) {
		//var declaration
		double resultCurrent = 0;
		double resultPrevious = 0;
		double result = 0;
	//	double resultOld =0;
		
		//start with n=0; 
		//resultCurrent = Math.pow(2, 0) + resultPrevious;
		//System.out.println(resultCurrent+" ResultP: "+resultPrevious);
		resultPrevious = 1/Math.pow(2, 0);
		//for n =1 till unendlich
		for(int n = 0; ; n++){
			resultPrevious = 1/Math.pow(2, n-1);
			resultCurrent = 1/Math.pow(2, n);
			result = resultPrevious - resultCurrent;
			
			//resultOld = resultPrevious;
			//resultPrevious = resultPrevious + resultCurrent;
			
			System.out.println("2^"+n+" = "+resultCurrent+" 2^n-1 = "+resultPrevious);
			
			if(result < 0.0001){
				System.out.println("Break done at n="+n);
				break;
			}
		}	
	}
}  
