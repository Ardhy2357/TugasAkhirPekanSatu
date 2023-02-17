package LuasKelilingBangunDatar;

public class lingkaran extends bidangdatar {

	private double radius;
	
	public lingkaran (double radius) {
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double hitungLuas() {
		return Math.PI * Math.pow(radius, 2);
		
	}
	
	public double hitungKeliling() {
		return 2 * Math.PI * radius;
	}
	
	
}
