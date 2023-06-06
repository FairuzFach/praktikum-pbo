/**
 * File      : BangunDatarGeneric.java
 * Penulis   : Fairuz Fachrizal Adyatma / 24060121140121
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 *
 */

 public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}


/* 
public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1 get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

*/

/*
Pertanyaan:
Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !

Walaupun tidak bermasalah dan tidak ada perubahan pada kode, kode ini masih berfungsi dengan baik
Hanya saja penggunaan huruf T daripada T1 atau yang lainnya kita pakai karena ada konvensi penamaan yang telah ditetapkan
Sehingga penggunaan huruf T lebih general

 */