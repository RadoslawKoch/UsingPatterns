package webapp.application.abstr.builder;

import java.util.ArrayList;
import java.util.List;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.application.definition.WebAppDefinition;
import webapp.application.definition.WebAppContainerDefinition;

//IMPLEMENTING BUILDER PATTERN
public abstract class WebAppContainerBaseBuilder<T extends WebAppDefinition> 
        extends WebAppBaseBuilder<T> {
    
    protected List<WebAppDefinition> apps = new ArrayList();

    protected WebAppContainerBaseBuilder(Class<T>cl) {
        super(cl);
    }
    
    public WebAppContainerBaseBuilder<T> addApplication(WebAppDefinition app){
        this.apps.add(app);
        return this;
    }
    
    @Override
    public WebAppContainerDefinition build(){
        try {
            //USING REFLECTION
            WebAppContainerDefinition app =
                    (WebAppContainerDefinition)
                    clToUse.getConstructors()[0].newInstance();
            this.tmp.forEach((x) -> {
                app.addService((WebAppServiceDefinition)x);
            });
            this.apps.forEach((x) -> {
                app.add(x);
            });
            return app;
        }catch (Exception ex) {
            return null;
        } 
    }
    
    
    
    
}
