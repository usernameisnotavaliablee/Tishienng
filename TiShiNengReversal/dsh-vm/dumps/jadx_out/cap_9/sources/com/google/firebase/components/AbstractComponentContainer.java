package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractComponentContainer implements com.google.firebase.components.ComponentContainer {
    AbstractComponentContainer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(java.lang.Class<T> r1) {
            r0 = this;
            com.google.firebase.inject.Provider r1 = r0.getProvider(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r1.get()
            return r1
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> java.util.Set<T> setOf(java.lang.Class<T> r1) {
            r0 = this;
            com.google.firebase.inject.Provider r1 = r0.setOfProvider(r1)
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }
}
