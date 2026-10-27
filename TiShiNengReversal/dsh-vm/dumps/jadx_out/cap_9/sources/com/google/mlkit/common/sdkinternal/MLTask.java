package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.MLTaskInput;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class MLTask<T, S extends com.google.mlkit.common.sdkinternal.MLTaskInput> extends com.google.mlkit.common.sdkinternal.ModelResource {
    public MLTask() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected MLTask(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.TaskQueue r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public abstract T run(@androidx.annotation.NonNull S r1) throws com.google.mlkit.common.MlKitException;
}
