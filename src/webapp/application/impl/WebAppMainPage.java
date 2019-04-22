package webapp.application.impl;

import webapp.application.abstr.WebAppBaseContainer;
import java.time.LocalDateTime;
import webapp.application.definition.WebAppArgsDefinition;

public class WebAppMainPage 
        extends WebAppBaseContainer{

    public WebAppMainPage() {
        super("WebApp Main Page", null, "WebApp Main Page","", LocalDateTime.now(), "");
    }

    @Override//PROVIDING COSTOMIZE RUN METHOD
    public void run(WebAppArgsDefinition args) {
        this.isRunning = true;
        this.appThread = new Thread(()->{
            
            long start = System.nanoTime();//START TIME
            
            //POSSIBLE TO USE CALLBACK FUNCTIONS TO COMMUNICATE WITH RUNNING APP
                                            
            StringBuilder data = new StringBuilder();
            list.getAllAps().forEach((x) -> {
                        data.append("|  ")
                        .append(x.getId())
                        .append(" |  ");
            });
            data.append("\n\n\n\t\t      Searcher ")
                    .append("\n\t\t __________________")
                    .append("\n\t\t|__________________|\n\t\t      [SEARCH]\n\n\n\n")
                    .append("\n________________________________________________________")
                    .append("\nInformations about application:")
                    .append("\n1) List of sub-applications with status");
            list.getAllAps().forEach((x) -> {
                        data.append("\n - ")
                        .append(x.getId())
                        .append(" | ")
                        .append((x.isRunning()? "active" : "inactive"));
            });
            data.append("\n2) List of services with status");
            services.getAllAps().stream().map((x) -> {
                x.turnOn();
                return x;
            }).forEachOrdered((x) -> {
                        data.append("\n - ")
                        .append(x.getId())
                        .append(" | ")
                        .append((x.isServiceUp()? "up" : "down"));
            });
            data.append("\n3) Is Main Application correctly started? : ")
                    .append(this.isRunning);  
            long end = System.nanoTime();//END TIME
            data.append("\n4) Main Application started in ")
                    .append((end-start)/1_000_000)
                    .append(" ms");
                    System.out.println(data.toString());
       });
       this.appThread.start();
    }
    
}
