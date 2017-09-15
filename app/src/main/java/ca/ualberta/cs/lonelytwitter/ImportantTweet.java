package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rarog on 9/14/17.
 */

public class ImportantTweet extends Tweet{
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    public boolean isImportant() {
        return true;
    }


}
