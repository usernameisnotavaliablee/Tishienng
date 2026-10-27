package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzfp extends com.google.android.gms.internal.mlkit_acceleration.zzfz {
    zzfp(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfz
    public final void zza() {
            r3 = this;
            boolean r0 = r3.zzj()
            if (r0 != 0) goto L5b
            r0 = 0
        L7:
            int r1 = r3.zzb()
            if (r0 >= r1) goto L2d
            java.util.Map$Entry r1 = r3.zzg(r0)
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.mlkit_acceleration.zzdm r2 = (com.google.android.gms.internal.mlkit_acceleration.zzdm) r2
            boolean r2 = r2.zzc()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
        L2a:
            int r0 = r0 + 1
            goto L7
        L2d:
            java.lang.Iterable r0 = r3.zzc()
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.mlkit_acceleration.zzdm r2 = (com.google.android.gms.internal.mlkit_acceleration.zzdm) r2
            boolean r2 = r2.zzc()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
            goto L35
        L5b:
            super.zza()
            return
    }
}
