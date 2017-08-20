
public class Array {
	public static double outScreen() {
		 //TODO Auto-generated method stub
		  double[] List1 = {3.2, 1.8, 6.4, 10.9};
	      for (int i = 0; i < List1.length; i++) {
	         System.out.println(List1[i] + " ");
	      }
	      double total = 0;
	      for (int i = 0; i < List1.length; i++) {
	         total += List1[i];
	      }
	      System.out.println("Total is " + total);
		return total;	
		
	}

	public static void main(String[] args) {
		int a;
		double b;
		b = outScreen();
		a = (int) b;
		System.out.println("Main(): Total is " + a);
		System.out.println("Main(): Total is " + b);
		        
	}
	
}

