public class Amstrong {

    public static void main(String[] args) {

        int x=123;
        int n=x;

        int rev=0;

        while(x!=0){

            int rem= x%10;
            rev = rev+ (rem*rem*rem);
            x=x/10;
        }

        if( n == rev){
            System.out.println("it si amstrong numebr" + rev);
        }
        else{
            System.out.println("it is not an amstrong number" + rev);
        }

    }
}
