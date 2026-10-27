package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c6 implements java.lang.Comparable<com.huawei.hms.scankit.p.c6> {
    public com.huawei.hms.scankit.p.i2 a;
    public int b;

    public c6(com.huawei.hms.scankit.p.i2 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public int a(com.huawei.hms.scankit.p.c6 r3) {
            r2 = this;
            com.huawei.hms.scankit.p.i2 r0 = r3.a
            float r0 = r0.g()
            float r0 = -r0
            com.huawei.hms.scankit.p.i2 r3 = r3.a
            float r3 = r3.h()
            float r0 = r0 + r3
            com.huawei.hms.scankit.p.i2 r3 = r2.a
            float r3 = r3.g()
            float r3 = -r3
            com.huawei.hms.scankit.p.i2 r1 = r2.a
            float r1 = r1.h()
            float r3 = r3 + r1
            int r3 = java.lang.Float.compare(r0, r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.huawei.hms.scankit.p.c6 r1) {
            r0 = this;
            com.huawei.hms.scankit.p.c6 r1 = (com.huawei.hms.scankit.p.c6) r1
            int r1 = r0.a(r1)
            return r1
    }
}
