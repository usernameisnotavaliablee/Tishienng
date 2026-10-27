package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzgg implements java.util.ListIterator {
    final java.util.ListIterator zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzgi zzc;

    zzgg(com.google.android.gms.internal.mlkit_acceleration.zzgi r1, int r2) {
            r0 = this;
            r0.zzb = r2
            r0.zzc = r1
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzei r1 = com.google.android.gms.internal.mlkit_acceleration.zzgi.zza(r1)
            java.util.ListIterator r1 = r1.listIterator(r2)
            r0.zza = r1
            return
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.Object previous() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            java.lang.Object r0 = r0.previous()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
