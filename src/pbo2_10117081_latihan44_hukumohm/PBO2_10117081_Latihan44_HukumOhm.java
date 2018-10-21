/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan44_hukumohm;

/**
 *
 * @author Geo Syah ALkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Menghitung dan memperlihatkan hasil perhitungan menggunakan
 *              hukum OHM
 */
public class PBO2_10117081_Latihan44_HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Baterai bat1 = new Baterai(3,12);

       System.out.println("Kuat Arus : "+bat1.getKuatArus()+" Ampere");
       System.out.println("Hambatan : "+bat1.getHambatan()+" Ohm");
       System.out.println("Hasil Tegangan : "+bat1.hitungTegangan()+" Volt");
    }
    
}
