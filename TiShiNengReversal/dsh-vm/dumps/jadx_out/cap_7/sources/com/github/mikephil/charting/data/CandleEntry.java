package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ParcelCreator"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class CandleEntry extends com.github.mikephil.charting.data.Entry {
    private float mClose;
    private float mOpen;
    private float mShadowHigh;
    private float mShadowLow;

    public CandleEntry(float r3, float r4, float r5, float r6, float r7) {
            r2 = this;
            float r0 = r4 + r5
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2.<init>(r3, r0)
            r2.mShadowHigh = r4
            r2.mShadowLow = r5
            r2.mOpen = r6
            r2.mClose = r7
            return
    }

    public CandleEntry(float r3, float r4, float r5, float r6, float r7, android.graphics.drawable.Drawable r8) {
            r2 = this;
            float r0 = r4 + r5
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2.<init>(r3, r0, r8)
            r2.mShadowHigh = r4
            r2.mShadowLow = r5
            r2.mOpen = r6
            r2.mClose = r7
            return
    }

    public CandleEntry(float r3, float r4, float r5, float r6, float r7, android.graphics.drawable.Drawable r8, java.lang.Object r9) {
            r2 = this;
            float r0 = r4 + r5
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2.<init>(r3, r0, r8, r9)
            r2.mShadowHigh = r4
            r2.mShadowLow = r5
            r2.mOpen = r6
            r2.mClose = r7
            return
    }

    public CandleEntry(float r3, float r4, float r5, float r6, float r7, java.lang.Object r8) {
            r2 = this;
            float r0 = r4 + r5
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2.<init>(r3, r0, r8)
            r2.mShadowHigh = r4
            r2.mShadowLow = r5
            r2.mOpen = r6
            r2.mClose = r7
            return
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.CandleEntry copy() {
            r7 = this;
            com.github.mikephil.charting.data.CandleEntry r0 = new com.github.mikephil.charting.data.CandleEntry
            float r1 = r7.getX()
            float r2 = r7.mShadowHigh
            float r3 = r7.mShadowLow
            float r4 = r7.mOpen
            float r5 = r7.mClose
            java.lang.Object r6 = r7.getData()
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // com.github.mikephil.charting.data.Entry
    public /* bridge */ /* synthetic */ com.github.mikephil.charting.data.Entry copy() {
            r1 = this;
            com.github.mikephil.charting.data.CandleEntry r0 = r1.copy()
            return r0
    }

    public float getBodyRange() {
            r2 = this;
            float r0 = r2.mOpen
            float r1 = r2.mClose
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            return r0
    }

    public float getClose() {
            r1 = this;
            float r0 = r1.mClose
            return r0
    }

    public float getHigh() {
            r1 = this;
            float r0 = r1.mShadowHigh
            return r0
    }

    public float getLow() {
            r1 = this;
            float r0 = r1.mShadowLow
            return r0
    }

    public float getOpen() {
            r1 = this;
            float r0 = r1.mOpen
            return r0
    }

    public float getShadowRange() {
            r2 = this;
            float r0 = r2.mShadowHigh
            float r1 = r2.mShadowLow
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            return r0
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
            r1 = this;
            float r0 = super.getY()
            return r0
    }

    public void setClose(float r1) {
            r0 = this;
            r0.mClose = r1
            return
    }

    public void setHigh(float r1) {
            r0 = this;
            r0.mShadowHigh = r1
            return
    }

    public void setLow(float r1) {
            r0 = this;
            r0.mShadowLow = r1
            return
    }

    public void setOpen(float r1) {
            r0 = this;
            r0.mOpen = r1
            return
    }
}
