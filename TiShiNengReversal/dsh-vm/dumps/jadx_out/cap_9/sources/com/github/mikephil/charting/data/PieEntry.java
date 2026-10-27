package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ParcelCreator"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PieEntry extends com.github.mikephil.charting.data.Entry {
    private java.lang.String label;

    public PieEntry(float r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public PieEntry(float r2, android.graphics.drawable.Drawable r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public PieEntry(float r2, android.graphics.drawable.Drawable r3, java.lang.Object r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public PieEntry(float r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public PieEntry(float r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            r1.label = r3
            return
    }

    public PieEntry(float r2, java.lang.String r3, android.graphics.drawable.Drawable r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r4)
            r1.label = r3
            return
    }

    public PieEntry(float r2, java.lang.String r3, android.graphics.drawable.Drawable r4, java.lang.Object r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r4, r5)
            r1.label = r3
            return
    }

    public PieEntry(float r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r4)
            r1.label = r3
            return
    }

    public /* bridge */ /* synthetic */ com.github.mikephil.charting.data.Entry copy() {
            r1 = this;
            com.github.mikephil.charting.data.PieEntry r0 = r1.m0copy()
            return r0
    }

    /* renamed from: copy, reason: collision with other method in class */
    public com.github.mikephil.charting.data.PieEntry m0copy() {
            r4 = this;
            com.github.mikephil.charting.data.PieEntry r0 = new com.github.mikephil.charting.data.PieEntry
            float r1 = r4.getY()
            java.lang.String r2 = r4.label
            java.lang.Object r3 = r4.getData()
            r0.<init>(r1, r2, r3)
            return r0
    }

    public java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public float getValue() {
            r1 = this;
            float r0 = r1.getY()
            return r0
    }

    @java.lang.Deprecated
    public float getX() {
            r1 = this;
            float r0 = super.getX()
            return r0
    }

    public void setLabel(java.lang.String r1) {
            r0 = this;
            r0.label = r1
            return
    }

    @java.lang.Deprecated
    public void setX(float r1) {
            r0 = this;
            super.setX(r1)
            return
    }
}
