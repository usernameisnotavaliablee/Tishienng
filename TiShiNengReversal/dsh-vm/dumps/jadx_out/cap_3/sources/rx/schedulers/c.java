package rx.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c {
    private static final java.util.concurrent.atomic.AtomicReference<rx.schedulers.c> d = null;
    private final rx.h a;
    private final rx.h b;
    private final rx.h c;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            rx.schedulers.c.d = r0
            return
    }

    private c() {
            r2 = this;
            r2.<init>()
            rx.plugins.f r0 = rx.plugins.f.c()
            rx.plugins.g r0 = r0.f()
            rx.h r1 = r0.g()
            if (r1 == 0) goto L14
            r2.a = r1
            goto L1a
        L14:
            rx.h r1 = rx.plugins.g.a()
            r2.a = r1
        L1a:
            rx.h r1 = r0.i()
            if (r1 == 0) goto L23
            r2.b = r1
            goto L29
        L23:
            rx.h r1 = rx.plugins.g.c()
            r2.b = r1
        L29:
            rx.h r0 = r0.j()
            if (r0 == 0) goto L32
            r2.c = r0
            return
        L32:
            rx.h r0 = rx.plugins.g.e()
            r2.c = r0
            return
    }

    public static rx.h a() {
            rx.schedulers.c r0 = c()
            rx.h r0 = r0.a
            rx.h r0 = rx.plugins.c.E(r0)
            return r0
    }

    public static rx.h b(java.util.concurrent.Executor r1) {
            rx.internal.schedulers.c r0 = new rx.internal.schedulers.c
            r0.<init>(r1)
            return r0
    }

    private static rx.schedulers.c c() {
        L0:
            java.util.concurrent.atomic.AtomicReference<rx.schedulers.c> r0 = rx.schedulers.c.d
            java.lang.Object r1 = r0.get()
            rx.schedulers.c r1 = (rx.schedulers.c) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            rx.schedulers.c r1 = new rx.schedulers.c
            r1.<init>()
            r2 = 0
            boolean r0 = androidx.camera.view.p.a(r0, r2, r1)
            if (r0 == 0) goto L18
            return r1
        L18:
            r1.i()
            goto L0
    }

    public static rx.h d() {
            rx.internal.schedulers.f r0 = rx.internal.schedulers.f.a
            return r0
    }

    public static rx.h e() {
            rx.schedulers.c r0 = c()
            rx.h r0 = r0.b
            rx.h r0 = rx.plugins.c.J(r0)
            return r0
    }

    public static rx.h f() {
            rx.schedulers.c r0 = c()
            rx.h r0 = r0.c
            rx.h r0 = rx.plugins.c.K(r0)
            return r0
    }

    public static void g() {
            java.util.concurrent.atomic.AtomicReference<rx.schedulers.c> r0 = rx.schedulers.c.d
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            rx.schedulers.c r0 = (rx.schedulers.c) r0
            if (r0 == 0) goto Le
            r0.i()
        Le:
            return
    }

    public static void h() {
            rx.schedulers.c r0 = c()
            r0.i()
            monitor-enter(r0)
            rx.internal.schedulers.d r1 = rx.internal.schedulers.d.d     // Catch: java.lang.Throwable -> Lf
            r1.shutdown()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static void j() {
            rx.schedulers.c r0 = c()
            r0.k()
            monitor-enter(r0)
            rx.internal.schedulers.d r1 = rx.internal.schedulers.d.d     // Catch: java.lang.Throwable -> Lf
            r1.start()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static rx.schedulers.d l() {
            rx.schedulers.d r0 = new rx.schedulers.d
            r0.<init>()
            return r0
    }

    public static rx.h m() {
            rx.internal.schedulers.m r0 = rx.internal.schedulers.m.a
            return r0
    }

    synchronized void i() {
            r2 = this;
            monitor-enter(r2)
            rx.h r0 = r2.a     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r0 instanceof rx.internal.schedulers.j     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            rx.internal.schedulers.j r0 = (rx.internal.schedulers.j) r0     // Catch: java.lang.Throwable -> Ld
            r0.shutdown()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L27
        Lf:
            rx.h r0 = r2.b     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r0 instanceof rx.internal.schedulers.j     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L1a
            rx.internal.schedulers.j r0 = (rx.internal.schedulers.j) r0     // Catch: java.lang.Throwable -> Ld
            r0.shutdown()     // Catch: java.lang.Throwable -> Ld
        L1a:
            rx.h r0 = r2.c     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r0 instanceof rx.internal.schedulers.j     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L25
            rx.internal.schedulers.j r0 = (rx.internal.schedulers.j) r0     // Catch: java.lang.Throwable -> Ld
            r0.shutdown()     // Catch: java.lang.Throwable -> Ld
        L25:
            monitor-exit(r2)
            return
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    synchronized void k() {
            r2 = this;
            monitor-enter(r2)
            rx.h r0 = r2.a     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r0 instanceof rx.internal.schedulers.j     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            rx.internal.schedulers.j r0 = (rx.internal.schedulers.j) r0     // Catch: java.lang.Throwable -> Ld
            r0.start()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L27
        Lf:
            rx.h r0 = r2.b     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r0 instanceof rx.internal.schedulers.j     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L1a
            rx.internal.schedulers.j r0 = (rx.internal.schedulers.j) r0     // Catch: java.lang.Throwable -> Ld
            r0.start()     // Catch: java.lang.Throwable -> Ld
        L1a:
            rx.h r0 = r2.c     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r0 instanceof rx.internal.schedulers.j     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L25
            rx.internal.schedulers.j r0 = (rx.internal.schedulers.j) r0     // Catch: java.lang.Throwable -> Ld
            r0.start()     // Catch: java.lang.Throwable -> Ld
        L25:
            monitor-exit(r2)
            return
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }
}
