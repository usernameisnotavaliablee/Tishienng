package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface c<R> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static <R, P, Q> void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.c<? super R> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.i<? super P, ? extends Q> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
                r0 = 0
                r1.c(r2, r0, r3)
                return
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @kotlin.ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        @kotlin.internal.LowPriorityInOverloadResolution
        @kotlinx.coroutines.ExperimentalCoroutinesApi
        public static <R> void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.c<? super R> r0, long r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
                kotlinx.coroutines.selects.b.a(r0, r1, r3)
                return
        }
    }

    void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.e r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2);

    <P, Q> void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.i<? super P, ? extends Q> r1, P r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @kotlin.ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @kotlin.internal.LowPriorityInOverloadResolution
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    void d(long r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3);

    <P, Q> void i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.i<? super P, ? extends Q> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2);

    <Q> void k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.g<? extends Q> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2);
}
