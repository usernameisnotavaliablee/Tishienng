package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzvw {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzvo zza = null;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvo
            java.lang.String r1 = "xBkDPNxUEiMRX5vPP2wqvCR4Grb8GZQqrKNyC0Y"
            r2 = 3
            byte[] r1 = android.util.Base64.decode(r1, r2)
            java.lang.String r3 = "xJXZd/zR0io4+XWtcwbtnyYutpO4NX7DhE3xBg4"
            byte[] r3 = android.util.Base64.decode(r3, r2)
            int r4 = r1.length
            byte[] r4 = new byte[r4]
            r5 = 0
        L13:
            int r6 = r1.length
            if (r5 >= r6) goto L21
            r6 = r1[r5]
            r7 = r3[r5]
            r6 = r6 ^ r7
            byte r6 = (byte) r6
            r4[r5] = r6
            int r5 = r5 + 1
            goto L13
        L21:
            java.lang.String r1 = android.util.Base64.encodeToString(r4, r2)
            java.lang.String r2 = "82c62205f0ef0ea96608a8"
            java.lang.String r3 = "722550545529"
            r0.<init>(r3, r1, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvw.zza = r0
            return
    }

    public zzvw() {
            r1 = this;
            r1.<init>()
            return
    }
}
