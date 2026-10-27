package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e implements com.kwad.components.offline.api.core.api.IFlowUuid {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IFlowUuid
    public final long decryptLongFromBase64(java.lang.String r3) {
            r2 = this;
            long r0 = com.kwad.components.core.e.b.a.ai(r3)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IFlowUuid
    public final java.lang.String encryptLongToBase64(long r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.components.core.e.b.a.y(r1)     // Catch: java.lang.Exception -> L5
            return r1
        L5:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
            r1 = 0
            return r1
    }
}
