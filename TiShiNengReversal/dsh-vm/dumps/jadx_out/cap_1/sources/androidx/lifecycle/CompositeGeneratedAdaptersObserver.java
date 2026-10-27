package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CompositeGeneratedAdaptersObserver implements androidx.lifecycle.LifecycleEventObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.GeneratedAdapter[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(@org.jetbrains.annotations.NotNull androidx.lifecycle.GeneratedAdapter[] r2) {
            r1 = this;
            java.lang.String r0 = "generatedAdapters"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.generatedAdapters = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r7, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r8) {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.lifecycle.MethodCallsLogger r0 = new androidx.lifecycle.MethodCallsLogger
            r0.<init>()
            androidx.lifecycle.GeneratedAdapter[] r1 = r6.generatedAdapters
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L14:
            if (r4 >= r2) goto L1e
            r5 = r1[r4]
            r5.callMethods(r7, r8, r3, r0)
            int r4 = r4 + 1
            goto L14
        L1e:
            androidx.lifecycle.GeneratedAdapter[] r1 = r6.generatedAdapters
            int r2 = r1.length
        L21:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]
            r5 = 1
            r4.callMethods(r7, r8, r5, r0)
            int r3 = r3 + 1
            goto L21
        L2c:
            return
    }
}
