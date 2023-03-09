class MTitik {
		public static void main(String[] args) {
			Titik t1;
			Titik t2;
			t1 = new Titik();
			t2 = new Titik();
			
			t1.setAbsis(1.0);
			t1.setOrdinat(2.0);
			t2.setAbsis(4.0);
			t2.setOrdinat(9.0);
			
			System.out.println("=============================");
			System.out.println("Titik absis dan ordinat t1");
			System.out.println("t1.x = "+t1.absis);
			System.out.println("t1.y = "+ t1.ordinat);
			// System.out.println("t1.x = "+t1.getAbsis());
			// System.out.println("t1.y = "+ t1.getOrdinat());
			System.out.println("=============================");
			System.out.println("Titik absis dan ordinat t2");
			System.out.println("t2.x = "+t2.getAbsis());
			System.out.println("t2.y = "+ t2.getOrdinat());
			System.out.println("=============================");
			System.out.println("counter titik = "+ t1.getCounterTItik());

			OperasiTitik op = new OperasiTitik();
			op.refleksiSumbuX(t1);
			System.out.println("t1.x setelah refleksi X = " + t1.getAbsis());
			System.out.println("t1.y setelah refleksi X = " + t1.getOrdinat());
		}
}

