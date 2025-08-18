import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,3,5};
        //BubbleSort b1=new BubbleSort();
        //b1.bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
        InsertionSort i1=new InsertionSort();
        i1.insertionSort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
