package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {64, 94}, m = "execute", n = {"db", "cancellationSignal", "callable", "db", "cancellationSignal", "callable", "context"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CoroutinesRoom$Companion$execute$3<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.room.CoroutinesRoom.Companion this$0;

    CoroutinesRoom$Companion$execute$3(androidx.room.CoroutinesRoom.Companion r1, kotlin.coroutines.e<? super androidx.room.CoroutinesRoom$Companion$execute$3> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            r6 = this;
            r6.result = r7
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.label = r7
            androidx.room.CoroutinesRoom$Companion r0 = r6.this$0
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r5 = r6
            java.lang.Object r7 = r0.execute(r1, r2, r3, r4, r5)
            return r7
    }
}
