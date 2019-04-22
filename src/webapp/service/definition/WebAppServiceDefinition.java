package webapp.service.definition;

import webapp.commun.definition.WebAppDataDefinition;
import webapp.application.definition.WebAppIdDefinition;

public interface WebAppServiceDefinition 
        extends WebAppIdDefinition<String>,
        WebAppDataDefinition{
    
    WebAppRequestResultDefinition performRequest(WebAppServiceArgsDefinition args);
    boolean isServiceUp();
    void turnOn();
    void turnOff();
}
