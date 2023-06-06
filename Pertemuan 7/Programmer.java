/** 
* File      : Programmer.java
* Penulis   : Fairuz Fachrizal Adyatma / 24060121140121
* Deskripsi : Kelas yang berupa metode untuk menghitung gaji programmer
*
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("bonus : " + this.bonus);
    }
}