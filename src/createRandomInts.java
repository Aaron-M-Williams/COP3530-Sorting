import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class createRandomInts {

    public static void createRandomInt(int size) {
        try {
            //Try creating a new print writer in current folder with the name size + random.txt
            PrintWriter writer = new PrintWriter(size + "random.txt");
            //Instantiates a new random number generator, rand
            Random rand = new Random();
            //For the given size, create random integers on new lines. Numbers are within 1 and 100,001 inclusive
            for (int i = 0; i < size; i++) {
                int n = rand.nextInt(100000) + 1;
                //Saves to new line of file
                writer.println(n);


            }
            writer.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }


    }
}
