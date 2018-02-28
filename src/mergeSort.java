import java.util.ArrayList;
public class mergeSort extends main {

    //merge sort algorithm, breaks down the ArrayList to smaller array lists to be sorted recursively.
    public static ArrayList<Integer> mSort(ArrayList<Integer> numbers){
        int size = numbers.size();
        //Base Case
        if (size <= 1){
            return numbers;
        }
        //Recursive Step
        //Initializes two ArrayLists to use for A and B.
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        //For the first half of the array, copy to A.
        for (int i = 0; i<size /2; i++){
            A.add(i, numbers.get(i));
        }
        //For the second half, copy to B.
        for (int i =0; i< (size-size/2); i++)
            B.add(i, numbers.get(i+(size/2)));
        //Recursively calls mSort.
        return merge(mSort(A), mSort(B));
     }
     //Merges the resulting arrays into one final sorted array.
     public static ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> merged = new ArrayList<>();
        int size = (A.size()+B.size());
        int i=0;
        int j =0;
        //While there's still elements, merge.
        for (int p=0; p<size; p++){
            if (i>=A.size()){
                merged.add(p, B.get(j++));
            }
            else if (j>= B.size()){
                merged.add(p, A.get(i++));
            }
            else if (A.get(i)<=B.get(j)){
                merged.add(p, A.get(i++));
            }
            else{
                merged.add(p, B.get(j++));
            }
        }
        return merged;
     }
}
