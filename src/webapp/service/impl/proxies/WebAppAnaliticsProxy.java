package webapp.service.impl.proxies;

import webapp.service.impl.WebAppAnaliticsService;
import webapp.service.abstr.WebAppServiceBaseProxy;

public class WebAppAnaliticsProxy extends WebAppServiceBaseProxy{

    public WebAppAnaliticsProxy() {
        super("WebApp Analitics", "", "");
    }

    @Override
    public void createInstance(){
        if(this.service==null){
            this.service = new WebAppAnaliticsService();
        }       
    }
}
