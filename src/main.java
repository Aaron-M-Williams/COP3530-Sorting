import java.util.Scanner;
import java.util.*;


public class main{

    public static void main(String[] args) {
        //Declares scanner for text input from console
        Scanner input = new Scanner(System.in);
        //ArrayList of integers to use for storing all values.
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Start and end time variables to use for system times.
        long startTime;
        long endTime;
        boolean exit = false;
        //Main body of program.
        while (exit == false) {
            System.out.println("\nPlease Choose An Option:");
            System.out.println("1 - Load File");
            System.out.println("2 - Insertion Sort");
            System.out.println("3 - Merge Sort");
            System.out.println("4 - Print File");
            System.out.println("5 - Clear File");
            System.out.println("6 - Save to File");
            System.out.println("7 - Reverse List");
            System.out.println("9 - Create a .TXT file of random ints");
            System.out.println("10 - Exit without saving");
            int choice = input.nextInt();
            switch (choice) {

                case 1:
                    //Load Files using fileChanges Class
                    fileChanges.loadfile(numbers);
                    break;

                case 2:
                    //Insertion Sort using InsertionSort Class
                    //Gets start time from system
                    startTime = System.nanoTime();
                    //Calls on InsertionSort to do the sorting
                    InsertionSort.ISort(numbers);
                    //Gets the end time from system
                    endTime = System.nanoTime();
                    //Returns the end time minus start time divided by 1 million to get milli-seconds
                    System.out.println("The total time for Insertion Sort was " + (endTime - startTime) / 1000000 + " milliseconds (ms)");
                    break;
                case 3:
                    //Merge Sort using mergeSort Class
                    //Gets start time from system
                    startTime = System.nanoTime();
                    //Calls upon merge sort to do the sorting and stores the values back to numbers.
                    numbers = mergeSort.mSort(numbers);
                    //Gets end time from system
                    endTime = System.nanoTime();
                    //Returns the end time minus start time divided by 1 million to get milli-seconds
                    System.out.println("The Total time for Merge Sort was " + (endTime - startTime) / 1000000 + "milliseconds (ms)");
                    break;

                case 4:
                    //Print out current number list
                    //If the size is zero then the list is empty
                    if(numbers.size()==0){
                        System.out.println("\nList is empty\n");
                        break;
                    }
                    //For all elements in the list, print out the value on a new line.
                    for (int i = 0; i < numbers.size(); i++) {
                        System.out.println(numbers.get(i));
                    }
                    break;

                case 5:
                    //Clears the list of values
                    numbers.clear();
                    break;
                case 6:
                    //Save the current list of values to a text file using fileChanges class.
                    fileChanges.saveFile(numbers);
                    break;
                case 7:
                    //Reverses the list. Used to get descending order.
                    Collections.reverse(numbers);
                    break;
                case 8:
                    //Creates a text file with random integers to use for sorting
                    System.out.println("How many integers?");
                    int size = input.nextInt();
                    createRandomInts.createRandomInt(size);
                    break;

                case 10:
                    //Exits program
                    exit = true;
                    break;
            }
        }
    }
}