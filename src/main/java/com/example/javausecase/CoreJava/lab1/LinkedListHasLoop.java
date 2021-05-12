package com.example.javausecase.corejava.lab1;
import java.util.logging.Logger;
public class LinkedListHasLoop {
	static Logger log = Logger.getLogger(LinkedListHasLoop.class.getName());
	public static final int NUMB1 = 20;
	public static final int NUMB2 = 4;
	public static final int NUMB3 = 23;
	public static final int NUMB4 = 7;
	static class Node
	    {
	       int data;
	       Node next;
	       int temp;
	    };
	    static Node add(Node newHead, int newData)
	    {
	        Node newNode = new Node();
	        newNode.data = newData;
	        newNode.temp = 0;
	        newNode.next = newHead;
	        newHead = newNode;
	        return newHead;
	    }
	    static boolean detect(Node n)
	    {
	        while (n != null)
	        {
	            if (n.temp == 1)
	               return true;
	            n.temp = 1;
	            n = n.next;
	        }
	        return false;
	    }	    
	    public static void main(String[] args)
	    {
	    	log.info("CHECKING IF A LINKEED LIST HAS LOOP");
		      log.info("------------------");
	        Node head = null;
	        head = add(head, NUMB1);
	        head = add(head, NUMB2);
	        head = add(head, NUMB3);
	        head = add(head, NUMB4);
	        head.next.next.next.next = head;
	        if (detect(head))
	           log.info("Loop found");
	        else
	           log.info("No Loop found");
	    }

}
