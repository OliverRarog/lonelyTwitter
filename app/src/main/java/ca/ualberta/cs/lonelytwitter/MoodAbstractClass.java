package ca.ualberta.cs.lonelytwitter;

/**
 * Created by rarog on 9/14/17.
 */

import java.util.Date;

public abstract class MoodAbstractClass {
    private Date currentDate;
    private String mood;

    public abstract void setDate(Date date);

    public abstract Date getDate();
}
