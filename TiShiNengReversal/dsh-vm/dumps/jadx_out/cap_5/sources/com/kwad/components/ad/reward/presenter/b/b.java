package com.kwad.components.ad.reward.presenter.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest iS;
    private long jY;
    private final com.kwad.sdk.core.network.l<com.kwad.components.core.liveEnd.a, com.kwad.components.ad.reward.model.AdLiveEndResultData> mNetworking;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.p se;
    private final com.kwad.components.core.video.m vR;

    @androidx.annotation.Nullable
    private android.view.View xj;




    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.b.b$1 r0 = new com.kwad.components.ad.reward.presenter.b.b$1
            r0.<init>(r1)
            r1.mNetworking = r0
            com.kwad.components.ad.reward.presenter.b.b$2 r0 = new com.kwad.components.ad.reward.presenter.b.b$2
            r0.<init>(r1)
            r1.vR = r0
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.reward.presenter.b.b r0, long r1) {
            r0.jY = r1
            return r1
    }

    static /* synthetic */ android.view.View a(com.kwad.components.ad.reward.presenter.b.b r0, int r1) {
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    static /* synthetic */ android.view.View a(com.kwad.components.ad.reward.presenter.b.b r0, android.view.View r1) {
            r0.xj = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.reward.n.p a(com.kwad.components.ad.reward.presenter.b.b r0, com.kwad.components.ad.reward.n.p r1) {
            r0.se = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest a(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r0 = r0.iS
            return r0
    }

    static /* synthetic */ android.view.View b(com.kwad.components.ad.reward.presenter.b.b r0, int r1) {
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.presenter.b.b r0) {
            r0.iZ()
            return
    }

    static /* synthetic */ void c(com.kwad.components.ad.reward.presenter.b.b r0) {
            r0.ja()
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.n.p d(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.ad.reward.n.p r0 = r0.se
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g e(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g f(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g g(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g h(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ long i(com.kwad.components.ad.reward.presenter.b.b r2) {
            long r0 = r2.jY
            return r0
    }

    private void iI() {
            r4 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.sdk.core.adlog.a$a r1 = new com.kwad.sdk.core.adlog.a$a
            r1.<init>()
            r2 = 24
            r0.dm(r2)
            r0.b(r1)
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r2 = 0
            r3 = 1
            com.kwad.components.ad.reward.j.b.a(r3, r1, r2, r0)
            return
    }

    private void iZ() {
            r2 = this;
            com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r0 = r2.iS
            if (r0 != 0) goto L5
            return
        L5:
            com.kwad.sdk.core.network.l<com.kwad.components.core.liveEnd.a, com.kwad.components.ad.reward.model.AdLiveEndResultData> r0 = r2.mNetworking
            com.kwad.components.ad.reward.presenter.b.b$3 r1 = new com.kwad.components.ad.reward.presenter.b.b$3
            r1.<init>(r2)
            r0.request(r1)
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g j(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void ja() {
            r2 = this;
            android.view.View r0 = r2.xj
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)
        L9:
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g k(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ android.view.View l(com.kwad.components.ad.reward.presenter.b.b r0) {
            android.view.View r0 = r0.xj
            return r0
    }

    static /* synthetic */ void m(com.kwad.components.ad.reward.presenter.b.b r0) {
            r0.iI()
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g n(com.kwad.components.ad.reward.presenter.b.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L38
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.vR
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bh(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L38
            java.lang.Class<com.kwad.components.core.o.a.b.a> r1 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r1 = com.kwad.sdk.components.d.f(r1)
            com.kwad.components.core.o.a.b.a r1 = (com.kwad.components.core.o.a.b.a) r1
            if (r1 == 0) goto L38
            com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r0 = r1.getAdLiveEndRequest(r0)
            r2.iS = r0
        L38:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.sdk.core.network.l<com.kwad.components.core.liveEnd.a, com.kwad.components.ad.reward.model.AdLiveEndResultData> r0 = r2.mNetworking
            r0.cancel()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L1b
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.vR
            r0.b(r1)
        L1b:
            return
    }
}
