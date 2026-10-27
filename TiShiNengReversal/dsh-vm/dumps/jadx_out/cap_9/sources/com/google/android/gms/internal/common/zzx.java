package com.google.android.gms.internal.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.jspecify.nullness.NullMarked
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzx {
    private final com.google.android.gms.internal.common.zzo zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzu zzc;

    private zzx(com.google.android.gms.internal.common.zzu r1, boolean r2, com.google.android.gms.internal.common.zzo r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zza = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.common.zzo zza(com.google.android.gms.internal.common.zzx r0) {
            com.google.android.gms.internal.common.zzo r0 = r0.zza
            return r0
    }

    public static com.google.android.gms.internal.common.zzx zzc(com.google.android.gms.internal.common.zzo r4) {
            com.google.android.gms.internal.common.zzx r0 = new com.google.android.gms.internal.common.zzx
            com.google.android.gms.internal.common.zzu r1 = new com.google.android.gms.internal.common.zzu
            r1.<init>(r4)
            com.google.android.gms.internal.common.zzo r4 = com.google.android.gms.internal.common.zzn.zza
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Iterator zze(com.google.android.gms.internal.common.zzx r0, java.lang.CharSequence r1) {
            java.util.Iterator r0 = r0.zzh(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzg(com.google.android.gms.internal.common.zzx r0) {
            boolean r0 = r0.zzb
            return r0
    }

    private final java.util.Iterator zzh(java.lang.CharSequence r3) {
            r2 = this;
            com.google.android.gms.internal.common.zzt r0 = new com.google.android.gms.internal.common.zzt
            com.google.android.gms.internal.common.zzu r1 = r2.zzc
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final com.google.android.gms.internal.common.zzx zzb() {
            r5 = this;
            com.google.android.gms.internal.common.zzo r0 = r5.zza
            com.google.android.gms.internal.common.zzx r1 = new com.google.android.gms.internal.common.zzx
            com.google.android.gms.internal.common.zzu r2 = r5.zzc
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r3, r0, r4)
            return r1
    }

    public final java.lang.Iterable zzd(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzv r0 = new com.google.android.gms.internal.common.zzv
            r0.<init>(r1, r2)
            return r0
    }

    public final java.util.List zzf(java.lang.CharSequence r3) {
            r2 = this;
            r3.getClass()
            java.util.Iterator r3 = r2.zzh(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto Lc
        L1c:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }
}
