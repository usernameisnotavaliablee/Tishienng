package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzch implements com.google.android.gms.internal.mlkit_vision_pose_common.zzcm {
    private final int zza;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzcl zzb;

    zzch(int r1, com.google.android.gms.internal.mlkit_vision_pose_common.zzcl r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzcm> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzcm.class
            return r0
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcm
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcm r5 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcm) r5
            int r1 = r4.zza
            int r3 = r5.zza()
            if (r1 != r3) goto L21
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcl r1 = r4.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcl r5 = r5.zzb()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcl r0 = r3.zzb
            int r0 = r0.hashCode()
            r1 = 2041407134(0x79ad669e, float:1.12543585E35)
            r0 = r0 ^ r1
            int r1 = r3.zza
            r2 = 14552422(0xde0d66, float:2.0392287E-38)
            r1 = r1 ^ r2
            int r1 = r1 + r0
            return r1
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@com.google.firebase.encoders.proto.Protobuf"
            r0.<init>(r1)
            java.lang.String r1 = "(tag="
            r0.append(r1)
            int r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = "intEncoding="
            r0.append(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcl r1 = r2.zzb
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzcm
    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzcm
    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzcl zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcl r0 = r1.zzb
            return r0
    }
}
