import java.util.Scanner;

public class IceCreamParlor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		int topping = 0;
		boolean wrongAnswer = false;

		Sundae yummy = new Sundae();
		
		System.out.println("Welcome to Erin's Ice Cream Parlor");
		System.out.println("Let's build your sundae!");
		
		do {
			System.out.println("How many scoops would you like?");
			userInput = sc.nextLine();

			wrongAnswer = numberIsValid(userInput);
			
			
		} while (wrongAnswer);
		
		topping = Integer.parseInt(userInput);
		
		yummy.setScoops(topping);
		
		do {
			System.out.println("What type of ice cream would you like??");
			userInput = sc.nextLine();

			wrongAnswer = numberIsNotValid(userInput);
			
			
		} while (wrongAnswer);
		
		
		yummy.setIceCream(userInput);
		
		do {
			System.out.println("What type of cone do you want your ice cream on?");
			userInput = sc.nextLine();

			wrongAnswer = numberIsNotValid(userInput);
			
			
		} while (wrongAnswer);
		
		
		yummy.setCone(userInput);
		
		do {
			System.out.println("Would you like Nuts? Please enter Y or N");
			userInput = sc.nextLine();
						
		if(userInput.equalsIgnoreCase("y")){
			yummy.setNuts(true);
		}else if(userInput.equalsIgnoreCase("n")){
			yummy.setNuts(false);
		}else{
			System.out.println("That is not a yes or a no...");
			
		}	
		}while (wrongAnswer);
		
		do {
			System.out.println("Would you like to add a banana? Please enter Y or N");
			userInput = sc.nextLine();
						
		if(userInput.equalsIgnoreCase("y")){
			yummy.setBanana(true);
		}else if(userInput.equalsIgnoreCase("n")){
			yummy.setBanana(false);
		}else{
			System.out.println("That is not a yes or a no...");
			
		}	
		}while (wrongAnswer);

		do {
			System.out.println("Do you want a cherry on top? Please enter Y or N");
			userInput = sc.nextLine();
						
		if(userInput.equalsIgnoreCase("y")){
			yummy.setCherry(true);
		}else if(userInput.equalsIgnoreCase("n")){
			yummy.setCherry(false);
		}else{
			System.out.println("That is not a yes or a no...");
			
		}	
		}while (wrongAnswer);
		
		do {
			System.out.println("Would you also like to add hot fudge to your sundae? Please enter Y or N");
			userInput = sc.nextLine();
						
		if(userInput.equalsIgnoreCase("y")){
			yummy.setHotfudge(true);
		}else if(userInput.equalsIgnoreCase("n")){
			yummy.setHotfudge(false);
		}else{
			System.out.println("That is not a yes or a no...");
			
		}	
		}while (wrongAnswer);
		
		do {
			System.out.println("We also offer a caramel topping? Please enter Y or N");
			userInput = sc.nextLine();
						
		if(userInput.equalsIgnoreCase("y")){
			yummy.setCaramel(true);
		}else if(userInput.equalsIgnoreCase("n")){
			yummy.setCaramel(false);
		}else{
			System.out.println("That is not a yes or a no...");
			
		}	
		}while (wrongAnswer);
		
		do {
			System.out.println("Would you like for me to add our patented 'Candy Medoly'? Please enter Y or N");
			userInput = sc.nextLine();
						
		if(userInput.equalsIgnoreCase("y")){
			yummy.setCandy(true);
		}else if(userInput.equalsIgnoreCase("n")){
			yummy.setCandy(false);
		}else{
			System.out.println("That is not a yes or a no...");
			
		}	
		}while (wrongAnswer);
		

	
	
	do {
		System.out.println("Lastly we can also top your sundae with crushed Oreos. Please enter Y or N");
		userInput = sc.nextLine();
					
	if(userInput.equalsIgnoreCase("y")){
		yummy.setCookie(true);
	}else if(userInput.equalsIgnoreCase("n")){
		yummy.setCookie(false);
	}else{
		System.out.println("That is not a yes or a no...");
		
	}	
	}while (wrongAnswer);
	
	System.out.println(yummy.toString());
	
	}

	public static boolean numberIsValid(String makeStringInt) {

		try {
			int aNumber = Integer.parseInt(makeStringInt);
			return false;
		} catch (NumberFormatException e) {
			System.out.println("Wrong answer. Try again");
			return true;
		}

	}
	
	public static boolean numberIsNotValid(String makeStringInt) {

		try {
			int aNumber = Integer.parseInt(makeStringInt);
			System.out.println("Wrong answer. Try again");
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}
