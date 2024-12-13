public class StepTracker{
    StepTracker tr = new StepTracker(10000);
    int active = 0;
    int days = 0;
    double totalSteps = 0;
    int activeSteps;
    
    public StepTracker(int numSteps){
        activeSteps = numSteps;
    }
    
    public void addActiveDay(int steps){
        if (steps >= activeSteps){
            active++;
        }
    }
    
    public int activeDays(){
        return active;
    }
    
    public void addDailySteps(int steps){
        addActiveDays(steps);
        totalSteps += steps;
        days++;
    }
    
    public double averageSteps(){
        return totalSteps / days;
    }
    
    tr.activeDays();
    tr.averageSteps();
    tr.addDailySteps(9000);
    tr.addDailySteps(5000);
    tr.activeDays();
    tr.averageSteps();
    tr.addDailySteps(13000);
    tr.activeDays();
    tr.averageSteps();
    tr.addDailySteps(23000);
    tr.addDailySteps(1111);
    tr.activeDays();
    tr.averageSteps();
}