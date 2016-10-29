package LiveCoding;

public class OperatorArithmetik {

	public static void main(String[] args) {
		double degree = 26;
		//Umrechnung Celsius Fahrenheit
		double fahrenheitResult = Math.round(100.0 *celius2Fahrenheit(degree)) / 100.0;
		System.out.println(degree+ " Grad Celsius sinf "+fahrenheitResult+" Grad Fahrenheit");
		
		//Umrechnung Fahrenheit Celsius
		double celsiusResult = Math.round(100.0 *fahrenheit2celsius(fahrenheitResult)) / 100.0;
		System.out.println(fahrenheitResult+ " Grad Fahrenheit sind "+celsiusResult+" Grad Celsius");
	}
	
// Berechnung Celsius -_> Fahrenheit
	public static double celius2Fahrenheit(double celius){
		
		//double fahrenheit=0;
		//fahrenheit = (9.0/5) *celius +32;
		return (9.0/5) *celius +32;
	}
	
// Berechnung Fahrenheit --> Celsius	
public static double fahrenheit2celsius(double fahrenheit){
		
		double celsius = 0;
		celsius = (5/9.0) * (fahrenheit -32);
		return celsius;
	}
}
