package webapp.service.abstr;

import java.time.LocalDateTime;
import webapp.service.definition.WebAppRequestResultDefinition;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.service.definition.WebAppServiceArgsDefinition;

//IMPLEMENTIG PROXY PATTERN
public abstract class WebAppServiceBaseProxy 
        implements WebAppServiceDefinition{
 
    protected boolean isRunning = false;
    protected final String id;
    protected final String  author;
    protected final LocalDateTime date = LocalDateTime.now();
    protected final String version;
    protected WebAppServiceDefinition service;

    public WebAppServiceBaseProxy(String id, String version, String author) {
        this.id = id;
        this.version = version;
        this.author = author;
    }

    @Override
    public boolean isServiceUp() {
        return this.isRunning;
    }

    @Override
    public void turnOff() {
        if(this.service == null){
            this.service.turnOff();
            this.isRunning = false;
        }
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getApplicationName() {
        return this.id;
    }

    @Override
    public String getAuthorName() {
       return this.author;
    }

    @Override
    public LocalDateTime getCreationTime() {
       return this.date;
    }

    @Override
    public String getVersion() {
        return this.version;
    }
    
    @Override
    public WebAppRequestResultDefinition performRequest(WebAppServiceArgsDefinition args) {
       createInstance();
       return this.service.performRequest(args);
    }

    @Override
    public void turnOn() {
        createInstance();
        this.service.turnOn();
        this.isRunning = true;
    }
    
    public abstract void createInstance();
    
}
