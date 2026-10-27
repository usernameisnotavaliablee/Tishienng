package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class BaseDataSet<T extends com.github.mikephil.charting.data.Entry> implements com.github.mikephil.charting.interfaces.datasets.IDataSet<T> {
    protected com.github.mikephil.charting.components.YAxis.AxisDependency mAxisDependency;
    protected java.util.List<java.lang.Integer> mColors;
    protected boolean mDrawIcons;
    protected boolean mDrawValues;
    private com.github.mikephil.charting.components.Legend.LegendForm mForm;
    private android.graphics.DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    protected com.github.mikephil.charting.model.GradientColor mGradientColor;
    protected java.util.List<com.github.mikephil.charting.model.GradientColor> mGradientColors;
    protected boolean mHighlightEnabled;
    protected com.github.mikephil.charting.utils.MPPointF mIconsOffset;
    private java.lang.String mLabel;
    protected java.util.List<java.lang.Integer> mValueColors;
    protected transient com.github.mikephil.charting.formatter.ValueFormatter mValueFormatter;
    protected float mValueTextSize;
    protected android.graphics.Typeface mValueTypeface;
    protected boolean mVisible;

    public BaseDataSet() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mColors = r0
            r4.mGradientColor = r0
            r4.mGradientColors = r0
            r4.mValueColors = r0
            java.lang.String r1 = "DataSet"
            r4.mLabel = r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            r4.mAxisDependency = r1
            r1 = 1
            r4.mHighlightEnabled = r1
            com.github.mikephil.charting.components.Legend$LegendForm r2 = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT
            r4.mForm = r2
            r2 = 2143289344(0x7fc00000, float:NaN)
            r4.mFormSize = r2
            r4.mFormLineWidth = r2
            r4.mFormLineDashEffect = r0
            r4.mDrawValues = r1
            r4.mDrawIcons = r1
            com.github.mikephil.charting.utils.MPPointF r0 = new com.github.mikephil.charting.utils.MPPointF
            r0.<init>()
            r4.mIconsOffset = r0
            r0 = 1099431936(0x41880000, float:17.0)
            r4.mValueTextSize = r0
            r4.mVisible = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mColors = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mValueColors = r0
            java.util.List<java.lang.Integer> r0 = r4.mColors
            r1 = 234(0xea, float:3.28E-43)
            r2 = 255(0xff, float:3.57E-43)
            r3 = 140(0x8c, float:1.96E-43)
            int r1 = android.graphics.Color.rgb(r3, r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = r4.mValueColors
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return
    }

    public BaseDataSet(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mLabel = r1
            return
    }

    public void addColor(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mColors
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mColors = r0
        Lb:
            java.util.List<java.lang.Integer> r0 = r1.mColors
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            return
    }

    public boolean contains(T r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.getEntryCount()
            if (r1 >= r2) goto L17
            com.github.mikephil.charting.data.Entry r2 = r3.getEntryForIndex(r1)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L14
            r4 = 1
            return r4
        L14:
            int r1 = r1 + 1
            goto L2
        L17:
            return r0
    }

    protected void copy(com.github.mikephil.charting.data.BaseDataSet r2) {
            r1 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r1.mAxisDependency
            r2.mAxisDependency = r0
            java.util.List<java.lang.Integer> r0 = r1.mColors
            r2.mColors = r0
            boolean r0 = r1.mDrawIcons
            r2.mDrawIcons = r0
            boolean r0 = r1.mDrawValues
            r2.mDrawValues = r0
            com.github.mikephil.charting.components.Legend$LegendForm r0 = r1.mForm
            r2.mForm = r0
            android.graphics.DashPathEffect r0 = r1.mFormLineDashEffect
            r2.mFormLineDashEffect = r0
            float r0 = r1.mFormLineWidth
            r2.mFormLineWidth = r0
            float r0 = r1.mFormSize
            r2.mFormSize = r0
            com.github.mikephil.charting.model.GradientColor r0 = r1.mGradientColor
            r2.mGradientColor = r0
            java.util.List<com.github.mikephil.charting.model.GradientColor> r0 = r1.mGradientColors
            r2.mGradientColors = r0
            boolean r0 = r1.mHighlightEnabled
            r2.mHighlightEnabled = r0
            com.github.mikephil.charting.utils.MPPointF r0 = r1.mIconsOffset
            r2.mIconsOffset = r0
            java.util.List<java.lang.Integer> r0 = r1.mValueColors
            r2.mValueColors = r0
            com.github.mikephil.charting.formatter.ValueFormatter r0 = r1.mValueFormatter
            r2.mValueFormatter = r0
            java.util.List<java.lang.Integer> r0 = r1.mValueColors
            r2.mValueColors = r0
            float r0 = r1.mValueTextSize
            r2.mValueTextSize = r0
            boolean r0 = r1.mVisible
            r2.mVisible = r0
            return
    }

    public com.github.mikephil.charting.components.YAxis.AxisDependency getAxisDependency() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r1.mAxisDependency
            return r0
    }

    public int getColor() {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.mColors
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    public int getColor(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.mColors
            int r1 = r0.size()
            int r3 = r3 % r1
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
    }

    public java.util.List<java.lang.Integer> getColors() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mColors
            return r0
    }

    public com.github.mikephil.charting.components.Legend.LegendForm getForm() {
            r1 = this;
            com.github.mikephil.charting.components.Legend$LegendForm r0 = r1.mForm
            return r0
    }

    public android.graphics.DashPathEffect getFormLineDashEffect() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mFormLineDashEffect
            return r0
    }

    public float getFormLineWidth() {
            r1 = this;
            float r0 = r1.mFormLineWidth
            return r0
    }

    public float getFormSize() {
            r1 = this;
            float r0 = r1.mFormSize
            return r0
    }

    public com.github.mikephil.charting.model.GradientColor getGradientColor() {
            r1 = this;
            com.github.mikephil.charting.model.GradientColor r0 = r1.mGradientColor
            return r0
    }

    public com.github.mikephil.charting.model.GradientColor getGradientColor(int r3) {
            r2 = this;
            java.util.List<com.github.mikephil.charting.model.GradientColor> r0 = r2.mGradientColors
            int r1 = r0.size()
            int r3 = r3 % r1
            java.lang.Object r3 = r0.get(r3)
            com.github.mikephil.charting.model.GradientColor r3 = (com.github.mikephil.charting.model.GradientColor) r3
            return r3
    }

    public java.util.List<com.github.mikephil.charting.model.GradientColor> getGradientColors() {
            r1 = this;
            java.util.List<com.github.mikephil.charting.model.GradientColor> r0 = r1.mGradientColors
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getIconsOffset() {
            r1 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r1.mIconsOffset
            return r0
    }

    public int getIndexInEntries(int r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.getEntryCount()
            if (r0 >= r1) goto L18
            float r1 = (float) r4
            com.github.mikephil.charting.data.Entry r2 = r3.getEntryForIndex(r0)
            float r2 = r2.getX()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L15
            return r0
        L15:
            int r0 = r0 + 1
            goto L1
        L18:
            r4 = -1
            return r4
    }

    public java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.mLabel
            return r0
    }

    public java.util.List<java.lang.Integer> getValueColors() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mValueColors
            return r0
    }

    public com.github.mikephil.charting.formatter.ValueFormatter getValueFormatter() {
            r1 = this;
            boolean r0 = r1.needsFormatter()
            if (r0 == 0) goto Lb
            com.github.mikephil.charting.formatter.ValueFormatter r0 = com.github.mikephil.charting.utils.Utils.getDefaultValueFormatter()
            return r0
        Lb:
            com.github.mikephil.charting.formatter.ValueFormatter r0 = r1.mValueFormatter
            return r0
    }

    public int getValueTextColor() {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.mValueColors
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    public int getValueTextColor(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.mValueColors
            int r1 = r0.size()
            int r3 = r3 % r1
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
    }

    public float getValueTextSize() {
            r1 = this;
            float r0 = r1.mValueTextSize
            return r0
    }

    public android.graphics.Typeface getValueTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.mValueTypeface
            return r0
    }

    public boolean isDrawIconsEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawIcons
            return r0
    }

    public boolean isDrawValuesEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawValues
            return r0
    }

    public boolean isHighlightEnabled() {
            r1 = this;
            boolean r0 = r1.mHighlightEnabled
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            boolean r0 = r1.mVisible
            return r0
    }

    public boolean needsFormatter() {
            r1 = this;
            com.github.mikephil.charting.formatter.ValueFormatter r0 = r1.mValueFormatter
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void notifyDataSetChanged() {
            r0 = this;
            r0.calcMinMax()
            return
    }

    public boolean removeEntry(int r1) {
            r0 = this;
            com.github.mikephil.charting.data.Entry r1 = r0.getEntryForIndex(r1)
            boolean r1 = r0.removeEntry(r1)
            return r1
    }

    public boolean removeEntryByXValue(float r2) {
            r1 = this;
            r0 = 2143289344(0x7fc00000, float:NaN)
            com.github.mikephil.charting.data.Entry r2 = r1.getEntryForXValue(r2, r0)
            boolean r2 = r1.removeEntry(r2)
            return r2
    }

    public boolean removeFirst() {
            r2 = this;
            int r0 = r2.getEntryCount()
            r1 = 0
            if (r0 <= 0) goto L10
            com.github.mikephil.charting.data.Entry r0 = r2.getEntryForIndex(r1)
            boolean r0 = r2.removeEntry(r0)
            return r0
        L10:
            return r1
    }

    public boolean removeLast() {
            r1 = this;
            int r0 = r1.getEntryCount()
            if (r0 <= 0) goto L15
            int r0 = r1.getEntryCount()
            int r0 = r0 + (-1)
            com.github.mikephil.charting.data.Entry r0 = r1.getEntryForIndex(r0)
            boolean r0 = r1.removeEntry(r0)
            return r0
        L15:
            r0 = 0
            return r0
    }

    public void resetColors() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mColors
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mColors = r0
        Lb:
            java.util.List<java.lang.Integer> r0 = r1.mColors
            r0.clear()
            return
    }

    public void setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency r1) {
            r0 = this;
            r0.mAxisDependency = r1
            return
    }

    public void setColor(int r2) {
            r1 = this;
            r1.resetColors()
            java.util.List<java.lang.Integer> r0 = r1.mColors
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            return
    }

    public void setColor(int r3, int r4) {
            r2 = this;
            int r0 = android.graphics.Color.red(r3)
            int r1 = android.graphics.Color.green(r3)
            int r3 = android.graphics.Color.blue(r3)
            int r3 = android.graphics.Color.argb(r4, r0, r1, r3)
            r2.setColor(r3)
            return
    }

    public void setColors(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.mColors = r1
            return
    }

    public void setColors(int... r1) {
            r0 = this;
            java.util.List r1 = com.github.mikephil.charting.utils.ColorTemplate.createColors(r1)
            r0.mColors = r1
            return
    }

    public void setColors(int[] r6, int r7) {
            r5 = this;
            r5.resetColors()
            int r0 = r6.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L1f
            r2 = r6[r1]
            int r3 = android.graphics.Color.red(r2)
            int r4 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            int r2 = android.graphics.Color.argb(r7, r3, r4, r2)
            r5.addColor(r2)
            int r1 = r1 + 1
            goto L5
        L1f:
            return
    }

    public void setColors(int[] r6, android.content.Context r7) {
            r5 = this;
            java.util.List<java.lang.Integer> r0 = r5.mColors
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.mColors = r0
        Lb:
            java.util.List<java.lang.Integer> r0 = r5.mColors
            r0.clear()
            int r0 = r6.length
            r1 = 0
        L12:
            if (r1 >= r0) goto L2a
            r2 = r6[r1]
            java.util.List<java.lang.Integer> r3 = r5.mColors
            android.content.res.Resources r4 = r7.getResources()
            int r2 = r4.getColor(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto L12
        L2a:
            return
    }

    public void setDrawIcons(boolean r1) {
            r0 = this;
            r0.mDrawIcons = r1
            return
    }

    public void setDrawValues(boolean r1) {
            r0 = this;
            r0.mDrawValues = r1
            return
    }

    public void setForm(com.github.mikephil.charting.components.Legend.LegendForm r1) {
            r0 = this;
            r0.mForm = r1
            return
    }

    public void setFormLineDashEffect(android.graphics.DashPathEffect r1) {
            r0 = this;
            r0.mFormLineDashEffect = r1
            return
    }

    public void setFormLineWidth(float r1) {
            r0 = this;
            r0.mFormLineWidth = r1
            return
    }

    public void setFormSize(float r1) {
            r0 = this;
            r0.mFormSize = r1
            return
    }

    public void setGradientColor(int r2, int r3) {
            r1 = this;
            com.github.mikephil.charting.model.GradientColor r0 = new com.github.mikephil.charting.model.GradientColor
            r0.<init>(r2, r3)
            r1.mGradientColor = r0
            return
    }

    public void setGradientColors(java.util.List<com.github.mikephil.charting.model.GradientColor> r1) {
            r0 = this;
            r0.mGradientColors = r1
            return
    }

    public void setHighlightEnabled(boolean r1) {
            r0 = this;
            r0.mHighlightEnabled = r1
            return
    }

    public void setIconsOffset(com.github.mikephil.charting.utils.MPPointF r3) {
            r2 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r2.mIconsOffset
            float r1 = r3.x
            r0.x = r1
            float r3 = r3.y
            r0.y = r3
            return
    }

    public void setLabel(java.lang.String r1) {
            r0 = this;
            r0.mLabel = r1
            return
    }

    public void setValueFormatter(com.github.mikephil.charting.formatter.ValueFormatter r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.mValueFormatter = r1
            return
    }

    public void setValueTextColor(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mValueColors
            r0.clear()
            java.util.List<java.lang.Integer> r0 = r1.mValueColors
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            return
    }

    public void setValueTextColors(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.mValueColors = r1
            return
    }

    public void setValueTextSize(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mValueTextSize = r1
            return
    }

    public void setValueTypeface(android.graphics.Typeface r1) {
            r0 = this;
            r0.mValueTypeface = r1
            return
    }

    public void setVisible(boolean r1) {
            r0 = this;
            r0.mVisible = r1
            return
    }
}
