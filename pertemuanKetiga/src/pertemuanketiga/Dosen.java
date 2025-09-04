/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author mursi
 */
public class Dosen extends Pegawai implements Mengajar {

    String mataKuliah;   // mata kuliah yang diajarkan

    public Dosen(String nama, int umur, String jabatan, String mataKuliah) {
        super(nama, umur, jabatan);
        this.mataKuliah = mataKuliah;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar " + mataKuliah);
    }

    // Override dari Orang
    public void info() {
        System.out.println("Nama Dosen : " + nama + ", Umur : " + umur + ", Jabatan: " + jabatan + ", Mata Kuliah : " + mataKuliah);
    }
}
