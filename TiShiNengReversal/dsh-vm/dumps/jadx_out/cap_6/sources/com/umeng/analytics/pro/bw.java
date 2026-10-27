package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bw {
    public bw() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.pro.bv a(java.lang.Class<? extends com.umeng.analytics.pro.bv> r6, int r7) {
            r0 = 0
            java.lang.String r1 = "findByValue"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1e
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1e
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Method r6 = r6.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1e
            r1[r5] = r7     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = r6.invoke(r0, r1)     // Catch: java.lang.Throwable -> L1e
            com.umeng.analytics.pro.bv r6 = (com.umeng.analytics.pro.bv) r6     // Catch: java.lang.Throwable -> L1e
            return r6
        L1e:
            return r0
    }
}
