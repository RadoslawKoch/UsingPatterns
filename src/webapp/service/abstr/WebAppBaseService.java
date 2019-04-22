package webapp.service.abstr;

import webapp.commun.impl.WebAppData;
import java.time.LocalDateTime;
import webapp.service.impl.WebAppRequestResult;
import webapp.service.definition.WebAppRequestResultDefinition;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.service.definition.WebAppServiceArgsDefinition;
import webapp.commun.definition.WebAppDataDefinition;

//USING PRIVATE DATA CLASS
public abstract class WebAppBaseService 
        implements WebAppServiceDefinition{

    protected final String id;    
    protected final WebAppDataDefinition data;//PRIVATE DATA CLASS
    protected boolean state = false;
    
    public WebAppBaseService(String id,String name, String author, LocalDateTime time, String version) {
        this.id = id;
        this.data = new WebAppData(name,author,time,version);
    }
    
    @Override
    public WebAppRequestResultDefinition performRequest(WebAppServiceArgsDefinition args){
        System.out.println(new StringBuilder("Request of type ")
                .append(args.getRequestType())
                .append( " is exectuted throw ")
                .append(this.getApplicationName())
                .append(" service."));
        WebAppRequestResultDefinition def = new WebAppRequestResult();
        def.setData(this.getApplicationName());
        def.setStatusCode(200);
        def.setData("-----");
        return def;
    }  

    @Override
    public boolean isServiceUp() {
        return this.state;
    }

    @Override
    public void turnOn() {
       this.state = true;
    }

    @Override
    public void turnOff() {
        this.state = false;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getApplicationName() {
        return this.data.getApplicationName();
    }

    @Override
    public String getAuthorName() {
        return this.data.getAuthorName();
    }

    @Override
    public LocalDateTime getCreationTime() {
        return this.data.getCreationTime();
    }

    @Override
    public String getVersion() {
        return this.data.getApplicationName();
    }
    
}
