package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class c extends com.kwad.components.ad.feed.widget.a implements android.view.View.OnClickListener, com.kwad.sdk.widget.d {
    private com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private com.kwad.components.core.video.a.b cA;
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener cB;
    private java.util.List<java.lang.Integer> ck;
    private boolean cp;
    private com.kwad.sdk.core.video.videoview.a cq;
    private com.kwad.sdk.core.video.videoview.a.InterfaceC0149a cz;
    private volatile boolean eE;
    private com.kwad.sdk.widget.l eF;
    private android.widget.TextView ee;
    private final com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener eh;
    private com.kwad.components.core.k.a.b fD;
    private android.view.View fF;
    private com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView fq;
    private com.kwad.components.core.o.a.b.a fr;
    private android.widget.TextView gD;
    private android.widget.ImageView gw;
    private android.widget.TextView hA;
    private android.widget.ImageView hC;
    private android.widget.TextView hE;
    private android.widget.TextView hF;
    private android.view.View hG;
    private com.kwad.components.ad.widget.DownloadProgressView hH;
    private boolean hI;
    private int hJ;
    protected com.kwad.sdk.widget.KSRelativeLayout hL;
    private android.widget.ImageView hM;
    private com.kwad.components.core.video.e hN;
    private com.kwad.components.ad.feed.widget.d hO;
    private android.widget.TextView hP;
    private final com.kwad.components.core.video.a.InterfaceC0092a hQ;
    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule hR;
    private boolean hS;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private boolean mIsAudioEnable;
    private com.kwad.components.core.widget.KsLogoView mLogoView;












    public c(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mIsAudioEnable = r1
            r0.eE = r1
            r1 = 1
            r0.hI = r1
            r1 = 8
            r0.hJ = r1
            com.kwad.components.ad.feed.widget.c$1 r1 = new com.kwad.components.ad.feed.widget.c$1
            r1.<init>(r0)
            r0.eF = r1
            com.kwad.components.ad.feed.widget.c$4 r1 = new com.kwad.components.ad.feed.widget.c$4
            r1.<init>(r0)
            r0.hQ = r1
            com.kwad.components.ad.feed.widget.c$8 r1 = new com.kwad.components.ad.feed.widget.c$8
            r1.<init>(r0)
            r0.eh = r1
            com.kwad.components.ad.feed.widget.c$10 r1 = new com.kwad.components.ad.feed.widget.c$10
            r1.<init>(r0)
            r0.cB = r1
            com.kwad.components.ad.feed.widget.c$2 r1 = new com.kwad.components.ad.feed.widget.c$2
            r1.<init>(r0)
            r0.cA = r1
            return
    }

    static /* synthetic */ com.kwad.components.ad.feed.widget.d a(com.kwad.components.ad.feed.widget.c r0, com.kwad.components.ad.feed.widget.d r1) {
            r0.hO = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule a(com.kwad.components.ad.feed.widget.c r0, com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1) {
            r0.hR = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.feed.widget.c r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.c r0, int r1) {
            r0.ba(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.c r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.c r0, android.view.View r1) {
            r0.d(r1)
            return
    }

    private void a(com.kwad.sdk.core.video.videoview.a r5, boolean r6, int r7) {
            r4 = this;
            if (r5 != 0) goto L8
            boolean r5 = r4.hS
            if (r5 == 0) goto L7
            goto L8
        L7:
            return
        L8:
            com.kwad.sdk.core.response.model.AdInfo r5 = r4.mAdInfo
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.K(r5)
            boolean r0 = r4.hS
            if (r0 != 0) goto L1a
            com.kwad.components.core.video.e r0 = r4.hN
            if (r0 == 0) goto L1a
            r1 = 0
            r0.setAutoRelease(r1)
        L1a:
            r0 = 1
            if (r6 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 2
        L20:
            boolean r2 = r4.hS
            if (r2 != 0) goto L2d
            com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache r2 = com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache.getInstance()
            com.kwad.sdk.core.video.videoview.a r3 = r4.cq
            r2.a(r5, r3)
        L2d:
            r4.cj()
            com.kwad.components.core.e.d.a$a r5 = new com.kwad.components.core.e.d.a$a
            android.content.Context r2 = r4.getContext()
            r5.<init>(r2)
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            com.kwad.components.core.e.d.a$a r5 = r5.aB(r2)
            com.kwad.components.core.e.d.c r2 = r4.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r5 = r5.b(r2)
            com.kwad.components.core.e.d.a$a r5 = r5.aq(r6)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r6 = r4.hR
            if (r6 != 0) goto L50
            r2 = 0
            goto L54
        L50:
            long r2 = r6.getPlayDuration()
        L54:
            com.kwad.components.core.e.d.a$a r5 = r5.A(r2)
            com.kwad.components.core.e.d.a$a r5 = r5.aB(r1)
            com.kwad.components.core.e.d.a$a r5 = r5.au(r0)
            com.kwad.components.ad.feed.widget.c$11 r6 = new com.kwad.components.ad.feed.widget.c$11
            r6.<init>(r4, r7)
            com.kwad.components.core.e.d.a$a r5 = r5.a(r6)
            com.kwad.components.core.e.d.a.a(r5)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.feed.widget.c r0, boolean r1) {
            boolean r0 = r0.h(r1)
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.feed.widget.c r0) {
            r0.vV()
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.feed.widget.c r0, boolean r1) {
            r1 = 0
            r0.cp = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.e.d.c c(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
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
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r0, r3, r1)
            r4.remove()
        L36:
            return
    }

    private void cm() {
            r3 = this;
            int r0 = com.kwad.sdk.R.id.ksad_h5_desc
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.hF = r0
            int r0 = com.kwad.sdk.R.id.ksad_h5_open_btn
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.gD = r0
            int r0 = com.kwad.sdk.R.id.ksad_h5_open_cover
            android.view.View r0 = r3.findViewById(r0)
            r3.hG = r0
            android.widget.TextView r0 = r3.hF
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            java.lang.String r1 = com.kwad.components.ad.feed.f.l(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r3.gD
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aE(r1)
            r0.setText(r1)
            android.view.View r0 = r3.hG
            r0.setOnClickListener(r3)
            android.widget.TextView r0 = r3.hF
            r0.setOnClickListener(r3)
            android.widget.TextView r0 = r3.gD
            r0.setOnClickListener(r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r3.getContext()
            android.view.View r2 = r3.hG
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r3.getContext()
            android.widget.TextView r2 = r3.hF
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r3.getContext()
            android.widget.TextView r2 = r3.gD
            r0.<init>(r1, r2, r3)
            return
    }

    private void cn() {
            r5 = this;
            int r0 = com.kwad.sdk.R.id.ksad_app_icon
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.gw = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_title
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.ee = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_desc
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.hE = r0
            android.widget.ImageView r1 = r5.gw
            android.widget.TextView r2 = r5.ee
            r3 = 3
            android.view.View[] r3 = new android.view.View[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r1 = 2
            r3[r1] = r0
            com.kwad.sdk.c.a.a.a(r5, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            android.widget.ImageView r2 = r5.gw
            r0.<init>(r1, r2, r5)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            android.widget.TextView r2 = r5.ee
            r0.<init>(r1, r2, r5)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            android.widget.TextView r2 = r5.hE
            r0.<init>(r1, r2, r5)
            boolean r0 = r5.cw()
            if (r0 == 0) goto L64
            android.widget.TextView r0 = r5.ee
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.cl(r1)
            r0.setText(r1)
            goto L6f
        L64:
            android.widget.TextView r0 = r5.ee
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.av(r1)
            r0.setText(r1)
        L6f:
            android.widget.ImageView r0 = r5.gw
            int r1 = com.kwad.sdk.R.drawable.ksad_default_app_icon
            r0.setImageResource(r1)
            android.widget.ImageView r0 = r5.gw
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.co(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            int r3 = r5.hJ
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r0, r1, r2, r3)
            android.widget.TextView r0 = r5.hE
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            java.lang.String r1 = com.kwad.components.ad.feed.f.l(r1)
            r0.setText(r1)
            boolean r0 = r5.hI
            if (r0 == 0) goto L97
            r5.ck()
        L97:
            return
    }

    private void cs() {
            r1 = this;
            java.lang.Class<com.kwad.components.core.o.a.b.a> r0 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.core.o.a.b.a r0 = (com.kwad.components.core.o.a.b.a) r0
            r1.fr = r0
            if (r0 == 0) goto L20
            boolean r0 = r0.qu()
            if (r0 == 0) goto L20
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cR(r0)
            if (r0 == 0) goto L20
            r0 = 1
            r1.hS = r0
            r1.cv()
        L20:
            return
    }

    private boolean ct() {
            r10 = this;
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r10.fq
            r1 = 0
            if (r0 == 0) goto L90
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L90
            boolean r0 = r10.hS
            if (r0 == 0) goto L90
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r10.fq
            android.view.View r0 = r0.getView()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kwad.sdk.widget.KSRelativeLayout r2 = r10.hL
            if (r0 == r2) goto L87
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r10.fq
            android.view.View r2 = r2.getView()
            r0.removeView(r2)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            java.lang.Object r0 = r0.getTag()
            if (r0 == 0) goto L41
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            java.lang.Object r2 = r0.getTag()
            android.view.View r2 = (android.view.View) r2
            r0.removeView(r2)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            r2 = 0
            r0.setTag(r2)
        L41:
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r10.fq
            android.view.View r2 = r2.getView()
            r0.addView(r2)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r10.fq
            android.view.View r2 = r2.getView()
            r0.setTag(r2)
            com.kwad.components.core.o.a.b.a r3 = r10.fr
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r4 = r10.fq
            java.lang.String r5 = com.kwad.sdk.service.ServiceProvider.getAppId()
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            long r6 = com.kwad.sdk.core.response.b.a.cp(r0)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            java.lang.String r7 = com.kwad.sdk.core.response.b.a.cq(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            long r8 = com.kwad.sdk.core.response.b.a.cr(r0)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r3.getAdLivePlayModule(r4, r5, r6, r7, r8)
            r10.hR = r0
            boolean r2 = r10.mIsAudioEnable
            r0.setAudioEnabled(r2, r1)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r10.hR
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r1 = r10.eh
            r0.registerAdLivePlayStateListener(r1)
        L87:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r10.hR
            if (r0 == 0) goto L8e
            r0.onResume()
        L8e:
            r0 = 1
            return r0
        L90:
            return r1
    }

    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule cu() {
            r10 = this;
            com.kwad.components.core.o.a.b.a r0 = r10.fr
            android.content.Context r1 = r10.mContext
            r2 = 3
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r4 = com.kwad.components.ad.j.c.a(r0, r1, r2)
            r10.fq = r4
            r0 = 0
            if (r4 != 0) goto Lf
            return r0
        Lf:
            com.kwad.components.core.o.a.b.a r3 = r10.fr
            com.kwad.sdk.api.SdkConfig r1 = com.kwad.sdk.service.ServiceProvider.getSDKConfig()
            java.lang.String r5 = r1.appId
            com.kwad.sdk.core.response.model.AdInfo r1 = r10.mAdInfo
            long r1 = com.kwad.sdk.core.response.b.a.cp(r1)
            java.lang.String r6 = java.lang.String.valueOf(r1)
            com.kwad.sdk.core.response.model.AdInfo r1 = r10.mAdInfo
            java.lang.String r7 = com.kwad.sdk.core.response.b.a.cq(r1)
            com.kwad.sdk.core.response.model.AdInfo r1 = r10.mAdInfo
            long r8 = com.kwad.sdk.core.response.b.a.cr(r1)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1 = r3.getAdLivePlayModule(r4, r5, r6, r7, r8)
            boolean r2 = r10.mIsAudioEnable
            boolean r2 = r10.h(r2)
            r3 = 0
            r1.setAudioEnabled(r2, r3)
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r2 = r10.eh
            r1.registerAdLivePlayStateListener(r2)
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r10.fq
            android.view.View r2 = r2.getView()
            com.kwad.sdk.widget.KSRelativeLayout r3 = r10.hL
            java.lang.Object r3 = r3.getTag()
            if (r3 == 0) goto L5e
            com.kwad.sdk.widget.KSRelativeLayout r3 = r10.hL
            java.lang.Object r4 = r3.getTag()
            android.view.View r4 = (android.view.View) r4
            r3.removeView(r4)
            com.kwad.sdk.widget.KSRelativeLayout r3 = r10.hL
            r3.setTag(r0)
        L5e:
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            r0.addView(r2)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            r0.setTag(r2)
            com.kwad.components.ad.feed.widget.c$5 r0 = new com.kwad.components.ad.feed.widget.c$5
            r0.<init>(r10, r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            boolean r0 = r10.mIsAudioEnable
            if (r0 == 0) goto L7f
            android.content.Context r0 = r10.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r2 = r10.cB
            r0.a(r2)
        L7f:
            return r1
    }

    private void cv() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            java.lang.String r0 = r0.getUrl()
            android.widget.ImageView r1 = r5.hM
            r2 = 0
            r1.setVisibility(r2)
            android.view.View r1 = r5.fF
            r1.setVisibility(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3d
            android.widget.ImageView r1 = r5.hM
            r2 = 0
            r1.setImageDrawable(r2)
            android.widget.ImageView r1 = r5.hM
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r3 = new com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder
            r3.<init>()
            r4 = 50
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r3 = r3.setBlurRadius(r4)
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r3 = r3.build()
            com.kwad.components.ad.feed.widget.c$6 r4 = new com.kwad.components.ad.feed.widget.c$6
            r4.<init>(r5)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r2, r3, r4)
            return
        L3d:
            android.widget.ImageView r0 = r5.hM
            int r1 = com.kwad.sdk.R.drawable.ksad_ad_live_end
            r0.setImageResource(r1)
            return
    }

    private void cx() {
            r4 = this;
            com.kwad.components.ad.widget.DownloadProgressView r0 = r4.hH
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.at(r1)
            com.kwad.components.ad.widget.DownloadProgressView r0 = r4.hH
            r0.setOnClickListener(r4)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r4.getContext()
            com.kwad.components.ad.widget.DownloadProgressView r2 = r4.hH
            r0.<init>(r1, r2, r4)
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.components.ad.widget.DownloadProgressView r2 = r4.hH
            com.kwad.sdk.api.KsAppDownloadListener r2 = r2.getAppDownloadListener()
            r3 = 0
            r0.<init>(r1, r3, r2)
            r4.mApkDownloadHelper = r0
            com.kwad.components.ad.widget.DownloadProgressView r1 = r4.hH
            com.kwad.sdk.api.KsAppDownloadListener r1 = r1.getAppDownloadListener()
            r0.d(r1)
            com.kwad.components.core.e.d.c r0 = r4.mApkDownloadHelper
            r0.setOnShowListener(r4)
            com.kwad.components.core.e.d.c r0 = r4.mApkDownloadHelper
            r0.setOnDismissListener(r4)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate d(com.kwad.components.ad.feed.widget.c r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void d(android.view.View r2) {
            r1 = this;
            com.kwad.components.ad.feed.widget.c$7 r0 = new com.kwad.components.ad.feed.widget.c$7
            r0.<init>(r1, r2)
            r2.post(r0)
            return
    }

    static /* synthetic */ android.widget.TextView e(com.kwad.components.ad.feed.widget.c r0) {
            android.widget.TextView r0 = r0.hP
            return r0
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule f(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r0.hR
            return r0
    }

    static /* synthetic */ com.kwad.components.core.k.a.b g(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.components.core.k.a$b r0 = r0.getCurrentVoiceItem()
            return r0
    }

    private com.kwad.components.core.k.a.b getCurrentVoiceItem() {
            r2 = this;
            com.kwad.components.core.k.a$b r0 = r2.fD
            if (r0 != 0) goto L10
            com.kwad.components.core.k.a$b r0 = new com.kwad.components.core.k.a$b
            com.kwad.components.ad.feed.widget.c$3 r1 = new com.kwad.components.ad.feed.widget.c$3
            r1.<init>(r2)
            r0.<init>(r1)
            r2.fD = r0
        L10:
            com.kwad.components.core.k.a$b r0 = r2.fD
            return r0
    }

    static /* synthetic */ boolean h(com.kwad.components.ad.feed.widget.c r0) {
            boolean r0 = r0.mIsAudioEnable
            return r0
    }

    private boolean h(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r3 = com.kwad.sdk.core.config.e.hC()
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

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate i(com.kwad.components.ad.feed.widget.c r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.video.videoview.a j(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.sdk.core.video.videoview.a r0 = r0.cq
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.feed.widget.d k(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.components.ad.feed.widget.d r0 = r0.hO
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate l(com.kwad.components.ad.feed.widget.c r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo m(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate n(com.kwad.components.ad.feed.widget.c r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.video.e o(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.components.core.video.e r0 = r0.hN
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate p(com.kwad.components.ad.feed.widget.c r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate q(com.kwad.components.ad.feed.widget.c r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo r(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ boolean s(com.kwad.components.ad.feed.widget.c r0) {
            boolean r0 = r0.hS
            return r0
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule t(com.kwad.components.ad.feed.widget.c r0) {
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r0.cu()
            return r0
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r1) {
            r0 = this;
            r0.onClick(r1)
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r2 = this;
            super.aa()
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L12
            com.kwad.components.ad.widget.DownloadProgressView r1 = r2.hH
            if (r1 == 0) goto L12
            com.kwad.sdk.api.KsAppDownloadListener r1 = r1.getAppDownloadListener()
            r0.b(r1)
        L12:
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r2 = this;
            super.ab()
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.utils.n.eK(r0)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR
            r1 = 0
            if (r0 == 0) goto L12
            r0.onDestroy()
            r2.hR = r1
        L12:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r2.fq
            if (r0 == 0) goto L1b
            r0.onDestroy()
            r2.fq = r1
        L1b:
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.fD
            r0.c(r1)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r3) {
            r2 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto L16
            com.kwad.sdk.core.video.videoview.a r0 = r2.cq
            com.kwad.components.ad.widget.DownloadProgressView r1 = r2.hH
            if (r3 != r1) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            r1 = 153(0x99, float:2.14E-43)
            r2.a(r0, r3, r1)
        L16:
            return
    }

    public final void b(@androidx.annotation.NonNull com.kwad.sdk.api.KsAdVideoPlayConfig r10) {
            r9 = this;
            r9.bU = r10
            boolean r0 = r10 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r0 == 0) goto L16
            r0 = r10
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r0 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r0
            int r0 = r0.getVideoSoundValue()
            if (r0 == 0) goto L16
            boolean r0 = r10.isVideoSoundEnable()
            r9.mIsAudioEnable = r0
            goto L1e
        L16:
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.ca(r0)
            r9.mIsAudioEnable = r0
        L1e:
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r9.mAdTemplate
            boolean r1 = r9.mIsAudioEnable
            r0.mIsAudioEnable = r1
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            java.util.List r0 = com.kwad.sdk.core.response.b.a.bp(r0)
            r9.ck = r0
            boolean r0 = r9.hS
            if (r0 == 0) goto L32
            goto L1cb
        L32:
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            java.lang.String r0 = r0.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L5d
            android.widget.ImageView r1 = r9.hM
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r3)
            android.widget.ImageView r1 = r9.hM
            r1.setImageDrawable(r2)
            android.widget.ImageView r1 = r9.hM
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r9.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r3)
            android.widget.ImageView r0 = r9.hM
            r1 = 0
            r0.setVisibility(r1)
            goto L64
        L5d:
            android.widget.ImageView r0 = r9.hM
            r1 = 8
            r0.setVisibility(r1)
        L64:
            com.kwad.sdk.core.video.videoview.a r0 = new com.kwad.sdk.core.video.videoview.a
            android.content.Context r1 = r9.mContext
            r0.<init>(r1)
            r9.cq = r0
            com.kwad.sdk.widget.l r1 = r9.eF
            r0.setVisibleListener(r1)
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            r0.setOnClickListener(r9)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r9.getContext()
            com.kwad.sdk.core.video.videoview.a r3 = r9.cq
            r0.<init>(r1, r3, r9)
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            java.util.List<java.lang.Integer> r1 = r9.ck
            r0.setTag(r1)
            int r0 = com.kwad.sdk.core.config.e.BQ()
            com.kwad.sdk.core.response.model.AdInfo r1 = r9.mAdInfo
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.K(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L9b
            goto L1cb
        L9b:
            if (r0 >= 0) goto Lb5
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r0 = r0.cf(r4)
            if (r0 == 0) goto Lb3
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lb3
            java.lang.String r0 = r0.getAbsolutePath()
        Lb1:
            r4 = r0
            goto Leb
        Lb3:
            r4 = r2
            goto Leb
        Lb5:
            if (r0 != 0) goto Lb8
            goto Leb
        Lb8:
            android.content.Context r0 = r9.mContext
            com.kwad.sdk.core.videocache.f r3 = com.kwad.sdk.core.videocache.c.a.bR(r0)
            boolean r0 = com.kwad.sdk.core.config.e.ES()
            if (r0 == 0) goto Le7
            int r0 = com.kwad.sdk.core.config.e.BQ()
            boolean r1 = r3.eL(r4)
            if (r1 != 0) goto Le2
            com.kwad.sdk.core.network.a.a$a r7 = new com.kwad.sdk.core.network.a.a$a
            r7.<init>()
            int r0 = r0 * 1024
            long r5 = (long) r0
            r8 = 0
            boolean r0 = r3.a(r4, r5, r7, r8)
            if (r0 == 0) goto Leb
            java.lang.String r0 = r3.eJ(r4)
            goto Lb1
        Le2:
            java.lang.String r0 = r3.eJ(r4)
            goto Lb1
        Le7:
            java.lang.String r4 = r3.eJ(r4)
        Leb:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lf3
            goto L1cb
        Lf3:
            com.kwad.sdk.contentalliance.a.a.b$a r0 = new com.kwad.sdk.contentalliance.a.a.b$a
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            r0.<init>(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dg(r4)
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r1 = com.kwad.sdk.core.response.b.e.em(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.h.b(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dh(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = r1.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.a(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r1 = com.kwad.sdk.contentalliance.a.a.a.bQ(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.b(r1)
            com.kwad.sdk.contentalliance.a.a.b r0 = r0.El()
            com.kwad.sdk.core.video.videoview.a r1 = r9.cq
            r1.a(r0, r2)
            com.kwad.components.ad.feed.widget.c$9 r0 = new com.kwad.components.ad.feed.widget.c$9
            r0.<init>(r9)
            r9.cz = r0
            com.kwad.sdk.core.video.videoview.a r1 = r9.cq
            r1.setExternalPlayerListener(r0)
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            boolean r1 = r9.mIsAudioEnable
            boolean r1 = r9.h(r1)
            r0.setVideoSoundEnable(r1)
            com.kwad.components.core.video.e r0 = new com.kwad.components.core.video.e
            android.content.Context r1 = r9.mContext
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r9.mAdTemplate
            com.kwad.sdk.core.video.videoview.a r4 = r9.cq
            r0.<init>(r1, r3, r4, r10)
            r9.hN = r0
            com.kwad.components.core.video.a$a r10 = r9.hQ
            r0.setAdClickListener(r10)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r9.ht = r0
            com.kwad.components.core.video.e r10 = r9.hN
            com.kwad.components.core.video.a$b r0 = r9.cA
            r10.setVideoPlayCallback(r0)
            com.kwad.sdk.core.video.videoview.a r10 = r9.cq
            com.kwad.components.core.video.e r0 = r9.hN
            r10.setController(r0)
            com.kwad.sdk.widget.KSRelativeLayout r10 = r9.hL
            java.lang.Object r10 = r10.getTag()
            if (r10 == 0) goto L17c
            com.kwad.sdk.widget.KSRelativeLayout r10 = r9.hL
            java.lang.Object r0 = r10.getTag()
            android.view.View r0 = (android.view.View) r0
            r10.removeView(r0)
            com.kwad.sdk.widget.KSRelativeLayout r10 = r9.hL
            r10.setTag(r2)
        L17c:
            com.kwad.sdk.widget.KSRelativeLayout r10 = r9.hL
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            r10.addView(r0)
            com.kwad.sdk.widget.KSRelativeLayout r10 = r9.hL
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            r10.setTag(r0)
            boolean r10 = r9.cw()
            if (r10 == 0) goto L1a6
            int r10 = com.kwad.sdk.R.id.ksad_feed_bottombar_container
            android.view.View r10 = r9.findViewById(r10)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            android.view.ViewParent r0 = r10.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r10)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r9.hL
            r0.addView(r10)
        L1a6:
            com.kwad.sdk.widget.KSRelativeLayout r10 = r9.hL
            r0 = 1
            r10.setClickable(r0)
            com.kwad.sdk.widget.KSRelativeLayout r10 = r9.hL
            r10.setOnClickListener(r9)
            com.kwad.sdk.widget.h r10 = new com.kwad.sdk.widget.h
            android.content.Context r0 = r9.getContext()
            com.kwad.sdk.widget.KSRelativeLayout r1 = r9.hL
            r10.<init>(r0, r1, r9)
            boolean r10 = r9.mIsAudioEnable
            if (r10 == 0) goto L1cb
            android.content.Context r10 = r9.mContext
            com.kwad.components.core.t.a r10 = com.kwad.components.core.t.a.aC(r10)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r0 = r9.cB
            r10.a(r0)
        L1cb:
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            super.bt()
            com.kwad.components.core.video.e r0 = r2.hN
            if (r0 == 0) goto Lc
            com.kwad.components.core.video.a$b r1 = r2.cA
            r0.setVideoPlayCallback(r1)
        Lc:
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.getCurrentVoiceItem()
            r0.a(r1)
            boolean r0 = r2.hS
            if (r0 != 0) goto L1c
            return
        L1c:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR
            if (r0 != 0) goto L27
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.cu()
            r2.hR = r0
            return
        L27:
            r0.onResume()
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.j.c
    public final void bu() {
            r2 = this;
            super.bu()
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR
            if (r0 == 0) goto La
            r0.onPause()
        La:
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.fD
            r0.c(r1)
            return
    }

    @Override // com.kwad.components.core.widget.b
    public void bw() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_ad_desc
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.hA = r0
            int r0 = com.kwad.sdk.R.id.ksad_feed_ad_video_container
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.widget.KSRelativeLayout r0 = (com.kwad.sdk.widget.KSRelativeLayout) r0
            r1.hL = r0
            r1.cr()
            int r0 = com.kwad.sdk.R.id.ksad_ad_dislike
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.hC = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_first_frame_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.hM = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_dislike_logo
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r1.mLogoView = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_download_btn
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.ad.widget.DownloadProgressView r0 = (com.kwad.components.ad.widget.DownloadProgressView) r0
            r1.hH = r0
            int r0 = com.kwad.sdk.R.id.ksad_live_end_text
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.hP = r0
            int r0 = com.kwad.sdk.R.id.ksad_live_end_bg_mantle
            android.view.View r0 = r1.findViewById(r0)
            r1.fF = r0
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void cq() {
            r2 = this;
            super.cq()
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L10
            com.kwad.components.ad.widget.DownloadProgressView r1 = r2.hH
            com.kwad.sdk.api.KsAppDownloadListener r1 = r1.getAppDownloadListener()
            r0.c(r1)
        L10:
            boolean r0 = r2.mIsAudioEnable
            if (r0 == 0) goto L1f
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r2.cB
            r0.b(r1)
        L1f:
            return
    }

    protected void cr() {
            r2 = this;
            com.kwad.sdk.widget.KSRelativeLayout r0 = r2.hL
            r1 = 1057971241(0x3f0f5c29, float:0.56)
            r0.setRatio(r1)
            return
    }

    protected final boolean cw() {
            r2 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.e.eG(r0)
            boolean r0 = com.kwad.components.model.FeedType.isNewVerticalType(r0)
            if (r0 == 0) goto L2a
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.e.eH(r0)
            com.kwad.components.model.FeedType$FeedDefaultType r1 = com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_NOVEL_DEFAULT
            int r1 = r1.getDefaultType()
            if (r0 == r1) goto L28
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.e.eH(r0)
            com.kwad.components.model.FeedType$FeedDefaultType r1 = com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_BISERIAL_DEFAULT
            int r1 = r1.getDefaultType()
            if (r0 != r1) goto L2a
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.widget.b
    public final void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r3) {
            r2 = this;
            super.d(r3)
            android.widget.TextView r3 = r2.hA
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            java.lang.String r0 = com.kwad.components.ad.feed.f.l(r0)
            r3.setText(r0)
            com.kwad.components.core.widget.KsLogoView r3 = r2.mLogoView
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r3.aP(r0)
            r2.cs()
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.a.aF(r3)
            r0 = 8
            r1 = 0
            if (r3 == 0) goto L3c
            int r3 = com.kwad.sdk.R.id.ksad_ad_download_container
            android.view.View r3 = r2.findViewById(r3)
            r3.setVisibility(r1)
            int r3 = com.kwad.sdk.R.id.ksad_ad_h5_container
            android.view.View r3 = r2.findViewById(r3)
            r3.setVisibility(r0)
            r2.cn()
            r2.cx()
            goto L5a
        L3c:
            int r3 = com.kwad.sdk.R.id.ksad_ad_h5_container
            android.view.View r3 = r2.findViewById(r3)
            r3.setVisibility(r1)
            int r3 = com.kwad.sdk.R.id.ksad_ad_download_container
            android.view.View r3 = r2.findViewById(r3)
            r3.setVisibility(r0)
            boolean r3 = r2.cw()
            if (r3 == 0) goto L57
            r2.cn()
        L57:
            r2.cm()
        L5a:
            android.widget.TextView r3 = r2.hA
            r3.setOnClickListener(r2)
            com.kwad.sdk.widget.KSRelativeLayout r3 = r2.hL
            r3.setOnClickListener(r2)
            android.widget.ImageView r3 = r2.hC
            r3.setOnClickListener(r2)
            com.kwad.sdk.widget.h r3 = new com.kwad.sdk.widget.h
            android.content.Context r0 = r2.getContext()
            android.widget.TextView r1 = r2.hA
            r3.<init>(r0, r1, r2)
            com.kwad.sdk.widget.h r3 = new com.kwad.sdk.widget.h
            android.content.Context r0 = r2.getContext()
            com.kwad.sdk.widget.KSRelativeLayout r1 = r2.hL
            r3.<init>(r0, r1, r2)
            com.kwad.sdk.widget.h r3 = new com.kwad.sdk.widget.h
            android.content.Context r0 = r2.getContext()
            android.widget.ImageView r1 = r2.hC
            r3.<init>(r0, r1, r2)
            r2.setOnClickListener(r2)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.hC
            if (r5 != r0) goto L8
            r4.vW()
            return
        L8:
            com.kwad.sdk.widget.KSRelativeLayout r0 = r4.hL
            if (r5 != r0) goto L2c
            com.kwad.sdk.core.video.videoview.a r0 = r4.cq
            if (r0 == 0) goto L2c
            boolean r0 = r0.isIdle()
            if (r0 == 0) goto L2c
            R extends com.kwad.sdk.core.response.model.AdTemplate r5 = r4.mAdTemplate
            com.kwad.sdk.utils.n.eL(r5)
            R extends com.kwad.sdk.core.response.model.AdTemplate r5 = r4.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r5 = com.kwad.sdk.contentalliance.a.a.a.bQ(r5)
            com.kwad.sdk.core.video.videoview.a r0 = r4.cq
            r0.setKsPlayLogParam(r5)
            com.kwad.sdk.core.video.videoview.a r5 = r4.cq
            r5.start()
            return
        L2c:
            android.widget.TextView r0 = r4.hA
            r1 = 1
            if (r5 != r0) goto L34
            r0 = 25
            goto L6d
        L34:
            com.kwad.sdk.widget.KSRelativeLayout r0 = r4.hL
            r2 = 100
            if (r5 != r0) goto L3d
        L3a:
            r0 = 100
            goto L6d
        L3d:
            com.kwad.components.ad.widget.DownloadProgressView r0 = r4.hH
            if (r5 == r0) goto L6c
            android.widget.TextView r0 = r4.gD
            if (r5 == r0) goto L6c
            android.view.View r0 = r4.hG
            if (r5 != r0) goto L4a
            goto L6c
        L4a:
            android.widget.ImageView r0 = r4.gw
            if (r5 != r0) goto L51
            r0 = 13
            goto L6d
        L51:
            android.widget.TextView r0 = r4.ee
            if (r5 != r0) goto L58
            r0 = 14
            goto L6d
        L58:
            android.widget.TextView r0 = r4.hE
            if (r5 == r0) goto L69
            android.widget.TextView r0 = r4.hF
            if (r5 != r0) goto L61
            goto L69
        L61:
            com.kwad.sdk.core.video.videoview.a r0 = r4.cq
            if (r5 != r0) goto L66
            goto L3a
        L66:
            r0 = 35
            goto L6d
        L69:
            r0 = 101(0x65, float:1.42E-43)
            goto L6d
        L6c:
            r0 = 1
        L6d:
            com.kwad.sdk.core.video.videoview.a r2 = r4.cq
            com.kwad.components.ad.widget.DownloadProgressView r3 = r4.hH
            if (r5 != r3) goto L74
            goto L75
        L74:
            r1 = 0
        L75:
            r4.a(r2, r1, r0)
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.View
    public void onWindowFocusChanged(boolean r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L6
            goto La3
        L6:
            super.onWindowFocusChanged(r3)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L92
            boolean r3 = r2.ct()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L13
            goto La3
        L13:
            com.kwad.sdk.core.video.videoview.a r3 = r2.cq     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L82
            com.kwad.components.core.video.e r0 = r2.hN     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L82
            android.view.ViewParent r3 = r3.getParent()     // Catch: java.lang.Throwable -> L4a
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.core.video.videoview.a r0 = r2.cq     // Catch: java.lang.Throwable -> L4a
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.widget.KSRelativeLayout r1 = r2.hL     // Catch: java.lang.Throwable -> L4a
            if (r0 == r1) goto L82
            com.kwad.sdk.core.video.videoview.a r0 = r2.cq     // Catch: java.lang.Throwable -> L4a
            r3.removeView(r0)     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.widget.KSRelativeLayout r3 = r2.hL     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r3 = r3.getTag()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            com.kwad.sdk.widget.KSRelativeLayout r3 = r2.hL     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r3.getTag()     // Catch: java.lang.Throwable -> L4a
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L4a
            r3.removeView(r0)     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.widget.KSRelativeLayout r3 = r2.hL     // Catch: java.lang.Throwable -> L4a
            r0 = 0
            r3.setTag(r0)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r3 = move-exception
            goto La4
        L4c:
            com.kwad.sdk.widget.KSRelativeLayout r3 = r2.hL     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.core.video.videoview.a r0 = r2.cq     // Catch: java.lang.Throwable -> L4a
            r3.addView(r0)     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.widget.KSRelativeLayout r3 = r2.hL     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.core.video.videoview.a r0 = r2.cq     // Catch: java.lang.Throwable -> L4a
            r3.setTag(r0)     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.core.video.videoview.a r3 = r2.cq     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r2.mIsAudioEnable     // Catch: java.lang.Throwable -> L4a
            r3.setVideoSoundEnable(r0)     // Catch: java.lang.Throwable -> L4a
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r2.mIsAudioEnable     // Catch: java.lang.Throwable -> L4a
            r3.mIsAudioEnable = r0     // Catch: java.lang.Throwable -> L4a
            com.kwad.components.core.video.e r3 = r2.hN     // Catch: java.lang.Throwable -> L4a
            com.kwad.components.core.video.a$a r0 = r2.hQ     // Catch: java.lang.Throwable -> L4a
            r3.setAdClickListener(r0)     // Catch: java.lang.Throwable -> L4a
            com.kwad.components.core.video.e r3 = r2.hN     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()     // Catch: java.lang.Throwable -> L4a
            r0 = 0
            r3.mAdWebVideoPageShowing = r0     // Catch: java.lang.Throwable -> L4a
            com.kwad.components.core.video.e r3 = r2.hN     // Catch: java.lang.Throwable -> L4a
            r3.tU()     // Catch: java.lang.Throwable -> L4a
            com.kwad.components.core.video.e r3 = r2.hN     // Catch: java.lang.Throwable -> L4a
            r0 = 1
            r3.setAutoRelease(r0)     // Catch: java.lang.Throwable -> L4a
        L82:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto La3
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.K(r3)     // Catch: java.lang.Throwable -> L4a
            com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache r0 = com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache.getInstance()     // Catch: java.lang.Throwable -> L4a
            r0.remove(r3)     // Catch: java.lang.Throwable -> L4a
            return
        L92:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r3 = r2.fq     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto La3
            android.view.View r3 = r3.getView()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto La3
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r3 = r2.hR     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto La3
            r3.onPause()     // Catch: java.lang.Throwable -> L4a
        La3:
            return
        La4:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public void setRadiusDp(int r1) {
            r0 = this;
            r0.hJ = r1
            return
    }

    public void setVideoPlayConfig(com.kwad.sdk.api.KsAdVideoPlayConfig r4) {
            r3 = this;
            r3.bU = r4
            boolean r0 = r4 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r0 == 0) goto L69
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r4 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r4
            int r0 = r4.getVideoSoundValue()
            if (r0 == 0) goto L15
            boolean r0 = r4.isVideoSoundEnable()
            r3.mIsAudioEnable = r0
            goto L1d
        L15:
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.ca(r0)
            r3.mIsAudioEnable = r0
        L1d:
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r1 = r3.mIsAudioEnable
            r0.mIsAudioEnable = r1
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r3.fq
            if (r0 == 0) goto L3c
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L3c
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r3.hR
            if (r0 == 0) goto L3c
            boolean r1 = r3.mIsAudioEnable
            boolean r1 = r3.h(r1)
            r2 = 0
            r0.setAudioEnabled(r1, r2)
            goto L49
        L3c:
            com.kwad.sdk.core.video.videoview.a r0 = r3.cq
            if (r0 == 0) goto L49
            boolean r1 = r3.mIsAudioEnable
            boolean r1 = r3.h(r1)
            r0.setVideoSoundEnable(r1)
        L49:
            boolean r0 = r3.mIsAudioEnable
            if (r0 == 0) goto L58
            android.content.Context r0 = r3.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r3.cB
            r0.a(r1)
        L58:
            int r0 = r4.getDataFlowAutoStartValue()
            if (r0 == 0) goto L69
            com.kwad.components.core.video.e r0 = r3.hN
            if (r0 == 0) goto L69
            boolean r4 = r4.isDataFlowAutoStart()
            r0.setDataAutoStart(r4)
        L69:
            return
    }

    public void setmIsShowComplianceView(boolean r1) {
            r0 = this;
            r0.hI = r1
            return
    }
}
