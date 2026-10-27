package kotlinx.coroutines.debug.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public volatile java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.c> _lastObservedFrame;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public volatile java.lang.String _state;

    @org.jetbrains.annotations.Nullable
    private final kotlinx.coroutines.debug.internal.k a;

    @kotlin.jvm.JvmField
    public final long b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.ref.WeakReference<kotlin.coroutines.i> c;
    private int d;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public volatile java.lang.Thread lastObservedThread;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super java.lang.StackTraceElement>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.debug.internal.e c;
        final /* synthetic */ kotlinx.coroutines.debug.internal.k d;

        a(kotlinx.coroutines.debug.internal.e r1, kotlinx.coroutines.debug.internal.k r2, kotlin.coroutines.e<? super kotlinx.coroutines.debug.internal.e.a> r3) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlinx.coroutines.debug.internal.e$a r0 = new kotlinx.coroutines.debug.internal.e$a
                kotlinx.coroutines.debug.internal.e r1 = r3.c
                kotlinx.coroutines.debug.internal.k r2 = r3.d
                r0.<init>(r1, r2, r5)
                r0.b = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.o<? super java.lang.StackTraceElement> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlin.sequences.o<? super java.lang.StackTraceElement> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.debug.internal.e$a r1 = (kotlinx.coroutines.debug.internal.e.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r4.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r5)
                goto L2f
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                java.lang.Object r5 = r4.b
                kotlin.sequences.o r5 = (kotlin.sequences.o) r5
                kotlinx.coroutines.debug.internal.e r1 = r4.c
                kotlinx.coroutines.debug.internal.k r3 = r4.d
                kotlin.coroutines.jvm.internal.c r3 = r3.getCallerFrame()
                r4.a = r2
                java.lang.Object r5 = kotlinx.coroutines.debug.internal.e.a(r1, r5, r3, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0, 0}, l = {171}, m = "yieldFrames", n = {"this", "$this$yieldFrames", "frame"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        final /* synthetic */ kotlinx.coroutines.debug.internal.e e;
        int f;

        b(kotlinx.coroutines.debug.internal.e r1, kotlin.coroutines.e<? super kotlinx.coroutines.debug.internal.e.b> r2) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.d = r2
                int r2 = r1.f
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f = r2
                kotlinx.coroutines.debug.internal.e r2 = r1.e
                r0 = 0
                java.lang.Object r2 = kotlinx.coroutines.debug.internal.e.a(r2, r0, r0, r1)
                return r2
        }
    }

    public e(@org.jetbrains.annotations.Nullable kotlin.coroutines.i r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.debug.internal.k r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.c = r2
            java.lang.String r1 = "CREATED"
            r0._state = r1
            return
    }

    public static final /* synthetic */ java.lang.Object a(kotlinx.coroutines.debug.internal.e r0, kotlin.sequences.o r1, kotlin.coroutines.jvm.internal.c r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = r0.j(r1, r2, r3)
            return r0
    }

    private final java.util.List<java.lang.StackTraceElement> b() {
            r3 = this;
            kotlinx.coroutines.debug.internal.k r0 = r3.a
            if (r0 != 0) goto L9
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L9:
            kotlinx.coroutines.debug.internal.e$a r1 = new kotlinx.coroutines.debug.internal.e$a
            r2 = 0
            r1.<init>(r3, r0, r2)
            kotlin.sequences.m r0 = kotlin.sequences.p.b(r1)
            java.util.List r0 = kotlin.sequences.p.I3(r0)
            return r0
    }

    private final java.lang.Object j(kotlin.sequences.o<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.c r7, kotlin.coroutines.e<? super kotlin.n1> r8) {
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.e.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.e$b r0 = (kotlinx.coroutines.debug.internal.e.b) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.e$b r0 = new kotlinx.coroutines.debug.internal.e$b
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.c
            kotlin.coroutines.jvm.internal.c r6 = (kotlin.coroutines.jvm.internal.c) r6
            java.lang.Object r7 = r0.b
            kotlin.sequences.o r7 = (kotlin.sequences.o) r7
            java.lang.Object r2 = r0.a
            kotlinx.coroutines.debug.internal.e r2 = (kotlinx.coroutines.debug.internal.e) r2
            kotlin.g0.n(r8)
            goto L5e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.g0.n(r8)
            r2 = r5
        L41:
            if (r7 != 0) goto L46
            kotlin.n1 r6 = kotlin.n1.a
            return r6
        L46:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L61
            r0.a = r2
            r0.b = r6
            r0.c = r7
            r0.f = r3
            java.lang.Object r8 = r6.c(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r4 = r7
            r7 = r6
            r6 = r4
        L5e:
            r4 = r7
            r7 = r6
            r6 = r4
        L61:
            kotlin.coroutines.jvm.internal.c r7 = r7.getCallerFrame()
            if (r7 == 0) goto L68
            goto L41
        L68:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.debug.internal.k c() {
            r1 = this;
            kotlinx.coroutines.debug.internal.k r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> d() {
            r1 = this;
            java.util.List r0 = r1.b()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.jvm.internal.c e() {
            r1 = this;
            java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.c> r0 = r1._lastObservedFrame
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            kotlin.coroutines.jvm.internal.c r0 = (kotlin.coroutines.jvm.internal.c) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1._state
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> g() {
            r3 = this;
            kotlin.coroutines.jvm.internal.c r0 = r3.e()
            if (r0 != 0) goto Lb
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L10:
            if (r0 == 0) goto L20
            java.lang.StackTraceElement r2 = r0.getStackTraceElement()
            if (r2 == 0) goto L1b
            r1.add(r2)
        L1b:
            kotlin.coroutines.jvm.internal.c r0 = r0.getCallerFrame()
            goto L10
        L20:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.i getContext() {
            r1 = this;
            java.lang.ref.WeakReference<kotlin.coroutines.i> r0 = r1.c
            java.lang.Object r0 = r0.get()
            kotlin.coroutines.i r0 = (kotlin.coroutines.i) r0
            return r0
    }

    public final void h(@org.jetbrains.annotations.Nullable kotlin.coroutines.jvm.internal.c r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1._lastObservedFrame = r0
            return
    }

    public final synchronized void i(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2._state     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            java.lang.String r0 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            if (r5 == 0) goto L1e
            int r5 = r2.d     // Catch: java.lang.Throwable -> L1c
            int r5 = r5 + 1
            r2.d = r5     // Catch: java.lang.Throwable -> L1c
            goto L32
        L1c:
            r3 = move-exception
            goto L68
        L1e:
            int r5 = r2.d     // Catch: java.lang.Throwable -> L1c
            if (r5 <= 0) goto L32
            java.lang.String r5 = "SUSPENDED"
            boolean r5 = kotlin.jvm.internal.g0.g(r3, r5)     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L32
            int r3 = r2.d     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + (-1)
            r2.d = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return
        L32:
            java.lang.String r5 = r2._state     // Catch: java.lang.Throwable -> L1c
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r3)     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L4a
            java.lang.String r5 = "SUSPENDED"
            boolean r5 = kotlin.jvm.internal.g0.g(r3, r5)     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L4a
            kotlin.coroutines.jvm.internal.c r5 = r2.e()     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L4a
            monitor-exit(r2)
            return
        L4a:
            r2._state = r3     // Catch: java.lang.Throwable -> L1c
            boolean r5 = r4 instanceof kotlin.coroutines.jvm.internal.c     // Catch: java.lang.Throwable -> L1c
            r0 = 0
            if (r5 == 0) goto L54
            kotlin.coroutines.jvm.internal.c r4 = (kotlin.coroutines.jvm.internal.c) r4     // Catch: java.lang.Throwable -> L1c
            goto L55
        L54:
            r4 = r0
        L55:
            r2.h(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "RUNNING"
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L64
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1c
        L64:
            r2.lastObservedThread = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return
        L68:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DebugCoroutineInfo(state="
            r0.append(r1)
            java.lang.String r1 = r2.f()
            r0.append(r1)
            java.lang.String r1 = ",context="
            r0.append(r1)
            kotlin.coroutines.i r1 = r2.getContext()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
