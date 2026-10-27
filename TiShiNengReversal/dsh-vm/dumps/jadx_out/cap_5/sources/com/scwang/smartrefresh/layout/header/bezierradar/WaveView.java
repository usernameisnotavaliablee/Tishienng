package com.scwang.smartrefresh.layout.header.bezierradar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class WaveView extends android.view.View {
    private int a;
    private int b;
    private android.graphics.Path c;
    private android.graphics.Paint d;
    private int e;

    public WaveView(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public WaveView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public WaveView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.e = r1
            r0.a()
            return
    }

    private void a() {
            r2 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.c = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.d = r0
            r1 = -14736346(0xffffffffff1f2426, float:-2.1153494E38)
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.d
            r1 = 1
            r0.setAntiAlias(r1)
            return
    }

    public int getHeadHeight() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int getWaveHeight() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            super.onDraw(r7)
            int r0 = r6.getWidth()
            android.graphics.Path r1 = r6.c
            r1.reset()
            android.graphics.Path r1 = r6.c
            int r2 = r6.b
            float r2 = (float) r2
            r3 = 0
            r1.lineTo(r3, r2)
            android.graphics.Path r1 = r6.c
            int r2 = r6.e
            if (r2 < 0) goto L1d
        L1b:
            float r2 = (float) r2
            goto L20
        L1d:
            int r2 = r0 / 2
            goto L1b
        L20:
            int r4 = r6.b
            int r5 = r6.a
            int r5 = r5 + r4
            float r5 = (float) r5
            float r0 = (float) r0
            float r4 = (float) r4
            r1.quadTo(r2, r5, r0, r4)
            android.graphics.Path r1 = r6.c
            r1.lineTo(r0, r3)
            android.graphics.Path r0 = r6.c
            android.graphics.Paint r1 = r6.d
            r7.drawPath(r0, r1)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = android.view.View.resolveSize(r0, r2)
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = android.view.View.resolveSize(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void setHeadHeight(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setWaveColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.d
            r0.setColor(r2)
            return
    }

    public void setWaveHeight(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setWaveOffsetX(int r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
