package collections;
/*Create a program that represents a basic playlist using a Vector to store song names. Implement methods to:
a. Add songs to the playlist.
b. Display the current playlist.
c. Remove a song from the playlist.*/
import java.util.Vector;
public class Vector1 
{
	public static void main(String[] args) 
	{
		// Create a Vector to store songs
		Vector<String> song = new Vector<>();
		
		//Adding the songs to the playlist
		song.add("Tu hi re");
		song.add(" Beliver ");
		song.add("Ye Dosti");
		song.add("Phir or kya chahiye");
		
		//Displaying the current playlist
		System.out.println("The Current playlist of songs is: "+song);
		
		//Removing a song from playlist
		song.remove(2);
		System.out.println("After removing the Song at postion 2:"+song);
		
	}

}
