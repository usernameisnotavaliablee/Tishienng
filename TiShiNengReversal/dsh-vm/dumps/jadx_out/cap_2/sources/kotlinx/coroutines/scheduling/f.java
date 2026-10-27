package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f extends kotlinx.coroutines.t1 implements kotlinx.coroutines.scheduling.k, java.util.concurrent.Executor {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater g = null;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.scheduling.d b;
    private final int c;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String d;
    private final int e;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> f;

    @kotlin.jvm.Volatile
    private volatile int inFlightTasks;

    static {
            java.lang.Class<kotlinx.coroutines.scheduling.f> r0 = kotlinx.coroutines.scheduling.f.class
            java.lang.String r1 = "inFlightTasks"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.f.g = r0
            return
    }

    public f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.d r1, int r2, @org.jetbrains.annotations.Nullable java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
            r1.<init>()
            r0.f = r1
            return
    }

    private final void u(java.lang.Runnable r4, boolean r5) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.f.g
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.c
            if (r1 > r2) goto L10
            kotlinx.coroutines.scheduling.d r0 = r3.b
            r0.x(r4, r3, r5)
            return
        L10:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.c
            if (r4 < r0) goto L1e
            goto L28
        L1e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L0
        L28:
            return
    }

    @Override // kotlinx.coroutines.t1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Close cannot be invoked on LimitingBlockingDispatcher"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r1 = 0
            r0.u(r2, r1)
            return
    }

    @Override // kotlinx.coroutines.m0
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r1 = 1
            r0.u(r2, r1)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.u(r2, r0)
            return
    }

    @Override // kotlinx.coroutines.scheduling.k
    public void o() {
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r3.f
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = 1
            if (r0 == 0) goto L11
            kotlinx.coroutines.scheduling.d r2 = r3.b
            r2.x(r0, r3, r1)
            return
        L11:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.f.g
            r0.decrementAndGet(r3)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r3.f
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L21
            return
        L21:
            r3.u(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.scheduling.k
    public int q() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // kotlinx.coroutines.t1
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor t() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.d
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[dispatcher = "
            r0.append(r1)
            kotlinx.coroutines.scheduling.d r1 = r2.b
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L23:
            return r0
    }
}
