package webapp.application.impl.builder;

import webapp.application.abstr.builder.WebAppContainerBaseBuilder;
import webapp.application.impl.WebAppMainPage;

public class WebAppMainBuilder 
        extends WebAppContainerBaseBuilder<WebAppMainPage>{
    
    public WebAppMainBuilder() {
        super(WebAppMainPage.class);
    }
    
}
