package webapp.service.impl;

import webapp.service.abstr.WebAppBaseService;
import java.time.LocalDateTime;

public class WebAppAdsService 
        extends WebAppBaseService {

    public WebAppAdsService() {
        super("WebApp Ads", "WebApp Ads", "", LocalDateTime.now(), "");
    }
}
