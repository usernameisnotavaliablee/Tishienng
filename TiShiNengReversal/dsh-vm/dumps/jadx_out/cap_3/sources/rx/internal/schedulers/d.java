package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d implements rx.internal.schedulers.j {
    private static final java.util.concurrent.ScheduledExecutorService[] b = null;
    private static final java.util.concurrent.ScheduledExecutorService c = null;
    public static final rx.internal.schedulers.d d = null;
    private static int e;
    private final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService[]> a;

    static {
            r0 = 0
            java.util.concurrent.ScheduledExecutorService[] r1 = new java.util.concurrent.ScheduledExecutorService[r0]
            rx.internal.schedulers.d.b = r1
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            rx.internal.schedulers.d.c = r0
            r0.shutdown()
            rx.internal.schedulers.d r0 = new rx.internal.schedulers.d
            r0.<init>()
            rx.internal.schedulers.d.d = r0
            return
    }

    private d() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.util.concurrent.ScheduledExecutorService[] r1 = rx.internal.schedulers.d.b
            r0.<init>(r1)
            r2.a = r0
            r2.start()
            return
    }

    public static java.util.concurrent.ScheduledExecutorService a() {
            rx.internal.schedulers.d r0 = rx.internal.schedulers.d.d
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService[]> r0 = r0.a
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService[] r0 = (java.util.concurrent.ScheduledExecutorService[]) r0
            java.util.concurrent.ScheduledExecutorService[] r1 = rx.internal.schedulers.d.b
            if (r0 != r1) goto L11
            java.util.concurrent.ScheduledExecutorService r0 = rx.internal.schedulers.d.c
            return r0
        L11:
            int r1 = rx.internal.schedulers.d.e
            int r1 = r1 + 1
            int r2 = r0.length
            if (r1 < r2) goto L19
            r1 = 0
        L19:
            rx.internal.schedulers.d.e = r1
            r0 = r0[r1]
            return r0
    }

    @Override // rx.internal.schedulers.j
    public void shutdown() {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService[]> r0 = r4.a
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService[] r0 = (java.util.concurrent.ScheduledExecutorService[]) r0
            java.util.concurrent.ScheduledExecutorService[] r1 = rx.internal.schedulers.d.b
            if (r0 != r1) goto Ld
            goto L24
        Ld:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService[]> r2 = r4.a
            boolean r1 = androidx.camera.view.p.a(r2, r0, r1)
            if (r1 == 0) goto L0
            int r1 = r0.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L24
            r3 = r0[r2]
            rx.internal.schedulers.h.g(r3)
            r3.shutdownNow()
            int r2 = r2 + 1
            goto L17
        L24:
            return
    }

    @Override // rx.internal.schedulers.j
    public void start() {
            r5 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            r1 = 4
            if (r0 <= r1) goto Ld
            int r0 = r0 / 2
        Ld:
            r1 = 8
            if (r0 <= r1) goto L13
            r0 = 8
        L13:
            java.util.concurrent.ScheduledExecutorService[] r1 = new java.util.concurrent.ScheduledExecutorService[r0]
            r2 = 0
            r3 = 0
        L17:
            if (r3 >= r0) goto L22
            java.util.concurrent.ScheduledExecutorService r4 = rx.internal.schedulers.e.a()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L17
        L22:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService[]> r3 = r5.a
            java.util.concurrent.ScheduledExecutorService[] r4 = rx.internal.schedulers.d.b
            boolean r3 = androidx.camera.view.p.a(r3, r4, r1)
            if (r3 == 0) goto L42
        L2c:
            if (r2 >= r0) goto L4c
            r3 = r1[r2]
            boolean r4 = rx.internal.schedulers.h.N(r3)
            if (r4 != 0) goto L3f
            boolean r4 = r3 instanceof java.util.concurrent.ScheduledThreadPoolExecutor
            if (r4 == 0) goto L3f
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = (java.util.concurrent.ScheduledThreadPoolExecutor) r3
            rx.internal.schedulers.h.A(r3)
        L3f:
            int r2 = r2 + 1
            goto L2c
        L42:
            if (r2 >= r0) goto L4c
            r3 = r1[r2]
            r3.shutdownNow()
            int r2 = r2 + 1
            goto L42
        L4c:
            return
    }
}
