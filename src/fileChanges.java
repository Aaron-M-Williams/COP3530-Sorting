import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class fileChanges extends main {

    public static void loadfile(ArrayList<Integer> numbers){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file without the extension .txt");
        String name = input.nextLine();
        try {
            Scanner filescan = new Scanner(new File(name+".txt"));
            while (filescan.hasNext()) {
                numbers.add(filescan.nextInt());
            }
            filescan.close();
        }
        catch (Exception e) {
            System.out.println("File not found, try again.");
        }

    }

    public static void saveFile(ArrayList<Integer> numbers){
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to name the file?");
        String name = input.next();
        try {
            PrintWriter writer = new PrintWriter(name +".txt");
            for (int i = 0; i < numbers.size(); i++) {
                writer.println(numbers.get(i));


            }
            writer.close();
            input.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}


