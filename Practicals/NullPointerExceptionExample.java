package exceptionhandling;
public class NullPointerExceptionExample 
{
	public static void main(String[] args)
    {
		// Initializing a reference variable with null
        String a = null; 
        
        try 
        {
        	// This line will throw a NullPointerExceptiony
        	
            int length = a.length(); 
            System.out.println("Length of the text: " + length);
        } 
        catch (NullPointerException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        System.out.println("Program continues...");
    }
}