import java.util.Stack;

public class Reverse {

    public static Stack<Integer> reverse(Stack<Integer> stack){

        Stack<Integer> revStack= new Stack<>();
        while(!stack.empty()) {
            Integer value = stack.pop();
            revStack.push(value);
        }
        return revStack;
    }

    public static void reverseElementByRecursion(Integer data, Stack<Integer> s){

        if(s.empty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        reverseElementByRecursion(data,s);
        s.push(top);
    }

    public static void reverseTheStack( Stack<Integer> s){

        if(s.empty()){
            return;
        }

        Integer top= s.pop();
        reverseTheStack(s);
        elementSwaping(top,s);

    }
    public static void elementSwaping(Integer top, Stack<Integer> s){
        if(s.empty()){
            s.push(top);
            return;
        }
        Integer t= s.pop();
        elementSwaping(top,s);
        s.push(t);


    }


    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);

       // reverseElementByRecursion(19,stack);
        reverseTheStack(stack);
        System.out.println(stack);
        //System.out.println(Reverse.reverse(stack));



    }
}
