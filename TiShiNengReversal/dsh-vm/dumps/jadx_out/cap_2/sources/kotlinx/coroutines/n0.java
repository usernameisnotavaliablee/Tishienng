package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface n0 extends kotlin.coroutines.i.b {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.n0.b r0 = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static <R> R a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.n0 r0, R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2) {
                java.lang.Object r0 = kotlin.coroutines.i.b.a.a(r0, r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public static <E extends kotlin.coroutines.i.b> E b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.n0 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1) {
                kotlin.coroutines.i$b r0 = kotlin.coroutines.i.b.a.b(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.n0 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1) {
                kotlin.coroutines.i r0 = kotlin.coroutines.i.b.a.c(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.n0 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
                kotlin.coroutines.i r0 = kotlin.coroutines.i.b.a.d(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements kotlin.coroutines.i.c<kotlinx.coroutines.n0> {
        static final /* synthetic */ kotlinx.coroutines.n0.b a = null;

        static {
                kotlinx.coroutines.n0$b r0 = new kotlinx.coroutines.n0$b
                r0.<init>()
                kotlinx.coroutines.n0.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.n0$b r0 = kotlinx.coroutines.n0.b.a
            kotlinx.coroutines.n0.r0 = r0
            return
    }

    void s(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2);
}
