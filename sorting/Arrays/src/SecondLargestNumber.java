public class SecondLargestNumber {
    public static void main(String[] args) {


        int[] arr = {1, 2, 9, 2, 4, 5,6,4,2};

        int i = 0;
        int high = arr.length;
        int highest=0;
        int secondHightest =1;


         int j=i+1;
        while (i < high & j < high) {

            if (arr[i] < arr[j]) {
                highest = j;
                secondHightest = i;
                i++;
                j++;
            } else {
                    highest=i;
                    if(arr[j]>arr[secondHightest]) {
                        secondHightest = j;
                    }
                            j++;

            }

        }
        System.out.println(arr[secondHightest]);


    }
}

