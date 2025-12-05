package Stack;


public class validParenthesis {
    public boolean isValid(String s) {
        arrayImplementation stack = new arrayImplementation();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = (char) stack.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        validParenthesis vp = new validParenthesis();
        String s = "{{()}}";
        System.out.println(vp.isValid(s)); // Output: true
    }
}
