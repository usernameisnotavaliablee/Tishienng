package com.kwad.components.offline.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements com.kwad.components.core.o.a.b.a {
    private final com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo ajt;

    public a(@androidx.annotation.NonNull com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r1) {
            r0 = this;
            r0.<init>()
            r0.ajt = r1
            return
    }

    @Override // com.kwad.components.core.o.a.b.a
    public final com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest getAdLiveEndRequest(java.lang.String r2) {
            r1 = this;
            com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r0 = r1.ajt
            com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r2 = r0.getAdLiveEndRequest(r2)
            return r2
    }

    @Override // com.kwad.components.core.o.a.b.a
    public final com.kwad.components.offline.api.core.adlive.IAdLivePlayModule getAdLivePlayModule(com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12) {
            r7 = this;
            com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r0 = r7.ajt
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r8 = r0.getAdLivePlayModule(r1, r2, r3, r4, r5)
            return r8
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class<com.kwad.components.offline.a.a> getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.components.offline.a.a> r0 = com.kwad.components.offline.a.a.class
            return r0
    }

    @Override // com.kwad.components.core.o.a.b.a
    public final com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView getView(android.content.Context r2, int r3) {
            r1 = this;
            com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r0 = r1.ajt
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r0.getView(r2, r3)
            return r2
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.components.b
    public final int priority() {
            r1 = this;
            com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r0 = r1.ajt
            int r0 = r0.priority()
            return r0
    }

    @Override // com.kwad.components.core.o.a.b.a
    public final boolean qu() {
            r2 = this;
            com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r0 = r2.ajt
            com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState r0 = r0.getState()
            com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState r1 = com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState.READY
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
