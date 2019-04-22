package webapp.service.impl;

import webapp.service.abstr.WebAppBaseService;
import java.time.LocalDateTime;

public class WebAppGeoService 
        extends WebAppBaseService {

    public WebAppGeoService() {
        super("WebApp Geo", "WebApp Geo", "", LocalDateTime.now(), "");
    }
}
