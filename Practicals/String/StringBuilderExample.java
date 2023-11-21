package string;
//StringBuilder example
public class StringBuilderExample 
{
	public static void main(String[] args) 
	{
		StringBuilder s = new StringBuilder();
		
		//Appending a string
		s.append("Hello");
		
		//Appending another string
		s.append("World");
		
		//Converting to a string and printing
		System.out.println(s.toString());
		
		//Inserting a string at a specific index
		s.insert(7, "beautiful");
		System.out.println(s.toString());
		
		// Replacing a substring
		s.replace(0, 7, "Greetings");
		System.out.println(s.toString());
		
		// Deleting a substring
		s.delete(11, 19);
		System.out.println(s.toString());
		
		// Reversing the string
		s.reverse();
		System.out.println(s.toString());
		
		
	}

}
