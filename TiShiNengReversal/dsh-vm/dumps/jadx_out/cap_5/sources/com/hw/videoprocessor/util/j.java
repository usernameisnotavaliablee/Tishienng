package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j {
    private com.hw.videoprocessor.util.k a;
    private float b;
    private float c;
    private int d;
    private int e;
    private java.lang.Float f;

    public j(com.hw.videoprocessor.util.k r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void a(float r3) {
            r2 = this;
            r2.c = r3
            com.hw.videoprocessor.util.k r0 = r2.a
            if (r0 == 0) goto Lf
            float r1 = r2.b
            float r1 = r1 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            r0.a(r1)
        Lf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "mAudioProgress:"
            r3.append(r0)
            float r0 = r2.c
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.hw.videoprocessor.util.c.k(r3, r0)
            return
    }

    public void b(long r2) {
            r1 = this;
            com.hw.videoprocessor.util.k r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Float r0 = r1.f
            if (r0 == 0) goto L11
            float r2 = (float) r2
            float r3 = r0.floatValue()
            float r2 = r2 * r3
            long r2 = (long) r2
        L11:
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            int r3 = r1.d
            float r0 = (float) r3
            float r2 = r2 - r0
            int r0 = r1.e
            int r0 = r0 - r3
            float r3 = (float) r0
            float r2 = r2 / r3
            r1.b = r2
            r3 = 0
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L26
            r2 = 0
        L26:
            r1.b = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L30
            r2 = 1065353216(0x3f800000, float:1.0)
        L30:
            r1.b = r2
            com.hw.videoprocessor.util.k r3 = r1.a
            float r0 = r1.c
            float r2 = r2 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            r3.a(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mEncodeProgress:"
            r2.append(r3)
            float r3 = r1.b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.hw.videoprocessor.util.c.k(r2, r3)
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void d(java.lang.Float r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void e(int r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
