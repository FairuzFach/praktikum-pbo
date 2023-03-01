class Titik{
    double absis;
    double ordinat;
    static int counterTitik;

    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }
    Titik(int x, int o){
        counterTitik++;
        absis = x;
        ordinat = o;
    }

    void setAbsis(double x){
        absis = x;
    }
    void setOrdinat(double o){
        ordinat = o;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    int getCounterTitik(){
        return counterTitik;
    }
}