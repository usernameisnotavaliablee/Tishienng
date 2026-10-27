package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class q {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> {
        public static final kotlinx.coroutines.flow.q.a a = null;

        static {
                kotlinx.coroutines.flow.q$a r0 = new kotlinx.coroutines.flow.q$a
                r0.<init>()
                kotlinx.coroutines.flow.q.a.a = r0
                return
        }

        a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Boolean a(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r0 = this;
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> {
        public static final kotlinx.coroutines.flow.q.b a = null;

        static {
                kotlinx.coroutines.flow.q$b r0 = new kotlinx.coroutines.flow.q$b
                r0.<init>()
                kotlinx.coroutines.flow.q.b.a = r0
                return
        }

        b() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // kotlin.jvm.functions.Function1
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                return r1
        }
    }

    static {
            kotlinx.coroutines.flow.q$b r0 = kotlinx.coroutines.flow.q.b.a
            kotlinx.coroutines.flow.q.a = r0
            kotlinx.coroutines.flow.q$a r0 = kotlinx.coroutines.flow.q.a.a
            kotlinx.coroutines.flow.q.b = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.flow.h0
            if (r0 == 0) goto L5
            return r2
        L5:
            kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> r0 = kotlinx.coroutines.flow.q.a
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r1 = kotlinx.coroutines.flow.q.b
            kotlinx.coroutines.flow.i r2 = d(r2, r0, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> r3) {
            kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> r0 = kotlinx.coroutines.flow.q.a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>"
            kotlin.jvm.internal.g0.n(r3, r1)
            r1 = 2
            java.lang.Object r3 = kotlin.jvm.internal.u0.q(r3, r1)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            kotlinx.coroutines.flow.i r2 = d(r2, r0, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> kotlinx.coroutines.flow.i<T> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = kotlinx.coroutines.flow.q.b
            kotlinx.coroutines.flow.i r1 = d(r1, r2, r0)
            return r1
    }

    private static final <T> kotlinx.coroutines.flow.i<T> d(kotlinx.coroutines.flow.i<? extends T> r2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r3, kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r4) {
            boolean r0 = r2 instanceof kotlinx.coroutines.flow.g
            if (r0 == 0) goto L10
            r0 = r2
            kotlinx.coroutines.flow.g r0 = (kotlinx.coroutines.flow.g) r0
            kotlin.jvm.functions.Function1<T, java.lang.Object> r1 = r0.b
            if (r1 != r3) goto L10
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = r0.c
            if (r0 != r4) goto L10
            return r2
        L10:
            kotlinx.coroutines.flow.g r0 = new kotlinx.coroutines.flow.g
            r0.<init>(r2, r3, r4)
            return r0
    }
}
