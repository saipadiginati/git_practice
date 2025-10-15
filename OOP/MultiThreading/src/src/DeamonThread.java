public class DeamonThread {

    public static void main(String[] args) {

        System.out.println("main thread started");

        Thread t1=new Thread(() -> {
            for(int i=0; i<1000;i++){
                System.out.println(i);
            };

        });
        t1.setDaemon(true);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main method completed");
    }
}
