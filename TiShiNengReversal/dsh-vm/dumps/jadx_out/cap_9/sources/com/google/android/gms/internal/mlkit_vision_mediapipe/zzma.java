package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzma implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi {
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw zza;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc zzd;

    private zzma(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            boolean r1 = r3 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn
            r0.zzc = r1
            r0.zzd = r2
            r0.zza = r3
            return
    }

    static com.google.android.gms.internal.mlkit_vision_mediapipe.zzma zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r3) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzma r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzma
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final int zza(java.lang.Object r3) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = r0.zzc
            int r0 = r0.zzb()
            boolean r1 = r2.zzc
            if (r1 == 0) goto L16
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r3 = r3.zzb
            int r3 = r3.zzc()
            int r0 = r0 + r3
        L16:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final int zzb(java.lang.Object r3) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = r0.zzc
            int r0 = r0.hashCode()
            boolean r1 = r2.zzc
            if (r1 == 0) goto L1a
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r3 = r3.zzb
            int r0 = r0 * 53
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r3 = r3.zza
            int r3 = r3.hashCode()
            int r0 = r0 + r3
        L1a:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final java.lang.Object zze() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r2.zza
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r0.zzt()
            return r0
        Ld:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlv r0 = r0.zzJ()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r0.zzl()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final void zzf(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r0 = r1.zzb
            r0.zza(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r0 = r1.zzd
            r0.zza(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final void zzg(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r0 = r1.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzp(r0, r2, r3)
            boolean r0 = r1.zzc
            if (r0 == 0) goto Le
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r0 = r1.zzd
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzo(r0, r2, r3)
        Le:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final void zzh(java.lang.Object r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r14) throws java.io.IOException {
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r1 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzf()
            r0.zzc = r1
        L11:
            r6 = r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r10 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r10
            r10.zzc()
            r10 = 0
            r0 = r10
        L19:
            if (r12 >= r13) goto L98
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r1 = 2
            if (r2 == r12) goto L49
            r12 = r2 & 7
            if (r12 != r1) goto L41
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r12 = r14.zzd
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r9.zza
            int r1 = r2 >>> 3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkp r0 = r12.zzb(r0, r1)
            if (r0 != 0) goto L3e
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzg(r2, r3, r4, r5, r6, r7)
            goto L19
        L3e:
            int r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
            throw r10
        L41:
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzn(r2, r3, r4, r5, r7)
            goto L19
        L49:
            r3 = r11
            r5 = r13
            r7 = r14
            r11 = 0
            r12 = r10
        L4e:
            if (r4 >= r5) goto L8a
            int r13 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r3, r4, r7)
            int r14 = r7.zza
            int r2 = r14 >>> 3
            r4 = r14 & 7
            if (r2 == r1) goto L70
            r8 = 3
            if (r2 == r8) goto L60
            goto L81
        L60:
            if (r0 != 0) goto L6d
            if (r4 != r1) goto L81
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza(r3, r13, r7)
            java.lang.Object r12 = r7.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r12 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r12
            goto L4e
        L6d:
            int r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
            throw r10
        L70:
            if (r4 != 0) goto L81
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r3, r13, r7)
            int r11 = r7.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r13 = r7.zzd
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r14 = r9.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkp r0 = r13.zzb(r14, r11)
            goto L4e
        L81:
            r2 = 12
            if (r14 == r2) goto L8b
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzn(r14, r3, r13, r5, r7)
            goto L4e
        L8a:
            r13 = r4
        L8b:
            if (r12 == 0) goto L93
            int r11 = r11 << 3
            r11 = r11 | r1
            r6.zzj(r11, r12)
        L93:
            r12 = r13
            r11 = r3
            r13 = r5
            r14 = r7
            goto L19
        L98:
            r5 = r13
            if (r12 != r5) goto L9c
            return
        L9c:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r10 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r11 = "Failed to parse the message."
            r10.<init>(r11)
            throw r10
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final void zzi(java.lang.Object r6, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r7) throws java.io.IOException {
            r5 = this;
            r0 = r6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r0 = r0.zzb
            java.util.Iterator r0 = r0.zzg()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r3 = r2.zze()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzni.zzi
            if (r3 != r4) goto L51
            boolean r3 = r2.zzg()
            if (r3 != 0) goto L51
            boolean r3 = r2.zzf()
            if (r3 != 0) goto L51
            boolean r3 = r1 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzle
            if (r3 == 0) goto L45
            int r2 = r2.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzle r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzle) r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg r1 = r1.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r1 = r1.zzb()
            r7.zzw(r2, r1)
            goto L9
        L45:
            int r2 = r2.zza()
            java.lang.Object r1 = r1.getValue()
            r7.zzw(r2, r1)
            goto L9
        L51:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Found invalid MessageSet item."
            r6.<init>(r7)
            throw r6
        L59:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r6 = r6.zzc
            r6.zzk(r7)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final boolean zzj(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = r0.zzc
            r1 = r4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r1 = r1.zzc
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
            r3 = 0
            return r3
        L12:
            boolean r0 = r2.zzc
            if (r0 == 0) goto L23
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r3 = r3.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r4 = r4.zzb
            boolean r3 = r3.equals(r4)
            return r3
        L23:
            r3 = 1
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final boolean zzk(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r1 = r1.zzb
            boolean r1 = r1.zzl()
            return r1
    }
}
