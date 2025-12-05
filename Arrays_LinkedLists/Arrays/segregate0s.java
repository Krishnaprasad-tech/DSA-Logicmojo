package Arrays_LinkedLists.Arrays;
public class segregate0s {
    public static void main(String args[]){
        int[] arr = {0,1,0,1,1,0,0,1};
        segregate(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    //two pointer approach
    public static void segregate(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            while(arr[left] == 0 && left < right){
                left++;
            }
            while(arr[right] == 1 && left < right){
                right--;
            }
            if(left < right){
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}
