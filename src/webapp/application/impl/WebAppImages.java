package webapp.application.impl;

import webapp.application.abstr.WebAppBase;
import java.time.LocalDateTime;

public class WebAppImages 
        extends WebAppBase{
    
    public WebAppImages() {
        super("Images", null, "Images", "", LocalDateTime.now(), "");
    }
    
    //POSSIBLE TO OVERRIDE RUN METHOD AND PERFORM CUSTOMIZE ACTIONS
    
}
