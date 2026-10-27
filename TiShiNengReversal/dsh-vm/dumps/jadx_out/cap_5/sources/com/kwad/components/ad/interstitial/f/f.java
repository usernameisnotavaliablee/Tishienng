package com.kwad.components.ad.interstitial.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.ad.interstitial.f.b implements com.kwad.sdk.widget.d {

    @androidx.annotation.NonNull
    private com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private java.util.List<java.lang.Integer> ck;
    private com.kwad.sdk.core.video.videoview.a cq;
    private com.kwad.sdk.core.video.videoview.a.InterfaceC0149a cz;
    private com.kwad.sdk.widget.KSFrameLayout fC;
    private android.widget.ImageView hM;
    private final com.kwad.components.core.video.a.InterfaceC0092a hQ;
    protected com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    @androidx.annotation.NonNull
    protected android.content.Context mContext;

    @androidx.annotation.Nullable
    private boolean mIsAudioEnable;
    private com.kwad.components.ad.interstitial.f.c mj;
    private com.kwad.sdk.widget.KSFrameLayout ni;
    private com.kwad.components.core.video.f nj;





    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsAudioEnable = r0
            com.kwad.components.ad.interstitial.f.f$4 r0 = new com.kwad.components.ad.interstitial.f.f$4
            r0.<init>(r1)
            r1.hQ = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.interstitial.f.f r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.interstitial.f.f r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ com.kwad.components.ad.interstitial.f.c b(com.kwad.components.ad.interstitial.f.f r0) {
            com.kwad.components.ad.interstitial.f.c r0 = r0.mj
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.interstitial.f.f r0, long r1) {
            r0.l(r1)
            return
    }

    private com.kwad.components.ad.interstitial.f.c.C0024c c(android.view.View r2, boolean r3) {
            r1 = this;
            com.kwad.components.ad.interstitial.f.c$c r0 = new com.kwad.components.ad.interstitial.f.c$c
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            com.kwad.components.ad.interstitial.f.c$c r2 = r0.l(r3)
            com.kwad.sdk.widget.KSFrameLayout r3 = r1.ni
            com.kwad.sdk.utils.aj$a r3 = r3.getTouchCoords()
            com.kwad.components.ad.interstitial.f.c$c r2 = r2.a(r3)
            r3 = 3
            com.kwad.components.ad.interstitial.f.c$c r2 = r2.L(r3)
            r3 = 85
            com.kwad.components.ad.interstitial.f.c$c r2 = r2.M(r3)
            return r2
    }

    static /* synthetic */ com.kwad.sdk.core.video.videoview.a c(com.kwad.components.ad.interstitial.f.f r0) {
            com.kwad.sdk.core.video.videoview.a r0 = r0.cq
            return r0
    }

    private void c(long r3) {
            r2 = this;
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            java.util.List<java.lang.Integer> r4 = r2.ck
            if (r4 == 0) goto L36
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L15
            goto L36
        L15:
            java.util.List<java.lang.Integer> r4 = r2.ck
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 < r0) goto L1b
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r0, r3, r1)
            r4.remove()
        L36:
            return
    }

    static /* synthetic */ android.content.Context d(com.kwad.components.ad.interstitial.f.f r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.core.e.d.c e(com.kwad.components.ad.interstitial.f.f r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            return r0
    }

    private void ex() {
            r9 = this;
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r9.bU
            boolean r0 = r0.isVideoSoundEnable()
            r9.mIsAudioEnable = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            java.lang.String r0 = r0.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L2c
            android.widget.ImageView r1 = r9.hM
            r1.setImageDrawable(r2)
            android.widget.ImageView r1 = r9.hM
            com.kwad.sdk.core.response.model.AdTemplate r3 = r9.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r3)
            android.widget.ImageView r0 = r9.hM
            r1 = 0
            r0.setVisibility(r1)
            goto L33
        L2c:
            android.widget.ImageView r0 = r9.hM
            r1 = 8
            r0.setVisibility(r1)
        L33:
            int r0 = com.kwad.sdk.core.config.e.BQ()
            com.kwad.sdk.core.response.model.AdInfo r1 = r9.mAdInfo
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.K(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L44
            goto L9a
        L44:
            if (r0 >= 0) goto L5e
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r0 = r0.cf(r4)
            if (r0 == 0) goto L5c
            boolean r1 = r0.exists()
            if (r1 == 0) goto L5c
            java.lang.String r0 = r0.getAbsolutePath()
        L5a:
            r4 = r0
            goto L94
        L5c:
            r4 = r2
            goto L94
        L5e:
            if (r0 != 0) goto L61
            goto L94
        L61:
            android.content.Context r0 = r9.mContext
            com.kwad.sdk.core.videocache.f r3 = com.kwad.sdk.core.videocache.c.a.bR(r0)
            boolean r0 = com.kwad.sdk.core.config.e.EU()
            if (r0 == 0) goto L90
            int r0 = com.kwad.sdk.core.config.e.BQ()
            boolean r1 = r3.eL(r4)
            if (r1 != 0) goto L8b
            com.kwad.sdk.core.network.a.a$a r7 = new com.kwad.sdk.core.network.a.a$a
            r7.<init>()
            int r0 = r0 * 1024
            long r5 = (long) r0
            r8 = 0
            boolean r0 = r3.a(r4, r5, r7, r8)
            if (r0 == 0) goto L94
            java.lang.String r0 = r3.eJ(r4)
            goto L5a
        L8b:
            java.lang.String r0 = r3.eJ(r4)
            goto L5a
        L90:
            java.lang.String r4 = r3.eJ(r4)
        L94:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L9b
        L9a:
            return
        L9b:
            com.kwad.sdk.contentalliance.a.a.b$a r0 = new com.kwad.sdk.contentalliance.a.a.b$a
            com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            r0.<init>(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dg(r4)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r1 = com.kwad.sdk.core.response.b.e.em(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.h.b(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dh(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = r1.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.a(r1)
            com.kwad.sdk.contentalliance.a.a.a r1 = new com.kwad.sdk.contentalliance.a.a.a
            com.kwad.sdk.core.response.model.AdTemplate r3 = r9.mAdTemplate
            long r4 = java.lang.System.currentTimeMillis()
            r1.<init>(r3, r4)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.b(r1)
            com.kwad.sdk.contentalliance.a.a.b r0 = r0.El()
            com.kwad.sdk.core.video.videoview.a r1 = r9.cq
            r1.a(r0, r2)
            com.kwad.components.ad.interstitial.f.f$1 r0 = new com.kwad.components.ad.interstitial.f.f$1
            r0.<init>(r9)
            r9.cz = r0
            com.kwad.sdk.core.video.videoview.a r1 = r9.cq
            r1.setExternalPlayerListener(r0)
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            boolean r1 = r9.mIsAudioEnable
            r0.setVideoSoundEnable(r1)
            long r0 = java.lang.System.currentTimeMillis()
            com.kwad.components.ad.interstitial.report.d r2 = com.kwad.components.ad.interstitial.report.d.eU()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r9.mAdTemplate
            r2.E(r3)
            com.kwad.components.core.video.f r2 = r9.nj
            com.kwad.components.ad.interstitial.f.f$2 r3 = new com.kwad.components.ad.interstitial.f.f$2
            r3.<init>(r9, r0)
            r2.setVideoPlayCallback(r3)
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            com.kwad.components.core.video.f r1 = r9.nj
            r0.setController(r1)
            com.kwad.sdk.widget.KSFrameLayout r0 = r9.fC
            r1 = 1
            r0.setClickable(r1)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            com.kwad.sdk.widget.KSFrameLayout r1 = r9.fC
            android.content.Context r1 = r1.getContext()
            com.kwad.sdk.widget.KSFrameLayout r2 = r9.fC
            r0.<init>(r1, r2, r9)
            com.kwad.sdk.widget.KSFrameLayout r0 = r9.fC
            com.kwad.sdk.core.video.videoview.a r1 = r9.cq
            r0.addView(r1)
            com.kwad.components.ad.interstitial.f.c r0 = r9.mj
            com.kwad.components.ad.interstitial.f.f$3 r1 = new com.kwad.components.ad.interstitial.f.f$3
            r1.<init>(r9)
            r0.mr = r1
            return
    }

    static /* synthetic */ android.content.Context f(com.kwad.components.ad.interstitial.f.f r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    private void l(long r4) {
            r3 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r3.mj
            r1 = 1
            r0.ml = r1
            r1 = 1
            r0.c(r1, r4)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            r1 = 1
            com.kwad.components.ad.interstitial.f.c$c r3 = r2.c(r3, r1)
            r0.a(r3)
            return
    }

    @Override // com.kwad.components.ad.interstitial.f.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            java.lang.Object r0 = r4.NN()
            com.kwad.components.ad.interstitial.f.c r0 = (com.kwad.components.ad.interstitial.f.c) r0
            r4.mj = r0
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r0.bU
            r4.bU = r1
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r4.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            java.util.List r0 = com.kwad.sdk.core.response.b.a.bp(r0)
            r4.ck = r0
            com.kwad.components.ad.interstitial.f.c r1 = r4.mj
            com.kwad.sdk.core.video.videoview.a r1 = r1.cq
            r4.cq = r1
            r1.setTag(r0)
            com.kwad.components.core.video.f r0 = new com.kwad.components.core.video.f
            android.content.Context r1 = r4.mContext
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            com.kwad.sdk.core.video.videoview.a r3 = r4.cq
            r0.<init>(r1, r2, r3)
            r4.nj = r0
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r4.bU
            boolean r1 = r1.isDataFlowAutoStart()
            r0.setDataFlowAutoStart(r1)
            com.kwad.components.core.video.f r0 = r4.nj
            com.kwad.components.core.video.a$a r1 = r4.hQ
            r0.setAdClickListener(r1)
            com.kwad.components.core.video.f r0 = r4.nj
            r0.ty()
            com.kwad.components.ad.interstitial.f.c r0 = r4.mj
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r4.mApkDownloadHelper = r0
            r4.ex()
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_interstitial_card_radius
            float r0 = r0.getDimension(r1)
            com.kwad.sdk.widget.KSFrameLayout r1 = r4.fC
            r2 = 0
            r1.setRadius(r0, r0, r2, r2)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            r1 = 0
            com.kwad.components.ad.interstitial.f.c$c r3 = r2.c(r3, r1)
            r0.a(r3)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            android.view.View r0 = r2.getRootView()
            int r1 = com.kwad.sdk.R.id.ksad_container
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r2.ni = r0
            android.view.View r0 = r2.getRootView()
            int r1 = com.kwad.sdk.R.id.ksad_video_container
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r2.fC = r0
            android.view.View r0 = r2.getRootView()
            int r1 = com.kwad.sdk.R.id.ksad_video_first_frame_container
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.hM = r0
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.fC
            r1 = 4
            r0.setVisibility(r1)
            android.content.Context r0 = r2.getContext()
            r2.mContext = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            r1 = 0
            r0.mr = r1
            return
    }
}
