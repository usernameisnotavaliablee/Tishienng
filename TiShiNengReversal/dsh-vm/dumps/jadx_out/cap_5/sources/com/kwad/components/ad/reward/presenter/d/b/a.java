package com.kwad.components.ad.reward.presenter.d.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener, com.kwad.components.ad.reward.presenter.d.b.c {
    private android.widget.TextView zg;
    private android.widget.TextView zh;


    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.d.b.a r0) {
            r0.jN()
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.presenter.d.b.a r0) {
            r0.notifyAdClick()
            return
    }

    /* renamed from: do, reason: not valid java name */
    private void m3do() {
            r3 = this;
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            r2 = 17
            org.json.JSONObject r0 = r0.mReportExtData
            com.kwad.sdk.core.adlog.c.b(r1, r2, r0)
            return
    }

    private void jM() {
            r5 = this;
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.d.dZ(r0)
            com.kwad.components.ad.reward.g r1 = r5.tm
            int r1 = r1.mScreenOrientation
            r2 = 1
            r3 = 0
            r4 = 8
            if (r1 != r2) goto L27
            android.widget.TextView r1 = r5.zh
            r1.setVisibility(r4)
            android.widget.TextView r1 = r5.zg
            r1.setText(r0)
            android.widget.TextView r0 = r5.zg
            r0.setVisibility(r3)
            android.widget.TextView r0 = r5.zg
            r0.setOnClickListener(r5)
            goto L3b
        L27:
            android.widget.TextView r1 = r5.zg
            r1.setVisibility(r4)
            android.widget.TextView r1 = r5.zh
            r1.setText(r0)
            android.widget.TextView r0 = r5.zh
            r0.setVisibility(r3)
            android.widget.TextView r0 = r5.zh
            r0.setOnClickListener(r5)
        L3b:
            r5.m3do()
            return
    }

    private void jN() {
            r5 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.components.ad.reward.g r1 = r5.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r0 = r0.f(r1)
            r1 = 39
            com.kwad.sdk.core.adlog.c.b r0 = r0.dd(r1)
            com.kwad.components.ad.reward.g r1 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            java.lang.String r3 = "endTopBar"
            org.json.JSONObject r1 = r1.mReportExtData
            java.lang.String r4 = "native_id"
            com.kwad.components.ad.reward.j.b.a(r2, r4, r3, r0, r1)
            return
    }

    private void notifyAdClick() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            r0.cW()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.d.b.c
    public final void jO() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            boolean r0 = r0.sf
            if (r0 == 0) goto L7
            return
        L7:
            r1.jM()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.widget.TextView r0 = r1.zg
            if (r2 == r0) goto La
            android.widget.TextView r0 = r1.zh
            if (r2 != r0) goto L9
            goto La
        L9:
            return
        La:
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            com.kwad.components.ad.reward.g r2 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r0.aB(r2)
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r2 = r2.b(r0)
            r0 = 0
            com.kwad.components.core.e.d.a$a r2 = r2.aq(r0)
            r0 = 1
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r0)
            com.kwad.components.ad.reward.presenter.d.b.a$1 r0 = new com.kwad.components.ad.reward.presenter.d.b.a$1
            r0.<init>(r1)
            com.kwad.components.core.e.d.a$a r2 = r2.a(r0)
            com.kwad.components.core.e.d.a.a(r2)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_end_left_call_btn
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.zg = r0
            int r0 = com.kwad.sdk.R.id.ksad_end_right_call_btn
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.zh = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            android.widget.TextView r0 = r2.zg
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.zh
            r0.setVisibility(r1)
            return
    }
}
