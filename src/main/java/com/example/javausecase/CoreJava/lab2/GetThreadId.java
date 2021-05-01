package lab2;

public class GetThreadId {
	public static void main(String args[]) 
    {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }   
        long id = thread1.getId();
        System.out.println("Thread1 id : "+id);
        id = thread2.getId();
        System.out.println("Thread2 id : "+id);
        id = thread3.getId();
        System.out.println("Thread3 id : "+id);
    }
}
