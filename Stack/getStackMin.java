package Stack;

public class getStackMin {
    public static int getMin(int[] arr) {
        arrayImplementation stack = new arrayImplementation();
        for(int c : arr){
            stack.push(c);
            if(stack.size() > 1){
                int top = (int) stack.pop();
                int next = (int) stack.pop();
                stack.push(Math.min(top, next));
            }
        }
        return (int) stack.pop();
    }
    public static void main(String[] args) {
        int arr []= {2,0,3,0,4,-1};
        System.out.println(getMin(arr)); // Output: true
    }
}
