package webapp.external.definition;

public interface RequestDataDef {
    
    Request getRequest();
    void setRequest(Request request);
    Object getData();
    void setData(Object obj);
    Integer getStatus();
}
