package generics;

public class MayBe<T> {
	
	private T data;
	private int status;
	
	public MayBe(T data, int status){
		this.data = data; 
		this.status = status;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
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
