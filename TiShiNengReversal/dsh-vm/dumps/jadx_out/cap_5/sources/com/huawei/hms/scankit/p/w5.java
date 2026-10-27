package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class w5 {
    private float a;
    private float b;
    private float c;
    private int d;
    private float e;
    private float f;
    private int g;
    private long h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;
    private int o;
    private long p;
    private int q;
    private com.huawei.hms.scankit.p.f4 r;

    public w5(android.graphics.Bitmap r4) {
            r3 = this;
            r3.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.a = r0
            r1 = 255(0xff, float:3.57E-43)
            r3.d = r1
            r2 = 0
            r3.e = r2
            r3.f = r2
            r2 = 0
            r3.q = r2
            r3.k = r0
            r3.g = r1
            if (r4 == 0) goto L29
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            r3.n = r0
            int r4 = r4.getHeight()
            int r4 = r4 / 2
            r3.o = r4
        L29:
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public void a(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void a(long r2, float r4, float r5, long r6, @androidx.annotation.NonNull com.huawei.hms.scankit.p.f4 r8) {
            r1 = this;
            int r0 = r1.n
            float r0 = (float) r0
            float r4 = r4 - r0
            r1.l = r4
            int r0 = r1.o
            float r0 = (float) r0
            float r5 = r5 - r0
            r1.m = r5
            r1.i = r4
            r1.j = r5
            r1.p = r2
            r1.h = r6
            r1.r = r8
            return
    }

    public boolean a(long r6) {
            r5 = this;
            long r0 = r5.h
            long r6 = r6 - r0
            long r0 = r5.p
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r6 = 0
            return r6
        Lb:
            long r0 = r6 * r6
            float r2 = r5.l
            float r3 = r5.e
            float r4 = (float) r6
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r3 = r5.b
            float r0 = (float) r0
            float r3 = r3 * r0
            float r2 = r2 + r3
            r5.i = r2
            float r1 = r5.m
            float r2 = r5.f
            float r2 = r2 * r4
            float r1 = r1 + r2
            float r2 = r5.c
            float r2 = r2 * r0
            float r1 = r1 + r2
            r5.j = r1
            com.huawei.hms.scankit.p.f4 r0 = r5.r
            r0.a(r5, r6)
            r6 = 1
            return r6
    }

    public int b() {
            r1 = this;
            int r0 = r1.q
            return r0
    }

    public void b(float r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public float c() {
            r1 = this;
            float r0 = r1.i
            return r0
    }

    public float d() {
            r1 = this;
            float r0 = r1.j
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public float f() {
            r1 = this;
            float r0 = r1.k
            return r0
    }
}
