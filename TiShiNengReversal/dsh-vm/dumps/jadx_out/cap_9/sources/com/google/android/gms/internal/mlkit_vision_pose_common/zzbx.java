package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbx extends com.google.android.gms.internal.mlkit_vision_pose_common.zzbd {
    private final transient java.lang.Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzbx(java.lang.Object[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzc
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzq.zza(r3, r0, r1)
            java.lang.Object[] r0 = r2.zza
            int r3 = r3 + r3
            int r1 = r2.zzb
            int r3 = r3 + r1
            r3 = r0[r3]
            java.util.Objects.requireNonNull(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }
}
