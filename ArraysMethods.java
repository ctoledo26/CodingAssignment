package codingAssingment;

import java.util.Arrays;

public class ArraysMethods {

	public static void main (String[] args) {
	// Step 1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 33};

		int firstElement = ages[0];
		int lastElement = ages[ages.length - 1];
		

		System.out.println(lastElement - firstElement);
	
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
	
		String string = "Hello";
		int times =3;
		System.out.println(string.repeat(times));
		
	}





// Step 8

	public static String createFullName(String firstName,String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
// Step 9
	
	public static void main2(String[]args) {
		int [] numbers = {10,24,200};
		int count = 0;
		for (int i = 0;i<numbers.length;i++) {
		count += numbers[i];
		}
		if(count > 100) {
			System.out.println(true);
		}
	
// Step 10
		
		double[] doubleArr=	{1.2, 5.6, 3.4, 2.9, 9.7};
		int sum = 0;

		for (int i= 0;i < doubleArr.length;i++) {
		sum += doubleArr[i];
		}
		System.out.println(sum / 5);
			

// Step 11

		double[] secondDouble = {2.4,5.7,2.8,5.5,2.6,5.8};
		int sum2 = 0;
		for (int i= 0;i < secondDouble.length;i++) {
			sum2 += secondDouble[i];
		}
			System.out.println(sum2 / 6);

			if(sum / 5 > sum2 / 6) {
			

				System.out.println(true);
}
			
// Step 12		
			
 }
	public static void willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		isHotOutside = true ;
		moneyInPocket = 13.75 ;
		if (isHotOutside = true && moneyInPocket >= 10.50) {
		System.out.println(true);
		
		} 
		else {
			System.out.println(false);
			
		}
	}
			
		
// Step 13 
		
	public static void main5(String[] args) {
		String[] names = new String [] {"John", "Steve", "Gergoe","Paul","Clara","Steve","Clara","John"};
		
		
	for(int i = 0; i < names.length; i++) {
			for(int n = i + 1; n < names.length;n++) {
				if (names[i].equals(names[n]))
			
		System.out.println(names[n]);

// 		This method was created to find the duplicates in a String array - I used a nested loop to compare all elements and then printing the duplicated elements.		
			}		

		}
	}
	
}	




