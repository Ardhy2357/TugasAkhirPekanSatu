package TugasEmpat;

import java.io.Serializable;

public class Barang implements Serializable {
    private static final long serialVersionUID = 1L;
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBarang;

    public Barang(String namaBarang, double hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    @Override
    public String toString() {
        return namaBarang + " | Rp. " + hargaBarang + " | " + jumlahBarang;
    }
}
