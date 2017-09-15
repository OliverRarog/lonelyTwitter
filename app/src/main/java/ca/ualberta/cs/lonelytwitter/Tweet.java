package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by rarog on 9/14/17.
 */

public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<MoodAbstractClass> moodList;

    public Tweet(String message) {
        this.message = message;
        date = new Date();
        moodList = new ArrayList<MoodAbstractClass>();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
        moodList = new ArrayList<MoodAbstractClass>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 140) {
            throw new TweetTooLongException();
        }
        else {
            this.message = message;
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract boolean isImportant();

    public void addMood(MoodAbstractClass mood) {
        moodList.add(mood);
    }

    public ArrayList<MoodAbstractClass> getMoodList() {
        return moodList;
    }


}
