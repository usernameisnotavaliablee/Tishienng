package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class ComponentRuntime$$Lambda$2 implements com.google.firebase.inject.Provider {
    private final com.google.firebase.components.ComponentRegistrar arg$1;

    private ComponentRuntime$$Lambda$2(com.google.firebase.components.ComponentRegistrar r1) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            return
    }

    public static com.google.firebase.inject.Provider lambdaFactory$(com.google.firebase.components.ComponentRegistrar r1) {
            com.google.firebase.components.ComponentRuntime$$Lambda$2 r0 = new com.google.firebase.components.ComponentRuntime$$Lambda$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.firebase.inject.Provider
    public java.lang.Object get() {
            r1 = this;
            com.google.firebase.components.ComponentRegistrar r0 = r1.arg$1
            com.google.firebase.components.ComponentRegistrar r0 = com.google.firebase.components.ComponentRuntime.lambda$toProviders$1(r0)
            return r0
    }
}
