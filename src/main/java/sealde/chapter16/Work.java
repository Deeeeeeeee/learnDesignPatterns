package sealde.chapter16;

/**
 * Created by sealde on 8/15/17.
 */
public class Work {
    private State current;
    private double hour;
    private boolean finished;

    public Work() {
        this.current = new ForenoonState();
    }

    public State getState() {
        return current;
    }

    public void setState(State current) {
        this.current = current;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void writeProgram() {
        this.current.writeProgram(this);
    }
}
