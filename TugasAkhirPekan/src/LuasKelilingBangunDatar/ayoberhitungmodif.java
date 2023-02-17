package LuasKelilingBangunDatar;

import java.util.Scanner;

public class ayoberhitungmodif {

	public static void main(String[] args) {
		// scanner untuk input user
		Scanner scanner = new Scanner(System.in);
		boolean jumlah = true;
		
		// Prompt untuk user jumlah bangun datar yang dihitung
		while(jumlah) {
		System.out.print("Masukkan jumlah perhitungan: ");
		int x = scanner.nextInt();
		scanner.nextLine();
		if(x>0) {
			jumlah = false;
			
			// array untuk jumlah perhitungan
			bidangdatar[] bentuk = new bidangdatar[x];
			
			// Prompt user pilih bentukan
			for (int i = 0; i < x; i++) {
				System.out.println("Berikut daftar bidang datar yang dapat dihitung: " + (i + 1) + ":");
				System.out.print("1. Segitiga\n2. Persegi\n3. Lingkaran\n4. Belah Ketupat\nPilih bentuk: ");
				int tipeBentuk = scanner.nextInt();
				scanner.nextLine();
				
				if (tipeBentuk == 1) {
					
					// Prompt user for triangle attributes
					System.out.print("Masukan nilai alas: ");
					double alas = scanner.nextDouble();
					scanner.nextLine();
					System.out.print("Masukan nilai tinggi: ");
					double tinggi = scanner.nextDouble();
					scanner.nextLine();
					
					// Create triangle object and add it to shapes array
					segitiga segitiga = new segitiga(alas, tinggi);
					bentuk[i] = segitiga;
					
				} else if (tipeBentuk == 2) {
					
					// Prompt user untuk persegi
					System.out.print("Masukan nilai sisi: ");
					double sisi = scanner.nextDouble();
					scanner.nextLine();
					
					// objek persegi
					persegi persegi = new persegi(sisi);
					bentuk[i] = persegi;
					
				} else if (tipeBentuk == 3) {
					
					// Prompt user untuk lingkaran
					System.out.print("Masukan nilai jari-jari: ");
					double jariJari = scanner.nextDouble();
						scanner.nextLine();
						
					// objek lingkaran
					lingkaran lingkaran = new lingkaran(jariJari);
					bentuk[i] = lingkaran;
			    } else if (tipeBentuk == 4) {
			    	
			   		// Prompt user untuk belah ketupat
			        System.out.print("Masukan nilai diagonal 1: ");
			        double dia1 = scanner.nextDouble();
	                scanner.nextLine();
	                System.out.print("Masukan nilai diagonal 2: ");
			        double dia2 = scanner.nextDouble();
	                scanner.nextLine();
	                
			        // objek belah ketupat
			        belahketupat belahketupat = new belahketupat(dia1, dia2);
			        bentuk[i] = belahketupat;
			            }
				// hitung luas dan keliling bentuk
				double luas = bentuk[i].hitungLuas();
				double keliling = bentuk[i].hitungKeliling();
				System.out.println("Luas bentuk " + (i + 1) + ": " + luas);
				System.out.println("Keliling bentuk " + (i + 1) + ": " + keliling);
				System.out.println();
				
			        }
				
				
				System.out.println("Terima kasih telah menggunakan program ini. Apakah Anda ingin menghitung kembali?");
				String yesno = scanner.next();
				scanner.nextLine();
				if (yesno.equals("y")) {
					jumlah = true;
				} else if (yesno.equals("n")) {
					System.out.println("Sampai jumpa! :)");
				} else {
					System.out.println("Invalid input. Aplikasi ini akan ditutup.");
				}

		}else { 
			System.out.println("invalid masukkan angka di atas 0");
		}
		
	}
			
	scanner.close();	
   }
	
	
}


	
