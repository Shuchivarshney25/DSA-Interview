package Stack;

import java.util.Stack;

public class EvaluateRPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String str: tokens){
            if(str.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(str.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(str.equals("-")){
                stack.push(stack.pop() - stack.pop());
            }else if(str.equals("/")){
                stack.push(stack.pop() / stack.pop());
            }else{
                stack.push(Integer.parseInt(str));
            }

        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "3", "-"};
        System.out.println(evalRPN(tokens));
    }
}
