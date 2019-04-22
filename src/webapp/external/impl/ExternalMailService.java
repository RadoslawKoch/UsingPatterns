package webapp.external.impl;

import webapp.external.definition.Request;
import webapp.external.definition.RequestDataDef;
import webapp.external.abstr.ExternalBaseService;

public class ExternalMailService 
        extends ExternalBaseService{

    public ExternalMailService() {
        super("External Mail Service", "ext.smtp");
    }

    @Override
    public RequestDataDef send(RequestDataDef args) {
        StringBuilder builder = new StringBuilder("----------------\n");
        builder.append("REQUEST SENDING TO ---> ").append(this.name).append("\n")
                .append("USING URI --> ")
                .append(this.uri).append("\n")
                .append("REQUEST TYPE: ")
                .append(args.getRequest()).append("\n")
                .append("REQUEST ARGS: ").append(args.getData())
                .append("\n")
                .append("END OF REQUEST - STATUS CODE: 200");
        System.out.println(builder.toString());
        return new RequestData(Request.GET,null,200);
    }
    
}
