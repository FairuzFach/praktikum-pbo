/**
 * File      : Segitiga.java
 * Penulis   : Fairuz Fachrizal Adyatma / 24060121140121
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 *
 */

 public class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi) {
        this.sisi = sisi;
    }
    public double hitungKeliling() {
        return sisi + sisi + sisi;
    }
}