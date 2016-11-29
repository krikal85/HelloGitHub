package LiveCoding;

public class grenzWertReihe {

	public static void main(String[] args) {
		//var declaration
		System.out.println(grenzWertBerechnung(0.01));
		}	
	
	
	public static double grenzWertBerechnung(double genauigkeit){
		double resultCurrent = 0;
		double resultPrevious = 0;
		double result = 0;
	
		resultPrevious = 1/Math.pow(2, 0);
	
		for(int n = 0; ; n++){
			resultPrevious = 1/Math.pow(2, n-1);
			resultCurrent = 1/Math.pow(2, n);
			result = resultPrevious - resultCurrent;
						
			//System.out.println("2^"+n+" = "+resultCurrent+" 2^n-1 = "+resultPrevious);
			
			if(result < genauigkeit){
				System.out.println("Break done at n="+n);
				break;
			}
		}
		return genauigkeit;
	}
}  
