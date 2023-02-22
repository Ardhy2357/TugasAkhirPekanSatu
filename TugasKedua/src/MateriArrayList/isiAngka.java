package MateriArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class isiAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran arraylist: ");
        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> angkaKolom = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> baris = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                baris.add(j);
            }
            angkaKolom.add(baris);
        }

        // print the 2D ArrayList
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(angkaKolom.get(i).get(j) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

