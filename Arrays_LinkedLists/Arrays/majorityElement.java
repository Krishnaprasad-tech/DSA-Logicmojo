package Arrays_LinkedLists.Arrays;
public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityEle(arr));
    }

    public static int majorityEle(int arr[]){
        int votes = 0;
        int candidate =0;

        for(int num:arr){
            if(votes==0){
                candidate = num;
            }else{
                if(num==candidate) votes++;
                else votes--;
            }
        }

        int count = 0;
        for(int cand : arr){
            if(cand==candidate) count++;
        }

        if (count>arr.length/2) return candidate;
            else return -1;
    }
}