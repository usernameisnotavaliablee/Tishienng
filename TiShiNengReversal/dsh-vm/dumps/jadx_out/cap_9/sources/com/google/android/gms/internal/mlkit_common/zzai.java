package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzai implements java.util.Map, java.io.Serializable {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_common.zzaj zza;

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_common.zzaj zzb;

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_common.zzab zzc;

    zzai() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zzai zzc(java.lang.Object r2, java.lang.Object r3) {
            java.lang.String r2 = "optional-module-barcode"
            java.lang.String r3 = "com.google.android.gms.vision.barcode"
            com.google.android.gms.internal.mlkit_common.zzw.zza(r2, r3)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r3 = 0
            com.google.android.gms.internal.mlkit_common.zzaq r2 = com.google.android.gms.internal.mlkit_common.zzaq.zzg(r2, r0, r3)
            return r2
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzab r0 = r1.zzb()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zzf()
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r0 = r1.entrySet()
            java.util.Set r2 = r2.entrySet()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public abstract java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object getOrDefault(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            return r2
    }

    @Override // java.util.Map
    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zzf()
            int r0 = com.google.android.gms.internal.mlkit_common.zzar.zza(r0)
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zzb
            if (r0 != 0) goto La
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zze()
            r1.zzb = r0
        La:
            return r0
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.size()
            if (r0 < 0) goto L58
            long r0 = (long) r0
            r2 = 8
            long r0 = r0 * r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            long r0 = java.lang.Math.min(r0, r3)
            int r1 = (int) r0
            r2.<init>(r1)
            r0 = 123(0x7b, float:1.72E-43)
            r2.append(r0)
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        L26:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r1 != 0) goto L39
            java.lang.String r1 = ", "
            r2.append(r1)
        L39:
            java.lang.Object r1 = r3.getKey()
            r2.append(r1)
            r1 = 61
            r2.append(r1)
            java.lang.Object r1 = r3.getValue()
            r2.append(r1)
            r1 = 0
            goto L26
        L4e:
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L58:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "size cannot be negative but was: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzab r0 = r1.zzb()
            return r0
    }

    abstract com.google.android.gms.internal.mlkit_common.zzab zza();

    public final com.google.android.gms.internal.mlkit_common.zzab zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzab r0 = r1.zzc
            if (r0 != 0) goto La
            com.google.android.gms.internal.mlkit_common.zzab r0 = r1.zza()
            r1.zzc = r0
        La:
            return r0
    }

    abstract com.google.android.gms.internal.mlkit_common.zzaj zzd();

    abstract com.google.android.gms.internal.mlkit_common.zzaj zze();

    public final com.google.android.gms.internal.mlkit_common.zzaj zzf() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zza
            if (r0 != 0) goto La
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zzd()
            r1.zza = r0
        La:
            return r0
    }
}
