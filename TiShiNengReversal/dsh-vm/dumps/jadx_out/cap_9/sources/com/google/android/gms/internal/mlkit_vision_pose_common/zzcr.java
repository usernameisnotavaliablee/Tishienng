package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzcr {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final com.google.firebase.encoders.ObjectEncoder zzc;

    zzcr(java.util.Map r1, java.util.Map r2, com.google.firebase.encoders.ObjectEncoder r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @androidx.annotation.NonNull
    public final byte[] zza(@androidx.annotation.NonNull java.lang.Object r6) {
            r5 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzco r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzco     // Catch: java.io.IOException -> L13
            java.util.Map r2 = r5.zza     // Catch: java.io.IOException -> L13
            java.util.Map r3 = r5.zzb     // Catch: java.io.IOException -> L13
            com.google.firebase.encoders.ObjectEncoder r4 = r5.zzc     // Catch: java.io.IOException -> L13
            r1.<init>(r0, r2, r3, r4)     // Catch: java.io.IOException -> L13
            r1.zzf(r6)     // Catch: java.io.IOException -> L13
        L13:
            byte[] r6 = r0.toByteArray()
            return r6
    }
}
