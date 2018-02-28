import java.util.ArrayList;

public class InsertionSort extends main {
    public static ArrayList<Integer> ISort(ArrayList<Integer> numbers) {
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            int key = numbers.get(i);
            int j = i - 1;

            while (j >= 0 && numbers.get(j) > key) {
                numbers.set(j + 1, numbers.get(j));
                j--;
            }
            numbers.set(j + 1, key);
        }
        return numbers;

    }
}