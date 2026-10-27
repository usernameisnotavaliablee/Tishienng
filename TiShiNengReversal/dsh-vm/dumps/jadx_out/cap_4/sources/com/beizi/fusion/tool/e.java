package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e {
    private static final java.util.concurrent.atomic.AtomicBoolean a = null;
    private static volatile com.beizi.fusion.tool.e b;
    private static volatile java.util.concurrent.ThreadPoolExecutor c;
    private static volatile java.util.concurrent.ThreadPoolExecutor d;
    private static volatile java.util.concurrent.ThreadPoolExecutor e;
    private static volatile java.util.concurrent.ThreadPoolExecutor f;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.beizi.fusion.tool.e.a = r0
            return
    }

    private e() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = com.beizi.fusion.tool.e.a
            boolean r0 = r0.get()
            if (r0 != 0) goto Le
            a()
        Le:
            return
    }

    public static void a() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.beizi.fusion.tool.e.a
            boolean r1 = r0.get()
            if (r1 != 0) goto L24
            java.util.concurrent.ThreadPoolExecutor r1 = com.beizi.fusion.tool.i.a()
            com.beizi.fusion.tool.e.c = r1
            java.util.concurrent.ThreadPoolExecutor r1 = com.beizi.fusion.tool.i.b()
            com.beizi.fusion.tool.e.d = r1
            java.util.concurrent.ThreadPoolExecutor r1 = com.beizi.fusion.tool.i.c()
            com.beizi.fusion.tool.e.e = r1
            java.util.concurrent.ThreadPoolExecutor r1 = com.beizi.fusion.tool.i.d()
            com.beizi.fusion.tool.e.f = r1
            r1 = 1
            r0.set(r1)
        L24:
            return
    }

    public static com.beizi.fusion.tool.e b() {
            com.beizi.fusion.tool.e r0 = com.beizi.fusion.tool.e.b
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.tool.e> r0 = com.beizi.fusion.tool.e.class
            monitor-enter(r0)
            com.beizi.fusion.tool.e r1 = com.beizi.fusion.tool.e.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.tool.e r1 = new com.beizi.fusion.tool.e     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.tool.e.b = r1     // Catch: java.lang.Throwable -> L13
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
            com.beizi.fusion.tool.e r0 = com.beizi.fusion.tool.e.b
            return r0
    }

    public java.util.concurrent.ExecutorService c() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.e.c
            if (r0 != 0) goto La
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.i.a()
            com.beizi.fusion.tool.e.c = r0
        La:
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.e.c
            return r0
    }

    public java.util.concurrent.ExecutorService d() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.e.d
            if (r0 != 0) goto La
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.i.b()
            com.beizi.fusion.tool.e.d = r0
        La:
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.e.d
            return r0
    }

    public java.util.concurrent.ExecutorService e() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.e.e
            if (r0 != 0) goto La
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.i.c()
            com.beizi.fusion.tool.e.e = r0
        La:
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.e.e
            return r0
    }

    public java.util.concurrent.ExecutorService f() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.e.f
            if (r0 != 0) goto La
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.i.d()
            com.beizi.fusion.tool.e.f = r0
        La:
            java.util.concurrent.ThreadPoolExecutor r0 = com.beizi.fusion.tool.e.f
            return r0
    }
}
