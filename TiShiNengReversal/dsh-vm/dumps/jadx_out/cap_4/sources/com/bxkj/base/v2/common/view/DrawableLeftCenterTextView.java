package com.bxkj.base.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class DrawableLeftCenterTextView extends androidx.appcompat.widget.AppCompatTextView {
    public DrawableLeftCenterTextView(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.util.AttributeSet r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    private final android.graphics.Canvas a(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.drawable.Drawable[] r0 = r5.getCompoundDrawables()
            if (r0 != 0) goto L7
            return r6
        L7:
            r1 = 0
            r2 = r0[r1]
            r3 = 2
            if (r2 != 0) goto Lf
            r2 = r0[r3]
        Lf:
            android.text.TextPaint r0 = r5.getPaint()
            java.lang.CharSequence r4 = r5.getText()
            java.lang.String r4 = r4.toString()
            float r0 = r0.measureText(r4)
            int r2 = r2.getIntrinsicWidth()
            int r4 = r5.getCompoundDrawablePadding()
            float r2 = (float) r2
            float r0 = r0 + r2
            float r2 = (float) r4
            float r0 = r0 + r2
            int r2 = r5.getWidth()
            float r2 = (float) r2
            float r2 = r2 - r0
            int r2 = (int) r2
            float r2 = (float) r2
            int r2 = (int) r2
            r5.setPadding(r1, r1, r2, r1)
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r0
            float r0 = (float) r3
            float r1 = r1 / r0
            r0 = 0
            r6.translate(r1, r0)
            return r6
    }

    protected void onDraw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r2) {
            r1 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.graphics.Canvas r2 = r1.a(r2)
            super/*android.widget.TextView*/.onDraw(r2)
            return
    }
}
