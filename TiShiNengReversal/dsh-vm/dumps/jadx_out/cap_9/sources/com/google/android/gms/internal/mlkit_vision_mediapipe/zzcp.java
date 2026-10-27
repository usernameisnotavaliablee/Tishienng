package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzcp {
    public zzcp() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String zza(java.lang.String r3, java.lang.String r4, boolean r5) {
            int r3 = r4.length()
            r5 = 23
            if (r3 <= r5) goto L27
            int r3 = r4.length()
            r0 = -1
            int r3 = r3 + r0
        Le:
            if (r3 < 0) goto L21
            char r1 = r4.charAt(r3)
            r2 = 46
            if (r1 == r2) goto L20
            r2 = 36
            if (r1 != r2) goto L1d
            goto L20
        L1d:
            int r3 = r3 + (-1)
            goto Le
        L20:
            r0 = r3
        L21:
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
        L27:
            java.lang.String r3 = ""
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r3.concat(r4)
            int r4 = r3.length()
            int r4 = java.lang.Math.min(r4, r5)
            r5 = 0
            java.lang.String r3 = r3.substring(r5, r4)
            return r3
    }

    public static int zzb(java.util.logging.Level r1) {
            int r1 = r1.intValue()
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE
            int r0 = r0.intValue()
            if (r1 < r0) goto Le
            r1 = 6
            return r1
        Le:
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            int r0 = r0.intValue()
            if (r1 < r0) goto L18
            r1 = 5
            return r1
        L18:
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            int r0 = r0.intValue()
            if (r1 < r0) goto L22
            r1 = 4
            return r1
        L22:
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            int r0 = r0.intValue()
            if (r1 < r0) goto L2c
            r1 = 3
            return r1
        L2c:
            r1 = 2
            return r1
    }
}
