package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,428:1\n18#2:429\n18#2:443\n28#3,4:430\n28#3,4:437\n20#4:434\n20#4:441\n13579#5,2:435\n329#6:442\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n315#1:429\n396#1:443\n324#1:430,4\n352#1:437,4\n324#1:434\n352#1:441\n348#1:435,2\n385#1:442\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class i0<T> extends kotlinx.coroutines.flow.internal.a<kotlinx.coroutines.flow.k0> implements kotlinx.coroutines.flow.t<T>, kotlinx.coroutines.flow.c<T>, kotlinx.coroutines.flow.internal.p<T> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _state;
    private int e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {384, 396, 401}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        /* synthetic */ java.lang.Object f;
        final /* synthetic */ kotlinx.coroutines.flow.i0<T> g;
        int h;

        a(kotlinx.coroutines.flow.i0<T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.i0.a> r2) {
                r0 = this;
                r0.g = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.f = r2
                int r2 = r1.h
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.h = r2
                kotlinx.coroutines.flow.i0<T> r2 = r1.g
                r0 = 0
                java.lang.Object r2 = r2.collect(r0, r1)
                return r2
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.flow.i0> r2 = kotlinx.coroutines.flow.i0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.flow.i0.f = r0
            return
    }

    public i0(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state = r1
            return
    }

    public static /* synthetic */ void q() {
            return
    }

    private final boolean r(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.i0.f     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r7 == 0) goto L14
            boolean r7 = kotlin.jvm.internal.g0.g(r1, r7)     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L14
            monitor-exit(r6)
            return r2
        L12:
            r7 = move-exception
            goto L61
        L14:
            boolean r7 = kotlin.jvm.internal.g0.g(r1, r8)     // Catch: java.lang.Throwable -> L12
            r1 = 1
            if (r7 == 0) goto L1d
            monitor-exit(r6)
            return r1
        L1d:
            r0.set(r6, r8)     // Catch: java.lang.Throwable -> L12
            int r7 = r6.e     // Catch: java.lang.Throwable -> L12
            r8 = r7 & 1
            if (r8 != 0) goto L5b
            int r7 = r7 + r1
            r6.e = r7     // Catch: java.lang.Throwable -> L12
            kotlinx.coroutines.flow.internal.c[] r8 = r6.n()     // Catch: java.lang.Throwable -> L12
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L12
            monitor-exit(r6)
        L30:
            kotlinx.coroutines.flow.k0[] r8 = (kotlinx.coroutines.flow.k0[]) r8
            if (r8 == 0) goto L42
            int r0 = r8.length
            r3 = 0
        L36:
            if (r3 >= r0) goto L42
            r4 = r8[r3]
            if (r4 == 0) goto L3f
            r4.h()
        L3f:
            int r3 = r3 + 1
            goto L36
        L42:
            monitor-enter(r6)
            int r8 = r6.e     // Catch: java.lang.Throwable -> L4c
            if (r8 != r7) goto L4e
            int r7 = r7 + r1
            r6.e = r7     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r6)
            return r1
        L4c:
            r7 = move-exception
            goto L59
        L4e:
            kotlinx.coroutines.flow.internal.c[] r7 = r6.n()     // Catch: java.lang.Throwable -> L4c
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L30
        L59:
            monitor-exit(r6)
            throw r7
        L5b:
            int r7 = r7 + 2
            r6.e = r7     // Catch: java.lang.Throwable -> L12
            monitor-exit(r6)
            return r1
        L61:
            monitor-exit(r6)
            throw r7
    }

    @Override // kotlinx.coroutines.flow.x
    @org.jetbrains.annotations.NotNull
    public java.util.List<T> a() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = kotlin.collections.f0.l(r0)
            return r0
    }

    @Override // kotlinx.coroutines.flow.s
    public void b() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MutableStateFlow.resetReplayCache is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.s
    public boolean c(T r1) {
            r0 = this;
            r0.setValue(r1)
            r1 = 1
            return r1
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r12) {
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.i0.a
            if (r0 == 0) goto L13
            r0 = r12
            kotlinx.coroutines.flow.i0$a r0 = (kotlinx.coroutines.flow.i0.a) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.i0$a r0 = new kotlinx.coroutines.flow.i0$a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.h
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L77
            if (r2 == r6) goto L65
            if (r2 == r5) goto L4e
            if (r2 != r4) goto L46
            java.lang.Object r11 = r0.e
            java.lang.Object r2 = r0.d
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.flow.k0 r6 = (kotlinx.coroutines.flow.k0) r6
            java.lang.Object r7 = r0.b
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
            java.lang.Object r8 = r0.a
            kotlinx.coroutines.flow.i0 r8 = (kotlinx.coroutines.flow.i0) r8
            kotlin.g0.n(r12)     // Catch: java.lang.Throwable -> L43
            goto Lab
        L43:
            r11 = move-exception
            goto Lf2
        L46:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4e:
            java.lang.Object r11 = r0.e
            java.lang.Object r2 = r0.d
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.flow.k0 r6 = (kotlinx.coroutines.flow.k0) r6
            java.lang.Object r7 = r0.b
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
            java.lang.Object r8 = r0.a
            kotlinx.coroutines.flow.i0 r8 = (kotlinx.coroutines.flow.i0) r8
            kotlin.g0.n(r12)     // Catch: java.lang.Throwable -> L43
            goto Ld9
        L65:
            java.lang.Object r11 = r0.c
            r6 = r11
            kotlinx.coroutines.flow.k0 r6 = (kotlinx.coroutines.flow.k0) r6
            java.lang.Object r11 = r0.b
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.j) r11
            java.lang.Object r2 = r0.a
            r8 = r2
            kotlinx.coroutines.flow.i0 r8 = (kotlinx.coroutines.flow.i0) r8
            kotlin.g0.n(r12)     // Catch: java.lang.Throwable -> L43
            goto L9c
        L77:
            kotlin.g0.n(r12)
            kotlinx.coroutines.flow.internal.c r12 = r10.h()
            kotlinx.coroutines.flow.k0 r12 = (kotlinx.coroutines.flow.k0) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.l0     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L9a
            r2 = r11
            kotlinx.coroutines.flow.l0 r2 = (kotlinx.coroutines.flow.l0) r2     // Catch: java.lang.Throwable -> L96
            r0.a = r10     // Catch: java.lang.Throwable -> L96
            r0.b = r11     // Catch: java.lang.Throwable -> L96
            r0.c = r12     // Catch: java.lang.Throwable -> L96
            r0.h = r6     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L9a
            goto Lf1
        L96:
            r11 = move-exception
            r8 = r10
            r6 = r12
            goto Lf2
        L9a:
            r8 = r10
            r6 = r12
        L9c:
            kotlin.coroutines.i r12 = r0.getContext()     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.e2$b r2 = kotlinx.coroutines.e2.s0     // Catch: java.lang.Throwable -> L43
            kotlin.coroutines.i$b r12 = r12.get(r2)     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.e2 r12 = (kotlinx.coroutines.e2) r12     // Catch: java.lang.Throwable -> L43
            r7 = r11
            r2 = r12
            r11 = r3
        Lab:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = kotlinx.coroutines.flow.i0.f     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = r12.get(r8)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto Lb6
            kotlinx.coroutines.h2.A(r2)     // Catch: java.lang.Throwable -> L43
        Lb6:
            if (r11 == 0) goto Lbe
            boolean r9 = kotlin.jvm.internal.g0.g(r11, r12)     // Catch: java.lang.Throwable -> L43
            if (r9 != 0) goto Ld9
        Lbe:
            kotlinx.coroutines.internal.s0 r11 = kotlinx.coroutines.flow.internal.s.a     // Catch: java.lang.Throwable -> L43
            if (r12 != r11) goto Lc4
            r11 = r3
            goto Lc5
        Lc4:
            r11 = r12
        Lc5:
            r0.a = r8     // Catch: java.lang.Throwable -> L43
            r0.b = r7     // Catch: java.lang.Throwable -> L43
            r0.c = r6     // Catch: java.lang.Throwable -> L43
            r0.d = r2     // Catch: java.lang.Throwable -> L43
            r0.e = r12     // Catch: java.lang.Throwable -> L43
            r0.h = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch: java.lang.Throwable -> L43
            if (r11 != r1) goto Ld8
            goto Lf1
        Ld8:
            r11 = r12
        Ld9:
            boolean r12 = r6.i()     // Catch: java.lang.Throwable -> L43
            if (r12 != 0) goto Lab
            r0.a = r8     // Catch: java.lang.Throwable -> L43
            r0.b = r7     // Catch: java.lang.Throwable -> L43
            r0.c = r6     // Catch: java.lang.Throwable -> L43
            r0.d = r2     // Catch: java.lang.Throwable -> L43
            r0.e = r11     // Catch: java.lang.Throwable -> L43
            r0.h = r4     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = r6.e(r0)     // Catch: java.lang.Throwable -> L43
            if (r12 != r1) goto Lab
        Lf1:
            return r1
        Lf2:
            r8.l(r6)
            throw r11
    }

    @Override // kotlinx.coroutines.flow.t
    public boolean compareAndSet(T r1, T r2) {
            r0 = this;
            if (r1 != 0) goto L4
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.internal.s.a
        L4:
            if (r2 != 0) goto L8
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.internal.s.a
        L8:
            boolean r1 = r0.r(r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.j0.d(r0, r1, r2, r3)
            return r1
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            r0.setValue(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.h0
    public T getValue() {
            r2 = this;
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.flow.internal.s.a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.flow.i0.f
            java.lang.Object r1 = r1.get(r2)
            if (r1 != r0) goto Lc
            r0 = 0
            return r0
        Lc:
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.k0 i() {
            r1 = this;
            kotlinx.coroutines.flow.k0 r0 = r1.o()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.k0[] j(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.k0[] r1 = r0.p(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.k0 o() {
            r1 = this;
            kotlinx.coroutines.flow.k0 r0 = new kotlinx.coroutines.flow.k0
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.k0[] p(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.k0[] r1 = new kotlinx.coroutines.flow.k0[r1]
            return r1
    }

    @Override // kotlinx.coroutines.flow.t
    public void setValue(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.internal.s.a
        L4:
            r0 = 0
            r1.r(r0, r2)
            return
    }
}
