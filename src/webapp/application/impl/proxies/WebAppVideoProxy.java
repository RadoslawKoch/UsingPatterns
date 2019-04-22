package webapp.application.impl.proxies;

import webapp.application.abstr.builder.WebAppBaseBuilder;
import webapp.application.impl.builder.WebAppVideoBuilder;
import webapp.application.abstr.WebAppBaseProxy;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTIG PROXY PATTERN
public class WebAppVideoProxy 
        extends WebAppBaseProxy{
    
    public WebAppVideoProxy() {
        super("Video", "", "");
    }

    @Override
    protected WebAppDefinition generate() throws Exception {
        WebAppBaseBuilder<?> builder = new WebAppVideoBuilder();
        return builder.addService(this.repo.get("WebApp Ads"))
                .addService(this.repo.get("WebApp Storage"))
                .addService(this.repo.get("WebApp Archives"))
                .addService(this.repo.get("WebApp Geo"))
                .build();
    }

    
}
