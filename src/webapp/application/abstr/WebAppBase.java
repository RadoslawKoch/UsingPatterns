package webapp.application.abstr;

import webapp.commun.impl.WebAppCollection;
import webapp.commun.impl.WebAppData;
import webapp.service.impl.WebAppServiceArgs;
import java.time.LocalDateTime;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.commun.definition.WebAppDataDefinition;
import webapp.commun.definition.WebAppCollectionDefinition;
import webapp.application.definition.WebAppArgsDefinition;
import webapp.application.definition.WebAppGraphicsDefinition;
import webapp.application.definition.WebAppDefinition;

//USING PRIVATE DATA CLASS
//IMPLEMENTIG BRIDGE PATTERN 
public abstract class WebAppBase 
        implements WebAppDefinition{
    
    protected WebAppGraphicsDefinition graphics;
    protected WebAppArgsDefinition runArgs;
    protected boolean isRunning;  
    protected WebAppDataDefinition appData;//PRIVATE DATA CLASS
    protected String appId;
    protected Thread appThread;
    //BRIDGE PATTERN (Possible to switch to ConcreteProxy)
    protected WebAppCollectionDefinition<WebAppServiceDefinition,String> services = new WebAppCollection();
    
    public WebAppBase(
            String appId,
            WebAppGraphicsDefinition graphics,
            String name,
            String author, 
            LocalDateTime time, 
            String version) {
        this.graphics = graphics;
        this.runArgs = null;
        this.isRunning = false;
        this.appData = new WebAppData(name, author, time, version);
        this.appId = appId;
    }
 
    @Override
    public WebAppGraphicsDefinition renderGraphics() {
        return this.graphics;
    }

    @Override
    public void run(WebAppArgsDefinition args){
        this.appThread = new Thread(()->{
       
           System.out.println(new StringBuilder("Application ")
                   .append(this.appId)
                   .append(" is started.")
                   .toString());
           services.getAllAps().forEach((x) -> {
               System.out.println(new StringBuilder("REQUEST RESULT:")
                       .append(x.performRequest(new WebAppServiceArgs()))
                       .toString());
            });
       });
       this.appThread.start();
       this.isRunning = true;
    }
 
    @Override
    public void stop() {
        if(this.appThread!=null){
            this.appThread.interrupt();
            this.isRunning=false;
        }
    }

    @Override
    public String getId() {
        return this.appId;
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public String getApplicationName() {
        return this.appData.getApplicationName();
    }

    @Override
    public String getAuthorName() {
        return this.appData.getAuthorName();
    }

    @Override
    public LocalDateTime getCreationTime() {
        return this.appData.getCreationTime();
    }

    @Override
    public String getVersion() {
        return this.appData.getVersion();
    }
    
    @Override
    public void addService(WebAppServiceDefinition service) {
        this.services.add(service);
    }

    @Override
    public void removeService(String name) {
        this.services.delete(name);
    }

    
}
