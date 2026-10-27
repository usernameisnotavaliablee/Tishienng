package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Description extends com.github.mikephil.charting.components.ComponentBase {
    private com.github.mikephil.charting.utils.MPPointF mPosition;
    private android.graphics.Paint.Align mTextAlign;
    private java.lang.String text;

    public Description() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Description Label"
            r1.text = r0
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.RIGHT
            r1.mTextAlign = r0
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r1.mTextSize = r0
            return
    }

    public com.github.mikephil.charting.utils.MPPointF getPosition() {
            r1 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r1.mPosition
            return r0
    }

    public java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.text
            return r0
    }

    public android.graphics.Paint.Align getTextAlign() {
            r1 = this;
            android.graphics.Paint$Align r0 = r1.mTextAlign
            return r0
    }

    public void setPosition(float r2, float r3) {
            r1 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r1.mPosition
            if (r0 != 0) goto Lb
            com.github.mikephil.charting.utils.MPPointF r2 = com.github.mikephil.charting.utils.MPPointF.getInstance(r2, r3)
            r1.mPosition = r2
            return
        Lb:
            r0.x = r2
            r0.y = r3
            return
    }

    public void setText(java.lang.String r1) {
            r0 = this;
            r0.text = r1
            return
    }

    public void setTextAlign(android.graphics.Paint.Align r1) {
            r0 = this;
            r0.mTextAlign = r1
            return
    }
}
