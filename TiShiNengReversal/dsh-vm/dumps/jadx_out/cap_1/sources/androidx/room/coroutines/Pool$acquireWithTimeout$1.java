package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", i = {0, 0, 0, 0}, l = {209}, m = "acquireWithTimeout-KLykuaI", n = {"this", "onTimeout", "connection", "timeout"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class Pool$acquireWithTimeout$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.room.coroutines.Pool this$0;

    Pool$acquireWithTimeout$1(androidx.room.coroutines.Pool r1, kotlin.coroutines.e<? super androidx.room.coroutines.Pool$acquireWithTimeout$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            r3.result = r4
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r0
            r3.label = r4
            androidx.room.coroutines.Pool r4 = r3.this$0
            r0 = 0
            r2 = 0
            java.lang.Object r4 = r4.m83acquireWithTimeoutKLykuaI(r0, r2, r3)
            return r4
    }
}
