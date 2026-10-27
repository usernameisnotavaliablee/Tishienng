package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcj extends com.google.android.gms.internal.mlkit_acceleration.zzcl {
    final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzcs zza;
    private int zzb;
    private final int zzc;

    zzcj(com.google.android.gms.internal.mlkit_acceleration.zzcs r2) {
            r1 = this;
            r1.zza = r2
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            int r2 = r2.zzd()
            r1.zzc = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zzc
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcn
    public final byte zza() {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zzc
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.zzb = r1
            com.google.android.gms.internal.mlkit_acceleration.zzcs r1 = r2.zza
            byte r0 = r1.zzb(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
