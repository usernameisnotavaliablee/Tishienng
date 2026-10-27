package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final /* synthetic */ class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ boolean a(java.util.concurrent.atomic.AtomicReferenceArray r1, int r2, java.lang.Object r3, java.lang.Object r4) {
        L0:
            boolean r0 = r1.compareAndSet(r2, r3, r4)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.Object r0 = r1.get(r2)
            if (r0 == r3) goto L0
            r1 = 0
            return r1
    }
}
