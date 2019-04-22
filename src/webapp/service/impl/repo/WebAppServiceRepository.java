package webapp.service.impl.repo;

import webapp.commun.impl.WebAppCollection;
import java.util.HashMap;
import java.util.Map;
import webapp.service.definition.WebAppServiceDefinition;

//IMPLEMENTIG FLYWEIGHT
//IMPLEMENTING SINGLETON
public class WebAppServiceRepository 
        extends WebAppCollection<WebAppServiceDefinition,String>{
    
    private final Map<String,WebAppServiceDefinition> pool = new HashMap();//FLYWEIGHT
    private static final WebAppServiceRepository REPO = new WebAppServiceRepository();//SINGLETON
    
    private WebAppServiceRepository(){}//SINGLETON
    
    public static WebAppServiceRepository getInstance(){//SINGLETON
        return REPO;
    }

    @Override
    public WebAppServiceDefinition get(String id) {      
        WebAppServiceDefinition def = pool.get(id);
        if(def==null){
                      //USING REFLECTION AND PROXY      
            String[]tab = id.split(" ");
            try {
                def = (WebAppServiceDefinition)Class.forName(
                        new StringBuilder("webapp.service.impl.proxies.")
                                .append(tab[0])
                                .append(tab[1])
                                .append("Proxy")
                                .toString())
                        .newInstance();
            } catch (Exception ex) {
                System.out.println(ex);
                return null;
            }
            this.pool.put(id, def);
        }
        return def;   
    }   
}
