package com.scwang.smartrefresh.header.storehouse;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends android.view.animation.Animation {
    public android.graphics.PointF a;
    public float b;
    public int c;
    private final android.graphics.Paint d;
    private float e;
    private float f;
    private android.graphics.PointF g;
    private android.graphics.PointF h;

    public a(int r6, android.graphics.PointF r7, android.graphics.PointF r8, int r9, int r10) {
            r5 = this;
            r5.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.d = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.e = r1
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r5.f = r1
            r5.c = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            float r1 = r7.x
            float r2 = r8.x
            float r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r7.y
            float r4 = r8.y
            float r3 = r3 + r4
            float r3 = r3 / r2
            r6.<init>(r1, r3)
            r5.a = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            float r1 = r7.x
            android.graphics.PointF r2 = r5.a
            float r3 = r2.x
            float r1 = r1 - r3
            float r7 = r7.y
            float r2 = r2.y
            float r7 = r7 - r2
            r6.<init>(r1, r7)
            r5.g = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            float r7 = r8.x
            android.graphics.PointF r1 = r5.a
            float r2 = r1.x
            float r7 = r7 - r2
            float r8 = r8.y
            float r1 = r1.y
            float r8 = r8 - r1
            r6.<init>(r7, r8)
            r5.h = r6
            r5.e(r9)
            r5.f(r10)
            r6 = 1
            r0.setAntiAlias(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r6)
            return
    }

    public void a(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.PointF r0 = r7.g
            float r2 = r0.x
            float r3 = r0.y
            android.graphics.PointF r0 = r7.h
            float r4 = r0.x
            float r5 = r0.y
            android.graphics.Paint r6 = r7.d
            r1 = r8
            r1.drawLine(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float r2, android.view.animation.Transformation r3) {
            r1 = this;
            float r3 = r1.e
            float r0 = r1.f
            float r0 = r0 - r3
            float r0 = r0 * r2
            float r3 = r3 + r0
            r1.c(r3)
            return
    }

    public void b(int r2) {
            r1 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r0 = r0.nextInt(r2)
            int r0 = -r0
            int r0 = r0 + r2
            float r2 = (float) r0
            r1.b = r2
            return
    }

    public void c(float r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.d
            r1 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r1
            int r3 = (int) r3
            r0.setAlpha(r3)
            return
    }

    public void e(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.d
            r0.setColor(r2)
            return
    }

    public void f(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.d
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            return
    }

    public void g(float r1, float r2) {
            r0 = this;
            r0.e = r1
            r0.f = r2
            super.start()
            return
    }
}
