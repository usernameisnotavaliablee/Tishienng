package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbo extends java.util.AbstractCollection {
    final java.util.Map zza;

    zzbo(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = (java.util.Map) r1
            r0.zza = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r1 = this;
            java.util.Map r0 = r1.zza
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.zza
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbl r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzbl
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r4 = super.remove(r4)     // Catch: java.lang.UnsupportedOperationException -> L5
            return r4
        L5:
            java.util.Map r0 = r3.zza
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            boolean r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzp.zza(r4, r2)
            if (r2 == 0) goto Lf
            java.util.Map r4 = r3.zza
            java.lang.Object r0 = r1.getKey()
            r4.remove(r0)
            r4 = 1
            return r4
        L30:
            r4 = 0
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection r5) {
            r4 = this;
            if (r5 == 0) goto La
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lc
            boolean r5 = super.removeAll(r0)     // Catch: java.lang.UnsupportedOperationException -> Lc
            return r5
        La:
            r0 = 0
            throw r0     // Catch: java.lang.UnsupportedOperationException -> Lc
        Lc:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Map r1 = r4.zza
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L1b
            java.lang.Object r2 = r2.getKey()
            r0.add(r2)
            goto L1b
        L39:
            java.util.Map r5 = r4.zza
            java.util.Set r5 = r5.keySet()
            boolean r5 = r5.removeAll(r0)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection r5) {
            r4 = this;
            if (r5 == 0) goto La
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lc
            boolean r5 = super.retainAll(r0)     // Catch: java.lang.UnsupportedOperationException -> Lc
            return r5
        La:
            r0 = 0
            throw r0     // Catch: java.lang.UnsupportedOperationException -> Lc
        Lc:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Map r1 = r4.zza
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L1b
            java.lang.Object r2 = r2.getKey()
            r0.add(r2)
            goto L1b
        L39:
            java.util.Map r5 = r4.zza
            java.util.Set r5 = r5.keySet()
            boolean r5 = r5.retainAll(r0)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r1 = this;
            java.util.Map r0 = r1.zza
            int r0 = r0.size()
            return r0
    }
}
