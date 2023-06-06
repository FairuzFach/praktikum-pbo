/*
	AngkaSialException.java  30/03/2023
    Nama / NIM    : Fairuz Fachrizal Adyatma / 24060121140121
	Deskripsi     : Eksepsi buatan sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super ("ANGKA 13 SIAL! JANGAN DIMASUKKAN !!!");
    }
}