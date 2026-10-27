package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface ObservableReference<T> {
    void addListener(T r1);

    androidx.databinding.WeakListener<T> getListener();

    void removeListener(T r1);

    void setLifecycleOwner(androidx.lifecycle.LifecycleOwner r1);
}
