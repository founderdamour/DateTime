package cn.andy.study.datetime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yangzhizhong
 */

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("关于");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
