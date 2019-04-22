package webapp.application.impl.main;

import webapp.application.impl.builder.WebAppMainBuilder;
import webapp.application.impl.repo.WebAppRepository;
import webapp.commun.impl.WebAppCollection;
import webapp.external.impl.adapter.WebAppServiceAdapter;
import webapp.external.impl.ExternalMailService;
import webapp.service.impl.repo.WebAppServiceRepository;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.application.definition.WebAppDefinition;
import webapp.application.definition.WebAppContainerDefinition;

//IMPLEMENTIG FACADE PATTERN
public class WebAppMainPageFacade {
  
    private final WebAppCollection<WebAppDefinition,String> apps 
            = WebAppRepository.getInstance();
    private final WebAppCollection<WebAppServiceDefinition,String> services 
            = WebAppServiceRepository.getInstance();
    
    
    //DEFINING CONTENT OF MAIN APPLICATION AND STARTING IT
    public void start() throws Exception{
        WebAppContainerDefinition main = 
               (WebAppContainerDefinition) new WebAppMainBuilder()
               .addApplication(this.apps.get("Maps"))
               .addApplication(this.apps.get("Music"))
               .addApplication(this.apps.get("Video"))
               .addApplication(this.apps.get("Images"))
               .addApplication(this.apps.get("Mail"))
               .addService(this.services.get("WebApp Ads"))
               .addService(this.services.get("WebApp Storage"))
               .addService(this.services.get("WebApp Analitics"))
               .addService(new WebAppServiceAdapter(new ExternalMailService()))//USING ADAPTER
               .build();
        main.run(null);
    }
}
