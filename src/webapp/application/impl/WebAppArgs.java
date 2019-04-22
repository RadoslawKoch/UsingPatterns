package webapp.application.impl;

import webapp.application.definition.WebAppArgsDefinition;

public class WebAppArgs 
        implements WebAppArgsDefinition{

    private String source = "";
    private String ip = "0.0.0.0";
    private String userName = "";
    
    @Override
    public String getSource() {
        return this.source;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String getIp() {
       return this.ip;
    }

    @Override
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public void setUserName(String name) {
        this.userName = name;
    }
    
}
