package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzsk implements com.google.android.gms.internal.mlkit_common.zzry {
    private final com.google.android.gms.internal.mlkit_common.zzmw zza;
    private com.google.android.gms.internal.mlkit_common.zzqt zzb;

    private zzsk(com.google.android.gms.internal.mlkit_common.zzmw r1, int r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzqt r2 = new com.google.android.gms.internal.mlkit_common.zzqt
            r2.<init>()
            r0.zzb = r2
            r0.zza = r1
            com.google.android.gms.internal.mlkit_common.zzsv.zza()
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zzry zzf(com.google.android.gms.internal.mlkit_common.zzmw r2) {
            com.google.android.gms.internal.mlkit_common.zzsk r0 = new com.google.android.gms.internal.mlkit_common.zzsk
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_common.zzry zzg() {
            com.google.android.gms.internal.mlkit_common.zzsk r0 = new com.google.android.gms.internal.mlkit_common.zzsk
            com.google.android.gms.internal.mlkit_common.zzmw r1 = new com.google.android.gms.internal.mlkit_common.zzmw
            r1.<init>()
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zza(com.google.android.gms.internal.mlkit_common.zzmv r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzmw r0 = r1.zza
            r0.zzf(r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zzb(com.google.android.gms.internal.mlkit_common.zznc r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzmw r0 = r1.zza
            r0.zzi(r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zzc(com.google.android.gms.internal.mlkit_common.zzqt r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final java.lang.String zzd() {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzmw r0 = r2.zza
            com.google.android.gms.internal.mlkit_common.zzmy r0 = r0.zzk()
            com.google.android.gms.internal.mlkit_common.zzqv r0 = r0.zzf()
            if (r0 == 0) goto L24
            java.lang.String r1 = r0.zzk()
            if (r1 == 0) goto L24
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L19
            goto L24
        L19:
            java.lang.String r0 = r0.zzk()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L24:
            java.lang.String r0 = "NA"
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final byte[] zze(int r3, boolean r4) {
            r2 = this;
            r4 = r3 ^ 1
            com.google.android.gms.internal.mlkit_common.zzqt r0 = r2.zzb
            r1 = 1
            if (r1 == r4) goto L9
            r4 = 0
            goto La
        L9:
            r4 = 1
        La:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.zzf(r4)
            com.google.android.gms.internal.mlkit_common.zzqt r4 = r2.zzb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.zze(r0)
            com.google.android.gms.internal.mlkit_common.zzqt r4 = r2.zzb
            com.google.android.gms.internal.mlkit_common.zzqv r4 = r4.zzm()
            com.google.android.gms.internal.mlkit_common.zzmw r0 = r2.zza
            r0.zzj(r4)
            com.google.android.gms.internal.mlkit_common.zzsv.zza()     // Catch: java.io.UnsupportedEncodingException -> L4c
            if (r3 != 0) goto L4e
            com.google.android.gms.internal.mlkit_common.zzmw r3 = r2.zza     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.android.gms.internal.mlkit_common.zzmy r3 = r3.zzk()     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r4 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder     // Catch: java.io.UnsupportedEncodingException -> L4c
            r4.<init>()     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.firebase.encoders.config.Configurator r0 = com.google.android.gms.internal.mlkit_common.zzkr.zza     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r4 = r4.configureWith(r0)     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r4 = r4.ignoreNullValues(r1)     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.firebase.encoders.DataEncoder r4 = r4.build()     // Catch: java.io.UnsupportedEncodingException -> L4c
            java.lang.String r3 = r4.encode(r3)     // Catch: java.io.UnsupportedEncodingException -> L4c
            java.lang.String r4 = "utf-8"
            byte[] r3 = r3.getBytes(r4)     // Catch: java.io.UnsupportedEncodingException -> L4c
            return r3
        L4c:
            r3 = move-exception
            goto L67
        L4e:
            com.google.android.gms.internal.mlkit_common.zzmw r3 = r2.zza     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.android.gms.internal.mlkit_common.zzmy r3 = r3.zzk()     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.android.gms.internal.mlkit_common.zzbg r4 = new com.google.android.gms.internal.mlkit_common.zzbg     // Catch: java.io.UnsupportedEncodingException -> L4c
            r4.<init>()     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.firebase.encoders.config.Configurator r0 = com.google.android.gms.internal.mlkit_common.zzkr.zza     // Catch: java.io.UnsupportedEncodingException -> L4c
            r0.configure(r4)     // Catch: java.io.UnsupportedEncodingException -> L4c
            com.google.android.gms.internal.mlkit_common.zzbh r4 = r4.zza()     // Catch: java.io.UnsupportedEncodingException -> L4c
            byte[] r3 = r4.zza(r3)     // Catch: java.io.UnsupportedEncodingException -> L4c
            return r3
        L67:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Failed to covert logging to UTF-8 byte array"
            r4.<init>(r0, r3)
            throw r4
    }
}
