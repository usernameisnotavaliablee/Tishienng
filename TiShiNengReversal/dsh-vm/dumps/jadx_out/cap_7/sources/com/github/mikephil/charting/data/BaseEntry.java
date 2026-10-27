package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class BaseEntry {
    private java.lang.Object mData;
    private android.graphics.drawable.Drawable mIcon;
    private float y;

    public BaseEntry() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.y = r0
            r0 = 0
            r1.mData = r0
            r1.mIcon = r0
            return
    }

    public BaseEntry(float r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mData = r0
            r1.mIcon = r0
            r1.y = r2
            return
    }

    public BaseEntry(float r1, android.graphics.drawable.Drawable r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mIcon = r2
            return
    }

    public BaseEntry(float r1, android.graphics.drawable.Drawable r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mIcon = r2
            r0.mData = r3
            return
    }

    public BaseEntry(float r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mData = r2
            return
    }

    public java.lang.Object getData() {
            r1 = this;
            java.lang.Object r0 = r1.mData
            return r0
    }

    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mIcon
            return r0
    }

    public float getY() {
            r1 = this;
            float r0 = r1.y
            return r0
    }

    public void setData(java.lang.Object r1) {
            r0 = this;
            r0.mData = r1
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mIcon = r1
            return
    }

    public void setY(float r1) {
            r0 = this;
            r0.y = r1
            return
    }
}
