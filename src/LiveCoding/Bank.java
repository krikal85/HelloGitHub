package LiveCoding;

public class Bank {

	public static void main(String[] args) {
		
		//Array erzeugen zum Abspeichern von 3 Konten
		Gehaltskonto [] gehaltskonten = new Gehaltskonto[3];
		
		//Neue Konten anlegen
		Gehaltskonto konto1 = new Gehaltskonto("Max Mustermann","At3478589452346326","TAKRNDLR");
		Gehaltskonto konto2 = new Gehaltskonto("Susi Sorglos","At347858923423466","TAKRNDLR");
		Gehaltskonto konto3 = new Gehaltskonto("John Smith","At34785892346236","TAKRNDLR");
		
		
		//Konto aufbuchen
		konto1.aufbuchen(2000);
		konto2.aufbuchen(1000);
		konto3.aufbuchen(3000);
		
		//konto abbuchen
		konto1.abbuchen(300);
		konto2.abbuchen(2200);
		konto3.abbuchen(30000);
		
		konto2.setKontoinhaber("Susis Tochter");
		konto2.setIban("sdfrtgsddfertewrtwz");
		//zuweisung der Konten an array
		gehaltskonten[0]=konto1;
		gehaltskonten[1]=konto2;
		gehaltskonten[2]=konto3;
		
		//Ausgabe der Konten
		printKonto(konto1);
		printKonto(konto2);
		printKonto(konto3);
		
		//konto abbuchen & ausgeben
		
		konto1.abbuchen(300);
		printKonto(konto1);
		konto2.abbuchen(2200);
		printKonto(konto2);
		konto3.abbuchen(30000);
		printKonto(konto3);
		
		
		
	}
	
	public static void printKonto(Gehaltskonto konto){
		if (konto.getKontoinhaber()== "Kein Inhaber"){
			return;
		}
		else{
		System.out.println(konto.getKontoinhaber()+": "+konto.getKontostand()+" Euro");
		}
	}

}
