/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author mursi
 */
public abstract class CivitasAkademik extends Orang {
    String idKampus;   // ID khusus civitas kampus

    public CivitasAkademik(String nama, int umur, String idKampus) {
        super(nama, umur);
        this.idKampus = idKampus;
    }
}
