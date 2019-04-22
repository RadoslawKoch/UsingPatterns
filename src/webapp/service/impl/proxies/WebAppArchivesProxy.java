package webapp.service.impl.proxies;

import webapp.service.impl.WebAppArchivesService;
import webapp.service.abstr.WebAppServiceBaseProxy;

public class WebAppArchivesProxy extends WebAppServiceBaseProxy{

    public WebAppArchivesProxy() {
        super("WebApp Archives", "", "");
    }

    @Override
    public void createInstance(){
        if(this.service==null){
            this.service = new WebAppArchivesService();
        } 
    }    
}
