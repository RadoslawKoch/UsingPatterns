package webapp.application.impl.proxies;

import webapp.application.abstr.builder.WebAppBaseBuilder;
import webapp.application.impl.builder.WebAppImagesBuilder;
import webapp.application.abstr.WebAppBaseProxy;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTIG PROXY PATTERN
public class WebAppImagesProxy 
        extends WebAppBaseProxy{

    public WebAppImagesProxy() {
        super("Images", "", "");
    }

    @Override
    protected WebAppDefinition generate() throws Exception {
        WebAppBaseBuilder builder = new WebAppImagesBuilder();
        return builder.addService(this.repo.get("WebApp Analitics"))
                .addService(this.repo.get("WebApp Storage"))
                .addService(this.repo.get("WebApp Archives"))
                .build();
    }

    
}
