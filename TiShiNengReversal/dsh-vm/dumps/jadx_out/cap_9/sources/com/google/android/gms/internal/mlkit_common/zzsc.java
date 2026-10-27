package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzsc implements com.google.android.gms.internal.mlkit_common.zzrz {

    @androidx.annotation.VisibleForTesting
    final java.util.List zza;

    public zzsc(android.content.Context r3, com.google.android.gms.internal.mlkit_common.zzsb r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zza = r0
            boolean r1 = r4.zzc()
            if (r1 == 0) goto L18
            com.google.android.gms.internal.mlkit_common.zzsp r1 = new com.google.android.gms.internal.mlkit_common.zzsp
            r1.<init>(r3, r4)
            r0.add(r1)
        L18:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(com.google.android.gms.internal.mlkit_common.zzry r3) {
            r2 = this;
            java.util.List r0 = r2.zza
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.mlkit_common.zzrz r1 = (com.google.android.gms.internal.mlkit_common.zzrz) r1
            r1.zza(r3)
            goto L6
        L16:
            return
    }
}
