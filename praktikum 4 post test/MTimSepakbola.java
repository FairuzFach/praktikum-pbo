/*
* File			: MTimSepakbola.java
* Penulis 		: Fairuz Fachrizal Adyatma
* Deskripsi 		: PBO post test
*/

class MTimSepakbola {
  public static void main(String[] args) {
	TimSepakbola liverpool = new TimSepakbola("Liverpool");
	TimSepakbola manchesterUnited = new TimSepakbola("Manchester United");
	liverpool.startTandingBola(manchesterUnited);

		// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
  		liverpool.goal();

			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + liverpool.nama + " " + liverpool.getSkor() + " - " + manchesterUnited.getSkor() + " " + manchesterUnited.nama);
    }

		// TODO: call endTandingBola()
	manchesterUnited.endTandingBola(liverpool);
  }
}

/* 
Expected output:

Pertandingan antara Liverpool dan Manchester United dimulai!

Skor sementara: Liverpool 1 - 0 Manchester United
Skor sementara: Liverpool 2 - 0 Manchester United
Skor sementara: Liverpool 3 - 0 Manchester United
Skor sementara: Liverpool 4 - 0 Manchester United
Skor sementara: Liverpool 5 - 0 Manchester United
Skor sementara: Liverpool 6 - 0 Manchester United
Skor sementara: Liverpool 7 - 0 Manchester United

Pertandingan antara Manchester United dan Liverpool selesai!
*/
