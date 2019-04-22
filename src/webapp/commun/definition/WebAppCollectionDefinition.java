package webapp.commun.definition;

import java.util.List;
import webapp.application.definition.WebAppIdDefinition;

//USING GENERIC TYPES
public interface WebAppCollectionDefinition<T extends WebAppIdDefinition<I>,I> {
    
    List<T> getAllAps();
    void add(T app);
    void delete(I name);
    T get(I name);
    
}
