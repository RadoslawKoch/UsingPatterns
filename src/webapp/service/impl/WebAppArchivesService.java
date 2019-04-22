package webapp.service.impl;

import webapp.service.abstr.WebAppBaseService;
import java.time.LocalDateTime;

public class WebAppArchivesService 
        extends WebAppBaseService {

    public WebAppArchivesService() {
        super("WebApp Archives", "WebApp Archives", "", LocalDateTime.now(), "");
    }
}
