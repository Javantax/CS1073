import java.util.Scanner;

/**
	@author Daniyal Khan 3765942
**/
public class InputAndOutput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("My name is TOM. What is your name?");
		String userInput = sc.nextLine();
		System.out.println("Pleased to meet you, " + userInput);
		System.out.println("In which program are you enrolled?");
		String userProgram = sc.nextLine();
		System.out.println(userInput + ", I hope you will like the " + userProgram + " program.");
	}
}

