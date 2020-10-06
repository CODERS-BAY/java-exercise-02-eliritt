import java.util.Scanner;

public class Calculator {

    // global variables
    private static final Scanner scanner = new Scanner(System.in);
    
    public static float addition (float a, float b) {
    	return a + b;
    }
    
    public static float subtraction (float a, float b) {
    	return a - b;
    }
    
    public static float divide (float a, float b) {
    	return a / b;
    }
    
    public static float modulo (float a, float b) {
    	return a % b;
    }
    
    public static float pythagoras (float a, float b) {
    	return (float) Math.sqrt(a*a + b*b);
    }
    
    public static int addition2 (int a, int b) {
    	return a + b;
    }
    
    public static int subtraction2 (int a, int b) {
    	return a - b;
    }
    
    public static int divide2 (int a, int b) {
    	return a / b;
    }
    
    public static int modulo2 (int a, int b) {
    	return a % b;
    }
    
    public static int pythagoras2 (int a, int b) {
    	return (int) Math.sqrt(a*a + b*b);
    }
    

    public static void main(String[] args) {
    	boolean running = true;
       
    	do {
    		System.out.println("Would you like to make floating point calculations? Type y for yes and anything else for integer calculations.");
    		String userAnswer = scanner.nextLine();
       
    	if (userAnswer.equals ("y")) {
    	   System.out.println ("Type in the first number!");
    	   float input1 = scanner.nextFloat();
    	   System.out.println("You entered " + input1);
    	   
    	   System.out.println ("Type in the second number!");
    	   float input2 = scanner.nextFloat();
    	   System.out.println("You entered " + input2);
    	   
    	   System.out.println ("""
    	   	You can make the following calculations:
    	   	1. addition
    	   	2. subtraction
    	   	3. divide
    	   	4. modulo
    	   	5. pythagoras: You can calculate hypotenuse c.
    	   	To select a calculation, please press the corresponding number.
    	  """);
    	
    	   
    	   int calculate = scanner.nextInt();
    	   
    	   switch (calculate) {
    	   case 1: 
    		  System.out.println("Du hast Addition gewählt: " + input1 + " + " + input2);
    		  System.out.println("Das Ergebnis ist " + addition(input1,input2));
    		  break;
    	   case 2:
    		  System.out.println("Du hast Subtraktion gewählt: " + input1 + " - " + input2);
    		  System.out.println("Das Ergebnis ist " + subtraction(input1,input2));
    		  break;
    	   case 3:
    		  System.out.println("Du hast Division gewählt: " + input1 + " : " + input2);
    		  System.out.println("Das Ergebnis ist " + divide(input1,input2));
    		  break;
    	   case 4:
    	 	   System.out.println("Du hast Modulo gewählt: " + input1 + " % " + input2);
    		   System.out.println("Das Ergebnis ist " + modulo(input1,input2));
    		   break;
    	   case 5:
    		   System.out.println("Du hast Pythagoras gewählt: c = sqrt(" + input1 + "^2 + " + input2 + "^2)");
    		   System.out.println("Das Ergebnis ist " + pythagoras(input1,input2));
    		   break;
    	   default:
    		   System.out.println("Please select a number between 1 and 5.");
    	   }
    	   
    	   System.out.println("""
    	   		Would you like to calculate again?
    	   		Press y for yes or any other key for abort.
    	   		""");
    	   
    	   scanner.nextLine();
    	   
    	   String inputContinue = scanner.nextLine();
    	   
    	   if(inputContinue.equals("y")) {
    		   running = true;
    	   } else {
    		   running = false;
    	   }
       }
      
       
       else {
    	   System.out.println("Type in the first number!");
    	   int input3 = scanner.nextInt();
    	   System.out.println("You entered " + input3);
    	   System.out.println ("Type in the second number");
    	   int input4 = scanner.nextInt();
    	   System.out.println("You entered " + input4);
    	   System.out.println ("""
       	  You can make the following calculations:
       	  1. addition
       	  2. subtraction
       	  3. divide
       	  4. modulo
       	  5. pythagoras: You can calculate hypotenuse c.
       	  To select a calculation, please press the corresponding number.
       	  """);
       	
       	   
       	   int calculate = scanner.nextInt();
       	   
       	   switch(calculate) {
       	   case 1:
       		   System.out.println("Du hast Addition gewählt: " + input3 + " + " + input4);
       		   System.out.println("Das Ergebnis ist " + addition2(input3,input4));
       		   break;
       		   
       	   case 2:
       		   System.out.println("Du hast Subtraktion gewählt: " + input3 + " - " + input4);
       		   System.out.println("Das Ergebnis ist " + subtraction2(input3,input4));
       		   break;
       		   
       	   case 3:
       		   System.out.println("Du hast Division gewählt: " + input3 + " : " + input4);
       		   System.out.println("Das Ergebnis ist " + divide2(input3,input4));
       		   break;
       		   
       	   case 4:
       		   System.out.println("Du hast Modulo gewählt: " + input3 + " % " + input4);
       		   System.out.println("Das Ergebnis ist " + modulo2(input3,input4));
       		   break;
       		   
       	   case 5:
       		   System.out.println("Du hast Pythagoras gewählt: c = sqrt(" + input3 + "^2 + " + input4 + "^2)");
       		   System.out.println("Das Ergebnis ist " + pythagoras2(input3,input4));
       		   break;
       		   
       	   default:
       		   System.out.println("Please select a number between 1 and 5.");
       	   }
    	   
       	   
       	System.out.println("""
    	   		Would you like to calculate again?
    	   		Press y for yes or any other key for abort.
    	   		""");
    	   
       	scanner.nextLine();
       	
    	   String inputContinue = scanner.nextLine();
    	   
    	   if(inputContinue.equals("y")) {
    		   running = true;
    	   } else {
    		   running = false;
    	   }
       }
       } while (running);
      

        System.out.println("Thank you for using the calculator. See you soon!");
    }
}
