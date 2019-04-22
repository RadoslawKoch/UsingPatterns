package webapp.application.impl;

import webapp.application.abstr.WebAppBase;
import java.time.LocalDateTime;

public class WebAppVideo 
        extends WebAppBase{

    public WebAppVideo() {
        super("Video", null, "Video","", LocalDateTime.now(), "");
    }
    
    //POSSIBLE TO OVERRIDE RUN METHOD AND PERFORM CUSTOMIZE ACTIONS
    
    
    
    
}
