package TugasEmpat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BarangWriter {

    public static void main(String[] args) {
        List<Barang> barangList = new ArrayList<>();
        barangList.add(new Barang("Oreo", 4000.0, 5));
        barangList.add(new Barang("Tango", 5000.0, 10));
        barangList.add(new Barang("Buavita", 7000.0, 2));
        barangList.add(new Barang("Aqua", 3000.0, 1));

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("barang.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Barang barang : barangList) {
                objectOutputStream.writeObject(barang);
            }

            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object Barang.java telah tertulis menjadi file.");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
