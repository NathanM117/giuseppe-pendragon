
import java.io.File;
import java.io.FileNotFoundException;
/*
 * NOT TESTED
 * Author(s): NathanM117
 */

import java.util.Scanner;

public class LoadFile 
{
	// needs access to Person "class" fields
	// these are place-holders.
	String name; 
	int age;
	double weight, height;
	char sex;
	boolean yes = false;
	boolean vegan = false;
	
	// This method loads an existing user profile and extracts data
	// for diet recommendations.
	public void Loadfile(String profile) 
	{
		try 
		{
			File file = new File("profile/" + profile + ".txt");
			Scanner sc = new Scanner(file);
			
			// Scan parameters for later calculations
			name = sc.nextLine(); // Ex. person.name = sc.nextLine()
			weight = sc.nextDouble();
			height = sc.nextDouble();
			age = sc.nextInt();
			sex = sc.next().charAt(0);
			vegan = sc.nexInt();
			
			// I imagine there being some kind of loop in the main menu
			// that will keep bugging the user until a valid profile is provided
			// probably a while loop with a break condition for yes == true
			yes = true;
			
			sc.close();
			
		} //If your file isn't real...
		catch( FileNotFoundException e)
		{
			// ...print something and exit to main menu
			System.out.println("Please enter valid profile name.");
			return;
		}
		
	}

}
