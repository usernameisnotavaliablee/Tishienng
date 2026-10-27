package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ActivityLifecycleObserver {
    public ActivityLifecycleObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(@androidx.annotation.NonNull android.app.Activity r1) {
            com.google.android.gms.common.api.internal.zab r0 = new com.google.android.gms.common.api.internal.zab
            com.google.android.gms.common.api.internal.zaa r1 = com.google.android.gms.common.api.internal.zaa.zaa(r1)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(@androidx.annotation.NonNull java.lang.Runnable r1);
}
