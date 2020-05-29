import java.util.concurrent.*;

public class Concurency {
    public static void main(String[] args) {
//        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//        executorService.scheduleAtFixedRate(()-> System.out.println("hello"), 10, 1, TimeUnit.SECONDS);
        long test = 256;
        int testInt = (int) test;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000);
                cyclicBarrier.await();
                System.out.println("Tread is not await");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        try {
            cyclicBarrier.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
