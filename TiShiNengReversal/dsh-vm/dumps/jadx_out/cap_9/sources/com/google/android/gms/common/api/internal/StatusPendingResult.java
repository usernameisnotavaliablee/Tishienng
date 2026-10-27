package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class StatusPendingResult extends com.google.android.gms.common.api.internal.BasePendingResult<com.google.android.gms.common.api.Status> {
    @java.lang.Deprecated
    public StatusPendingResult(@androidx.annotation.NonNull android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public StatusPendingResult(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @androidx.annotation.NonNull
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status createFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }
}
