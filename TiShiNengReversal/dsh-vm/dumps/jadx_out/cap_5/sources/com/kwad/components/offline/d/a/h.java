package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h implements com.kwad.components.offline.api.tk.IOfflineTKRenderListener {
    private final com.kwad.sdk.components.s akH;

    public h(com.kwad.sdk.components.s r1) {
            r0 = this;
            r0.<init>()
            r0.akH = r1
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineTKRenderListener
    public final void onFailed(java.lang.Throwable r2) {
            r1 = this;
            com.kwad.sdk.components.s r0 = r1.akH
            if (r0 == 0) goto L7
            r0.onFailed(r2)
        L7:
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineTKRenderListener
    public final void onSuccess() {
            r1 = this;
            com.kwad.sdk.components.s r0 = r1.akH
            if (r0 == 0) goto L7
            r0.onSuccess()
        L7:
            return
    }
}
