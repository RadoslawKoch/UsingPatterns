package webapp.application.abstr;

import webapp.commun.impl.WebAppCollection;
import java.util.List;
import java.time.LocalDateTime;
import webapp.application.definition.WebAppArgsDefinition;
import webapp.application.definition.WebAppGraphicsDefinition;
import webapp.application.definition.WebAppDefinition;
import webapp.application.definition.WebAppContainerDefinition;


//IMPLEMENTIG COMPOSITE PATTERN
public abstract class WebAppBaseContainer 
        extends WebAppBase 
        implements WebAppContainerDefinition{
      
    protected WebAppCollection<WebAppDefinition, String> list //COMPOSITE
            = new WebAppCollection<>();

    public WebAppBaseContainer(String appId, 
            WebAppGraphicsDefinition graphics, 
            String name, 
            String author, 
            LocalDateTime time, 
            String version) {
        super(appId, graphics, name, author, time, version);
    }

    @Override
    public List<WebAppDefinition> getAllAps() {
        return this.list.getAllAps();
    }

    @Override
    public WebAppDefinition get(String name) {
       return this.list.get(name);
    }

    @Override
    public void add(WebAppDefinition app) {
       this.list.add(app);
    }

    @Override
    public void delete(String name) {
       this.list.delete(name);
    }

    @Override
    public void startApplication(String appName, WebAppArgsDefinition args) 
            throws Exception {
       if(!this.isRunning){
           throw new Exception(new StringBuilder("Main application ")
                   .append(this.appId)
                   .append(" is not started!")
                   .toString());
       }
       WebAppDefinition tmp = this.list.get(appName);
       if(tmp==null){
           throw new Exception("Application is not avaliable!");
       }
       tmp.run(args);
    }
    
}
