package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ExecutorSelector {
    private final com.google.firebase.inject.Provider zza;

    public ExecutorSelector(@androidx.annotation.NonNull com.google.firebase.inject.Provider r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.concurrent.Executor getExecutorToUse(@androidx.annotation.Nullable java.util.concurrent.Executor r1) {
            r0 = this;
            if (r1 == 0) goto L3
            return r1
        L3:
            com.google.firebase.inject.Provider r1 = r0.zza
            java.lang.Object r1 = r1.get()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            return r1
    }
}
