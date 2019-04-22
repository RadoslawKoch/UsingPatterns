package webapp.application.impl;

import java.time.LocalDateTime;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.application.definition.WebAppArgsDefinition;
import webapp.application.definition.WebAppGraphicsDefinition;
import webapp.application.definition.WebAppDefinition;

//IMPLEMENTIG DECORATOR PATTERN
public class WebAppNotifyDecorator 
        implements WebAppDefinition{

    private final WebAppDefinition app;

    public WebAppNotifyDecorator(WebAppDefinition app) {
        this.app = app;
    }

    @Override
    public WebAppGraphicsDefinition renderGraphics() throws Exception {
        notif();
        return this.app.renderGraphics();
    }

    @Override
    public void run(WebAppArgsDefinition args) throws Exception {
        notif();
        this.app.run(args);
    }

    @Override
    public void stop() {
        notif();
        this.app.stop();
    }

    @Override
    public boolean isRunning() {
        notif();
        return this.app.isRunning();
    }

    @Override
    public String getId() {
        notif();
        return this.app.getId();
    }
    
    //ADDED LOGIC
    private void notif(){
        System.out.println(new StringBuilder("Notify from ")
                .append(this.getClass().getSimpleName())
                .toString());
    }

    @Override
    public String getApplicationName() {
        return this.app.getApplicationName();
    }

    @Override
    public String getAuthorName() {
        return this.app.getAuthorName();
    }

    @Override
    public LocalDateTime getCreationTime() {
        return this.app.getCreationTime();
    }

    @Override
    public String getVersion() {
        return this.app.getVersion();
    }

    @Override
    public void addService(WebAppServiceDefinition service) {
       this.app.addService(service);
    }

    @Override
    public void removeService(String name) {
        this.app.removeService(name);
    }
    
}
