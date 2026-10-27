package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzs extends com.google.android.gms.internal.mlkit_vision_common.zzl implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_vision_common.zzp zza;

    zzs() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L20
            if (r5 != r4) goto L6
            return r0
        L6:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1f
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1f
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1f
            if (r1 != r3) goto L1f
            boolean r5 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
        L1f:
            return r2
        L20:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.internal.mlkit_vision_common.zzaa.zza(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzab r0 = r1.zzd()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public abstract com.google.android.gms.internal.mlkit_vision_common.zzab zzd();

    public final com.google.android.gms.internal.mlkit_vision_common.zzp zzf() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzp r0 = r1.zza
            if (r0 != 0) goto La
            com.google.android.gms.internal.mlkit_vision_common.zzp r0 = r1.zzg()
            r1.zza = r0
        La:
            return r0
    }

    com.google.android.gms.internal.mlkit_vision_common.zzp zzg() {
            r1 = this;
            java.lang.Object[] r0 = r1.toArray()
            com.google.android.gms.internal.mlkit_vision_common.zzp r0 = com.google.android.gms.internal.mlkit_vision_common.zzp.zzg(r0)
            return r0
    }
}
