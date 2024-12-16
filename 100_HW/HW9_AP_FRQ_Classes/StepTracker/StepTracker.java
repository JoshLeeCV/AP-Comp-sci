public class StepTracker{
    int step;
    int days;
    int activedays;
    
        public StepTracker(int s){
            step = s;
    }
    
        public int activeDays(){
            return activeDay;
    }
    
        public double averageStep(){
            return (step/days)*1.0;
    }
    
        public void addDailyStep(int s){
            step = step +s;
            if (a>10000){
                activedays = activedays + 1;
            }
            days = days + 1;
        }
}