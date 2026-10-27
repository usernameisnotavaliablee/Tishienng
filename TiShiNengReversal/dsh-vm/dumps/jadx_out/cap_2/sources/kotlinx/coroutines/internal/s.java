package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s extends kotlinx.coroutines.m0 implements kotlinx.coroutines.z0 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.m0 a;
    private final int b;
    private final /* synthetic */ kotlinx.coroutines.z0 c;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.internal.z<java.lang.Runnable> d;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object e;

    @kotlin.jvm.Volatile
    private volatile int runningWorkers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class a implements java.lang.Runnable {

        @org.jetbrains.annotations.NotNull
        private java.lang.Runnable a;
        final /* synthetic */ kotlinx.coroutines.internal.s b;

        public a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.s r1, java.lang.Runnable r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 0
            L1:
                java.lang.Runnable r1 = r3.a     // Catch: java.lang.Throwable -> L7
                r1.run()     // Catch: java.lang.Throwable -> L7
                goto Ld
            L7:
                r1 = move-exception
                kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                kotlinx.coroutines.o0.b(r2, r1)
            Ld:
                kotlinx.coroutines.internal.s r1 = r3.b
                java.lang.Runnable r1 = kotlinx.coroutines.internal.s.u(r1)
                if (r1 != 0) goto L16
                return
            L16:
                r3.a = r1
                int r0 = r0 + 1
                r1 = 16
                if (r0 < r1) goto L1
                kotlinx.coroutines.internal.s r1 = r3.b
                kotlinx.coroutines.m0 r1 = kotlinx.coroutines.internal.s.t(r1)
                kotlinx.coroutines.internal.s r2 = r3.b
                boolean r1 = r1.isDispatchNeeded(r2)
                if (r1 == 0) goto L1
                kotlinx.coroutines.internal.s r0 = r3.b
                kotlinx.coroutines.m0 r0 = kotlinx.coroutines.internal.s.t(r0)
                kotlinx.coroutines.internal.s r1 = r3.b
                r0.dispatch(r1, r3)
                return
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.internal.s> r0 = kotlinx.coroutines.internal.s.class
            java.lang.String r1 = "runningWorkers"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.s.f = r0
            return
    }

    public s(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            boolean r2 = r1 instanceof kotlinx.coroutines.z0
            if (r2 == 0) goto Le
            kotlinx.coroutines.z0 r1 = (kotlinx.coroutines.z0) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 != 0) goto L15
            kotlinx.coroutines.z0 r1 = kotlinx.coroutines.w0.a()
        L15:
            r0.c = r1
            kotlinx.coroutines.internal.z r1 = new kotlinx.coroutines.internal.z
            r2 = 0
            r1.<init>(r2)
            r0.d = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.e = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.m0 t(kotlinx.coroutines.internal.s r0) {
            kotlinx.coroutines.m0 r0 = r0.a
            return r0
    }

    public static final /* synthetic */ java.lang.Runnable u(kotlinx.coroutines.internal.s r0) {
            java.lang.Runnable r0 = r0.w()
            return r0
    }

    private final void v(java.lang.Runnable r2, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.s.a, kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.internal.z<java.lang.Runnable> r0 = r1.d
            r0.a(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.internal.s.f
            int r2 = r2.get(r1)
            int r0 = r1.b
            if (r2 < r0) goto L10
            goto L1d
        L10:
            boolean r2 = r1.x()
            if (r2 != 0) goto L17
            goto L1d
        L17:
            java.lang.Runnable r2 = r1.w()
            if (r2 != 0) goto L1e
        L1d:
            return
        L1e:
            kotlinx.coroutines.internal.s$a r0 = new kotlinx.coroutines.internal.s$a
            r0.<init>(r1, r2)
            r3.invoke(r0)
            return
    }

    private final java.lang.Runnable w() {
            r3 = this;
        L0:
            kotlinx.coroutines.internal.z<java.lang.Runnable> r0 = r3.d
            java.lang.Object r0 = r0.h()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L25
            java.lang.Object r0 = r3.e
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.s.f     // Catch: java.lang.Throwable -> L22
            r1.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            kotlinx.coroutines.internal.z<java.lang.Runnable> r2 = r3.d     // Catch: java.lang.Throwable -> L22
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1d
            monitor-exit(r0)
            r0 = 0
            return r0
        L1d:
            r1.incrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L0
        L22:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L25:
            return r0
    }

    private final boolean x() {
            r4 = this;
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.s.f     // Catch: java.lang.Throwable -> L16
            int r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.b     // Catch: java.lang.Throwable -> L16
            if (r2 < r3) goto L10
            monitor-exit(r0)
            r0 = 0
            return r0
        L10:
            r1.incrementAndGet(r4)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 1
            return r0
        L16:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            kotlinx.coroutines.internal.z<java.lang.Runnable> r1 = r0.d
            r1.a(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.s.f
            int r1 = r1.get(r0)
            int r2 = r0.b
            if (r1 >= r2) goto L26
            boolean r1 = r0.x()
            if (r1 == 0) goto L26
            java.lang.Runnable r1 = r0.w()
            if (r1 != 0) goto L1c
            goto L26
        L1c:
            kotlinx.coroutines.internal.s$a r2 = new kotlinx.coroutines.internal.s$a
            r2.<init>(r0, r1)
            kotlinx.coroutines.m0 r1 = r0.a
            r1.dispatch(r0, r2)
        L26:
            return
    }

    @Override // kotlinx.coroutines.m0
    @kotlinx.coroutines.InternalCoroutinesApi
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            kotlinx.coroutines.internal.z<java.lang.Runnable> r1 = r0.d
            r1.a(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.s.f
            int r1 = r1.get(r0)
            int r2 = r0.b
            if (r1 >= r2) goto L26
            boolean r1 = r0.x()
            if (r1 == 0) goto L26
            java.lang.Runnable r1 = r0.w()
            if (r1 != 0) goto L1c
            goto L26
        L1c:
            kotlinx.coroutines.internal.s$a r2 = new kotlinx.coroutines.internal.s$a
            r2.<init>(r0, r1)
            kotlinx.coroutines.m0 r1 = r0.a
            r1.dispatchYield(r0, r2)
        L26:
            return
    }

    @Override // kotlinx.coroutines.z0
    public void i(long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super kotlin.n1> r4) {
            r1 = this;
            kotlinx.coroutines.z0 r0 = r1.c
            r0.i(r2, r4)
            return
    }

    @Override // kotlinx.coroutines.m0
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.t.a(r2)
            int r0 = r1.b
            if (r2 < r0) goto L8
            return r1
        L8:
            kotlinx.coroutines.m0 r2 = super.limitedParallelism(r2)
            return r2
    }

    @Override // kotlinx.coroutines.z0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.j1 m(long r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r5) {
            r1 = this;
            kotlinx.coroutines.z0 r0 = r1.c
            kotlinx.coroutines.j1 r2 = r0.m(r2, r4, r5)
            return r2
    }

    @Override // kotlinx.coroutines.z0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object r(long r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r1 = this;
            kotlinx.coroutines.z0 r0 = r1.c
            java.lang.Object r2 = r0.r(r2, r4)
            return r2
    }
}
