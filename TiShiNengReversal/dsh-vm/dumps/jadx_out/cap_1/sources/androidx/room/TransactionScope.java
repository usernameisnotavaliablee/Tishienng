package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface TransactionScope<T> extends androidx.room.PooledConnection {
    @org.jetbrains.annotations.Nullable
    java.lang.Object rollback(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2);

    @org.jetbrains.annotations.Nullable
    <R> java.lang.Object withNestedTransaction(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2);
}
