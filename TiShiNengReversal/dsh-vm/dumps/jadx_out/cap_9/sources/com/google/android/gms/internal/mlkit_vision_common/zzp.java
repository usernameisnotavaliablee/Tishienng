package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzp extends com.google.android.gms.internal.mlkit_vision_common.zzl implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.mlkit_vision_common.zzac zza = null;

    static {
            com.google.android.gms.internal.mlkit_vision_common.zzn r0 = new com.google.android.gms.internal.mlkit_vision_common.zzn
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = com.google.android.gms.internal.mlkit_vision_common.zzu.zza
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.mlkit_vision_common.zzp.zza = r0
            return
    }

    zzp() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.gms.internal.mlkit_vision_common.zzp zzg(java.lang.Object[] r1) {
            int r0 = r1.length
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = zzh(r1, r0)
            return r1
    }

    static com.google.android.gms.internal.mlkit_vision_common.zzp zzh(java.lang.Object[] r1, int r2) {
            if (r2 != 0) goto L5
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = com.google.android.gms.internal.mlkit_vision_common.zzu.zza
            return r1
        L5:
            com.google.android.gms.internal.mlkit_vision_common.zzu r0 = new com.google.android.gms.internal.mlkit_vision_common.zzu
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzp zzi(java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            com.google.android.gms.internal.mlkit_vision_common.zzt.zza(r1, r0)
            com.google.android.gms.internal.mlkit_vision_common.zzp r3 = zzh(r1, r0)
            return r3
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzp zzj(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            com.google.android.gms.internal.mlkit_vision_common.zzt.zza(r1, r0)
            com.google.android.gms.internal.mlkit_vision_common.zzp r3 = zzh(r1, r0)
            return r3
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.List r7 = (java.util.List) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1c:
            if (r3 >= r1) goto L30
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.android.gms.internal.mlkit_vision_common.zzb.zza(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            int r3 = r3 + 1
            goto L1c
        L30:
            return r0
        L31:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            return r2
        L46:
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = com.google.android.gms.internal.mlkit_vision_common.zzb.zza(r3, r4)
            if (r3 != 0) goto L39
            return r2
        L55:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L5c
            return r0
        L5c:
            return r2
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = 1
        L6:
            if (r1 >= r0) goto L16
            int r2 = r2 * 31
            java.lang.Object r3 = r4.get(r1)
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L16:
            return r2
    }

    @Override // java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L16
            return r2
        L16:
            int r2 = r2 + 1
            goto L9
        L19:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_common.zzac r0 = r1.zzk(r0)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.size()
            int r1 = r1 + r0
        L9:
            if (r1 < 0) goto L19
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r1 = r1 + (-1)
            goto L9
        L19:
            return r0
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_common.zzac r0 = r1.zzk(r0)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzac r1 = r0.zzk(r1)
            return r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = r0.zzf(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    int zza(java.lang.Object[] r3, int r4) {
            r2 = this;
            int r4 = r2.size()
            r0 = 0
        L5:
            if (r0 >= r4) goto L10
            java.lang.Object r1 = r2.get(r0)
            r3[r0] = r1
            int r0 = r0 + 1
            goto L5
        L10:
            return r4
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final com.google.android.gms.internal.mlkit_vision_common.zzab zzd() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_common.zzac r0 = r1.zzk(r0)
            return r0
    }

    public com.google.android.gms.internal.mlkit_vision_common.zzp zzf(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            com.google.android.gms.internal.mlkit_vision_common.zzf.zzc(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            com.google.android.gms.internal.mlkit_vision_common.zzp r2 = com.google.android.gms.internal.mlkit_vision_common.zzu.zza
            return r2
        L14:
            com.google.android.gms.internal.mlkit_vision_common.zzo r0 = new com.google.android.gms.internal.mlkit_vision_common.zzo
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_common.zzac zzk(int r3) {
            r2 = this;
            int r0 = r2.size()
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_vision_common.zzf.zzb(r3, r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            com.google.android.gms.internal.mlkit_vision_common.zzac r3 = com.google.android.gms.internal.mlkit_vision_common.zzp.zza
            return r3
        L12:
            com.google.android.gms.internal.mlkit_vision_common.zzn r0 = new com.google.android.gms.internal.mlkit_vision_common.zzn
            r0.<init>(r2, r3)
            return r0
    }
}
