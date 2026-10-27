package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzcf extends com.google.android.gms.internal.mlkit_vision_pose_common.zzcg {
    static /* bridge */ /* synthetic */ int zza(int[] r1, int r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto La
            r0 = r1[r3]
            if (r0 != r2) goto L7
            return r3
        L7:
            int r3 = r3 + 1
            goto L0
        La:
            r1 = -1
            return r1
    }

    public static int zzb(int r0, int r1, int r2) {
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    public static java.util.List zzc(int... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L6
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
        L6:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzce r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzce
            r2 = 0
            r1.<init>(r3, r2, r0)
            return r1
    }
}
