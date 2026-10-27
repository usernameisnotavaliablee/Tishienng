package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o0 {
    private static com.huawei.hms.hatool.o0 b;
    private static final java.lang.Object c = null;
    private android.content.Context a;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.hms.hatool.o0.c = r0
            return
    }

    private o0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.hms.hatool.o0 a() {
            com.huawei.hms.hatool.o0 r0 = com.huawei.hms.hatool.o0.b
            if (r0 != 0) goto L7
            d()
        L7:
            com.huawei.hms.hatool.o0 r0 = com.huawei.hms.hatool.o0.b
            return r0
    }

    private static synchronized void d() {
            java.lang.Class<com.huawei.hms.hatool.o0> r0 = com.huawei.hms.hatool.o0.class
            monitor-enter(r0)
            com.huawei.hms.hatool.o0 r1 = com.huawei.hms.hatool.o0.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.huawei.hms.hatool.o0 r1 = new com.huawei.hms.hatool.o0     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.huawei.hms.hatool.o0.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L13
        L11:
            monitor-exit(r0)
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public void b(android.content.Context r3) {
            r2 = this;
            java.lang.Object r0 = com.huawei.hms.hatool.o0.c
            monitor-enter(r0)
            android.content.Context r1 = r2.a     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            java.lang.String r3 = "hmsSdk"
            java.lang.String r1 = "DataManager already initialized."
            com.huawei.hms.hatool.j1.m(r3, r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            goto L39
        L12:
            r2.a = r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            com.huawei.hms.hatool.d1 r0 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r0 = r0.d()
            android.content.Context r1 = r2.a
            r0.b(r1)
            com.huawei.hms.hatool.d1 r0 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r0 = r0.d()
            java.lang.String r1 = r3.getPackageName()
            r0.u(r1)
            com.huawei.hms.hatool.c0 r0 = com.huawei.hms.hatool.c0.a()
            r0.d(r3)
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public void c(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "HiAnalyticsDataManager.setAppid(String appid) is execute."
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r1, r0)
            android.content.Context r0 = r3.a
            if (r0 != 0) goto L11
            java.lang.String r4 = "sdk is not init"
            com.huawei.hms.hatool.j1.l(r1, r4)
            return
        L11:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "appID"
            java.lang.String r2 = "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}"
            java.lang.String r4 = com.huawei.hms.hatool.n.a(r1, r4, r2, r0)
            com.huawei.hms.hatool.d1 r0 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r0 = r0.d()
            r0.s(r4)
            return
    }
}
