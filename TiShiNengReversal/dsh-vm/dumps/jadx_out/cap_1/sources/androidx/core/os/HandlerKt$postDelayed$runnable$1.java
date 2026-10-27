package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n*L\n1#1,69:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class HandlerKt$postDelayed$runnable$1 implements java.lang.Runnable {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> $action;

    public HandlerKt$postDelayed$runnable$1(kotlin.jvm.functions.Function0<kotlin.n1> r1) {
            r0 = this;
            r0.$action = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.$action
            r0.invoke()
            return
    }
}
