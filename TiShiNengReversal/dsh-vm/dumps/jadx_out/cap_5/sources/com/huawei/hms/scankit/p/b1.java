package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b1 implements android.view.animation.Interpolator {
    private static final java.math.BigDecimal e = null;
    private static final java.math.BigDecimal f = null;
    private static final float g = 0.0f;
    private float a;
    private float b;
    private float c;
    private float d;

    static {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = java.lang.Float.toString(r1)
            r0.<init>(r1)
            com.huawei.hms.scankit.p.b1.e = r0
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r2 = 4000(0xfa0, double:1.9763E-320)
            java.lang.String r2 = java.lang.Long.toString(r2)
            r1.<init>(r2)
            com.huawei.hms.scankit.p.b1.f = r1
            r2 = 20
            r3 = 4
            java.math.BigDecimal r0 = r0.divide(r1, r2, r3)
            float r0 = r0.floatValue()
            com.huawei.hms.scankit.p.b1.g = r0
            return
    }

    public b1(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    private long a(float r10) {
            r9 = this;
            r0 = 0
            r2 = 4000(0xfa0, double:1.9763E-320)
        L4:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L24
            long r4 = r0 + r2
            r6 = 1
            long r4 = r4 >>> r6
            float r6 = com.huawei.hms.scankit.p.b1.g
            float r7 = (float) r4
            float r6 = r6 * r7
            float r6 = r9.b(r6)
            r7 = 1
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 >= 0) goto L1e
            long r0 = r4 + r7
            goto L4
        L1e:
            if (r6 > 0) goto L21
            return r4
        L21:
            long r2 = r4 - r7
            goto L4
        L24:
            return r0
    }

    private java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CubicBezierInterpolator"
            r0.<init>(r1)
            java.lang.String r1 = "  mControlPoint1x = "
            r0.append(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mControlPoint1y = "
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mControlPoint2x = "
            r0.append(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", mControlPoint2y = "
            r0.append(r1)
            float r1 = r2.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private float b(float r4) {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r4
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r0
            float r0 = r0 * r1
            float r0 = r0 * r4
            float r2 = r3.a
            float r0 = r0 * r2
            float r1 = r1 * r4
            float r1 = r1 * r4
            float r2 = r3.c
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = r4 * r4
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
    }

    private float c(float r4) {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r4
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r0
            float r0 = r0 * r1
            float r0 = r0 * r4
            float r2 = r3.b
            float r0 = r0 * r2
            float r1 = r1 * r4
            float r1 = r1 * r4
            float r2 = r3.d
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = r4 * r4
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r4) {
            r3 = this;
            float r0 = com.huawei.hms.scankit.p.b1.g
            long r1 = r3.a(r4)
            float r4 = (float) r1
            float r0 = r0 * r4
            float r4 = r3.c(r0)
            return r4
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a()
            return r0
    }
}
