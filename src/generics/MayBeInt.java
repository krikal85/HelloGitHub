package generics;

public class MayBeInt {
	private int data;
	private int status;
	
	public MayBeInt(int data, int status) {
		this.data = data; 
		this.status = status;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void print(){
		switch(status){
		case 1: 
			System.out.println("Zugriff gestattet "+data);
			break;
		case 2: 
			System.out.println("Zugriff verweigert");
			break;
		case 3: 
			System.out.println("Nicht erfasst");
			break;
		default: 
			System.out.println("Ungültiger Status");
			break;
		}
	}
}
