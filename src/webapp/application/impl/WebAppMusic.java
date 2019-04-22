package webapp.application.impl;

import webapp.application.abstr.WebAppBase;
import java.time.LocalDateTime;

public class WebAppMusic 
        extends WebAppBase{
    
    public WebAppMusic() {
        super("Music", null, "Music", "", LocalDateTime.now(), "");
    }
    //POSSIBLE TO OVERRIDE RUN METHOD AND PERFORM CUSTOMIZE ACTIONS
}
