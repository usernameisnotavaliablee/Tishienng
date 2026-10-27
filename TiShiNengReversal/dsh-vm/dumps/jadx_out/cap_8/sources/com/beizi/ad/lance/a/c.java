package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static final java.util.concurrent.atomic.AtomicBoolean a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.beizi.ad.lance.a.c f7245b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile java.util.concurrent.ThreadPoolExecutor f7246c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile java.util.concurrent.ThreadPoolExecutor f7247d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile java.util.concurrent.ThreadPoolExecutor f7248e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile java.util.concurrent.ThreadPoolExecutor f7249f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile java.util.concurrent.ScheduledThreadPoolExecutor f7250g;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.beizi.ad.lance.a.c.a = r0
            return
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = com.beizi.ad.lance.a.c.a
            boolean r0 = r0.get()
            if (r0 != 0) goto Le
            a()
        Le:
            return
    }

    public static void a() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.beizi.ad.lance.a.c.a
            boolean r1 = r0.get()
            if (r1 != 0) goto L1e
            java.util.concurrent.ThreadPoolExecutor r1 = com.beizi.ad.lance.a.e.a()
            com.beizi.ad.lance.a.c.f7246c = r1
            java.util.concurrent.ThreadPoolExecutor r1 = com.beizi.ad.lance.a.e.c()
            com.beizi.ad.lance.a.c.f7248e = r1
            java.util.concurrent.ThreadPoolExecutor r1 = com.beizi.ad.lance.a.e.d()
            com.beizi.ad.lance.a.c.f7249f = r1
            r1 = 1
            r0.set(r1)
        L1e:
            return
    }

    public static com.beizi.ad.lance.a.c b() {
            com.beizi.ad.lance.a.c r0 = com.beizi.ad.lance.a.c.f7245b
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.ad.lance.a.c> r0 = com.beizi.ad.lance.a.c.class
            monitor-enter(r0)
            com.beizi.ad.lance.a.c r1 = com.beizi.ad.lance.a.c.f7245b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.ad.lance.a.c r1 = new com.beizi.ad.lance.a.c     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.ad.lance.a.c.f7245b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.beizi.ad.lance.a.c r0 = com.beizi.ad.lance.a.c.f7245b
            return r0
    }

    public java.util.concurrent.ExecutorService c() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7246c
            if (r0 != 0) goto La
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.e.a()
            com.beizi.ad.lance.a.c.f7246c = r0
        La:
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7246c
            return r0
    }

    public java.util.concurrent.ExecutorService d() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7247d
            if (r0 != 0) goto La
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.e.b()
            com.beizi.ad.lance.a.c.f7247d = r0
        La:
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7247d
            return r0
    }

    public java.util.concurrent.ExecutorService e() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7248e
            if (r0 != 0) goto La
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.e.c()
            com.beizi.ad.lance.a.c.f7248e = r0
        La:
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7248e
            return r0
    }

    public java.util.concurrent.ExecutorService f() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7249f
            if (r0 != 0) goto La
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.e.d()
            com.beizi.ad.lance.a.c.f7249f = r0
        La:
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7249f
            return r0
    }

    public java.util.concurrent.ScheduledThreadPoolExecutor g() {
            r1 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7250g
            if (r0 != 0) goto La
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.beizi.ad.lance.a.e.e()
            com.beizi.ad.lance.a.c.f7250g = r0
        La:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.beizi.ad.lance.a.c.f7250g
            return r0
    }
}
