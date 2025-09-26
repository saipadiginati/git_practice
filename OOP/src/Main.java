public class Main {

    public static void main(String[] args) {
        bank outerObj= new bank();

        long num1=7;
        long num2=3;
        int sum = (int)Math.ceilDivExact(num1, num2);
        System.out.println(sum);


//        bank.Account innerobj1=outerObj.new Account(123,"sai",500);
//        bank.Account innerobj2=outerObj.new Account(321,"chai",1000);
//
//        System.out.println(innerobj1.getBalance());
//        System.out.println(innerobj1.deposit(1000));
//        System.out.println(innerobj1.withdraw(2000));

        }


    }
