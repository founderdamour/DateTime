package cn.andy.study.datetime.listener;

import cn.andy.study.datetime.bean.DateBean;
import cn.andy.study.datetime.bean.DateType;

/**
 * Created by yangzhizhong
 */

public interface WheelPickerListener {
    void onSelect(DateType type, DateBean bean);
}
