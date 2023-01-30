package com.jspiders.multithreadingproperties.main;

import com.jspiders.multithreadingproperties.thread.MyThread;
import com.jspiders.multithreadingproperties.thread.MyThread1;

public class ThreadMain {
	
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		
		myThread.setName("Thread1");
		myThread.setPriority(3);
		
		MyThread1 myThread1 = new MyThread1();
		Thread thread = new Thread(myThread1);
		
		thread.setName("Thread2");
		thread.setPriority(5);
		
		myThread.start();
		thread.start();
		
	}

}
