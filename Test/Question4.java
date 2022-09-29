import java.util.Stack;

import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        char[]arr = {'(','2','+','[','(','{','*','4','{','}','3','}','/',')',']',')'};
        System.out.println(isBalancedParenthesis(arr));
    }
    public static boolean isBalancedParenthesis(char[]charArr){
        Stack<Character>stack = new Stack<>();
        for(int i=0; i<charArr.length; i++){
            char ch = charArr[i];
            //putting only brackets into the stack
            if(ch!='('|| ch!='{' || ch!='[' ||ch!=')' || ch!='}' || ch!='}'){
                continue;
            }
            if(ch=='(' ||ch=='{' || ch=='['){
                stack.push(ch);

            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()=='(' && ch==')' || stack.peek()=='{' && ch=='}' ||stack.peek()=='[' && ch==']') {
                    stack.pop();
                }else{
                    return false;

                }
            }
        }
        // if stack is empty means all brackets are balanced
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}
