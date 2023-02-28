package TugasTiga;

import java.util.Scanner;

public class rekomendasiToko {

    public static void main(String[] args) {
        int oreoPrice = 6000;
        int tanggoPrice = 5000;
        int buavitaPrice = 7000;
        int aquaPrice = 3000;
        System.out.println("Oreo :" + oreoPrice);
        System.out.println("Tanggo :" + tanggoPrice);
        System.out.println("Buavita :" + buavitaPrice);
        System.out.println("Aqua :" + aquaPrice);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang dimiliki: ");
        int money = scanner.nextInt();
        scanner.close();
        if (money < aquaPrice) {
            System.out.println("Pusing pala saya");
            return;
        }
        int numOreo = 0;
        int numTanggo = 0;
        int numBuavita = 0;
        int numAqua = 0;
        
        if (money >= buavitaPrice) {
            numBuavita = money / buavitaPrice;
            money -= numBuavita * buavitaPrice;
        }
        if (money >= tanggoPrice) {
            numTanggo = money / tanggoPrice;
            money -= numTanggo * tanggoPrice;
        }
        if (money >= oreoPrice) {
            numOreo = money / oreoPrice;
            money -= numOreo * oreoPrice;
        }
        if (money >= aquaPrice) {
            numAqua = money / aquaPrice;
            money -= numAqua * aquaPrice;
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
