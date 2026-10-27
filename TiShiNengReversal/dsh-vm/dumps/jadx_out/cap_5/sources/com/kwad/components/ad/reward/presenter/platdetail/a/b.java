package com.kwad.components.ad.reward.presenter.platdetail.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener {
    private com.kwad.components.core.video.m jE;
    private android.widget.TextView ka;
    private long kc;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;



    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.platdetail.a.b$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.b$1
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.platdetail.a.b r0) {
            r0.m4do()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.platdetail.a.b r0, long r1) {
            r0.k(r1)
            return
    }

    private void dm() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r2.mApkDownloadHelper = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            long r0 = com.kwad.sdk.core.response.b.d.dX(r0)
            r2.kc = r0
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.a(r1)
            return
    }

    private void dn() {
            r2 = this;
            android.widget.TextView r0 = r2.ka
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L9
            return
        L9:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.d.dY(r0)
            android.widget.TextView r1 = r2.ka
            r1.setText(r0)
            android.widget.TextView r0 = r2.ka
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.ka
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.ka
            com.kwad.components.ad.reward.presenter.platdetail.a.b$2 r1 = new com.kwad.components.ad.reward.presenter.platdetail.a.b$2
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    /* renamed from: do, reason: not valid java name */
    private void m4do() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.lang.String r1 = "native_id"
            r0.D(r1)
            return
    }

    private void k(long r4) {
            r3 = this;
            long r0 = r3.kc
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            r3.dn()
        L9:
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
    public final void onClick(android.view.View r9) {
            r8 = this;
            android.widget.TextView r0 = r8.ka
            if (r9 != r0) goto L19
            com.kwad.components.ad.reward.g r1 = r8.tm
            android.content.Context r3 = r9.getContext()
            com.kwad.components.ad.reward.g r9 = r8.tm
            com.kwad.components.ad.reward.m.e r9 = r9.rE
            long r6 = r9.getPlayDuration()
            r2 = 1
            r4 = 40
            r5 = 1
            r1.a(r2, r3, r4, r5, r6)
        L19:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_detail_call_btn
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ka = r0
            java.lang.String r1 = "topBarCallLabel"
            r0.setContentDescription(r1)
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
            android.widget.TextView r0 = r2.ka
            r1 = 8
            r0.setVisibility(r1)
            return
    }
}
