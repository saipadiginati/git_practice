import java.util.List;

public class bank {

    private List<Account> account;

    class Account{


        private long accountNumber;
        private String name;
        private double balance;

        public Account(long accountNumber, String name, double balance){
            this.accountNumber = accountNumber;
            this.name=name;
            this.balance=balance;

        }
        public long getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double deposit(int amount){
            if(amount%100 ==0 && amount >99){
                balance+=amount;
            }
            else{
                System.out.println("deposit amount must be in 100 denomination");
                return -1;
            }
            return balance;
        }

        public double withdraw(int amount){

            if(amount < balance){

                balance-=amount;
            }
            else{
                System.out.println("amount must be less than balance");
            }
            return balance;
        }

    }

}
