package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.ShowFirstParty
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzd {
    public zzd() {
            r1 = this;
            r1.<init>()
            return
    }

    static int zza(int r6) {
            r0 = 1
            r1 = 2
            r2 = 3
            int[] r1 = new int[]{r0, r1, r2}
            r3 = 0
        L8:
            if (r3 >= r2) goto L18
            r4 = r1[r3]
            int r5 = r4 + (-1)
            if (r4 == 0) goto L16
            if (r5 != r6) goto L13
            return r4
        L13:
            int r3 = r3 + 1
            goto L8
        L16:
            r6 = 0
            throw r6
        L18:
            return r0
    }
}
