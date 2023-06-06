/**
 * File      : Lingkaran.java
 * Penulis   : Fairuz Fachrizal Adyatma / 24060121140121
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 *
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
    
}
