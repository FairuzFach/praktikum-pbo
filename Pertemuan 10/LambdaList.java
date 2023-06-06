/**
 * File      : Lambdalist.java	04/06/2023
 * Penulis	 : Fairuz Fachrizal Adyatma / 24060121140121
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 *
 */

 import java.util.ArrayList;

 public class LambdaList {
     public static void main(String[] args) {
         ArrayList<String> mahasiswaList = new ArrayList<>();
         mahasiswaList.add("Fairuz");
         mahasiswaList.add("Fachrizal");
         mahasiswaList.add("Adyatma");
 
         mahasiswaList.forEach((nama) -> System.out.println(nama));
     }
 }