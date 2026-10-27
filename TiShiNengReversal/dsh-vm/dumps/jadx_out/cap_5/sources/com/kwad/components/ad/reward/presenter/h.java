package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends com.kwad.components.ad.reward.presenter.b implements com.kwad.sdk.app.a {
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.app.a
    public final void U(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ay(r0)
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            if (r2 != 0) goto Ld
            goto L23
        Ld:
            com.kwad.components.ad.reward.g r2 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r0 = com.kwad.sdk.core.response.b.a.aO(r2)
            if (r0 == 0) goto L24
            int r2 = com.kwad.sdk.core.response.b.a.aN(r2)
            r0 = 1
            if (r2 == r0) goto L23
            goto L24
        L23:
            return
        L24:
            com.kwad.components.ad.reward.g r2 = r1.tm
            com.kwad.components.ad.reward.e.b r2 = r2.rD
            if (r2 == 0) goto L2d
            r2.onRewardVerify()
        L2d:
            com.kwad.components.ad.reward.g r2 = r1.tm
            com.kwad.components.ad.reward.m.e r2 = r2.rE
            r2.pause()
            com.kwad.components.ad.reward.g r2 = r1.tm
            r2.gK()
            return
    }

    @Override // com.kwad.sdk.app.a
    public final void V(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r1.mAdInfo = r0
            com.kwad.sdk.app.b r0 = com.kwad.sdk.app.b.Dw()
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.sdk.app.b r0 = com.kwad.sdk.app.b.Dw()
            r0.b(r1)
            return
    }
}
