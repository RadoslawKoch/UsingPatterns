package webapp.external.abstr;

import webapp.external.definition.ExternalServiceDef;
import webapp.external.definition.RequestDataDef;

public abstract class ExternalBaseService 
        implements ExternalServiceDef{

    protected final String name;
    protected boolean state = false;
    protected final String uri;

    public ExternalBaseService(String name, String uri) {
        this.name = name;
        this.uri = uri;
    }
        
    @Override
    public abstract RequestDataDef send(RequestDataDef args);

    @Override
    public boolean getState() {
       return this.state;
    }

    @Override
    public boolean changeState() {
        this.state = !this.state;
        return this.state;
    }

    @Override
    public String getServiceName() {
       return this.name;
    }

    @Override
    public String getServiceUri() {
        return this.uri;
    }
    
}
