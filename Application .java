import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Application {

	public static void main(String[] args) throws IOException {
		FileWriter filewriter= new FileWriter("C:\\Chaya\\A\\File.txt");
		BufferedWriter bufferedwriter= new BufferedWriter(filewriter);

		for(int x=0;x<15;x++){
			
			bufferedwriter.write("I am writing a number : "+ x);
			bufferedwriter.newLine();
			
			
		}
		
		bufferedwriter.close();
	}

}