package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class a implements com.kwad.components.offline.api.core.api.IAsync {
    a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IAsync
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            com.kwad.sdk.utils.h.execute(r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IAsync
    public final void runOnDefaultExecutor(java.lang.Runnable r1) {
            r0 = this;
            com.kwad.sdk.utils.h.execute(r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IAsync
    public final void runOnUiThread(java.lang.Runnable r1) {
            r0 = this;
            com.kwad.sdk.utils.bw.runOnUiThread(r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IAsync
    public final void runOnUiThreadDelay(java.lang.Runnable r1, long r2) {
            r0 = this;
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r1, r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IAsync
    public final void schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            com.kwad.sdk.utils.h.schedule(r1, r2, r4)
            return
    }
}
