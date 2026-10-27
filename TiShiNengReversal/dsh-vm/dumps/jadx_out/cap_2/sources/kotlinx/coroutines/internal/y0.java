package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y0 {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.i.b, java.lang.Object> b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.e3<?>, kotlin.coroutines.i.b, kotlinx.coroutines.e3<?>> c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.e1, kotlin.coroutines.i.b, kotlinx.coroutines.internal.e1> d = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.i.b, java.lang.Object> {
        public static final kotlinx.coroutines.internal.y0.a a = null;

        static {
                kotlinx.coroutines.internal.y0$a r0 = new kotlinx.coroutines.internal.y0$a
                r0.<init>()
                kotlinx.coroutines.internal.y0.a.a = r0
                return
        }

        a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object a(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r3) {
                r1 = this;
                boolean r0 = r3 instanceof kotlinx.coroutines.e3
                if (r0 == 0) goto L1d
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 == 0) goto Lb
                java.lang.Integer r2 = (java.lang.Integer) r2
                goto Lc
            Lb:
                r2 = 0
            Lc:
                r0 = 1
                if (r2 == 0) goto L14
                int r2 = r2.intValue()
                goto L15
            L14:
                r2 = 1
            L15:
                if (r2 != 0) goto L18
                return r3
            L18:
                int r2 = r2 + r0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L1d:
                return r2
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.i.b r2) {
                r0 = this;
                kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
                java.lang.Object r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.e3<?>, kotlin.coroutines.i.b, kotlinx.coroutines.e3<?>> {
        public static final kotlinx.coroutines.internal.y0.b a = null;

        static {
                kotlinx.coroutines.internal.y0$b r0 = new kotlinx.coroutines.internal.y0$b
                r0.<init>()
                kotlinx.coroutines.internal.y0.b.a = r0
                return
        }

        b() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.e3<?> a(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e3<?> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r2) {
                r0 = this;
                if (r1 == 0) goto L3
                return r1
            L3:
                boolean r1 = r2 instanceof kotlinx.coroutines.e3
                if (r1 == 0) goto La
                kotlinx.coroutines.e3 r2 = (kotlinx.coroutines.e3) r2
                return r2
            La:
                r1 = 0
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlinx.coroutines.e3<?> invoke(kotlinx.coroutines.e3<?> r1, kotlin.coroutines.i.b r2) {
                r0 = this;
                kotlinx.coroutines.e3 r1 = (kotlinx.coroutines.e3) r1
                kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
                kotlinx.coroutines.e3 r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.e1, kotlin.coroutines.i.b, kotlinx.coroutines.internal.e1> {
        public static final kotlinx.coroutines.internal.y0.c a = null;

        static {
                kotlinx.coroutines.internal.y0$c r0 = new kotlinx.coroutines.internal.y0$c
                r0.<init>()
                kotlinx.coroutines.internal.y0.c.a = r0
                return
        }

        c() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.e1 a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.e1 r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r3) {
                r1 = this;
                boolean r0 = r3 instanceof kotlinx.coroutines.e3
                if (r0 == 0) goto Lf
                kotlinx.coroutines.e3 r3 = (kotlinx.coroutines.e3) r3
                kotlin.coroutines.i r0 = r2.a
                java.lang.Object r0 = r3.U(r0)
                r2.a(r3, r0)
            Lf:
                return r2
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlinx.coroutines.internal.e1 invoke(kotlinx.coroutines.internal.e1 r1, kotlin.coroutines.i.b r2) {
                r0 = this;
                kotlinx.coroutines.internal.e1 r1 = (kotlinx.coroutines.internal.e1) r1
                kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
                kotlinx.coroutines.internal.e1 r1 = r0.a(r1, r2)
                return r1
        }
    }

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r0.<init>(r1)
            kotlinx.coroutines.internal.y0.a = r0
            kotlinx.coroutines.internal.y0$a r0 = kotlinx.coroutines.internal.y0.a.a
            kotlinx.coroutines.internal.y0.b = r0
            kotlinx.coroutines.internal.y0$b r0 = kotlinx.coroutines.internal.y0.b.a
            kotlinx.coroutines.internal.y0.c = r0
            kotlinx.coroutines.internal.y0$c r0 = kotlinx.coroutines.internal.y0.c.a
            kotlinx.coroutines.internal.y0.d = r0
            return
    }

    public static final void a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.internal.y0.a
            if (r3 != r0) goto L5
            return
        L5:
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.e1
            if (r0 == 0) goto Lf
            kotlinx.coroutines.internal.e1 r3 = (kotlinx.coroutines.internal.e1) r3
            r3.b(r2)
            return
        Lf:
            r0 = 0
            kotlin.jvm.functions.Function2<kotlinx.coroutines.e3<?>, kotlin.coroutines.i$b, kotlinx.coroutines.e3<?>> r1 = kotlinx.coroutines.internal.y0.c
            java.lang.Object r0 = r2.fold(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.e3 r0 = (kotlinx.coroutines.e3) r0
            r0.n(r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.i$b, java.lang.Object> r1 = kotlinx.coroutines.internal.y0.b
            java.lang.Object r2 = r2.fold(r0, r1)
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            if (r2 != 0) goto L6
            java.lang.Object r2 = b(r1)
        L6:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != r0) goto L10
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.internal.y0.a
            return r1
        L10:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L26
            kotlinx.coroutines.internal.e1 r0 = new kotlinx.coroutines.internal.e1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.e1, kotlin.coroutines.i$b, kotlinx.coroutines.internal.e1> r2 = kotlinx.coroutines.internal.y0.d
            java.lang.Object r1 = r1.fold(r0, r2)
            return r1
        L26:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r2, r0)
            kotlinx.coroutines.e3 r2 = (kotlinx.coroutines.e3) r2
            java.lang.Object r1 = r2.U(r1)
            return r1
    }
}
