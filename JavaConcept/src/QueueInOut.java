import java.util.*;

public class QueueInOut {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Queue<String> myQueue = new LinkedList<String>(); 
		
		//int time = Integer.parseInt(args[0]);
        //Queue <Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i <= 3; i++)
        {
        	myQueue.add("Team member " + i );
        	System.out.println(myQueue.toArray()[myQueue.size()-1] + 
        			" of CMPE273 added¡£" + "Number of elements: " + myQueue.size());
        	System.out.println(Arrays.toString(myQueue.toArray()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.remove()+" removed");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Arrays.toString(myQueue.toArray()));
        }
	}

}
