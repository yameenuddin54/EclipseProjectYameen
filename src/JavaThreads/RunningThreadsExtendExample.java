package JavaThreads;

public class RunningThreadsExtendExample extends Thread {
	  public static void main(String[] args) {
	    RunningThreadsExtendExample thread = new RunningThreadsExtendExample();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}
