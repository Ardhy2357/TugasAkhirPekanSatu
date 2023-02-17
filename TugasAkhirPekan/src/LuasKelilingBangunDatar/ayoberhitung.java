package LuasKelilingBangunDatar;

public class ayoberhitung {

	public static void main(String[] args) {
		
		// Inisialisasi objek-objek bidang datar
        segitiga segitiga = new segitiga(4, 5);
        persegi persegi = new persegi(3);
        lingkaran lingkaran = new lingkaran(5);
        belahketupat belahketupat = new belahketupat(6, 8);
        
        // Cetak luas bidang datar
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Luas Belah Ketupat: " + belahketupat.hitungLuas());
        // Cetak keliling bidang datar
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
        System.out.println("Keliling Belah Ketupat: " + belahketupat.hitungKeliling());


	}
	

}
