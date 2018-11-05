package ba.unsa.etf.rpr.Tutorijal4;

public class Semestar {
    int brojPredmeta;
    Predmet[] predmeti;


    public Semestar(int brojPredmeta) {
        this.brojPredmeta = brojPredmeta;
    }

    public int getBrojPredmeta() {
        return brojPredmeta;
    }

    public Predmet[] getPredmeti() {
        return predmeti;
    }

    public void setBrojPredmeta(int brojPredmeta) {
        this.brojPredmeta = brojPredmeta;
    }

    public void setPredmeti(Predmet[] predmeti) {
        this.predmeti = predmeti;
    }
}
