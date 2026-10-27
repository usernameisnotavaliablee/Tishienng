package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class StatusCallback extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {

    @com.google.android.gms.common.annotation.KeepForSdk
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder;

    @com.google.android.gms.common.annotation.KeepForSdk
    public StatusCallback(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> r1) {
            r0 = this;
            r0.<init>()
            r0.resultHolder = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @com.google.android.gms.common.annotation.KeepForSdk
    public void onResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.common.api.Status> r0 = r1.resultHolder
            r0.setResult(r2)
            return
    }
}
