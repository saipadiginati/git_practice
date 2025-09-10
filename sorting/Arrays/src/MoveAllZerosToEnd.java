import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 4};
        int n = arr.length;
        int i = 0;
        int j = 0;

        if (arr[0] == 0) {
            i = 0;
            j = 1;
        } else {
            i = 1;
            j = 1;
        }
        for (int k = 1; k < n; k++) {

            if (arr[k] == 0) {
                j++;
            } else {
                swap(i, j, arr);
                j++;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));;
    }


        public static void swap ( int i, int j, int[] arr){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;



    }
}
