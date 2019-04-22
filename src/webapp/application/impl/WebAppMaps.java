package webapp.application.impl;

import webapp.application.abstr.WebAppBase;
import java.time.LocalDateTime;

public class WebAppMaps 
        extends WebAppBase{

    public WebAppMaps() {
        super("Maps", null, "Maps", "", LocalDateTime.now(), "");
    }
    //POSSIBLE TO OVERRIDE RUN METHOD AND PERFORM CUSTOMIZE ACTIONS
    
    
}
