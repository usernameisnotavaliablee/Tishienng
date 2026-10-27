package com.kwad.components.core.q;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static volatile com.kwad.components.core.q.b XJ = null;
    private static volatile int XK = 204800;
    static volatile boolean XL = true;
    static volatile boolean XM;
    static volatile java.util.Set<com.kwad.components.core.q.c> XN;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.kwad.components.core.q.b.XN = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized void a(com.kwad.components.core.q.c r2) {
            java.lang.Class<com.kwad.components.core.q.b> r0 = com.kwad.components.core.q.b.class
            monitor-enter(r0)
            java.util.Set<com.kwad.components.core.q.c> r1 = com.kwad.components.core.q.b.XN     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            java.util.Set<com.kwad.components.core.q.c> r1 = com.kwad.components.core.q.b.XN     // Catch: java.lang.Throwable -> L11
            r1.remove(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L15
        L13:
            monitor-exit(r0)
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public static void f(boolean r0, int r1) {
            if (r1 <= 0) goto L6
            int r1 = r1 * 1024
            com.kwad.components.core.q.b.XK = r1
        L6:
            com.kwad.components.core.q.b.XL = r0
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initModeImplForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.core.SpeedLimitApi> r0 = com.kwad.sdk.api.core.SpeedLimitApi.class
            java.lang.Class<com.kwad.components.core.q.a> r1 = com.kwad.components.core.q.a.class
            com.kwad.sdk.service.c.b(r0, r1)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public static int sA() {
            int r0 = com.kwad.components.core.q.b.XK
            int r0 = r0 / 1024
            return r0
    }

    public static com.kwad.components.core.q.b sy() {
            com.kwad.components.core.q.b r0 = com.kwad.components.core.q.b.XJ
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.core.q.b> r0 = com.kwad.components.core.q.b.class
            monitor-enter(r0)
            com.kwad.components.core.q.b r1 = com.kwad.components.core.q.b.XJ     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.core.q.b r1 = new com.kwad.components.core.q.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.q.b.XJ = r1     // Catch: java.lang.Throwable -> L13
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
            com.kwad.components.core.q.b r0 = com.kwad.components.core.q.b.XJ
            return r0
    }

    public static boolean sz() {
            boolean r0 = com.kwad.components.core.q.b.XL
            return r0
    }

    private static synchronized java.io.InputStream wrap(@androidx.annotation.NonNull java.io.InputStream r3) {
            java.lang.Class<com.kwad.components.core.q.b> r0 = com.kwad.components.core.q.b.class
            monitor-enter(r0)
            java.util.Set<com.kwad.components.core.q.c> r1 = com.kwad.components.core.q.b.XN     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1a
            int r2 = com.kwad.components.core.q.b.XK     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + 1
            int r2 = r2 / r1
            com.kwad.components.core.q.c r1 = new com.kwad.components.core.q.c     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.Set<com.kwad.components.core.q.c> r3 = com.kwad.components.core.q.b.XN     // Catch: java.lang.Throwable -> L1a
            r3.add(r1)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return r1
        L1a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    public static java.io.InputStream wrapInputStream(java.io.InputStream r0) {
            java.io.InputStream r0 = wrap(r0)
            return r0
    }

    public final synchronized int sB() {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.Set<com.kwad.components.core.q.c> r1 = com.kwad.components.core.q.b.XN     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
        L8:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            com.kwad.components.core.q.c r2 = (com.kwad.components.core.q.c) r2     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            long r2 = r2.sC()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            int r3 = (int) r2
            int r0 = r0 + r3
            goto L8
        L1b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r0
        L1e:
            monitor-exit(r4)
            return r0
    }
}
