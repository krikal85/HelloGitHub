package generics;

import java.util.GregorianCalendar;

public class FacebookDemo {

	public static void main(String[] args) {
	//	MayBeInt age = new MayBeInt(32, 2);
	//	MayBeInt gehalt = new MayBeInt(3200, 2);
		
		Profil firstProfile = new Profil("Viktoria","Schlaipfer","viktoria.schlaipfer@edu.campus02.at",new MayBeInt(32, 2),new MayBeInt(3000, 2),new MayBe<String>("complicated",2),new MayBe<GregorianCalendar> (new GregorianCalendar(1984,12,1),1));
		firstProfile.print();
	}

}
