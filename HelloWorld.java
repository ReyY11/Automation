//Package is a storage place to organize and store your classes
//Package is a folder to store your classes
package level1;

//Import statement helps in getting the access to the methods and functions defined under that class into the current class
import java.lang.*;

//Class is a blueprint of the methods to run the code
//Always your class name and program name are same
public class HelloWorld {

	/*JVM always looks for the main method which guides the JVM "what is to be executed"
	 * Public - Access Modifier - similarly you have private, default, protected but mostly we use public
	 * static - static is used for a constant variable or a method that is same for every instance of a class
	 * void - the method returns no value
	 * Main - the flow of the program starts from here
	 * String[]args - not always required as its a parameter setup
	 */
	public static void main(String[]args) {
		
		//print statement to print something in the output
		System.out.println("Hello World");
		
	}	
}
