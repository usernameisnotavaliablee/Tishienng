package com.kwad.components.ad.reward.presenter.platdetail.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener {
    private final com.kwad.components.core.video.m jE;
    private final com.kwad.components.ad.reward.e.e kl;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private android.widget.ImageView yG;
    private android.widget.TextView yH;
    private boolean yI;
    private android.view.View yJ;
    private long yK;




    public c() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.yI = r0
            r0 = 0
            r2.yJ = r0
            r0 = -1
            r2.yK = r0
            com.kwad.components.ad.reward.presenter.platdetail.a.c$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.c$1
            r0.<init>(r2)
            r2.jE = r0
            com.kwad.components.ad.reward.presenter.platdetail.a.c$2 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.c$2
            r0.<init>(r2)
            r2.kl = r0
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.reward.presenter.platdetail.a.c r2) {
            long r0 = r2.yK
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.platdetail.a.c r0, boolean r1) {
            r1 = 1
            r0.yI = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo b(com.kwad.components.ad.reward.presenter.platdetail.a.c r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.ad.reward.presenter.platdetail.a.c r0) {
            r0.jy()
            return
    }

    static /* synthetic */ android.view.View d(com.kwad.components.ad.reward.presenter.platdetail.a.c r0) {
            android.view.View r0 = r0.yJ
            return r0
    }

    private void dm() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r5.mAdInfo = r0
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r5.jE
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r5.tm
            java.util.Set<com.kwad.components.ad.reward.e.e> r0 = r0.rO
            com.kwad.components.ad.reward.e.e r1 = r5.kl
            r0.add(r1)
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            long r0 = com.kwad.sdk.core.response.b.a.af(r0)
            r5.yK = r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            android.view.View r0 = r5.yJ
            r1 = 0
            r0.setVisibility(r1)
            return
        L2f:
            android.view.View r0 = r5.yJ
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    private void jy() {
            r2 = this;
            android.view.View r0 = r2.yJ
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L9
            return
        L9:
            android.view.View r0 = r2.yJ
            r1 = 0
            r0.setAlpha(r1)
            android.view.View r0 = r2.yJ
            r1 = 0
            r0.setVisibility(r1)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.kwad.components.ad.reward.presenter.platdetail.a.c$3 r1 = new com.kwad.components.ad.reward.presenter.platdetail.a.c$3
            r1.<init>(r2)
            r0.addUpdateListener(r1)
            r0.start()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            r0.dm()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.yJ
            if (r2 != r0) goto Lb
            com.kwad.components.ad.reward.g r2 = r1.tm
            boolean r0 = r1.yI
            com.kwad.components.ad.reward.presenter.f.a(r2, r0)
        Lb:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_detail_close_btn
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.yG = r0
            int r0 = com.kwad.sdk.R.id.ksad_top_toolbar_close_tip
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.yH = r0
            java.lang.String r0 = com.kwad.components.ad.reward.a.b.hA()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2f
            android.widget.TextView r0 = r2.yH
            java.lang.String r1 = com.kwad.components.ad.reward.a.b.hA()
            r0.setText(r1)
            android.widget.TextView r0 = r2.yH
            r2.yJ = r0
            goto L48
        L2f:
            int r0 = com.kwad.components.ad.reward.a.b.hz()
            if (r0 != 0) goto L3d
            android.widget.ImageView r0 = r2.yG
            int r1 = com.kwad.sdk.R.drawable.ksad_page_close
            r0.setImageResource(r1)
            goto L44
        L3d:
            android.widget.ImageView r0 = r2.yG
            int r1 = com.kwad.sdk.R.drawable.ksad_video_skip_icon
            r0.setImageResource(r1)
        L44:
            android.widget.ImageView r0 = r2.yG
            r2.yJ = r0
        L48:
            android.view.View r0 = r2.yJ
            r0.setOnClickListener(r2)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.util.Set<com.kwad.components.ad.reward.e.e> r0 = r0.rO
            com.kwad.components.ad.reward.e.e r1 = r2.kl
            r0.remove(r1)
            android.view.View r0 = r2.yJ
            r1 = 8
            r0.setVisibility(r1)
            return
    }
}
