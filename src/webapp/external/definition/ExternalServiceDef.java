package webapp.external.definition;

public interface ExternalServiceDef {
    
    RequestDataDef send(RequestDataDef args);
    boolean getState();
    boolean changeState();
    String getServiceName();
    String getServiceUri();
}
