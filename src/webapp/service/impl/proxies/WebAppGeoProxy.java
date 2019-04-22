package webapp.service.impl.proxies;

import webapp.service.impl.WebAppGeoService;
import webapp.service.abstr.WebAppServiceBaseProxy;

public class WebAppGeoProxy extends WebAppServiceBaseProxy{

    public WebAppGeoProxy() {
        super("WebApp Geo", "", "");
    }

    @Override
    public void createInstance(){
        if(this.service==null){
            this.service = new WebAppGeoService();
        }       
    }  
}
