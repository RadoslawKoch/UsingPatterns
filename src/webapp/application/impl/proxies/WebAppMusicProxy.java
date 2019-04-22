package webapp.application.impl.proxies;

import webapp.application.abstr.builder.WebAppBaseBuilder;
import webapp.application.impl.builder.WebAppMusicBuilder;
import webapp.application.abstr.WebAppBaseProxy;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTIG PROXY PATTERN
public class WebAppMusicProxy 
        extends WebAppBaseProxy{



    public WebAppMusicProxy() {
        super("Music", "", "");
    }

    @Override
    protected WebAppDefinition generate() throws Exception {
       WebAppBaseBuilder<?> builder = new WebAppMusicBuilder();
       return builder.addService(this.repo.get("WebApp Ads"))
               .addService(this.repo.get("WebApp Analitics"))
               .addService(this.repo.get("WebApp Archives"))
               .build();
    }

    
}
