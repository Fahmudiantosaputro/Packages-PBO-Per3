/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author mursi
 */
public class Staff extends Pegawai implements Bekerja {

    String bagian;   // bagian staff, contoh: Administrasi

    public Staff(String nama, int umur, String jabatan, String bagian) {
        super(nama, umur, jabatan);
        this.bagian = bagian;
    }

    
    public void bekerja() {
        System.out.println(nama + " bekerja di bagian " + bagian);
    }

    // Override dari Orang
    
    public void info() {
        System.out.println("Nama Staff: " + nama + ", Umur: " + umur + ", Jabatan: " + jabatan + ", Bagian: " + bagian);
    }
}
