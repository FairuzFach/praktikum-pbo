/*
	ExceptionOnArray.java  30/03/2023
    Nama / NIM    : Fairuz Fachrizal Adyatma / 24060121140121
	Deskripsi     : Program penggunaan eksepsi menggunakan class library Java
*/

public class ExceptionOnArray {
    public static void main (String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
