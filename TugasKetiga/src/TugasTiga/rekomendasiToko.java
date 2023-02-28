package TugasTiga;

import java.util.Scanner;

public class rekomendasiToko {

    public static void main(String[] args) {
        int oreoHarga = 6000;
        int tanggoHarga = 5000;
        int buavitaHarga = 7000;
        int aquaHarga = 3000;
        System.out.println("Oreo :" + oreoHarga);
        System.out.println("Tanggo :" + tanggoHarga);
        System.out.println("Buavita :" + buavitaHarga);
        System.out.println("Aqua :" + aquaHarga);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang dimiliki: ");
        int uang = scanner.nextInt();
        scanner.close();
        if (uang < aquaHarga) {
            System.out.println("Pusing pala saya");
            return;
        }
        int numOreo = 0;
        int numTanggo = 0;
        int numBuavita = 0;
        int numAqua = 0;
        
        if (uang >= buavitaHarga) {
            numBuavita = uang / buavitaHarga;
            uang -= numBuavita * buavitaHarga;
        }
        if (uang >= tanggoHarga) {
            numTanggo = uang / tanggoHarga;
            uang -= numTanggo * tanggoHarga;
        }
        if (uang >= oreoHarga) {
            numOreo = uang / oreoHarga;
            uang -= numOreo * oreoHarga;
        }
        if (uang >= aquaHarga) {
            numAqua = uang / aquaHarga;
            uang -= numAqua * aquaHarga;
        }

        System.out.println("Rekomendasi kami:");

        if (numBuavita > 0) {
            System.out.println(numBuavita + " Buavita");
        }
        if (numTanggo > 0) {
            System.out.println(numTanggo + " Tanggo");
        }
        if (numOreo > 0) {
            System.out.println(numOreo + " Oreo");
        }
        if (numAqua > 0) {
            System.out.println(numAqua + " Aqua");
        }
    }

}
