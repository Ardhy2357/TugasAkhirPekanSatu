package MateriArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class fullBintang {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran arraylist: ");
        int n = scanner.nextInt();

        ArrayList<ArrayList<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<String> sub = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                sub.add("*");
            }
            arr.add(sub);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
