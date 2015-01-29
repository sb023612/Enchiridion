package joshie.enchiridion.designer;

import java.util.ArrayList;

import joshie.enchiridion.designer.features.Feature;

import com.google.gson.annotations.Expose;

public class DesignerCanvas {
    @Expose
    public ArrayList<Feature> features = new ArrayList();

    //Draws all the features on the canvas
    public void draw(GuiDesigner gui, int x, int y) {
        for(Feature feature: features) {
            feature.draw(gui, x, y);
        }
    }

    public void clicked(int x, int y, boolean isEditMode) {
        for(Feature feature: features) {
            feature.click(x, y, isEditMode);
        }
    }
    
    public void release(int x, int y) {
        for(Feature feature: features) {
            feature.release(x, y);
        }
    }
    
    public void follow(int x, int y) {
        for(Feature feature: features) {
            feature.follow(x, y);
        }
    }
}
