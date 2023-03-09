class Titik {
	public Double absis;
	public Double ordinat;
	private static int counterTitik;

	public Titik(){
		counterTitik++;
	}
	public void setAbsis(Double a){
		absis = a;
	}
	
	public void setOrdinat(Double o){
		ordinat = o;
	}
	
	public Double getAbsis(){
		return absis;
	}
	
	public Double getOrdinat(){
		return ordinat;
	}
	public static int getCounterTItik(){
		return counterTitik;
	}
}