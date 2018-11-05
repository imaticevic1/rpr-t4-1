package ba.unsa.etf.rpr.Tutorijal4;

public class DiplomiraniStudent extends Student {
    int godDiplom;

    public DiplomiraniStudent(String ime, String prezime, int brojIndeksa, int godDiplom) {
        super(ime, prezime, brojIndeksa);
        this.godDiplom = godDiplom;
    }

    public int getGodDiplom() {
        return godDiplom;
    }

    public void setGodDiplom(int godDiplom) {
        this.godDiplom = godDiplom;
    }
}
