package com.google.android.gms.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface LifecycleDelegate {
    @com.google.android.gms.common.annotation.KeepForSdk
    void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, @androidx.annotation.Nullable android.os.Bundle r3);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onDestroy();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onDestroyView();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onInflate(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.Nullable android.os.Bundle r3);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onLowMemory();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onPause();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onResume();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onStart();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onStop();
}
