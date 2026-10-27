package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlinx.coroutines.InternalCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface u2 extends kotlinx.coroutines.e2 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(kotlinx.coroutines.u2 r0) {
                kotlinx.coroutines.e2.a.a(r0)
                return
        }

        public static <R> R b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.u2 r0, R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2) {
                java.lang.Object r0 = kotlinx.coroutines.e2.a.d(r0, r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public static <E extends kotlin.coroutines.i.b> E c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.u2 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1) {
                kotlin.coroutines.i$b r0 = kotlinx.coroutines.e2.a.e(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.u2 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1) {
                kotlin.coroutines.i r0 = kotlinx.coroutines.e2.a.h(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.u2 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
                kotlin.coroutines.i r0 = kotlinx.coroutines.e2.a.i(r0, r1)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.e2 f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.u2 r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1) {
                kotlinx.coroutines.e2 r0 = kotlinx.coroutines.e2.a.j(r0, r1)
                return r0
        }
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    java.util.concurrent.CancellationException K();
}
