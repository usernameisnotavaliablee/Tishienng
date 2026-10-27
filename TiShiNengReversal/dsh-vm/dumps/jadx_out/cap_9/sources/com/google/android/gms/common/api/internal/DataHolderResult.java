package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class DataHolderResult implements com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected final com.google.android.gms.common.api.Status mStatus;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected DataHolderResult(@androidx.annotation.NonNull com.google.android.gms.common.data.DataHolder r3) {
            r2 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            int r1 = r3.getStatusCode()
            r0.<init>(r1)
            r2.<init>(r3, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected DataHolderResult(@androidx.annotation.NonNull com.google.android.gms.common.data.DataHolder r1, @androidx.annotation.NonNull com.google.android.gms.common.api.Status r2) {
            r0 = this;
            r0.<init>()
            r0.mStatus = r2
            r0.mDataHolder = r1
            return
    }

    @Override // com.google.android.gms.common.api.Result
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            return r0
    }

    @Override // com.google.android.gms.common.api.Releasable
    @com.google.android.gms.common.annotation.KeepForSdk
    public void release() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.mDataHolder
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }
}
