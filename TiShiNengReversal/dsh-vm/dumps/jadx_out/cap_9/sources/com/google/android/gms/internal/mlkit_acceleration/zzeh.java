package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzeh extends com.google.android.gms.internal.mlkit_acceleration.zzcd implements java.util.RandomAccess, com.google.android.gms.internal.mlkit_acceleration.zzei {

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.mlkit_acceleration.zzei zza = null;
    private static final com.google.android.gms.internal.mlkit_acceleration.zzeh zzb = null;
    private final java.util.List zzc;

    static {
            com.google.android.gms.internal.mlkit_acceleration.zzeh r0 = new com.google.android.gms.internal.mlkit_acceleration.zzeh
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzeh.zzb = r0
            com.google.android.gms.internal.mlkit_acceleration.zzeh.zza = r0
            return
    }

    public zzeh() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public zzeh(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r2 = 1
            r1.<init>(r2)
            r1.zzc = r0
            return
    }

    private zzeh(java.util.ArrayList r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.zzc = r2
            return
    }

    private zzeh(boolean r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.zzc = r1
            return
    }

    private static java.lang.String zzj(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L7:
            boolean r0 = r1 instanceof com.google.android.gms.internal.mlkit_acceleration.zzcs
            if (r0 == 0) goto L14
            com.google.android.gms.internal.mlkit_acceleration.zzcs r1 = (com.google.android.gms.internal.mlkit_acceleration.zzcs) r1
            java.nio.charset.Charset r0 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzb
            java.lang.String r1 = r1.zzm(r0)
            return r1
        L14:
            byte[] r1 = (byte[]) r1
            java.lang.String r1 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzd(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.zza()
            java.util.List r0 = r1.zzc
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcd, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            r1.zza()
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_acceleration.zzei
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.mlkit_acceleration.zzei r3 = (com.google.android.gms.internal.mlkit_acceleration.zzei) r3
            java.util.List r3 = r3.zzh()
        Ld:
            java.util.List r0 = r1.zzc
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r1 = this;
            r1.zza()
            java.util.List r0 = r1.zzc
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.zzg(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            r1.zza()
            java.util.List r0 = r1.zzc
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = zzj(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.zza()
            java.util.List r0 = r1.zzc
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = zzj(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            java.util.List r0 = r1.zzc
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzea
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzea zzd(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List r2 = r1.zzc
            r0.addAll(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzeh r2 = new com.google.android.gms.internal.mlkit_acceleration.zzeh
            r2.<init>(r0)
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzei
    public final com.google.android.gms.internal.mlkit_acceleration.zzei zze() {
            r1 = this;
            boolean r0 = r1.zzc()
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.mlkit_acceleration.zzgi r0 = new com.google.android.gms.internal.mlkit_acceleration.zzgi
            r0.<init>(r1)
            return r0
        Lc:
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzei
    public final java.lang.Object zzf(int r2) {
            r1 = this;
            java.util.List r0 = r1.zzc
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public final java.lang.String zzg(int r3) {
            r2 = this;
            java.util.List r0 = r2.zzc
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzcs
            if (r1 == 0) goto L25
            com.google.android.gms.internal.mlkit_acceleration.zzcs r0 = (com.google.android.gms.internal.mlkit_acceleration.zzcs) r0
            java.nio.charset.Charset r1 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzb
            java.lang.String r1 = r0.zzm(r1)
            boolean r0 = r0.zzi()
            if (r0 == 0) goto L24
            java.util.List r0 = r2.zzc
            r0.set(r3, r1)
        L24:
            return r1
        L25:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzd(r0)
            boolean r0 = com.google.android.gms.internal.mlkit_acceleration.zzgs.zze(r0)
            if (r0 == 0) goto L36
            java.util.List r0 = r2.zzc
            r0.set(r3, r1)
        L36:
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzei
    public final java.util.List zzh() {
            r1 = this;
            java.util.List r0 = r1.zzc
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzei
    public final void zzi(com.google.android.gms.internal.mlkit_acceleration.zzcs r2) {
            r1 = this;
            r1.zza()
            java.util.List r0 = r1.zzc
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }
}
