package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l0 {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String a = " @";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<kotlin.coroutines.i, kotlin.coroutines.i.b, kotlin.coroutines.i> {
        public static final kotlinx.coroutines.l0.a a = null;

        static {
                kotlinx.coroutines.l0$a r0 = new kotlinx.coroutines.l0$a
                r0.<init>()
                kotlinx.coroutines.l0.a.a = r0
                return
        }

        a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.i a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r3) {
                r1 = this;
                boolean r0 = r3 instanceof kotlinx.coroutines.j0
                if (r0 == 0) goto Lf
                kotlinx.coroutines.j0 r3 = (kotlinx.coroutines.j0) r3
                kotlinx.coroutines.j0 r3 = r3.l()
                kotlin.coroutines.i r2 = r2.plus(r3)
                return r2
            Lf:
                kotlin.coroutines.i r2 = r2.plus(r3)
                return r2
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.coroutines.i invoke(kotlin.coroutines.i r1, kotlin.coroutines.i.b r2) {
                r0 = this;
                kotlin.coroutines.i r1 = (kotlin.coroutines.i) r1
                kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
                kotlin.coroutines.i r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<kotlin.coroutines.i, kotlin.coroutines.i.b, kotlin.coroutines.i> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlin.coroutines.i> a;
        final /* synthetic */ boolean b;

        b(kotlin.jvm.internal.Ref.ObjectRef<kotlin.coroutines.i> r1, boolean r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r1 = 2
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.i a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r6) {
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.j0
                if (r0 != 0) goto L9
                kotlin.coroutines.i r5 = r5.plus(r6)
                return r5
            L9:
                kotlin.jvm.internal.Ref$ObjectRef<kotlin.coroutines.i> r0 = r4.a
                T r0 = r0.element
                kotlin.coroutines.i r0 = (kotlin.coroutines.i) r0
                kotlin.coroutines.i$c r1 = r6.getKey()
                kotlin.coroutines.i$b r0 = r0.get(r1)
                if (r0 != 0) goto L28
                boolean r0 = r4.b
                kotlinx.coroutines.j0 r6 = (kotlinx.coroutines.j0) r6
                if (r0 == 0) goto L23
                kotlinx.coroutines.j0 r6 = r6.l()
            L23:
                kotlin.coroutines.i r5 = r5.plus(r6)
                return r5
            L28:
                kotlin.jvm.internal.Ref$ObjectRef<kotlin.coroutines.i> r1 = r4.a
                T r2 = r1.element
                kotlin.coroutines.i r2 = (kotlin.coroutines.i) r2
                kotlin.coroutines.i$c r3 = r6.getKey()
                kotlin.coroutines.i r2 = r2.minusKey(r3)
                r1.element = r2
                kotlinx.coroutines.j0 r6 = (kotlinx.coroutines.j0) r6
                kotlin.coroutines.i r6 = r6.e(r0)
                kotlin.coroutines.i r5 = r5.plus(r6)
                return r5
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.coroutines.i invoke(kotlin.coroutines.i r1, kotlin.coroutines.i.b r2) {
                r0 = this;
                kotlin.coroutines.i r1 = (kotlin.coroutines.i) r1
                kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
                kotlin.coroutines.i r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.i.b, java.lang.Boolean> {
        public static final kotlinx.coroutines.l0.c a = null;

        static {
                kotlinx.coroutines.l0$c r0 = new kotlinx.coroutines.l0$c
                r0.<init>()
                kotlinx.coroutines.l0.c.a = r0
                return
        }

        c() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Boolean a(boolean r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r2) {
                r0 = this;
                if (r1 != 0) goto L9
                boolean r1 = r2 instanceof kotlinx.coroutines.j0
                if (r1 == 0) goto L7
                goto L9
            L7:
                r1 = 0
                goto La
            L9:
                r1 = 1
            La:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean r1, kotlin.coroutines.i.b r2) {
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
                java.lang.Boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    private static final kotlin.coroutines.i a(kotlin.coroutines.i r3, kotlin.coroutines.i r4, boolean r5) {
            boolean r0 = c(r3)
            boolean r1 = c(r4)
            if (r0 != 0) goto L11
            if (r1 != 0) goto L11
            kotlin.coroutines.i r3 = r3.plus(r4)
            return r3
        L11:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r0.element = r4
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.l0$b r2 = new kotlinx.coroutines.l0$b
            r2.<init>(r0, r5)
            java.lang.Object r3 = r3.fold(r4, r2)
            kotlin.coroutines.i r3 = (kotlin.coroutines.i) r3
            if (r1 == 0) goto L33
            T r5 = r0.element
            kotlin.coroutines.i r5 = (kotlin.coroutines.i) r5
            kotlinx.coroutines.l0$a r1 = kotlinx.coroutines.l0.a.a
            java.lang.Object r4 = r5.fold(r4, r1)
            r0.element = r4
        L33:
            T r4 = r0.element
            kotlin.coroutines.i r4 = (kotlin.coroutines.i) r4
            kotlin.coroutines.i r3 = r3.plus(r4)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r0) {
            r0 = 0
            return r0
    }

    private static final boolean c(kotlin.coroutines.i r2) {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            kotlinx.coroutines.l0$c r1 = kotlinx.coroutines.l0.c.a
            java.lang.Object r2 = r2.fold(r0, r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.i d(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            boolean r0 = c(r2)
            if (r0 != 0) goto Lb
            kotlin.coroutines.i r1 = r1.plus(r2)
            return r1
        Lb:
            r0 = 0
            kotlin.coroutines.i r1 = a(r1, r2, r0)
            return r1
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.i e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            kotlin.coroutines.i r1 = r1.getCoroutineContext()
            r0 = 1
            kotlin.coroutines.i r1 = a(r1, r2, r0)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.a()
            if (r1 == r2) goto L1f
            kotlin.coroutines.f$b r2 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r2 = r1.get(r2)
            if (r2 != 0) goto L1f
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.a()
            kotlin.coroutines.i r1 = r1.plus(r2)
        L1f:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.p3<?> f(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.c r2) {
        L0:
            boolean r0 = r2 instanceof kotlinx.coroutines.c1
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            kotlin.coroutines.jvm.internal.c r2 = r2.getCallerFrame()
            if (r2 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r2 instanceof kotlinx.coroutines.p3
            if (r0 == 0) goto L0
            kotlinx.coroutines.p3 r2 = (kotlinx.coroutines.p3) r2
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.p3<?> g(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            boolean r0 = r2 instanceof kotlin.coroutines.jvm.internal.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.q3 r0 = kotlinx.coroutines.q3.a
            kotlin.coroutines.i$b r0 = r3.get(r0)
            if (r0 == 0) goto L1a
            kotlin.coroutines.jvm.internal.c r2 = (kotlin.coroutines.jvm.internal.c) r2
            kotlinx.coroutines.p3 r2 = f(r2)
            if (r2 == 0) goto L19
            r2.B1(r3, r4)
        L19:
            return r2
        L1a:
            return r1
    }

    public static final <T> T h(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r4) {
            kotlin.coroutines.i r0 = r2.getContext()
            java.lang.Object r3 = kotlinx.coroutines.internal.y0.c(r0, r3)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.internal.y0.a
            if (r3 == r1) goto L11
            kotlinx.coroutines.p3 r2 = g(r2, r0, r3)
            goto L12
        L11:
            r2 = 0
        L12:
            r1 = 1
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.d0.d(r1)
            if (r2 == 0) goto L22
            boolean r2 = r2.A1()
            if (r2 == 0) goto L25
        L22:
            kotlinx.coroutines.internal.y0.a(r0, r3)
        L25:
            kotlin.jvm.internal.d0.c(r1)
            return r4
        L29:
            r4 = move-exception
            kotlin.jvm.internal.d0.d(r1)
            if (r2 == 0) goto L35
            boolean r2 = r2.A1()
            if (r2 == 0) goto L38
        L35:
            kotlinx.coroutines.internal.y0.a(r0, r3)
        L38:
            kotlin.jvm.internal.d0.c(r1)
            throw r4
    }

    public static final <T> T i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.Object r2 = kotlinx.coroutines.internal.y0.c(r1, r2)
            r0 = 1
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L13
            kotlin.jvm.internal.d0.d(r0)
            kotlinx.coroutines.internal.y0.a(r1, r2)
            kotlin.jvm.internal.d0.c(r0)
            return r3
        L13:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            kotlinx.coroutines.internal.y0.a(r1, r2)
            kotlin.jvm.internal.d0.c(r0)
            throw r3
    }
}
