class Titik {
	Double absis;
	Double ordinat;
	static Double counterTitik;

	void Titik(){}
	void setAbsis(Double a){
		absis = a;
	}
	
	void setOrdinat(Double o){
		ordinat = o;
	}
	
	Double getAbsis(){
		return absis;
	}
	
	Double getOrdinat(){
		return ordinat;
	}
	static Double getCounterTItik(){
		return counterTitik;
	}
}