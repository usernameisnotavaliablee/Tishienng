package com.github.mikephil.charting.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class AbstractBuffer<T> {
    public final float[] buffer;
    protected int index;
    protected int mFrom;
    protected int mTo;
    protected float phaseX;
    protected float phaseY;

    public AbstractBuffer(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.phaseX = r0
            r1.phaseY = r0
            r0 = 0
            r1.mFrom = r0
            r1.mTo = r0
            r1.index = r0
            float[] r2 = new float[r2]
            r1.buffer = r2
            return
    }

    public abstract void feed(T r1);

    public void limitFrom(int r1) {
            r0 = this;
            if (r1 >= 0) goto L3
            r1 = 0
        L3:
            r0.mFrom = r1
            return
    }

    public void limitTo(int r1) {
            r0 = this;
            if (r1 >= 0) goto L3
            r1 = 0
        L3:
            r0.mTo = r1
            return
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.index = r0
            return
    }

    public void setPhases(float r1, float r2) {
            r0 = this;
            r0.phaseX = r1
            r0.phaseY = r2
            return
    }

    public int size() {
            r1 = this;
            float[] r0 = r1.buffer
            int r0 = r0.length
            return r0
    }
}
