package com.kwad.components.core.proxy.launchdialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    private final long WA;
    private final androidx.lifecycle.Lifecycle.Event Wz;

    public d(androidx.lifecycle.Lifecycle.Event r3) {
            r2 = this;
            r2.<init>()
            r2.Wz = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.WA = r0
            return
    }

    public final androidx.lifecycle.Lifecycle.Event sa() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = r1.Wz
            return r0
    }

    public final long sb() {
            r2 = this;
            long r0 = r2.WA
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LifecycleStamp{mEvent="
            r0.<init>(r1)
            androidx.lifecycle.Lifecycle$Event r1 = r3.Wz
            r0.append(r1)
            java.lang.String r1 = ", mEventTimestamp="
            r0.append(r1)
            long r1 = r3.WA
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
