package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzh {
    public zzh() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String zza(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2f
            char r2 = r4.charAt(r1)
            boolean r2 = zzb(r2)
            if (r2 == 0) goto L2c
            char[] r4 = r4.toCharArray()
        L15:
            if (r1 >= r0) goto L27
            char r2 = r4[r1]
            boolean r3 = zzb(r2)
            if (r3 == 0) goto L24
            r2 = r2 ^ 32
            char r2 = (char) r2
            r4[r1] = r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L2c:
            int r1 = r1 + 1
            goto L5
        L2f:
            return r4
    }

    public static boolean zzb(char r1) {
            r0 = 65
            if (r1 < r0) goto La
            r0 = 90
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }
}
