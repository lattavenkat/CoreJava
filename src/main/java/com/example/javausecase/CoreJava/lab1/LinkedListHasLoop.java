package com.example.javausecase.corejava.lab1;

public class LinkedListHasLoop {
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
	    	System.out.println("CHECKING IF A LINKEED LIST HAS LOOP");
		      System.out.println("------------------");
	        Node head = null;
	        head = add(head, 20);
	        head = add(head, 4);
	        head = add(head, 15);
	        head = add(head, 10);
	        head.next.next.next.next = head;
	        if (detect(head))
	           System.out.print("Loop found");
	        else
	           System.out.print("No Loop found");
	    }

}
