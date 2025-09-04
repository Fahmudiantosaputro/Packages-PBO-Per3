/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author mursi
 */
public class Mahasiswa extends CivitasAkademik implements Belajar {

    String jurusan;   // jurusan mahasiswa

    public Mahasiswa(String nama, int umur, String idKampus, String jurusan) {
        super(nama, umur, idKampus);
        this.jurusan = jurusan;
    }

    // Implementasi metode interface Belajar
    
    public void belajar() {
        System.out.println(nama + " sedang menempuh pendidikan S1 di jurusan " + jurusan);
    }

    // Overloading (metode belajar dengan parameter berbeda)
    public void belajar(String mataKuliah) {
        System.out.println(nama + " sedang belajar mata kuliah " + mataKuliah);
    }

    // Override dari Orang
    
    public void info() {
        System.out.println("Nama Mahasiswa: " + nama + ", Umur: " + umur + ", Nim: " + idKampus + ", Jurusan: " + jurusan);
    }
}
