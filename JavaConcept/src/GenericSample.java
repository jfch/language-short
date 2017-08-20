import java.util.*;

public class GenericSample {

	public static < E > void printArray( E[] inputArray )  {
	      // Display array elements              
	         for ( E element : inputArray ){        
	            System.out.printf( "%s ", element );
	         }
	         System.out.println();
	}
	
	public static void main(String[] args) {
		        // Create arrays of Integer, Double and Character
		        Integer[] intArray = { 5, 3, 8, 1, 9 };
		        Double[] doubleArray = { 1.1, 4.2, 3.1, 8.4 };
		        Character[] charArray = { 'C', 'M', 'P', 'E', '2', '7', '3' };
		        
		        System.out.println( "\nArray characterArray contains:" );
		        printArray( charArray ); // pass a Character array
		        System.out.println( "Array integerArray contains:" );
		        printArray( intArray  ); // pass an Integer array
		        System.out.println( "Array doubleArray contains:" );
		        printArray( doubleArray ); // pass a Double array
		    } 		
}
