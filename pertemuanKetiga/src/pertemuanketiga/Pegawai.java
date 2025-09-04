/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author mursi
 */
public abstract class Pegawai extends Orang {
    String jabatan;   // jabatan pegawai, contoh: Dosen, Staff

    public Pegawai(String nama, int umur, String jabatan) {
        super(nama, umur);
        this.jabatan = jabatan;
    }
}
