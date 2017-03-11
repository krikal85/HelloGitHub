package Programmieren2;

public class Starship {
	private String	name;
	private Transporter	transporter = new Transporter();
	
	
	
	public Starship(String name) {
		super();
		this.name = name;
		
	}



	public void beamUp(String person, String from){
		try{
			transporter.beam(person, from, name, true);
		} catch(TransporterMalfunctionException e){
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}finally{
			System.out.println();
			transporter.shutdown();
		}
		
		
	}

}
