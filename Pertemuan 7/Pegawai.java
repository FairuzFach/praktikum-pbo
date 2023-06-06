/** 
* File      : Pegawai.java
* Penulis   : Fairuz Fachrizal Adyatma / 24060121140121
* Deskripsi : Kelas yang berupa metode untuk menghitung gaji pegawai
*
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.printf("Nama : %s, Gaji pokok : %d \n", nama, gajiPokok);
    }
}
