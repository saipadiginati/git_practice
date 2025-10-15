public class Main {

    public static void main(String[] args) throws InterruptedException {

        ReadWriteLocking resource= new ReadWriteLocking();

        Thread t1= new Thread( () ->
                resource.produce()
                );
        Thread t2= new Thread(() ->
                resource.produce());

        Thread t3= new Thread(() ->
                resource.consume());

        Thread t4= new Thread(() -> {
            try {
                Thread.sleep(2000);
                resource.consume();
            } catch (Exception e) {

            }
        }
                );
t1.start();
//t2.start();t3.start();
t4.start();

t1.join();
        System.out.println("main competed");

    }
}
