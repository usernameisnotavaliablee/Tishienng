package com.kwad.components.core.o.b.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.components.offline.api.core.adlive.ILive {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.adlive.ILive
    public final com.kwad.components.offline.api.core.adlive.IAdLivePlayModule getAdLivePlayModule(com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, long r13) {
            r8 = this;
            java.lang.Class<com.kwad.components.core.o.a.b.a> r0 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            r1 = r0
            com.kwad.components.core.o.a.b.a r1 = (com.kwad.components.core.o.a.b.a) r1
            if (r1 == 0) goto L1b
            boolean r0 = r1.qu()
            if (r0 == 0) goto L1b
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r9 = r1.getAdLivePlayModule(r2, r3, r4, r5, r6)
            return r9
        L1b:
            r9 = 0
            return r9
    }

    @Override // com.kwad.components.offline.api.core.adlive.ILive
    public final com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView getIAdLiveOfflineView(android.content.Context r3, int r4) {
            r2 = this;
            java.lang.Class<com.kwad.components.core.o.a.b.a> r0 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.core.o.a.b.a r0 = (com.kwad.components.core.o.a.b.a) r0
            if (r0 == 0) goto L19
            boolean r1 = r0.qu()
            if (r1 == 0) goto L19
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r3 = r0.getView(r3, r4)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
        L19:
            r3 = 0
            return r3
    }

    @Override // com.kwad.components.offline.api.core.adlive.ILive
    public final com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest mIAdLiveEndRequest(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1b
            java.lang.Class<com.kwad.components.core.o.a.b.a> r0 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.core.o.a.b.a r0 = (com.kwad.components.core.o.a.b.a) r0
            if (r0 == 0) goto L1b
            boolean r1 = r0.qu()
            if (r1 == 0) goto L1b
            com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r3 = r0.getAdLiveEndRequest(r3)
            return r3
        L1b:
            r3 = 0
            return r3
    }
}
