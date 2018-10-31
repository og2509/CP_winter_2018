package pl.waw.sgh;

public class TMain {
    public static void main(String[] args) {
        TProcess myExams = new TProcess();
        myExams.addActivity
                (new TActivity("JAVA Programming", 5));
        myExams.addActivity
                (new TActivity("Statistical Methods", 4));
        myExams.addActivity
                (new TActivity("Business Intelligence", 5));
        myExams.addActivity
                (new TActivity("Big Data", 3));

        myExams.showProcessState();

    }
}
