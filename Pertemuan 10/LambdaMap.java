/**
* File		: LambdaHashmap.java 04/06/2023
* Penulis	: Fairuz Fachrizal Adyatma / 24060121140121
* Deskripsi	: Implementasi lambda pada hash map
* Lab		: B1
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140121", "Fairuz");
        mahasiswaMap.put("24060121130121", "Fachrizal");
        mahasiswaMap.put( "24020222120121", "Adyatma" );

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama));
    }
}