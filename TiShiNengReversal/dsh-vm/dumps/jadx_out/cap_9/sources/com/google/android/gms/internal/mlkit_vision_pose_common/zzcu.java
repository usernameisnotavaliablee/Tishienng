package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzcu extends com.google.android.gms.internal.mlkit_vision_pose_common.zzcv implements java.lang.Iterable {
    private final java.util.ArrayList zza;

    public zzcu() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 == r3) goto L16
            boolean r1 = r4 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcu
            r2 = 0
            if (r1 == 0) goto L15
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcu r4 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcu) r4
            java.util.ArrayList r4 = r4.zza
            java.util.ArrayList r1 = r3.zza
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L15
            return r0
        L15:
            return r2
        L16:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.util.ArrayList r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.ArrayList r0 = r1.zza
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final void zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.zza
            r0.add(r2)
            return
    }
}
