package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzab extends java.util.AbstractCollection implements java.io.Serializable {
    private static final java.lang.Object[] zza = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.internal.mlkit_common.zzab.zza = r0
            return
    }

    zzab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzas r0 = r1.zzd()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
            r1 = this;
            r0 = 1296(0x510, float:1.816E-42)
            java.util.Spliterator r0 = com.google.android.gms.internal.common.a.a(r1, r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = com.google.android.gms.internal.mlkit_common.zzab.zza
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.size()
            int r1 = r5.length
            r2 = 0
            if (r1 >= r0) goto L2d
            java.lang.Object[] r3 = r4.zze()
            if (r3 != 0) goto L1c
            if (r1 == 0) goto L17
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
        L17:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            goto L32
        L1c:
            int r0 = r4.zzc()
            int r1 = r4.zzb()
            java.lang.Class r5 = r5.getClass()
            java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r3, r0, r1, r5)
            return r5
        L2d:
            if (r1 <= r0) goto L32
            r1 = 0
            r5[r0] = r1
        L32:
            r4.zza(r5, r2)
            return r5
    }

    int zza(java.lang.Object[] r1, int r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    int zzb() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    int zzc() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract com.google.android.gms.internal.mlkit_common.zzas zzd();

    @javax.annotation.CheckForNull
    java.lang.Object[] zze() {
            r1 = this;
            r0 = 0
            return r0
    }
}
