package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFlowExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,30:1\n26#2:31\n*S KotlinDebug\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n*L\n17#1:31\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AbortFlowException extends java.util.concurrent.CancellationException {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final transient kotlinx.coroutines.flow.j<?> owner;

    public AbortFlowException(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<?> r2) {
            r1 = this;
            java.lang.String r0 = "Flow was aborted, no more elements needed"
            r1.<init>(r0)
            r1.owner = r2
            return
    }

    @Override // java.lang.Throwable
    @org.jetbrains.annotations.NotNull
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }
}
