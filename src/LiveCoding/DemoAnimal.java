package LiveCoding;

public class DemoAnimal {

	public static void main(String[] args) {
		Frog quaxi = new Frog("green",2);
		Frog quaxi2 = new Frog("red",2);
		Frog quaxi3 = new Frog("red",2);
		
		animal leo = new Lion("lion",2);
		leo.walk();
		leo.makeNoise();
		
	// geht nicht	animal leo2 = new animal("test",2);
		
		animal quaxiAsAnimal = quaxi;
		quaxiAsAnimal.makeNoise();
		Frog quaxiasfrog = (Frog) quaxiAsAnimal;
		quaxiasfrog.makeNoise();
		Nature n = new Nature();
		n.addAnimal(quaxi);
		n.addAnimal(quaxi2);
		n.addAnimal(quaxi3);
		n.addAnimal(leo);
		
		System.out.println(n.countColour("red"));
		System.out.println(n.getCountByColor());
	}

}
