package webapp.application.definition;

import webapp.service.definition.WebAppServiceDefinition;
import webapp.commun.definition.WebAppDataDefinition;

public interface WebAppDefinition 
        extends WebAppIdDefinition<String>,
        WebAppDataDefinition{
    
    WebAppGraphicsDefinition renderGraphics() throws Exception;
    void run(WebAppArgsDefinition args) throws Exception;
    void stop();
    boolean isRunning();
    void addService(WebAppServiceDefinition service);
    void removeService(String name);
    
}
