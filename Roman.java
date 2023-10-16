package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scan.nextLine();
        scan .close();

        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent is: " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }
        return result;

	}

}
