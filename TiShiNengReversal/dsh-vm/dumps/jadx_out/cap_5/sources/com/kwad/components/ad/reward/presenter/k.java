package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k extends com.kwad.components.ad.reward.presenter.b {
    private final com.kwad.components.offline.api.core.adlive.listener.AdLiveCallerContextListener vI;
    private final com.kwad.components.core.m.a.a vJ;



    public k() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.k$1 r0 = new com.kwad.components.ad.reward.presenter.k$1
            r0.<init>(r1)
            r1.vI = r0
            com.kwad.components.ad.reward.presenter.k$2 r0 = new com.kwad.components.ad.reward.presenter.k$2
            r0.<init>(r1)
            r1.vJ = r0
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L23
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.ad.reward.f.a r0 = r0.kX()
            com.kwad.components.offline.api.core.adlive.listener.AdLiveCallerContextListener r1 = r2.vI
            r0.registerAdLiveCallerContextListener(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            com.kwad.components.core.m.a.a r1 = r2.vJ
            r0.add(r1)
        L23:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L23
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.ad.reward.f.a r0 = r0.kX()
            com.kwad.components.offline.api.core.adlive.listener.AdLiveCallerContextListener r1 = r2.vI
            r0.unRegisterAdLiveCallerContextListener(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            com.kwad.components.core.m.a.a r1 = r2.vJ
            r0.remove(r1)
        L23:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            return
    }
}
