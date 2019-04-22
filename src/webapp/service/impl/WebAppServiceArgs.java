package webapp.service.impl;

import webapp.service.definition.WebAppRequestType;
import webapp.service.definition.WebAppServiceArgsDefinition;

public class WebAppServiceArgs 
        implements WebAppServiceArgsDefinition{

    private String userName;
    private WebAppRequestType requestType;
    private Integer numericData;
    private String data;

    public WebAppServiceArgs() {}

    public WebAppServiceArgs(String userName, WebAppRequestType requestType, Integer numericData, String data) {
        this.userName = userName;
        this.requestType = requestType;
        this.numericData = numericData;
        this.data = data;
    }
    
    @Override
    public String getUserName() {
       return this.userName;
    }

    @Override
    public void setUserName(String name) {
        this.userName = name;
    }

    @Override
    public WebAppRequestType getRequestType() {
       return this.requestType;
    }

    @Override
    public void setRequestType(WebAppRequestType type) {
        this.requestType = type;
    }

    @Override
    public Integer getNumericData() {
       return this.numericData;
    }

    @Override
    public void setNumericData(Integer number) {
        this.numericData = number;
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }
    
}
