import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Trying to read a file....");
			FileInputStream fin = new FileInputStream("oops.txt"); //u may specify absolute path of the file d:\\tejas\\folder\\jack.txt 
			System.out.println("File is open..");
			
			byte theByte = (byte) fin.read(); //read the first byte
			
			while(theByte != -1 ) //check for End of the File ... EOF
			{
				System.out.print((char)theByte); //read consucutive bytes, from 2nd byte onwards
				theByte = (byte) fin.read();
				Thread.sleep(10);
			}
			
			System.out.println("Trying to close the file...");
			fin.close();
			System.out.println("File is closed...");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

}
