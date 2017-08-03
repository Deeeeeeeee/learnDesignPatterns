package sealde.chapter8;

/**
 * Created by sealde on 8/4/17.
 */
public class VolunteerFactory implements Factory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
