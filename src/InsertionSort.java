import java.util.ArrayList;

public class InsertionSort extends main {
    //Insertion sort class.
    public static ArrayList<Integer> ISort(ArrayList<Integer> numbers) {
        //Gets the size to use for the for loop.
        int size = numbers.size();
        //Iterates through data to get the sorted set.
        for (int i = 0; i < size; i++) {
            int key = numbers.get(i);
            int j = i - 1;
            //Swaps values if needed
            while (j >= 0 && numbers.get(j) > key) {
                numbers.set(j + 1, numbers.get(j));
                j--;
            }

            numbers.set(j + 1, key);
        }
        //returns the final sorted lsit.
        return numbers;

    }
}