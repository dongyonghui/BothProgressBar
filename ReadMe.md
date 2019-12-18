# 布局中使用
```
<!-- 简单的引入 -->
<com.dyh.widget.BothProgressBar
            android:id="@+id/mBothProgressBar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

<!-- 通过布局设置（全属性展示） -->
<com.dyh.widget.BothProgressBar
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            app:dyh_background_color="#9E54AB"
            app:dyh_background_corner_radius="20dp"
            app:dyh_indicatorText="当前进度20%"
            app:dyh_indicator_color="#00BCD4"
            app:dyh_indicator_corner_radius="3dp"
            app:dyh_indicator_value="20"
            app:dyh_indicator_width="3dp"
            app:dyh_max_value="100"
            app:dyh_min_value="0"
            app:dyh_progressBackground_color="#8E7F93E5"
            app:dyh_progressText="当前进度50%"
            app:dyh_progress_color="#673AB7"
            app:dyh_progress_height="20dp"
            app:dyh_progress_value="50"
            app:dyh_showText="true"
            app:dyh_textColor="#4CAF50"
            app:dyh_textSize="12sp"
            app:dyh_text_margin="5dp" />
```

# 代码中使用
`
mBothProgressBar = findViewById(R.id.mBothProgressBar);

        //通多代码设置样式和数据，全部属性设置请看文章末位的全属性介绍
        ProgressBuildConfig progressBuildConfig = mBothProgressBar.getBuildConfig().setDyhMinValue(0)
                .setShowText(true)
                .setDyhProgressText("当前完成90%")
                .setDyhIndicatorText("目标应完成10%")
                .setDyhMaxValue(10)
                .setDyhProgressValue(9)
                .setDyhIndicatorValue(2);

        mBothProgressBar.setConfigValue(progressBuildConfig);`

# 所有属性解释
```
        <!-- 设置目标指示器颜色 -->
        <attr name="dyh_indicator_color" format="color" />
        <!-- 设置进度条高度 -->
        <attr name="dyh_progress_height" format="dimension" />
        <!-- 设置目标指示器固定宽度，默认10dp -->
        <attr name="dyh_indicator_width" format="dimension" />
        <!--最大值，默认100-->
        <attr name="dyh_max_value" format="float" />
        <!--最小值，默认0-->
        <attr name="dyh_min_value" format="float" />
        <!-- 设置目标指示器数值,-->
        <attr name="dyh_indicator_value" format="float" />
        <!-- 设置进度条数值-->
        <attr name="dyh_progress_value" format="float" />
        <!-- 设置进度条颜色 -->
        <attr name="dyh_progress_color" format="color" />
        <!-- 设置根布局背景颜色 -->
        <attr name="dyh_background_color" format="color" />
        <!-- 设置进度条背景颜色 -->
        <attr name="dyh_progressBackground_color" format="color" />

        <!--文本的边距-->
        <attr name="dyh_text_margin" format="dimension" />
        <!-- 设置目标指示器圆角弧度-->
        <attr name="dyh_indicator_corner_radius" format="dimension" />
        <!-- 设置进度条圆角弧度-->
        <attr name="dyh_background_corner_radius" format="dimension" />
        <!-- title -->
        <!-- 设置字体大小,默认10sp -->
        <attr name="dyh_textSize" format="dimension" />
        <!-- 设置字体选中颜色 -->
        <attr name="dyh_textColor" format="color" />
        <!-- 进度提示文字 -->
        <attr name="dyh_progressText" format="string" />
        <!-- 第二进度（指示器）提示文字 -->
        <attr name="dyh_indicatorText" format="string" />
        <!--是否展示文本信息-->
        <attr name="dyh_showText" format="boolean" />
```
