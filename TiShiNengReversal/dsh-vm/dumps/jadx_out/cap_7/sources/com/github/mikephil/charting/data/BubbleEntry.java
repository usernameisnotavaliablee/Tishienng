package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ParcelCreator"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BubbleEntry extends com.github.mikephil.charting.data.Entry {
    private float mSize;

    public BubbleEntry(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mSize = r3
            return
    }

    public BubbleEntry(float r1, float r2, float r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            r0.mSize = r3
            return
    }

    public BubbleEntry(float r1, float r2, float r3, android.graphics.drawable.Drawable r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>(r1, r2, r4, r5)
            r0.mSize = r3
            return
    }

    public BubbleEntry(float r1, float r2, float r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            r0.mSize = r3
            return
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.BubbleEntry copy() {
            r5 = this;
            com.github.mikephil.charting.data.BubbleEntry r0 = new com.github.mikephil.charting.data.BubbleEntry
            float r1 = r5.getX()
            float r2 = r5.getY()
            float r3 = r5.mSize
            java.lang.Object r4 = r5.getData()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // com.github.mikephil.charting.data.Entry
    public /* bridge */ /* synthetic */ com.github.mikephil.charting.data.Entry copy() {
            r1 = this;
            com.github.mikephil.charting.data.BubbleEntry r0 = r1.copy()
            return r0
    }

    public float getSize() {
            r1 = this;
            float r0 = r1.mSize
            return r0
    }

    public void setSize(float r1) {
            r0 = this;
            r0.mSize = r1
            return
    }
}
