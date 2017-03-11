package Programmieren2;

public class Transporter {
	
	
	public void beam(String person, String from,
			String to, boolean urgent)
			throws TransporterMalfunctionException {
		double ausfall;
		ausfall = Math.random();
		if(urgent && ausfall < 0.5){
			throw new TransporterMalfunctionException("upps somebody just died");
			
		}
		else{
			System.out.println("Person:"+person+" from "+from);
		}
	}
	
	public void shutdown(){
		System.out.println("shutting down transporter after beaming ");
	}
	
}
