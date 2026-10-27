package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n6 {
    private static final java.security.SecureRandom a = null;

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            com.huawei.hms.scankit.p.n6.a = r0
            return
    }

    public n6() {
            r1 = this;
            r1.<init>()
            return
    }

    public static float a(float r1) {
            java.security.SecureRandom r0 = com.huawei.hms.scankit.p.n6.a
            float r0 = r0.nextFloat()
            float r0 = r0 * r1
            return r0
    }

    public static int a(int r1) {
            java.security.SecureRandom r0 = com.huawei.hms.scankit.p.n6.a
            int r1 = r0.nextInt(r1)
            return r1
    }
}
