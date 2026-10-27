package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.core.j.a.InterfaceC0078a {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            boolean r0 = com.kwad.sdk.core.local.a.Hr()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onBind localCheckResult: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RewardInnerAdLoadPresenter"
            com.kwad.sdk.core.d.c.d(r2, r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.sdk.internal.api.SceneImpl r1 = r1.mAdScene
            if (r1 == 0) goto L25
            if (r0 == 0) goto L25
            com.kwad.components.core.j.a.a(r1, r3)
        L25:
            return
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void e(@androidx.annotation.Nullable java.util.List<com.kwad.components.core.j.c> r6) {
            r5 = this;
            if (r6 == 0) goto L58
            int r0 = r6.size()
            if (r0 != 0) goto L9
            goto L58
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onInnerAdLoad: "
            r0.<init>(r1)
            int r1 = r6.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardInnerAdLoadPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.kwad.components.core.j.c r0 = (com.kwad.components.core.j.c) r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            boolean r1 = com.kwad.sdk.core.response.b.b.cG(r0)
            com.kwad.components.ad.reward.g r2 = r5.tm
            java.util.List r2 = r2.gR()
            if (r1 == 0) goto L58
            int r1 = com.kwad.sdk.core.response.b.b.cD(r0)
            long r3 = com.kwad.sdk.core.response.b.b.cE(r0)
            com.kwad.sdk.core.local.a.e(r1, r3)
            if (r2 == 0) goto L58
            java.util.Iterator r0 = r2.iterator()
        L48:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.j.a$a r1 = (com.kwad.components.core.j.a.InterfaceC0078a) r1
            r1.e(r6)
            goto L48
        L58:
            return
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void onError(int r3, java.lang.String r4) {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.util.List r0 = r0.gR()
            if (r0 == 0) goto L1c
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.j.a$a r1 = (com.kwad.components.core.j.a.InterfaceC0078a) r1
            r1.onError(r3, r4)
            goto Lc
        L1c:
            return
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void onRequestResult(int r3) {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.util.List r0 = r0.gR()
            if (r0 == 0) goto L1c
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.j.a$a r1 = (com.kwad.components.core.j.a.InterfaceC0078a) r1
            r1.onRequestResult(r3)
            goto Lc
        L1c:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            return
    }
}
