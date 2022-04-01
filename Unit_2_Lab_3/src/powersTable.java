import java.util.Scanner;

public class powersTable {

	public static void main(String[] args) {
		char cont;
		char cont2;
		String userName;
		String midChar;
		String nameUser;
		System.out.println("********************************");
		System.out.println("*Welcome to the Math Table Lab!*");
		System.out.println("********************************");
		System.out.println();
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is your name?");
		userName = scnr.nextLine();
		midChar = userName.substring(1, userName.length()-1);
		nameUser = userName.charAt(userName.length()-1) + midChar + userName.charAt(0);
		do {
			System.out.println("Ok, " + nameUser + ". (I hope I spelled that right!) - \nPlease enter an integer for the Square/Cube table:");
			int userInput = scnr.nextInt();
			int i = 1;
			System.out.format("%s", "Number");
			System.out.format("%11s", "Squared");
			System.out.format("%10s", "Cubed");
			System.out.println();
			System.out.println("======    =======     =====");
			do {
				System.out.printf("%3d", i);

				System.out.printf("%11d", i * i);

				System.out.printf("%11d", i * i * i);

				i++;
				System.out.println();

			} while (i <= userInput);
			System.out.println();
			System.out.println("Would you like to continue? y/n:");
			cont = scnr.next().charAt(0);
		} while (cont == 'Y' || cont == 'y');
		System.out.println("Would you like to see a Multiplication Table? y/n:");
		Scanner scnr2 = new Scanner(System.in);
		String answer = scnr2.next();
		if (answer.equalsIgnoreCase("y")) {
			
			do {
				System.out.println("Ok - enter an integer for " + nameUser + "'s multiplication table:");
				Scanner scnr3 = new Scanner(System.in);
				int j = 1;
				int userInput2 = scnr3.nextInt();
				System.out.format("%4s", "1");
				System.out.printf("%7s", "2");
				System.out.printf("%7s", "3");
				System.out.println();
				System.out.println("  ---    ---    ---");
				do {
					System.out.printf(j + "|" + "%2d", j * 1);
					System.out.printf("%7d", j * 2);
					System.out.printf("%7d", j * 3);
					System.out.println();
					j++;
				} while (j <= userInput2);
				System.out.println();
				System.out.println("Would you like to continue? y/n:");
				cont2 = scnr.next().charAt(0);
			} while (cont2 == 'Y' || cont2 == 'y');
			System.out.println("Thanks for playing, " + userName + "! ;)");
				
		} else {
			
			System.out.println("Thanks for playing, " + userName + "! ;)");
		}
	}

}
