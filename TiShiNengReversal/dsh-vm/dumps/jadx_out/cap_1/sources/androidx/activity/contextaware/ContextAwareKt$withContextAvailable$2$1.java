package androidx.activity.contextaware;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1\n*L\n1#1,94:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ContextAwareKt$withContextAvailable$2$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
    final /* synthetic */ androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 $listener;
    final /* synthetic */ androidx.activity.contextaware.ContextAware $this_withContextAvailable;

    public ContextAwareKt$withContextAvailable$2$1(androidx.activity.contextaware.ContextAware r1, androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r2) {
            r0 = this;
            r0.$this_withContextAvailable = r1
            r0.$listener = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.invoke(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public final void invoke(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            androidx.activity.contextaware.ContextAware r2 = r1.$this_withContextAvailable
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r0 = r1.$listener
            r2.removeOnContextAvailableListener(r0)
            return
    }
}
