package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class zzj extends com.google.android.gms.internal.mlkit_vision_common.zzk {
    java.lang.Object[] zza;
    int zzb;
    boolean zzc;

    zzj(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    private final void zzb(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.zza
            int r1 = r0.length
            r2 = 0
            if (r1 >= r5) goto L23
            int r3 = r1 >> 1
            int r1 = r1 + r3
            int r1 = r1 + 1
            if (r1 >= r5) goto L15
            int r5 = r5 + (-1)
            int r5 = java.lang.Integer.highestOneBit(r5)
            int r1 = r5 + r5
        L15:
            if (r1 >= 0) goto L1a
            r1 = 2147483647(0x7fffffff, float:NaN)
        L1a:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r1)
            r4.zza = r5
            r4.zzc = r2
            return
        L23:
            boolean r5 = r4.zzc
            if (r5 == 0) goto L31
            java.lang.Object r5 = r0.clone()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r4.zza = r5
            r4.zzc = r2
        L31:
            return
    }

    public final com.google.android.gms.internal.mlkit_vision_common.zzj zza(java.lang.Object r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.zzb
            int r0 = r0 + 1
            r3.zzb(r0)
            java.lang.Object[] r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r1 + 1
            r3.zzb = r2
            r0[r1] = r4
            return r3
    }
}
