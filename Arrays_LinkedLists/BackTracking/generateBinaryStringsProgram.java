package Arrays_LinkedLists.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class generateBinaryStringsProgram {
    public static List<String> generateBinaryStrings(int n){
        List<String> result = new ArrayList<>();
        backTrack(result,"",n);
        return result;
    }
    public static void backTrack(List<String> result,String current,int n){
        if(current.length()==n){
            result.add(current);
            return;
        }

        backTrack(result,current + "0",n);
        backTrack(result, current + "1", n);
    }
    public static void main(String[] args) {
        int n =2;
        List<String> ans = generateBinaryStrings(n);
        for(String binary: ans){
            System.out.println(binary);
        }
    }
}
