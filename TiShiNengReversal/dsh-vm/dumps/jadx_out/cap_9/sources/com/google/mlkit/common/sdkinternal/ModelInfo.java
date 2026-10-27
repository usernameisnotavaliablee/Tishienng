package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ModelInfo {
    private final java.lang.String zza;
    private final android.net.Uri zzb;
    private final java.lang.String zzc;
    private final com.google.mlkit.common.sdkinternal.ModelType zzd;

    @com.google.android.gms.common.annotation.KeepForSdk
    public ModelInfo(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getModelHash() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getModelNameForPersist() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.mlkit.common.sdkinternal.ModelType getModelType() {
            r1 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = r1.zzd
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.net.Uri getModelUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzb
            return r0
    }
}
