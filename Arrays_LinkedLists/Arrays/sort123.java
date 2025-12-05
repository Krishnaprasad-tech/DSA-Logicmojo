package Arrays_LinkedLists.Arrays;

public class sort123 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,2,1,0};
        System.out.println(sort0123(arr));

    }
    public static int sort0123(int[] arr) {
        int l = 0 ,r=arr.length-1;

        while(l<r){
            while(arr[l] < arr[r] && l<r) l++;
            while(arr[r] == 0 && r<l) r++;
        }
        return 1;
        
    }
}
