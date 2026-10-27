package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SavedStateHandleAttacher implements androidx.lifecycle.LifecycleEventObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(@org.jetbrains.annotations.NotNull androidx.lifecycle.SavedStateHandlesProvider r2) {
            r1 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.provider = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            if (r3 != r0) goto L1b
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
            androidx.lifecycle.SavedStateHandlesProvider r2 = r1.provider
            r2.performRestore()
            return
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Next event must be ON_CREATE, it was "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }
}
