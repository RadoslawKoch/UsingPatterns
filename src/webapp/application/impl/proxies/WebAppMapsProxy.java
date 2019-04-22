package webapp.application.impl.proxies;

import webapp.application.abstr.builder.WebAppBaseBuilder;
import webapp.application.impl.builder.WebAppMapsBuilder;
import webapp.application.abstr.WebAppBaseProxy;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTIG PROXY PATTERN
public class WebAppMapsProxy 
        extends WebAppBaseProxy{

    public WebAppMapsProxy() {
        super("Maps", "", "");
    }

    @Override
    protected WebAppDefinition generate() throws Exception {
       WebAppBaseBuilder<?> builder = new WebAppMapsBuilder();
       return builder.addService(this.repo.get("WebApp Geo"))
               .addService(this.repo.get("WebApp Ads"))
               .addService(this.repo.get("WebApp Analitics"))
               .build();
    }

}
