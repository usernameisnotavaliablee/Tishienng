package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzes implements com.google.android.gms.internal.mlkit_acceleration.zzfn {
    private static final com.google.android.gms.internal.mlkit_acceleration.zzey zza = null;
    private final com.google.android.gms.internal.mlkit_acceleration.zzey zzb;

    static {
            com.google.android.gms.internal.mlkit_acceleration.zzeq r0 = new com.google.android.gms.internal.mlkit_acceleration.zzeq
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzes.zza = r0
            return
    }

    public zzes() {
            r5 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzer r0 = new com.google.android.gms.internal.mlkit_acceleration.zzer
            com.google.android.gms.internal.mlkit_acceleration.zzdq r1 = com.google.android.gms.internal.mlkit_acceleration.zzdq.zza()
            java.lang.String r2 = "com.google.protobuf.DescriptorMessageInfoFactory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.String r3 = "getInstance"
            r4 = 0
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r2 = r2.invoke(r4, r4)     // Catch: java.lang.Exception -> L1a
            com.google.android.gms.internal.mlkit_acceleration.zzey r2 = (com.google.android.gms.internal.mlkit_acceleration.zzey) r2     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            com.google.android.gms.internal.mlkit_acceleration.zzey r2 = com.google.android.gms.internal.mlkit_acceleration.zzes.zza
        L1c:
            r3 = 2
            com.google.android.gms.internal.mlkit_acceleration.zzey[] r3 = new com.google.android.gms.internal.mlkit_acceleration.zzey[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r0.<init>(r3)
            r5.<init>()
            byte[] r1 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzd
            r5.zzb = r0
            return
    }

    private static boolean zzb(com.google.android.gms.internal.mlkit_acceleration.zzex r1) {
            int r1 = r1.zzc()
            int r1 = r1 + (-1)
            r0 = 1
            if (r1 == r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfn
    public final com.google.android.gms.internal.mlkit_acceleration.zzfm zza(java.lang.Class r9) {
            r8 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfo.zzr(r9)
            com.google.android.gms.internal.mlkit_acceleration.zzey r0 = r8.zzb
            com.google.android.gms.internal.mlkit_acceleration.zzex r2 = r0.zzb(r9)
            boolean r0 = r2.zzb()
            java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzdv> r1 = com.google.android.gms.internal.mlkit_acceleration.zzdv.class
            if (r0 == 0) goto L39
            boolean r9 = r1.isAssignableFrom(r9)
            if (r9 == 0) goto L28
            com.google.android.gms.internal.mlkit_acceleration.zzgd r9 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzn()
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = com.google.android.gms.internal.mlkit_acceleration.zzdl.zzb()
            com.google.android.gms.internal.mlkit_acceleration.zzfa r1 = r2.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzfe r9 = com.google.android.gms.internal.mlkit_acceleration.zzfe.zzc(r9, r0, r1)
            return r9
        L28:
            com.google.android.gms.internal.mlkit_acceleration.zzgd r9 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzm()
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = com.google.android.gms.internal.mlkit_acceleration.zzdl.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzfa r1 = r2.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzfe r9 = com.google.android.gms.internal.mlkit_acceleration.zzfe.zzc(r9, r0, r1)
            return r9
        L39:
            boolean r0 = r1.isAssignableFrom(r9)
            if (r0 == 0) goto L76
            boolean r0 = zzb(r2)
            if (r0 == 0) goto L5f
            com.google.android.gms.internal.mlkit_acceleration.zzff r3 = com.google.android.gms.internal.mlkit_acceleration.zzfg.zzb()
            com.google.android.gms.internal.mlkit_acceleration.zzeo r4 = com.google.android.gms.internal.mlkit_acceleration.zzeo.zze()
            com.google.android.gms.internal.mlkit_acceleration.zzgd r5 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzn()
            com.google.android.gms.internal.mlkit_acceleration.zzdj r6 = com.google.android.gms.internal.mlkit_acceleration.zzdl.zzb()
            com.google.android.gms.internal.mlkit_acceleration.zzev r7 = com.google.android.gms.internal.mlkit_acceleration.zzew.zzb()
            r1 = r9
            com.google.android.gms.internal.mlkit_acceleration.zzfd r9 = com.google.android.gms.internal.mlkit_acceleration.zzfd.zzm(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L5f:
            r1 = r9
            com.google.android.gms.internal.mlkit_acceleration.zzff r3 = com.google.android.gms.internal.mlkit_acceleration.zzfg.zzb()
            com.google.android.gms.internal.mlkit_acceleration.zzeo r4 = com.google.android.gms.internal.mlkit_acceleration.zzeo.zze()
            com.google.android.gms.internal.mlkit_acceleration.zzgd r5 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzn()
            r6 = 0
            com.google.android.gms.internal.mlkit_acceleration.zzev r7 = com.google.android.gms.internal.mlkit_acceleration.zzew.zzb()
            com.google.android.gms.internal.mlkit_acceleration.zzfd r9 = com.google.android.gms.internal.mlkit_acceleration.zzfd.zzm(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L76:
            r1 = r9
            boolean r9 = zzb(r2)
            if (r9 == 0) goto L96
            com.google.android.gms.internal.mlkit_acceleration.zzff r3 = com.google.android.gms.internal.mlkit_acceleration.zzfg.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzeo r4 = com.google.android.gms.internal.mlkit_acceleration.zzeo.zzd()
            com.google.android.gms.internal.mlkit_acceleration.zzgd r5 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzm()
            com.google.android.gms.internal.mlkit_acceleration.zzdj r6 = com.google.android.gms.internal.mlkit_acceleration.zzdl.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzev r7 = com.google.android.gms.internal.mlkit_acceleration.zzew.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzfd r9 = com.google.android.gms.internal.mlkit_acceleration.zzfd.zzm(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L96:
            com.google.android.gms.internal.mlkit_acceleration.zzff r3 = com.google.android.gms.internal.mlkit_acceleration.zzfg.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzeo r4 = com.google.android.gms.internal.mlkit_acceleration.zzeo.zzd()
            com.google.android.gms.internal.mlkit_acceleration.zzgd r5 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzm()
            r6 = 0
            com.google.android.gms.internal.mlkit_acceleration.zzev r7 = com.google.android.gms.internal.mlkit_acceleration.zzew.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzfd r9 = com.google.android.gms.internal.mlkit_acceleration.zzfd.zzm(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }
}
