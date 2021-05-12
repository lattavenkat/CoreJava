package com.example.javausecase.corejava.lab2;
import java.util.logging.Logger;
public class GetThreadId {
     
    public static final int NUMB2 = 5;
    public static final int NUMB1 = 500;
static Logger log = Logger.getLogger(GetThreadId.class.getName());
	public static void main(String args[]) 
    {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            for (int i = 0; i < NUMB2; i++) {
                log.info(" " +i);
                Thread.sleep(NUMB1);
            }
        }
        catch(Exception e) {
            log.info(" " +e);
        }   
        long id = thread1.getId();
        log.info("Thread1 id : "+id);
        id = thread2.getId();
        log.info("Thread2 id : "+id);
        id = thread3.getId();
        log.info("Thread3 id : "+id);
    }
}
