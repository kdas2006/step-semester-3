package Day1.Assignments.Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FirstNonRepeatingCharacter {
 static char findFirstNonRepeatingChar(String text) {
 Map<Character, Integer> frequency = new HashMap<>();
 // Count frequency of every character
 for (char c : text.toCharArray()) {
 frequency.put(c, frequency.getOrDefault(c, 0) + 1);
 }
 // Find first character with frequency 1
 for (char c : text.toCharArray()) {
 if (frequency.get(c) == 1) {
 return c;
 }
 }
 return '';
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a word or sentence: ");
 String text = scanner.nextLine();
 char result = findFirstNonRepeatingChar(text);
 if (result == '') {
 System.out.println("No Non-Repeating Character Found");
 } else {
 System.out.println(
 "First Non-Repeating Character: '" + result + "'"
 );
 }
 scanner.close();
 }
}