package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rarog on 9/14/17.
 */

public abstract class Tweet {
    private String message;
    private Date date;

    public Tweet(String message) {
        this.message = message;
        date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
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

}
