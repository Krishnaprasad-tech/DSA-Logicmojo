package Arrays_LinkedLists.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class zeroSumPairs {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,1,2,0,-2};
        System.out.println("pairs are"+ pairsSum(arr));
    }
    public static ArrayList<ArrayList<Integer>> pairsSum(int[] arr) {
        // code here
        Arrays.sort(arr);

        // Initialize pointers and result list
        int l = 0, r = arr.length - 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<String> seenPairs = new HashSet<>(); // To avoid duplicate pairs
        //2 pointer approach
        while(l<r){
            int sum = arr[l]+arr[r];
            ArrayList<Integer> pair = new ArrayList<>();
            if(sum==0){
                pair.add(arr[l]);
                pair.add(arr[r]);

                String pairs = arr[l]+","+arr[r];
                if(!seenPairs.contains(pairs)){
                    seenPairs.add(pairs);
                    result.add(pair);
                }
                l++;//hinde ond jyasti 
                r--;//munde ond kammi
            }else if(sum<0){
                l++;//hinde ond jyasti
            }else{
                r--;//munde ond kammi arta agilla andre bard nodu ond sati
            }
            
        }

        return result; 
        
    }
}
