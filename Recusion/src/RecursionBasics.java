public class RecursionBasics {

    public static  void printNumbersInReverse(int n){

        if(n<1){
            return;
        }
        System.out.println(n);
        printNumbersInReverse(n-1);
    }

    static int sum=0;
    public static void sumOfN_Numbers(int n){

        if(n<1){
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        sumOfN_Numbers(n-1);
    }
     static  int s=0;

    public static void fibannaci(int n){

        if(n==1 || n==0){

            s=s+n;
            System.out.print(s + " ");

            return ;
        }


        fibannaci(n-1);
        fibannaci(n-2);


    }

    static int fac=1;
    public static void factorial(int n){

        if(n<=1){
            System.out.println(fac);
            return ;

        }
        fac=fac*n;
        factorial(n-1);

    }

    public static void palindrome(char[] name){

        int n= name.length;
        char[] original= name;
        char[] duplicate =new char[n];

        int j=0;
        for(int i= n;i >=1;i++){
            duplicate[i]= name[j];
            j++;
        }

        if(original.equals(duplicate)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}
