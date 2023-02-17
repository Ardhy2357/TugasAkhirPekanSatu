package LuasKelilingBangunDatar;

public class persegi extends bidangdatar {

	private double sisi;
	
	public persegi (double sisi) {
		this.sisi = sisi;
	}
	public double getSisi() {
		return sisi;
	}
	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	public double hitungLuas() {
		return Math.pow(sisi, 2);
	}
	public double hitungKeliling() {
		return sisi * 4;
	}
}
