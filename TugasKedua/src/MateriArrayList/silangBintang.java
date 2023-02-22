package MateriArrayList;
import java.util.ArrayList;
import java.util.Scanner;


public class silangBintang {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Masukkan ukuran arraylist: ");
	        int n = scanner.nextInt();
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == j || i == n - j - 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
}
