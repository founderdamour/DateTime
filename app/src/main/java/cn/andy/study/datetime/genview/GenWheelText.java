package cn.andy.study.datetime.genview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import cn.andy.study.datetime.R;

/**
 * Created by yangzhizhong
 */

public class GenWheelText  extends GenWheelView {

    private int line = 1;
    private int textSize = 24;
    private int textColor;
    public GenWheelText() {
        this(1, 24,0x444444);
    }
    public GenWheelText(int textColor) {
        this(1, 24,textColor);
    }
    public GenWheelText(int line, int textSize,int textColor) {
        this.line = line;
        this.textSize = textSize;
        this.textColor=textColor;
    }

    @Override
    protected View genBody(Context context, View convertView, Object element, int position) {
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {

            convertView = LayoutInflater.from(context).inflate(R.layout.cbk_wheel_default_inner_text, null);
            holder = new ViewHolder();
            holder.text = (TextView) convertView.findViewById(R.id.text);// 投資代碼_投資標的名稱
            convertView.setTag(holder);
        }
        holder.text.setTextSize(textSize);
        holder.text.setMaxLines(line);
        holder.text.setText(element.toString());
        holder.text.setTextColor(textColor);
        return convertView;
    }

    private class ViewHolder {
        public TextView text;
    }
}
