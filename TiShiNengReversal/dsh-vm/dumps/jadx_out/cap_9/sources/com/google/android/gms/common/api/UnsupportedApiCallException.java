package com.google.android.gms.common.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature zza;

    @com.google.android.gms.common.annotation.KeepForSdk
    public UnsupportedApiCallException(@androidx.annotation.NonNull com.google.android.gms.common.Feature r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.lang.Throwable
    @androidx.annotation.NonNull
    public java.lang.String getMessage() {
            r2 = this;
            com.google.android.gms.common.Feature r0 = r2.zza
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Missing "
            java.lang.String r0 = r1.concat(r0)
            return r0
    }
}
