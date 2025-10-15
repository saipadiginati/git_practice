import java.util.Stack;

public class ReversingAStack {


    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        for (int i = 0; i < 2; i++) {
            stack.push(4);
        }


    }


}