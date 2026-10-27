package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzbg implements com.google.firebase.encoders.config.EncoderConfig {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.firebase.encoders.ObjectEncoder zzb = null;
    private final java.util.Map zzc;
    private final java.util.Map zzd;
    private final com.google.firebase.encoders.ObjectEncoder zze;

    static {
            com.google.android.gms.internal.mlkit_common.zzbf r0 = new com.google.android.gms.internal.mlkit_common.zzbf
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzbg.zzb = r0
            return
    }

    public zzbg() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzd = r0
            com.google.firebase.encoders.ObjectEncoder r0 = com.google.android.gms.internal.mlkit_common.zzbg.zzb
            r1.zze = r0
            return
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ com.google.firebase.encoders.config.EncoderConfig registerEncoder(@androidx.annotation.NonNull java.lang.Class r2, @androidx.annotation.NonNull com.google.firebase.encoders.ObjectEncoder r3) {
            r1 = this;
            java.util.Map r0 = r1.zzc
            r0.put(r2, r3)
            java.util.Map r3 = r1.zzd
            r3.remove(r2)
            return r1
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ com.google.firebase.encoders.config.EncoderConfig registerEncoder(@androidx.annotation.NonNull java.lang.Class r2, @androidx.annotation.NonNull com.google.firebase.encoders.ValueEncoder r3) {
            r1 = this;
            java.util.Map r0 = r1.zzd
            r0.put(r2, r3)
            java.util.Map r3 = r1.zzc
            r3.remove(r2)
            return r1
    }

    public final com.google.android.gms.internal.mlkit_common.zzbh zza() {
            r4 = this;
            com.google.android.gms.internal.mlkit_common.zzbh r0 = new com.google.android.gms.internal.mlkit_common.zzbh
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map r2 = r4.zzc
            r1.<init>(r2)
            java.util.HashMap r2 = new java.util.HashMap
            java.util.Map r3 = r4.zzd
            r2.<init>(r3)
            com.google.firebase.encoders.ObjectEncoder r3 = r4.zze
            r0.<init>(r1, r2, r3)
            return r0
    }
}
