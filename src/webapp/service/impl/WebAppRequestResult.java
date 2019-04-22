package webapp.service.impl;

import webapp.service.definition.WebAppRequestResultDefinition;

public class WebAppRequestResult 
        implements WebAppRequestResultDefinition{

    private Integer statusCode;
    private Integer numericData;
    private String data;

    public WebAppRequestResult() {} 

    public WebAppRequestResult(Integer statusCode, Integer numericData, String data) {
        this.statusCode = statusCode;
        this.numericData = numericData;
        this.data = data;
    }
    
    @Override
    public Integer getStatusCode() {
        return this.statusCode;
    }

    @Override
    public void setStatusCode(Integer number) {
        this.statusCode = number;
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setData(String data) {
       this.data = data;
    }

    @Override
    public Integer getNumericData() {
        return this.numericData;
    }

    @Override
    public void setNumericData(Integer number) {
       this.numericData = number;
    }
    
}
