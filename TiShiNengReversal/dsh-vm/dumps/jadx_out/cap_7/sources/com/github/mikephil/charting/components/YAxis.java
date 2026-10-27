package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class YAxis extends com.github.mikephil.charting.components.AxisBase {
    private com.github.mikephil.charting.components.YAxis.AxisDependency mAxisDependency;
    private boolean mDrawBottomYLabelEntry;
    private boolean mDrawTopYLabelEntry;
    protected boolean mDrawZeroLine;
    protected boolean mInverted;
    protected float mMaxWidth;
    protected float mMinWidth;
    private com.github.mikephil.charting.components.YAxis.YAxisLabelPosition mPosition;
    protected float mSpacePercentBottom;
    protected float mSpacePercentTop;
    private boolean mUseAutoScaleRestrictionMax;
    private boolean mUseAutoScaleRestrictionMin;
    protected int mZeroLineColor;
    protected float mZeroLineWidth;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AxisDependency extends java.lang.Enum<com.github.mikephil.charting.components.YAxis.AxisDependency> {
        private static final /* synthetic */ com.github.mikephil.charting.components.YAxis.AxisDependency[] $VALUES = null;
        public static final com.github.mikephil.charting.components.YAxis.AxisDependency LEFT = null;
        public static final com.github.mikephil.charting.components.YAxis.AxisDependency RIGHT = null;

        static {
                com.github.mikephil.charting.components.YAxis$AxisDependency r0 = new com.github.mikephil.charting.components.YAxis$AxisDependency
                java.lang.String r1 = "LEFT"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT = r0
                com.github.mikephil.charting.components.YAxis$AxisDependency r1 = new com.github.mikephil.charting.components.YAxis$AxisDependency
                java.lang.String r3 = "RIGHT"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT = r1
                r3 = 2
                com.github.mikephil.charting.components.YAxis$AxisDependency[] r3 = new com.github.mikephil.charting.components.YAxis.AxisDependency[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.github.mikephil.charting.components.YAxis.AxisDependency.$VALUES = r3
                return
        }

        AxisDependency(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.YAxis.AxisDependency valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.YAxis$AxisDependency> r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.YAxis$AxisDependency r1 = (com.github.mikephil.charting.components.YAxis.AxisDependency) r1
                return r1
        }

        public static com.github.mikephil.charting.components.YAxis.AxisDependency[] values() {
                com.github.mikephil.charting.components.YAxis$AxisDependency[] r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.YAxis$AxisDependency[] r0 = (com.github.mikephil.charting.components.YAxis.AxisDependency[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum YAxisLabelPosition extends java.lang.Enum<com.github.mikephil.charting.components.YAxis.YAxisLabelPosition> {
        private static final /* synthetic */ com.github.mikephil.charting.components.YAxis.YAxisLabelPosition[] $VALUES = null;
        public static final com.github.mikephil.charting.components.YAxis.YAxisLabelPosition INSIDE_CHART = null;
        public static final com.github.mikephil.charting.components.YAxis.YAxisLabelPosition OUTSIDE_CHART = null;

        static {
                com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r0 = new com.github.mikephil.charting.components.YAxis$YAxisLabelPosition
                java.lang.String r1 = "OUTSIDE_CHART"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART = r0
                com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r1 = new com.github.mikephil.charting.components.YAxis$YAxisLabelPosition
                java.lang.String r3 = "INSIDE_CHART"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.INSIDE_CHART = r1
                r3 = 2
                com.github.mikephil.charting.components.YAxis$YAxisLabelPosition[] r3 = new com.github.mikephil.charting.components.YAxis.YAxisLabelPosition[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.$VALUES = r3
                return
        }

        YAxisLabelPosition(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.YAxis.YAxisLabelPosition valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.YAxis$YAxisLabelPosition> r0 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r1 = (com.github.mikephil.charting.components.YAxis.YAxisLabelPosition) r1
                return r1
        }

        public static com.github.mikephil.charting.components.YAxis.YAxisLabelPosition[] values() {
                com.github.mikephil.charting.components.YAxis$YAxisLabelPosition[] r0 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.YAxis$YAxisLabelPosition[] r0 = (com.github.mikephil.charting.components.YAxis.YAxisLabelPosition[]) r0
                return r0
        }
    }

    public YAxis() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mDrawBottomYLabelEntry = r0
            r2.mDrawTopYLabelEntry = r0
            r0 = 0
            r2.mInverted = r0
            r2.mDrawZeroLine = r0
            r2.mUseAutoScaleRestrictionMin = r0
            r2.mUseAutoScaleRestrictionMax = r0
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r2.mZeroLineColor = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.mZeroLineWidth = r0
            r0 = 1092616192(0x41200000, float:10.0)
            r2.mSpacePercentTop = r0
            r2.mSpacePercentBottom = r0
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r0 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            r2.mPosition = r0
            r0 = 0
            r2.mMinWidth = r0
            r1 = 2139095040(0x7f800000, float:Infinity)
            r2.mMaxWidth = r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            r2.mAxisDependency = r1
            r2.mYOffset = r0
            return
    }

    public YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mDrawBottomYLabelEntry = r0
            r2.mDrawTopYLabelEntry = r0
            r0 = 0
            r2.mInverted = r0
            r2.mDrawZeroLine = r0
            r2.mUseAutoScaleRestrictionMin = r0
            r2.mUseAutoScaleRestrictionMax = r0
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r2.mZeroLineColor = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.mZeroLineWidth = r0
            r0 = 1092616192(0x41200000, float:10.0)
            r2.mSpacePercentTop = r0
            r2.mSpacePercentBottom = r0
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r0 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            r2.mPosition = r0
            r0 = 0
            r2.mMinWidth = r0
            r1 = 2139095040(0x7f800000, float:Infinity)
            r2.mMaxWidth = r1
            r2.mAxisDependency = r3
            r2.mYOffset = r0
            return
    }

    @Override // com.github.mikephil.charting.components.AxisBase
    public void calculate(float r5, float r6) {
            r4 = this;
            float r0 = r6 - r5
            float r0 = java.lang.Math.abs(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r0
            float r5 = r5 - r0
        Lf:
            float r0 = r6 - r5
            float r0 = java.lang.Math.abs(r0)
            boolean r1 = r4.mCustomAxisMin
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r1 == 0) goto L1e
            float r5 = r4.mAxisMinimum
            goto L27
        L1e:
            float r1 = r0 / r2
            float r3 = r4.getSpaceBottom()
            float r1 = r1 * r3
            float r5 = r5 - r1
        L27:
            r4.mAxisMinimum = r5
            boolean r5 = r4.mCustomAxisMax
            if (r5 == 0) goto L30
            float r5 = r4.mAxisMaximum
            goto L39
        L30:
            float r0 = r0 / r2
            float r5 = r4.getSpaceTop()
            float r0 = r0 * r5
            float r5 = r6 + r0
        L39:
            r4.mAxisMaximum = r5
            float r6 = r4.mAxisMinimum
            float r6 = r6 - r5
            float r5 = java.lang.Math.abs(r6)
            r4.mAxisRange = r5
            return
    }

    public com.github.mikephil.charting.components.YAxis.AxisDependency getAxisDependency() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r1.mAxisDependency
            return r0
    }

    public com.github.mikephil.charting.components.YAxis.YAxisLabelPosition getLabelPosition() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r0 = r1.mPosition
            return r0
    }

    public float getMaxWidth() {
            r1 = this;
            float r0 = r1.mMaxWidth
            return r0
    }

    public float getMinWidth() {
            r1 = this;
            float r0 = r1.mMinWidth
            return r0
    }

    public float getRequiredHeightSpace(android.graphics.Paint r3) {
            r2 = this;
            float r0 = r2.mTextSize
            r3.setTextSize(r0)
            java.lang.String r0 = r2.getLongestLabel()
            int r3 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r3, r0)
            float r3 = (float) r3
            float r0 = r2.getYOffset()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            float r3 = r3 + r0
            return r3
    }

    public float getRequiredWidthSpace(android.graphics.Paint r8) {
            r7 = this;
            float r0 = r7.mTextSize
            r8.setTextSize(r0)
            java.lang.String r0 = r7.getLongestLabel()
            int r8 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r8, r0)
            float r8 = (float) r8
            float r0 = r7.getXOffset()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            float r8 = r8 + r0
            float r0 = r7.getMinWidth()
            float r1 = r7.getMaxWidth()
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L28
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
        L28:
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L36
            r2 = 2139095040(0x7f800000, float:Infinity)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L36
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
        L36:
            double r2 = (double) r1
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3e
            goto L3f
        L3e:
            r1 = r8
        L3f:
            float r8 = java.lang.Math.min(r8, r1)
            float r8 = java.lang.Math.max(r0, r8)
            return r8
    }

    public float getSpaceBottom() {
            r1 = this;
            float r0 = r1.mSpacePercentBottom
            return r0
    }

    public float getSpaceTop() {
            r1 = this;
            float r0 = r1.mSpacePercentTop
            return r0
    }

    public int getZeroLineColor() {
            r1 = this;
            int r0 = r1.mZeroLineColor
            return r0
    }

    public float getZeroLineWidth() {
            r1 = this;
            float r0 = r1.mZeroLineWidth
            return r0
    }

    public boolean isDrawBottomYLabelEntryEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawBottomYLabelEntry
            return r0
    }

    public boolean isDrawTopYLabelEntryEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawTopYLabelEntry
            return r0
    }

    public boolean isDrawZeroLineEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawZeroLine
            return r0
    }

    public boolean isInverted() {
            r1 = this;
            boolean r0 = r1.mInverted
            return r0
    }

    @java.lang.Deprecated
    public boolean isUseAutoScaleMaxRestriction() {
            r1 = this;
            boolean r0 = r1.mUseAutoScaleRestrictionMax
            return r0
    }

    @java.lang.Deprecated
    public boolean isUseAutoScaleMinRestriction() {
            r1 = this;
            boolean r0 = r1.mUseAutoScaleRestrictionMin
            return r0
    }

    public boolean needsOffset() {
            r2 = this;
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L16
            boolean r0 = r2.isDrawLabelsEnabled()
            if (r0 == 0) goto L16
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r0 = r2.getLabelPosition()
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r1 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            if (r0 != r1) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public void setDrawTopYLabelEntry(boolean r1) {
            r0 = this;
            r0.mDrawTopYLabelEntry = r1
            return
    }

    public void setDrawZeroLine(boolean r1) {
            r0 = this;
            r0.mDrawZeroLine = r1
            return
    }

    public void setInverted(boolean r1) {
            r0 = this;
            r0.mInverted = r1
            return
    }

    public void setMaxWidth(float r1) {
            r0 = this;
            r0.mMaxWidth = r1
            return
    }

    public void setMinWidth(float r1) {
            r0 = this;
            r0.mMinWidth = r1
            return
    }

    public void setPosition(com.github.mikephil.charting.components.YAxis.YAxisLabelPosition r1) {
            r0 = this;
            r0.mPosition = r1
            return
    }

    public void setSpaceBottom(float r1) {
            r0 = this;
            r0.mSpacePercentBottom = r1
            return
    }

    public void setSpaceTop(float r1) {
            r0 = this;
            r0.mSpacePercentTop = r1
            return
    }

    @java.lang.Deprecated
    public void setStartAtZero(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            r1 = 0
            r0.setAxisMinimum(r1)
            return
        L7:
            r0.resetAxisMinimum()
            return
    }

    @java.lang.Deprecated
    public void setUseAutoScaleMaxRestriction(boolean r1) {
            r0 = this;
            r0.mUseAutoScaleRestrictionMax = r1
            return
    }

    @java.lang.Deprecated
    public void setUseAutoScaleMinRestriction(boolean r1) {
            r0 = this;
            r0.mUseAutoScaleRestrictionMin = r1
            return
    }

    public void setZeroLineColor(int r1) {
            r0 = this;
            r0.mZeroLineColor = r1
            return
    }

    public void setZeroLineWidth(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mZeroLineWidth = r1
            return
    }
}
