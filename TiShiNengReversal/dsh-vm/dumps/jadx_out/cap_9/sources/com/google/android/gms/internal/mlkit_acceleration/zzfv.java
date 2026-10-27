package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzfv implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzfz zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zzfv(com.google.android.gms.internal.mlkit_acceleration.zzfz r1, com.google.android.gms.internal.mlkit_acceleration.zzfu r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r1 = -1
            r0.zzb = r1
            return
    }

    private final java.util.Iterator zza() {
            r1 = this;
            java.util.Iterator r0 = r1.zzd
            if (r0 != 0) goto L14
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r1.zza
            java.util.Map r0 = com.google.android.gms.internal.mlkit_acceleration.zzfz.zzh(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.zzd = r0
        L14:
            java.util.Iterator r0 = r1.zzd
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.zzb
            r1 = 1
            int r0 = r0 + r1
            com.google.android.gms.internal.mlkit_acceleration.zzfz r2 = r3.zza
            java.util.List r2 = com.google.android.gms.internal.mlkit_acceleration.zzfz.zzf(r2)
            int r2 = r2.size()
            if (r0 < r2) goto L29
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r3.zza
            java.util.Map r0 = com.google.android.gms.internal.mlkit_acceleration.zzfz.zzh(r0)
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L28
            java.util.Iterator r0 = r3.zza()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L28
            return r1
        L28:
            return r2
        L29:
            return r1
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r2 = this;
            r0 = 1
            r2.zzc = r0
            int r1 = r2.zzb
            int r1 = r1 + r0
            r2.zzb = r1
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r2.zza
            java.util.List r0 = com.google.android.gms.internal.mlkit_acceleration.zzfz.zzf(r0)
            int r0 = r0.size()
            if (r1 >= r0) goto L23
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r2.zza
            java.util.List r0 = com.google.android.gms.internal.mlkit_acceleration.zzfz.zzf(r0)
            int r1 = r2.zzb
            java.lang.Object r0 = r0.get(r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
        L23:
            java.util.Iterator r0 = r2.zza()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.zzc
            if (r0 == 0) goto L2e
            r0 = 0
            r3.zzc = r0
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r3.zza
            com.google.android.gms.internal.mlkit_acceleration.zzfz.zzi(r0)
            int r0 = r3.zzb
            com.google.android.gms.internal.mlkit_acceleration.zzfz r1 = r3.zza
            java.util.List r1 = com.google.android.gms.internal.mlkit_acceleration.zzfz.zzf(r1)
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r1 + (-1)
            r3.zzb = r2
            com.google.android.gms.internal.mlkit_acceleration.zzfz.zzd(r0, r1)
            return
        L26:
            java.util.Iterator r0 = r3.zza()
            r0.remove()
            return
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() was called before next()"
            r0.<init>(r1)
            throw r0
    }
}
