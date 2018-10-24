package pl.waw.sgh;

public class TActivity {
    TActivity(String ActivityName) {
        this.ActivityName = ActivityName;
    }

    public void showActivityState() {
        System.out.println(this.ActivityName);
    }

    private String ActivityName;

}
