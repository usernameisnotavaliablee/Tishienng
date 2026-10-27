package com.kwad.components.ad.fullscreen.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener {
    private com.kwad.components.core.video.m jE;
    private android.widget.ImageView ki;
    private android.widget.TextView kj;
    private android.view.View kk;
    private com.kwad.components.ad.reward.e.e kl;




    public d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.kk = r0
            com.kwad.components.ad.fullscreen.c.a.d$1 r0 = new com.kwad.components.ad.fullscreen.c.a.d$1
            r0.<init>(r1)
            r1.kl = r0
            com.kwad.components.ad.fullscreen.c.a.d$2 r0 = new com.kwad.components.ad.fullscreen.c.a.d$2
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.fullscreen.c.a.d r0) {
            r0.dp()
            return
    }

    static /* synthetic */ android.view.View b(com.kwad.components.ad.fullscreen.c.a.d r0) {
            android.view.View r0 = r0.kk
            return r0
    }

    private void dm() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.util.Set<com.kwad.components.ad.reward.e.e> r0 = r0.rO
            com.kwad.components.ad.reward.e.e r1 = r2.kl
            r0.add(r1)
            return
    }

    private void dp() {
            r2 = this;
            android.view.View r0 = r2.kk
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L9
            return
        L9:
            android.view.View r0 = r2.kk
            r1 = 0
            r0.setAlpha(r1)
            android.view.View r0 = r2.kk
            r1 = 0
            r0.setVisibility(r1)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.kwad.components.ad.fullscreen.c.a.d$3 r1 = new com.kwad.components.ad.fullscreen.c.a.d$3
            r1.<init>(r2)
            r0.addUpdateListener(r1)
            r0.start()
            android.view.View r0 = r2.kk
            r0.setOnClickListener(r2)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            r0.dm()
            return
    }

    public final void k(long r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            long r0 = com.kwad.sdk.core.response.b.a.al(r0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L11
            r3.dp()
        L11:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.kk
            if (r2 != r0) goto La
            com.kwad.components.ad.reward.g r2 = r1.tm
            r0 = 0
            com.kwad.components.ad.reward.presenter.f.a(r2, r0)
        La:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r3 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_skip_icon
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.ki = r0
            int r0 = com.kwad.sdk.R.id.ksad_top_toolbar_close_tip
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.kj = r0
            java.lang.String r0 = com.kwad.components.ad.fullscreen.a.b.cZ()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 8
            if (r0 != 0) goto L36
            android.widget.TextView r0 = r3.kj
            java.lang.String r2 = com.kwad.components.ad.fullscreen.a.b.cZ()
            r0.setText(r2)
            android.widget.ImageView r0 = r3.ki
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.kj
            r3.kk = r0
            return
        L36:
            int r0 = com.kwad.components.ad.fullscreen.a.b.cY()
            if (r0 != 0) goto L44
            android.widget.ImageView r0 = r3.ki
            int r2 = com.kwad.sdk.R.drawable.ksad_page_close
            r0.setImageResource(r2)
            goto L4b
        L44:
            android.widget.ImageView r0 = r3.ki
            int r2 = com.kwad.sdk.R.drawable.ksad_video_skip_icon
            r0.setImageResource(r2)
        L4b:
            android.widget.TextView r0 = r3.kj
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.ki
            r3.kk = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.util.Set<com.kwad.components.ad.reward.e.e> r0 = r0.rO
            com.kwad.components.ad.reward.e.e r1 = r2.kl
            r0.remove(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            return
    }
}
