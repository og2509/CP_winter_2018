package pl.waw.sgh;

public class TActivity {
    TActivity(String ActivityName, double ActivityGrade) {
        this.ActivityName = ActivityName;
        this.ActivityGrade = ActivityGrade;
    }

    public void showActivityState() {
        System.out.println(" - " + this.ActivityName + " " + this.ActivityGrade);
        //   System.out.println(" - " + this.ActivityGrade);
    }

    public double getActivityGrade() {
        return ActivityGrade;
    }

    private String ActivityName;
    private double ActivityGrade;

}
