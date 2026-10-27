package com.scwang.smartrefresh.layout.header.bezierradar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RoundDotView extends android.view.View {
    private int a;
    private android.graphics.Paint b;
    private float c;
    private float d;

    public RoundDotView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 7
            r1.a = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.b = r2
            r0 = 1
            r2.setAntiAlias(r0)
            android.graphics.Paint r2 = r1.b
            r0 = -1
            r2.setColor(r0)
            r2 = 1088421888(0x40e00000, float:7.0)
            int r2 = com.scwang.smartrefresh.layout.util.c.b(r2)
            float r2 = (float) r2
            r1.c = r2
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            super.onDraw(r20)
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r3 = r0.a
            int r4 = r1 / r3
            float r4 = (float) r4
            float r5 = r0.d
            float r4 = r4 * r5
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 <= 0) goto L26
            float r8 = r5 - r7
            int r3 = r1 / r3
            float r3 = (float) r3
            float r8 = r8 * r3
            float r8 = r8 / r5
            goto L27
        L26:
            r8 = 0
        L27:
            float r4 = r4 - r8
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 <= 0) goto L35
            float r6 = r5 - r7
            float r6 = r6 * r2
            float r6 = r6 / r3
            float r6 = r6 / r5
        L35:
            float r5 = r2 - r6
            r6 = 0
        L38:
            int r8 = r0.a
            if (r6 >= r8) goto L99
            float r9 = (float) r6
            float r9 = r9 + r7
            float r8 = (float) r8
            float r8 = r8 + r7
            float r8 = r8 / r3
            float r9 = r9 - r8
            float r8 = java.lang.Math.abs(r9)
            int r10 = r0.a
            float r10 = (float) r10
            float r8 = r8 / r10
            float r8 = r8 * r3
            float r8 = r7 - r8
            r10 = 1132396544(0x437f0000, float:255.0)
            float r8 = r8 * r10
            float r10 = com.scwang.smartrefresh.layout.util.c.d(r2)
            android.graphics.Paint r11 = r0.b
            double r12 = (double) r8
            double r14 = (double) r10
            r16 = 4650248090236747776(0x4089000000000000, double:800.0)
            double r14 = r14 / r16
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 + r16
            r8 = r4
            r18 = 1073741824(0x40000000, float:2.0)
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r3 = java.lang.Math.pow(r14, r3)
            double r3 = r16 / r3
            double r16 = r16 - r3
            double r12 = r12 * r16
            int r3 = (int) r12
            r11.setAlpha(r3)
            float r3 = r0.c
            r4 = 1092616192(0x41200000, float:10.0)
            float r10 = r10 / r4
            float r10 = r10 + r7
            float r4 = r7 / r10
            float r4 = r7 - r4
            float r3 = r3 * r4
            int r4 = r1 / 2
            float r4 = (float) r4
            float r10 = r3 / r18
            float r4 = r4 - r10
            float r9 = r9 * r8
            float r4 = r4 + r9
            float r9 = r5 / r18
            android.graphics.Paint r10 = r0.b
            r11 = r20
            r11.drawCircle(r4, r9, r3, r10)
            int r6 = r6 + 1
            r4 = r8
            r3 = 1073741824(0x40000000, float:2.0)
            goto L38
        L99:
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

    public void setDotColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.b
            r0.setColor(r2)
            return
    }

    public void setFraction(float r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
