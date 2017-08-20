import java.util.*;

//create a thread: new thread? -> thread combined with interface "Runnable", so create class
//output thread status: where?? -> three methods, public create; public void run(); public void start;
//start a thread: thread.run()? -> Thread(Runnable this, String name); Thread.start(); Thread.sleep(1000);
class TaskConcur implements Runnable {
	
	private Thread T;
	private String TaskName;
	private int ProcDur;
	
	//create 
	public TaskConcur(String strIn, int numDur) {
		TaskName = strIn;
		ProcDur = numDur;
	}
	public void run() {
	//business logic
		for(int i=ProcDur; i>=0; i--) {
			try { 
				System.out.println(TaskName + "ing " + (ProcDur-i) + " seconds.");			
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(TaskName + " interrupted");
			}			
		}		
		System.out.println(TaskName + " exit.");
	}
	public void start() {
		T = new Thread(this, TaskName);	
		T.start();
	}	
}

public class MulThreadSample {
	public static void main(String[] args) {
		TaskConcur taskOne = new TaskConcur("Left Hand Press", 5);
		taskOne.start();		
		TaskConcur taskTwo = new TaskConcur("Right Hand Press", 10);
		taskTwo.start();
	}
}
