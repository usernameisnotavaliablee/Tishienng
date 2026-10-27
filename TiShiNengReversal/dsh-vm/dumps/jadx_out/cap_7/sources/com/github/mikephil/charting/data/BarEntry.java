package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ParcelCreator"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BarEntry extends com.github.mikephil.charting.data.Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private com.github.mikephil.charting.highlight.Range[] mRanges;
    private float[] mYVals;

    public BarEntry(float r1, float r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public BarEntry(float r1, float r2, android.graphics.drawable.Drawable r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public BarEntry(float r1, float r2, android.graphics.drawable.Drawable r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public BarEntry(float r1, float r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public BarEntry(float r2, float[] r3) {
            r1 = this;
            float r0 = calcSum(r3)
            r1.<init>(r2, r0)
            r1.mYVals = r3
            r1.calcPosNegSum()
            r1.calcRanges()
            return
    }

    public BarEntry(float r2, float[] r3, android.graphics.drawable.Drawable r4) {
            r1 = this;
            float r0 = calcSum(r3)
            r1.<init>(r2, r0, r4)
            r1.mYVals = r3
            r1.calcPosNegSum()
            r1.calcRanges()
            return
    }

    public BarEntry(float r2, float[] r3, android.graphics.drawable.Drawable r4, java.lang.Object r5) {
            r1 = this;
            float r0 = calcSum(r3)
            r1.<init>(r2, r0, r4, r5)
            r1.mYVals = r3
            r1.calcPosNegSum()
            r1.calcRanges()
            return
    }

    public BarEntry(float r2, float[] r3, java.lang.Object r4) {
            r1 = this;
            float r0 = calcSum(r3)
            r1.<init>(r2, r0, r4)
            r1.mYVals = r3
            r1.calcPosNegSum()
            r1.calcRanges()
            return
    }

    private void calcPosNegSum() {
            r8 = this;
            float[] r0 = r8.mYVals
            r1 = 0
            if (r0 != 0) goto La
            r8.mNegativeSum = r1
            r8.mPositiveSum = r1
            return
        La:
            int r2 = r0.length
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            if (r3 >= r2) goto L20
            r6 = r0[r3]
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 > 0) goto L1c
            float r6 = java.lang.Math.abs(r6)
            float r4 = r4 + r6
            goto L1d
        L1c:
            float r5 = r5 + r6
        L1d:
            int r3 = r3 + 1
            goto Le
        L20:
            r8.mNegativeSum = r4
            r8.mPositiveSum = r5
            return
    }

    private static float calcSum(float[] r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            r2 = 0
        L6:
            if (r2 >= r1) goto Le
            r3 = r4[r2]
            float r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        Le:
            return r0
    }

    protected void calcRanges() {
            r8 = this;
            float[] r0 = r8.getYVals()
            if (r0 == 0) goto L39
            int r1 = r0.length
            if (r1 != 0) goto La
            goto L39
        La:
            int r1 = r0.length
            com.github.mikephil.charting.highlight.Range[] r1 = new com.github.mikephil.charting.highlight.Range[r1]
            r8.mRanges = r1
            float r1 = r8.getNegativeSum()
            float r1 = -r1
            r2 = 0
            r3 = 0
            r4 = 0
        L17:
            com.github.mikephil.charting.highlight.Range[] r5 = r8.mRanges
            int r6 = r5.length
            if (r3 >= r6) goto L39
            r6 = r0[r3]
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 >= 0) goto L2d
            com.github.mikephil.charting.highlight.Range r7 = new com.github.mikephil.charting.highlight.Range
            float r6 = r1 - r6
            r7.<init>(r1, r6)
            r5[r3] = r7
            r1 = r6
            goto L36
        L2d:
            com.github.mikephil.charting.highlight.Range r7 = new com.github.mikephil.charting.highlight.Range
            float r6 = r6 + r4
            r7.<init>(r4, r6)
            r5[r3] = r7
            r4 = r6
        L36:
            int r3 = r3 + 1
            goto L17
        L39:
            return
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.BarEntry copy() {
            r4 = this;
            com.github.mikephil.charting.data.BarEntry r0 = new com.github.mikephil.charting.data.BarEntry
            float r1 = r4.getX()
            float r2 = r4.getY()
            java.lang.Object r3 = r4.getData()
            r0.<init>(r1, r2, r3)
            float[] r1 = r4.mYVals
            r0.setVals(r1)
            return r0
    }

    @Override // com.github.mikephil.charting.data.Entry
    public /* bridge */ /* synthetic */ com.github.mikephil.charting.data.Entry copy() {
            r1 = this;
            com.github.mikephil.charting.data.BarEntry r0 = r1.copy()
            return r0
    }

    @java.lang.Deprecated
    public float getBelowSum(int r1) {
            r0 = this;
            float r1 = r0.getSumBelow(r1)
            return r1
    }

    public float getNegativeSum() {
            r1 = this;
            float r0 = r1.mNegativeSum
            return r0
    }

    public float getPositiveSum() {
            r1 = this;
            float r0 = r1.mPositiveSum
            return r0
    }

    public com.github.mikephil.charting.highlight.Range[] getRanges() {
            r1 = this;
            com.github.mikephil.charting.highlight.Range[] r0 = r1.mRanges
            return r0
    }

    public float getSumBelow(int r4) {
            r3 = this;
            float[] r0 = r3.mYVals
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.length
            int r0 = r0 + (-1)
        L9:
            if (r0 <= r4) goto L15
            if (r0 < 0) goto L15
            float[] r2 = r3.mYVals
            r2 = r2[r0]
            float r1 = r1 + r2
            int r0 = r0 + (-1)
            goto L9
        L15:
            return r1
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
            r1 = this;
            float r0 = super.getY()
            return r0
    }

    public float[] getYVals() {
            r1 = this;
            float[] r0 = r1.mYVals
            return r0
    }

    public boolean isStacked() {
            r1 = this;
            float[] r0 = r1.mYVals
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void setVals(float[] r2) {
            r1 = this;
            float r0 = calcSum(r2)
            r1.setY(r0)
            r1.mYVals = r2
            r1.calcPosNegSum()
            r1.calcRanges()
            return
    }
}
