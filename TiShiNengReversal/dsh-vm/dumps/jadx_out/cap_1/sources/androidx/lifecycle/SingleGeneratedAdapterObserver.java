package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SingleGeneratedAdapterObserver implements androidx.lifecycle.LifecycleEventObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(@org.jetbrains.annotations.NotNull androidx.lifecycle.GeneratedAdapter r2) {
            r1 = this;
            java.lang.String r0 = "generatedAdapter"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.generatedAdapter = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r4, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.lifecycle.GeneratedAdapter r0 = r3.generatedAdapter
            r1 = 0
            r2 = 0
            r0.callMethods(r4, r5, r1, r2)
            androidx.lifecycle.GeneratedAdapter r0 = r3.generatedAdapter
            r1 = 1
            r0.callMethods(r4, r5, r1, r2)
            return
    }
}
