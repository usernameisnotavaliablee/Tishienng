package kotlin.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface i {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static /* synthetic */ kotlin.coroutines.i a(kotlin.coroutines.i r0, kotlin.coroutines.i.b r1) {
                kotlin.coroutines.i r0 = c(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                if (r2 != r0) goto La
                return r1
            La:
                kotlin.coroutines.h r0 = new kotlin.coroutines.h
                r0.<init>()
                java.lang.Object r1 = r2.fold(r1, r0)
                kotlin.coroutines.i r1 = (kotlin.coroutines.i) r1
                return r1
        }

        private static kotlin.coroutines.i c(kotlin.coroutines.i r3, kotlin.coroutines.i.b r4) {
                java.lang.String r0 = "acc"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "element"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.coroutines.i$c r0 = r4.getKey()
                kotlin.coroutines.i r3 = r3.minusKey(r0)
                kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                if (r3 != r0) goto L17
                return r4
            L17:
                kotlin.coroutines.f$b r1 = kotlin.coroutines.f.o0
                kotlin.coroutines.i$b r2 = r3.get(r1)
                kotlin.coroutines.f r2 = (kotlin.coroutines.f) r2
                if (r2 != 0) goto L27
                kotlin.coroutines.CombinedContext r0 = new kotlin.coroutines.CombinedContext
                r0.<init>(r3, r4)
                return r0
            L27:
                kotlin.coroutines.i r3 = r3.minusKey(r1)
                if (r3 != r0) goto L33
                kotlin.coroutines.CombinedContext r3 = new kotlin.coroutines.CombinedContext
                r3.<init>(r4, r2)
                return r3
            L33:
                kotlin.coroutines.CombinedContext r0 = new kotlin.coroutines.CombinedContext
                kotlin.coroutines.CombinedContext r1 = new kotlin.coroutines.CombinedContext
                r1.<init>(r3, r4)
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b extends kotlin.coroutines.i {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a {
            public static <R> R a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r3) {
                    java.lang.String r0 = "operation"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.Object r1 = r3.invoke(r2, r1)
                    return r1
            }

            @org.jetbrains.annotations.Nullable
            public static <E extends kotlin.coroutines.i.b> E b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r2) {
                    java.lang.String r0 = "key"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    kotlin.coroutines.i$c r0 = r1.getKey()
                    boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
                    if (r2 == 0) goto L15
                    java.lang.String r2 = "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get"
                    kotlin.jvm.internal.g0.n(r1, r2)
                    return r1
                L15:
                    r1 = 0
                    return r1
            }

            @org.jetbrains.annotations.NotNull
            public static kotlin.coroutines.i c(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r2) {
                    java.lang.String r0 = "key"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    kotlin.coroutines.i$c r0 = r1.getKey()
                    boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
                    if (r2 == 0) goto L11
                    kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                L11:
                    return r1
            }

            @org.jetbrains.annotations.NotNull
            public static kotlin.coroutines.i d(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    kotlin.coroutines.i r1 = kotlin.coroutines.i.a.b(r1, r2)
                    return r1
            }
        }

        @Override // kotlin.coroutines.i
        <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2);

        @Override // kotlin.coroutines.i
        @org.jetbrains.annotations.Nullable
        <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1);

        @org.jetbrains.annotations.NotNull
        kotlin.coroutines.i.c<?> getKey();

        @Override // kotlin.coroutines.i
        @org.jetbrains.annotations.NotNull
        kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c<E extends kotlin.coroutines.i.b> {
    }

    <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2);

    @org.jetbrains.annotations.Nullable
    <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1);

    @org.jetbrains.annotations.NotNull
    kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1);

    @org.jetbrains.annotations.NotNull
    kotlin.coroutines.i plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1);
}
