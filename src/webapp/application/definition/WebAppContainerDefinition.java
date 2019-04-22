package webapp.application.definition;

import webapp.commun.definition.WebAppCollectionDefinition;

public interface WebAppContainerDefinition 
        extends WebAppDefinition, 
        WebAppCollectionDefinition<WebAppDefinition, String>{
    
    void startApplication(String appName, WebAppArgsDefinition args) throws Exception;
    
}
