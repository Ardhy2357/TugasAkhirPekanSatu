package LuasKelilingBangunDatar;

public class segitiga extends bidangdatar {
	private double alas;
	private double tinggi;
	
	public segitiga(double alas, double tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}
	public double getAlas() {
		return alas;
	}
	public void setAlas(double alas) {
		this.alas = alas;
	}
	public double getTinggi() {
		return tinggi;
	}
	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	public double hitungLuas() {
		return 0.5 * alas * tinggi;
	}
	
	public double hitungKeliling() {
		// cari sisi miring pake rumus pytaghoras 
		double sisiMiring= Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
		return alas + tinggi + sisiMiring;
	}
}

