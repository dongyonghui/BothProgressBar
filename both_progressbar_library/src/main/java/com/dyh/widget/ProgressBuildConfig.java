package com.dyh.widget;

/**
 * 作者：DongYonghui
 * 邮箱：648731994@qq.com
 * 创建时间：2019/12/18/018 11:30
 * 描述：进度条配置项
 */
public class ProgressBuildConfig {

    /**indicator */
    /**
     * 设置目标指示器颜色
     */
    private int dyhIndicatorColor;//#F44336</item>
    /**
     * 设置目标指示器高度
     */
    private float dyhProgressHeight;//10dp</item>
    /**
     * 设置目标指示器固定宽度，默认10dp
     */
    private float dyhIndicatorWidth;//10dp</item>
    /**
     * 最大值，默认100
     */
    private float dyhMaxValue;//100</item>
    /**
     * 最小值，默认0
     */
    private float dyhMinValue;//0</item>
    /**
     * 设置目标指示器数值,
     */
    private float dyhIndicatorValue;//0</item>
    /**
     * 设置进度条数值
     */
    private float dyhProgressValue;//0</item>
    /**
     * 设置进度条颜色
     */
    private int dyhProgressColor;//#3F51B5</item>
    /**
     * 设置背景颜色
     */
    private int dyhBackgroundColor;//#FFFFFF</item>
    private int dyhProgressBackgroundColor;//#C7C7C7</item>

    /**
     * 文本的边距
     */
    private float dyhTextMargin;//3dp</item>
    /**
     * 设置目标指示器圆角弧度
     */
    private float dyhIndicatorCornerRadius;//0dp</item>
    /**
     * 设置进度条圆角弧度
     */
    private float dyhBackgroundCornerRadius;//0dp</item>

    /**title */
    /**
     * 设置字体大小,默认10sp
     */
    private float dyhTextSize;//10sp</item>
    /**
     * 设置字体选中颜色
     */
    private int dyhTextColor;//#121212</item>
    private CharSequence dyhIndicatorText;
    private CharSequence dyhProgressText;
    private boolean isShowText;

    public boolean isShowText() {
        return isShowText;
    }

    public ProgressBuildConfig setShowText(boolean showText) {
        isShowText = showText;
        return this;
    }

    public int getDyhIndicatorColor() {
        return dyhIndicatorColor;
    }

    public ProgressBuildConfig setDyhIndicatorColor(int dyhIndicatorColor) {
        this.dyhIndicatorColor = dyhIndicatorColor;
        return this;
    }

    public float getDyhProgressHeight() {
        return dyhProgressHeight;
    }

    public ProgressBuildConfig setDyhProgressHeight(float dyhProgressHeight) {
        this.dyhProgressHeight = dyhProgressHeight;
        return this;
    }

    public float getDyhIndicatorWidth() {
        return dyhIndicatorWidth;
    }

    public ProgressBuildConfig setDyhIndicatorWidth(float dyhIndicatorWidth) {
        this.dyhIndicatorWidth = dyhIndicatorWidth;
        return this;
    }

    public float getDyhMaxValue() {
        return dyhMaxValue;
    }

    public ProgressBuildConfig setDyhMaxValue(float dyhMaxValue) {
        this.dyhMaxValue = dyhMaxValue;
        return this;
    }

    public float getDyhMinValue() {
        return dyhMinValue;
    }

    public ProgressBuildConfig setDyhMinValue(float dyhMinValue) {
        this.dyhMinValue = dyhMinValue;
        return this;
    }

    public float getDyhIndicatorValue() {
        return dyhIndicatorValue;
    }

    public ProgressBuildConfig setDyhIndicatorValue(float dyhIndicatorValue) {
        this.dyhIndicatorValue = dyhIndicatorValue;
        return this;
    }

    public float getDyhProgressValue() {
        return dyhProgressValue;
    }

    public ProgressBuildConfig setDyhProgressValue(float dyhProgressValue) {
        this.dyhProgressValue = dyhProgressValue;
        return this;
    }

    public int getDyhProgressColor() {
        return dyhProgressColor;
    }

    public ProgressBuildConfig setDyhProgressColor(int dyhProgressColor) {
        this.dyhProgressColor = dyhProgressColor;
        return this;
    }

    public int getDyhBackgroundColor() {
        return dyhBackgroundColor;
    }

    public ProgressBuildConfig setDyhBackgroundColor(int dyhBackgroundColor) {
        this.dyhBackgroundColor = dyhBackgroundColor;
        return this;
    }

    public int getDyhProgressBackgroundColor() {
        return dyhProgressBackgroundColor;
    }

    public ProgressBuildConfig setDyhProgressBackgroundColor(int dyhProgressBackgroundColor) {
        this.dyhProgressBackgroundColor = dyhProgressBackgroundColor;
        return this;
    }

    public float getDyhTextMargin() {
        return dyhTextMargin;
    }

    public ProgressBuildConfig setDyhTextMargin(float dyhTextMargin) {
        this.dyhTextMargin = dyhTextMargin;
        return this;
    }

    public float getDyhIndicatorCornerRadius() {
        return dyhIndicatorCornerRadius;
    }

    public ProgressBuildConfig setDyhIndicatorCornerRadius(float dyhIndicatorCornerRadius) {
        this.dyhIndicatorCornerRadius = dyhIndicatorCornerRadius;
        return this;
    }

    public float getDyhBackgroundCornerRadius() {
        return dyhBackgroundCornerRadius;
    }

    public ProgressBuildConfig setDyhBackgroundCornerRadius(float dyhBackgroundCornerRadius) {
        this.dyhBackgroundCornerRadius = dyhBackgroundCornerRadius;
        return this;
    }

    public float getDyhTextSize() {
        return dyhTextSize;
    }

    public ProgressBuildConfig setDyhTextSize(float dyhTextSize) {
        this.dyhTextSize = dyhTextSize;
        return this;
    }

    public int getDyhTextColor() {
        return dyhTextColor;
    }

    public ProgressBuildConfig setDyhTextColor(int dyhTextColor) {
        this.dyhTextColor = dyhTextColor;
        return this;
    }

    public CharSequence getDyhIndicatorText() {
        return dyhIndicatorText;
    }

    public ProgressBuildConfig setDyhIndicatorText(CharSequence dyhIndicatorText) {
        this.dyhIndicatorText = dyhIndicatorText;
        return this;
    }

    public CharSequence getDyhProgressText() {
        return dyhProgressText;
    }

    public ProgressBuildConfig setDyhProgressText(CharSequence dyhProgressText) {
        this.dyhProgressText = dyhProgressText;
        return this;
    }
}
