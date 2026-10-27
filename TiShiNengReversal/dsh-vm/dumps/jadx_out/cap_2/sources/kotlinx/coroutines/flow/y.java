package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,731:1\n28#2,4:732\n28#2,4:738\n28#2,4:760\n28#2,4:767\n28#2,4:779\n28#2,4:793\n28#2,4:807\n20#3:736\n20#3:742\n20#3:764\n20#3:771\n20#3:783\n20#3:797\n20#3:811\n329#4:737\n1#5:743\n94#6,2:744\n96#6,2:747\n98#6:750\n94#6,2:772\n96#6,2:775\n98#6:778\n94#6,2:800\n96#6,2:803\n98#6:806\n13579#7:746\n13580#7:749\n13579#7:774\n13580#7:777\n13579#7:802\n13580#7:805\n314#8,9:751\n323#8,2:765\n314#8,9:784\n323#8,2:798\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n351#1:732,4\n391#1:738,4\n485#1:760,4\n506#1:767,4\n626#1:779,4\n661#1:793,4\n689#1:807,4\n351#1:736\n391#1:742\n485#1:764\n506#1:771\n626#1:783\n661#1:797\n689#1:811\n373#1:737\n453#1:744,2\n453#1:747,2\n453#1:750\n529#1:772,2\n529#1:775,2\n529#1:778\n676#1:800,2\n676#1:803,2\n676#1:806\n453#1:746\n453#1:749\n529#1:774\n529#1:777\n676#1:802\n676#1:805\n483#1:751,9\n483#1:765,2\n660#1:784,9\n660#1:798,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class y<T> extends kotlinx.coroutines.flow.internal.a<kotlinx.coroutines.flow.a0> implements kotlinx.coroutines.flow.s<T>, kotlinx.coroutines.flow.c<T>, kotlinx.coroutines.flow.internal.p<T> {
    private final int e;
    private final int f;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.BufferOverflow g;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object[] h;
    private long i;
    private long j;
    private int k;
    private int l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements kotlinx.coroutines.j1 {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.y<?> a;

        @kotlin.jvm.JvmField
        public long b;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> d;

        public a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.y<?> r1, long r2, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r4
                r0.d = r5
                return
        }

        @Override // kotlinx.coroutines.j1
        public void dispose() {
                r1 = this;
                kotlinx.coroutines.flow.y<?> r0 = r1.a
                kotlinx.coroutines.flow.y.p(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlinx.coroutines.flow.y.b.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {372, 379, 382}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        /* synthetic */ java.lang.Object e;
        final /* synthetic */ kotlinx.coroutines.flow.y<T> f;
        int g;

        c(kotlinx.coroutines.flow.y<T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.y.c> r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.e = r2
                int r2 = r1.g
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.g = r2
                kotlinx.coroutines.flow.y<T> r2 = r1.f
                r0 = 0
                java.lang.Object r2 = kotlinx.coroutines.flow.y.D(r2, r0, r1)
                return r2
        }
    }

    public y(int r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r0.f = r2
            r0.g = r3
            return
    }

    private final java.lang.Object A(kotlinx.coroutines.flow.a0 r7, kotlin.coroutines.e<? super kotlin.n1> r8) {
            r6 = this;
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r8)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            monitor-enter(r6)
            long r1 = z(r6, r7)     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1d
            r7.b = r0     // Catch: java.lang.Throwable -> L1b
            goto L28
        L1b:
            r7 = move-exception
            goto L40
        L1d:
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1b
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r7 = kotlin.Result.m11constructorimpl(r7)     // Catch: java.lang.Throwable -> L1b
            r0.resumeWith(r7)     // Catch: java.lang.Throwable -> L1b
        L28:
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r6)
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L38
            kotlin.coroutines.jvm.internal.e.c(r8)
        L38:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r8) goto L3f
            return r0
        L3f:
            return r7
        L40:
            monitor-exit(r6)
            throw r7
    }

    private final void B(kotlinx.coroutines.flow.y.a r6) {
            r5 = this;
            monitor-enter(r5)
            long r0 = r6.b     // Catch: java.lang.Throwable -> L2a
            long r2 = r5.N()     // Catch: java.lang.Throwable -> L2a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld
            monitor-exit(r5)
            return
        Ld:
            java.lang.Object[] r0 = r5.h     // Catch: java.lang.Throwable -> L2a
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L2a
            long r1 = r6.b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = kotlinx.coroutines.flow.z.c(r0, r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == r6) goto L1c
            monitor-exit(r5)
            return
        L1c:
            long r1 = r6.b     // Catch: java.lang.Throwable -> L2a
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.flow.z.a     // Catch: java.lang.Throwable -> L2a
            kotlinx.coroutines.flow.z.d(r0, r1, r6)     // Catch: java.lang.Throwable -> L2a
            r5.C()     // Catch: java.lang.Throwable -> L2a
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r5)
            return
        L2a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    private final void C() {
            r5 = this;
            int r0 = r5.f
            if (r0 != 0) goto La
            int r0 = r5.l
            r1 = 1
            if (r0 > r1) goto La
            goto L3d
        La:
            java.lang.Object[] r0 = r5.h
            kotlin.jvm.internal.g0.m(r0)
        Lf:
            int r1 = r5.l
            if (r1 <= 0) goto L3d
            long r1 = r5.N()
            int r3 = r5.T()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r1 = kotlinx.coroutines.flow.z.c(r0, r1)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.z.a
            if (r1 != r2) goto L3d
            int r1 = r5.l
            int r1 = r1 + (-1)
            r5.l = r1
            long r1 = r5.N()
            int r3 = r5.T()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 0
            kotlinx.coroutines.flow.z.d(r0, r1, r3)
            goto Lf
        L3d:
            return
    }

    static /* synthetic */ <T> java.lang.Object D(kotlinx.coroutines.flow.y<T> r8, kotlinx.coroutines.flow.j<? super T> r9, kotlin.coroutines.e<?> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.y.c
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.y$c r0 = (kotlinx.coroutines.flow.y.c) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$c r0 = new kotlinx.coroutines.flow.y$c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L76
            if (r2 == r5) goto L5f
            if (r2 == r4) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r8 = r0.d
            kotlinx.coroutines.e2 r8 = (kotlinx.coroutines.e2) r8
            java.lang.Object r9 = r0.c
            kotlinx.coroutines.flow.a0 r9 = (kotlinx.coroutines.flow.a0) r9
            java.lang.Object r2 = r0.b
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            java.lang.Object r5 = r0.a
            kotlinx.coroutines.flow.y r5 = (kotlinx.coroutines.flow.y) r5
        L3b:
            kotlin.g0.n(r10)     // Catch: java.lang.Throwable -> L3f
            goto L5b
        L3f:
            r8 = move-exception
            goto Ldc
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4a:
            java.lang.Object r8 = r0.d
            kotlinx.coroutines.e2 r8 = (kotlinx.coroutines.e2) r8
            java.lang.Object r9 = r0.c
            kotlinx.coroutines.flow.a0 r9 = (kotlinx.coroutines.flow.a0) r9
            java.lang.Object r2 = r0.b
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            java.lang.Object r5 = r0.a
            kotlinx.coroutines.flow.y r5 = (kotlinx.coroutines.flow.y) r5
            goto L3b
        L5b:
            r10 = r2
            r2 = r8
            r8 = r5
            goto La9
        L5f:
            java.lang.Object r8 = r0.c
            r9 = r8
            kotlinx.coroutines.flow.a0 r9 = (kotlinx.coroutines.flow.a0) r9
            java.lang.Object r8 = r0.b
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
            java.lang.Object r2 = r0.a
            kotlinx.coroutines.flow.y r2 = (kotlinx.coroutines.flow.y) r2
            kotlin.g0.n(r10)     // Catch: java.lang.Throwable -> L72
            r10 = r8
            r8 = r2
            goto L9d
        L72:
            r8 = move-exception
            r5 = r2
            goto Ldc
        L76:
            kotlin.g0.n(r10)
            kotlinx.coroutines.flow.internal.c r10 = r8.h()
            kotlinx.coroutines.flow.a0 r10 = (kotlinx.coroutines.flow.a0) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.l0     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L9a
            r2 = r9
            kotlinx.coroutines.flow.l0 r2 = (kotlinx.coroutines.flow.l0) r2     // Catch: java.lang.Throwable -> L95
            r0.a = r8     // Catch: java.lang.Throwable -> L95
            r0.b = r9     // Catch: java.lang.Throwable -> L95
            r0.c = r10     // Catch: java.lang.Throwable -> L95
            r0.g = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L95
            if (r2 != r1) goto L9a
            goto Ldb
        L95:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
            goto Ldc
        L9a:
            r7 = r10
            r10 = r9
            r9 = r7
        L9d:
            kotlin.coroutines.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lc2
            kotlinx.coroutines.e2$b r5 = kotlinx.coroutines.e2.s0     // Catch: java.lang.Throwable -> Lc2
            kotlin.coroutines.i$b r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lc2
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2     // Catch: java.lang.Throwable -> Lc2
        La9:
            java.lang.Object r5 = r8.Y(r9)     // Catch: java.lang.Throwable -> Lc2
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.flow.z.a     // Catch: java.lang.Throwable -> Lc2
            if (r5 != r6) goto Lc6
            r0.a = r8     // Catch: java.lang.Throwable -> Lc2
            r0.b = r10     // Catch: java.lang.Throwable -> Lc2
            r0.c = r9     // Catch: java.lang.Throwable -> Lc2
            r0.d = r2     // Catch: java.lang.Throwable -> Lc2
            r0.g = r4     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r5 = r8.A(r9, r0)     // Catch: java.lang.Throwable -> Lc2
            if (r5 != r1) goto La9
            goto Ldb
        Lc2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto Ldc
        Lc6:
            if (r2 == 0) goto Lcb
            kotlinx.coroutines.h2.A(r2)     // Catch: java.lang.Throwable -> Lc2
        Lcb:
            r0.a = r8     // Catch: java.lang.Throwable -> Lc2
            r0.b = r10     // Catch: java.lang.Throwable -> Lc2
            r0.c = r9     // Catch: java.lang.Throwable -> Lc2
            r0.d = r2     // Catch: java.lang.Throwable -> Lc2
            r0.g = r3     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch: java.lang.Throwable -> Lc2
            if (r5 != r1) goto La9
        Ldb:
            return r1
        Ldc:
            r5.l(r9)
            throw r8
    }

    private final void E(long r10) {
            r9 = this;
            int r0 = kotlinx.coroutines.flow.internal.a.f(r9)
            if (r0 == 0) goto L27
            kotlinx.coroutines.flow.internal.c[] r0 = kotlinx.coroutines.flow.internal.a.g(r9)
            if (r0 == 0) goto L27
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            if (r3 == 0) goto L24
            kotlinx.coroutines.flow.a0 r3 = (kotlinx.coroutines.flow.a0) r3
            long r4 = r3.a
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L24
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L24
            r3.a = r10
        L24:
            int r2 = r2 + 1
            goto Le
        L27:
            r9.j = r10
            return
    }

    private final void H() {
            r5 = this;
            java.lang.Object[] r0 = r5.h
            kotlin.jvm.internal.g0.m(r0)
            long r1 = r5.N()
            r3 = 0
            kotlinx.coroutines.flow.z.d(r0, r1, r3)
            int r0 = r5.k
            int r0 = r0 + (-1)
            r5.k = r0
            long r0 = r5.N()
            r2 = 1
            long r0 = r0 + r2
            long r2 = r5.i
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L22
            r5.i = r0
        L22:
            long r2 = r5.j
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L2b
            r5.E(r0)
        L2b:
            return
    }

    static /* synthetic */ <T> java.lang.Object I(kotlinx.coroutines.flow.y<T> r1, T r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            boolean r0 = r1.c(r2)
            if (r0 == 0) goto L9
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L9:
            java.lang.Object r1 = r1.J(r2, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto L14
            return r1
        L14:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final java.lang.Object J(T r9, kotlin.coroutines.e<? super kotlin.n1> r10) {
            r8 = this;
            kotlinx.coroutines.q r5 = new kotlinx.coroutines.q
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r10)
            r6 = 1
            r5.<init>(r0, r6)
            r5.Q()
            kotlin.coroutines.e<kotlin.n1>[] r7 = kotlinx.coroutines.flow.internal.b.a
            monitor-enter(r8)
            boolean r0 = y(r8, r9)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L2c
            kotlin.Result$a r9 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L28
            kotlin.n1 r9 = kotlin.n1.a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = kotlin.Result.m11constructorimpl(r9)     // Catch: java.lang.Throwable -> L28
            r5.resumeWith(r9)     // Catch: java.lang.Throwable -> L28
            kotlin.coroutines.e[] r9 = s(r8, r7)     // Catch: java.lang.Throwable -> L28
            r0 = 0
            r1 = r8
            goto L58
        L28:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L8e
        L2c:
            kotlinx.coroutines.flow.y$a r0 = new kotlinx.coroutines.flow.y$a     // Catch: java.lang.Throwable -> L8b
            long r1 = u(r8)     // Catch: java.lang.Throwable -> L8b
            int r3 = w(r8)     // Catch: java.lang.Throwable -> L8b
            long r3 = (long) r3
            long r1 = r1 + r3
            r4 = r9
            r2 = r1
            r1 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r(r8, r0)     // Catch: java.lang.Throwable -> L54
            int r9 = v(r8)     // Catch: java.lang.Throwable -> L54
            int r9 = r9 + r6
            x(r8, r9)     // Catch: java.lang.Throwable -> L54
            int r9 = t(r8)     // Catch: java.lang.Throwable -> L54
            if (r9 != 0) goto L57
            kotlin.coroutines.e[] r7 = s(r8, r7)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r9 = r0
            goto L8e
        L57:
            r9 = r7
        L58:
            monitor-exit(r8)
            if (r0 == 0) goto L5e
            kotlinx.coroutines.s.a(r5, r0)
        L5e:
            int r0 = r9.length
            r2 = 0
        L60:
            if (r2 >= r0) goto L74
            r3 = r9[r2]
            if (r3 == 0) goto L71
            kotlin.Result$a r4 = kotlin.Result.Companion
            kotlin.n1 r4 = kotlin.n1.a
            java.lang.Object r4 = kotlin.Result.m11constructorimpl(r4)
            r3.resumeWith(r4)
        L71:
            int r2 = r2 + 1
            goto L60
        L74:
            java.lang.Object r9 = r5.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r9 != r0) goto L81
            kotlin.coroutines.jvm.internal.e.c(r10)
        L81:
            java.lang.Object r10 = kotlin.coroutines.intrinsics.a.l()
            if (r9 != r10) goto L88
            return r9
        L88:
            kotlin.n1 r9 = kotlin.n1.a
            return r9
        L8b:
            r0 = move-exception
            r1 = r8
            goto L55
        L8e:
            monitor-exit(r8)
            throw r9
    }

    private final void K(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.T()
            java.lang.Object[] r1 = r6.h
            r2 = 2
            if (r1 != 0) goto L10
            r1 = 0
            r3 = 0
            java.lang.Object[] r1 = r6.U(r1, r3, r2)
            goto L1a
        L10:
            int r3 = r1.length
            if (r0 < r3) goto L1a
            int r3 = r1.length
            int r3 = r3 * 2
            java.lang.Object[] r1 = r6.U(r1, r0, r3)
        L1a:
            long r2 = r6.N()
            long r4 = (long) r0
            long r2 = r2 + r4
            kotlinx.coroutines.flow.z.d(r1, r2, r7)
            return
    }

    private final kotlin.coroutines.e<kotlin.n1>[] L(kotlin.coroutines.e<kotlin.n1>[] r12) {
            r11 = this;
            int r0 = r12.length
            int r1 = kotlinx.coroutines.flow.internal.a.f(r11)
            if (r1 == 0) goto L48
            kotlinx.coroutines.flow.internal.c[] r1 = kotlinx.coroutines.flow.internal.a.g(r11)
            if (r1 == 0) goto L48
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            if (r4 == 0) goto L45
            kotlinx.coroutines.flow.a0 r4 = (kotlinx.coroutines.flow.a0) r4
            kotlin.coroutines.e<? super kotlin.n1> r5 = r4.b
            if (r5 != 0) goto L1c
            goto L45
        L1c:
            long r6 = r11.X(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L45
            int r6 = r12.length
            if (r0 < r6) goto L3a
            int r6 = r12.length
            r7 = 2
            int r6 = r6 * 2
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r12, r6)
        L3a:
            r6 = r12
            kotlin.coroutines.e[] r6 = (kotlin.coroutines.e[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.b = r0
            r0 = r7
        L45:
            int r3 = r3 + 1
            goto Lf
        L48:
            kotlin.coroutines.e[] r12 = (kotlin.coroutines.e[]) r12
            return r12
    }

    private final long M() {
            r4 = this;
            long r0 = r4.N()
            int r2 = r4.k
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final long N() {
            r4 = this;
            long r0 = r4.j
            long r2 = r4.i
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    protected static /* synthetic */ void P() {
            return
    }

    private final java.lang.Object Q(long r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.h
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Object r2 = kotlinx.coroutines.flow.z.c(r0, r2)
            boolean r3 = r2 instanceof kotlinx.coroutines.flow.y.a
            if (r3 == 0) goto L11
            kotlinx.coroutines.flow.y$a r2 = (kotlinx.coroutines.flow.y.a) r2
            java.lang.Object r2 = r2.c
        L11:
            return r2
    }

    private final long R() {
            r4 = this;
            long r0 = r4.N()
            int r2 = r4.k
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r4.l
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final int S() {
            r4 = this;
            long r0 = r4.N()
            int r2 = r4.k
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r4.i
            long r0 = r0 - r2
            int r1 = (int) r0
            return r1
    }

    private final int T() {
            r2 = this;
            int r0 = r2.k
            int r1 = r2.l
            int r0 = r0 + r1
            return r0
    }

    private final java.lang.Object[] U(java.lang.Object[] r7, int r8, int r9) {
            r6 = this;
            if (r9 <= 0) goto L1d
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r6.h = r9
            if (r7 != 0) goto L9
            goto L1c
        L9:
            long r0 = r6.N()
            r2 = 0
        Le:
            if (r2 >= r8) goto L1c
            long r3 = (long) r2
            long r3 = r3 + r0
            java.lang.Object r5 = kotlinx.coroutines.flow.z.c(r7, r3)
            kotlinx.coroutines.flow.z.d(r9, r3, r5)
            int r2 = r2 + 1
            goto Le
        L1c:
            return r9
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Buffer size overflow"
            r7.<init>(r8)
            throw r7
    }

    private final boolean V(T r15) {
            r14 = this;
            int r0 = r14.m()
            if (r0 != 0) goto Lb
            boolean r15 = r14.W(r15)
            return r15
        Lb:
            int r0 = r14.k
            int r1 = r14.f
            r2 = 1
            if (r0 < r1) goto L2d
            long r0 = r14.j
            long r3 = r14.i
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L2d
            kotlinx.coroutines.channels.BufferOverflow r0 = r14.g
            int[] r1 = kotlinx.coroutines.flow.y.b.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L2b
            r1 = 2
            if (r0 == r1) goto L2a
            goto L2d
        L2a:
            return r2
        L2b:
            r15 = 0
            return r15
        L2d:
            r14.K(r15)
            int r15 = r14.k
            int r15 = r15 + r2
            r14.k = r15
            int r0 = r14.f
            if (r15 <= r0) goto L3c
            r14.H()
        L3c:
            int r15 = r14.S()
            int r0 = r14.e
            if (r15 <= r0) goto L58
            long r0 = r14.i
            r3 = 1
            long r6 = r0 + r3
            long r8 = r14.j
            long r10 = r14.M()
            long r12 = r14.R()
            r5 = r14
            r5.Z(r6, r8, r10, r12)
        L58:
            return r2
    }

    private final boolean W(T r7) {
            r6 = this;
            int r0 = r6.e
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            r6.K(r7)
            int r7 = r6.k
            int r7 = r7 + r1
            r6.k = r7
            int r0 = r6.e
            if (r7 <= r0) goto L15
            r6.H()
        L15:
            long r2 = r6.N()
            int r7 = r6.k
            long r4 = (long) r7
            long r2 = r2 + r4
            r6.j = r2
            return r1
    }

    private final long X(kotlinx.coroutines.flow.a0 r7) {
            r6 = this;
            long r0 = r7.a
            long r2 = r6.M()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto Lb
            goto L20
        Lb:
            int r7 = r6.f
            r2 = -1
            if (r7 <= 0) goto L12
            return r2
        L12:
            long r4 = r6.N()
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L1b
            return r2
        L1b:
            int r7 = r6.l
            if (r7 != 0) goto L20
            return r2
        L20:
            return r0
    }

    private final java.lang.Object Y(kotlinx.coroutines.flow.a0 r9) {
            r8 = this;
            kotlin.coroutines.e<kotlin.n1>[] r0 = kotlinx.coroutines.flow.internal.b.a
            monitor-enter(r8)
            long r1 = r8.X(r9)     // Catch: java.lang.Throwable -> L10
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L12
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.flow.z.a     // Catch: java.lang.Throwable -> L10
            goto L24
        L10:
            r9 = move-exception
            goto L3c
        L12:
            long r3 = r9.a     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r8.Q(r1)     // Catch: java.lang.Throwable -> L10
            r5 = 1
            long r1 = r1 + r5
            r9.a = r1     // Catch: java.lang.Throwable -> L10
            kotlin.coroutines.e[] r9 = r8.a0(r3)     // Catch: java.lang.Throwable -> L10
            r7 = r0
            r0 = r9
            r9 = r7
        L24:
            monitor-exit(r8)
            int r1 = r0.length
            r2 = 0
        L27:
            if (r2 >= r1) goto L3b
            r3 = r0[r2]
            if (r3 == 0) goto L38
            kotlin.Result$a r4 = kotlin.Result.Companion
            kotlin.n1 r4 = kotlin.n1.a
            java.lang.Object r4 = kotlin.Result.m11constructorimpl(r4)
            r3.resumeWith(r4)
        L38:
            int r2 = r2 + 1
            goto L27
        L3b:
            return r9
        L3c:
            monitor-exit(r8)
            throw r9
    }

    private final void Z(long r7, long r9, long r11, long r13) {
            r6 = this;
            long r0 = java.lang.Math.min(r9, r7)
            long r2 = r6.N()
        L8:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
            java.lang.Object[] r4 = r6.h
            kotlin.jvm.internal.g0.m(r4)
            r5 = 0
            kotlinx.coroutines.flow.z.d(r4, r2, r5)
            r4 = 1
            long r2 = r2 + r4
            goto L8
        L19:
            r6.i = r7
            r6.j = r9
            long r7 = r11 - r0
            int r8 = (int) r7
            r6.k = r8
            long r13 = r13 - r11
            int r7 = (int) r13
            r6.l = r7
            return
    }

    public static final /* synthetic */ java.lang.Object o(kotlinx.coroutines.flow.y r0, kotlinx.coroutines.flow.a0 r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.A(r1, r2)
            return r0
    }

    public static final /* synthetic */ void p(kotlinx.coroutines.flow.y r0, kotlinx.coroutines.flow.y.a r1) {
            r0.B(r1)
            return
    }

    public static final /* synthetic */ java.lang.Object q(kotlinx.coroutines.flow.y r0, java.lang.Object r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.J(r1, r2)
            return r0
    }

    public static final /* synthetic */ void r(kotlinx.coroutines.flow.y r0, java.lang.Object r1) {
            r0.K(r1)
            return
    }

    public static final /* synthetic */ kotlin.coroutines.e[] s(kotlinx.coroutines.flow.y r0, kotlin.coroutines.e[] r1) {
            kotlin.coroutines.e[] r0 = r0.L(r1)
            return r0
    }

    public static final /* synthetic */ int t(kotlinx.coroutines.flow.y r0) {
            int r0 = r0.f
            return r0
    }

    public static final /* synthetic */ long u(kotlinx.coroutines.flow.y r2) {
            long r0 = r2.N()
            return r0
    }

    public static final /* synthetic */ int v(kotlinx.coroutines.flow.y r0) {
            int r0 = r0.l
            return r0
    }

    public static final /* synthetic */ int w(kotlinx.coroutines.flow.y r0) {
            int r0 = r0.T()
            return r0
    }

    public static final /* synthetic */ void x(kotlinx.coroutines.flow.y r0, int r1) {
            r0.l = r1
            return
    }

    public static final /* synthetic */ boolean y(kotlinx.coroutines.flow.y r0, java.lang.Object r1) {
            boolean r0 = r0.V(r1)
            return r0
    }

    public static final /* synthetic */ long z(kotlinx.coroutines.flow.y r0, kotlinx.coroutines.flow.a0 r1) {
            long r0 = r0.X(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.a0 F() {
            r1 = this;
            kotlinx.coroutines.flow.a0 r0 = new kotlinx.coroutines.flow.a0
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.a0[] G(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.a0[] r1 = new kotlinx.coroutines.flow.a0[r1]
            return r1
    }

    protected final T O() {
            r5 = this;
            java.lang.Object[] r0 = r5.h
            kotlin.jvm.internal.g0.m(r0)
            long r1 = r5.i
            int r3 = r5.S()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r0 = kotlinx.coroutines.flow.z.c(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.flow.x
    @org.jetbrains.annotations.NotNull
    public java.util.List<T> a() {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.S()     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.List r0 = kotlin.collections.f0.J()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r8)
            return r0
        Ld:
            r0 = move-exception
            goto L2c
        Lf:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.Object[] r2 = r8.h     // Catch: java.lang.Throwable -> Ld
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Throwable -> Ld
            r3 = 0
        L1a:
            if (r3 >= r0) goto L2a
            long r4 = r8.i     // Catch: java.lang.Throwable -> Ld
            long r6 = (long) r3     // Catch: java.lang.Throwable -> Ld
            long r4 = r4 + r6
            java.lang.Object r4 = kotlinx.coroutines.flow.z.c(r2, r4)     // Catch: java.lang.Throwable -> Ld
            r1.add(r4)     // Catch: java.lang.Throwable -> Ld
            int r3 = r3 + 1
            goto L1a
        L2a:
            monitor-exit(r8)
            return r1
        L2c:
            monitor-exit(r8)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1>[] a0(long r22) {
            r21 = this;
            r0 = r21
            long r1 = r0.j
            int r3 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lb
            kotlin.coroutines.e<kotlin.n1>[] r1 = kotlinx.coroutines.flow.internal.b.a
            return r1
        Lb:
            long r1 = r0.N()
            int r3 = r0.k
            long r3 = (long) r3
            long r3 = r3 + r1
            int r5 = r0.f
            r6 = 1
            if (r5 != 0) goto L1e
            int r5 = r0.l
            if (r5 <= 0) goto L1e
            long r3 = r3 + r6
        L1e:
            int r5 = kotlinx.coroutines.flow.internal.a.f(r0)
            if (r5 == 0) goto L44
            kotlinx.coroutines.flow.internal.c[] r5 = kotlinx.coroutines.flow.internal.a.g(r0)
            if (r5 == 0) goto L44
            int r8 = r5.length
            r10 = 0
        L2c:
            if (r10 >= r8) goto L44
            r11 = r5[r10]
            if (r11 == 0) goto L41
            kotlinx.coroutines.flow.a0 r11 = (kotlinx.coroutines.flow.a0) r11
            long r11 = r11.a
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L41
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            r3 = r11
        L41:
            int r10 = r10 + 1
            goto L2c
        L44:
            long r10 = r0.j
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 > 0) goto L4d
            kotlin.coroutines.e<kotlin.n1>[] r1 = kotlinx.coroutines.flow.internal.b.a
            return r1
        L4d:
            long r10 = r0.M()
            int r5 = r0.m()
            if (r5 <= 0) goto L64
            long r12 = r10 - r3
            int r5 = (int) r12
            int r8 = r0.l
            int r12 = r0.f
            int r12 = r12 - r5
            int r5 = java.lang.Math.min(r8, r12)
            goto L66
        L64:
            int r5 = r0.l
        L66:
            kotlin.coroutines.e<kotlin.n1>[] r8 = kotlinx.coroutines.flow.internal.b.a
            int r12 = r0.l
            long r12 = (long) r12
            long r12 = r12 + r10
            if (r5 <= 0) goto Lb7
            kotlin.coroutines.e[] r8 = new kotlin.coroutines.e[r5]
            java.lang.Object[] r14 = r0.h
            kotlin.jvm.internal.g0.m(r14)
            r22 = r6
            r6 = r10
            r15 = 0
        L79:
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 >= 0) goto Lb1
            java.lang.Object r9 = kotlinx.coroutines.flow.z.c(r14, r10)
            r17 = r1
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.z.a
            if (r9 == r1) goto La8
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"
            kotlin.jvm.internal.g0.n(r9, r2)
            kotlinx.coroutines.flow.y$a r9 = (kotlinx.coroutines.flow.y.a) r9
            int r2 = r15 + 1
            r19 = r3
            kotlin.coroutines.e<kotlin.n1> r3 = r9.d
            r8[r15] = r3
            kotlinx.coroutines.flow.z.d(r14, r10, r1)
            java.lang.Object r1 = r9.c
            kotlinx.coroutines.flow.z.d(r14, r6, r1)
            long r3 = r6 + r22
            if (r2 >= r5) goto La5
            r15 = r2
            r6 = r3
            goto Laa
        La5:
            r10 = r3
        La6:
            r9 = r8
            goto Lbe
        La8:
            r19 = r3
        Laa:
            long r10 = r10 + r22
            r1 = r17
            r3 = r19
            goto L79
        Lb1:
            r17 = r1
            r19 = r3
            r10 = r6
            goto La6
        Lb7:
            r17 = r1
            r19 = r3
            r22 = r6
            goto La6
        Lbe:
            long r1 = r10 - r17
            int r2 = (int) r1
            int r1 = r0.m()
            if (r1 != 0) goto Lc9
            r3 = r10
            goto Lcb
        Lc9:
            r3 = r19
        Lcb:
            long r5 = r0.i
            int r1 = r0.e
            int r1 = java.lang.Math.min(r1, r2)
            long r1 = (long) r1
            long r1 = r10 - r1
            long r1 = java.lang.Math.max(r5, r1)
            int r5 = r0.f
            if (r5 != 0) goto Lf7
            int r5 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r5 >= 0) goto Lf7
            java.lang.Object[] r5 = r0.h
            kotlin.jvm.internal.g0.m(r5)
            java.lang.Object r5 = kotlinx.coroutines.flow.z.c(r5, r1)
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.flow.z.a
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r6)
            if (r5 == 0) goto Lf7
            long r10 = r10 + r22
            long r1 = r1 + r22
        Lf7:
            r5 = r10
            r7 = r12
            r0.Z(r1, r3, r5, r7)
            r0.C()
            int r1 = r9.length
            if (r1 != 0) goto L106
            r1 = 1
            r16 = 1
            goto L108
        L106:
            r16 = 0
        L108:
            if (r16 != 0) goto L10f
            kotlin.coroutines.e[] r1 = r0.L(r9)
            return r1
        L10f:
            return r9
    }

    @Override // kotlinx.coroutines.flow.s
    public void b() {
            r10 = this;
            monitor-enter(r10)
            long r2 = r10.M()     // Catch: java.lang.Throwable -> L19
            long r4 = r10.j     // Catch: java.lang.Throwable -> L19
            long r6 = r10.M()     // Catch: java.lang.Throwable -> L19
            long r8 = r10.R()     // Catch: java.lang.Throwable -> L19
            r1 = r10
            r1.Z(r2, r4, r6, r8)     // Catch: java.lang.Throwable -> L17
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r10)
            return
        L17:
            r0 = move-exception
            goto L1b
        L19:
            r0 = move-exception
            r1 = r10
        L1b:
            monitor-exit(r10)
            throw r0
    }

    public final long b0() {
            r5 = this;
            long r0 = r5.i
            long r2 = r5.j
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            r5.j = r0
        La:
            return r0
    }

    @Override // kotlinx.coroutines.flow.s
    public boolean c(T r6) {
            r5 = this;
            kotlin.coroutines.e<kotlin.n1>[] r0 = kotlinx.coroutines.flow.internal.b.a
            monitor-enter(r5)
            boolean r6 = r5.V(r6)     // Catch: java.lang.Throwable -> L10
            r1 = 0
            if (r6 == 0) goto L12
            kotlin.coroutines.e[] r0 = r5.L(r0)     // Catch: java.lang.Throwable -> L10
            r6 = 1
            goto L13
        L10:
            r6 = move-exception
            goto L2a
        L12:
            r6 = 0
        L13:
            monitor-exit(r5)
            int r2 = r0.length
        L15:
            if (r1 >= r2) goto L29
            r3 = r0[r1]
            if (r3 == 0) goto L26
            kotlin.Result$a r4 = kotlin.Result.Companion
            kotlin.n1 r4 = kotlin.n1.a
            java.lang.Object r4 = kotlin.Result.m11constructorimpl(r4)
            r3.resumeWith(r4)
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            return r6
        L2a:
            monitor-exit(r5)
            throw r6
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
            r0 = this;
            java.lang.Object r1 = D(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.z.e(r0, r1, r2, r3)
            return r1
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = I(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.a0 i() {
            r1 = this;
            kotlinx.coroutines.flow.a0 r0 = r1.F()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.a0[] j(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.a0[] r1 = r0.G(r1)
            return r1
    }
}
