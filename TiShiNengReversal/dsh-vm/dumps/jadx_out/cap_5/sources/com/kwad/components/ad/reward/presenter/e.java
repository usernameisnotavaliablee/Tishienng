package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;


    public e(com.kwad.sdk.core.response.model.AdInfo r3, android.view.ViewGroup r4) {
            r2 = this;
            r2.<init>()
            r2.mAdInfo = r3
            boolean r0 = com.kwad.components.ad.reward.a.b.i(r3)
            if (r0 == 0) goto L3a
            com.kwad.components.ad.reward.b.c r3 = new com.kwad.components.ad.reward.b.c
            r3.<init>()
            r2.a(r3)
            int r0 = com.kwad.sdk.R.id.ksad_reward_order_card
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L24
            android.view.View r4 = r0.inflate()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L2c
        L24:
            int r0 = com.kwad.sdk.R.id.ksad_reward_order_root
            android.view.View r4 = r4.findViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L2c:
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.e r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.e
            com.kwad.components.ad.reward.presenter.e$1 r1 = new com.kwad.components.ad.reward.presenter.e$1
            r1.<init>(r2, r3)
            r0.<init>(r4, r1)
            r2.a(r0)
            return
        L3a:
            int r3 = com.kwad.sdk.core.response.b.a.ci(r3)
            r0 = 1
            if (r3 != r0) goto L62
            int r3 = com.kwad.sdk.R.id.ksad_reward_jinniu_card
            android.view.View r3 = r4.findViewById(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            if (r3 == 0) goto L52
            android.view.View r3 = r3.inflate()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L5a
        L52:
            int r3 = com.kwad.sdk.R.id.ksad_reward_jinniu_root
            android.view.View r3 = r4.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L5a:
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.d r4 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.d
            r4.<init>(r3)
            r2.a(r4)
        L62:
            return
    }
}
