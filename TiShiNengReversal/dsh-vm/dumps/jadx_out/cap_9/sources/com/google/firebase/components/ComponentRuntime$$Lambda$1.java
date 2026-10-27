package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class ComponentRuntime$$Lambda$1 implements com.google.firebase.inject.Provider {
    private final com.google.firebase.components.ComponentRuntime arg$1;
    private final com.google.firebase.components.Component arg$2;

    private ComponentRuntime$$Lambda$1(com.google.firebase.components.ComponentRuntime r1, com.google.firebase.components.Component r2) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            r0.arg$2 = r2
            return
    }

    public static com.google.firebase.inject.Provider lambdaFactory$(com.google.firebase.components.ComponentRuntime r1, com.google.firebase.components.Component r2) {
            com.google.firebase.components.ComponentRuntime$$Lambda$1 r0 = new com.google.firebase.components.ComponentRuntime$$Lambda$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.firebase.inject.Provider
    public java.lang.Object get() {
            r2 = this;
            com.google.firebase.components.ComponentRuntime r0 = r2.arg$1
            com.google.firebase.components.Component r1 = r2.arg$2
            java.lang.Object r0 = com.google.firebase.components.ComponentRuntime.lambda$discoverComponents$0(r0, r1)
            return r0
    }
}
