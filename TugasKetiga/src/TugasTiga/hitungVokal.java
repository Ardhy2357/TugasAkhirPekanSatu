package TugasTiga;
import java.util.Scanner;
public class hitungVokal {
	public static void itungVokal(String input) {
	    int[] count = new int[5]; // to keep track of the count for each vowel
	    input = input.toLowerCase();
	    for (int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);
	        int indeksVokal = "aiueo".indexOf(c);
	        if (indeksVokal >= 0) {
	            count[indeksVokal]++;
	        }
	    }
	    System.out.println("a = " + count[0]);
	    System.out.println("i = " + count[1]);
	    System.out.println("u = " + count[2]);
	    System.out.println("e = " + count[3]);
	    System.out.println("o = " + count[4]);
	}
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Masukkan kalimat: ");
	    String input = scanner.nextLine();
	    itungVokal(input);
	    scanner.close();
	}


}
