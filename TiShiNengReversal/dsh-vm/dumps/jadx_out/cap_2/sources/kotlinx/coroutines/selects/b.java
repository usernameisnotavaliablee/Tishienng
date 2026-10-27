package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static final <R> void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.c<? super R> r1, long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.selects.a r0 = new kotlinx.coroutines.selects.a
            r0.<init>(r2)
            kotlinx.coroutines.selects.e r2 = r0.b()
            r1.a(r2, r4)
            return
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static final <R> void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.c<? super R> r0, long r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            long r1 = kotlinx.coroutines.a1.e(r1)
            a(r0, r1, r3)
            return
    }
}
