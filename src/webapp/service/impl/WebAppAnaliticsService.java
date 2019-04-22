package webapp.service.impl;

import webapp.service.abstr.WebAppBaseService;
import java.time.LocalDateTime;

public class WebAppAnaliticsService 
        extends WebAppBaseService {

    public WebAppAnaliticsService() {
        super("WebApp Analitics", "WebApp Analitics", "", LocalDateTime.now(), "");
    }
}
