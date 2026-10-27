package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface s<T> extends kotlinx.coroutines.flow.x<T>, kotlinx.coroutines.flow.j<T> {
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    void b();

    boolean c(T r1);

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.h0<java.lang.Integer> d();

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);
}
