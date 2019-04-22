package webapp.service.definition;

public interface WebAppRequestResultDefinition {
    
    Integer getStatusCode();
    void setStatusCode(Integer number);
    String getData();
    void setData(String data);
    Integer getNumericData();
    void setNumericData(Integer number);
}
