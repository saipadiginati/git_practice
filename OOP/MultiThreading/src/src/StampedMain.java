public class StampedMain {
    public static void main(String[] args) {
        Stamped obj= new Stamped();

        Thread t1= new Thread(() ->
        {obj.deposit(1000);}
                );
        Thread t2= new Thread(() ->
        {

            try {
                Thread.sleep(200);
            }
            catch(Exception  e){}
                obj.deposit(1000);
            }
        );
        Thread t3= new Thread(() ->
        {obj.balance();}
        );
        Thread t4= new Thread(() ->
        { try {
            Thread.sleep(200);
        }
        catch(Exception  e){}
            obj.balance();}
        );

        t1.start();
        t2.start();
        t4.start();
        t3.start();


    }
}
