package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzu extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh {
    private java.lang.Object[] zza;
    private int zzb;

    zzu() {
            r1 = this;
            r1.<init>()
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
            return
    }

    private final int zzh(com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.zzb
            if (r0 >= r1) goto L15
            java.lang.Object[] r1 = r3.zza
            int r2 = r0 + r0
            r1 = r1[r2]
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L12
            return r0
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r4 = -1
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Metadata{"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r3.zzb
            if (r1 >= r2) goto L27
            java.lang.String r2 = " '"
            r0.append(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2 = r3.zzb(r1)
            r0.append(r2)
            java.lang.String r2 = "': "
            r0.append(r2)
            java.lang.Object r2 = r3.zzd(r1)
            r0.append(r2)
            int r1 = r1 + 1
            goto L8
        L27:
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh
    public final int zza() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzai zzb(int r2) {
            r1 = this;
            int r0 = r1.zzb
            if (r2 >= r0) goto Lc
            java.lang.Object[] r0 = r1.zza
            int r2 = r2 + r2
            r2 = r0[r2]
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzai) r2
            return r2
        Lc:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final java.lang.Object zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r3) {
            r2 = this;
            int r0 = r2.zzh(r3)
            r1 = -1
            if (r0 == r1) goto L13
            java.lang.Object[] r1 = r2.zza
            int r0 = r0 + r0
            int r0 = r0 + 1
            r0 = r1[r0]
            java.lang.Object r3 = r3.zze(r0)
            return r3
        L13:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh
    public final java.lang.Object zzd(int r2) {
            r1 = this;
            int r0 = r1.zzb
            if (r2 >= r0) goto Lc
            java.lang.Object[] r0 = r1.zza
            int r2 = r2 + r2
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
        Lc:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    final void zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = r5.zzi()
            java.lang.String r1 = "metadata value"
            if (r0 != 0) goto L1b
            int r0 = r4.zzh(r5)
            r2 = -1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.Object[] r5 = r4.zza
            int r0 = r0 + r0
            int r0 = r0 + 1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r6, r1)
            r5[r0] = r6
            return
        L1b:
            int r0 = r4.zzb
            int r0 = r0 + 1
            java.lang.Object[] r2 = r4.zza
            int r3 = r2.length
            int r0 = r0 + r0
            if (r0 <= r3) goto L2c
            int r3 = r3 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            r4.zza = r0
        L2c:
            java.lang.Object[] r0 = r4.zza
            int r2 = r4.zzb
            int r2 = r2 + r2
            java.lang.String r3 = "metadata key"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r5, r3)
            r0[r2] = r5
            java.lang.Object[] r5 = r4.zza
            int r0 = r4.zzb
            int r0 = r0 + r0
            int r0 = r0 + 1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r6, r1)
            r5[r0] = r6
            int r5 = r4.zzb
            int r5 = r5 + 1
            r4.zzb = r5
            return
    }

    final void zzf(com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r6) {
            r5 = this;
            int r0 = r5.zzh(r6)
            if (r0 < 0) goto L3c
            int r0 = r0 + r0
            int r1 = r0 + 2
        L9:
            int r2 = r5.zzb
            int r3 = r2 + r2
            if (r1 >= r3) goto L2a
            java.lang.Object[] r2 = r5.zza
            r2 = r2[r1]
            boolean r3 = r2.equals(r6)
            if (r3 != 0) goto L27
            java.lang.Object[] r3 = r5.zza
            r3[r0] = r2
            int r2 = r0 + 1
            int r4 = r1 + 1
            r4 = r3[r4]
            r3[r2] = r4
            int r0 = r0 + 2
        L27:
            int r1 = r1 + 2
            goto L9
        L2a:
            int r6 = r1 - r0
            int r6 = r6 >> 1
            int r2 = r2 - r6
            r5.zzb = r2
        L31:
            if (r0 >= r1) goto L3c
            java.lang.Object[] r6 = r5.zza
            int r2 = r0 + 1
            r3 = 0
            r6[r0] = r3
            r0 = r2
            goto L31
        L3c:
            return
    }
}
