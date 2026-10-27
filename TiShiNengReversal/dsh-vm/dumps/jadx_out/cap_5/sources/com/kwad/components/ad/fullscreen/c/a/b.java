package com.kwad.components.ad.fullscreen.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener {
    private com.kwad.components.core.video.m jE;
    private android.widget.TextView ka;
    private java.lang.String kb;
    private long kc;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;



    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.fullscreen.c.a.b$1 r0 = new com.kwad.components.ad.fullscreen.c.a.b$1
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.fullscreen.c.a.b r0) {
            r0.notifyAdClick()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.fullscreen.c.a.b r0, long r1) {
            r0.k(r1)
            return
    }

    private void dm() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            long r0 = com.kwad.sdk.core.response.b.d.dX(r0)
            r2.kc = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.d.dY(r0)
            r2.kb = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L17
            return
        L17:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.core.e.d.c r1 = r0.mApkDownloadHelper
            r2.mApkDownloadHelper = r1
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
            r2.m1do()
            return
    }

    /* renamed from: do, reason: not valid java name */
    private void m1do() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.components.ad.reward.g r1 = r3.tm
            org.json.JSONObject r1 = r1.mReportExtData
            r2 = 18
            com.kwad.sdk.core.adlog.c.b(r0, r2, r1)
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

    private void notifyAdClick() {
            r3 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r0 = r0.f(r1)
            r1 = 40
            com.kwad.sdk.core.adlog.c.b r0 = r0.dd(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.components.ad.reward.g r2 = r3.tm
            org.json.JSONObject r2 = r2.mReportExtData
            com.kwad.sdk.core.adlog.c.a(r1, r0, r2)
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            r0.cW()
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
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.widget.TextView r0 = r2.ka
            if (r3 != r0) goto L43
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r0.aB(r3)
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r3 = r3.b(r0)
            r0 = 40
            com.kwad.components.core.e.d.a$a r3 = r3.aA(r0)
            r0 = 1
            com.kwad.components.core.e.d.a$a r3 = r3.az(r0)
            r1 = 0
            com.kwad.components.core.e.d.a$a r3 = r3.aq(r1)
            com.kwad.components.ad.reward.g r1 = r2.tm
            java.lang.String r1 = r1.gI()
            com.kwad.components.core.e.d.a$a r3 = r3.al(r1)
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r0)
            com.kwad.components.ad.fullscreen.c.a.b$2 r0 = new com.kwad.components.ad.fullscreen.c.a.b$2
            r0.<init>(r2)
            com.kwad.components.core.e.d.a$a r3 = r3.a(r0)
            com.kwad.components.core.e.d.a.a(r3)
        L43:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_detail_call_btn
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.ka = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 0
            r1.ka = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            java.lang.String r0 = r2.kb
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
        L14:
            return
    }
}
