package webapp.application.impl.proxies;

import webapp.application.impl.builder.WebAppMailBuilder;
import webapp.application.abstr.builder.WebAppBaseBuilder;
import webapp.application.abstr.WebAppBaseProxy;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTIG PROXY PATTERN
public class WebAppMailProxy 
        extends WebAppBaseProxy{

    public WebAppMailProxy() {
        super("Mail", "", "");
    }

    @Override
    protected WebAppDefinition generate() throws Exception {
       WebAppBaseBuilder<?> builder = new WebAppMailBuilder();
       return builder.addService(this.repo.get("WebApp Ads"))
               .addService(this.repo.get("WebApp Storage"))
               .addService(this.repo.get("WebApp Archives"))
               .build();
    }


    
}
