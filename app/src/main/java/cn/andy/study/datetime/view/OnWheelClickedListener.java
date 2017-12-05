package cn.andy.study.datetime.view;

/**
 * Created by yangzhizhong
 */

public interface OnWheelClickedListener {

    /**
     * Callback method to be invoked when current item clicked
     * @param wheel the wheel2 view
     * @param itemIndex the index of clicked item
     */
    void onItemClicked(WheelView wheel, int itemIndex);
}
