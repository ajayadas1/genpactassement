package com.org.gen.hand29;

public class Question1 extends Thread {
	public void run()
	{
		System.out.println("Running");
	}
	public static void main(String args[])
	{
		Question1 t1 = new Question1();
		Question1 t2 = new Question1();
		t1.start();
		t2.start();
	}
}
