package com.kwad.components.offline.api.core.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface ILifeCycleListener {
    @androidx.annotation.Keep
    void onActivityCreated(android.app.Activity r1, android.os.Bundle r2);

    @androidx.annotation.Keep
    void onActivityDestroyed(android.app.Activity r1);

    @androidx.annotation.Keep
    void onActivityPaused(android.app.Activity r1);

    @androidx.annotation.Keep
    void onActivityResumed(android.app.Activity r1);

    @androidx.annotation.Keep
    void onBackToBackground();

    @androidx.annotation.Keep
    void onBackToForeground();
}
