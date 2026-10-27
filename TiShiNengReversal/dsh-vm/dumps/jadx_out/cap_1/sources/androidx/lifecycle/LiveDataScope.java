package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface LiveDataScope<T> {
    @org.jetbrains.annotations.Nullable
    java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @org.jetbrains.annotations.Nullable
    java.lang.Object emitSource(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.j1> r2);

    @org.jetbrains.annotations.Nullable
    T getLatestValue();
}
