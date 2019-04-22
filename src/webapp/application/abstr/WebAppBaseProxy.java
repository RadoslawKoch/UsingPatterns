package webapp.application.abstr;

import java.time.LocalDateTime;
import webapp.commun.impl.WebAppCollection;
import webapp.service.impl.repo.WebAppServiceRepository;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.application.definition.WebAppArgsDefinition;
import webapp.application.definition.WebAppGraphicsDefinition;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTIG PROXY PATTERN
public abstract class WebAppBaseProxy 
        implements WebAppDefinition{
    
    protected WebAppCollection<WebAppServiceDefinition,String> repo 
            = WebAppServiceRepository.getInstance();

    protected final boolean isRunning = false;
    protected final String id;
    protected final String  author;
    protected final LocalDateTime date = LocalDateTime.now();
    protected final String version;
    protected WebAppDefinition app;
    
    public WebAppBaseProxy(String id,String author,String version){
        this.id = id;
        this.author = author;
        this.version = version;
    }
    
    @Override
    public WebAppGraphicsDefinition renderGraphics() throws Exception{
        if(this.app==null){
            this.app = generate();
        }
        return this.app.renderGraphics();
    }

    @Override
    public void run(WebAppArgsDefinition args) throws Exception{
        if(this.app==null){
            this.app = generate();
        }
        this.app.run(args);
    }

    @Override
    public void stop() {
       if(this.app!=null){
           this.app.stop();
       }
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
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
    public void addService(WebAppServiceDefinition service) {
       if(this.app!=null){
           this.app.addService(service);
       }
    }

    @Override
    public void removeService(String name) {
       if(this.app!=null){
           this.app.removeService(name);
       }
    }     
    //METHOD PROPER TO PROXY
    protected abstract WebAppDefinition generate() throws Exception;
    
}
