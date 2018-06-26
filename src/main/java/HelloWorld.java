/**
 * Class HelloWorld
 * This class print the name passed (as string) into the command line argument.
 * Version: 1.0
 */
public class HelloWorld {
    /**
     * main() method. This is the entry point to the program.
     * @param args Command line argument(s)
     */
    public static void main(String[] args) {
        try{
            System.out.printf("Hello, %s!%n", args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing argument! Please, supply your name!");
        }
    }
}
