/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author mursi
 */
public class Kampus {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("Fahmud", 19, "09030624071", "Sistem Iformasi");
        mhs.info();
        mhs.belajar();
        mhs.belajar("Pemrograman Berorientasi Obyek");  // contoh overloading

        System.out.println("----------------------");

        // Membuat objek Dosen
        Dosen dosen = new Dosen("Pak Andi", 40, "Dosen Tetap", "Basis Data");
        dosen.info();
        dosen.mengajar();

        System.out.println("----------------------");

        // Membuat objek Staff
        Staff staff = new Staff("Bu Siti", 35, "Staff", "Administrasi");
        staff.info();
        staff.bekerja();
    }
}

