package Arrays_LinkedLists.Arrays;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] candidates = {5, 5, 1, 5, 2, 5, 3, 5, 4, 5, 6, 5, 7};

        System.out.println(findMajorityElement(candidates));
    }

    public static int findMajorityElement(int[] arr ){
        int candidate = 0,vote=0;

        for(int j:arr){
            if (vote == 0) {
                candidate = j;
                vote=1;
            } else {
                if (j == candidate) vote++;
                else vote--;
            }
            
        }
        int count =0;
            for(int cand:arr){
                if(cand == candidate){
                    count++;
                }
            }
            if(count>(arr.length/3)){
                return candidate;
            }else{
                return -1;
            }
    }
}
