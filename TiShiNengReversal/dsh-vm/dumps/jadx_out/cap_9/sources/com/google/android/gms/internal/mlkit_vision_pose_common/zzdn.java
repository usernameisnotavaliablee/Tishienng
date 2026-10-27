package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdn implements java.util.Map.Entry {
    com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zza;
    com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zzb;
    com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zzc;
    com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zzd;
    com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zze;
    final java.lang.Object zzf;
    final boolean zzg;
    java.lang.Object zzh;
    int zzi;

    zzdn(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzf = r0
            r1.zzg = r2
            r1.zze = r1
            r1.zzd = r1
            return
    }

    zzdn(boolean r1, com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2, java.lang.Object r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r4, com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzf = r3
            r0.zzg = r1
            r1 = 1
            r0.zzi = r1
            r0.zzd = r4
            r0.zze = r5
            r5.zzd = r0
            r4.zze = r0
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L34
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.zzf
            if (r0 != 0) goto L12
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L34
            goto L1c
        L12:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L34
        L1c:
            java.lang.Object r0 = r3.zzh
            if (r0 != 0) goto L27
            java.lang.Object r4 = r4.getValue()
            if (r4 != 0) goto L34
            goto L32
        L27:
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L32
            goto L34
        L32:
            r4 = 1
            return r4
        L34:
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.zzf
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.zzh
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.zzf
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            java.lang.Object r2 = r3.zzh
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto Lf
            boolean r0 = r1.zzg
            if (r0 == 0) goto L7
            goto Lf
        L7:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "value == null"
            r2.<init>(r0)
            throw r2
        Lf:
            java.lang.Object r0 = r1.zzh
            r1.zzh = r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.zzf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r3.zzh
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
