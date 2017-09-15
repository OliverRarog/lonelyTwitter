package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rarog on 9/14/17.
 */

public class MoodHappy extends MoodAbstractClass {
    private Date currentDate;
    private String mood;

    public MoodHappy() {
        currentDate = new Date();
    }

    public MoodHappy(Date initialDate) {
        currentDate = initialDate;
    }

    public void setDate(Date date) {
        currentDate = date;
    }

    public Date getDate() {
        return currentDate;
    }
}
