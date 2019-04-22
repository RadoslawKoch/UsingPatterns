package webapp.application.impl;

import webapp.application.abstr.WebAppBase;
import java.time.LocalDateTime;

public class WebAppMail 
        extends WebAppBase{
    
    public WebAppMail() {
        super("Mail", null, "Mail", "", LocalDateTime.now(),"");
    }
    //POSSIBLE TO OVERRIDE RUN METHOD AND PERFORM CUSTOMIZE ACTIONS
    
    
}
