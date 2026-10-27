package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,873:1\n1#2:874\n2624#3,3:875\n1855#3,2:888\n1855#3,2:896\n1855#3,2:898\n314#4,9:878\n323#4,2:890\n19#5:887\n153#6,4:892\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n505#1:875,3\n569#1:888,2\n726#1:896,2\n751#1:898,2\n545#1:878,9\n545#1:890,2\n561#1:887\n711#1:892,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class l<R> extends kotlinx.coroutines.n implements kotlinx.coroutines.selects.c<R>, kotlinx.coroutines.selects.n<R> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i a;

    @org.jetbrains.annotations.Nullable
    private java.util.List<kotlinx.coroutines.selects.l<R>.a> b;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object c;
    private int d;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object e;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n1#2:874\n*E\n"})
    public final class a {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.lang.Object a;

        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> b;

        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> c;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object d;

        @org.jetbrains.annotations.NotNull
        private final java.lang.Object e;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> f;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public java.lang.Object g;

        @kotlin.jvm.JvmField
        public int h;
        final /* synthetic */ kotlinx.coroutines.selects.l<R> i;

        public a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.l r1, @org.jetbrains.annotations.NotNull java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<java.lang.Object, ? super kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, ? extends java.lang.Object> r4, @org.jetbrains.annotations.NotNull java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, ? extends kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1>> r7) {
                r0 = this;
                r0.i = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.f = r7
                r1 = -1
                r0.h = r1
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r2 = this;
                kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> r0 = r2.f
                if (r0 == 0) goto Ld
                java.lang.Object r1 = r2.d
                java.lang.Object r3 = r0.invoke(r3, r1, r4)
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                return r3
            Ld:
                r3 = 0
                return r3
        }

        public final void b() {
                r4 = this;
                java.lang.Object r0 = r4.g
                kotlinx.coroutines.selects.l<R> r1 = r4.i
                boolean r2 = r0 instanceof kotlinx.coroutines.internal.p0
                r3 = 0
                if (r2 == 0) goto L15
                kotlinx.coroutines.internal.p0 r0 = (kotlinx.coroutines.internal.p0) r0
                int r2 = r4.h
                kotlin.coroutines.i r1 = r1.getContext()
                r0.q(r2, r3, r1)
                return
            L15:
                boolean r1 = r0 instanceof kotlinx.coroutines.j1
                if (r1 == 0) goto L1c
                r3 = r0
                kotlinx.coroutines.j1 r3 = (kotlinx.coroutines.j1) r3
            L1c:
                if (r3 == 0) goto L21
                r3.dispose()
            L21:
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r5) {
                r3 = this;
                java.lang.Object r0 = r3.e
                java.lang.Object r1 = r3.d
                kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.selects.o.l()
                if (r1 != r2) goto L16
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>"
                kotlin.jvm.internal.g0.n(r0, r4)
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                java.lang.Object r4 = r0.invoke(r5)
                return r4
            L16:
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>"
                kotlin.jvm.internal.g0.n(r0, r1)
                kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                java.lang.Object r4 = r0.invoke(r4, r5)
                return r4
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object d(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> r0 = r3.c
                java.lang.Object r1 = r3.a
                java.lang.Object r2 = r3.d
                java.lang.Object r4 = r0.invoke(r1, r2, r4)
                return r4
        }

        public final boolean e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.l<R> r4) {
                r3 = this;
                kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> r0 = r3.b
                java.lang.Object r1 = r3.a
                java.lang.Object r2 = r3.d
                r0.invoke(r1, r4, r2)
                java.lang.Object r4 = kotlinx.coroutines.selects.l.p(r4)
                kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.selects.o.g()
                if (r4 != r0) goto L15
                r4 = 1
                return r4
            L15:
                r4 = 0
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {431, 434}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.selects.l<R> c;
        int d;

        b(kotlinx.coroutines.selects.l<R> r1, kotlin.coroutines.e<? super kotlinx.coroutines.selects.l.b> r2) {
                r0 = this;
                r0.c = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.b = r2
                int r2 = r1.d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.d = r2
                kotlinx.coroutines.selects.l<R> r2 = r1.c
                java.lang.Object r2 = kotlinx.coroutines.selects.l.n(r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {706}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        final /* synthetic */ kotlinx.coroutines.selects.l<R> b;
        int c;

        c(kotlinx.coroutines.selects.l<R> r1, kotlin.coroutines.e<? super kotlinx.coroutines.selects.l.c> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.a = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                kotlinx.coroutines.selects.l<R> r2 = r1.b
                r0 = 0
                java.lang.Object r2 = kotlinx.coroutines.selects.l.s(r2, r0, r0, r1)
                return r2
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "state"
            java.lang.Class<kotlinx.coroutines.selects.l> r2 = kotlinx.coroutines.selects.l.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.selects.l.f = r0
            return
    }

    public l(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.selects.o.j()
            r1.state = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 2
            r2.<init>(r0)
            r1.b = r2
            r2 = -1
            r1.d = r2
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.selects.o.g()
            r1.e = r2
            return
    }

    private final java.lang.Object A(kotlin.coroutines.e<? super R> r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.l.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.l$b r0 = (kotlinx.coroutines.selects.l.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.l$b r0 = new kotlinx.coroutines.selects.l$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.g0.n(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            kotlinx.coroutines.selects.l r2 = (kotlinx.coroutines.selects.l) r2
            kotlin.g0.n(r6)
            goto L4b
        L3c:
            kotlin.g0.n(r6)
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r5.N(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.a = r6
            r0.d = r3
            java.lang.Object r6 = r2.x(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
    }

    private final kotlinx.coroutines.selects.l<R>.a B(java.lang.Object r5) {
            r4 = this;
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r4.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlinx.coroutines.selects.l$a r3 = (kotlinx.coroutines.selects.l.a) r3
            java.lang.Object r3 = r3.a
            if (r3 != r5) goto Lc
            r1 = r2
        L1e:
            kotlinx.coroutines.selects.l$a r1 = (kotlinx.coroutines.selects.l.a) r1
            if (r1 == 0) goto L23
            return r1
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Clause with object "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not found"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    private final boolean C() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.l.f
            java.lang.Object r0 = r0.get(r2)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.selects.o.j()
            if (r0 == r1) goto L13
            boolean r0 = r0 instanceof java.util.List
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    private final boolean D() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.l.f
            java.lang.Object r0 = r0.get(r2)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.selects.o.h()
            if (r0 != r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private final boolean E() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.l.f
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof kotlinx.coroutines.selects.l.a
            return r0
    }

    private final void F(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    private final java.lang.Object G(kotlinx.coroutines.selects.l<R>.a r5, java.lang.Object r6, kotlin.coroutines.e<? super R> r7) {
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.l.c
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.selects.l$c r0 = (kotlinx.coroutines.selects.l.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.l$c r0 = new kotlinx.coroutines.selects.l$c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.g0.n(r7)
            return r7
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.g0.n(r7)
            java.lang.Object r6 = r5.d(r6)
            r0.c = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
    }

    public static /* synthetic */ void I(kotlinx.coroutines.selects.l r0, kotlinx.coroutines.selects.l.a r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lb
            r3 = r3 & 1
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.H(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: register"
            r0.<init>(r1)
            throw r0
    }

    private final void J(java.lang.Object r2) {
            r1 = this;
            kotlinx.coroutines.selects.l$a r2 = r1.B(r2)
            kotlin.jvm.internal.g0.m(r2)
            r0 = 0
            r2.g = r0
            r0 = -1
            r2.h = r0
            r0 = 1
            r1.H(r2, r0)
            return
    }

    private final int L(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.l.f
            java.lang.Object r1 = r0.get(r5)
            boolean r2 = r1 instanceof kotlinx.coroutines.p
            r3 = 2
            if (r2 == 0) goto L2c
            kotlinx.coroutines.selects.l$a r2 = r5.B(r6)
            if (r2 != 0) goto L12
            goto L0
        L12:
            kotlin.jvm.functions.Function1 r4 = r2.a(r5, r7)
            boolean r0 = androidx.concurrent.futures.a.a(r0, r5, r1, r2)
            if (r0 == 0) goto L0
            kotlinx.coroutines.p r1 = (kotlinx.coroutines.p) r1
            r5.e = r7
            boolean r6 = kotlinx.coroutines.selects.o.k(r1, r4)
            if (r6 == 0) goto L28
            r6 = 0
            return r6
        L28:
            r6 = 0
            r5.e = r6
            return r3
        L2c:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.selects.o.i()
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r2)
            r4 = 1
            if (r2 == 0) goto L39
            r2 = 1
            goto L3b
        L39:
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.l.a
        L3b:
            if (r2 == 0) goto L3f
            r6 = 3
            return r6
        L3f:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.selects.o.h()
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r2 == 0) goto L4a
            return r3
        L4a:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.selects.o.j()
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r2 == 0) goto L5f
            java.util.List r2 = kotlin.collections.f0.l(r6)
            boolean r0 = androidx.concurrent.futures.a.a(r0, r5, r1, r2)
            if (r0 == 0) goto L0
            return r4
        L5f:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L71
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.f0.J4(r2, r6)
            boolean r0 = androidx.concurrent.futures.a.a(r0, r5, r1, r2)
            if (r0 == 0) goto L0
            return r4
        L71:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unexpected state: "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private final void M(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> r4, java.lang.Object r5) {
            r2 = this;
        L0:
            java.lang.Object r0 = r3.get(r5)
            java.lang.Object r1 = r4.invoke(r0)
            boolean r0 = androidx.concurrent.futures.a.a(r3, r5, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    private final java.lang.Object N(kotlin.coroutines.e<? super kotlin.n1> r6) {
            r5 = this;
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = q()
        L11:
            java.lang.Object r2 = r1.get(r5)
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.selects.o.j()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = q()
            boolean r2 = androidx.concurrent.futures.a.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            r0.I(r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = q()
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.selects.o.j()
            boolean r3 = androidx.concurrent.futures.a.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            t(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof kotlinx.coroutines.selects.l.a
            if (r1 == 0) goto L79
            kotlin.n1 r1 = kotlin.n1.a
            kotlinx.coroutines.selects.l$a r2 = (kotlinx.coroutines.selects.l.a) r2
            java.lang.Object r3 = p(r5)
            kotlin.jvm.functions.Function1 r2 = r2.a(r5, r3)
            r0.o(r1, r2)
        L62:
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L6f
            kotlin.coroutines.jvm.internal.e.c(r6)
        L6f:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r6) goto L76
            return r0
        L76:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    public static final /* synthetic */ java.lang.Object m(kotlinx.coroutines.selects.l r0, kotlin.coroutines.e r1) {
            java.lang.Object r0 = r0.x(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object n(kotlinx.coroutines.selects.l r0, kotlin.coroutines.e r1) {
            java.lang.Object r0 = r0.A(r1)
            return r0
    }

    public static final /* synthetic */ boolean o(kotlinx.coroutines.selects.l r0) {
            boolean r0 = r0.C()
            return r0
    }

    public static final /* synthetic */ java.lang.Object p(kotlinx.coroutines.selects.l r0) {
            java.lang.Object r0 = r0.e
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater q() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.l.f
            return r0
    }

    public static final /* synthetic */ boolean r(kotlinx.coroutines.selects.l r0) {
            boolean r0 = r0.D()
            return r0
    }

    public static final /* synthetic */ java.lang.Object s(kotlinx.coroutines.selects.l r0, kotlinx.coroutines.selects.l.a r1, java.lang.Object r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = r0.G(r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ void t(kotlinx.coroutines.selects.l r0, java.lang.Object r1) {
            r0.J(r1)
            return
    }

    public static final /* synthetic */ java.lang.Object u(kotlinx.coroutines.selects.l r0, kotlin.coroutines.e r1) {
            java.lang.Object r0 = r0.N(r1)
            return r0
    }

    private final void v(java.lang.Object r3) {
            r2 = this;
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r2.b
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L15
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            return
        L15:
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.selects.l$a r1 = (kotlinx.coroutines.selects.l.a) r1
            java.lang.Object r1 = r1.a
            if (r1 == r3) goto L2a
            goto L19
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot use select clauses on the same object: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L45:
            return
    }

    private final void w(kotlinx.coroutines.selects.l<R>.a r3) {
            r2 = this;
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r2.b
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.selects.l$a r1 = (kotlinx.coroutines.selects.l.a) r1
            if (r1 == r3) goto Lb
            r1.b()
            goto Lb
        L1d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.selects.l.f
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.selects.o.i()
            r3.set(r2, r0)
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.selects.o.g()
            r2.e = r3
            r3 = 0
            r2.b = r3
            return
    }

    private final java.lang.Object x(kotlin.coroutines.e<? super R> r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.l.f
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.selects.l$a r0 = (kotlinx.coroutines.selects.l.a) r0
            java.lang.Object r1 = r2.e
            r2.w(r0)
            java.lang.Object r1 = r0.d(r1)
            java.lang.Object r3 = r0.c(r1, r3)
            return r3
    }

    @kotlin.PublishedApi
    static /* synthetic */ <R> java.lang.Object z(kotlinx.coroutines.selects.l<R> r1, kotlin.coroutines.e<? super R> r2) {
            boolean r0 = r1.E()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.x(r2)
            return r1
        Lb:
            java.lang.Object r1 = r1.A(r2)
            return r1
    }

    @kotlin.jvm.JvmName(name = "register")
    public final void H(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.l<R>.a r3, boolean r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.l.f
            java.lang.Object r1 = r0.get(r2)
            boolean r1 = r1 instanceof kotlinx.coroutines.selects.l.a
            if (r1 == 0) goto Lb
            return
        Lb:
            if (r4 != 0) goto L12
            java.lang.Object r1 = r3.a
            r2.v(r1)
        L12:
            boolean r1 = r3.e(r2)
            if (r1 == 0) goto L33
            if (r4 != 0) goto L24
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r4 = r2.b
            kotlin.jvm.internal.g0.m(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            r4.add(r3)
        L24:
            java.lang.Object r4 = r2.c
            r3.g = r4
            int r4 = r2.d
            r3.h = r4
            r3 = 0
            r2.c = r3
            r3 = -1
            r2.d = r3
            return
        L33:
            r0.set(r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.selects.TrySelectDetailedResult K(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r0 = this;
            int r1 = r0.L(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.o.e(r1)
            return r1
    }

    @Override // kotlinx.coroutines.selects.c
    public void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.e r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r10) {
            r8 = this;
            kotlinx.coroutines.selects.l$a r0 = new kotlinx.coroutines.selects.l$a
            java.lang.Object r2 = r9.d()
            kotlin.jvm.functions.Function3 r3 = r9.c()
            kotlin.jvm.functions.Function3 r4 = r9.b()
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.selects.o.l()
            kotlin.jvm.functions.Function3 r7 = r9.a()
            r1 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = 1
            r10 = 0
            r2 = 0
            I(r8, r0, r2, r9, r10)
            return
    }

    @Override // kotlinx.coroutines.r3
    public void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.p0<?> r1, int r2) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            return
    }

    @Override // kotlinx.coroutines.selects.c
    public <P, Q> void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.i<? super P, ? extends Q> r9, P r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r11) {
            r8 = this;
            kotlinx.coroutines.selects.l$a r0 = new kotlinx.coroutines.selects.l$a
            java.lang.Object r2 = r9.d()
            kotlin.jvm.functions.Function3 r3 = r9.c()
            kotlin.jvm.functions.Function3 r4 = r9.b()
            kotlin.jvm.functions.Function3 r7 = r9.a()
            r1 = r8
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = 1
            r10 = 0
            r11 = 0
            I(r8, r0, r11, r9, r10)
            return
    }

    @Override // kotlinx.coroutines.selects.c
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @kotlin.ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @kotlin.internal.LowPriorityInOverloadResolution
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public void d(long r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            r0 = this;
            kotlinx.coroutines.selects.c.a.b(r0, r1, r3)
            return
    }

    @Override // kotlinx.coroutines.selects.m
    public void f(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @Override // kotlinx.coroutines.selects.m
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.a
            return r0
    }

    @Override // kotlinx.coroutines.selects.m
    public void h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.j1 r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // kotlinx.coroutines.selects.c
    public <P, Q> void i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.i<? super P, ? extends Q> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            kotlinx.coroutines.selects.c.a.a(r0, r1, r2)
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.l(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // kotlinx.coroutines.selects.m
    public boolean j(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r0 = this;
            int r1 = r0.L(r1, r2)
            if (r1 != 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // kotlinx.coroutines.selects.c
    public <Q> void k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.g<? extends Q> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r10) {
            r8 = this;
            kotlinx.coroutines.selects.l$a r0 = new kotlinx.coroutines.selects.l$a
            java.lang.Object r2 = r9.d()
            kotlin.jvm.functions.Function3 r3 = r9.c()
            kotlin.jvm.functions.Function3 r4 = r9.b()
            r5 = 0
            kotlin.jvm.functions.Function3 r7 = r9.a()
            r1 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = 1
            r10 = 0
            r2 = 0
            I(r8, r0, r2, r9, r10)
            return
    }

    @Override // kotlinx.coroutines.o
    public void l(@org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.selects.l.f
        L2:
            java.lang.Object r0 = r3.get(r2)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.selects.o.i()
            if (r0 != r1) goto Ld
            goto L1b
        Ld:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.selects.o.h()
            boolean r0 = androidx.concurrent.futures.a.a(r3, r2, r0, r1)
            if (r0 == 0) goto L2
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r3 = r2.b
            if (r3 != 0) goto L1c
        L1b:
            return
        L1c:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            kotlinx.coroutines.selects.l$a r0 = (kotlinx.coroutines.selects.l.a) r0
            r0.b()
            goto L22
        L32:
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.selects.o.g()
            r2.e = r3
            r3 = 0
            r2.b = r3
            return
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public java.lang.Object y(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r1) {
            r0 = this;
            java.lang.Object r1 = z(r0, r1)
            return r1
    }
}
