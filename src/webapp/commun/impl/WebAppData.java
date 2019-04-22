package webapp.commun.impl;

import java.time.LocalDateTime;
import webapp.commun.definition.WebAppDataDefinition;

//IMPLEMENTING PRIVATE DATA CLASS
public class WebAppData 
        implements WebAppDataDefinition{
    
    private final String name;
    private final String author;
    private final LocalDateTime time;
    private final String version;

    public WebAppData(String name, String author, LocalDateTime time, String version) {
        this.name = name;
        this.author = author;
        this.time = time;
        this.version = version;
    }

    @Override
    public String getApplicationName() {
       return this.name;
    }

    @Override
    public String getAuthorName() {
        return this.author;
    }

    @Override
    public LocalDateTime getCreationTime() {
        return this.time;   
    }

    @Override
    public String getVersion() {
        return this.version;
    }
    
}
