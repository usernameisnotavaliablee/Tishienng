package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class Component$$Lambda$2 implements com.google.firebase.components.ComponentFactory {
    private final java.lang.Object arg$1;

    private Component$$Lambda$2(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            return
    }

    public static com.google.firebase.components.ComponentFactory lambdaFactory$(java.lang.Object r1) {
            com.google.firebase.components.Component$$Lambda$2 r0 = new com.google.firebase.components.Component$$Lambda$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.firebase.components.ComponentFactory
    public java.lang.Object create(com.google.firebase.components.ComponentContainer r2) {
            r1 = this;
            java.lang.Object r0 = r1.arg$1
            java.lang.Object r2 = com.google.firebase.components.Component.lambda$of$1(r0, r2)
            return r2
    }
}
