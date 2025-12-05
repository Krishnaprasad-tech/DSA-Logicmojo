package Arrays_LinkedLists.Arrays;
import java.util.*;
public class duplicateNumbers {
    public static int findDuplicate(int[] arr){
        HashMap<Integer,Integer> freq  = new HashMap<>();
        for(int num:arr){
            if(freq.containsKey(num)){
                return num;
            }
            freq.put(num,1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,3,4,5};
        System.out.println(findDuplicate(arr));
    }
    
}
