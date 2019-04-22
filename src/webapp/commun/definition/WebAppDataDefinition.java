package webapp.commun.definition;

import java.time.LocalDateTime;

//IMPLEMENTING PRIVATE DATA CLASS
public interface WebAppDataDefinition {
    
    String getApplicationName();
    String getAuthorName();
    LocalDateTime getCreationTime();
    String getVersion();
}
