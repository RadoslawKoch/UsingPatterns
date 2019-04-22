package webapp.application.impl.builder;

import webapp.application.abstr.builder.WebAppBaseBuilder;
import webapp.application.impl.WebAppVideo;

public class WebAppVideoBuilder 
        extends WebAppBaseBuilder<WebAppVideo>{
    
    public WebAppVideoBuilder() {
        super(WebAppVideo.class);
    }
    
}
