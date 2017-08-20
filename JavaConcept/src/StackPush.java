import java.util.*;
public class StackPush {

	public static void main(String[] args) {
		 	// creating stack
		   Stack st = new Stack();
		   st.push("This is");
		   st.push("Class");
		   st.push("CMPE273");
		   
		   System.out.println("The array is: "+st);
		   // removing one object
		   System.out.println("Removed object is: "+st.pop());
		   System.out.println("Elements after remove: "+st);	
	}

}
