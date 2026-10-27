package io.reactivex.internal.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class FullArbiterMissed extends io.reactivex.internal.subscriptions.FullArbiterPad1 {
    final java.util.concurrent.atomic.AtomicLong missedRequested;

    FullArbiterMissed() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.missedRequested = r0
            return
    }
}
