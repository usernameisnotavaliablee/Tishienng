package kotlinx.coroutines.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n314#2,11:218\n314#2,9:229\n323#2,2:239\n17#3:238\n1#4:241\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n189#1:218,11\n197#1:229,9\n197#1:239,2\n201#1:238\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {
    private static final long a = 4611686018427387903L;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.android.e b = null;

    @org.jetbrains.annotations.Nullable
    private static volatile android.view.Choreographer choreographer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,18:1\n202#2,2:19\n*E\n"})
    public static final class a implements java.lang.Runnable {
        final /* synthetic */ kotlinx.coroutines.p a;

        public a(kotlinx.coroutines.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                kotlinx.coroutines.p r0 = r1.a
                kotlinx.coroutines.android.g.d(r0)
                return
        }
    }

    static {
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.android.d r1 = new kotlinx.coroutines.android.d     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            r3 = 1
            android.os.Handler r2 = e(r2, r3)     // Catch: java.lang.Throwable -> L17
            r3 = 2
            r1.<init>(r2, r0, r3, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.g0.a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
        L22:
            boolean r2 = kotlin.Result.m17isFailureimpl(r1)
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            kotlinx.coroutines.android.e r0 = (kotlinx.coroutines.android.e) r0
            kotlinx.coroutines.android.g.b = r0
            return
    }

    public static /* synthetic */ void a(kotlinx.coroutines.p r0, long r1) {
            m(r0, r1)
            return
    }

    public static final /* synthetic */ java.lang.Object b(kotlin.coroutines.e r0) {
            java.lang.Object r0 = g(r0)
            return r0
    }

    public static final /* synthetic */ void c(android.view.Choreographer r0, kotlinx.coroutines.p r1) {
            l(r0, r1)
            return
    }

    public static final /* synthetic */ void d(kotlinx.coroutines.p r0) {
            n(r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.NotNull
    public static final android.os.Handler e(@org.jetbrains.annotations.NotNull android.os.Looper r7, boolean r8) {
            if (r8 == 0) goto L52
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.Class<android.os.Looper> r4 = android.os.Looper.class
            java.lang.Class<android.os.Handler> r5 = android.os.Handler.class
            if (r8 < r0) goto L29
            java.lang.Class[] r8 = new java.lang.Class[r2]
            r8[r1] = r4
            java.lang.String r0 = "createAsync"
            java.lang.reflect.Method r8 = r5.getDeclaredMethod(r0, r8)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r7
            java.lang.Object r7 = r8.invoke(r3, r0)
            java.lang.String r8 = "null cannot be cast to non-null type android.os.Handler"
            kotlin.jvm.internal.g0.n(r7, r8)
            android.os.Handler r7 = (android.os.Handler) r7
            return r7
        L29:
            r8 = 3
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch: java.lang.NoSuchMethodException -> L4c
            r0[r1] = r4     // Catch: java.lang.NoSuchMethodException -> L4c
            java.lang.Class<android.os.Handler$Callback> r4 = android.os.Handler.Callback.class
            r0[r2] = r4     // Catch: java.lang.NoSuchMethodException -> L4c
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L4c
            r6 = 2
            r0[r6] = r4     // Catch: java.lang.NoSuchMethodException -> L4c
            java.lang.reflect.Constructor r0 = r5.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L4c
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            r8[r2] = r3
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8[r6] = r7
            java.lang.Object r7 = r0.newInstance(r8)
            android.os.Handler r7 = (android.os.Handler) r7
            return r7
        L4c:
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r7)
            return r8
        L52:
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r7)
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Long> r4) {
            android.view.Choreographer r0 = kotlinx.coroutines.android.g.choreographer
            if (r0 == 0) goto L22
            kotlinx.coroutines.q r1 = new kotlinx.coroutines.q
            kotlin.coroutines.e r2 = kotlin.coroutines.intrinsics.a.e(r4)
            r3 = 1
            r1.<init>(r2, r3)
            r1.Q()
            c(r0, r1)
            java.lang.Object r0 = r1.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L21
            kotlin.coroutines.jvm.internal.e.c(r4)
        L21:
            return r0
        L22:
            java.lang.Object r4 = g(r4)
            return r4
    }

    private static final java.lang.Object g(kotlin.coroutines.e<? super java.lang.Long> r4) {
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L1b
            d(r0)
            goto L2b
        L1b:
            kotlinx.coroutines.p2 r1 = kotlinx.coroutines.g1.e()
            kotlin.coroutines.i r2 = r0.getContext()
            kotlinx.coroutines.android.g$a r3 = new kotlinx.coroutines.android.g$a
            r3.<init>(r0)
            r1.dispatch(r2, r3)
        L2b:
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L38
            kotlin.coroutines.jvm.internal.e.c(r4)
        L38:
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "from")
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.android.e h(@org.jetbrains.annotations.NotNull android.os.Handler r2) {
            r0 = 0
            r1 = 1
            kotlinx.coroutines.android.e r2 = j(r2, r0, r1, r0)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "from")
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.android.e i(@org.jetbrains.annotations.NotNull android.os.Handler r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            kotlinx.coroutines.android.d r0 = new kotlinx.coroutines.android.d
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.android.e j(android.os.Handler r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.android.e r0 = i(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void k() {
            return
    }

    private static final void l(android.view.Choreographer r1, kotlinx.coroutines.p<? super java.lang.Long> r2) {
            kotlinx.coroutines.android.f r0 = new kotlinx.coroutines.android.f
            r0.<init>(r2)
            r1.postFrameCallback(r0)
            return
    }

    private static final void m(kotlinx.coroutines.p r1, long r2) {
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.P(r0, r2)
            return
    }

    private static final void n(kotlinx.coroutines.p<? super java.lang.Long> r1) {
            android.view.Choreographer r0 = kotlinx.coroutines.android.g.choreographer
            if (r0 != 0) goto Ld
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            kotlin.jvm.internal.g0.m(r0)
            kotlinx.coroutines.android.g.choreographer = r0
        Ld:
            l(r0, r1)
            return
    }
}
