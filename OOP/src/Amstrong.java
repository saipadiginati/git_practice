public class Amstrong {

    public static void main(String[] args) {

        int x = 123;
        int n = x;

        int rev = 0;

        int num = 12;
        int i = 1;
        while (i <= 12) {
            if (num% i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

//        while(x!=0){
//
//            int rem= x%10;
//            rev = rev+ (rem*rem*rem);
//            x=x/10;
//        }
//
//        if( n == rev){
//            System.out.println("it si amstrong numebr" + rev);
//        }
//        else{
//            System.out.println("it is not an amstrong number" + rev);
//        }
//
//    }
    }
}
