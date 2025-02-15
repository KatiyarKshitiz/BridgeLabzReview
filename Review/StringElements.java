import java.util.Scanner;
public class StringElements {
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter a string: "); 
String str = sc.nextLine(); 
sc.close(); 
printNonRepeatingCharacters(str);
}
public static void printNonRepeatingCharacters(String str) {
int[] freq = new int[256];
for (char ch : str.toCharArray()) {
freq[ch]++;
}
System.out.print("Non-repeating characters: ");
for (char ch : str.toCharArray()) {
if (freq[ch] == 1) {
System.out.print(ch + " ");
}
}
}
}
