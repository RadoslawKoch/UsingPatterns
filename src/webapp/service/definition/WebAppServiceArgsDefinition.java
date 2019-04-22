package webapp.service.definition;

public interface WebAppServiceArgsDefinition {
    
    String getUserName();
    void setUserName(String name);
    WebAppRequestType getRequestType();
    void setRequestType(WebAppRequestType type);
    Integer getNumericData();
    void setNumericData(Integer number);
    String getData();
    void setData(String data);
}
