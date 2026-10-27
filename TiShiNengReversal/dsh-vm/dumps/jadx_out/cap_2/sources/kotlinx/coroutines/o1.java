package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n60#2:544\n61#2,7:550\n28#3,4:545\n20#4:549\n56#5:557\n1#6:558\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n269#1:544\n269#1:550,7\n269#1:545,4\n269#1:549\n280#1:557\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class o1 extends kotlinx.coroutines.p1 implements kotlinx.coroutines.z0 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater e = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _delayed;

    @kotlin.jvm.Volatile
    private volatile int _isCompleted;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _queue;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    private final class a extends kotlinx.coroutines.o1.c {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.p<kotlin.n1> c;
        final /* synthetic */ kotlinx.coroutines.o1 d;

        public a(kotlinx.coroutines.o1 r1, @org.jetbrains.annotations.NotNull long r2, kotlinx.coroutines.p<? super kotlin.n1> r4) {
                r0 = this;
                r0.d = r1
                r0.<init>(r2)
                r0.c = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                kotlinx.coroutines.p<kotlin.n1> r0 = r3.c
                kotlinx.coroutines.o1 r1 = r3.d
                kotlin.n1 r2 = kotlin.n1.a
                r0.P(r1, r2)
                return
        }

        @Override // kotlinx.coroutines.o1.c
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                kotlinx.coroutines.p<kotlin.n1> r1 = r2.c
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b extends kotlinx.coroutines.o1.c {

        @org.jetbrains.annotations.NotNull
        private final java.lang.Runnable c;

        public b(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
                r0 = this;
                r0.<init>(r1)
                r0.c = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.c
                r0.run()
                return
        }

        @Override // kotlinx.coroutines.o1.c
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.Runnable r1 = r2.c
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,543:1\n28#2,4:544\n28#2,4:550\n28#2,4:562\n20#3:548\n20#3:554\n20#3:566\n72#4:549\n73#4,7:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n437#1:544,4\n439#1:550,4\n479#1:562,4\n437#1:548\n439#1:554\n479#1:566\n439#1:549\n439#1:555,7\n*E\n"})
    public static abstract class c implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.o1.c>, kotlinx.coroutines.j1, kotlinx.coroutines.internal.d1 {

        @org.jetbrains.annotations.Nullable
        private volatile java.lang.Object _heap;

        @kotlin.jvm.JvmField
        public long a;
        private int b;

        public c(long r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r1 = -1
                r0.b = r1
                return
        }

        @Override // kotlinx.coroutines.internal.d1
        public void a(@org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.c1<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2._heap
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.r1.b()
                if (r0 == r1) goto Lb
                r2._heap = r3
                return
            Lb:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                r3.<init>(r0)
                throw r3
        }

        @Override // kotlinx.coroutines.internal.d1
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.c1<?> c() {
                r2 = this;
                java.lang.Object r0 = r2._heap
                boolean r1 = r0 instanceof kotlinx.coroutines.internal.c1
                if (r1 == 0) goto L9
                kotlinx.coroutines.internal.c1 r0 = (kotlinx.coroutines.internal.c1) r0
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(kotlinx.coroutines.o1.c r1) {
                r0 = this;
                kotlinx.coroutines.o1$c r1 = (kotlinx.coroutines.o1.c) r1
                int r1 = r0.d(r1)
                return r1
        }

        public int d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.o1.c r5) {
                r4 = this;
                long r0 = r4.a
                long r2 = r5.a
                long r0 = r0 - r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto Ld
                r5 = 1
                return r5
            Ld:
                if (r5 >= 0) goto L11
                r5 = -1
                return r5
            L11:
                r5 = 0
                return r5
        }

        @Override // kotlinx.coroutines.j1
        public final void dispose() {
                r2 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2._heap     // Catch: java.lang.Throwable -> L12
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.r1.b()     // Catch: java.lang.Throwable -> L12
                if (r0 != r1) goto Lb
                monitor-exit(r2)
                return
            Lb:
                boolean r1 = r0 instanceof kotlinx.coroutines.o1.d     // Catch: java.lang.Throwable -> L12
                if (r1 == 0) goto L14
                kotlinx.coroutines.o1$d r0 = (kotlinx.coroutines.o1.d) r0     // Catch: java.lang.Throwable -> L12
                goto L15
            L12:
                r0 = move-exception
                goto L24
            L14:
                r0 = 0
            L15:
                if (r0 == 0) goto L1a
                r0.k(r2)     // Catch: java.lang.Throwable -> L12
            L1a:
                kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.r1.b()     // Catch: java.lang.Throwable -> L12
                r2._heap = r0     // Catch: java.lang.Throwable -> L12
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L12
                monitor-exit(r2)
                return
            L24:
                monitor-exit(r2)
                throw r0
        }

        @Override // kotlinx.coroutines.internal.d1
        public int getIndex() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public final int h(long r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.o1.d r10, @org.jetbrains.annotations.NotNull kotlinx.coroutines.o1 r11) {
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L1d
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.r1.b()     // Catch: java.lang.Throwable -> L1d
                if (r0 != r1) goto Lc
                monitor-exit(r7)
                r8 = 2
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L1d
                kotlinx.coroutines.internal.d1 r0 = r10.f()     // Catch: java.lang.Throwable -> L26
                kotlinx.coroutines.o1$c r0 = (kotlinx.coroutines.o1.c) r0     // Catch: java.lang.Throwable -> L26
                boolean r11 = kotlinx.coroutines.o1.S(r11)     // Catch: java.lang.Throwable -> L26
                if (r11 == 0) goto L1f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r7)
                r8 = 1
                return r8
            L1d:
                r8 = move-exception
                goto L50
            L1f:
                r1 = 0
                if (r0 != 0) goto L28
                r10.c = r8     // Catch: java.lang.Throwable -> L26
                goto L3c
            L26:
                r8 = move-exception
                goto L4e
            L28:
                long r3 = r0.a     // Catch: java.lang.Throwable -> L26
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L31
                goto L32
            L31:
                r8 = r3
            L32:
                long r3 = r10.c     // Catch: java.lang.Throwable -> L26
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L3c
                r10.c = r8     // Catch: java.lang.Throwable -> L26
            L3c:
                long r8 = r7.a     // Catch: java.lang.Throwable -> L26
                long r3 = r10.c     // Catch: java.lang.Throwable -> L26
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L47
                r7.a = r3     // Catch: java.lang.Throwable -> L26
            L47:
                r10.a(r7)     // Catch: java.lang.Throwable -> L26
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r7)
                r8 = 0
                return r8
            L4e:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                throw r8     // Catch: java.lang.Throwable -> L1d
            L50:
                monitor-exit(r7)
                throw r8
        }

        public final boolean i(long r4) {
                r3 = this;
                long r0 = r3.a
                long r4 = r4 - r0
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto Lb
                r4 = 1
                return r4
            Lb:
                r4 = 0
                return r4
        }

        @Override // kotlinx.coroutines.internal.d1
        public void setIndex(int r1) {
                r0 = this;
                r0.b = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Delayed[nanos="
                r0.append(r1)
                long r1 = r3.a
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlinx.coroutines.internal.c1<kotlinx.coroutines.o1.c> {

        @kotlin.jvm.JvmField
        public long c;

        public d(long r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }
    }

    static {
            java.lang.String r0 = "_queue"
            java.lang.Class<kotlinx.coroutines.o1> r1 = kotlinx.coroutines.o1.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.o1.d = r0
            java.lang.String r0 = "_delayed"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.o1.e = r0
            java.lang.String r0 = "_isCompleted"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.o1.f = r0
            return
    }

    public o1() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isCompleted = r0
            return
    }

    public static final /* synthetic */ boolean S(kotlinx.coroutines.o1 r0) {
            boolean r0 = r0.isCompleted()
            return r0
    }

    private final void T() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.d
        L2:
            java.lang.Object r1 = r0.get(r5)
            if (r1 != 0) goto L16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.o1.d
            r2 = 0
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.r1.a()
            boolean r1 = androidx.concurrent.futures.a.a(r1, r5, r2, r3)
            if (r1 == 0) goto L2
            goto L42
        L16:
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.a0
            if (r2 == 0) goto L20
            kotlinx.coroutines.internal.a0 r1 = (kotlinx.coroutines.internal.a0) r1
            r1.d()
            return
        L20:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.r1.a()
            if (r1 != r2) goto L27
            goto L42
        L27:
            kotlinx.coroutines.internal.a0 r2 = new kotlinx.coroutines.internal.a0
            r3 = 8
            r4 = 1
            r2.<init>(r3, r4)
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.g0.n(r1, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.o1.d
            boolean r1 = androidx.concurrent.futures.a.a(r3, r5, r1, r2)
            if (r1 == 0) goto L2
        L42:
            return
    }

    private final java.lang.Runnable V() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.d
        L2:
            java.lang.Object r1 = r0.get(r5)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r3 = r1 instanceof kotlinx.coroutines.internal.a0
            if (r3 == 0) goto L2b
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = r1
            kotlinx.coroutines.internal.a0 r2 = (kotlinx.coroutines.internal.a0) r2
            java.lang.Object r3 = r2.n()
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.internal.a0.t
            if (r3 == r4) goto L21
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            return r3
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.o1.d
            kotlinx.coroutines.internal.a0 r2 = r2.m()
            androidx.concurrent.futures.a.a(r3, r5, r1, r2)
            goto L2
        L2b:
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.r1.a()
            if (r1 != r3) goto L32
            return r2
        L32:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.o1.d
            boolean r2 = androidx.concurrent.futures.a.a(r3, r5, r1, r2)
            if (r2 == 0) goto L2
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.g0.n(r1, r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            return r1
    }

    private final boolean X(java.lang.Runnable r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.d
        L2:
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r6.isCompleted()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            r2 = 1
            if (r1 != 0) goto L1b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.o1.d
            r3 = 0
            boolean r1 = androidx.concurrent.futures.a.a(r1, r6, r3, r7)
            if (r1 == 0) goto L2
            return r2
        L1b:
            boolean r4 = r1 instanceof kotlinx.coroutines.internal.a0
            if (r4 == 0) goto L3f
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            kotlin.jvm.internal.g0.n(r1, r4)
            r4 = r1
            kotlinx.coroutines.internal.a0 r4 = (kotlinx.coroutines.internal.a0) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L3e
            if (r5 == r2) goto L34
            r1 = 2
            if (r5 == r1) goto L33
            goto L2
        L33:
            return r3
        L34:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.o1.d
            kotlinx.coroutines.internal.a0 r3 = r4.m()
            androidx.concurrent.futures.a.a(r2, r6, r1, r3)
            goto L2
        L3e:
            return r2
        L3f:
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.r1.a()
            if (r1 != r4) goto L46
            return r3
        L46:
            kotlinx.coroutines.internal.a0 r3 = new kotlinx.coroutines.internal.a0
            r4 = 8
            r3.<init>(r4, r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.g0.n(r1, r4)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.o1.d
            boolean r1 = androidx.concurrent.futures.a.a(r4, r6, r1, r3)
            if (r1 == 0) goto L2
            return r2
    }

    private final void Y(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    private final void Z() {
            r3 = this;
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto Lb
            long r0 = r0.b()
            goto Lf
        Lb:
            long r0 = java.lang.System.nanoTime()
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.o1.e
            java.lang.Object r2 = r2.get(r3)
            kotlinx.coroutines.o1$d r2 = (kotlinx.coroutines.o1.d) r2
            if (r2 == 0) goto L26
            kotlinx.coroutines.internal.d1 r2 = r2.n()
            kotlinx.coroutines.o1$c r2 = (kotlinx.coroutines.o1.c) r2
            if (r2 != 0) goto L22
            goto L26
        L22:
            r3.Q(r0, r2)
            goto Lf
        L26:
            return
    }

    private final int c0(long r4, kotlinx.coroutines.o1.c r6) {
            r3 = this;
            boolean r0 = r3.isCompleted()
            if (r0 == 0) goto L8
            r4 = 1
            return r4
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.e
            java.lang.Object r1 = r0.get(r3)
            kotlinx.coroutines.o1$d r1 = (kotlinx.coroutines.o1.d) r1
            if (r1 != 0) goto L25
            kotlinx.coroutines.o1$d r1 = new kotlinx.coroutines.o1$d
            r1.<init>(r4)
            r2 = 0
            androidx.concurrent.futures.a.a(r0, r3, r2, r1)
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.g0.m(r0)
            r1 = r0
            kotlinx.coroutines.o1$d r1 = (kotlinx.coroutines.o1.d) r1
        L25:
            int r4 = r6.h(r4, r1, r3)
            return r4
    }

    private final void e0(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.o1.f
            r0.set(r1, r2)
            return
    }

    private final boolean f0(kotlinx.coroutines.o1.c r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.e
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.o1$d r0 = (kotlinx.coroutines.o1.d) r0
            if (r0 == 0) goto L11
            kotlinx.coroutines.internal.d1 r0 = r0.i()
            kotlinx.coroutines.o1$c r0 = (kotlinx.coroutines.o1.c) r0
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != r2) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    private final boolean isCompleted() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.o1.f
            int r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.n1
    protected boolean C() {
            r4 = this;
            boolean r0 = r4.I()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.e
            java.lang.Object r0 = r0.get(r4)
            kotlinx.coroutines.o1$d r0 = (kotlinx.coroutines.o1.d) r0
            if (r0 == 0) goto L19
            boolean r0 = r0.h()
            if (r0 != 0) goto L19
            return r1
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.d
            java.lang.Object r0 = r0.get(r4)
            r2 = 1
            if (r0 != 0) goto L23
            return r2
        L23:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.a0
            if (r3 == 0) goto L2e
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.a0) r0
            boolean r0 = r0.h()
            return r0
        L2e:
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.r1.a()
            if (r0 != r3) goto L35
            return r2
        L35:
            return r1
    }

    @Override // kotlinx.coroutines.n1
    public long J() {
            r9 = this;
            boolean r0 = r9.N()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.e
            java.lang.Object r0 = r0.get(r9)
            kotlinx.coroutines.o1$d r0 = (kotlinx.coroutines.o1.d) r0
            if (r0 == 0) goto L51
            boolean r3 = r0.h()
            if (r3 != 0) goto L51
            kotlinx.coroutines.b r3 = kotlinx.coroutines.c.b()
            if (r3 == 0) goto L24
            long r3 = r3.b()
            goto L28
        L24:
            long r3 = java.lang.System.nanoTime()
        L28:
            monitor-enter(r0)
            kotlinx.coroutines.internal.d1 r5 = r0.f()     // Catch: java.lang.Throwable -> L40
            r6 = 0
            if (r5 != 0) goto L32
            monitor-exit(r0)
            goto L4a
        L32:
            kotlinx.coroutines.o1$c r5 = (kotlinx.coroutines.o1.c) r5     // Catch: java.lang.Throwable -> L40
            boolean r7 = r5.i(r3)     // Catch: java.lang.Throwable -> L40
            r8 = 0
            if (r7 == 0) goto L42
            boolean r5 = r9.X(r5)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r1 = move-exception
            goto L4f
        L42:
            r5 = 0
        L43:
            if (r5 == 0) goto L49
            kotlinx.coroutines.internal.d1 r6 = r0.l(r8)     // Catch: java.lang.Throwable -> L40
        L49:
            monitor-exit(r0)
        L4a:
            kotlinx.coroutines.o1$c r6 = (kotlinx.coroutines.o1.c) r6
            if (r6 != 0) goto L28
            goto L51
        L4f:
            monitor-exit(r0)
            throw r1
        L51:
            java.lang.Runnable r0 = r9.V()
            if (r0 == 0) goto L5b
            r0.run()
            return r1
        L5b:
            long r0 = r9.x()
            return r0
    }

    public void W(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.X(r2)
            if (r0 == 0) goto La
            r1.R()
            return
        La:
            kotlinx.coroutines.v0 r0 = kotlinx.coroutines.v0.g
            r0.W(r2)
            return
    }

    protected final void a0() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.d
            r1 = 0
            r0.set(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.e
            r0.set(r2, r1)
            return
    }

    public final void b0(long r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.o1.c r5) {
            r2 = this;
            int r0 = r2.c0(r3, r5)
            if (r0 == 0) goto L19
            r1 = 1
            if (r0 == r1) goto L15
            r3 = 2
            if (r0 != r3) goto Ld
            goto L22
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "unexpected result"
            r3.<init>(r4)
            throw r3
        L15:
            r2.Q(r3, r5)
            return
        L19:
            boolean r3 = r2.f0(r5)
            if (r3 == 0) goto L22
            r2.R()
        L22:
            return
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.j1 d0(long r4, @org.jetbrains.annotations.NotNull java.lang.Runnable r6) {
            r3 = this;
            long r4 = kotlinx.coroutines.r1.d(r4)
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L26
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L18
            long r0 = r0.b()
            goto L1c
        L18:
            long r0 = java.lang.System.nanoTime()
        L1c:
            kotlinx.coroutines.o1$b r2 = new kotlinx.coroutines.o1$b
            long r4 = r4 + r0
            r2.<init>(r4, r6)
            r3.b0(r0, r2)
            return r2
        L26:
            kotlinx.coroutines.s2 r4 = kotlinx.coroutines.s2.a
            return r4
    }

    @Override // kotlinx.coroutines.m0
    public final void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r0.W(r2)
            return
    }

    @Override // kotlinx.coroutines.z0
    public void i(long r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super kotlin.n1> r6) {
            r3 = this;
            long r4 = kotlinx.coroutines.r1.d(r4)
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L28
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L18
            long r0 = r0.b()
            goto L1c
        L18:
            long r0 = java.lang.System.nanoTime()
        L1c:
            kotlinx.coroutines.o1$a r2 = new kotlinx.coroutines.o1$a
            long r4 = r4 + r0
            r2.<init>(r3, r4, r6)
            r3.b0(r0, r2)
            kotlinx.coroutines.s.a(r6, r2)
        L28:
            return
    }

    @Override // kotlinx.coroutines.z0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.j1 m(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4) {
            r0 = this;
            kotlinx.coroutines.j1 r1 = kotlinx.coroutines.z0.a.b(r0, r1, r3, r4)
            return r1
    }

    @Override // kotlinx.coroutines.z0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object r(long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.z0.a.a(r0, r1, r3)
            return r1
    }

    @Override // kotlinx.coroutines.n1
    public void shutdown() {
            r5 = this;
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.g3.a
            r0.c()
            r0 = 1
            r5.e0(r0)
            r5.T()
        Lc:
            long r0 = r5.J()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lc
            r5.Z()
            return
    }

    @Override // kotlinx.coroutines.n1
    protected long x() {
            r6 = this;
            long r0 = super.x()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.d
            java.lang.Object r0 = r0.get(r6)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L2d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.a0
            if (r1 == 0) goto L25
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.a0) r0
            boolean r0 = r0.h()
            if (r0 != 0) goto L2d
            return r2
        L25:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.r1.a()
            if (r0 != r1) goto L2c
            return r4
        L2c:
            return r2
        L2d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.o1.e
            java.lang.Object r0 = r0.get(r6)
            kotlinx.coroutines.o1$d r0 = (kotlinx.coroutines.o1.d) r0
            if (r0 == 0) goto L57
            kotlinx.coroutines.internal.d1 r0 = r0.i()
            kotlinx.coroutines.o1$c r0 = (kotlinx.coroutines.o1.c) r0
            if (r0 != 0) goto L40
            goto L57
        L40:
            long r0 = r0.a
            kotlinx.coroutines.b r4 = kotlinx.coroutines.c.b()
            if (r4 == 0) goto L4d
            long r4 = r4.b()
            goto L51
        L4d:
            long r4 = java.lang.System.nanoTime()
        L51:
            long r0 = r0 - r4
            long r0 = kotlin.ranges.t.v(r0, r2)
            return r0
        L57:
            return r4
    }
}
