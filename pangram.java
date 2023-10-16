package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter s string");
		String s=scan.nextLine().toLowerCase();
		boolean isPangram=checkIfPangram(s);
		
		if(isPangram) {
			System.out.println("the input is pangram");
		}
		else {
			System.out.println("the input is not a pangram");
		}
	}
	public static boolean checkIfPangram(String s) {
		Set<Character> alphabetSet=new HashSet<>();
		for(char c:s.toCharArray()) {
			if(Character.isLetter(c)) {
				alphabetSet.add(c);
			}
		}
		return alphabetSet.size()==26;
	}

}
