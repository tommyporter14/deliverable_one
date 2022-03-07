import java.util.Scanner;//import scanner
public class DeliverableOne {//main method, auto wrote when I made file
		public static void main(String[] args) {//main method continued
		
			final int NUMUPPERLETTERS = 1;// upper case requirement 
			final int NUMLOWERLETTERS = 1;// lower case requirement
			final int EXCLAMATION = 1;// exclamation point requirement 
			int upperCount = 0;// counter for upper
			int lowerCount = 0;//counter for lower
			int exclamationCount = 0;//counter for !
			//counter for exclamation points
			Scanner scnr = new Scanner(System.in);//assigning scnr as user input
			
			System.out.println("Please enter a valid password that meets the following requirements: "
					+ "\n At least one lower case letter"
					+ "\n At least one uppercase letter"
					+ "\n A minimum of 7 characters"
					+ "\n A maximum of 12 characters"
					+ "\n An exclamation point !");//output first message asking for password
			
			String pass = scnr.nextLine();//user input of password
			
			int passLen = pass.length(); //get length of pass
			for (int i=0; i<passLen;i++)//loop to check each character in pass
			{
				char ch = pass.charAt(i);//increment counter
				if (Character.isUpperCase(ch))
					upperCount++;
				else if (Character.isLowerCase(ch))//increment counter
					lowerCount++;
				else if (pass.charAt(i) == '!')//increment counter
					exclamationCount++;
			}
			if (upperCount >= NUMUPPERLETTERS && lowerCount >= NUMLOWERLETTERS && passLen >= 7 && passLen <=12 && exclamationCount >= EXCLAMATION)//checks if pass is valid
				System.out.println("Password is valid");
			else {//if not valid it says what is wrong
				if (upperCount < NUMUPPERLETTERS)
					System.out.println("Needs at least one upper case letter");
				if (lowerCount < NUMLOWERLETTERS)
					System.out.println("Needs at least one lower case letter");
				if (passLen < 7)
					System.out.println("Needs to be at least 7 characters");
				if (passLen > 12)
					System.out.println("Needs to be 12 or less characters");
				if (exclamationCount < EXCLAMATION)
					System.out.println("Needs at least one '!'");
			}
		
			scnr.close();//scanner close
	}

}
