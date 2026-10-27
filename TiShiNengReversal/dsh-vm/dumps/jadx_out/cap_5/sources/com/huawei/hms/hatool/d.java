package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class d {
    private static com.huawei.hms.hatool.q1 a;

    static {
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    private static synchronized com.huawei.hms.hatool.q1 a() {
            java.lang.Class<com.huawei.hms.hatool.d> r0 = com.huawei.hms.hatool.d.class
            monitor-enter(r0)
            com.huawei.hms.hatool.q1 r1 = com.huawei.hms.hatool.d.a     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            com.huawei.hms.hatool.a1 r1 = com.huawei.hms.hatool.a1.d()     // Catch: java.lang.Throwable -> L12
            com.huawei.hms.hatool.q1 r1 = r1.c()     // Catch: java.lang.Throwable -> L12
            com.huawei.hms.hatool.d.a = r1     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L18
        L14:
            com.huawei.hms.hatool.q1 r1 = com.huawei.hms.hatool.d.a     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public static void b(int r1, java.lang.String r2, java.util.LinkedHashMap<java.lang.String, java.lang.String> r3) {
            com.huawei.hms.hatool.q1 r0 = a()
            if (r0 == 0) goto L32
            com.huawei.hms.hatool.z0 r0 = com.huawei.hms.hatool.z0.b()
            boolean r0 = r0.a()
            if (r0 == 0) goto L32
            r0 = 1
            if (r1 == r0) goto L2d
            if (r1 != 0) goto L16
            goto L2d
        L16:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Data type no longer collects range.type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "hmsSdk"
            com.huawei.hms.hatool.j1.j(r2, r1)
            return
        L2d:
            com.huawei.hms.hatool.q1 r0 = com.huawei.hms.hatool.d.a
            r0.b(r1, r2, r3)
        L32:
            return
    }

    @java.lang.Deprecated
    public static void c(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            com.huawei.hms.hatool.q1 r0 = a()
            if (r0 == 0) goto Lb
            com.huawei.hms.hatool.q1 r0 = com.huawei.hms.hatool.d.a
            r0.c(r1, r2, r3)
        Lb:
            return
    }

    public static void d(int r1, java.lang.String r2, java.util.LinkedHashMap<java.lang.String, java.lang.String> r3) {
            com.huawei.hms.hatool.q1 r0 = a()
            if (r0 == 0) goto L32
            com.huawei.hms.hatool.z0 r0 = com.huawei.hms.hatool.z0.b()
            boolean r0 = r0.a()
            if (r0 == 0) goto L32
            r0 = 1
            if (r1 == r0) goto L2d
            if (r1 != 0) goto L16
            goto L2d
        L16:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Data type no longer collects range.type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "hmsSdk"
            com.huawei.hms.hatool.j1.j(r2, r1)
            return
        L2d:
            com.huawei.hms.hatool.q1 r0 = com.huawei.hms.hatool.d.a
            r0.f(r1, r2, r3)
        L32:
            return
    }

    public static boolean e() {
            com.huawei.hms.hatool.a1 r0 = com.huawei.hms.hatool.a1.d()
            boolean r0 = r0.b()
            return r0
    }

    public static void f() {
            com.huawei.hms.hatool.q1 r0 = a()
            if (r0 == 0) goto L16
            com.huawei.hms.hatool.z0 r0 = com.huawei.hms.hatool.z0.b()
            boolean r0 = r0.a()
            if (r0 == 0) goto L16
            com.huawei.hms.hatool.q1 r0 = com.huawei.hms.hatool.d.a
            r1 = -1
            r0.a(r1)
        L16:
            return
    }
}
