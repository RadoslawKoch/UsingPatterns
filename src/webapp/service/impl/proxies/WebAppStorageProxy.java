package webapp.service.impl.proxies;

import webapp.service.impl.WebAppStorageService;
import webapp.service.abstr.WebAppServiceBaseProxy;

public class WebAppStorageProxy extends WebAppServiceBaseProxy{

    public WebAppStorageProxy() {
        super("WebApp Storage", "", "");
    }

    @Override
    public void createInstance(){
        if(this.service==null){
            this.service = new WebAppStorageService();
        }        
    }   
}
