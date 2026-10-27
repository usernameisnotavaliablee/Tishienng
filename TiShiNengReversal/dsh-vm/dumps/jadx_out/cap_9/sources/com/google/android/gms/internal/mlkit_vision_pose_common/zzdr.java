package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdr extends com.google.android.gms.internal.mlkit_vision_pose_common.zzde {
    zzdr() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final com.google.android.gms.internal.mlkit_vision_pose_common.zzcv zzd(com.google.android.gms.internal.mlkit_vision_pose_common.zzdu r2, int r3) throws java.io.IOException {
            int r0 = r3 + (-1)
            r1 = 5
            if (r0 == r1) goto L42
            r1 = 6
            if (r0 == r1) goto L33
            r1 = 7
            if (r0 == r1) goto L25
            r1 = 8
            if (r0 != r1) goto L15
            r2.zzj()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcx r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzcx.zza
            return r2
        L15:
            java.lang.String r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdv.zza(r3)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected token: "
            java.lang.String r2 = r0.concat(r2)
            r3.<init>(r2)
            throw r3
        L25:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdb
            boolean r2 = r2.zzm()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.<init>(r2)
            return r3
        L33:
            java.lang.String r2 = r2.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdg r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdg
            r0.<init>(r2)
            r3.<init>(r0)
            return r3
        L42:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdb
            java.lang.String r2 = r2.zze()
            r3.<init>(r2)
            return r3
    }

    private static final com.google.android.gms.internal.mlkit_vision_pose_common.zzcv zze(com.google.android.gms.internal.mlkit_vision_pose_common.zzdu r1, int r2) throws java.io.IOException {
            int r2 = r2 + (-1)
            if (r2 == 0) goto L12
            r0 = 2
            if (r2 == r0) goto L9
            r1 = 0
            return r1
        L9:
            r1.zzg()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzcy
            r1.<init>()
            return r1
        L12:
            r1.zzf()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcu r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzcu
            r1.<init>()
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzde
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzdu r7) throws java.io.IOException {
            r6 = this;
            int r0 = r7.zzn()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r1 = zze(r7, r0)
            if (r1 != 0) goto Lf
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r7 = zzd(r7, r0)
            return r7
        Lf:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
        L14:
            boolean r2 = r7.zzl()
            if (r2 == 0) goto L4c
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcy
            if (r2 == 0) goto L23
            java.lang.String r2 = r7.zzd()
            goto L24
        L23:
            r2 = 0
        L24:
            int r3 = r7.zzn()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r4 = zze(r7, r3)
            if (r4 != 0) goto L33
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r3 = zzd(r7, r3)
            goto L34
        L33:
            r3 = r4
        L34:
            boolean r5 = r1 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcu
            if (r5 == 0) goto L3f
            r2 = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcu r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcu) r2
            r2.zza(r3)
            goto L45
        L3f:
            r5 = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r5 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcy) r5
            r5.zze(r2, r3)
        L45:
            if (r4 == 0) goto L14
            r0.addLast(r1)
            r1 = r3
            goto L14
        L4c:
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcu
            if (r2 == 0) goto L54
            r7.zzh()
            goto L57
        L54:
            r7.zzi()
        L57:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L64
            java.lang.Object r1 = r0.removeLast()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r1 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcv) r1
            goto L14
        L64:
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzde
    public final /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.mlkit_vision_pose_common.zzdw r1, java.lang.Object r2) throws java.io.IOException {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcv) r2
            r0.zzc(r1, r2)
            return
    }

    public final void zzc(com.google.android.gms.internal.mlkit_vision_pose_common.zzdw r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r4) throws java.io.IOException {
            r2 = this;
            if (r4 == 0) goto L9d
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcx
            if (r0 == 0) goto L8
            goto L9d
        L8:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzdb
            if (r0 == 0) goto L32
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r4 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzdb) r4
            boolean r0 = r4.zzj()
            if (r0 == 0) goto L1c
            java.lang.Number r4 = r4.zzd()
            r3.zzg(r4)
            return
        L1c:
            boolean r0 = r4.zzi()
            if (r0 == 0) goto L2a
            boolean r4 = r4.zzh()
            r3.zzi(r4)
            return
        L2a:
            java.lang.String r4 = r4.zze()
            r3.zzh(r4)
            return
        L32:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcu
            if (r0 == 0) goto L53
            r3.zza()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcu r4 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcu) r4
            java.util.Iterator r4 = r4.iterator()
        L3f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcv) r0
            r2.zzc(r3, r0)
            goto L3f
        L4f:
            r3.zzc()
            return
        L53:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcy
            if (r0 == 0) goto L89
            r3.zzb()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r4 = r4.zzb()
            java.util.Set r4 = r4.zzd()
            java.util.Iterator r4 = r4.iterator()
        L66:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.zze(r1)
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcv) r0
            r2.zzc(r3, r0)
            goto L66
        L85:
            r3.zzd()
            return
        L89:
            java.lang.Class r3 = r4.getClass()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Couldn't write "
            java.lang.String r3 = r0.concat(r3)
            r4.<init>(r3)
            throw r4
        L9d:
            r3.zzf()
            return
    }
}
