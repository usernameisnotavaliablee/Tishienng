package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbi implements com.google.firebase.encoders.ValueEncoderContext {
    private boolean zza;
    private boolean zzb;
    private com.google.firebase.encoders.FieldDescriptor zzc;
    private final com.google.android.gms.internal.mlkit_common.zzbe zzd;

    zzbi(com.google.android.gms.internal.mlkit_common.zzbe r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzd = r2
            return
    }

    private final void zzb() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 != 0) goto L8
            r0 = 1
            r2.zza = r0
            return
        L8:
            com.google.firebase.encoders.EncodingException r0 = new com.google.firebase.encoders.EncodingException
            java.lang.String r1 = "Cannot encode a second value in the ValueEncoderContext"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ValueEncoderContext add(double r4) throws java.io.IOException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_common.zzbe r0 = r3.zzd
            com.google.firebase.encoders.FieldDescriptor r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zza(r1, r4, r2)
            return r3
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ValueEncoderContext add(float r4) throws java.io.IOException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_common.zzbe r0 = r3.zzd
            com.google.firebase.encoders.FieldDescriptor r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzb(r1, r4, r2)
            return r3
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ValueEncoderContext add(int r4) throws java.io.IOException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_common.zzbe r0 = r3.zzd
            com.google.firebase.encoders.FieldDescriptor r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzd(r1, r4, r2)
            return r3
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ValueEncoderContext add(long r4) throws java.io.IOException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_common.zzbe r0 = r3.zzd
            com.google.firebase.encoders.FieldDescriptor r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zze(r1, r4, r2)
            return r3
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ValueEncoderContext add(@androidx.annotation.Nullable java.lang.String r4) throws java.io.IOException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_common.zzbe r0 = r3.zzd
            com.google.firebase.encoders.FieldDescriptor r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzc(r1, r4, r2)
            return r3
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ValueEncoderContext add(boolean r4) throws java.io.IOException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_common.zzbe r0 = r3.zzd
            com.google.firebase.encoders.FieldDescriptor r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzd(r1, r4, r2)
            return r3
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ValueEncoderContext add(@androidx.annotation.NonNull byte[] r4) throws java.io.IOException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_common.zzbe r0 = r3.zzd
            com.google.firebase.encoders.FieldDescriptor r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzc(r1, r4, r2)
            return r3
    }

    final void zza(com.google.firebase.encoders.FieldDescriptor r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.zza = r0
            r1.zzc = r2
            r1.zzb = r3
            return
    }
}
