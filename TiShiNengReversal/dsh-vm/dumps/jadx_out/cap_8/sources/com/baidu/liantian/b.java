package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b {
    public static int a = -1;

    /* renamed from: b, reason: collision with root package name */
    static java.lang.ThreadLocal<java.lang.StringBuilder> f5906b;

    /* renamed from: c, reason: collision with root package name */
    private static int f5907c;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.baidu.liantian.b.f5906b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.Throwable r3) {
            r0 = r3
        L1:
            java.lang.String r1 = ""
            if (r0 == 0) goto Lf
            boolean r2 = r0 instanceof java.net.UnknownHostException
            if (r2 == 0) goto La
            return r1
        La:
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L2f
            goto L1
        Lf:
            r0 = 0
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L25
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L25
            r3.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L25
            r2.close()     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L2f
        L24:
            return r3
        L25:
            r3 = move-exception
            r0 = r2
            goto L29
        L28:
            r3 = move-exception
        L29:
            if (r0 == 0) goto L2e
            r0.close()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L2f
        L2e:
            throw r3     // Catch: java.lang.Throwable -> L2f
        L2f:
            com.baidu.liantian.b.e.a()
            return r1
    }

    public static void a() {
            return
    }

    public static void b() {
            return
    }

    public static void c() {
            return
    }
}
