package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public interface Tweetable {
    // Fix 3: Modifier 'public' is redundant for interface methods
    String getMessage();

    Date getDate();

}
