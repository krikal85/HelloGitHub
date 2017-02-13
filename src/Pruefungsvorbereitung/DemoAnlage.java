package Pruefungsvorbereitung;

public class DemoAnlage {

	public static void main(String[] args) {
		Anlage myNotebook = new Anlage("NotebookVSC",1200,5);
		myNotebook.simulate(3, 400);
		myNotebook.renew(500, 2);
		System.out.println(myNotebook.getBezeichnung()+"----"+myNotebook.getNutzungsdauer()+"------"+myNotebook.getInitialWert());
		

	}

}
