package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzgh implements java.util.Iterator {
    final java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzgi zzb;

    zzgh(com.google.android.gms.internal.mlkit_acceleration.zzgi r1) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzei r1 = com.google.android.gms.internal.mlkit_acceleration.zzgi.zza(r1)
            java.util.Iterator r1 = r1.iterator()
            r0.zza = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
