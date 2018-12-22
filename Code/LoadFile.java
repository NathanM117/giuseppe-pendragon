/*
 * NOT TESTED
 * Author(s): NathanM117
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadFile 
{
	// needs access to Person "class" fields
	// these are place-holders.
	String name; 
	int age;
	double weight, height;
	char sex, vegan;
	boolean yes = false;
	
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
			vegan = sc.next().charAt(0);
			
			// I imagine there being some kind of loop in the main menu
			// that will keep bugging the user until a valid profile is provided
			// probably a while loop with a break condition for yes == true
			yes = true;
			
			sc.close();
			
		}
		catch( FileNotFoundException e)
		{
			// print something and exit to main menu
			System.out.println("Please enter valid profile name.");
			return;
		}
		
	}

}
