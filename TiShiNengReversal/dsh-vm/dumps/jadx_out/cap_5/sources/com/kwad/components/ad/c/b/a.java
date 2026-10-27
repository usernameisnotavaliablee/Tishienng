package com.kwad.components.ad.c.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.core.m.c<com.kwad.components.ad.c.c> implements android.view.View.OnClickListener, com.kwad.sdk.widget.d {
    private com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private com.kwad.components.core.video.a.b cA;
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener cB;
    private com.kwad.components.ad.c.f ce;
    private java.util.List<java.lang.Integer> ck;
    private android.widget.FrameLayout cl;
    private android.widget.ImageView cm;
    private android.widget.LinearLayout cn;
    private android.widget.ImageView co;
    private boolean cp;
    private com.kwad.sdk.core.video.videoview.a cq;
    private com.kwad.components.ad.c.e cr;
    private android.widget.LinearLayout cs;
    private android.widget.TextView ct;
    private android.widget.TextView cu;
    private android.widget.TextView cv;
    private android.widget.ImageView cw;
    private com.kwad.components.core.widget.KsLogoView cx;
    public com.kwad.components.ad.c.b.a.InterfaceC0008a cy;
    private com.kwad.sdk.core.video.videoview.a.InterfaceC0149a cz;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.internal.api.SceneImpl mAdScene;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private android.content.Context mContext;
    private boolean mIsAudioEnable;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.c.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0008a {
        void a(int r1, int r2, com.kwad.sdk.core.response.model.AdTemplate r3);

        void as();

        void d(com.kwad.sdk.core.response.model.AdTemplate r1);

        void e(com.kwad.sdk.core.response.model.AdTemplate r1);
    }

    public a(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.components.ad.c.b.a.InterfaceC0008a r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.mIsAudioEnable = r1
            com.kwad.components.ad.c.b.a$1 r1 = new com.kwad.components.ad.c.b.a$1
            r1.<init>(r0)
            r0.cA = r1
            com.kwad.components.ad.c.b.a$2 r1 = new com.kwad.components.ad.c.b.a$2
            r1.<init>(r0)
            r0.cB = r1
            r0.mAdTemplate = r2
            com.kwad.sdk.internal.api.SceneImpl r1 = r2.mAdScene
            r0.mAdScene = r1
            r0.cy = r3
            android.content.Context r1 = r0.getContext()
            r0.mContext = r1
            r0.qs()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.c.b.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.c.b.a r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.c.b.a r0, boolean r1) {
            boolean r0 = r0.f(r1)
            return r0
    }

    private com.kwad.components.ad.c.c am() {
            r3 = this;
            com.kwad.components.ad.c.f r0 = new com.kwad.components.ad.c.f
            android.view.ViewGroup r1 = r3.nY
            com.kwad.sdk.core.response.model.AdInfo r2 = r3.mAdInfo
            int r2 = com.kwad.sdk.core.response.b.a.cG(r2)
            r0.<init>(r1, r2)
            r3.ce = r0
            r0.wi()
            com.kwad.components.ad.c.c r0 = new com.kwad.components.ad.c.c
            r0.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.internal.api.SceneImpl r1 = r3.mAdScene
            r0.mAdScene = r1
            com.kwad.components.core.e.d.c r1 = r3.mApkDownloadHelper
            r0.mApkDownloadHelper = r1
            return r0
    }

    private static com.kwad.sdk.mvp.Presenter an() {
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            com.kwad.components.ad.c.c.b r1 = new com.kwad.components.ad.c.c.b
            r1.<init>()
            r0.a(r1)
            return r0
    }

    private boolean ap() {
            r3 = this;
            boolean r0 = com.kwad.sdk.core.config.e.FL()
            r1 = 1
            if (r0 != 0) goto L14
            android.content.Context r0 = r3.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r0 = r0.sW()
            if (r0 == 0) goto L14
            goto L34
        L14:
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r3.bU
            boolean r2 = r0 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r2 == 0) goto L2a
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r0 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r0
            int r0 = r0.getVideoSoundValue()
            if (r0 == 0) goto L2a
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r3.bU
            boolean r0 = r0.isVideoSoundEnable()
            r0 = r0 ^ r1
            goto L35
        L2a:
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.bX(r0)
            if (r0 != 0) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            r0 = r1
        L35:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            if (r1 == 0) goto L3d
            r2 = r0 ^ 1
            r1.mIsAudioEnable = r2
        L3d:
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.c.b.a r0) {
            boolean r0 = r0.mIsAudioEnable
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.c.b.a r0, boolean r1) {
            r1 = 0
            r0.cp = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.video.videoview.a c(com.kwad.components.ad.c.b.a r0) {
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

    static /* synthetic */ com.kwad.sdk.mvp.a d(com.kwad.components.ad.c.b.a r0) {
            T extends com.kwad.sdk.mvp.a r0 = r0.Rv
            return r0
    }

    private boolean f(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r3 = com.kwad.sdk.core.config.e.FL()
            r1 = 1
            if (r3 != 0) goto L30
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sX()
            if (r3 != 0) goto L22
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r0)
            return r3
        L22:
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sW()
            if (r3 != 0) goto L2f
            return r1
        L2f:
            return r0
        L30:
            boolean r3 = r2.cp
            if (r3 != 0) goto L40
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r1)
            r2.cp = r3
        L40:
            boolean r3 = r2.cp
            return r3
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r1) {
            r0 = this;
            r0.onClick(r1)
            return
    }

    public final void a(com.kwad.sdk.api.KsAdVideoPlayConfig r9) {
            r8 = this;
            if (r9 != 0) goto L7
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r9 = new com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            r9.<init>()
        L7:
            r8.bU = r9
            boolean r9 = r8.ap()
            r0 = 1
            r9 = r9 ^ r0
            r8.mIsAudioEnable = r9
            com.kwad.sdk.core.response.model.AdInfo r9 = r8.mAdInfo
            java.util.List r9 = com.kwad.sdk.core.response.b.a.bp(r9)
            r8.ck = r9
            com.kwad.sdk.core.video.videoview.a r9 = new com.kwad.sdk.core.video.videoview.a
            android.content.Context r1 = r8.getContext()
            r9.<init>(r1)
            r8.cq = r9
            android.content.Context r9 = r8.mContext
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r1 = com.kwad.sdk.core.response.b.a.aV(r1)
            com.kwad.sdk.core.response.model.AdInfo r2 = r8.mAdInfo
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.O(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L67
            int r2 = r1.width
            int r1 = r1.height
            if (r2 <= 0) goto L67
            if (r2 >= r1) goto L67
            r1 = 1113063424(0x42580000, float:54.0)
            float r9 = r9.density
            float r9 = r9 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r1
            int r9 = (int) r9
            int r1 = r9 / 16
            int r1 = r1 * 9
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r1, r9)
            r9 = 5
            r2.gravity = r9
            r9 = 14
            r2.rightMargin = r9
            com.kwad.sdk.core.video.videoview.a r9 = r8.cq
            r9.setLayoutParams(r2)
        L67:
            com.kwad.sdk.core.video.videoview.a r9 = r8.cq
            r9.setOnClickListener(r8)
            int r9 = com.kwad.sdk.core.config.e.BQ()
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.K(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L7e
            goto L17f
        L7e:
            r1 = 0
            if (r9 >= 0) goto L99
            com.kwad.sdk.core.diskcache.b.a r9 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r9 = r9.cf(r3)
            if (r9 == 0) goto L97
            boolean r2 = r9.exists()
            if (r2 == 0) goto L97
            java.lang.String r9 = r9.getAbsolutePath()
        L95:
            r3 = r9
            goto Lcf
        L97:
            r3 = r1
            goto Lcf
        L99:
            if (r9 != 0) goto L9c
            goto Lcf
        L9c:
            android.content.Context r9 = r8.mContext
            com.kwad.sdk.core.videocache.f r2 = com.kwad.sdk.core.videocache.c.a.bR(r9)
            boolean r9 = com.kwad.sdk.core.config.e.ES()
            if (r9 == 0) goto Lcb
            int r9 = com.kwad.sdk.core.config.e.BQ()
            boolean r4 = r2.eL(r3)
            if (r4 != 0) goto Lc6
            com.kwad.sdk.core.network.a.a$a r6 = new com.kwad.sdk.core.network.a.a$a
            r6.<init>()
            int r9 = r9 * 1024
            long r4 = (long) r9
            r7 = 0
            boolean r9 = r2.a(r3, r4, r6, r7)
            if (r9 == 0) goto Lcf
            java.lang.String r9 = r2.eJ(r3)
            goto L95
        Lc6:
            java.lang.String r9 = r2.eJ(r3)
            goto L95
        Lcb:
            java.lang.String r3 = r2.eJ(r3)
        Lcf:
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 == 0) goto Ld7
            goto L17f
        Ld7:
            com.kwad.sdk.contentalliance.a.a.b$a r9 = new com.kwad.sdk.contentalliance.a.a.b$a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r8.mAdTemplate
            r9.<init>(r2)
            com.kwad.sdk.contentalliance.a.a.b$a r9 = r9.dg(r3)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r8.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r2 = com.kwad.sdk.core.response.b.e.em(r2)
            java.lang.String r2 = com.kwad.sdk.core.response.b.h.b(r2)
            com.kwad.sdk.contentalliance.a.a.b$a r9 = r9.dh(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r8.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r2 = r2.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r9 = r9.a(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r8.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r2 = com.kwad.sdk.contentalliance.a.a.a.bQ(r2)
            com.kwad.sdk.contentalliance.a.a.b$a r9 = r9.b(r2)
            com.kwad.sdk.contentalliance.a.a.b r9 = r9.El()
            com.kwad.sdk.core.video.videoview.a r2 = r8.cq
            r2.a(r9, r1)
            com.kwad.components.ad.c.b.a$6 r9 = new com.kwad.components.ad.c.b.a$6
            r9.<init>(r8)
            r8.cz = r9
            com.kwad.sdk.core.video.videoview.a r1 = r8.cq
            r1.setExternalPlayerListener(r9)
            com.kwad.sdk.core.video.videoview.a r9 = r8.cq
            boolean r1 = r8.mIsAudioEnable
            r9.setVideoSoundEnable(r1)
            com.kwad.sdk.api.KsAdVideoPlayConfig r9 = r8.bU
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            int r1 = com.kwad.sdk.core.response.b.a.ds(r1)
            r9.setVideoAutoPlayType(r1)
            com.kwad.components.ad.c.e r9 = new com.kwad.components.ad.c.e
            android.content.Context r1 = r8.mContext
            com.kwad.sdk.core.response.model.AdTemplate r2 = r8.mAdTemplate
            com.kwad.sdk.core.video.videoview.a r3 = r8.cq
            com.kwad.sdk.api.KsAdVideoPlayConfig r4 = r8.bU
            r9.<init>(r1, r2, r3, r4)
            r8.cr = r9
            r9.setHideEnd(r0)
            com.kwad.components.ad.c.e r9 = r8.cr
            com.kwad.components.core.video.a$b r1 = r8.cA
            r9.setVideoPlayCallback(r1)
            com.kwad.sdk.core.video.videoview.a r9 = r8.cq
            com.kwad.components.ad.c.e r1 = r8.cr
            r9.setController(r1)
            android.widget.FrameLayout r9 = r8.cl
            com.kwad.sdk.core.video.videoview.a r1 = r8.cq
            r9.addView(r1)
            android.view.ViewGroup r9 = r8.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_logo
            android.view.View r9 = r9.findViewById(r1)
            r9.bringToFront()
            android.widget.FrameLayout r9 = r8.cl
            r9.setClickable(r0)
            com.kwad.components.ad.c.e r9 = r8.cr
            r9.ac()
            com.kwad.sdk.widget.h r9 = new com.kwad.sdk.widget.h
            android.content.Context r0 = r8.getContext()
            android.widget.FrameLayout r1 = r8.cl
            r9.<init>(r0, r1, r8)
            boolean r9 = r8.mIsAudioEnable
            if (r9 == 0) goto L17f
            android.content.Context r9 = r8.mContext
            com.kwad.components.core.t.a r9 = com.kwad.components.core.t.a.aC(r9)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r0 = r8.cB
            r9.a(r0)
        L17f:
            return
    }

    @Override // com.kwad.components.core.m.c, com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r0 = this;
            super.aa()
            return
    }

    @Override // com.kwad.components.core.m.c
    public final boolean ai() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final void ak() {
            r7 = this;
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_item_content
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.cl = r0
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_item_info
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.cs = r0
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_item_des
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.ct = r0
            com.kwad.sdk.core.response.model.AdInfo r1 = r7.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.au(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r7.ct
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_item_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.cu = r0
            com.kwad.sdk.core.response.model.AdInfo r1 = r7.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.cl(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r7.cu
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_button_base
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.cn = r0
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_item_button
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.cv = r0
            com.kwad.sdk.core.response.model.AdInfo r1 = r7.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aE(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r7.cv
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_item_close
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.cw = r0
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_item_image
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.cm = r0
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_item_image_bg
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.co = r0
            r0.setOnClickListener(r7)
            android.view.ViewGroup r0 = r7.nY
            int r1 = com.kwad.sdk.R.id.ksad_banner_logo
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r7.cx = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r7.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.K(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L113
            com.kwad.sdk.core.response.model.AdInfo r0 = r7.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r0 = r0.materialUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L113
            android.content.Context r0 = r7.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r2 = 1109393408(0x42200000, float:40.0)
            float r0 = r0.density
            float r0 = r0 * r2
            float r0 = r0 + r1
            int r0 = (int) r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            android.widget.ImageView r0 = r7.cm
            r0.setLayoutParams(r1)
            android.widget.ImageView r0 = r7.cm
            com.kwad.sdk.core.response.model.AdInfo r1 = r7.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.co(r1)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r7.mAdTemplate
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r3 = new com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder
            r3.<init>()
            r4 = 8
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r3 = r3.setCornerRound(r4)
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r3 = r3.build()
            com.kwad.components.ad.c.b.a$3 r4 = new com.kwad.components.ad.c.b.a$3
            r4.<init>(r7)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r2, r3, r4)
            goto L1c5
        L113:
            com.kwad.sdk.core.response.model.AdInfo r0 = r7.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.bd(r0)
            r2 = 50
            if (r0 != 0) goto L14d
            android.widget.ImageView r0 = r7.cm
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            android.widget.ImageView r0 = r7.cm
            com.kwad.sdk.core.response.model.AdInfo r1 = r7.mAdInfo
            com.kwad.sdk.core.response.model.b r1 = com.kwad.sdk.core.response.b.a.bu(r1)
            java.lang.String r1 = r1.getUrl()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r7.mAdTemplate
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r4 = new com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder
            r4.<init>()
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r2 = r4.setBlurRadius(r2)
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r2 = r2.build()
            com.kwad.components.ad.c.b.a$4 r4 = new com.kwad.components.ad.c.b.a$4
            r4.<init>(r7)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r3, r2, r4)
            android.widget.ImageView r0 = r7.cm
            r0.setOnClickListener(r7)
            goto L1c5
        L14d:
            android.content.Context r0 = r7.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            com.kwad.sdk.core.response.model.AdInfo r3 = r7.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r3 = com.kwad.sdk.core.response.b.a.aU(r3)
            java.lang.String r4 = r3.materialUrl
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L1b6
            int r4 = r3.width
            int r3 = r3.height
            if (r4 <= 0) goto L1b6
            if (r4 >= r3) goto L1b6
            android.widget.ImageView r3 = r7.co
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            r3.setScaleType(r4)
            android.widget.ImageView r3 = r7.co
            com.kwad.sdk.core.response.model.AdInfo r4 = r7.mAdInfo
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.O(r4)
            com.kwad.sdk.core.response.model.AdTemplate r5 = r7.mAdTemplate
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r6 = new com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder
            r6.<init>()
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r2 = r6.setBlurRadius(r2)
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r2 = r2.build()
            com.kwad.components.ad.c.b.a$5 r6 = new com.kwad.components.ad.c.b.a$5
            r6.<init>(r7)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r3, r4, r5, r2, r6)
            r2 = 1113063424(0x42580000, float:54.0)
            float r3 = r0.density
            float r3 = r3 * r2
            float r3 = r3 + r1
            int r2 = (int) r3
            int r3 = r2 / 16
            int r3 = r3 * 9
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r3, r2)
            r2 = 5
            r4.gravity = r2
            r2 = 1096810496(0x41600000, float:14.0)
            float r0 = r0.density
            float r0 = r0 * r2
            float r0 = r0 + r1
            int r0 = (int) r0
            r4.rightMargin = r0
            android.widget.ImageView r0 = r7.cm
            r0.setLayoutParams(r4)
        L1b6:
            android.widget.ImageView r0 = r7.cm
            com.kwad.sdk.core.response.model.AdInfo r1 = r7.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r1 = com.kwad.sdk.core.response.b.a.aU(r1)
            java.lang.String r1 = r1.materialUrl
            com.kwad.sdk.core.response.model.AdTemplate r2 = r7.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r2)
        L1c5:
            com.kwad.components.core.widget.KsLogoView r0 = r7.cx
            com.kwad.sdk.core.response.model.AdTemplate r1 = r7.mAdTemplate
            r0.aP(r1)
            android.widget.FrameLayout r0 = r7.cl
            r1 = 4
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.components.core.m.c
    public final /* synthetic */ com.kwad.components.ad.c.c al() {
            r1 = this;
            com.kwad.components.ad.c.c r0 = r1.am()
            return r0
    }

    public final void ao() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.cl
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.c.b.a$a r0 = r2.cy
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.d(r1)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Lb
            r1.onClick(r2)
        Lb:
            return
    }

    @Override // com.kwad.components.core.m.c
    public final int getLayoutId() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            int r1 = r1.heightPixels
            if (r0 <= r1) goto L21
            int r0 = com.kwad.sdk.R.layout.ksad_banner_item_land
            return r0
        L21:
            int r0 = com.kwad.sdk.R.layout.ksad_banner_item
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final void initData() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r2.mAdInfo = r0
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.<init>(r1)
            r2.mApkDownloadHelper = r0
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            android.widget.FrameLayout r0 = r3.cl
            if (r4 == r0) goto L5c
            android.widget.ImageView r0 = r3.cm
            if (r4 == r0) goto L5c
            com.kwad.sdk.core.video.videoview.a r0 = r3.cq
            if (r4 == r0) goto L5c
            android.widget.ImageView r0 = r3.co
            if (r4 != r0) goto L11
            goto L5c
        L11:
            android.widget.LinearLayout r0 = r3.cs
            r1 = 2
            if (r4 == r0) goto L52
            android.widget.LinearLayout r0 = r3.cn
            if (r4 != r0) goto L1b
            goto L52
        L1b:
            android.widget.TextView r0 = r3.ct
            if (r4 != r0) goto L29
            com.kwad.components.ad.c.b.a$a r4 = r3.cy
            r0 = 32
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r4.a(r0, r1, r2)
            return
        L29:
            android.widget.TextView r0 = r3.cu
            if (r4 != r0) goto L37
            com.kwad.components.ad.c.b.a$a r4 = r3.cy
            r0 = 31
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r4.a(r0, r1, r2)
            return
        L37:
            android.widget.TextView r0 = r3.cv
            if (r4 != r0) goto L46
            com.kwad.components.ad.c.b.a$a r4 = r3.cy
            r0 = 1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r2 = 29
            r4.a(r2, r0, r1)
            return
        L46:
            android.widget.ImageView r0 = r3.cw
            if (r4 != r0) goto L51
            com.kwad.components.ad.c.b.a$a r4 = r3.cy
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r4.e(r0)
        L51:
            return
        L52:
            com.kwad.components.ad.c.b.a$a r4 = r3.cy
            r0 = 53
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r4.a(r0, r1, r2)
            return
        L5c:
            com.kwad.components.ad.c.b.a$a r4 = r3.cy
            r0 = 3
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r2 = 100
            r4.a(r2, r0, r1)
            return
    }

    @Override // com.kwad.components.core.m.c
    @androidx.annotation.NonNull
    public final com.kwad.sdk.mvp.Presenter onCreatePresenter() {
            r1 = this;
            r1.getContext()
            com.kwad.sdk.mvp.Presenter r0 = an()
            return r0
    }
}
