import java.util.ArrayList;
public class mergeSort extends main {

    public static ArrayList<Integer> mSort(ArrayList<Integer> numbers){
        int size = numbers.size();
        if (size <= 1){
            return numbers;
        }
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i<size /2; i++){
            A.add(i, numbers.get(i));
        }
        for (int i =0; i< (size-size/2); i++)
            B.add(i, numbers.get(i+(size/2)));
        return merge(mSort(A), mSort(B));
     }
     public static ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> merged = new ArrayList<>();
        int size = (A.size()+B.size());
        int i=0;
        int j =0;
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
