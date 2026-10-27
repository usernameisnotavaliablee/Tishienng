package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ResolvingResultCallbacks<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.ResultCallbacks<R> {
    private final android.app.Activity zza;
    private final int zzb;

    protected ResolvingResultCallbacks(@androidx.annotation.NonNull android.app.Activity r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Activity must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void onFailure(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r3) {
            r2 = this;
            boolean r0 = r3.hasResolution()
            if (r0 == 0) goto L19
            android.app.Activity r0 = r2.zza     // Catch: android.content.IntentSender.SendIntentException -> Le
            int r1 = r2.zzb     // Catch: android.content.IntentSender.SendIntentException -> Le
            r3.startResolutionForResult(r0, r1)     // Catch: android.content.IntentSender.SendIntentException -> Le
            return
        Le:
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r0 = 8
            r3.<init>(r0)
            r2.onUnresolvableFailure(r3)
            return
        L19:
            r2.onUnresolvableFailure(r3)
            return
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public abstract void onSuccess(@androidx.annotation.NonNull R r1);

    public abstract void onUnresolvableFailure(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1);
}
