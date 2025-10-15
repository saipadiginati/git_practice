public class ProdAndCons {

    public static void main(String[] args) {

        SharedRes sharedObj= new SharedRes();

        Thread producer= new Thread( () -> { while(true){sharedObj.producer();}});
        Thread consumer = new Thread(() -> {while(true) {sharedObj.consumer();}});
        producer.start();
        consumer.start();

    }
}
