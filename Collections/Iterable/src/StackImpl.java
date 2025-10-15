import java.util.ArrayList;
import java.util.List;

public class StackImpl {

    public static void pop(ArrayList<Integer> arr){
        int n= arr.size();
        int i=0;
        while(i!= n-1){
            i++;
        }
        arr.remove(i);
    }

    public static  void push(ArrayList<Integer> arr,int value){

        int n=arr.size();
        arr.add(n,value);
    }

    public static void peek(ArrayList<Integer> arr){
        int n=arr.size();
        System.out.println(arr.get(n-1));
    }


    public static void main(String[] args) {

        ArrayList<Integer> stack= new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(stack);
        StackImpl.pop(stack);
        System.out.println(stack);
        StackImpl.push(stack,6);
        System.out.println(stack);
        StackImpl.peek(stack);


    }
}


