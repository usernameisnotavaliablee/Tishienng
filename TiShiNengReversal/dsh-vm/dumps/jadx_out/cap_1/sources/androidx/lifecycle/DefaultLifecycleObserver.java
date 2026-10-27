package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface DefaultLifecycleObserver extends androidx.lifecycle.LifecycleObserver {
    void onCreate(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1);

    void onDestroy(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1);

    void onPause(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1);

    void onResume(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1);

    void onStart(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1);

    void onStop(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1);
}
