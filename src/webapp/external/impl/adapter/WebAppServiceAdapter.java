
package webapp.external.impl.adapter;

import webapp.external.definition.Request;
import webapp.external.impl.RequestData;
import webapp.external.definition.RequestDataDef;
import webapp.service.definition.WebAppRequestType;
import webapp.service.impl.WebAppRequestResult;
import java.time.LocalDateTime;
import webapp.service.definition.WebAppRequestResultDefinition;
import webapp.service.definition.WebAppServiceDefinition;
import webapp.service.definition.WebAppServiceArgsDefinition;
import webapp.external.definition.ExternalServiceDef;


//IMPLEMENTIG ADAPTER PATTERN
public class WebAppServiceAdapter 
        implements WebAppServiceDefinition{
    
    private final ExternalServiceDef service;

    public WebAppServiceAdapter(ExternalServiceDef service) {
        this.service = service;
    }

    @Override
    public WebAppRequestResultDefinition performRequest(WebAppServiceArgsDefinition args) {
        return mapResult(this.service.send(mapInput(args)));
    }
    
    private RequestData mapInput(WebAppServiceArgsDefinition args){
        RequestData data = new RequestData();
        Object[]tab = new Object[2];
        tab[0]=args.getData();
        tab[1]=args.getNumericData();
        data.setData(tab);
        data.setRequest(mapType(args.getRequestType()));
        return data;
    }
    
    private Request mapType(WebAppRequestType request){
        switch(request){
            case PUT:
                return Request.PUT;
            case POST:
                return Request.POST;
            case PATCH:
                return Request.PUT;
            case GET:
                return Request.GET; 
            case DEFAULT:
                return Request.GET;
        }
        return null;
    }
    
    private WebAppRequestResultDefinition mapResult(RequestDataDef input){
        WebAppRequestResultDefinition def = new WebAppRequestResult();
        if(input.getData().getClass().isPrimitive()){
            def.setNumericData(Integer.parseInt(input.getData().toString()));
        }else{
            def.setData(input.getData().toString());
        }
        def.setStatusCode(input.getStatus());
        return def;
    }
   
    @Override
    public boolean isServiceUp() {
       return this.service.getState();
    }

    @Override
    public void turnOn() {
        if(!this.service.getState()){
            this.service.changeState();
        }
    }

    @Override
    public void turnOff() {
        if(this.service.getState()){
            this.service.changeState();
        }
    }

    @Override
    public String getId() {
        return this.service.getServiceName();
    }

    @Override
    public String getApplicationName() {
       return this.service.getServiceName();
    }

    @Override
    public String getAuthorName() {
        return "";
    }

    @Override
    public LocalDateTime getCreationTime() {
        return LocalDateTime.now();
    }

    @Override
    public String getVersion() {
        return "";
    }
    
}
