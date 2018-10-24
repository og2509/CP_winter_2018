package pl.waw.sgh;
import java.util.ArrayList;

public class TProcess {
    TProcess() {

        ActivityList = new ArrayList<TActivity>();
    }

    public void addActivity(TActivity arg) {
        ActivityList.add(arg);
    }

    public void showProcessState() {
        for (TActivity TemporaryActivity : ActivityList) {
            TemporaryActivity.showActivityState();
        }
    }

    private ArrayList<TActivity> ActivityList;

}
