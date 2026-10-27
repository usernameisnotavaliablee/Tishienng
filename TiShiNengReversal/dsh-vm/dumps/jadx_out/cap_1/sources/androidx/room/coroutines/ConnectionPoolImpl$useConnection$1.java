package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", i = {2, 2, 2, 2, 2, 2, 3, 3}, l = {116, 120, 138, 143}, m = "useConnection", n = {"this", "block", "pool", "connection", "currentContext", "isReadOnly", "pool", "connection"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ConnectionPoolImpl$useConnection$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.room.coroutines.ConnectionPoolImpl this$0;

    ConnectionPoolImpl$useConnection$1(androidx.room.coroutines.ConnectionPoolImpl r1, kotlin.coroutines.e<? super androidx.room.coroutines.ConnectionPoolImpl$useConnection$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r2 = this;
            r2.result = r3
            int r3 = r2.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 | r0
            r2.label = r3
            androidx.room.coroutines.ConnectionPoolImpl r3 = r2.this$0
            r0 = 0
            r1 = 0
            java.lang.Object r3 = r3.useConnection(r0, r1, r2)
            return r3
    }
}
