package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v0 extends kotlinx.coroutines.o1 implements java.lang.Runnable {

    @org.jetbrains.annotations.Nullable
    private static volatile java.lang.Thread _thread = null;
    private static volatile int debugStatus = 0;

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.v0 g = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String h = "kotlinx.coroutines.DefaultExecutor";
    private static final long i = 1000;
    private static final long j = 0;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;

    static {
            kotlinx.coroutines.v0 r0 = new kotlinx.coroutines.v0
            r0.<init>()
            kotlinx.coroutines.v0.g = r0
            r1 = 1
            r2 = 0
            r3 = 0
            kotlinx.coroutines.n1.B(r0, r3, r1, r2)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r1 = java.lang.Long.getLong(r3, r1)     // Catch: java.lang.SecurityException -> L18
            goto L1c
        L18:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L1c:
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.v0.j = r0
            return
    }

    private v0() {
            r0 = this;
            r0.<init>()
            return
    }

    private final synchronized void g0() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.l0()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 3
            kotlinx.coroutines.v0.debugStatus = r0     // Catch: java.lang.Throwable -> L19
            r1.a0()     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r1, r0)     // Catch: java.lang.Throwable -> L19
            r1.notifyAll()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)
            return
        L19:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    private final synchronized java.lang.Thread h0() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Thread r0 = kotlinx.coroutines.v0._thread     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.v0._thread = r0     // Catch: java.lang.Throwable -> L16
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L16
            r0.start()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r2)
            return r0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    private static /* synthetic */ void j0() {
            return
    }

    private final boolean k0() {
            r2 = this;
            int r0 = kotlinx.coroutines.v0.debugStatus
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    private final boolean l0() {
            r2 = this;
            int r0 = kotlinx.coroutines.v0.debugStatus
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    private final synchronized boolean n0() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.l0()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto La
            monitor-exit(r2)
            r0 = 0
            return r0
        La:
            r0 = 1
            kotlinx.coroutines.v0.debugStatus = r0     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r2, r1)     // Catch: java.lang.Throwable -> L17
            r2.notifyAll()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    private final void o0() {
            r2 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.p1
    @org.jetbrains.annotations.NotNull
    protected java.lang.Thread P() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.v0._thread
            if (r0 != 0) goto L8
            java.lang.Thread r0 = r1.h0()
        L8:
            return r0
    }

    @Override // kotlinx.coroutines.p1
    protected void Q(long r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.o1.c r3) {
            r0 = this;
            r0.o0()
            return
    }

    @Override // kotlinx.coroutines.o1
    public void W(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.k0()
            if (r0 == 0) goto L9
            r1.o0()
        L9:
            super.W(r2)
            return
    }

    public final synchronized void i0() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            kotlinx.coroutines.v0.debugStatus = r0     // Catch: java.lang.Throwable -> L14
            r1.h0()     // Catch: java.lang.Throwable -> L14
        L7:
            int r0 = kotlinx.coroutines.v0.debugStatus     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r1, r0)     // Catch: java.lang.Throwable -> L14
            r1.wait()     // Catch: java.lang.Throwable -> L14
            goto L7
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r1)
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // kotlinx.coroutines.o1, kotlinx.coroutines.z0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.j1 m(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4) {
            r0 = this;
            kotlinx.coroutines.j1 r1 = r0.d0(r1, r3)
            return r1
    }

    public final boolean m0() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.v0._thread
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final synchronized void p0(long r8) {
            r7 = this;
            monitor-enter(r7)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
            long r0 = r0 + r8
            boolean r2 = r7.l0()     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L12
            r2 = 2
            kotlinx.coroutines.v0.debugStatus = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r8 = move-exception
            goto L4b
        L12:
            int r2 = kotlinx.coroutines.v0.debugStatus     // Catch: java.lang.Throwable -> L10
            r3 = 3
            if (r2 == r3) goto L46
            java.lang.Thread r2 = kotlinx.coroutines.v0._thread     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L46
            java.lang.Thread r2 = kotlinx.coroutines.v0._thread     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L31
            kotlinx.coroutines.b r3 = kotlinx.coroutines.c.b()     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L2b
            r3.g(r2)     // Catch: java.lang.Throwable -> L10
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L10
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 != 0) goto L31
            java.util.concurrent.locks.LockSupport.unpark(r2)     // Catch: java.lang.Throwable -> L10
        L31:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
            long r2 = r0 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L46
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r7, r2)     // Catch: java.lang.Throwable -> L10
            r7.wait(r8)     // Catch: java.lang.Throwable -> L10
            goto L12
        L46:
            r8 = 0
            kotlinx.coroutines.v0.debugStatus = r8     // Catch: java.lang.Throwable -> L10
            monitor-exit(r7)
            return
        L4b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L10
            throw r8
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.g3.a
            r0.d(r12)
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto Le
            r0.d()
        Le:
            r0 = 0
            boolean r1 = r12.n0()     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L2d
            kotlinx.coroutines.v0._thread = r0
            r12.g0()
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L23
            r0.h()
        L23:
            boolean r0 = r12.C()
            if (r0 != 0) goto L9d
            r12.P()
            return
        L2d:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L33:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4b
            long r5 = r12.J()     // Catch: java.lang.Throwable -> L4b
            r7 = 0
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 != 0) goto L7b
            kotlinx.coroutines.b r9 = kotlinx.coroutines.c.b()     // Catch: java.lang.Throwable -> L4b
            if (r9 == 0) goto L4d
            long r9 = r9.b()     // Catch: java.lang.Throwable -> L4b
            goto L51
        L4b:
            r1 = move-exception
            goto Lb1
        L4d:
            long r9 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4b
        L51:
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 != 0) goto L58
            long r3 = kotlinx.coroutines.v0.j     // Catch: java.lang.Throwable -> L4b
            long r3 = r3 + r9
        L58:
            long r9 = r3 - r9
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L76
            kotlinx.coroutines.v0._thread = r0
            r12.g0()
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L6c
            r0.h()
        L6c:
            boolean r0 = r12.C()
            if (r0 != 0) goto L9d
            r12.P()
            return
        L76:
            long r5 = kotlin.ranges.t.C(r5, r9)     // Catch: java.lang.Throwable -> L4b
            goto L7c
        L7b:
            r3 = r1
        L7c:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L33
            boolean r7 = r12.l0()     // Catch: java.lang.Throwable -> L4b
            if (r7 == 0) goto L9e
            kotlinx.coroutines.v0._thread = r0
            r12.g0()
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L94
            r0.h()
        L94:
            boolean r0 = r12.C()
            if (r0 != 0) goto L9d
            r12.P()
        L9d:
            return
        L9e:
            kotlinx.coroutines.b r7 = kotlinx.coroutines.c.b()     // Catch: java.lang.Throwable -> L4b
            if (r7 == 0) goto Laa
            r7.c(r12, r5)     // Catch: java.lang.Throwable -> L4b
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L4b
            goto Lab
        Laa:
            r7 = r0
        Lab:
            if (r7 != 0) goto L33
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch: java.lang.Throwable -> L4b
            goto L33
        Lb1:
            kotlinx.coroutines.v0._thread = r0
            r12.g0()
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto Lbf
            r0.h()
        Lbf:
            boolean r0 = r12.C()
            if (r0 != 0) goto Lc8
            r12.P()
        Lc8:
            throw r1
    }

    @Override // kotlinx.coroutines.o1, kotlinx.coroutines.n1
    public void shutdown() {
            r1 = this;
            r0 = 4
            kotlinx.coroutines.v0.debugStatus = r0
            super.shutdown()
            return
    }
}
