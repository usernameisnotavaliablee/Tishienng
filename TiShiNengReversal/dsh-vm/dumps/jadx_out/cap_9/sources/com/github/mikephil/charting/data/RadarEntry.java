package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ParcelCreator"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RadarEntry extends com.github.mikephil.charting.data.Entry {
    public RadarEntry(float r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public RadarEntry(float r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public /* bridge */ /* synthetic */ com.github.mikephil.charting.data.Entry copy() {
            r1 = this;
            com.github.mikephil.charting.data.RadarEntry r0 = r1.m1copy()
            return r0
    }

    /* renamed from: copy, reason: collision with other method in class */
    public com.github.mikephil.charting.data.RadarEntry m1copy() {
            r3 = this;
            com.github.mikephil.charting.data.RadarEntry r0 = new com.github.mikephil.charting.data.RadarEntry
            float r1 = r3.getY()
            java.lang.Object r2 = r3.getData()
            r0.<init>(r1, r2)
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

    @java.lang.Deprecated
    public void setX(float r1) {
            r0 = this;
            super.setX(r1)
            return
    }
}
