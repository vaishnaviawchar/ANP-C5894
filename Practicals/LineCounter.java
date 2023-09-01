package string;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter 
{
	public static void main(String[] args) 
	{
		String fileName = "data.txt";
		
		int lineCount = countLines(fileName);
		
		System.out.println("Total number of lines in the file: "+lineCount);
		

	}

	private static int countLines(String fileName) 
	{
		int count = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
		{
			while(reader.readLine() != null)
			{
				count++;
			}
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}

	        return count;
		
		
	}

}
