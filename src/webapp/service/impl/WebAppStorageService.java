package webapp.service.impl;

import webapp.service.abstr.WebAppBaseService;
import java.time.LocalDateTime;

public class WebAppStorageService 
        extends WebAppBaseService {

    public WebAppStorageService() {
        super("WebApp Storage", "WebApp Storage", "", LocalDateTime.now(), "");
    }
}
