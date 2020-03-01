import java.util.Scanner;
import java.io.IOException;
public class menu{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);
		int option;
		int position;
		int array1[]={};
		int array2[]={};
		int array3[]={};
		int length;
		int optionArray;
		double num1=0;
		double num2=0;
		String text1="";
		String text2="";
		String text3="";
		boolean enter=true;
		boolean caseOne=false;
		boolean caseFive=false;
		boolean caseEight=false;
		String answer;
		System.out.println("Welcome, this program let you run the follows apps:");
		while(enter){
		System.out.println(
			"Choose the option that you want to run:\n"+
			"01 Enter three strings\n"+
			"02 Show the length of each string\n"+
			"03 Concatenate the three strings and show them on screen\n"+
			"04 Show on screen the character at a position that you enter of each string\n"+
			"05 Enter two reals numbers major than zero\n"+
			"06 Show the division of both numbers\n"+
			"07 Show the division and the residue of the interger part of both numbers\n"+
			"08 Enter three arrays and length is chosen by you\n"+
			"09 Show the three arrays that you entered\n"+
			"10 Show the average of one array that you entered, you choose which one\n"+
			"11 The greater value of one array that you entered, you choose which one\n"+
			"12 Add, subtract or multiply two arrays that you entered\n"+
			"13 Create a new array with the three that you entered\n"+
			"14 Create a new array with the three that you entered without repeat numbers\n"+
			"15 Create a new array with the interseption of the arrays that you entered before\n"+
			"16 Turn n position the arrays' values\n"+
			"17 Organize one array with the bubble method");
			
		option = leer.nextInt();
		switch(option){
			case 1:
				caseOne=true;
				System.out.println("Enter three strings");
				leer.nextLine();
				System.out.println("Enter first string");
				text1 = leer.nextLine();
				System.out.println("Enter second string");
				text2 = leer.nextLine();
				System.out.println("Enter third string");
				text3 = leer.nextLine();
				break;
			case 2:
				if(!caseOne){
					System.out.println("You have to run the first program before run this");
				}else{
					System.out.printf("Length first string:%s%n", text1.length());
					System.out.printf("Length first string:%s%n", text2.length());
					System.out.printf("Length first string:%s%n", text3.length());
				}
				break;
			case 3:
				if(!caseOne){
					System.out.println("You have to run the first program before run this");
				}else{
					System.out.println(text1+text2+text3);
				}
				break;
			case 4:
				if(!caseOne){
					System.out.println("You have to run the first program before run this");
				}else{
					System.out.println("What position do you want to see?");
					position = leer.nextInt();
					while(position<1){
						System.out.print("Enter a number major than zero: ");
						position = leer.nextInt();
					}
					while(position>text1.length() || position>text2.length() || position>text3.length()){
						System.out.println("The position entered is not valid because it exceeds the number of digits of at least one string");
						System.out.print("Enter a diferent number: ");
						position = leer.nextInt();	
						while(position<1){
							System.out.print("Enter a number major than zero: ");
							position = leer.nextInt();
						}
					}
					System.out.printf("Postion %d of the first string is:%s%n", position, text1.charAt(position-1));
					System.out.printf("Postion %d of the second string is:%s%n", position, text2.charAt(position-1));
					System.out.printf("Postion %d of the third string is:%s%n", position, text3.charAt(position-1));
				}
				break;
			case 5:
				do{
					caseFive=true;
					System.out.println("Enter the first number major than zero");
					num1=leer.nextDouble();
				}while(!(num1>0));
				do{
					System.out.println("Enter the second number major than zero");
					num2=leer.nextDouble();
				}while(!(num2>0));
				break;
			case 6:
				if(!(caseFive)){
					System.out.println("You have to run the fifth program before run this");
				}else{
					System.out.printf("%.2f divided %.2f gives %.2f%n", num1, num2, num1/num2);
					System.out.printf("%.2f divided %.2f gives %.2f%n", num2, num1, num2/num1);
				}
				break;
			case 7:
				if(!(caseFive)){
					System.out.println("You have to run the fifth program before run this");
				}else{
					System.out.printf("%d divided %d gives %d%n", (int)num1, (int)num2, (int)num1/(int)num2);
					System.out.printf("The residue is %d%n", (int)num1%(int)num2);
					System.out.printf("%d divided %d gives %d%n", (int)num2, (int)num1, (int)num2/(int)num1);
					System.out.printf("The residue is %d%n", (int)num2%(int)num1);
				}
				break;
			case 8:
				caseEight=true;
				System.out.print("Enter the length of first array: ");
				length=leer.nextInt();
				array1 = new int[length];
				for(int i=0; i<array1.length; i++){
					System.out.printf("Enter the %d value: ", i+1);
					array1[i]=leer.nextInt();
				}
				System.out.print("Enter the length of second array: ");
				length=leer.nextInt();
				array2 = new int[length];
				for(int i=0; i<array2.length; i++){
					System.out.printf("Enter the %d value: ", i+1);
					array2[i]=leer.nextInt();
				}
				System.out.print("Enter the length of third array: ");
				length=leer.nextInt();
				array3 = new int[length];
				for(int i=0; i<array3.length; i++){
					System.out.printf("Enter the %d value: ", i+1);
					array3[i]=leer.nextInt();
				}
				break;
			case 9:
				if(!(caseEight)){
					System.out.println("You have to run the eighth program before run this");
				}else{
					System.out.println("First array");
					printArray(array1);
					System.out.println("Second array");
					printArray(array2);
					System.out.println("Third array");
					printArray(array3);
				}
				break;
			case 10:
				if(!(caseEight)){
					System.out.println("You have to run the eighth program before run this");
				}else{
					System.out.println("Choose one array");
					System.out.print("1 ");
					printArray(array1);
					System.out.print("2 ");
					printArray(array2);
					System.out.print("3 ");
					printArray(array3);
					optionArray=leer.nextInt();
					double average=0;
					switch(optionArray){
						case 1:
							average=average(array1);
							break;
						case 2:
							average=average(array2);
							break;
						case 3:
							average=average(array3);
							break;
					}
					System.out.printf("The average of Array %d is: %.2f%n", optionArray, average);	
				}
				break;
			case 11:
				if(!(caseEight)){
					System.out.println("You have to run the eighth program before run this");
				}else{
					System.out.println("Choose one array");
					System.out.print("1 ");
					printArray(array1);
					System.out.print("2 ");
					printArray(array2);
					System.out.print("3 ");
					printArray(array3);
					optionArray=leer.nextInt();
					int biggerNum;
					int num;
					switch(optionArray){
						case 1:
							biggerNum=array1[0];
							for(int i=0; i<array1.length; i++){
								num=array1[i];
								if(num>biggerNum){
									biggerNum=num;
								}
							}
							System.out.printf("The bigger number in the first array is: %d%n", biggerNum);							
							break;
						case 2:
							biggerNum=array2[0];
							for(int i=0; i<array2.length; i++){
								num=array2[i];
								if(num>biggerNum){
									biggerNum=num;
								}
							}
							System.out.printf("The bigger number in the second array is: %d%n", biggerNum);							
							break;
						case 3:
							biggerNum=array3[0];
							for(int i=0; i<array3.length; i++){
								num=array3[i];
								if(num>biggerNum){
									biggerNum=num;
								}
							}
							System.out.printf("The bigger number in the third array is: %d%n", biggerNum);
							break;
						}
					}
					break;
				case 12:
					if(!(caseEight)){
						System.out.println("You have to run the eighth program before run this");
					}else{
					int option1;
					int option2;
					int[] optionA1={};
					int[] optionA2={};
					System.out.println("Choose two arrays");
					System.out.print("1 ");
					printArray(array1);
					System.out.print("2 ");
					printArray(array2);
					System.out.print("3 ");
					printArray(array3);
					System.out.println("First array: ");
					option1=leer.nextInt();
					if(option1==1){
						optionA1=array1;
					}else if(option1==2){
						optionA1=array2;
					}else if(option1==3){
						optionA1=array3;
					}
					System.out.println("Second array: ");
					option2=leer.nextInt();
					if(option2==1){
						optionA2=array1;
					}else if(option2==2){
						optionA2=array2;
					}else if(option2==3){
						optionA2=array3;
					}
					System.out.println("What do you want to do?, Add / Subtract / Multiply");
					leer.nextLine();
					String action=leer.nextLine();
					while(!(action.equalsIgnoreCase("add") || action.equalsIgnoreCase("subtract") || action.equalsIgnoreCase("multiply"))){
						System.out.println("You only have three options: Add / Subtract / Multiply");
						System.out.println("Please enter one option: ");
						action=leer.nextLine();
					}
					if(action.equalsIgnoreCase("add")){
						add(optionA1, optionA2);
					}else if(action.equalsIgnoreCase("subtract")){
						subtract(optionA1, optionA2);
					}else if(action.equalsIgnoreCase("multiply")){
						multiply(optionA1, optionA2);
					}
					}
					break;
				case 13:
					if(!(caseEight)){
						System.out.println("You have to run the eighth program before run this");
					}else{
						int[] mixArray=joinArrays(array1, array2, array3);
						System.out.print("Array Mixed ");
						printArray(mixArray);
					}
					break;
				case 14:
					if(!(caseEight)){
						System.out.println("You have to run the eighth program before run this");
					}else{
						printArray(joinWithoutRepeat(array1, array2, array3));
					}
					break;
				case 15:
					if(!caseEight){
						System.out.println("You have to run the eighth program before run this");						
					}else{
						int[] interseption=interseption(array1, array2, array3);
						printArray(interseption);
					}
					break;
				case 16:
					if(!caseEight){
						System.out.println("You have to run the eighth program before run this");						
					}else{
						System.out.println("Choose one array");
						System.out.print("1 ");
						printArray(array1);
						System.out.print("2 ");
						printArray(array2);
						System.out.print("3 ");
						printArray(array3);
						System.out.println("The array: ");
						int option1=leer.nextInt();
						int[] array;
						if(option1==1){
							array=array1;
						}else if(option1==2){
							array=array2;
						}else{
							array=array3;
						} 
						System.out.println("How many position do you want to turn the array?: ");
						int n=leer.nextInt();
						printArray(turnNpositions(n, array));
					}
					break;
				case 17:
					if(!caseEight){
						System.out.println("You have to run the eighth program before run this");						
					}else{
						System.out.println("Choose one array");
						System.out.print("1 ");
						printArray(array1);
						System.out.print("2 ");
						printArray(array2);
						System.out.print("3 ");
						printArray(array3);
						System.out.println("The array: ");
						int option1=leer.nextInt();
						int[] array;
						if(option1==1){
							array=array1;
						}else if(option1==2){
							array=array2;
						}else{
							array=array3;
						} 
						printArray(bubble(array));
					}
					break;
				default:
					System.out.println("Invalid number");
		}
			leer.nextLine();
			System.out.print("Do you want to run another app?, yes or not: ");
			answer = leer.nextLine();
			while(!((answer.equalsIgnoreCase("not") || answer.equalsIgnoreCase("yes")))){
				System.out.print("There are only two options, yes or not: ");	
				answer = leer.nextLine();
			}
			if(answer.equalsIgnoreCase("not")){
				enter = false;
			}
			clean();
		}		
	}
	/**
	 * Cleans the screen of the console
	 */
	public static void clean(){
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
        }
	}
	/**
	 * Converts a number to array
	 * @param number The number.
	 * @return An array type int
	 */
	public static int[] numberToArray(int number){
		int[] array=new int[lengthNumber(number)];
		int residue;
		if(number<0){
			number=number*-1;
			for(int i=array.length-1; i>=0; i--){
				residue=number%10;
				if(i==0){
					array[i]=residue*-1;
				}else{
					array[i]=residue;
				}
				number=number/10;
			}	
		}else{
			for(int i=array.length-1; i>=0; i--){
				residue=number%10;
				array[i]=residue;
				number=number/10;
			}
		}
		return array;
	}
	/**
	 * Coverts an array to number
	 * @param array The array. array!=null <br>array[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @return A number type int
	 */
	public static int arrayToNumber(int[] array){
		int number=0;
		for(int i=0; i<array.length; i++){
			number=number*10+array[i];
		}
		return number;
	}
	/**
	 * Gives the length of a number
	 * @param number The number
	 * @return The quantity of digits
	 */
	public static int lengthNumber(int number){
		int digits=0;
		do{
			number=number/10;
			digits++;		
		}
		while(number!=0);
		return digits;
	}
	/**
	 * Adds two arrays' values<br>
	 * <b>post:</b> It prints on screen the add of the two arrays' values.<br>
	 * @param array1 The array 1. array1!=null. <br>array1[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @param array2 The array 2. array2!=null. <br>array2[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 */
	public static void add(int[] array1, int[] array2){
		int num1=arrayToNumber(array1);
		int num2=arrayToNumber(array2);
		int num3=num1+num2;
		int[] array3=numberToArray(num3);
		printArray(array3);

	}
	/**
	 * Subtracts two arrays' values<br>
	 * <b>post:</b> It prints on screen the subtract of the two arrays' values.<br>
	 * @param array1 The array 1. array1!=null. <br>array1[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @param array2 The array 2. array2!=null. <br>array2[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 */
	public static void subtract(int[] array1, int[] array2){
		int num1=arrayToNumber(array1);
		int num2=arrayToNumber(array2);
		int num3=num1-num2;
		int[] array3=numberToArray(num3);
		printArray(array3);
	}
	/**
	 * Multiplies two arrays' values<br>
	 * <b>post:</b> It prints on screen the multiply of the two arrays' values.<br>
	 * @param array1 The array 1. array1!=null. <br>array1[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @param array2 The array 2. array2!=null. <br>array2[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 */
	public static void multiply(int[] array1, int[] array2){
		int num1=arrayToNumber(array1);
		int num2=arrayToNumber(array2);
		int num3=num1*num2;
		int[] array3=numberToArray(num3);
		printArray(array3);
	}
	/**
	 * Shows on screen three arrays
	 * @param array1 The array 1
	 * @param array2 The array 2
	 * @param array3 The array 3
	 */
	public static void showArrays(int[] array1, int[] array2, int[] array3){
		System.out.print("1 [ ");
		for(int i=0; i<array1.length; i++){
			System.out.print(array1[i]+"  ");
		}
		System.out.println("]");
		System.out.print("2 [ ");
		for(int i=0; i<array2.length; i++){
			System.out.print(array2[i]+"  ");
		}
		System.out.println("]");
		System.out.print("3 [ ");
		for(int i=0; i<array3.length; i++){
			System.out.print(array3[i]+"  ");
		}
		System.out.println("]");
	}
	/**
	 * Prints an array
	 * @param array1 The array
	 */
	public static void printArray(int[] array1){
		System.out.print("[ ");
		for(int i=0; i<array1.length; i++){
			System.out.print(array1[i]+"  ");
		}
		System.out.println("]");
	}
	/**
	 *Gives the average of one array's values
	 * @param array1 The array 1 
	 * @return The average of the array's values
	 */
	public static double average(int[] array1){
		double average=0;
		for(int i=0; i<array1.length; i++){
			average+=(double)array1[i];
		}
		average=average/array1.length;
		return average;
	}
	/**
	 * Validates if a number exists in one array
	 * @param number The number you want to validate 
	 * @param array1 The array where you are going to search 
	 * @return True if the number exists<br> False if it doesn't
	 */
	public static boolean validateNumber(int number, int[] array1){
		boolean exist=false;
		for(int i=0; i<array1.length; i++){
			if(number==array1[i]){
				exist=true;
			}
		}
		return exist;
	}
	/**
	 * Creates a new array with the interseption of the three arrays' values
	 * @param array1 The array 1. array1!=null. <br>array1[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @param array2 The array 2. array2!=null. <br>array2[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @param array3 The array 3. array3!=null. <br>array3[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @return An array with the interseption of the arrays' values
	 */
	public static int[] interseption(int[] array1, int[] array2, int[] array3){
		int[] interseption;	
		boolean exist1;
		boolean exist2;
		int num=0;
		for(int i=0; i<array1.length; i++){
			exist1=false;
			exist2=false;
			exist1=validateNumber(array1[i], array2);
			exist2=validateNumber(array1[i], array3);
			if(exist1&&exist2){
				num=num*10+array1[i];	
			}
		}
		if(num==0){
			interseption=new int[0];
		}else{
			interseption=numberToArray(num);
		}
		
		return interseption;
	}
	/**
	 * Create a new array with the three arrays' values without repeat numbers
	 * @param array1 The array 1. <br>array1[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @param array2 The array 2. <br>array2[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @param array3 The array 3. <br>array3[n]>=0 &amp;&amp; array[n]<=9. Being n=any number valid to the array.
	 * @return The array created
	 */
	public static int[] joinWithoutRepeat(int[] array1, int[] array2, int[] array3){
		int[] finalArray;
		int[] arrayRepeat=joinArrays(array1, array2, array3);
		int[] arrayNoRepeat=new int[arrayRepeat.length];
		boolean exist;
		for(int i=0, j=arrayRepeat.length-1; i<arrayRepeat.length; i++){
			exist=validateNumber(arrayRepeat[i], arrayNoRepeat);
			if(!exist){
				arrayNoRepeat[j]=arrayRepeat[i];
				j--;
			}
		}
		int num=arrayToNumber(arrayNoRepeat);
		finalArray=numberToArray(num); 
		return finalArray;
	}
	/**
	 * Creates a new array with the three arrays' values
	 * @param array1 The array 1
	 * @param array2 The array 1
	 * @param array3 The array 1
	 * @return The array created
	 */
	public static int[] joinArrays(int[] array1,int[] array2,int[] array3){
		int mixArray[]=new int[array1.length+array2.length+array3.length];
		int i=0;
		for(; i<array1.length;i++){
			mixArray[i]=array1[i];
		}
		for(int index=0; i<array1.length+array2.length;i++){
			mixArray[i]=array2[index];
			index++;
		}
		for(int index=0; i<mixArray.length; i++){
			mixArray[i]=array3[index];
			index++;
		}
		return mixArray;
	}
	/**
	 * Turns n positions the array's values
	 * @param n The number of position that you want to turn
	 * @param array The array that you want to turn
	 * @return The array turned
	 */
	public static int[] turnNpositions(int n, int[] array){
		if(n>array.length){
			n=n%array.length;
		}
		int[] turnedArray=new int[array.length];
			for(int i=n, j=0; j<array.length; i++, j++){
				if(i==array.length){
					for(i=0;j<array.length; i++, j++){
						turnedArray[i]=array[j];
					}
				}else{
					turnedArray[i]=array[j];
				}	
			}
		return turnedArray;
	}
	/**
	 * Organizes an array from the smallest to the greatest number with the bubble method
	 * @param array The array you want to organize
	 * @return The array organized
	 */
	public static int[] bubble(int[] array){
		for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
			}
		}
		return array;
	}
}

