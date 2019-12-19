package com.dyh.bothprogress;

import android.app.Activity;
import android.os.Bundle;

import com.dyh.widget.BothProgressBar;
import com.dyh.widget.ProgressBuildConfig;

public class MainActivity extends Activity {

    private BothProgressBar mBothProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBothProgressBar = findViewById(R.id.mBothProgressBar);

        //通多代码设置样式和数据
        ProgressBuildConfig progressBuildConfig = mBothProgressBar.getBuildConfig().setDyhMinValue(0)
                .setShowText(true)
                .setDyhProgressText("当前完成90%")
                .setDyhIndicatorText("目标应完成10%")
                .setDyhMaxValue(10)
                .setDyhProgressValue(9)
                .setDyhIndicatorValue(2);

        mBothProgressBar.setConfigValue(progressBuildConfig);
    }
}
