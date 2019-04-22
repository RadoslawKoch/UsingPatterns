package webapp.application.impl;

import java.awt.Color;
import webapp.application.definition.WebAppGraphicsDefinition;

public class WebAppGraphics 
        implements WebAppGraphicsDefinition{

    private String data = "";
    private Color color = Color.BLACK;
    
    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setColor(Color color) {
       this.color = color;
    }
    
}
