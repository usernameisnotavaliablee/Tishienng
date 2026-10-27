package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzac extends com.google.android.gms.internal.mlkit_common.zzz {
    public zzac() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    public final com.google.android.gms.internal.mlkit_common.zzac zzb(java.lang.Object r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.zzb
            int r0 = r0 + 1
            java.lang.Object[] r1 = r4.zza
            int r2 = r1.length
            r3 = 0
            if (r2 >= r0) goto L1a
            int r0 = com.google.android.gms.internal.mlkit_common.zzaa.zza(r2, r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.zza = r0
            r4.zzc = r3
            goto L28
        L1a:
            boolean r0 = r4.zzc
            if (r0 == 0) goto L28
            java.lang.Object r0 = r1.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4.zza = r0
            r4.zzc = r3
        L28:
            java.lang.Object[] r0 = r4.zza
            int r1 = r4.zzb
            int r2 = r1 + 1
            r4.zzb = r2
            r0[r1] = r5
            return r4
    }

    public final com.google.android.gms.internal.mlkit_common.zzaf zzc() {
            r2 = this;
            r0 = 1
            r2.zzc = r0
            java.lang.Object[] r0 = r2.zza
            int r1 = r2.zzb
            com.google.android.gms.internal.mlkit_common.zzaf r0 = com.google.android.gms.internal.mlkit_common.zzaf.zzg(r0, r1)
            return r0
    }
}
