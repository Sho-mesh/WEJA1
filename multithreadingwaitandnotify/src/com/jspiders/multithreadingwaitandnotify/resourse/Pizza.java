package com.jspiders.multithreadingwaitandnotify.resourse;

public class Pizza {

	int noOfPizza;

	public synchronized void orderPizza(int orderedPizza) {
		System.out.println("Ordering " + orderedPizza + " pizzas");
		if (orderedPizza > noOfPizza) {
			System.out.println(orderedPizza + " pizzas not available");
			System.out.println("Please wait..!!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		noOfPizza -= orderedPizza;
		System.out.println("Order of " + orderedPizza + " pizzas successfull.");
	}

	public synchronized void makePizza(int bakedPizza) {
		System.out.println("Making " + bakedPizza + " pizzas");
		noOfPizza += bakedPizza;
		System.out.println(noOfPizza + " pizzas available");
		this.notifyAll();
	}

}
