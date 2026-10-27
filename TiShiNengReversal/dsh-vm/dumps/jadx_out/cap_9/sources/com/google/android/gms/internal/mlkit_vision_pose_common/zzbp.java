package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zzbp extends java.util.AbstractMap {

    @javax.annotation.CheckForNull
    private transient java.util.Set zza;

    @javax.annotation.CheckForNull
    private transient java.util.Set zzb;

    @javax.annotation.CheckForNull
    private transient java.util.Collection zzc;

    zzbp() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = r1.zza
            if (r0 != 0) goto La
            java.util.Set r0 = r1.zza()
            r1.zza = r0
        La:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
            r1 = this;
            java.util.Set r0 = r1.zzb
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbn r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzbn
            r0.<init>(r1)
            r1.zzb = r0
        Lb:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = r1.zzc
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbo r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzbo
            r0.<init>(r1)
            r1.zzc = r0
        Lb:
            return r0
    }

    abstract java.util.Set zza();
}
