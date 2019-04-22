package webapp.external.impl;

import webapp.external.definition.Request;
import webapp.external.definition.RequestDataDef;

public class RequestData 
        implements RequestDataDef{

    private Request type;
    private Object data;
    private Integer status;
    
    public RequestData() {}
    
    public RequestData(Request type, Object data, Integer status){
        this.type = type;
        this.data = data;
        this.status = status;
    }
    
    @Override
    public Request getRequest() {
        return this.type;
    }

    @Override
    public void setRequest(Request request) {
        this.type = request;
    }

    @Override
    public Object getData() {
       return this.data;
    }

    @Override
    public void setData(Object obj) {
       this.data = obj;
    }

    @Override
    public Integer getStatus() {
        return this.status;
    }


}
