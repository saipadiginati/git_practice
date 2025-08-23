import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={5,6,2,1,3,2,1,7};
//        BubbleSort b1=new BubbleSort();
//        b1.bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        InsertionSort i1=new InsertionSort();
//        i1.insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
        RecursiveBubbleSort r=new RecursiveBubbleSort();
        r.recursiveBubbleSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));



    }
}
