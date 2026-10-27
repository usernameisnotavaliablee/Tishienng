package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {342}, m = "stopTrackingTable", n = {"connection", "tableName"}, s = {"L$0", "L$1"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class TriggerBasedInvalidationTracker$stopTrackingTable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker this$0;

    TriggerBasedInvalidationTracker$stopTrackingTable$1(androidx.room.TriggerBasedInvalidationTracker r1, kotlin.coroutines.e<? super androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1> r2) {
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
            androidx.room.TriggerBasedInvalidationTracker r3 = r2.this$0
            r0 = 0
            r1 = 0
            java.lang.Object r3 = androidx.room.TriggerBasedInvalidationTracker.access$stopTrackingTable(r3, r0, r1, r2)
            return r3
    }
}
