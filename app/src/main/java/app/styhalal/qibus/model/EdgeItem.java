package app.styhalal.qibus.model;

import app.styhalal.qibus.utils.menu.AbstractItem;

public class EdgeItem extends AbstractItem {


    /*constructor*/
    public EdgeItem(String aValueOf) {
        super(aValueOf);
    }

    /*getter*/
    @Override
    public int getType() {
        return TYPE_EDGE;
    }

}
