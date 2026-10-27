package com.kwad.components.offline.api.core.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface ILifeCycle {
    android.app.Activity getCurrentActivity();

    boolean isAppOnForeground();

    int registerLifeCycleListener(com.kwad.components.offline.api.core.api.ILifeCycleListener r1);

    void unregisterLifeCycleListener(int r1);
}
