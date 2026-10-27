package com.kwad.components.ad.reward.presenter.platdetail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.reward.presenter.b implements com.kwad.sdk.widget.d {
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;


    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private void L(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L5
            r5 = 85
            goto L7
        L5:
            r5 = 153(0x99, float:2.14E-43)
        L7:
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.sdk.core.adlog.c.b r5 = r0.dd(r5)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            com.kwad.sdk.utils.aj$a r0 = r0.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r5 = r5.f(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.components.ad.reward.g r1 = r4.tm
            org.json.JSONObject r1 = r1.mReportExtData
            java.lang.String r2 = "native_id"
            java.lang.String r3 = "videoPlayer"
            com.kwad.components.ad.reward.j.b.a(r0, r2, r3, r5, r1)
            com.kwad.components.ad.reward.g r5 = r4.tm
            com.kwad.components.ad.reward.e.b r5 = r5.rD
            r5.cW()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.platdetail.c r0, boolean r1) {
            r0.L(r1)
            return
    }

    private void d(android.view.View r3, boolean r4) {
            r2 = this;
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r0.aB(r3)
            com.kwad.components.ad.reward.presenter.platdetail.c$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.c$1
            r0.<init>(r2, r4)
            com.kwad.components.core.e.d.a$a r3 = r3.a(r0)
            com.kwad.components.core.e.d.c r4 = r2.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r3 = r3.b(r4)
            r4 = 0
            com.kwad.components.core.e.d.a$a r3 = r3.aq(r4)
            com.kwad.components.ad.reward.g r4 = r2.tm
            long r0 = r4.si
            com.kwad.components.core.e.d.a$a r3 = r3.A(r0)
            r4 = 3
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r4)
            com.kwad.components.core.e.d.a.a(r3)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.d(r2, r0)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r2.mApkDownloadHelper = r0
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            com.kwad.components.core.video.DetailVideoView r1 = r2.mDetailVideoView
            r0.<init>(r1, r2)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.aY(r0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = "#B3000000"
            goto L21
        L1f:
            java.lang.String r0 = "#4D000000"
        L21:
            int r0 = android.graphics.Color.parseColor(r0)
            com.kwad.components.core.video.DetailVideoView r1 = r2.mDetailVideoView
            r1.setBackgroundColor(r0)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            r1.d(r2, r0)
        Lc:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_player
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r1.mDetailVideoView = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.core.video.DetailVideoView r0 = r2.mDetailVideoView
            r1 = 0
            r0.setClickListener(r1)
            return
    }
}
