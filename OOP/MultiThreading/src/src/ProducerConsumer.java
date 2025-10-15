public class ProducerConsumer {

    public static void main(String[] args) {

        Shared_Resource obj= new Shared_Resource();

        Thread t1= new Thread( () ->

        {
//            try {
//                Thread.sleep(1);
//            } catch (Exception e) {
//
//            }
//            while (true) {
//                obj.produce();
//            }
            obj.charactersPrinting("Hello Sai chaitanya Welcome to ");
        });

        Thread t2= new Thread( () ->
        {
//while(true) {
//    obj.consume();
//}
            obj.charactersPrinting("world Earth in solar system");
        }
                );

        t1.setName("producer thread");
        t2.setName("consumer thread");

        t1.start();
        t2.start();


    }
}
