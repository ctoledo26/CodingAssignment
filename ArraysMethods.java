package codingAssingment;

import java.util.Arrays;

public class ArraysMethods {
	
	public static void main(String[] args) {
	
	
	// Step 1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 33};

		int firstElement = ages[0];
		int lastElement = ages[ages.length - 1];
		System.out.println(lastElement - firstElement);
		
	//1B
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 33,4};

		int firstElement2 = ages2[0];
		int lastElement2 = ages2[ages2.length - 1];
		System.out.println(lastElement2 - firstElement2);
	
		int sum = 0;
		for(int i = 0 ; i < ages.length; i++)
			
			sum += ages[i];
			System.out.println(sum / 8);
		
	
	


// Step 2
	
			
					
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			int count = 0;
			for (int i = 0; i < names.length; i++) {
				count += names[i].length();
			}
			int average = count / names.length;
			System.out.println("The average number of letters per name is " + average );
			

			for (int i = 0; i < names.length; i++) {

			      if (i > 0) {
			          System.out.print(", ");
			      }

			      System.out.print(names[i]);
	      
			}
	
	
// Step 3 and 4
		

			
			String firstE = names[0];
			String lastE = names[names.length-1];
			System.out.println("\nThis is the how I would do to find the first and last method of an array:" + firstE + "\n" +lastE);

// Step 5			
			int[] nameLengths = new int[names.length];
			for (int n = 0; n < names.length;n++) {
				nameLengths[n] = names[n].length();
			}
				System.out.println(Arrays.toString(nameLengths));
				
			
// Step 6
		int total = 0;
			for(int i = 0; i < nameLengths.length; i++) {
				total += nameLengths[i];
			}
				System.out.println(total);
			
	
	
// Step 7
	
	

		System.out.println(repeatWord("Hello", 3));
	
	
	
// Step 8

	System.out.println(createFullName("John", "Doe"));
	
	
// Step 9
	int[] numbers = {50, 50, 51};
	if (greaterThan100(numbers)) {
	    System.out.println("The sum of the numbers is greater than 100");
	} else {
	    System.out.println("The sum of the numbers is not greater than 100");
	}

	
			
// Step 10	
			
	double[] numbers1 = {1.0, 2.0, 3.0};
	double[] numbers2 = {4.0, 5.0, 6.0};
	if (secondDouble(numbers1, numbers2)) {
	    System.out.println("The average of the first array is greater than the average of the second array");
	} else {
	    System.out.println("The average of the first array is not greater than the average of the second array");
	}
	
//Step 11
	boolean isHotOutside = true;
	double moneyInPocket = 13.75 ;
	if (willBuyDrink(isHotOutside,moneyInPocket)) {
	System.out.println("I will buy a drink");
	
	} 
	else {
		System.out.println("I will not buy a drink");
	}
	
// Step 12 
		
	printMultiplicationTable(8);
			
	
	}

	//Step 7 Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times

	public static String repeatWord(String word, int n) {
		String repeated = "";

		for (int i = 0; i < n; i++) {
			repeated += word;
		} 

		return repeated;
	}
	//Step 8 Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

	public static String createFullName(String firstName,String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;		
	}

//Step 9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

	public static boolean greaterThan100(int[]numbers) {
			int sum = 0;
			  for (int num : numbers) {
			        sum += num;
			  }
			        return sum > 100;
			  
	}
// Step 10 - Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

		
			       

				public static boolean secondDouble (double[] numbers1, double[] numbers2) {
				
				double average1 = 0;
			    for (double num : numbers1) {
			        average1 += num;
			    }
			    average1 = average1 / numbers1.length;
			    
			    double average2 = 0;
			    for (double num : numbers2) {
			        average2 += num;
			    }
			    average2 = average2 / numbers2.length;
			    
			    return average1 > average2;				
				}
			

//Step 11 This method takes a boolean isHotOutside and a double moneyInPocket as input and returns a boolean value indicating whether the person will buy a drink. 

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return isHotOutside && moneyInPocket > 10.50;

}
// Step 12  This method prints the multiplication table for a given integer.

public static void printMultiplicationTable(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + n * i);
    }
}

	

		}
	







