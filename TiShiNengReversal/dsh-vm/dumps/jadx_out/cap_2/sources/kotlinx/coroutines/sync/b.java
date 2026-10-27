package kotlinx.coroutines.sync;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n332#2,12:311\n1#3:323\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n175#1:311,12\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b extends kotlinx.coroutines.sync.e implements kotlinx.coroutines.sync.a {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater i = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> h;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object owner;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    private final class a implements kotlinx.coroutines.p<kotlin.n1>, kotlinx.coroutines.r3 {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.q<kotlin.n1> a;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.sync.b c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlinx.coroutines.sync.b$a$a, reason: collision with other inner class name */
        static final class C0111a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
            final /* synthetic */ kotlinx.coroutines.sync.b a;
            final /* synthetic */ kotlinx.coroutines.sync.b.a b;

            C0111a(kotlinx.coroutines.sync.b r1, kotlinx.coroutines.sync.b.a r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
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
            public final void invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
                    r1 = this;
                    kotlinx.coroutines.sync.b r2 = r1.a
                    kotlinx.coroutines.sync.b$a r0 = r1.b
                    java.lang.Object r0 = r0.b
                    r2.unlock(r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner$tryResume$token$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
        /* renamed from: kotlinx.coroutines.sync.b$a$b, reason: collision with other inner class name */
        static final class C0112b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
            final /* synthetic */ kotlinx.coroutines.sync.b a;
            final /* synthetic */ kotlinx.coroutines.sync.b.a b;

            C0112b(kotlinx.coroutines.sync.b r1, kotlinx.coroutines.sync.b.a r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
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
            public final void invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                    r2 = this;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.sync.b.p()
                    kotlinx.coroutines.sync.b r0 = r2.a
                    kotlinx.coroutines.sync.b$a r1 = r2.b
                    java.lang.Object r1 = r1.b
                    r3.set(r0, r1)
                    kotlinx.coroutines.sync.b r3 = r2.a
                    kotlinx.coroutines.sync.b$a r0 = r2.b
                    java.lang.Object r0 = r0.b
                    r3.unlock(r0)
                    return
            }
        }

        public a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.b r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.q<? super kotlin.n1> r2, java.lang.Object r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                return
        }

        @Override // kotlinx.coroutines.p
        @kotlinx.coroutines.InternalCoroutinesApi
        public void B(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                r0.B(r2)
                return
        }

        @Override // kotlinx.coroutines.p
        public /* bridge */ /* synthetic */ java.lang.Object C(kotlin.n1 r1, java.lang.Object r2) {
                r0 = this;
                kotlin.n1 r1 = (kotlin.n1) r1
                java.lang.Object r1 = r0.e(r1, r2)
                return r1
        }

        @Override // kotlinx.coroutines.p
        public void I(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                r0.I(r2)
                return
        }

        @Override // kotlinx.coroutines.p
        @kotlinx.coroutines.InternalCoroutinesApi
        @org.jetbrains.annotations.Nullable
        public java.lang.Object J(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                java.lang.Object r2 = r0.J(r2)
                return r2
        }

        @Override // kotlinx.coroutines.p
        public /* bridge */ /* synthetic */ java.lang.Object O(kotlin.n1 r1, java.lang.Object r2, kotlin.jvm.functions.Function1 r3) {
                r0 = this;
                kotlin.n1 r1 = (kotlin.n1) r1
                java.lang.Object r1 = r0.f(r1, r2, r3)
                return r1
        }

        @Override // kotlinx.coroutines.p
        public /* bridge */ /* synthetic */ void P(kotlinx.coroutines.m0 r1, kotlin.n1 r2) {
                r0 = this;
                kotlin.n1 r2 = (kotlin.n1) r2
                r0.d(r1, r2)
                return
        }

        @Override // kotlinx.coroutines.p
        @kotlinx.coroutines.InternalCoroutinesApi
        public void Q() {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                r0.Q()
                return
        }

        @Override // kotlinx.coroutines.p
        public boolean a(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                boolean r2 = r0.a(r2)
                return r2
        }

        @Override // kotlinx.coroutines.r3
        public void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.p0<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                r0.b(r2, r3)
                return
        }

        public void c(@org.jetbrains.annotations.NotNull kotlin.n1 r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r4) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.b.p()
                kotlinx.coroutines.sync.b r0 = r2.c
                java.lang.Object r1 = r2.b
                r4.set(r0, r1)
                kotlinx.coroutines.q<kotlin.n1> r4 = r2.a
                kotlinx.coroutines.sync.b$a$a r0 = new kotlinx.coroutines.sync.b$a$a
                kotlinx.coroutines.sync.b r1 = r2.c
                r0.<init>(r1, r2)
                r4.o(r3, r0)
                return
        }

        @kotlinx.coroutines.ExperimentalCoroutinesApi
        public void d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r2, @org.jetbrains.annotations.NotNull kotlin.n1 r3) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                r0.P(r2, r3)
                return
        }

        @kotlinx.coroutines.InternalCoroutinesApi
        @org.jetbrains.annotations.Nullable
        public java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.n1 r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                java.lang.Object r2 = r0.C(r2, r3)
                return r2
        }

        @org.jetbrains.annotations.Nullable
        public java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.n1 r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r5) {
                r2 = this;
                kotlinx.coroutines.sync.b r5 = r2.c
                kotlinx.coroutines.q<kotlin.n1> r0 = r2.a
                kotlinx.coroutines.sync.b$a$b r1 = new kotlinx.coroutines.sync.b$a$b
                r1.<init>(r5, r2)
                java.lang.Object r3 = r0.O(r3, r4, r1)
                if (r3 == 0) goto L1a
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.b.p()
                kotlinx.coroutines.sync.b r5 = r2.c
                java.lang.Object r0 = r2.b
                r4.set(r5, r0)
            L1a:
                return r3
        }

        @Override // kotlin.coroutines.e
        @org.jetbrains.annotations.NotNull
        public kotlin.coroutines.i getContext() {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                kotlin.coroutines.i r0 = r0.getContext()
                return r0
        }

        @Override // kotlinx.coroutines.p
        @kotlinx.coroutines.ExperimentalCoroutinesApi
        public void h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                r0.h(r2, r3)
                return
        }

        @Override // kotlinx.coroutines.p
        public boolean isActive() {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                boolean r0 = r0.isActive()
                return r0
        }

        @Override // kotlinx.coroutines.p
        public boolean isCancelled() {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // kotlinx.coroutines.p
        public boolean isCompleted() {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                boolean r0 = r0.isCompleted()
                return r0
        }

        @Override // kotlinx.coroutines.p
        public /* bridge */ /* synthetic */ void o(kotlin.n1 r1, kotlin.jvm.functions.Function1 r2) {
                r0 = this;
                kotlin.n1 r1 = (kotlin.n1) r1
                r0.c(r1, r2)
                return
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.q<kotlin.n1> r0 = r1.a
                r0.resumeWith(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    /* renamed from: kotlinx.coroutines.sync.b$b, reason: collision with other inner class name */
    private final class C0113b<Q> implements kotlinx.coroutines.selects.n<Q> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.selects.n<Q> a;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.sync.b c;

        public C0113b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.b r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.selects.n<Q> r2, java.lang.Object r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                return
        }

        @Override // kotlinx.coroutines.r3
        public void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.p0<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.selects.n<Q> r0 = r1.a
                r0.b(r2, r3)
                return
        }

        @Override // kotlinx.coroutines.selects.m
        public void f(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.b.p()
                kotlinx.coroutines.sync.b r1 = r3.c
                java.lang.Object r2 = r3.b
                r0.set(r1, r2)
                kotlinx.coroutines.selects.n<Q> r0 = r3.a
                r0.f(r4)
                return
        }

        @Override // kotlinx.coroutines.selects.m
        @org.jetbrains.annotations.NotNull
        public kotlin.coroutines.i getContext() {
                r1 = this;
                kotlinx.coroutines.selects.n<Q> r0 = r1.a
                kotlin.coroutines.i r0 = r0.getContext()
                return r0
        }

        @Override // kotlinx.coroutines.selects.m
        public void h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.j1 r2) {
                r1 = this;
                kotlinx.coroutines.selects.n<Q> r0 = r1.a
                r0.h(r2)
                return
        }

        @Override // kotlinx.coroutines.selects.m
        public boolean j(@org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r2 = this;
                kotlinx.coroutines.selects.n<Q> r0 = r2.a
                boolean r3 = r0.j(r3, r4)
                kotlinx.coroutines.sync.b r4 = r2.c
                if (r3 == 0) goto L13
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.b.p()
                java.lang.Object r1 = r2.b
                r0.set(r4, r1)
            L13:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.sync.b, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.sync.b.c a = null;

        static {
                kotlinx.coroutines.sync.b$c r0 = new kotlinx.coroutines.sync.b$c
                r0.<init>()
                kotlinx.coroutines.sync.b.c.a = r0
                return
        }

        c() {
                r6 = this;
                java.lang.String r4 = "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.sync.b> r2 = kotlinx.coroutines.sync.b.class
                java.lang.String r3 = "onLockRegFunction"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.b r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                r1.w(r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.sync.b r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class d extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.sync.b, java.lang.Object, java.lang.Object, java.lang.Object> {
        public static final kotlinx.coroutines.sync.b.d a = null;

        static {
                kotlinx.coroutines.sync.b$d r0 = new kotlinx.coroutines.sync.b$d
                r0.<init>()
                kotlinx.coroutines.sync.b.d.a = r0
                return
        }

        d() {
                r6 = this;
                java.lang.String r4 = "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.sync.b> r2 = kotlinx.coroutines.sync.b.class
                java.lang.String r3 = "onLockProcessResult"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.b r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                java.lang.Object r1 = r1.v(r2, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.sync.b r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r1 = r0.c(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends kotlin.n1>> {
        final /* synthetic */ kotlinx.coroutines.sync.b a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
            final /* synthetic */ kotlinx.coroutines.sync.b a;
            final /* synthetic */ java.lang.Object b;

            a(kotlinx.coroutines.sync.b r1, java.lang.Object r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
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
            public final void invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
                    r1 = this;
                    kotlinx.coroutines.sync.b r2 = r1.a
                    java.lang.Object r0 = r1.b
                    r2.unlock(r0)
                    return
            }
        }

        e(kotlinx.coroutines.sync.b r1) {
                r0 = this;
                r0.a = r1
                r1 = 3
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.sync.b$e$a r1 = new kotlinx.coroutines.sync.b$e$a
                kotlinx.coroutines.sync.b r3 = r0.a
                r1.<init>(r3, r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends kotlin.n1> invoke(kotlinx.coroutines.selects.m<?> r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.selects.m r1 = (kotlinx.coroutines.selects.m) r1
                kotlin.jvm.functions.Function1 r1 = r0.a(r1, r2, r3)
                return r1
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "owner"
            java.lang.Class<kotlinx.coroutines.sync.b> r2 = kotlinx.coroutines.sync.b.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.b.i = r0
            return
    }

    public b(boolean r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            if (r2 == 0) goto L8
            r2 = 0
            goto Lc
        L8:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.sync.c.c()
        Lc:
            r1.owner = r2
            kotlinx.coroutines.sync.b$e r2 = new kotlinx.coroutines.sync.b$e
            r2.<init>(r1)
            r1.h = r2
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater p() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.b.i
            return r0
    }

    public static final /* synthetic */ java.lang.Object q(kotlinx.coroutines.sync.b r0, java.lang.Object r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.u(r1, r2)
            return r0
    }

    public static /* synthetic */ void r() {
            return
    }

    private final int s(java.lang.Object r3) {
            r2 = this;
        L0:
            boolean r0 = r2.isLocked()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.b.i
            java.lang.Object r0 = r0.get(r2)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.sync.c.c()
            if (r0 == r1) goto L0
            if (r0 != r3) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 2
            return r3
    }

    static /* synthetic */ java.lang.Object t(kotlinx.coroutines.sync.b r1, java.lang.Object r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            boolean r0 = r1.tryLock(r2)
            if (r0 == 0) goto L9
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L9:
            java.lang.Object r1 = r1.u(r2, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto L14
            return r1
        L14:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final java.lang.Object u(java.lang.Object r3, kotlin.coroutines.e<? super kotlin.n1> r4) {
            r2 = this;
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r4)
            kotlinx.coroutines.q r0 = kotlinx.coroutines.s.b(r0)
            kotlinx.coroutines.sync.b$a r1 = new kotlinx.coroutines.sync.b$a     // Catch: java.lang.Throwable -> L27
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L27
            r2.g(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r0) goto L1d
            kotlin.coroutines.jvm.internal.e.c(r4)
        L1d:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L24
            return r3
        L24:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
        L27:
            r3 = move-exception
            r0.N()
            throw r3
    }

    private final int x(java.lang.Object r4) {
            r3 = this;
        L0:
            boolean r0 = r3.a()
            if (r0 == 0) goto Ld
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.b.i
            r0.set(r3, r4)
            r4 = 0
            return r4
        Ld:
            r0 = 1
            if (r4 != 0) goto L11
            return r0
        L11:
            int r1 = r3.s(r4)
            r2 = 2
            if (r1 == r0) goto L1c
            if (r1 == r2) goto L1b
            goto L0
        L1b:
            return r0
        L1c:
            return r2
    }

    @Override // kotlinx.coroutines.sync.a
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.i<java.lang.Object, kotlinx.coroutines.sync.a> getOnLock() {
            r5 = this;
            kotlinx.coroutines.selects.j r0 = new kotlinx.coroutines.selects.j
            kotlinx.coroutines.sync.b$c r1 = kotlinx.coroutines.sync.b.c.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.sync.b$d r3 = kotlinx.coroutines.sync.b.d.a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.g0.n(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.u0.q(r3, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> r3 = r5.h
            r0.<init>(r5, r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean holdsLock(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            int r2 = r1.s(r2)
            r0 = 1
            if (r2 != r0) goto L8
            return r0
        L8:
            r2 = 0
            return r2
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean isLocked() {
            r1 = this;
            int r0 = r1.b()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.sync.a
    @org.jetbrains.annotations.Nullable
    public java.lang.Object lock(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = t(r0, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Mutex@"
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.u0.b(r2)
            r0.append(r1)
            java.lang.String r1 = "[isLocked="
            r0.append(r1)
            boolean r1 = r2.isLocked()
            r0.append(r1)
            java.lang.String r1 = ",owner="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.b.i
            java.lang.Object r1 = r1.get(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean tryLock(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            int r0 = r3.x(r4)
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L2f
            r1 = 2
            if (r0 == r1) goto L14
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r4.<init>(r0)
            throw r4
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2f:
            r4 = 0
            return r4
        L31:
            return r1
    }

    @Override // kotlinx.coroutines.sync.a
    public void unlock(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
        L0:
            boolean r0 = r3.isLocked()
            if (r0 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.b.i
            java.lang.Object r1 = r0.get(r3)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.sync.c.c()
            if (r1 == r2) goto L0
            if (r1 == r4) goto L3f
            if (r4 != 0) goto L17
            goto L3f
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "This mutex is locked by "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", but "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is expected"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L3f:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.sync.c.c()
            boolean r0 = androidx.concurrent.futures.a.a(r0, r3, r1, r2)
            if (r0 == 0) goto L0
            r3.release()
            return
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "This mutex is not locked"
            r4.<init>(r0)
            throw r4
    }

    @org.jetbrains.annotations.Nullable
    protected java.lang.Object v(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r2 = this;
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.sync.c.d()
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r4 != 0) goto Lb
            return r2
        Lb:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "This mutex is already locked by the specified owner: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    protected void w(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r2 = this;
            if (r4 == 0) goto L10
            boolean r0 = r2.holdsLock(r4)
            if (r0 == 0) goto L10
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.sync.c.d()
            r3.f(r4)
            return
        L10:
            kotlinx.coroutines.sync.b$b r0 = new kotlinx.coroutines.sync.b$b
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>"
            kotlin.jvm.internal.g0.n(r3, r1)
            kotlinx.coroutines.selects.n r3 = (kotlinx.coroutines.selects.n) r3
            r0.<init>(r2, r3, r4)
            r2.m(r0, r4)
            return
    }
}
