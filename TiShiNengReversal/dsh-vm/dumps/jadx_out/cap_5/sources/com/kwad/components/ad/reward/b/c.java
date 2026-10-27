package com.kwad.components.ad.reward.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.b.b.a {
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private boolean uc;


    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.uc = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.reward.b.c r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.b.c r0, boolean r1) {
            r1 = 1
            r0.uc = r1
            return r1
    }

    private static boolean l(com.kwad.sdk.core.response.model.AdInfo r1) {
            com.kwad.sdk.core.response.model.AdProductInfo r0 = com.kwad.sdk.core.response.b.a.cV(r1)
            boolean r1 = com.kwad.components.ad.reward.a.b.i(r1)
            if (r1 == 0) goto L14
            if (r0 == 0) goto L14
            boolean r1 = r0.isCouponListEmpty()
            if (r1 != 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1.mAdTemplate = r0
            return
    }

    @Override // com.kwad.components.ad.reward.b.b.a
    public final void hT() {
            r4 = this;
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r1 = r4.getContext()
            r2 = 29
            r3 = 1
            r0.a(r3, r1, r2, r3)
            return
    }

    public final void showDialog() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onBind hasShown : "
            r0.<init>(r1)
            boolean r1 = r3.uc
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardCouponDialogPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r3.uc
            if (r0 == 0) goto L1a
            goto L4e
        L1a:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            int r2 = com.kwad.sdk.R.id.ksad_reward_order_coupon_list
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L2f
            goto L4e
        L2f:
            int r2 = r1.getChildCount()
            if (r2 <= 0) goto L3a
            r2 = 0
            android.view.View r1 = r1.getChildAt(r2)
        L3a:
            int[] r2 = com.kwad.sdk.c.a.a.I(r1)
            boolean r0 = l(r0)
            if (r0 == 0) goto L4e
            if (r2 == 0) goto L4e
            com.kwad.components.ad.reward.b.c$1 r0 = new com.kwad.components.ad.reward.b.c$1
            r0.<init>(r3, r2)
            r1.post(r0)
        L4e:
            return
    }
}
