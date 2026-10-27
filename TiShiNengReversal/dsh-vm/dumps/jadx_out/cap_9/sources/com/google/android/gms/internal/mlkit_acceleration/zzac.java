package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzac {
    private final com.google.android.gms.internal.mlkit_acceleration.zzaf zza;
    private final com.google.android.gms.internal.mlkit_acceleration.zzaf zzb;

    /* synthetic */ zzac(com.google.android.gms.internal.mlkit_acceleration.zzaf r1, com.google.android.gms.internal.mlkit_acceleration.zzaf r2, com.google.android.gms.internal.mlkit_acceleration.zzab r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final java.util.Map zza(java.lang.CharSequence r8) {
            r7 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzaf r1 = r7.zza
            java.lang.Iterable r8 = r1.zzf(r8)
            java.util.Iterator r8 = r8.iterator()
        Lf:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.internal.mlkit_acceleration.zzaf r2 = r7.zzb
            java.util.Iterator r2 = com.google.android.gms.internal.mlkit_acceleration.zzaf.zzg(r2, r1)
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "Chunk [%s] is not a valid entry"
            com.google.android.gms.internal.mlkit_acceleration.zzv.zzb(r3, r4, r1)
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = r0.containsKey(r3)
            r5 = r5 ^ 1
            java.lang.String r6 = "Duplicate key [%s] found."
            com.google.android.gms.internal.mlkit_acceleration.zzv.zzb(r5, r6, r3)
            boolean r5 = r2.hasNext()
            com.google.android.gms.internal.mlkit_acceleration.zzv.zzb(r5, r4, r1)
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            r0.put(r3, r5)
            boolean r2 = r2.hasNext()
            r2 = r2 ^ 1
            com.google.android.gms.internal.mlkit_acceleration.zzv.zzb(r2, r4, r1)
            goto Lf
        L55:
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r0)
            return r8
    }
}
