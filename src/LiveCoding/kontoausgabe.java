package LiveCoding;

public class kontoausgabe {

	public static void main(String[] args) {
		
		String [] Kontoinhaber = {"Max Mustermann","Susi Sorglos"};
		Konto[] konten = new Konto [1000];
	
		
		Konto max = new Konto ("Max Mustermann");
	//	max.setInhaber("Max Mustermann");
		konten[0]= max;
		
		Konto susi = new Konto("Susi Sorglos");
	//	susi.setInhaber("Susi Sorglos");
		konten[1]= susi;
		
		max.aufbuchen(2000);
		susi.aufbuchen(10);
		
		if (max.abbuchen(100))
		{
			System.out.println("Abbuchen erfolgreich");
		}
		
		if (susi.abbuchen(100))
		{
			System.out.println("erfolgreich");
		}
		
		for(int s = 0; s<konten.length;s++){
			if(konten[s] != null){
				konten[s].abbuchen(20);
			}
		}

	}

}
