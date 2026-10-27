package com.kwad.components.ad.nativead;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.sdk.widget.KSFrameLayout {
    private com.kwad.sdk.widget.l eF;
    private com.kwad.components.core.widget.a.b fg;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;
    private com.kwad.sdk.mvp.Presenter mPresenter;
    private com.kwad.sdk.api.KsNativeAd.VideoPlayListener oQ;
    private com.kwad.components.ad.nativead.d.a oW;
    private com.kwad.sdk.core.view.AdBasePvFrameLayout pl;
    private com.kwad.components.ad.nativead.a.b pq;
    public com.kwad.components.ad.nativead.c.a pr;
    private com.kwad.sdk.api.KsAdVideoPlayConfig ps;
    private boolean pt;
    private boolean pu;



    public f(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private f(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r3 = 0
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private f(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.pt = r3
            r0.pu = r3
            com.kwad.components.ad.nativead.f$1 r2 = new com.kwad.components.ad.nativead.f$1
            r2.<init>(r0)
            r0.eF = r2
            r0.B(r1)
            return
    }

    private void B(android.content.Context r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_native_video_layout
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.sdk.core.view.AdBasePvFrameLayout r2 = (com.kwad.sdk.core.view.AdBasePvFrameLayout) r2
            r1.pl = r2
            int r0 = com.kwad.sdk.R.id.ksad_video_player
            android.view.View r2 = r2.findViewById(r0)
            com.kwad.components.core.video.DetailVideoView r2 = (com.kwad.components.core.video.DetailVideoView) r2
            r1.mDetailVideoView = r2
            r0 = 1
            r2.setAd(r0)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.nativead.f r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.a.b b(com.kwad.components.ad.nativead.f r0) {
            com.kwad.components.core.widget.a.b r0 = r0.fg
            return r0
    }

    private com.kwad.sdk.mvp.Presenter bD() {
            r3 = this;
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            com.kwad.components.ad.nativead.b.e r1 = new com.kwad.components.ad.nativead.b.e
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.nativead.b.c r1 = new com.kwad.components.ad.nativead.b.c
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.nativead.b.i r1 = new com.kwad.components.ad.nativead.b.i
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.nativead.b.j r1 = new com.kwad.components.ad.nativead.b.j
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.nativead.b.d r1 = new com.kwad.components.ad.nativead.b.d
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.nativead.b.b r1 = new com.kwad.components.ad.nativead.b.b
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.nativead.b.k r1 = new com.kwad.components.ad.nativead.b.k
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.nativead.b.a r1 = new com.kwad.components.ad.nativead.b.a
            com.kwad.sdk.api.KsAdVideoPlayConfig r2 = r3.ps
            r1.<init>(r2)
            r0.a(r1)
            com.kwad.components.ad.nativead.b.g r1 = new com.kwad.components.ad.nativead.b.g
            r1.<init>()
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r1 == 0) goto L64
            com.kwad.components.ad.nativead.b.f r1 = new com.kwad.components.ad.nativead.b.f
            r1.<init>()
            r0.a(r1)
            return r0
        L64:
            com.kwad.components.ad.nativead.b.h r1 = new com.kwad.components.ad.nativead.b.h
            r1.<init>()
            r0.a(r1)
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b c(com.kwad.components.ad.nativead.f r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ com.kwad.sdk.mvp.Presenter d(com.kwad.components.ad.nativead.f r0) {
            com.kwad.sdk.mvp.Presenter r0 = r0.mPresenter
            return r0
    }

    private com.kwad.components.ad.nativead.a.b fv() {
            r3 = this;
            com.kwad.components.ad.nativead.a.b r0 = new com.kwad.components.ad.nativead.a.b
            r0.<init>()
            com.kwad.sdk.core.view.AdBasePvFrameLayout r1 = r3.pl
            r0.pl = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.mAdTemplate = r1
            com.kwad.components.ad.nativead.d$a r2 = r3.oW
            r0.oW = r2
            com.kwad.sdk.api.KsNativeAd$VideoPlayListener r2 = r3.oQ
            r0.oQ = r2
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r1 == 0) goto L34
            com.kwad.components.core.e.d.c r1 = r3.mApkDownloadHelper
            if (r1 != 0) goto L2d
            com.kwad.components.core.e.d.c r1 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r1.<init>(r2)
            r0.mApkDownloadHelper = r1
            goto L34
        L2d:
            r1.pz()
            com.kwad.components.core.e.d.c r1 = r3.mApkDownloadHelper
            r0.mApkDownloadHelper = r1
        L34:
            boolean r1 = r3.pu
            r0.px = r1
            boolean r1 = r3.pt
            r0.pw = r1
            com.kwad.components.ad.nativead.c.a r1 = r3.pr
            r0.pr = r1
            return r0
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r2, @androidx.annotation.Nullable com.kwad.sdk.api.KsAdVideoPlayConfig r3) {
            r0 = this;
            r0.mAdTemplate = r1
            r0.mApkDownloadHelper = r2
            r0.ps = r3
            com.kwad.sdk.core.view.AdBasePvFrameLayout r1 = r0.pl
            com.kwad.sdk.widget.l r2 = r0.eF
            r1.setVisibleListener(r2)
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L15
            r1 = r0
            goto L1b
        L15:
            android.view.ViewParent r1 = r0.getParent()
            android.view.View r1 = (android.view.View) r1
        L1b:
            com.kwad.components.core.widget.a.b r2 = new com.kwad.components.core.widget.a.b
            r3 = 30
            r2.<init>(r1, r3)
            r0.fg = r2
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r5 = this;
            super.aa()
            com.kwad.components.ad.nativead.c.a r0 = r5.pr
            if (r0 != 0) goto L16
            com.kwad.components.ad.nativead.c.a r0 = new com.kwad.components.ad.nativead.c.a
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.components.core.widget.a.b r2 = r5.fg
            com.kwad.components.core.video.DetailVideoView r3 = r5.mDetailVideoView
            com.kwad.sdk.api.KsAdVideoPlayConfig r4 = r5.ps
            r0.<init>(r1, r2, r3, r4)
            r5.pr = r0
        L16:
            com.kwad.components.ad.nativead.a.b r0 = r5.fv()
            r5.pq = r0
            com.kwad.sdk.mvp.Presenter r0 = r5.bD()
            r5.mPresenter = r0
            com.kwad.sdk.core.view.AdBasePvFrameLayout r1 = r5.pl
            r0.K(r1)
            com.kwad.sdk.mvp.Presenter r0 = r5.mPresenter
            com.kwad.components.ad.nativead.a.b r1 = r5.pq
            r0.n(r1)
            com.kwad.components.core.widget.a.b r0 = r5.fg
            r0.wi()
            com.kwad.components.ad.nativead.c.a r0 = r5.pr
            r0.bo()
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r1 = this;
            super.ab()
            com.kwad.components.ad.nativead.f$2 r0 = new com.kwad.components.ad.nativead.f$2
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final void g(int r2, int r3) {
            r1 = this;
            r0 = 1
            if (r2 != 0) goto L5
            r1.pu = r0
        L5:
            if (r3 != 0) goto L9
            r1.pt = r0
        L9:
            return
    }

    public final void setInnerAdInteractionListener(com.kwad.components.ad.nativead.d.a r1) {
            r0 = this;
            r0.oW = r1
            return
    }

    public final void setPlayState(int r2) {
            r1 = this;
            com.kwad.components.ad.nativead.c.a r0 = r1.pr
            if (r0 == 0) goto L7
            r0.V(r2)
        L7:
            return
    }

    public final void setVideoPlayListener(com.kwad.sdk.api.KsNativeAd.VideoPlayListener r1) {
            r0 = this;
            r0.oQ = r1
            return
    }
}
