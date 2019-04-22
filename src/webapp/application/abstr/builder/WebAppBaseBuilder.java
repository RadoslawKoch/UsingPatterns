package webapp.application.abstr.builder;

import java.util.ArrayList;
import java.util.List;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTING BUILDER PATTERN
public abstract class WebAppBaseBuilder<T extends  WebAppDefinition> {
    
    protected List<WebAppServiceDefinition> tmp = new ArrayList();
    protected Class clToUse;
    
    protected WebAppBaseBuilder(Class<T> cl){
        this.clToUse = cl;
    }
    
    public WebAppBaseBuilder<T> addService(WebAppServiceDefinition service){
        this.tmp.add(service);
        return this;
    }
    
    public WebAppDefinition build() {
        try {
            //USING REFLECTION
            WebAppDefinition app =
                    (WebAppDefinition)
                    clToUse.getConstructors()[0].newInstance();
            this.tmp.forEach((x) -> {
                app.addService(x);
            });
            return app;
        }catch (Exception ex) {
            System.out.println(ex);
            return null;
        }      
    }
    
}
