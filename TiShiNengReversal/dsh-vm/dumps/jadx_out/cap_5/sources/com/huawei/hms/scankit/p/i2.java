package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i2 implements java.lang.Comparable<com.huawei.hms.scankit.p.i2> {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    public com.huawei.hms.scankit.p.p l;
    public float[] m;
    public float n;
    public float o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;

    public i2(boolean r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13) {
            r2 = this;
            r2.<init>()
            r0 = 5
            float[] r0 = new float[r0]
            r2.m = r0
            r0 = 0
            r2.n = r0
            r2.o = r0
            r1 = 0
            r2.p = r1
            r2.q = r1
            r2.r = r1
            r2.s = r1
            r2.t = r1
            r2.u = r1
            r2.v = r0
            r2.a = r4
            r2.b = r5
            r2.c = r6
            r2.d = r7
            r2.e = r8
            r2.f = r9
            r2.k = r13
            if (r3 == 0) goto L33
            r2.g = r10
            r2.h = r11
            r2.j = r12
            return
        L33:
            r2.i = r12
            r2.j = r11
            return
    }

    private float a(float r2, int r3, int r4) {
            r1 = this;
            float r3 = (float) r3
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6
            goto L7
        L6:
            r2 = r3
        L7:
            int r4 = r4 + (-1)
            float r3 = (float) r4
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lf
            return r2
        Lf:
            return r3
    }

    public float a() {
            r1 = this;
            float r0 = r1.o
            return r0
    }

    public int a(com.huawei.hms.scankit.p.i2 r3) {
            r2 = this;
            float r0 = r3.g()
            float r0 = -r0
            float r3 = r3.h()
            float r0 = r0 + r3
            float r3 = r2.g()
            float r3 = -r3
            float r1 = r2.h()
            float r3 = r3 + r1
            int r3 = java.lang.Float.compare(r0, r3)
            return r3
    }

    public void a(float r2, float r3) {
            r1 = this;
            float r0 = r1.a
            float r0 = r0 + r2
            r1.a = r0
            float r0 = r1.b
            float r0 = r0 + r3
            r1.b = r0
            float r0 = r1.e
            float r0 = r0 + r2
            r1.e = r0
            float r2 = r1.f
            float r2 = r2 + r3
            r1.f = r2
            return
    }

    public void a(int r5, int r6, float r7, float r8) {
            r4 = this;
            float r0 = r4.a
            float r0 = r0 + r7
            r4.a = r0
            float r1 = r4.b
            float r1 = r1 + r8
            r4.b = r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L14
            float r3 = r4.c
            float r3 = r3 + r0
            r4.c = r3
        L14:
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1d
            float r2 = r4.d
            float r2 = r2 + r1
            r4.d = r2
        L1d:
            float r1 = r4.e
            float r1 = r1 + r7
            r4.e = r1
            float r1 = r4.f
            float r1 = r1 + r8
            r4.f = r1
            r1 = 0
            float r0 = r4.a(r0, r1, r5)
            r4.a = r0
            float r0 = r4.e
            float r0 = r4.a(r0, r1, r5)
            r4.e = r0
            float r0 = r4.b
            float r0 = r4.a(r0, r1, r6)
            r4.b = r0
            float r0 = r4.f
            float r0 = r4.a(r0, r1, r6)
            r4.f = r0
            float r0 = r4.a
            float r1 = r4.c
            float r1 = r1 + r0
            float r5 = (float) r5
            float r5 = r5 - r7
            r7 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L57
            float r5 = r5 - r7
            float r5 = r5 - r0
            r4.c = r5
        L57:
            float r5 = r4.b
            float r0 = r4.d
            float r0 = r0 + r5
            float r6 = (float) r6
            float r6 = r6 - r8
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L66
            float r6 = r6 - r7
            float r6 = r6 - r5
            r4.d = r6
        L66:
            return
    }

    public float b() {
            r1 = this;
            float r0 = r1.n
            return r0
    }

    public void b(float r4, float r5) {
            r3 = this;
            r0 = 0
            r3.a = r0
            r3.b = r0
            r3.c = r4
            r3.d = r5
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r4 / r1
            r3.e = r2
            float r1 = r5 / r1
            r3.f = r1
            r3.g = r4
            r3.h = r5
            r3.j = r0
            return
    }

    public float c() {
            r1 = this;
            float r0 = r1.d
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.huawei.hms.scankit.p.i2 r1) {
            r0 = this;
            com.huawei.hms.scankit.p.i2 r1 = (com.huawei.hms.scankit.p.i2) r1
            int r1 = r0.a(r1)
            return r1
    }

    public float d() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public float e() {
            r1 = this;
            float r0 = r1.b
            return r0
    }

    public float f() {
            r1 = this;
            float r0 = r1.c
            return r0
    }

    public float g() {
            r1 = this;
            float r0 = r1.k
            return r0
    }

    public float h() {
            r1 = this;
            float r0 = r1.i
            return r0
    }

    public float i() {
            r1 = this;
            float r0 = r1.j
            return r0
    }

    public float j() {
            r1 = this;
            float r0 = r1.e
            return r0
    }

    public float k() {
            r1 = this;
            float r0 = r1.f
            return r0
    }

    public float l() {
            r1 = this;
            float r0 = r1.h
            return r0
    }

    public float m() {
            r1 = this;
            float r0 = r1.g
            return r0
    }

    public float n() {
            r1 = this;
            float r0 = r1.v
            return r0
    }
}
