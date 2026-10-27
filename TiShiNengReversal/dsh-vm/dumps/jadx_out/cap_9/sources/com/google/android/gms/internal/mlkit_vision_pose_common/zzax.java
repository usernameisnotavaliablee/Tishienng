package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzax {
    zzax() {
            r0 = this;
            r0.<init>()
            return
    }

    static int zza(int r1, int r2) {
            if (r2 < 0) goto L16
            int r0 = r1 >> 1
            int r1 = r1 + r0
            int r1 = r1 + 1
            if (r1 >= r2) goto L10
            int r2 = r2 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r2)
            int r1 = r1 + r1
        L10:
            if (r1 >= 0) goto L15
            r1 = 2147483647(0x7fffffff, float:NaN)
        L15:
            return r1
        L16:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "cannot store more than MAX_VALUE elements"
            r1.<init>(r2)
            throw r1
    }
}
