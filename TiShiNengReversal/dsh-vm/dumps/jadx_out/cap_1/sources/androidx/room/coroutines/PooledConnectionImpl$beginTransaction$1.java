package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {562}, m = "beginTransaction", n = {"this", "type", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PooledConnectionImpl$beginTransaction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl this$0;

    PooledConnectionImpl$beginTransaction$1(androidx.room.coroutines.PooledConnectionImpl r1, kotlin.coroutines.e<? super androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            androidx.room.coroutines.PooledConnectionImpl r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = androidx.room.coroutines.PooledConnectionImpl.access$beginTransaction(r2, r0, r1)
            return r2
    }
}
