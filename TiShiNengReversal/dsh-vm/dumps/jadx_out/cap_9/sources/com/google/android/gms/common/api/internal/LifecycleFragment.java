package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface LifecycleFragment {
    @com.google.android.gms.common.annotation.KeepForSdk
    void addCallback(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.LifecycleCallback r2);

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2);

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    android.app.Activity getLifecycleActivity();

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean isCreated();

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean isStarted();

    @com.google.android.gms.common.annotation.KeepForSdk
    void startActivityForResult(@androidx.annotation.NonNull android.content.Intent r1, int r2);
}
