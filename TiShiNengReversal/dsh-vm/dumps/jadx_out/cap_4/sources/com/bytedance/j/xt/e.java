package com.bytedance.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {
    private static android.content.Context a = null;
    private static long b = 0;
    private static java.lang.String c = "default";
    private static boolean d;

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static com.bytedance.j.xt.up.c e;
    private static com.bytedance.j.xt.up.i f;
    private static com.bytedance.j.xt.g g;
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> h;
    private static com.bytedance.j.xt.up.g i;
    private static volatile int j;
    private static volatile java.lang.String k;

    static {
            com.bytedance.j.xt.up.i r0 = new com.bytedance.j.xt.up.i
            r0.<init>()
            com.bytedance.j.xt.e.f = r0
            com.bytedance.j.xt.g r0 = new com.bytedance.j.xt.g
            r0.<init>()
            com.bytedance.j.xt.e.g = r0
            r0 = 0
            com.bytedance.j.xt.e.i = r0
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = com.bytedance.j.xt.e.c
            return r0
    }

    public static com.bytedance.j.xt.up.g b() {
            com.bytedance.j.xt.up.g r0 = com.bytedance.j.xt.e.i
            if (r0 != 0) goto L15
            java.lang.Class<com.bytedance.j.xt.e> r0 = com.bytedance.j.xt.e.class
            monitor-enter(r0)
            com.bytedance.j.xt.up.g r1 = new com.bytedance.j.xt.up.g     // Catch: java.lang.Throwable -> L12
            android.content.Context r2 = com.bytedance.j.xt.e.a     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.bytedance.j.xt.e.i = r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L15:
            com.bytedance.j.xt.up.g r0 = com.bytedance.j.xt.e.i
            return r0
    }

    public static java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> c() {
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r0 = com.bytedance.j.xt.e.h
            return r0
    }

    public static com.bytedance.j.xt.up.c d() {
            com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.e
            return r0
    }

    static void e(android.content.Context r2, com.bytedance.j.xt.f r3) {
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.j.xt.e.b = r0
            com.bytedance.j.xt.e.a = r2
            com.bytedance.j.xt.up.c r0 = new com.bytedance.j.xt.up.c
            r0.<init>(r2, r3)
            com.bytedance.j.xt.e.e = r0
            return
    }

    public static long f() {
            long r0 = com.bytedance.j.xt.e.b
            return r0
    }

    public static int g() {
            int r0 = com.bytedance.j.xt.e.j
            return r0
    }

    public static java.lang.String h() {
            java.lang.String r0 = com.bytedance.j.xt.e.k
            return r0
    }

    public static android.content.Context i() {
            android.content.Context r0 = com.bytedance.j.xt.e.a
            return r0
    }

    public static boolean j() {
            boolean r0 = com.bytedance.j.xt.e.d
            return r0
    }

    public static com.bytedance.j.xt.up.i k() {
            com.bytedance.j.xt.up.i r0 = com.bytedance.j.xt.e.f
            return r0
    }

    public static com.bytedance.j.xt.g l() {
            com.bytedance.j.xt.g r0 = com.bytedance.j.xt.e.g
            return r0
    }
}
