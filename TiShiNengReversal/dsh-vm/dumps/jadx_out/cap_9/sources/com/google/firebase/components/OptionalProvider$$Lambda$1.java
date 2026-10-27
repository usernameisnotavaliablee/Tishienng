package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class OptionalProvider$$Lambda$1 implements com.google.firebase.inject.Deferred.DeferredHandler {
    private final com.google.firebase.inject.Deferred.DeferredHandler arg$1;
    private final com.google.firebase.inject.Deferred.DeferredHandler arg$2;

    private OptionalProvider$$Lambda$1(com.google.firebase.inject.Deferred.DeferredHandler r1, com.google.firebase.inject.Deferred.DeferredHandler r2) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            r0.arg$2 = r2
            return
    }

    public static com.google.firebase.inject.Deferred.DeferredHandler lambdaFactory$(com.google.firebase.inject.Deferred.DeferredHandler r1, com.google.firebase.inject.Deferred.DeferredHandler r2) {
            com.google.firebase.components.OptionalProvider$$Lambda$1 r0 = new com.google.firebase.components.OptionalProvider$$Lambda$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(com.google.firebase.inject.Provider r3) {
            r2 = this;
            com.google.firebase.inject.Deferred$DeferredHandler r0 = r2.arg$1
            com.google.firebase.inject.Deferred$DeferredHandler r1 = r2.arg$2
            com.google.firebase.components.OptionalProvider.lambda$whenAvailable$2(r0, r1, r3)
            return
    }
}
