package LuasKelilingBangunDatar;

public class belahketupat extends bidangdatar {
	private double dia1;
	private double dia2;
	
	public belahketupat (double dia1, double dia2) {
		this.dia1 = dia1;
		this.dia2 = dia2;
		
	}
	public double getDia1() {
		return dia1;
	}
	
	public void setDia1(double dia1) {
		this.dia1 = dia1;
		
	}
	public double getDia2() {
		return dia2;
	}
	
	public void setDia2(double dia2) {
		this.dia2 = dia2;
		
	}
	
	
	public double hitungLuas() {
		return 0.5 * dia1 * dia2;
		
	}
	
	public double hitungKeliling() {
		// menghitung sisi dengan pythagoras untuk menghindari pemasukan sisi yang tidak masuk akal dengan atribut diagonal
		double sisid = Math.sqrt(Math.pow(0.5  *dia1, 2)+ Math.pow(0.5 * dia2, 2));
		return sisid * 4;
	}
}
