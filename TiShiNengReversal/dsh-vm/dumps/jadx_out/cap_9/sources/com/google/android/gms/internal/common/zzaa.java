package com.google.android.gms.internal.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class zzaa extends com.google.android.gms.internal.common.zzab {
    java.lang.Object[] zza;
    int zzb;
    boolean zzc;

    zzaa(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.android.gms.internal.common.zzaa zza(java.lang.Object r7) {
            r6 = this;
            r7.getClass()
            int r0 = r6.zzb
            int r1 = r0 + 1
            java.lang.Object[] r2 = r6.zza
            int r3 = r2.length
            r4 = 0
            if (r3 >= r1) goto L28
            int r5 = r3 >> 1
            int r3 = r3 + r5
            int r3 = r3 + 1
            if (r3 >= r1) goto L1a
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r3 = r0 + r0
        L1a:
            if (r3 >= 0) goto L1f
            r3 = 2147483647(0x7fffffff, float:NaN)
        L1f:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            r6.zza = r0
            r6.zzc = r4
            goto L36
        L28:
            boolean r0 = r6.zzc
            if (r0 == 0) goto L36
            java.lang.Object r0 = r2.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6.zza = r0
            r6.zzc = r4
        L36:
            java.lang.Object[] r0 = r6.zza
            int r1 = r6.zzb
            int r2 = r1 + 1
            r6.zzb = r2
            r0[r1] = r7
            return r6
    }
}
