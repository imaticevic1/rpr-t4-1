package ba.unsa.etf.rpr.Tutorijal4;

public class PlanStudija  {
   private Map<int,Predmet> mapaPredmeta;
   private PlanStudija(){
       mapaPredmeta = new Map<int,Predmet>();
   }
   public void dodajPredmet(int brSemestara, Predmet predmet){
       mapaPredmeta.put(brSemestara, predmet);
    }

}

