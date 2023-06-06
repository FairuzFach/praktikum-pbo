/*
	AngkaSial.java  30/03/2023
    Nama / NIM    : Fairuz Fachrizal Adyatma / 24060121140121
	Deskripsi     : program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+"Bukang Angka Sial");
    }


    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());;
            System.out.println("INVALID!!!");
        }
    }
}