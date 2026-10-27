package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p {
    private static java.lang.reflect.Method a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Method f6899b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.reflect.Method f6900c;

    static {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> L37
            int r1 = r0.length     // Catch: java.lang.Throwable -> L37
            r2 = 0
        Lc:
            if (r2 >= r1) goto L37
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = "getLong"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L1f
            com.beizi.ad.internal.h.p.a = r3     // Catch: java.lang.Throwable -> L37
            goto L34
        L1f:
            java.lang.String r5 = "set"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L2a
            com.beizi.ad.internal.h.p.f6900c = r3     // Catch: java.lang.Throwable -> L37
            goto L34
        L2a:
            java.lang.String r5 = "get"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L34
            com.beizi.ad.internal.h.p.f6899b = r3     // Catch: java.lang.Throwable -> L37
        L34:
            int r2 = r2 + 1
            goto Lc
        L37:
            return
    }

    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3, java.lang.String r4) {
            java.lang.reflect.Method r0 = com.beizi.ad.internal.h.p.f6899b     // Catch: java.lang.Throwable -> L13
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L13
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L13
            r3 = 1
            r1[r3] = r4     // Catch: java.lang.Throwable -> L13
            r3 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            return r4
    }
}
