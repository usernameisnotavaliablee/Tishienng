package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g implements com.kwad.components.offline.api.tk.IOfflineTKCallHandler {
    private final com.kwad.sdk.components.q akG;

    public g(com.kwad.sdk.components.q r1) {
            r0 = this;
            r0.<init>()
            r0.akG = r1
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineTKCallHandler
    public final void callJS(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.components.q r0 = r1.akG
            if (r0 == 0) goto L7
            r0.callJS(r2)
        L7:
            return
    }
}
