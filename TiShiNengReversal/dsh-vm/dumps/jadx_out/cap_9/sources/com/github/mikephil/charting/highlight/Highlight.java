package com.github.mikephil.charting.highlight;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Highlight {
    private com.github.mikephil.charting.components.YAxis.AxisDependency axis;
    private int mDataIndex;
    private int mDataSetIndex;
    private float mDrawX;
    private float mDrawY;
    private int mStackIndex;
    private float mX;
    private float mXPx;
    private float mY;
    private float mYPx;

    public Highlight(float r8, float r9, float r10, float r11, int r12, int r13, com.github.mikephil.charting.components.YAxis.AxisDependency r14) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.mStackIndex = r13
            return
    }

    public Highlight(float r2, float r3, float r4, float r5, int r6, com.github.mikephil.charting.components.YAxis.AxisDependency r7) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mDataIndex = r0
            r1.mStackIndex = r0
            r1.mX = r2
            r1.mY = r3
            r1.mXPx = r4
            r1.mYPx = r5
            r1.mDataSetIndex = r6
            r1.axis = r7
            return
    }

    public Highlight(float r2, float r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mDataIndex = r0
            r1.mStackIndex = r0
            r1.mX = r2
            r1.mY = r3
            r1.mDataSetIndex = r4
            return
    }

    public Highlight(float r2, int r3, int r4) {
            r1 = this;
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.<init>(r2, r0, r3)
            r1.mStackIndex = r4
            return
    }

    public boolean equalTo(com.github.mikephil.charting.highlight.Highlight r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.mDataSetIndex
            int r2 = r4.mDataSetIndex
            if (r1 != r2) goto L20
            float r1 = r3.mX
            float r2 = r4.mX
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L20
            int r1 = r3.mStackIndex
            int r2 = r4.mStackIndex
            if (r1 != r2) goto L20
            int r1 = r3.mDataIndex
            int r4 = r4.mDataIndex
            if (r1 != r4) goto L20
            r4 = 1
            return r4
        L20:
            return r0
    }

    public com.github.mikephil.charting.components.YAxis.AxisDependency getAxis() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r1.axis
            return r0
    }

    public int getDataIndex() {
            r1 = this;
            int r0 = r1.mDataIndex
            return r0
    }

    public int getDataSetIndex() {
            r1 = this;
            int r0 = r1.mDataSetIndex
            return r0
    }

    public float getDrawX() {
            r1 = this;
            float r0 = r1.mDrawX
            return r0
    }

    public float getDrawY() {
            r1 = this;
            float r0 = r1.mDrawY
            return r0
    }

    public int getStackIndex() {
            r1 = this;
            int r0 = r1.mStackIndex
            return r0
    }

    public float getX() {
            r1 = this;
            float r0 = r1.mX
            return r0
    }

    public float getXPx() {
            r1 = this;
            float r0 = r1.mXPx
            return r0
    }

    public float getY() {
            r1 = this;
            float r0 = r1.mY
            return r0
    }

    public float getYPx() {
            r1 = this;
            float r0 = r1.mYPx
            return r0
    }

    public boolean isStacked() {
            r1 = this;
            int r0 = r1.mStackIndex
            if (r0 < 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void setDataIndex(int r1) {
            r0 = this;
            r0.mDataIndex = r1
            return
    }

    public void setDraw(float r1, float r2) {
            r0 = this;
            r0.mDrawX = r1
            r0.mDrawY = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Highlight, x: "
            r0.append(r1)
            float r1 = r2.mX
            r0.append(r1)
            java.lang.String r1 = ", y: "
            r0.append(r1)
            float r1 = r2.mY
            r0.append(r1)
            java.lang.String r1 = ", dataSetIndex: "
            r0.append(r1)
            int r1 = r2.mDataSetIndex
            r0.append(r1)
            java.lang.String r1 = ", stackIndex (only stacked barentry): "
            r0.append(r1)
            int r1 = r2.mStackIndex
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
