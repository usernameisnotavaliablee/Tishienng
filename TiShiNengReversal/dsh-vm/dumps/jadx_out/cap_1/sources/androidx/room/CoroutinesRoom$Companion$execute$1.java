package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", i = {0}, l = {48, 49}, m = "execute", n = {"callable"}, s = {"L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CoroutinesRoom$Companion$execute$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.room.CoroutinesRoom.Companion this$0;

    CoroutinesRoom$Companion$execute$1(androidx.room.CoroutinesRoom.Companion r1, kotlin.coroutines.e<? super androidx.room.CoroutinesRoom$Companion$execute$1> r2) {
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
            androidx.room.CoroutinesRoom$Companion r3 = r2.this$0
            r0 = 0
            r1 = 0
            java.lang.Object r3 = r3.execute(r0, r1, r0, r2)
            return r3
    }
}
