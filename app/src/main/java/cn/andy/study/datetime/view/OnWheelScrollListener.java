package cn.andy.study.datetime.view;

/**
 * Created by yangzhizhong
 */

public interface OnWheelScrollListener {

    /**
     * Callback method to be invoked when scrolling started.
     * @param wheel the wheel2 view whose state has changed.
     */
    void onScrollingStarted(WheelView wheel);

    /**
     * Callback method to be invoked when scrolling ended.
     * @param wheel the wheel2 view whose state has changed.
     */
    void onScrollingFinished(WheelView wheel);
}
