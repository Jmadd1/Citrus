import java.util.Scanner;





public class CitrusHome {
	    public static void main(String[] args) {
	    double age;
	    double height; 	
	    String firstname; 
		String LastName;
	    double weight; 
		double Proportion;
		double NewHeight;
		String con;
		Scanner keyboard = new Scanner(System.in);  
		System.out.println("Welcome to Citrus. Please fill in your information so we can find your Body Mass Index!");
		System.out.println("What is your first name?");		
		firstname = keyboard.next();
		System.out.println("What is your last name?");
		LastName =  keyboard.next();
		System.out.println("Age?");
		age = keyboard.nextDouble();
		System.out.println("Height?(inches please)");
	    height = keyboard.nextDouble(); 
	    System.out.println("Weight");
	    weight = keyboard.nextDouble();
	    NewHeight = height * height;
	    Proportion = weight / NewHeight * 703;
	    if (Proportion <= 18.5) {
	    	System.out.println("Status: Thin!");
	    }
	    if (Proportion > 18.5) {
	    	if (Proportion <= 24.9) {
	    		 System.out.println("Status: Healthy."); 
	    	}
	     }
	    if (Proportion > 24.9) {
	    	if (Proportion <= 29.9) {
	    		System.out.println("Status: Overweight!");
	    	}
	    }
	    	if (Proportion > 29.9) {
	    System.out.println("Status: Obese!"); 
	    }
	    
	    System.out.println("Your BMI number is " +Proportion);
	    
	    System.out.println("Great. Would you like to see your stats?");
	    con = keyboard.next();
	    if (con == "yes") {
	    	System.out.println("Age:" + age);
	    	System.out.print("Height " + height);
	    	System.out.print(" First Name: " + firstname);
	    	System.out.print(" Last Name: " + LastName);
	    	System.out.print(" Weight " + weight);
	    	System.out.print(" BMI Number: " + Proportion);
	    
	    }
}
}
