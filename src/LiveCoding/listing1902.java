package LiveCoding;
import java.io.*;

public class listing1902 {
	
	public static void main(String[] args)
		{
		try {
		DataOutputStream out = new DataOutputStream(
								new BufferedOutputStream(
								new FileOutputStream("test.txt")));
		out.writeInt(1);
		out.writeInt(-1);
		out.writeDouble(Math.PI);
		out.writeUTF("h��liches");
		out.writeUTF("Entlein");
		out.close();
		} catch (IOException e) {
		System.err.println(e.toString());
		}
	}
}
