package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class EventBus$$Lambda$1 implements java.lang.Runnable {
    private final java.util.Map.Entry arg$1;
    private final com.google.firebase.events.Event arg$2;

    private EventBus$$Lambda$1(java.util.Map.Entry r1, com.google.firebase.events.Event r2) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            r0.arg$2 = r2
            return
    }

    public static java.lang.Runnable lambdaFactory$(java.util.Map.Entry r1, com.google.firebase.events.Event r2) {
            com.google.firebase.components.EventBus$$Lambda$1 r0 = new com.google.firebase.components.EventBus$$Lambda$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.util.Map$Entry r0 = r2.arg$1
            com.google.firebase.events.Event r1 = r2.arg$2
            com.google.firebase.components.EventBus.lambda$publish$0(r0, r1)
            return
    }
}
