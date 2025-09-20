public class LastOccuranceInSortedArray {

    public void lastOccurance(int[] arr, int target){

        int n= arr.length;
        int highindex=-1;
        int low=0;
        int high= n-1;
        int count=0;

        while(low <=high){

            int mid=(low+high)/2;

            if(arr[mid] == target){
            highindex=mid;
            low=mid+1;
            count++;

        }
        else if(arr[mid] > target){
            high=mid-1;
            }

        else {
            low=mid+1;
            }

        }


        int i=0;
        int j=highindex;
        int lowIndex =-1;
        while( i<=j & highindex != -1){

            int m= (i+j)/2;

            if(arr[m] == target){
                lowIndex = m;
                j=m-1;
            }
            else if( arr[m] < target){
                i=m+1;

            }
            else {
                break;
            }

        }

        System.out.println("[" + lowIndex +"," + highindex + "]");
    }
}
