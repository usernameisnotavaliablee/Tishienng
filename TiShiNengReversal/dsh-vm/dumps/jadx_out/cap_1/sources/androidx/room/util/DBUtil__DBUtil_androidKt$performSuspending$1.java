package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", i = {1, 1, 1, 1}, l = {249, 251, 251}, m = "performSuspending", n = {"db", "block", "isReadOnly", "inTransaction"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class DBUtil__DBUtil_androidKt$performSuspending$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ java.lang.Object result;

    DBUtil__DBUtil_androidKt$performSuspending$1(kotlin.coroutines.e<? super androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1> r1) {
            r0 = this;
            r0.<init>(r1)
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
            r2 = 0
            r0 = 0
            java.lang.Object r2 = androidx.room.util.DBUtil.performSuspending(r2, r0, r0, r2, r1)
            return r2
    }
}
