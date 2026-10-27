package com.google.android.gms.internal.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzt extends com.google.android.gms.internal.common.zzw {
    final /* synthetic */ com.google.android.gms.internal.common.zzu zza;

    zzt(com.google.android.gms.internal.common.zzu r1, com.google.android.gms.internal.common.zzx r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzc(int r1) {
            r0 = this;
            int r1 = r1 + 1
            return r1
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzd(int r5) {
            r4 = this;
            java.lang.CharSequence r0 = r4.zzb
            int r1 = r0.length()
            java.lang.String r2 = "index"
            com.google.android.gms.internal.common.zzs.zzb(r5, r1, r2)
        Lb:
            if (r5 >= r1) goto L1f
            com.google.android.gms.internal.common.zzu r2 = r4.zza
            char r3 = r0.charAt(r5)
            com.google.android.gms.internal.common.zzo r2 = r2.zza
            boolean r2 = r2.zza(r3)
            if (r2 == 0) goto L1c
            return r5
        L1c:
            int r5 = r5 + 1
            goto Lb
        L1f:
            r5 = -1
            return r5
    }
}
