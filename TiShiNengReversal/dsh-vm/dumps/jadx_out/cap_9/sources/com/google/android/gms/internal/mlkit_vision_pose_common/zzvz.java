package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzvz extends com.google.android.gms.internal.mlkit_vision_pose_common.zzwd {
    private final java.lang.String zza;
    private final boolean zzb;
    private final int zzc;

    /* synthetic */ zzvz(java.lang.String r1, boolean r2, int r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzvy r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzwd
            r2 = 0
            if (r1 == 0) goto L28
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r5 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzwd) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L28
            boolean r1 = r4.zzb
            boolean r3 = r5.zzc()
            if (r1 != r3) goto L28
            int r1 = r4.zzc
            int r5 = r5.zza()
            if (r1 != r5) goto L28
            return r0
        L28:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            r2 = 1
            boolean r3 = r4.zzb
            if (r2 == r3) goto L12
            r2 = 1237(0x4d5, float:1.733E-42)
            goto L14
        L12:
            r2 = 1231(0x4cf, float:1.725E-42)
        L14:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r4.zzc
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MLKitLoggingOptions{libraryName="
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", enableFirelog="
            r0.append(r1)
            boolean r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", firelogEventType="
            r0.append(r1)
            int r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzwd
    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzwd
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzwd
    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
