import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class fileChanges extends main {

    //Method to load the file into an Integer ArrayList
    public static void loadfile(ArrayList<Integer> numbers){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file without the extension .txt");
        String name = input.nextLine();
        //Try to open the scanner with the file name, if it fails, catch the error.
        try {
            Scanner filescan = new Scanner(new File(name+".txt"));
            //While the scanner has more data, add the data to the next item in the arraylist.
            while (filescan.hasNext()) {
                numbers.add(filescan.nextInt());
            }
            //close filescan
            filescan.close();
        }
        //Catch the exception if it occurs to keep program from crashing.
        catch (Exception e) {
            System.out.println("File not found, try again.");
        }

    }
    //Method to save the list to a file, used for the random integer methods and manually save it
    public static void saveFile(ArrayList<Integer> numbers){
        Scanner input = new Scanner(System.in);
        //Asks for the name of the file to save.
        System.out.println("What do you want to name the file?");
        String name = input.next();
        try {
            //Try to make a new file, if it fails then catch it.
            PrintWriter writer = new PrintWriter(name +".txt");
            //While there's data left, keep writing.
            for (int i = 0; i < numbers.size(); i++) {
                writer.println(numbers.get(i));
            }
            writer.close();
            input.close();
        }
        //Catch the exception if it occurs.
        catch (Exception e) {
            System.out.println("File not found");
        }
    }
}


