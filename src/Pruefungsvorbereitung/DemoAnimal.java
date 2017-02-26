package Pruefungsvorbereitung;

public class DemoAnimal {

	public static void main(String[] args) {
		Frog quaxi = new Frog("green", 2);
		Frog quaxi2 = new Frog("gren", 2);
		quaxi.walk();
		Animal quaxiAsAnimal = (Frog)quaxi;
		quaxiAsAnimal.walk();
		quaxi = (Frog)quaxiAsAnimal;
		quaxiAsAnimal.walk();
		Nature nature = new Nature();
		nature.addAnimal(quaxi);
		nature.addAnimal(quaxi2);
		System.out.println(nature.countColor("green"));
		System.out.println(nature.getCountByColor());
		System.out.println("Hallo");
	}

}
