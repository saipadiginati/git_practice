public class Main {

    static int a=10;
    static int b=5;

    public static void main(String[] args) {
        bank outerObj= new bank();

        long num1=7;
        long num2=3;
        int sum = (int)Math.ceilDivExact(num1, num2);
        System.out.println(sum);

        System.out.println(a + " " + b + "before");

        Main.copyA(a);
        System.out.println(a + " " + b + "after");



//        bank.Account innerobj1=outerObj.new Account(123,"sai",500);
//        bank.Account innerobj2=outerObj.new Account(321,"chai",1000);
//
//        System.out.println(innerobj1.getBalance());
//        System.out.println(innerobj1.deposit(1000));
//        System.out.println(innerobj1.withdraw(2000));

        }
        public static void copyA(int a){
        a=b;

        }


    }
