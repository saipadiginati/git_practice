import java.util.Arrays;

public class SelectionSortRevision {

    public void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }

        public void swap ( int[] arr, int pointer, int i){

            int temp = arr[pointer];
            arr[pointer] = arr[i];
            arr[i] = temp;
        }

    public static void main(String[] args) {

        SelectionSortRevision s=new SelectionSortRevision();
      int[] arr={ 13,46,24,52,1,20,9};
        s.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    }

