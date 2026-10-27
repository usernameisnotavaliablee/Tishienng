package com.kwad.components.offline.api.core.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IAsync {
    void execute(java.lang.Runnable r1);

    void runOnDefaultExecutor(java.lang.Runnable r1);

    void runOnUiThread(java.lang.Runnable r1);

    void runOnUiThreadDelay(java.lang.Runnable r1, long r2);

    void schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4);
}
