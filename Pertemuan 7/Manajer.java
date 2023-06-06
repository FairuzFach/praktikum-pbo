/** 
* File      : Manajer.java
* Penulis   : Fairuz Fachrizal Adyatma / 24060121140121
* Deskripsi : Kelas yang berupa metode untuk menghitung gaji manajer
*
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
