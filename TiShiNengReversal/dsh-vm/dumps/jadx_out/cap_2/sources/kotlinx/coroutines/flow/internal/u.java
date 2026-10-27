package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u<T> implements kotlinx.coroutines.flow.j<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.c0<T> a;

    public u(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.c0<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.channels.c0<T> r0 = r1.a
            java.lang.Object r2 = r0.T(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }
}
