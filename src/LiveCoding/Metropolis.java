package LiveCoding;

public class Metropolis {

	public static void main(String[] args) {
		boolean metropole= isMetropolis(false, 200_100, 1);
		if (metropole){
			System.out.println("coole Metropole");
		}
		else{
			System.out.println("kleine Vorstadtprovinz");
		}
	}
	
	public static boolean isMetropolis(boolean isCapital,int inhabitants, double taxPerPersonAndMonth){
	 
		boolean isMetropolis= false;
		double taxes = inhabitants * taxPerPersonAndMonth *12;
		
		/*if ((isCapital && inhabitants > 100000)
				|| (inhabitants > 200000 && taxes >= 720_000_000)){
			isMetropolis = true;
			return isMetropolis;
		}
		else {
			isMetropolis = false;
			return isMetropolis;
		}*/
		
		boolean resultA = isCapital && inhabitants > 100_000;
		boolean resultB = taxes > 720_000_000 && inhabitants > 200_000;
		return resultA||resultB;	
	}

}
