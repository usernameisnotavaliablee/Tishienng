package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class b implements com.kwad.components.offline.api.core.api.ICache {
    b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ICache
    public final java.lang.String getPreCacheUrl(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.lang.String r2 = com.kwad.components.core.video.k.h(r0, r2)
            return r2
    }
}
