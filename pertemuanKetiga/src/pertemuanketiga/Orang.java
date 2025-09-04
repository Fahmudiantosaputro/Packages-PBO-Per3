/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author mursi
 */
public abstract class Orang {
    String nama;   // nama orang
    int umur;      // umur orang

    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // metode abstrak yang harus dioverride oleh anaknya
    public abstract void info();
}
