package kotlin.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface f extends kotlin.coroutines.i.b {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.f.b o0 = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static <R> R a(@org.jetbrains.annotations.NotNull kotlin.coroutines.f r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r3) {
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.Object r1 = kotlin.coroutines.i.b.a.a(r1, r2, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public static <E extends kotlin.coroutines.i.b> E b(@org.jetbrains.annotations.NotNull kotlin.coroutines.f r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r3) {
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r3 instanceof kotlin.coroutines.b
                r1 = 0
                if (r0 == 0) goto L22
                kotlin.coroutines.b r3 = (kotlin.coroutines.b) r3
                kotlin.coroutines.i$c r0 = r2.getKey()
                boolean r0 = r3.a(r0)
                if (r0 == 0) goto L21
                kotlin.coroutines.i$b r2 = r3.b(r2)
                boolean r3 = androidx.activity.k.a(r2)
                if (r3 == 0) goto L21
                return r2
            L21:
                return r1
            L22:
                kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
                if (r0 != r3) goto L2c
                java.lang.String r3 = "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"
                kotlin.jvm.internal.g0.n(r2, r3)
                return r2
            L2c:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i c(@org.jetbrains.annotations.NotNull kotlin.coroutines.f r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r2) {
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof kotlin.coroutines.b
                if (r0 == 0) goto L1e
                kotlin.coroutines.b r2 = (kotlin.coroutines.b) r2
                kotlin.coroutines.i$c r0 = r1.getKey()
                boolean r0 = r2.a(r0)
                if (r0 == 0) goto L1d
                kotlin.coroutines.i$b r2 = r2.b(r1)
                if (r2 == 0) goto L1d
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            L1d:
                return r1
            L1e:
                kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
                if (r0 != r2) goto L24
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            L24:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i d(@org.jetbrains.annotations.NotNull kotlin.coroutines.f r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.coroutines.i r1 = kotlin.coroutines.i.b.a.d(r1, r2)
                return r1
        }

        public static void e(@org.jetbrains.annotations.NotNull kotlin.coroutines.f r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r1) {
                java.lang.String r0 = "continuation"
                kotlin.jvm.internal.g0.p(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements kotlin.coroutines.i.c<kotlin.coroutines.f> {
        static final /* synthetic */ kotlin.coroutines.f.b a = null;

        static {
                kotlin.coroutines.f$b r0 = new kotlin.coroutines.f$b
                r0.<init>()
                kotlin.coroutines.f.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.coroutines.f$b r0 = kotlin.coroutines.f.b.a
            kotlin.coroutines.f.o0 = r0
            return
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.Nullable
    <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1);

    @org.jetbrains.annotations.NotNull
    <T> kotlin.coroutines.e<T> interceptContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1);

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1);

    void releaseInterceptedContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r1);
}
