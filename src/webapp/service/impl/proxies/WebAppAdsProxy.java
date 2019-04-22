package webapp.service.impl.proxies;

import webapp.service.impl.WebAppAdsService;
import webapp.service.abstr.WebAppServiceBaseProxy;

public class WebAppAdsProxy extends WebAppServiceBaseProxy{

    public WebAppAdsProxy() {
        super("WebApp Ads", "", "");
    }

    @Override
    public void createInstance(){
        if(this.service==null){
            this.service = new WebAppAdsService();
        }    
    }
    
}
