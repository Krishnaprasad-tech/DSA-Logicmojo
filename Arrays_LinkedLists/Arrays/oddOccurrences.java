package Arrays_LinkedLists.Arrays;

public class oddOccurrences {
    public static int findOddOccurrence(int[] arr, int n){
        int oddNumber=0;
        for(int num:arr){
            oddNumber ^= num;
        }
        return oddNumber;
        
    }
    public static void main(String[] args) {
        int[] arr = {2 ,7, 7 ,2,3,4,3,4,4};
        System.out.println(findOddOccurrence(arr, arr.length));
    }
}
