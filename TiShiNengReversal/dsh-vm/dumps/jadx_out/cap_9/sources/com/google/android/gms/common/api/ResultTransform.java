package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result> {
    public ResultTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.PendingResult<S> createFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zacp r0 = new com.google.android.gms.common.api.internal.zacp
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.common.api.Status onFailure(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public abstract com.google.android.gms.common.api.PendingResult<S> onSuccess(@androidx.annotation.NonNull R r1);
}
