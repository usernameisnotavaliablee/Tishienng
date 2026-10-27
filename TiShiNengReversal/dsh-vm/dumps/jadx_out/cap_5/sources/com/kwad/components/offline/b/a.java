package com.kwad.components.offline.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements com.kwad.components.core.o.a.a.a {
    private final com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo ajF;

    public a(@androidx.annotation.NonNull com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo r1) {
            r0 = this;
            r0.<init>()
            r0.ajF = r1
            return
    }

    @Override // com.kwad.components.core.o.a.a.a
    public final com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule getAdWaynePlayerPlayModule(java.lang.String r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.qt()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo r0 = r2.ajF     // Catch: java.lang.Throwable -> Lf
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r3 = r0.getAdWaynePlayerPlayModule(r3, r4)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return r1
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class<com.kwad.components.offline.b.a> getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.components.offline.b.a> r0 = com.kwad.components.offline.b.a.class
            return r0
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.components.b
    public final int priority() {
            r1 = this;
            com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo r0 = r1.ajF
            int r0 = r0.priority()
            return r0
    }

    @Override // com.kwad.components.core.o.a.a.a
    public final boolean qt() {
            r2 = this;
            com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo r0 = r2.ajF
            com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState r0 = r0.getState()
            com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState r1 = com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState.READY
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
