package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    private final float a;
    private float b;
    private long c;
    private double d;
    private double e;
    private float f;

    public f(float r2) {
            r1 = this;
            r1.<init>()
            r0 = 1077936128(0x40400000, float:3.0)
            r1.a = r0
            r1.b = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.f = r2
            return
    }

    public com.amap.api.maps.model.LatLng a(double r10, double r12, float r14, long r15) {
            r9 = this;
            r0 = 1077936128(0x40400000, float:3.0)
            int r1 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r1 >= 0) goto L9
            r5 = 1077936128(0x40400000, float:3.0)
            goto La
        L9:
            r5 = r14
        La:
            float r14 = r9.f
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L19
            r0 = r9
            r1 = r10
            r3 = r12
            r6 = r15
            r0.b(r1, r3, r5, r6)
            goto L52
        L19:
            r6 = r15
            long r1 = r9.c
            long r1 = r6 - r1
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L33
            float r1 = (float) r1
            float r2 = r9.b
            float r1 = r1 * r2
            float r1 = r1 * r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            float r14 = r14 + r1
            r9.f = r14
            r9.c = r6
        L33:
            float r14 = r9.f
            float r5 = r5 * r5
            float r5 = r5 + r14
            float r1 = r14 / r5
            double r2 = r9.d
            double r4 = (double) r1
            double r10 = r10 - r2
            double r10 = r10 * r4
            double r2 = r2 + r10
            r9.d = r2
            double r10 = r9.e
            double r12 = r12 - r10
            double r4 = r4 * r12
            double r10 = r10 + r4
            r9.e = r10
            r10 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 - r1
            float r10 = r10 * r14
            r9.f = r10
        L52:
            com.amap.api.maps.model.LatLng r10 = new com.amap.api.maps.model.LatLng
            double r11 = r9.d
            double r13 = r9.e
            r10.<init>(r11, r13)
            return r10
    }

    public void b(double r1, double r3, float r5, long r6) {
            r0 = this;
            r0.d = r1
            r0.e = r3
            float r5 = r5 * r5
            r0.f = r5
            r0.c = r6
            return
    }

    public long c() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public float d() {
            r2 = this;
            float r0 = r2.f
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public double e() {
            r2 = this;
            double r0 = r2.d
            return r0
    }

    public double f() {
            r2 = this;
            double r0 = r2.e
            return r0
    }
}
