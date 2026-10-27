package kotlinx.coroutines.sync;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class e implements kotlinx.coroutines.sync.d {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater e = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater g = null;

    @kotlin.jvm.Volatile
    private volatile int _availablePermits;
    private final int a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> b;

    @kotlin.jvm.Volatile
    private volatile long deqIdx;

    @kotlin.jvm.Volatile
    private volatile long enqIdx;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object head;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object tail;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.sync.g, kotlinx.coroutines.sync.g> {
        public static final kotlinx.coroutines.sync.e.a a = null;

        static {
                kotlinx.coroutines.sync.e$a r0 = new kotlinx.coroutines.sync.e$a
                r0.<init>()
                kotlinx.coroutines.sync.e.a.a = r0
                return
        }

        a() {
                r6 = this;
                java.lang.String r4 = "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"
                r5 = 1
                r1 = 2
                java.lang.Class<kotlinx.coroutines.sync.f> r2 = kotlinx.coroutines.sync.f.class
                java.lang.String r3 = "createSegment"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.sync.g c(long r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.sync.g r3) {
                r0 = this;
                kotlinx.coroutines.sync.g r1 = kotlinx.coroutines.sync.f.c(r1, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlinx.coroutines.sync.g invoke(java.lang.Long r3, kotlinx.coroutines.sync.g r4) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                kotlinx.coroutines.sync.g r4 = (kotlinx.coroutines.sync.g) r4
                kotlinx.coroutines.sync.g r3 = r2.c(r0, r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ kotlinx.coroutines.sync.e a;

        b(kotlinx.coroutines.sync.e r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
                r0 = this;
                kotlinx.coroutines.sync.e r1 = r0.a
                r1.release()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.sync.g, kotlinx.coroutines.sync.g> {
        public static final kotlinx.coroutines.sync.e.c a = null;

        static {
                kotlinx.coroutines.sync.e$c r0 = new kotlinx.coroutines.sync.e$c
                r0.<init>()
                kotlinx.coroutines.sync.e.c.a = r0
                return
        }

        c() {
                r6 = this;
                java.lang.String r4 = "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"
                r5 = 1
                r1 = 2
                java.lang.Class<kotlinx.coroutines.sync.f> r2 = kotlinx.coroutines.sync.f.class
                java.lang.String r3 = "createSegment"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.sync.g c(long r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.sync.g r3) {
                r0 = this;
                kotlinx.coroutines.sync.g r1 = kotlinx.coroutines.sync.f.c(r1, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlinx.coroutines.sync.g invoke(java.lang.Long r3, kotlinx.coroutines.sync.g r4) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                kotlinx.coroutines.sync.g r4 = (kotlinx.coroutines.sync.g) r4
                kotlinx.coroutines.sync.g r3 = r2.c(r0, r4)
                return r3
        }
    }

    static {
            java.lang.String r0 = "head"
            java.lang.Class<kotlinx.coroutines.sync.e> r1 = kotlinx.coroutines.sync.e.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.sync.e.c = r0
            java.lang.String r0 = "deqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.sync.e.d = r0
            java.lang.String r0 = "tail"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.sync.e.e = r0
            java.lang.String r0 = "enqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.sync.e.f = r0
            java.lang.String r0 = "_availablePermits"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.sync.e.g = r0
            return
    }

    public e(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r5.a = r6
            if (r6 <= 0) goto L3e
            if (r7 < 0) goto L23
            if (r7 > r6) goto L23
            kotlinx.coroutines.sync.g r0 = new kotlinx.coroutines.sync.g
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r3, r1, r2)
            r5.head = r0
            r5.tail = r0
            int r6 = r6 - r7
            r5._availablePermits = r6
            kotlinx.coroutines.sync.e$b r6 = new kotlinx.coroutines.sync.e$b
            r6.<init>(r5)
            r5.b = r6
            return
        L23:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "The number of acquired permits should be in 0.."
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L3e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Semaphore should have at least 1 permit, but had "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public static final /* synthetic */ java.lang.Object d(kotlinx.coroutines.sync.e r0, kotlin.coroutines.e r1) {
            java.lang.Object r0 = r0.i(r1)
            return r0
    }

    public static final /* synthetic */ boolean e(kotlinx.coroutines.sync.e r0, kotlinx.coroutines.r3 r1) {
            boolean r0 = r0.j(r1)
            return r0
    }

    private final <W> void f(W r2, kotlin.jvm.functions.Function1<? super W, java.lang.Boolean> r3, kotlin.jvm.functions.Function1<? super W, kotlin.n1> r4) {
            r1 = this;
        L0:
            int r0 = r1.l()
            if (r0 <= 0) goto La
            r4.invoke(r2)
            return
        La:
            java.lang.Object r0 = r3.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L0
            return
    }

    static /* synthetic */ java.lang.Object h(kotlinx.coroutines.sync.e r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            int r0 = r1.l()
            if (r0 <= 0) goto L9
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L9:
            java.lang.Object r1 = r1.i(r2)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto L14
            return r1
        L14:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final java.lang.Object i(kotlin.coroutines.e<? super kotlin.n1> r3) {
            r2 = this;
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r3)
            kotlinx.coroutines.q r0 = kotlinx.coroutines.s.b(r0)
            boolean r1 = e(r2, r0)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            r2.g(r0)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L2b
        L14:
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L21
            kotlin.coroutines.jvm.internal.e.c(r3)
        L21:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r3) goto L28
            return r0
        L28:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
        L2b:
            r0.N()
            throw r3
    }

    private final boolean j(kotlinx.coroutines.r3 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.e.e
            java.lang.Object r3 = r2.get(r0)
            kotlinx.coroutines.sync.g r3 = (kotlinx.coroutines.sync.g) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.sync.e.f
            long r4 = r4.getAndIncrement(r0)
            kotlinx.coroutines.sync.e$a r6 = kotlinx.coroutines.sync.e.a.a
            int r7 = kotlinx.coroutines.sync.f.h()
            long r7 = (long) r7
            long r7 = r4 / r7
        L1b:
            java.lang.Object r9 = kotlinx.coroutines.internal.f.g(r3, r7, r6)
            boolean r10 = kotlinx.coroutines.internal.q0.h(r9)
            if (r10 != 0) goto L59
            kotlinx.coroutines.internal.p0 r10 = kotlinx.coroutines.internal.q0.f(r9)
        L29:
            java.lang.Object r11 = r2.get(r0)
            kotlinx.coroutines.internal.p0 r11 = (kotlinx.coroutines.internal.p0) r11
            long r12 = r11.c
            long r14 = r10.c
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L38
            goto L59
        L38:
            boolean r12 = r10.s()
            if (r12 != 0) goto L3f
            goto L1b
        L3f:
            boolean r12 = androidx.concurrent.futures.a.a(r2, r0, r11, r10)
            if (r12 == 0) goto L4f
            boolean r2 = r11.o()
            if (r2 == 0) goto L59
            r11.l()
            goto L59
        L4f:
            boolean r11 = r10.o()
            if (r11 == 0) goto L29
            r10.l()
            goto L29
        L59:
            kotlinx.coroutines.internal.p0 r2 = kotlinx.coroutines.internal.q0.f(r9)
            kotlinx.coroutines.sync.g r2 = (kotlinx.coroutines.sync.g) r2
            int r3 = kotlinx.coroutines.sync.f.h()
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.v()
            boolean r4 = com.google.common.util.concurrent.b.a(r5, r3, r4, r1)
            r5 = 1
            if (r4 == 0) goto L76
            r1.b(r2, r3)
            return r5
        L76:
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.sync.f.g()
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.sync.f.i()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.v()
            boolean r2 = com.google.common.util.concurrent.b.a(r2, r3, r4, r6)
            if (r2 == 0) goto Lc2
            boolean r2 = r1 instanceof kotlinx.coroutines.p
            if (r2 == 0) goto L9b
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlinx.coroutines.p r1 = (kotlinx.coroutines.p) r1
            kotlin.n1 r2 = kotlin.n1.a
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r3 = r0.b
            r1.o(r2, r3)
            goto La6
        L9b:
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.m
            if (r2 == 0) goto La7
            kotlinx.coroutines.selects.m r1 = (kotlinx.coroutines.selects.m) r1
            kotlin.n1 r2 = kotlin.n1.a
            r1.f(r2)
        La6:
            return r5
        La7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lc2:
            r1 = 0
            return r1
    }

    private final void k() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.e.g
            int r1 = r0.get(r3)
            int r2 = r3.a
            if (r1 <= r2) goto L10
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
        L10:
            return
    }

    private final int l() {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.e.g
            int r0 = r0.getAndDecrement(r2)
            int r1 = r2.a
            if (r0 > r1) goto L0
            return r0
    }

    private final boolean n(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof kotlinx.coroutines.p
            if (r0 == 0) goto L1d
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.g0.n(r4, r0)
            kotlinx.coroutines.p r4 = (kotlinx.coroutines.p) r4
            kotlin.n1 r0 = kotlin.n1.a
            r1 = 0
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r2 = r3.b
            java.lang.Object r0 = r4.O(r0, r1, r2)
            if (r0 == 0) goto L1b
            r4.B(r0)
            r4 = 1
            return r4
        L1b:
            r4 = 0
            return r4
        L1d:
            boolean r0 = r4 instanceof kotlinx.coroutines.selects.m
            if (r0 == 0) goto L2a
            kotlinx.coroutines.selects.m r4 = (kotlinx.coroutines.selects.m) r4
            kotlin.n1 r0 = kotlin.n1.a
            boolean r4 = r4.j(r3, r0)
            return r4
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final boolean o() {
            r15 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.e.c
            java.lang.Object r1 = r0.get(r15)
            kotlinx.coroutines.sync.g r1 = (kotlinx.coroutines.sync.g) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.sync.e.d
            long r2 = r2.getAndIncrement(r15)
            int r4 = kotlinx.coroutines.sync.f.h()
            long r4 = (long) r4
            long r4 = r2 / r4
            kotlinx.coroutines.sync.e$c r6 = kotlinx.coroutines.sync.e.c.a
        L17:
            java.lang.Object r7 = kotlinx.coroutines.internal.f.g(r1, r4, r6)
            boolean r8 = kotlinx.coroutines.internal.q0.h(r7)
            if (r8 != 0) goto L55
            kotlinx.coroutines.internal.p0 r8 = kotlinx.coroutines.internal.q0.f(r7)
        L25:
            java.lang.Object r9 = r0.get(r15)
            kotlinx.coroutines.internal.p0 r9 = (kotlinx.coroutines.internal.p0) r9
            long r10 = r9.c
            long r12 = r8.c
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L34
            goto L55
        L34:
            boolean r10 = r8.s()
            if (r10 != 0) goto L3b
            goto L17
        L3b:
            boolean r10 = androidx.concurrent.futures.a.a(r0, r15, r9, r8)
            if (r10 == 0) goto L4b
            boolean r0 = r9.o()
            if (r0 == 0) goto L55
            r9.l()
            goto L55
        L4b:
            boolean r9 = r8.o()
            if (r9 == 0) goto L25
            r8.l()
            goto L25
        L55:
            kotlinx.coroutines.internal.p0 r0 = kotlinx.coroutines.internal.q0.f(r7)
            kotlinx.coroutines.sync.g r0 = (kotlinx.coroutines.sync.g) r0
            r0.b()
            long r6 = r0.c
            r1 = 0
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L66
            return r1
        L66:
            int r4 = kotlinx.coroutines.sync.f.h()
            long r4 = (long) r4
            long r2 = r2 % r4
            int r3 = (int) r2
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.sync.f.g()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r0.v()
            java.lang.Object r2 = r4.getAndSet(r3, r2)
            if (r2 != 0) goto La6
            int r2 = kotlinx.coroutines.sync.f.f()
        L7f:
            r4 = 1
            if (r1 >= r2) goto L94
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r0.v()
            java.lang.Object r5 = r5.get(r3)
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.sync.f.i()
            if (r5 != r6) goto L91
            return r4
        L91:
            int r1 = r1 + 1
            goto L7f
        L94:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.sync.f.g()
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.sync.f.d()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.v()
            boolean r0 = com.google.common.util.concurrent.b.a(r0, r3, r1, r2)
            r0 = r0 ^ r4
            return r0
        La6:
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.sync.f.e()
            if (r2 != r0) goto Lad
            return r1
        Lad:
            boolean r0 = r15.n(r2)
            return r0
    }

    @Override // kotlinx.coroutines.sync.d
    public boolean a() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.e.g
            int r1 = r0.get(r3)
            int r2 = r3.a
            if (r1 <= r2) goto Le
            r3.k()
            goto L0
        Le:
            if (r1 > 0) goto L12
            r0 = 0
            return r0
        L12:
            int r2 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.sync.d
    public int b() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.e.g
            int r0 = r0.get(r2)
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.sync.d
    @org.jetbrains.annotations.Nullable
    public java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r1) {
            r0 = this;
            java.lang.Object r1 = h(r0, r1)
            return r1
    }

    protected final void g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super kotlin.n1> r3) {
            r2 = this;
        L0:
            int r0 = r2.l()
            if (r0 <= 0) goto Le
            kotlin.n1 r0 = kotlin.n1.a
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r1 = r2.b
            r3.o(r0, r1)
            return
        Le:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter"
            kotlin.jvm.internal.g0.n(r3, r0)
            r0 = r3
            kotlinx.coroutines.r3 r0 = (kotlinx.coroutines.r3) r0
            boolean r0 = r2.j(r0)
            if (r0 == 0) goto L0
            return
    }

    protected final void m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r0 = this;
        L0:
            int r2 = r0.l()
            if (r2 <= 0) goto Lc
            kotlin.n1 r2 = kotlin.n1.a
            r1.f(r2)
            return
        Lc:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = r1
            kotlinx.coroutines.r3 r2 = (kotlinx.coroutines.r3) r2
            boolean r2 = r0.j(r2)
            if (r2 == 0) goto L0
            return
    }

    @Override // kotlinx.coroutines.sync.d
    public void release() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.e.g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.a
            if (r0 >= r1) goto L14
            if (r0 < 0) goto Ld
            goto L13
        Ld:
            boolean r0 = r3.o()
            if (r0 == 0) goto L0
        L13:
            return
        L14:
            r3.k()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
