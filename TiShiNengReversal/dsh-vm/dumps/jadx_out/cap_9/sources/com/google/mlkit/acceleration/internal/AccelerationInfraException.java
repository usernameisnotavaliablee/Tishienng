package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AccelerationInfraException extends java.lang.Exception {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int GET_GPU_INFO_ERROR = 2;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int STORAGE_ACCESS_ERROR = 1;
    private final int zza;
    private final int zzb;

    @androidx.annotation.VisibleForTesting
    public AccelerationInfraException(int r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Acceleration infra failed with error "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r4)
            r2.zza = r3
            r0 = 2
            if (r3 != r0) goto L26
            boolean r3 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zze
            if (r3 == 0) goto L26
            com.google.android.gms.internal.mlkit_acceleration.zze r4 = (com.google.android.gms.internal.mlkit_acceleration.zze) r4
            int r3 = r4.zza()
        L23:
            r2.zzb = r3
            return
        L26:
            r3 = -1
            goto L23
    }

    static com.google.mlkit.acceleration.internal.AccelerationInfraException zza(java.lang.Throwable r2) {
            com.google.mlkit.acceleration.internal.AccelerationInfraException r0 = new com.google.mlkit.acceleration.internal.AccelerationInfraException
            r1 = 2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getErrorCode() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getErrorType() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}
