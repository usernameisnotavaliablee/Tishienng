package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzni implements com.google.firebase.encoders.ObjectEncoder {
    static final com.google.android.gms.internal.mlkit_vision_pose_common.zzni zza = null;
    private static final com.google.firebase.encoders.FieldDescriptor zzb = null;
    private static final com.google.firebase.encoders.FieldDescriptor zzc = null;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzni r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzni
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzni.zza = r0
            java.lang.String r0 = "result"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzci r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzci
            r1.<init>()
            r2 = 1
            r1.zza(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcm r1 = r1.zzb()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzni.zzb = r0
            java.lang.String r0 = "ok"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzci r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzci
            r1.<init>()
            r2 = 2
            r1.zza(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcm r1 = r1.zzb()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzni.zzc = r0
            return
    }

    private zzni() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvf r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzvf) r2
            com.google.firebase.encoders.ObjectEncoderContext r3 = (com.google.firebase.encoders.ObjectEncoderContext) r3
            com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzni.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r2 = r2.zza()
            r3.add(r0, r2)
            com.google.firebase.encoders.FieldDescriptor r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzni.zzc
            r0 = 0
            r3.add(r2, r0)
            return
    }
}
