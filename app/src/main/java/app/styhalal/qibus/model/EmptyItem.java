package app.styhalal.qibus.model;

import app.styhalal.qibus.utils.menu.AbstractItem;

import java.util.List;

public class EmptyItem extends AbstractItem {

    /*constructor*/

    public EmptyItem(List<SeatModel> aSeatModelList) {
        super(aSeatModelList);
    }

    /*getter*/
    @Override
    public int getType() {
        return TYPE_EMPTY;
    }

}
