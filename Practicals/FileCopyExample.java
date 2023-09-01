package string;
//file io example
import java.io.*;
public class FileCopyExample 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream inputFile = new FileInputStream("input.txt");
			FileOutputStream outputFile = new FileOutputStream("output.txt");
			
			//Create buffers for reading and writing
			byte[] buffer = new byte[1024];
			int bytesRead;
			
			//Read from the input stream and write to the output stream
		
			 while ((bytesRead = inputFile.read(buffer)) != -1)
			 {
				 outputFile.write(buffer, 0, bytesRead);
			 }
			 // Close the streams
	            inputFile.close();
	            outputFile.close();

	            System.out.println("File copied successfully.");

	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
			}
	}
}
