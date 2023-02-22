package MateriArrayList;
import java.util.Scanner;

public class silangGanjil {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan ukuran arraylist(ganjil): ");
            int n = scanner.nextInt();
            if (n % 2 == 1) {
            	for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j || i == n - j - 1) {
                            int center = n/2;
                            if (j < center) {
                            	System.out.print(n-2*(center-j));
                            } else if (j > center) {
                            	System.out.print(n+2*(j-center));
                            } else {
                            	System.out.print(n);
                            }
                        	
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Invalid input, pusing saya kalau tidak ganjil.");
            }
        
        
    }
        scanner.close();
}
}
