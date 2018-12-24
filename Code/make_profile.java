/*
 * Author(s): pianelson
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

 public class Profile
{
    static String firstName;
    /*  idk if you want to specify this stuff too but I put them here just as an option
    static String lastName;
    static String username;
    static String password;
    */
    static int age;
    static double weight, height;
    static char sex, vegan;
    static boolean yes; //=false;

    private static int count = 0; // number of objects in memory

    // initialize user, count +1 every time a new profile is created
     public Profile ( String first, String last )
     {
        firstName = first;
        lastName = last;

        count++; // increment static count of Users
        System.out.printf( "Hello New User. Please enter your name: %s %s",firstName, lastName);
        System.out.printf( "Please enter your age: %d",age);
        System.out.printf( "Please enter your weight in pounds: %d",weight);
        System.out.printf( "Please enter your height in inches: %d",height);
        System.out.printf( "Please enter your sex: %s",sex);
        System.out.printf( "Are you vegan?: %s", yes);
        /*System.out.printf( "Please enter your username: %s",username);
        System.out.printf( "Please enter your password: %s",password);
        */
     } // end Profile constructor

   // set first name
     public String setFirstName(String firstName)
     {
        this.firstName = firstName;
     } // end method setFirstName
/*
     // set last name
     public String setLastName(String lastName)
     {
        this.lastName = lastName;
     } // end method setLastName

    // set user name
     public String setUserName(String name)
     {
        this.username = name;
     } // end method setUserName

     // set password
     public String setPassword(String password)
     {
        this.password = password;
     } // end method setPassword

    // get username
     public String getUserName()
     {
        return username;
     } // end method getUserName

     // get password
     public String getPassword()
     {
        return password;
     } // end method getPassword
*/
    // get first name
     public String getFirstName()
     {
        return firstName;
     } // end method getFirstName
/*
     // get last name
     public String getLastName()
     {
        return lastName;
     } // end method getLastName

     // static method to get static count value
     public static int getProfileNumber()              
     {                                         
        return count;                          
     } // end method getProfileNumber
*/
public static void writeFile()
{
    //set up for the user input
    Reader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);
    String str = null;

    try {
            //prompt the user to input data
        /*System.out.printf( "Hello New User. Please enter your name: %s %s",firstName, lastName);
        System.out.printf( "Please enter your age: %d",age);
        System.out.printf( "Please enter your weight in pounds: %d",weight);
        System.out.printf( "Please enter your height in inches: %d",height);
        System.out.printf( "Please enter your sex: %s",sex);
        System.out.printf( "Are you vegan?: %s", yes);
        */
            PrintWriter writer = new PrintWriter("%s.txt", "UTF-8",firstName);
            while((str = br.readLine())!=null)
            {
            //save the line

            writer.println(str);
            }
            writer.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}