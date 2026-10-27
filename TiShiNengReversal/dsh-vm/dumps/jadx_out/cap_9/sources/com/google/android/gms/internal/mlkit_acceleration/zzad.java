package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zzad extends com.google.android.gms.internal.mlkit_acceleration.zzi {
    final java.lang.CharSequence zzb;
    final com.google.android.gms.internal.mlkit_acceleration.zzp zzc;
    final boolean zzd;
    int zze;
    int zzf;

    protected zzad(com.google.android.gms.internal.mlkit_acceleration.zzaf r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zze = r0
            com.google.android.gms.internal.mlkit_acceleration.zzp r0 = com.google.android.gms.internal.mlkit_acceleration.zzaf.zza(r2)
            r1.zzc = r0
            boolean r2 = com.google.android.gms.internal.mlkit_acceleration.zzaf.zzh(r2)
            r1.zzd = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.zzf = r2
            r1.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzi
    @javax.annotation.CheckForNull
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r6 = this;
            int r0 = r6.zze
        L2:
            int r1 = r6.zze
            r2 = -1
            if (r1 == r2) goto L8d
            int r1 = r6.zzd(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r6.zzb
            int r1 = r1.length()
            r6.zze = r2
            r3 = -1
            goto L1d
        L17:
            int r3 = r6.zzc(r1)
            r6.zze = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r6.zze = r3
            java.lang.CharSequence r1 = r6.zzb
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r6.zze = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L41
            com.google.android.gms.internal.mlkit_acceleration.zzp r3 = r6.zzc
            java.lang.CharSequence r4 = r6.zzb
            char r4 = r4.charAt(r0)
            boolean r3 = r3.zza(r4)
            if (r3 == 0) goto L41
            int r0 = r0 + 1
            goto L2e
        L41:
            if (r1 <= r0) goto L55
            com.google.android.gms.internal.mlkit_acceleration.zzp r3 = r6.zzc
            java.lang.CharSequence r4 = r6.zzb
            int r5 = r1 + (-1)
            char r4 = r4.charAt(r5)
            boolean r3 = r3.zza(r4)
            if (r3 == 0) goto L55
            r1 = r5
            goto L41
        L55:
            boolean r3 = r6.zzd
            if (r3 == 0) goto L5e
            if (r0 != r1) goto L5e
            int r0 = r6.zze
            goto L2
        L5e:
            int r3 = r6.zzf
            r4 = 1
            if (r3 != r4) goto L7f
            java.lang.CharSequence r1 = r6.zzb
            int r1 = r1.length()
            r6.zze = r2
        L6b:
            if (r1 <= r0) goto L82
            com.google.android.gms.internal.mlkit_acceleration.zzp r2 = r6.zzc
            java.lang.CharSequence r3 = r6.zzb
            int r4 = r1 + (-1)
            char r3 = r3.charAt(r4)
            boolean r2 = r2.zza(r3)
            if (r2 == 0) goto L82
            r1 = r4
            goto L6b
        L7f:
            int r3 = r3 + r2
            r6.zzf = r3
        L82:
            java.lang.CharSequence r2 = r6.zzb
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L8d:
            r6.zzb()
            r0 = 0
            return r0
    }

    abstract int zzc(int r1);

    abstract int zzd(int r1);
}
