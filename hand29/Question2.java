package com.org.gen.hand29;

public class Question2 extends Thread{
	public void run()
	{
		System.out.println("Running");
	}

	public static void main(String[] args) {
		Question2 t1 = new Question2();
		Question2 t2 = new Question2();
		t1.start();
		try{
			Thread.sleep(5000);
		}
		catch(Exception e){
			
		}
		t2.start();

	}

}
