package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class LineDataSet extends com.github.mikephil.charting.data.LineRadarDataSet<com.github.mikephil.charting.data.Entry> implements com.github.mikephil.charting.interfaces.datasets.ILineDataSet {
    private java.util.List<java.lang.Integer> mCircleColors;
    private int mCircleHoleColor;
    private float mCircleHoleRadius;
    private float mCircleRadius;
    private float mCubicIntensity;
    private android.graphics.DashPathEffect mDashPathEffect;
    private boolean mDrawCircleHole;
    private boolean mDrawCircles;
    private com.github.mikephil.charting.formatter.IFillFormatter mFillFormatter;
    private com.github.mikephil.charting.data.LineDataSet.Mode mMode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Mode extends java.lang.Enum<com.github.mikephil.charting.data.LineDataSet.Mode> {
        private static final /* synthetic */ com.github.mikephil.charting.data.LineDataSet.Mode[] $VALUES = null;
        public static final com.github.mikephil.charting.data.LineDataSet.Mode CUBIC_BEZIER = null;
        public static final com.github.mikephil.charting.data.LineDataSet.Mode HORIZONTAL_BEZIER = null;
        public static final com.github.mikephil.charting.data.LineDataSet.Mode LINEAR = null;
        public static final com.github.mikephil.charting.data.LineDataSet.Mode STEPPED = null;

        static {
                com.github.mikephil.charting.data.LineDataSet$Mode r0 = new com.github.mikephil.charting.data.LineDataSet$Mode
                java.lang.String r1 = "LINEAR"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR = r0
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = new com.github.mikephil.charting.data.LineDataSet$Mode
                java.lang.String r3 = "STEPPED"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED = r1
                com.github.mikephil.charting.data.LineDataSet$Mode r3 = new com.github.mikephil.charting.data.LineDataSet$Mode
                java.lang.String r5 = "CUBIC_BEZIER"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER = r3
                com.github.mikephil.charting.data.LineDataSet$Mode r5 = new com.github.mikephil.charting.data.LineDataSet$Mode
                java.lang.String r7 = "HORIZONTAL_BEZIER"
                r8 = 3
                r5.<init>(r7, r8)
                com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER = r5
                r7 = 4
                com.github.mikephil.charting.data.LineDataSet$Mode[] r7 = new com.github.mikephil.charting.data.LineDataSet.Mode[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.github.mikephil.charting.data.LineDataSet.Mode.$VALUES = r7
                return
        }

        Mode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.data.LineDataSet.Mode valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.data.LineDataSet$Mode> r0 = com.github.mikephil.charting.data.LineDataSet.Mode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = (com.github.mikephil.charting.data.LineDataSet.Mode) r1
                return r1
        }

        public static com.github.mikephil.charting.data.LineDataSet.Mode[] values() {
                com.github.mikephil.charting.data.LineDataSet$Mode[] r0 = com.github.mikephil.charting.data.LineDataSet.Mode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.data.LineDataSet$Mode[] r0 = (com.github.mikephil.charting.data.LineDataSet.Mode[]) r0
                return r0
        }
    }

    public LineDataSet(java.util.List<com.github.mikephil.charting.data.Entry> r3, java.lang.String r4) {
            r2 = this;
            r2.<init>(r3, r4)
            com.github.mikephil.charting.data.LineDataSet$Mode r3 = com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR
            r2.mMode = r3
            r3 = 0
            r2.mCircleColors = r3
            r4 = -1
            r2.mCircleHoleColor = r4
            r4 = 1090519040(0x41000000, float:8.0)
            r2.mCircleRadius = r4
            r4 = 1082130432(0x40800000, float:4.0)
            r2.mCircleHoleRadius = r4
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r2.mCubicIntensity = r4
            r2.mDashPathEffect = r3
            com.github.mikephil.charting.formatter.DefaultFillFormatter r3 = new com.github.mikephil.charting.formatter.DefaultFillFormatter
            r3.<init>()
            r2.mFillFormatter = r3
            r3 = 1
            r2.mDrawCircles = r3
            r2.mDrawCircleHole = r3
            java.util.List<java.lang.Integer> r3 = r2.mCircleColors
            if (r3 != 0) goto L33
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mCircleColors = r3
        L33:
            java.util.List<java.lang.Integer> r3 = r2.mCircleColors
            r3.clear()
            java.util.List<java.lang.Integer> r3 = r2.mCircleColors
            r4 = 234(0xea, float:3.28E-43)
            r0 = 255(0xff, float:3.57E-43)
            r1 = 140(0x8c, float:1.96E-43)
            int r4 = android.graphics.Color.rgb(r1, r4, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.Entry> copy() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r3.mValues
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r3.mValues
            java.lang.Object r2 = r2.get(r1)
            com.github.mikephil.charting.data.Entry r2 = (com.github.mikephil.charting.data.Entry) r2
            com.github.mikephil.charting.data.Entry r2 = r2.copy()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L20:
            com.github.mikephil.charting.data.LineDataSet r1 = new com.github.mikephil.charting.data.LineDataSet
            java.lang.String r2 = r3.getLabel()
            r1.<init>(r0, r2)
            r3.copy(r1)
            return r1
    }

    protected void copy(com.github.mikephil.charting.data.LineDataSet r2) {
            r1 = this;
            super.copy(r2)
            java.util.List<java.lang.Integer> r0 = r1.mCircleColors
            r2.mCircleColors = r0
            int r0 = r1.mCircleHoleColor
            r2.mCircleHoleColor = r0
            float r0 = r1.mCircleHoleRadius
            r2.mCircleHoleRadius = r0
            float r0 = r1.mCircleRadius
            r2.mCircleRadius = r0
            float r0 = r1.mCubicIntensity
            r2.mCubicIntensity = r0
            android.graphics.DashPathEffect r0 = r1.mDashPathEffect
            r2.mDashPathEffect = r0
            boolean r0 = r1.mDrawCircleHole
            r2.mDrawCircleHole = r0
            boolean r0 = r1.mDrawCircleHole
            r2.mDrawCircles = r0
            com.github.mikephil.charting.formatter.IFillFormatter r0 = r1.mFillFormatter
            r2.mFillFormatter = r0
            com.github.mikephil.charting.data.LineDataSet$Mode r0 = r1.mMode
            r2.mMode = r0
            return
    }

    public void disableDashedLine() {
            r1 = this;
            r0 = 0
            r1.mDashPathEffect = r0
            return
    }

    public void enableDashedLine(float r4, float r5, float r6) {
            r3 = this;
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.<init>(r1, r6)
            r3.mDashPathEffect = r0
            return
    }

    public int getCircleColor(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mCircleColors
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public int getCircleColorCount() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mCircleColors
            int r0 = r0.size()
            return r0
    }

    public java.util.List<java.lang.Integer> getCircleColors() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mCircleColors
            return r0
    }

    public int getCircleHoleColor() {
            r1 = this;
            int r0 = r1.mCircleHoleColor
            return r0
    }

    public float getCircleHoleRadius() {
            r1 = this;
            float r0 = r1.mCircleHoleRadius
            return r0
    }

    public float getCircleRadius() {
            r1 = this;
            float r0 = r1.mCircleRadius
            return r0
    }

    @java.lang.Deprecated
    public float getCircleSize() {
            r1 = this;
            float r0 = r1.getCircleRadius()
            return r0
    }

    public float getCubicIntensity() {
            r1 = this;
            float r0 = r1.mCubicIntensity
            return r0
    }

    public android.graphics.DashPathEffect getDashPathEffect() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mDashPathEffect
            return r0
    }

    public com.github.mikephil.charting.formatter.IFillFormatter getFillFormatter() {
            r1 = this;
            com.github.mikephil.charting.formatter.IFillFormatter r0 = r1.mFillFormatter
            return r0
    }

    public com.github.mikephil.charting.data.LineDataSet.Mode getMode() {
            r1 = this;
            com.github.mikephil.charting.data.LineDataSet$Mode r0 = r1.mMode
            return r0
    }

    public boolean isDashedLineEnabled() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mDashPathEffect
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    public boolean isDrawCircleHoleEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawCircleHole
            return r0
    }

    public boolean isDrawCirclesEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawCircles
            return r0
    }

    @java.lang.Deprecated
    public boolean isDrawCubicEnabled() {
            r2 = this;
            com.github.mikephil.charting.data.LineDataSet$Mode r0 = r2.mMode
            com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public boolean isDrawSteppedEnabled() {
            r2 = this;
            com.github.mikephil.charting.data.LineDataSet$Mode r0 = r2.mMode
            com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public void resetCircleColors() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mCircleColors
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mCircleColors = r0
        Lb:
            java.util.List<java.lang.Integer> r0 = r1.mCircleColors
            r0.clear()
            return
    }

    public void setCircleColor(int r2) {
            r1 = this;
            r1.resetCircleColors()
            java.util.List<java.lang.Integer> r0 = r1.mCircleColors
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            return
    }

    public void setCircleColors(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.mCircleColors = r1
            return
    }

    public void setCircleColors(int... r1) {
            r0 = this;
            java.util.List r1 = com.github.mikephil.charting.utils.ColorTemplate.createColors(r1)
            r0.mCircleColors = r1
            return
    }

    public void setCircleColors(int[] r6, android.content.Context r7) {
            r5 = this;
            java.util.List<java.lang.Integer> r0 = r5.mCircleColors
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            r0.clear()
            int r1 = r6.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L24
            r3 = r6[r2]
            android.content.res.Resources r4 = r7.getResources()
            int r3 = r4.getColor(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Le
        L24:
            r5.mCircleColors = r0
            return
    }

    public void setCircleHoleColor(int r1) {
            r0 = this;
            r0.mCircleHoleColor = r1
            return
    }

    public void setCircleHoleRadius(float r2) {
            r1 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r1.mCircleHoleRadius = r2
        Lc:
            return
    }

    public void setCircleRadius(float r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r1.mCircleRadius = r2
        Lc:
            return
    }

    @java.lang.Deprecated
    public void setCircleSize(float r1) {
            r0 = this;
            r0.setCircleRadius(r1)
            return
    }

    public void setCubicIntensity(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
            r3 = 1065353216(0x3f800000, float:1.0)
        L8:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L12
            r3 = 1028443341(0x3d4ccccd, float:0.05)
        L12:
            r2.mCubicIntensity = r3
            return
    }

    public void setDrawCircleHole(boolean r1) {
            r0 = this;
            r0.mDrawCircleHole = r1
            return
    }

    public void setDrawCircles(boolean r1) {
            r0 = this;
            r0.mDrawCircles = r1
            return
    }

    public void setFillFormatter(com.github.mikephil.charting.formatter.IFillFormatter r1) {
            r0 = this;
            if (r1 != 0) goto La
            com.github.mikephil.charting.formatter.DefaultFillFormatter r1 = new com.github.mikephil.charting.formatter.DefaultFillFormatter
            r1.<init>()
            r0.mFillFormatter = r1
            return
        La:
            r0.mFillFormatter = r1
            return
    }

    public void setMode(com.github.mikephil.charting.data.LineDataSet.Mode r1) {
            r0 = this;
            r0.mMode = r1
            return
    }
}
