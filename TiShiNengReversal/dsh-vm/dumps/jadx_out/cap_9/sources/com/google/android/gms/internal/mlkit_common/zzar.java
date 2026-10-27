package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzar {
    public zzar() {
            r1 = this;
            r1.<init>()
            return
    }

    static int zza(java.util.Set r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = 0
        L18:
            int r1 = r1 + r2
            goto L6
        L1a:
            return r1
    }
}
