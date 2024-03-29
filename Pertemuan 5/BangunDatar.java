/**
* File		    : BangunDatar.java 28-03-2023
* Nama / NIM	: Fairuz Fachrizal Adyatma / 24060121140121
* Deskripsi	    : Kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}
