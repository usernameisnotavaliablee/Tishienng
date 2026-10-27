package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final /* synthetic */ class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ boolean a(sun.misc.Unsafe r1, java.lang.Object r2, long r3, java.lang.Object r5, java.lang.Object r6) {
        L0:
            boolean r0 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.Object r0 = r1.getObject(r2, r3)
            if (r0 == r5) goto L0
            r1 = 0
            return r1
    }
}
