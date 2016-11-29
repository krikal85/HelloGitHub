package LiveCoding;

public class Bruch {
	private int zaehler;
	private int nenner;
	
	//Konstruktor
	public Bruch(int zaehler,int nenner){
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	//getter - setter
	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
	//Methoden
	public double toDecimal(){
		int result = zaehler/nenner;
		return result;
	}
	
	public void print(){
		System.out.println(zaehler+"/"+nenner);
	}
	
	public Bruch multiplicate(Bruch b2){
		
		//b2.zaehler = b2.zaehler*b2.zaehler;
		//b2.nenner=b2.nenner*b2.nenner;
		Bruch result = new Bruch(b2.zaehler*b2.zaehler,b2.nenner*b2.nenner);
		//result = result.multiplicate(result);
		return result;
	}
	
	public Bruch multiplicate(Bruch b2,Bruch b3){
		
		Bruch result = new Bruch(b2.zaehler*b3.zaehler,b2.nenner*b3.nenner);
		result = result.multiplicate(result);
		
		//.zaehler = b2.zaehler*b3.zaehler;
		//b2.nenner=b2.nenner*b3.nenner;
		//b2 = b2.multiplicate(b2);
		return result;
	}
}
