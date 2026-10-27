package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzgi extends java.util.AbstractList implements java.util.RandomAccess, com.google.android.gms.internal.mlkit_acceleration.zzei {
    private final com.google.android.gms.internal.mlkit_acceleration.zzei zza;

    public zzgi(com.google.android.gms.internal.mlkit_acceleration.zzei r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzei zza(com.google.android.gms.internal.mlkit_acceleration.zzgi r0) {
            com.google.android.gms.internal.mlkit_acceleration.zzei r0 = r0.zza
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzei r0 = r1.zza
            com.google.android.gms.internal.mlkit_acceleration.zzeh r0 = (com.google.android.gms.internal.mlkit_acceleration.zzeh) r0
            java.lang.String r2 = r0.zzg(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzgh r0 = new com.google.android.gms.internal.mlkit_acceleration.zzgh
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzgg r0 = new com.google.android.gms.internal.mlkit_acceleration.zzgg
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzei r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzei
    public final com.google.android.gms.internal.mlkit_acceleration.zzei zze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzei
    public final java.lang.Object zzf(int r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzei r0 = r1.zza
            java.lang.Object r2 = r0.zzf(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzei
    public final java.util.List zzh() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzei r0 = r1.zza
            java.util.List r0 = r0.zzh()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzei
    public final void zzi(com.google.android.gms.internal.mlkit_acceleration.zzcs r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
