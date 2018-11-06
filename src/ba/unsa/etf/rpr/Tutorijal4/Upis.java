package ba.unsa.etf.rpr.Tutorijal4;

public class Upis {
    PlanStudija plan;
    Student student;
    Predmet predmet;

    public Upis(PlanStudija plan, Student student, Predmet predmet) {
        this.plan = plan;
        this.student = student;
        this.predmet = predmet;
    }
    public void setPlan(PlanStudija plan) {
        this.plan = plan;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public PlanStudija getPlan() {
        return plan;
    }

    public Student getStudent() {
        return student;
    }

    public Predmet getPredmet() {
        return predmet;
    }
}
