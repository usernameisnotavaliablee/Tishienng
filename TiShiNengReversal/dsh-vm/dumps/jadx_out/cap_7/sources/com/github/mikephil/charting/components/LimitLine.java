package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class LimitLine extends com.github.mikephil.charting.components.ComponentBase {
    private android.graphics.DashPathEffect mDashPathEffect;
    private java.lang.String mLabel;
    private com.github.mikephil.charting.components.LimitLine.LimitLabelPosition mLabelPosition;
    private float mLimit;
    private int mLineColor;
    private float mLineWidth;
    private android.graphics.Paint.Style mTextStyle;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LimitLabelPosition extends java.lang.Enum<com.github.mikephil.charting.components.LimitLine.LimitLabelPosition> {
        private static final /* synthetic */ com.github.mikephil.charting.components.LimitLine.LimitLabelPosition[] $VALUES = null;
        public static final com.github.mikephil.charting.components.LimitLine.LimitLabelPosition LEFT_BOTTOM = null;
        public static final com.github.mikephil.charting.components.LimitLine.LimitLabelPosition LEFT_TOP = null;
        public static final com.github.mikephil.charting.components.LimitLine.LimitLabelPosition RIGHT_BOTTOM = null;
        public static final com.github.mikephil.charting.components.LimitLine.LimitLabelPosition RIGHT_TOP = null;

        static {
                com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r0 = new com.github.mikephil.charting.components.LimitLine$LimitLabelPosition
                java.lang.String r1 = "LEFT_TOP"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP = r0
                com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r1 = new com.github.mikephil.charting.components.LimitLine$LimitLabelPosition
                java.lang.String r3 = "LEFT_BOTTOM"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_BOTTOM = r1
                com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r3 = new com.github.mikephil.charting.components.LimitLine$LimitLabelPosition
                java.lang.String r5 = "RIGHT_TOP"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP = r3
                com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r5 = new com.github.mikephil.charting.components.LimitLine$LimitLabelPosition
                java.lang.String r7 = "RIGHT_BOTTOM"
                r8 = 3
                r5.<init>(r7, r8)
                com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM = r5
                r7 = 4
                com.github.mikephil.charting.components.LimitLine$LimitLabelPosition[] r7 = new com.github.mikephil.charting.components.LimitLine.LimitLabelPosition[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.$VALUES = r7
                return
        }

        LimitLabelPosition(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.LimitLine.LimitLabelPosition valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.LimitLine$LimitLabelPosition> r0 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r1 = (com.github.mikephil.charting.components.LimitLine.LimitLabelPosition) r1
                return r1
        }

        public static com.github.mikephil.charting.components.LimitLine.LimitLabelPosition[] values() {
                com.github.mikephil.charting.components.LimitLine$LimitLabelPosition[] r0 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.LimitLine$LimitLabelPosition[] r0 = (com.github.mikephil.charting.components.LimitLine.LimitLabelPosition[]) r0
                return r0
        }
    }

    public LimitLine(float r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mLimit = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r2.mLineWidth = r0
            r0 = 237(0xed, float:3.32E-43)
            r1 = 91
            int r0 = android.graphics.Color.rgb(r0, r1, r1)
            r2.mLineColor = r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.mTextStyle = r0
            java.lang.String r0 = ""
            r2.mLabel = r0
            r0 = 0
            r2.mDashPathEffect = r0
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r0 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP
            r2.mLabelPosition = r0
            r2.mLimit = r3
            return
    }

    public LimitLine(float r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mLimit = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r2.mLineWidth = r0
            r0 = 237(0xed, float:3.32E-43)
            r1 = 91
            int r0 = android.graphics.Color.rgb(r0, r1, r1)
            r2.mLineColor = r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.mTextStyle = r0
            java.lang.String r0 = ""
            r2.mLabel = r0
            r0 = 0
            r2.mDashPathEffect = r0
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r0 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP
            r2.mLabelPosition = r0
            r2.mLimit = r3
            r2.mLabel = r4
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

    public android.graphics.DashPathEffect getDashPathEffect() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mDashPathEffect
            return r0
    }

    public java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.mLabel
            return r0
    }

    public com.github.mikephil.charting.components.LimitLine.LimitLabelPosition getLabelPosition() {
            r1 = this;
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r0 = r1.mLabelPosition
            return r0
    }

    public float getLimit() {
            r1 = this;
            float r0 = r1.mLimit
            return r0
    }

    public int getLineColor() {
            r1 = this;
            int r0 = r1.mLineColor
            return r0
    }

    public float getLineWidth() {
            r1 = this;
            float r0 = r1.mLineWidth
            return r0
    }

    public android.graphics.Paint.Style getTextStyle() {
            r1 = this;
            android.graphics.Paint$Style r0 = r1.mTextStyle
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

    public void setLabel(java.lang.String r1) {
            r0 = this;
            r0.mLabel = r1
            return
    }

    public void setLabelPosition(com.github.mikephil.charting.components.LimitLine.LimitLabelPosition r1) {
            r0 = this;
            r0.mLabelPosition = r1
            return
    }

    public void setLineColor(int r1) {
            r0 = this;
            r0.mLineColor = r1
            return
    }

    public void setLineWidth(float r3) {
            r2 = this;
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r3 = 1045220557(0x3e4ccccd, float:0.2)
        La:
            r0 = 1094713344(0x41400000, float:12.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L12
            r3 = 1094713344(0x41400000, float:12.0)
        L12:
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.mLineWidth = r3
            return
    }

    public void setTextStyle(android.graphics.Paint.Style r1) {
            r0 = this;
            r0.mTextStyle = r1
            return
    }
}
