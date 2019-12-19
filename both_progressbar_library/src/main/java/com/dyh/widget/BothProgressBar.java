package com.dyh.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dyh.bothprogressbar.lib.R;

/**
 * 作者：DongYonghui
 * 邮箱：648731994@qq.com
 * 创建时间：2019/12/18/018 10:34
 * 描述：进度条
 */
public class BothProgressBar extends FrameLayout {

    private View rootView;//根视图
    private TextView mTopTextView;//进度条上方文本
    private TextView mBottomTextView;//进度条下方文本
    private View mIndicatorView;//目标值标记
    private View mProgressBarView;//进度条
    private FrameLayout mProgressBarRootView;//进度条根布局

    private Context mContext;

    private ProgressBuildConfig buildConfig;

    public BothProgressBar(Context context) {
        this(context, null);
    }

    public BothProgressBar(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.targetValueProgressStyle);
    }

    public BothProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        rootView = LayoutInflater.from(context).inflate(R.layout.layout_target_value_progress_bar, this, true);
        initViews();
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.BothProgressBar, defStyleAttr, R.style.DefaultBothProgressStyle);
        try {
            buildConfig = new ProgressBuildConfig();
            buildConfig.setShowText(a.getBoolean(R.styleable.BothProgressBar_dyh_showText, false))
                    .setDyhIndicatorText(a.getText(R.styleable.BothProgressBar_dyh_indicatorText))
                    .setDyhProgressText(a.getText(R.styleable.BothProgressBar_dyh_progressText))
                    .setDyhBackgroundColor(a.getColor(R.styleable.BothProgressBar_dyh_background_color, context.getResources().getColor(R.color.dyh_backgroundColor)))
                    .setDyhIndicatorColor(a.getColor(R.styleable.BothProgressBar_dyh_indicator_color, context.getResources().getColor(R.color.dyh_targetViewColor)))
                    .setDyhProgressColor(a.getColor(R.styleable.BothProgressBar_dyh_progress_color, context.getResources().getColor(R.color.dyh_progressColor)))
                    .setDyhTextColor(a.getColor(R.styleable.BothProgressBar_dyh_textColor, context.getResources().getColor(R.color.dyh_textColor)))
                    .setDyhTextSize(a.getDimension(R.styleable.BothProgressBar_dyh_textSize, dp2px(10)))
                    .setDyhTextMargin(a.getDimension(R.styleable.BothProgressBar_dyh_text_margin, dp2px(3)))
                    .setDyhProgressBackgroundColor(a.getColor(R.styleable.BothProgressBar_dyh_progressBackground_color, context.getResources().getColor(R.color.dyh_progressBackgroundColor)))
                    .setDyhProgressHeight(a.getDimension(R.styleable.BothProgressBar_dyh_progress_height, dp2px(10)))
                    .setDyhIndicatorWidth(a.getDimension(R.styleable.BothProgressBar_dyh_indicator_width, dp2px(10)))
                    .setDyhIndicatorCornerRadius(a.getDimension(R.styleable.BothProgressBar_dyh_indicator_corner_radius, dp2px(0)))
                    .setDyhBackgroundCornerRadius(a.getDimension(R.styleable.BothProgressBar_dyh_background_corner_radius, dp2px(0)))
                    .setDyhMaxValue(a.getFloat(R.styleable.BothProgressBar_dyh_max_value, 100))
                    .setDyhMinValue(a.getFloat(R.styleable.BothProgressBar_dyh_min_value, 0))
                    .setDyhIndicatorValue(a.getFloat(R.styleable.BothProgressBar_dyh_indicator_value, 0))
                    .setDyhProgressValue(a.getFloat(R.styleable.BothProgressBar_dyh_progress_value, 0));
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        refreshViews();
    }

    /**
     * 设置相关配置并刷新视图显示效果
     *
     * @param buildConfig
     * @return
     */
    public BothProgressBar setConfigValue(ProgressBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        refreshViews();
        return this;
    }

    /**
     * @return 返回当前视图的配置数据
     */
    public ProgressBuildConfig getBuildConfig() {
        if (null == buildConfig) {
            buildConfig = new ProgressBuildConfig();
        }
        return buildConfig;
    }

    private void initViews() {
        mTopTextView = findViewById(R.id.mTopTextView);
        mBottomTextView = findViewById(R.id.mBottomTextView);
        mIndicatorView = findViewById(R.id.mIndicatorView);
        mProgressBarView = findViewById(R.id.mProgressBarView);
        mProgressBarRootView = findViewById(R.id.mProgressBarRootView);
    }

    protected int dp2px(float dp) {
        final float scale = mContext.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    private void refreshViews() {
        if (null != buildConfig) {
            //设置文字样式
            mTopTextView.setText(buildConfig.getDyhProgressText());
            mBottomTextView.setText(buildConfig.getDyhIndicatorText());
            mTopTextView.setTextColor(buildConfig.getDyhTextColor());
            mBottomTextView.setTextColor(buildConfig.getDyhTextColor());
            mTopTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, buildConfig.getDyhTextSize());
            mBottomTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, buildConfig.getDyhTextSize());
            if (buildConfig.isShowText()) {
                mTopTextView.setVisibility(VISIBLE);
                mBottomTextView.setVisibility(VISIBLE);
            } else {
                mTopTextView.setVisibility(GONE);
                mBottomTextView.setVisibility(GONE);
            }


            //设置进度条高度
            LinearLayout.LayoutParams barRootViewLayoutParams = (LinearLayout.LayoutParams) mProgressBarRootView.getLayoutParams();
            barRootViewLayoutParams.height = (int) buildConfig.getDyhProgressHeight();
            mProgressBarRootView.setLayoutParams(barRootViewLayoutParams);
            //设置背景颜色
            rootView.setBackgroundColor(buildConfig.getDyhBackgroundColor());
            //设置圆角
            int roundRadius = (int) buildConfig.getDyhBackgroundCornerRadius(); // 圆角半径
            int fillColor = buildConfig.getDyhProgressBackgroundColor();//内部填充颜色
            GradientDrawable gd = new GradientDrawable();//创建drawable
            gd.setColor(fillColor);
            gd.setCornerRadius(roundRadius);
            mProgressBarRootView.setBackground(gd);
            roundRadius = (int) buildConfig.getDyhBackgroundCornerRadius(); // 8dp 圆角半径
            fillColor = buildConfig.getDyhProgressColor();//内部填充颜色
            gd = new GradientDrawable();//创建drawable
            gd.setColor(fillColor);
            gd.setCornerRadius(roundRadius);
            mProgressBarView.setBackground(gd);
            roundRadius = (int) buildConfig.getDyhIndicatorCornerRadius(); // 8dp 圆角半径
            fillColor = buildConfig.getDyhIndicatorColor();//内部填充颜色
            gd = new GradientDrawable();//创建drawable
            gd.setColor(fillColor);
            gd.setCornerRadius(roundRadius);
            mIndicatorView.setBackground(gd);

            int width = getMeasuredWidth();
            float maxValue = buildConfig.getDyhMaxValue();
            float indValue = buildConfig.getDyhIndicatorValue();
            float progressValue = buildConfig.getDyhProgressValue();
            int indMargin = (int) (indValue / maxValue * width);
            int progressWidth = (int) (progressValue / maxValue * width);

            //设置指示器位置
            FrameLayout.LayoutParams indicatorParams = (LayoutParams) mIndicatorView.getLayoutParams();
            indicatorParams.leftMargin = indMargin;
            indicatorParams.width = (int) buildConfig.getDyhIndicatorWidth();
            mIndicatorView.setLayoutParams(indicatorParams);
            //设置进度条长度
            FrameLayout.LayoutParams progressParams = (LayoutParams) mProgressBarView.getLayoutParams();
            progressParams.width = progressWidth;
            mProgressBarView.setLayoutParams(progressParams);

            //设置文字配置
            LinearLayout.LayoutParams topTextParams = (LinearLayout.LayoutParams) mTopTextView.getLayoutParams();
            LinearLayout.LayoutParams bottomTextParams = (LinearLayout.LayoutParams) mBottomTextView.getLayoutParams();
            int topTextMarginLeft = 0;
            int bottomTextMarginLeft = 0;
            int topTextWidthHarf = mTopTextView.getMeasuredWidth() / 2;
            int bottomTextWidthHarf = mBottomTextView.getMeasuredWidth() / 2;
            //进度条的长度大于字体宽度一半并且进度条长度+字体一半宽度小于总宽度，则字体中心位置对齐进度条中点
            if (progressWidth >= topTextWidthHarf && progressWidth + topTextWidthHarf <= width) {
                topTextMarginLeft = progressWidth - topTextWidthHarf;
            } else if (progressWidth + topTextWidthHarf > width) {//如果文字宽度超出屏幕，则右对齐
                topTextMarginLeft = width - mTopTextView.getMeasuredWidth();
            }
            if (indMargin >= topTextWidthHarf && indMargin + topTextWidthHarf <= width) {
                bottomTextMarginLeft = indMargin - bottomTextWidthHarf;
            } else if (indMargin + topTextWidthHarf > width) {//如果文字宽度超出屏幕，则右对齐
                bottomTextMarginLeft = width - mBottomTextView.getMeasuredWidth();
            }
            int textMargin = (int) buildConfig.getDyhTextMargin();
            topTextParams.setMargins(topTextMarginLeft, textMargin, textMargin, textMargin);
            bottomTextParams.setMargins(bottomTextMarginLeft, textMargin, textMargin, textMargin);
            mTopTextView.setLayoutParams(topTextParams);
            mBottomTextView.setLayoutParams(bottomTextParams);
        }
    }

}
