package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class ComponentBase {
    protected boolean mEnabled;
    protected int mTextColor;
    protected float mTextSize;
    protected android.graphics.Typeface mTypeface;
    protected float mXOffset;
    protected float mYOffset;

    public ComponentBase() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mEnabled = r0
            r0 = 1084227584(0x40a00000, float:5.0)
            r1.mXOffset = r0
            r1.mYOffset = r0
            r0 = 0
            r1.mTypeface = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r1.mTextSize = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.mTextColor = r0
            return
    }

    public int getTextColor() {
            r1 = this;
            int r0 = r1.mTextColor
            return r0
    }

    public float getTextSize() {
            r1 = this;
            float r0 = r1.mTextSize
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.mTypeface
            return r0
    }

    public float getXOffset() {
            r1 = this;
            float r0 = r1.mXOffset
            return r0
    }

    public float getYOffset() {
            r1 = this;
            float r0 = r1.mYOffset
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0.mEnabled = r1
            return
    }

    public void setTextColor(int r1) {
            r0 = this;
            r0.mTextColor = r1
            return
    }

    public void setTextSize(float r3) {
            r2 = this;
            r0 = 1103101952(0x41c00000, float:24.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
            r3 = 1103101952(0x41c00000, float:24.0)
        L8:
            r0 = 1086324736(0x40c00000, float:6.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L10
            r3 = 1086324736(0x40c00000, float:6.0)
        L10:
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.mTextSize = r3
            return
    }

    public void setTypeface(android.graphics.Typeface r1) {
            r0 = this;
            r0.mTypeface = r1
            return
    }

    public void setXOffset(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mXOffset = r1
            return
    }

    public void setYOffset(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mYOffset = r1
            return
    }
}
