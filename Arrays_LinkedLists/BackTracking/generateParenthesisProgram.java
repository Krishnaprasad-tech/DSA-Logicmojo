package Arrays_LinkedLists.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesisProgram {
    public static List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        backTrack(result, "", 0, 0, n);
        return result;
    }
    private static void backTrack(List<String> result,String current ,int open,int close,int n){
        if(current.length() == 2*n){
            result.add(current);
            return;
        }
        if(open<n){
            backTrack(result,current+"(" , open+1,close,n);
        }

        if(close<open){
            backTrack(result,current+")",open,close+1,n);
        }
    }
    public static void main(String[] args) {
        int n =3;
        List<String> ans = generateParenthesis(n);
        for(String s:ans){
            System.out.println(s);
        }
    }
}
