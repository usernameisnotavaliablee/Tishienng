package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ReflectiveGenericLifecycleObserver implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.ClassesInfoCache.CallbackInfo mInfo;
    private final java.lang.Object mWrapped;

    ReflectiveGenericLifecycleObserver(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r1.mWrapped = r2
            androidx.lifecycle.ClassesInfoCache r0 = androidx.lifecycle.ClassesInfoCache.sInstance
            java.lang.Class r2 = r2.getClass()
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r2 = r0.getInfo(r2)
            r1.mInfo = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r3, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r0 = r2.mInfo
            java.lang.Object r1 = r2.mWrapped
            r0.invokeCallbacks(r3, r4, r1)
            return
    }
}
