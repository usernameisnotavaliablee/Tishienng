package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzaa implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzaf zzb;

    zzaa(com.google.android.gms.internal.mlkit_acceleration.zzaf r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzaf r0 = r2.zzb
            java.lang.CharSequence r1 = r2.zza
            java.util.Iterator r0 = com.google.android.gms.internal.mlkit_acceleration.zzaf.zzg(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.util.Iterator r1 = r4.iterator()
            java.lang.String r2 = ", "
            boolean r3 = r1.hasNext()     // Catch: java.io.IOException -> L36
            if (r3 == 0) goto L38
            java.lang.Object r3 = r1.next()     // Catch: java.io.IOException -> L36
            java.lang.CharSequence r3 = com.google.android.gms.internal.mlkit_acceleration.zzq.zza(r3, r2)     // Catch: java.io.IOException -> L36
            r0.append(r3)     // Catch: java.io.IOException -> L36
        L21:
            boolean r3 = r1.hasNext()     // Catch: java.io.IOException -> L36
            if (r3 == 0) goto L38
            r0.append(r2)     // Catch: java.io.IOException -> L36
            java.lang.Object r3 = r1.next()     // Catch: java.io.IOException -> L36
            java.lang.CharSequence r3 = com.google.android.gms.internal.mlkit_acceleration.zzq.zza(r3, r2)     // Catch: java.io.IOException -> L36
            r0.append(r3)     // Catch: java.io.IOException -> L36
            goto L21
        L36:
            r0 = move-exception
            goto L42
        L38:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L42:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }
}
