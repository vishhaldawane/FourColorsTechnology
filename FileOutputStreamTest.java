import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fout = new FileOutputStream("newfile.txt");
			
			System.out.println("File is ready for writing....");
			
			String strData = "I. by extending Thread class\r\n"
					+ "    \r\n"
					+ "	    a. WAC to extend from java.lang.Thread class\r\n"
					+ "	    b. override the run() method to put your code which\r\n"
					+ "	    	participates in threading\r\n"
					+ "	    c. instantiate your class of step a\r\n"
					+ "	    d. invoke its start() method -> which invokes its run() method";
			
			byte byteArray[] = strData.getBytes();
			System.out.println("Converted the string to byte array...");
			
			
			fout.write(byteArray);
			System.out.println("Byte array is written to the file....");
			
			fout.close();
			System.out.println("File is closed....");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
