// Threading with implements Runnable 

package MultiThreading;

/**
 * MultiThreading
 */
class Threading implements Runnable {

    @Override
    public void run() {
        System.out.println("FROM THE : " + Thread.currentThread().getName());
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            
            System.out.println("THis is the t1" + i);

            // to find the which is running right now            
            // System.out.println("Thread Name : "+Thread.currentThread().getName());
            
            // find the current thread prority
            // System.out.println("Thread Prorirty: "+  Thread.currentThread().getPriority());
            // // System.out.println("The Active Count is the --> "+Thread.activeCount());

        }
    }
}

public class MultiThreadingWithRunnable {

    public static void main(String[] args) {
        Thread t2 = new Thread(new Threading(), "Threadt1");
        Thread t3 = new Thread(new Threading(), "thread3");
        t2.start();
         t3.start();
        t3.setPriority(9);

        try {
            t2.join(); 
            t3.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println();
        }
    }

}