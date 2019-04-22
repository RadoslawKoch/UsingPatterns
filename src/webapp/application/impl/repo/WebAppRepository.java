package webapp.application.impl.repo;

import webapp.application.impl.proxies.WebAppMailProxy;
import webapp.application.impl.proxies.WebAppImagesProxy;
import webapp.application.impl.proxies.WebAppMapsProxy;
import webapp.application.impl.proxies.WebAppMusicProxy;
import webapp.application.impl.proxies.WebAppVideoProxy;
import webapp.commun.impl.WebAppCollection;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTIG SINGLETON
public class WebAppRepository 
        extends WebAppCollection<WebAppDefinition,String>{
    
    private static final WebAppRepository REPO = new WebAppRepository();
    
    public static WebAppRepository getInstance(){
        return REPO;
    }

    private WebAppRepository(){
        this.add(new WebAppMailProxy());
        this.add(new WebAppImagesProxy());
        this.add(new WebAppMapsProxy());
        this.add(new WebAppMusicProxy());
        this.add(new WebAppVideoProxy());
    }
}
