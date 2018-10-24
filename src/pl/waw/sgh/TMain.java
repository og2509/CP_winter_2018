package pl.waw.sgh;

public class TMain {
    public static void main(String[] args) {
        TProcess myExams = new TProcess();
        myExams.addActivity(new TActivity("JAVA Programming"));
        myExams.addActivity(new TActivity("Statistical Methods"));
        myExams.addActivity(new TActivity("Business Intelligence"));

        myExams.showProcessState();
    }
}
