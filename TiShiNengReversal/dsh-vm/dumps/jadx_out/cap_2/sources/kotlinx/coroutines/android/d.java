package kotlinx.coroutines.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,217:1\n1#2:218\n17#3:219\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n147#1:219\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d extends kotlinx.coroutines.android.e implements kotlinx.coroutines.z0 {

    @org.jetbrains.annotations.Nullable
    private volatile kotlinx.coroutines.android.d _immediate;

    @org.jetbrains.annotations.NotNull
    private final android.os.Handler a;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String b;
    private final boolean c;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.android.d d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n148#2:19\n149#2:21\n1#3:20\n*E\n"})
    public static final class a implements java.lang.Runnable {
        final /* synthetic */ kotlinx.coroutines.p a;
        final /* synthetic */ kotlinx.coroutines.android.d b;

        public a(kotlinx.coroutines.p r1, kotlinx.coroutines.android.d r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                kotlinx.coroutines.p r0 = r3.a
                kotlinx.coroutines.android.d r1 = r3.b
                kotlin.n1 r2 = kotlin.n1.a
                r0.P(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ kotlinx.coroutines.android.d a;
        final /* synthetic */ java.lang.Runnable b;

        b(kotlinx.coroutines.android.d r1, java.lang.Runnable r2) {
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
        public final void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.android.d r2 = r1.a
                android.os.Handler r2 = kotlinx.coroutines.android.d.x(r2)
                java.lang.Runnable r0 = r1.b
                r2.removeCallbacks(r0)
                return
        }
    }

    public d(@org.jetbrains.annotations.NotNull android.os.Handler r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public /* synthetic */ d(android.os.Handler r1, java.lang.String r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private d(android.os.Handler r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.a = r2
            r1.b = r3
            r1.c = r4
            if (r4 == 0) goto Ld
            r0 = r1
        Ld:
            r1._immediate = r0
            kotlinx.coroutines.android.d r4 = r1._immediate
            if (r4 != 0) goto L1b
            kotlinx.coroutines.android.d r4 = new kotlinx.coroutines.android.d
            r0 = 1
            r4.<init>(r2, r3, r0)
            r1._immediate = r4
        L1b:
            r1.d = r4
            return
    }

    private static final void C(kotlinx.coroutines.android.d r0, java.lang.Runnable r1) {
            android.os.Handler r0 = r0.a
            r0.removeCallbacks(r1)
            return
    }

    public static /* synthetic */ void w(kotlinx.coroutines.android.d r0, java.lang.Runnable r1) {
            C(r0, r1)
            return
    }

    public static final /* synthetic */ android.os.Handler x(kotlinx.coroutines.android.d r0) {
            android.os.Handler r0 = r0.a
            return r0
    }

    private final void z(kotlin.coroutines.i r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "' was closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            kotlinx.coroutines.h2.f(r4, r0)
            kotlinx.coroutines.m0 r0 = kotlinx.coroutines.g1.c()
            r0.dispatch(r4, r5)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.android.d B() {
            r1 = this;
            kotlinx.coroutines.android.d r0 = r1.d
            return r0
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.a
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.z(r2, r3)
        Lb:
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.android.d
            if (r0 == 0) goto Le
            kotlinx.coroutines.android.d r2 = (kotlinx.coroutines.android.d) r2
            android.os.Handler r2 = r2.a
            android.os.Handler r0 = r1.a
            if (r2 != r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.a
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // kotlinx.coroutines.z0
    public void i(long r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super kotlin.n1> r7) {
            r4 = this;
            kotlinx.coroutines.android.d$a r0 = new kotlinx.coroutines.android.d$a
            r0.<init>(r7, r4)
            android.os.Handler r1 = r4.a
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r5 = kotlin.ranges.t.C(r5, r2)
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L1f
            kotlinx.coroutines.android.d$b r5 = new kotlinx.coroutines.android.d$b
            r5.<init>(r4, r0)
            r7.I(r5)
            return
        L1f:
            kotlin.coroutines.i r5 = r7.getContext()
            r4.z(r5, r0)
            return
    }

    @Override // kotlinx.coroutines.m0
    public boolean isDispatchNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r1 = this;
            boolean r2 = r1.c
            if (r2 == 0) goto L17
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Handler r0 = r1.a
            android.os.Looper r0 = r0.getLooper()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    @Override // kotlinx.coroutines.android.e, kotlinx.coroutines.z0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.j1 m(long r4, @org.jetbrains.annotations.NotNull java.lang.Runnable r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r7) {
            r3 = this;
            android.os.Handler r0 = r3.a
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r4 = kotlin.ranges.t.C(r4, r1)
            boolean r4 = r0.postDelayed(r6, r4)
            if (r4 == 0) goto L17
            kotlinx.coroutines.android.c r4 = new kotlinx.coroutines.android.c
            r4.<init>(r3, r6)
            return r4
        L17:
            r3.z(r7, r6)
            kotlinx.coroutines.s2 r4 = kotlinx.coroutines.s2.a
            return r4
    }

    @Override // kotlinx.coroutines.p2
    public /* bridge */ /* synthetic */ kotlinx.coroutines.p2 t() {
            r1 = this;
            kotlinx.coroutines.android.d r0 = r1.B()
            return r0
    }

    @Override // kotlinx.coroutines.p2, kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.u()
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.b
            if (r0 != 0) goto L10
            android.os.Handler r0 = r2.a
            java.lang.String r0 = r0.toString()
        L10:
            boolean r1 = r2.c
            if (r1 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".immediate"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L25:
            return r0
    }

    @Override // kotlinx.coroutines.android.e
    public /* bridge */ /* synthetic */ kotlinx.coroutines.android.e v() {
            r1 = this;
            kotlinx.coroutines.android.d r0 = r1.B()
            return r0
    }
}
