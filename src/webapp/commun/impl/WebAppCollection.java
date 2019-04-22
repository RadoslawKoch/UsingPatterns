package webapp.commun.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import webapp.commun.definition.WebAppCollectionDefinition;
import webapp.application.definition.WebAppIdDefinition;

//USING GENERIC TYPES
public class WebAppCollection<T extends WebAppIdDefinition<I>,I> 
        implements WebAppCollectionDefinition<T,I>{
    
    private final Map<I,T> apps = new HashMap();
    private final List<I> names = new ArrayList();

    @Override
    public List<T> getAllAps() {
        List<T> list = new ArrayList();
        names.forEach((x) -> {
            list.add(apps.get(x));
        });
        return list;
    }

    @Override
    public T get(I id) { 
       return this.apps.get(id);
    }

    @Override
    public void add(T app) {
       this.apps.put(app.getId(),app);
       this.names.add(app.getId());
    }

    @Override
    public void delete(I name) {
       this.apps.remove(name);
       this.names.remove(name);
    }

    @Override
    public String toString() {
        return new StringBuilder("WebAppCollection{apps=").append(apps).toString();
    }
    
    


}
