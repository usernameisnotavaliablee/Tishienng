package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzgh implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_common.zzgh zza = null;
    private static final com.google.firebase.encoders.FieldDescriptor zzb = null;
    private static final com.google.firebase.encoders.FieldDescriptor zzc = null;
    private static final com.google.firebase.encoders.FieldDescriptor zzd = null;

    static {
            com.google.android.gms.internal.mlkit_common.zzgh r0 = new com.google.android.gms.internal.mlkit_common.zzgh
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzgh.zza = r0
            java.lang.String r0 = "modelType"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.android.gms.internal.mlkit_common.zzay r1 = new com.google.android.gms.internal.mlkit_common.zzay
            r1.<init>()
            r2 = 1
            r1.zza(r2)
            com.google.android.gms.internal.mlkit_common.zzbc r1 = r1.zzb()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.android.gms.internal.mlkit_common.zzgh.zzb = r0
            java.lang.String r0 = "isDownloaded"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.android.gms.internal.mlkit_common.zzay r1 = new com.google.android.gms.internal.mlkit_common.zzay
            r1.<init>()
            r2 = 2
            r1.zza(r2)
            com.google.android.gms.internal.mlkit_common.zzbc r1 = r1.zzb()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.android.gms.internal.mlkit_common.zzgh.zzc = r0
            java.lang.String r0 = "modelName"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.android.gms.internal.mlkit_common.zzay r1 = new com.google.android.gms.internal.mlkit_common.zzay
            r1.<init>()
            r2 = 3
            r1.zza(r2)
            com.google.android.gms.internal.mlkit_common.zzbc r1 = r1.zzb()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.android.gms.internal.mlkit_common.zzgh.zzd = r0
            return
    }

    private zzgh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzmj r3 = (com.google.android.gms.internal.mlkit_common.zzmj) r3
            com.google.firebase.encoders.ObjectEncoderContext r4 = (com.google.firebase.encoders.ObjectEncoderContext) r4
            com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.gms.internal.mlkit_common.zzgh.zzb
            com.google.android.gms.internal.mlkit_common.zzne r1 = r3.zza()
            r4.add(r0, r1)
            com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.gms.internal.mlkit_common.zzgh.zzc
            java.lang.Boolean r3 = r3.zzb()
            r4.add(r0, r3)
            com.google.firebase.encoders.FieldDescriptor r3 = com.google.android.gms.internal.mlkit_common.zzgh.zzd
            r0 = 0
            r4.add(r3, r0)
            return
    }
}
