package com.kwad.components.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FeedVideoView extends com.kwad.components.core.widget.b<com.kwad.sdk.core.response.model.AdResultData, com.kwad.sdk.core.response.model.AdTemplate> implements androidx.core.view.NestedScrollingChild {
    private androidx.core.view.NestedScrollingChildHelper UX;
    private com.kwad.components.core.video.e Vp;
    private com.kwad.components.core.widget.KSCornerImageView aiA;
    private android.widget.TextView aiB;
    private com.kwad.sdk.core.view.ScaleAnimSeekBar aiC;
    private android.widget.ImageView aiD;
    private android.widget.ImageView aiE;
    private android.widget.ImageView aiF;
    private android.view.ViewGroup aiG;
    private android.view.ViewGroup aiH;
    private android.widget.TextView aiI;
    private android.view.ViewGroup aiJ;
    private android.view.ViewGroup aiK;
    private int aiL;
    private boolean aiM;
    private boolean aiN;
    private long aiO;
    private boolean aiP;
    private com.kwad.sdk.api.KsAdVideoPlayConfig aiQ;
    private com.kwad.components.core.widget.FeedVideoView.a aiR;
    private android.view.View aiS;
    private boolean aiT;
    private java.lang.Runnable aiU;
    private com.kwad.components.core.t.p aiV;
    private com.kwad.sdk.widget.RatioFrameLayout aiv;
    private android.widget.TextView aiw;
    private android.widget.TextView aix;
    private android.widget.TextView aiy;
    private android.view.View aiz;
    private java.util.List<java.lang.Integer> ck;
    private com.kwad.sdk.core.video.videoview.a cq;
    private com.kwad.sdk.core.video.videoview.a.InterfaceC0149a cz;
    private com.kwad.sdk.api.KsAppDownloadListener dW;
    private android.view.View.OnClickListener fN;
    private android.widget.TextView hA;
    private android.widget.ImageView hM;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;













    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void rb();

        void rc();
    }

    public FeedVideoView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 100
            r1.aiL = r2
            com.kwad.components.core.widget.FeedVideoView$7 r2 = new com.kwad.components.core.widget.FeedVideoView$7
            r2.<init>(r1)
            r1.aiU = r2
            com.kwad.components.core.t.p r0 = new com.kwad.components.core.t.p
            r0.<init>(r2)
            r1.aiV = r0
            return
    }

    public FeedVideoView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 100
            r0.aiL = r1
            com.kwad.components.core.widget.FeedVideoView$7 r1 = new com.kwad.components.core.widget.FeedVideoView$7
            r1.<init>(r0)
            r0.aiU = r1
            com.kwad.components.core.t.p r2 = new com.kwad.components.core.t.p
            r2.<init>(r1)
            r0.aiV = r2
            return
    }

    public FeedVideoView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 100
            r0.aiL = r1
            com.kwad.components.core.widget.FeedVideoView$7 r1 = new com.kwad.components.core.widget.FeedVideoView$7
            r1.<init>(r0)
            r0.aiU = r1
            com.kwad.components.core.t.p r2 = new com.kwad.components.core.t.p
            r2.<init>(r1)
            r0.aiV = r2
            return
    }

    static /* synthetic */ android.widget.TextView a(com.kwad.components.core.widget.FeedVideoView r0) {
            android.widget.TextView r0 = r0.aiy
            return r0
    }

    private void a(com.kwad.components.core.video.a r3, com.kwad.sdk.core.video.videoview.a r4) {
            r2 = this;
            android.view.ViewGroup r0 = r2.aiJ
            com.kwad.components.core.widget.FeedVideoView$8 r1 = new com.kwad.components.core.widget.FeedVideoView$8
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            com.kwad.components.core.widget.FeedVideoView$9 r0 = new com.kwad.components.core.widget.FeedVideoView$9
            r0.<init>(r2, r4)
            r3.setVideoPlayCallback(r0)
            com.kwad.components.core.video.e r3 = r2.Vp
            com.kwad.components.core.widget.FeedVideoView$10 r0 = new com.kwad.components.core.widget.FeedVideoView$10
            r0.<init>(r2)
            r3.setAdClickListener(r0)
            com.kwad.sdk.core.view.ScaleAnimSeekBar r3 = r2.aiC
            com.kwad.components.core.widget.FeedVideoView$11 r0 = new com.kwad.components.core.widget.FeedVideoView$11
            r0.<init>(r2, r4)
            r3.setOnSeekBarChangeListener(r0)
            android.widget.ImageView r3 = r2.aiD
            com.kwad.components.core.widget.FeedVideoView$12 r0 = new com.kwad.components.core.widget.FeedVideoView$12
            r0.<init>(r2, r4)
            r3.setOnClickListener(r0)
            android.widget.ImageView r3 = r2.aiF
            com.kwad.components.core.widget.FeedVideoView$2 r4 = new com.kwad.components.core.widget.FeedVideoView$2
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.view.ViewGroup r3 = r2.aiH
            com.kwad.components.core.widget.FeedVideoView$3 r4 = new com.kwad.components.core.widget.FeedVideoView$3
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.widget.ImageView r3 = r2.aiE
            com.kwad.components.core.widget.FeedVideoView$4 r4 = new com.kwad.components.core.widget.FeedVideoView$4
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.widget.FeedVideoView r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.core.widget.FeedVideoView r0, boolean r1) {
            r1 = 1
            r0.aiT = r1
            return r1
    }

    static /* synthetic */ android.view.View.OnClickListener b(com.kwad.components.core.widget.FeedVideoView r0) {
            android.view.View$OnClickListener r0 = r0.fN
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.core.widget.FeedVideoView r0, boolean r1) {
            r0.aiP = r1
            return r1
    }

    static /* synthetic */ android.view.ViewGroup c(com.kwad.components.core.widget.FeedVideoView r0) {
            android.view.ViewGroup r0 = r0.aiG
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

    static /* synthetic */ android.widget.ImageView d(com.kwad.components.core.widget.FeedVideoView r0) {
            android.widget.ImageView r0 = r0.aiF
            return r0
    }

    static /* synthetic */ com.kwad.components.core.video.e e(com.kwad.components.core.widget.FeedVideoView r0) {
            com.kwad.components.core.video.e r0 = r0.Vp
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.video.videoview.a f(com.kwad.components.core.widget.FeedVideoView r0) {
            com.kwad.sdk.core.video.videoview.a r0 = r0.cq
            return r0
    }

    static /* synthetic */ java.lang.Runnable g(com.kwad.components.core.widget.FeedVideoView r0) {
            java.lang.Runnable r0 = r0.aiU
            return r0
    }

    private com.kwad.sdk.api.KsAppDownloadListener getAppDownloadListener() {
            r1 = this;
            com.kwad.sdk.api.KsAppDownloadListener r0 = r1.dW
            if (r0 != 0) goto Lb
            com.kwad.components.core.widget.FeedVideoView$1 r0 = new com.kwad.components.core.widget.FeedVideoView$1
            r0.<init>(r1)
            r1.dW = r0
        Lb:
            com.kwad.sdk.api.KsAppDownloadListener r0 = r1.dW
            return r0
    }

    static /* synthetic */ com.kwad.components.core.t.p h(com.kwad.components.core.widget.FeedVideoView r0) {
            com.kwad.components.core.t.p r0 = r0.aiV
            return r0
    }

    static /* synthetic */ int i(com.kwad.components.core.widget.FeedVideoView r0) {
            int r0 = r0.aiL
            return r0
    }

    static /* synthetic */ boolean j(com.kwad.components.core.widget.FeedVideoView r0) {
            boolean r0 = r0.aiP
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.view.ScaleAnimSeekBar k(com.kwad.components.core.widget.FeedVideoView r0) {
            com.kwad.sdk.core.view.ScaleAnimSeekBar r0 = r0.aiC
            return r0
    }

    static /* synthetic */ android.widget.TextView l(com.kwad.components.core.widget.FeedVideoView r0) {
            android.widget.TextView r0 = r0.aix
            return r0
    }

    static /* synthetic */ android.widget.TextView m(com.kwad.components.core.widget.FeedVideoView r0) {
            android.widget.TextView r0 = r0.aiw
            return r0
    }

    static /* synthetic */ boolean n(com.kwad.components.core.widget.FeedVideoView r0) {
            boolean r0 = r0.aiT
            return r0
    }

    static /* synthetic */ com.kwad.components.core.e.d.c o(com.kwad.components.core.widget.FeedVideoView r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            return r0
    }

    static /* synthetic */ android.widget.ImageView p(com.kwad.components.core.widget.FeedVideoView r0) {
            android.widget.ImageView r0 = r0.aiD
            return r0
    }

    static /* synthetic */ void q(com.kwad.components.core.widget.FeedVideoView r0) {
            r0.wb()
            return
    }

    static /* synthetic */ void r(com.kwad.components.core.widget.FeedVideoView r0) {
            r0.wa()
            return
    }

    private boolean vZ() {
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r7.aiO
            long r2 = r0 - r2
            r4 = 888(0x378, double:4.387E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L10
            r7.aiO = r0
        L10:
            if (r6 <= 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    private void wa() {
            r8 = this;
            com.kwad.components.core.widget.FeedVideoView$a r0 = r8.aiR
            if (r0 == 0) goto L7
            r0.rb()
        L7:
            int r0 = r8.aiL
            r1 = 100
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            boolean r1 = r8.vZ()
            r0 = r0 & r1
            if (r0 == 0) goto Leb
            android.view.ViewGroup r0 = r8.aiH
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.aiI
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r1 = r1.adBaseInfo
            java.lang.String r1 = r1.adDescription
            r0.setText(r1)
            com.kwad.sdk.core.response.model.AdInfo r0 = r8.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.R(r0)
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            int r1 = com.kwad.sdk.core.response.b.a.Q(r1)
            if (r0 <= r1) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            android.content.Context r1 = r8.getContext()
            boolean r1 = com.kwad.sdk.utils.aq.dg(r1)
            r8.aiM = r1
            r8.getContext()
            boolean r1 = com.kwad.sdk.utils.aq.QW()
            r8.aiN = r1
            if (r0 != 0) goto L57
            android.content.Context r1 = r8.getContext()
            com.kwad.sdk.utils.aq.di(r1)
            goto L5e
        L57:
            android.content.Context r1 = r8.getContext()
            com.kwad.sdk.utils.aq.dj(r1)
        L5e:
            android.view.ViewGroup r1 = r8.aiJ
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r8.aiK = r1
            if (r1 == 0) goto L95
            android.view.ViewGroup r4 = r8.aiJ
            r1.removeView(r4)
            android.view.View r4 = new android.view.View
            android.view.ViewGroup r5 = r8.aiJ
            android.content.Context r5 = r5.getContext()
            r4.<init>(r5)
            r8.aiS = r4
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            android.view.ViewGroup r6 = r8.aiJ
            int r6 = r6.getWidth()
            android.view.ViewGroup r7 = r8.aiJ
            int r7 = r7.getHeight()
            r5.<init>(r6, r7)
            r4.setLayoutParams(r5)
            android.view.View r4 = r8.aiS
            r1.addView(r4)
        L95:
            android.content.Context r1 = r8.getContext()
            com.kwad.sdk.utils.aq.d(r1, r3)
            android.content.Context r1 = r8.getContext()
            android.app.Activity r1 = com.kwad.sdk.o.m.ej(r1)
            if (r1 == 0) goto Leb
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.ViewGroup r3 = r8.aiJ
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            int r5 = r1.getWidth()
            int r6 = r1.getHeight()
            r4.<init>(r5, r6)
            r3.setLayoutParams(r4)
            if (r0 != r2) goto Ldb
            int r0 = r1.getWidth()
            if (r0 == 0) goto Ldb
            com.kwad.sdk.widget.RatioFrameLayout r0 = r8.aiv
            int r2 = r1.getHeight()
            float r2 = (float) r2
            int r3 = r1.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            double r2 = (double) r2
            r0.setRatio(r2)
        Ldb:
            android.view.ViewGroup r0 = r8.aiJ
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r1.addView(r0, r2)
            r0 = 101(0x65, float:1.42E-43)
            r8.setUIWithStateAndMode(r0)
        Leb:
            return
    }

    private void wb() {
            r5 = this;
            int r0 = r5.aiL
            r1 = 101(0x65, float:1.42E-43)
            r2 = 1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            boolean r1 = r5.vZ()
            r0 = r0 & r1
            if (r0 == 0) goto L98
            android.view.ViewGroup r0 = r5.aiH
            r1 = 8
            r0.setVisibility(r1)
            boolean r0 = r5.aiM
            if (r0 == 0) goto L24
            android.content.Context r0 = r5.getContext()
            com.kwad.sdk.utils.aq.dg(r0)
            goto L2b
        L24:
            android.content.Context r0 = r5.getContext()
            com.kwad.sdk.utils.aq.dh(r0)
        L2b:
            boolean r0 = r5.aiN
            if (r0 == 0) goto L37
            android.content.Context r0 = r5.getContext()
            com.kwad.sdk.utils.aq.dj(r0)
            goto L3e
        L37:
            android.content.Context r0 = r5.getContext()
            com.kwad.sdk.utils.aq.di(r0)
        L3e:
            android.content.Context r0 = r5.getContext()
            com.kwad.sdk.utils.aq.d(r0, r2)
            android.view.ViewGroup r0 = r5.aiJ
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L54
            android.view.ViewGroup r1 = r5.aiJ
            r0.removeView(r1)
        L54:
            android.view.ViewGroup r0 = r5.aiJ
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            android.view.ViewGroup r2 = r5.aiK
            int r2 = r2.getWidth()
            android.view.ViewGroup r3 = r5.aiK
            int r3 = r3.getHeight()
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            com.kwad.sdk.widget.RatioFrameLayout r0 = r5.aiv
            r1 = 4603219251149406208(0x3fe1eb8520000000, double:0.5600000023841858)
            r0.setRatio(r1)
            android.view.View r0 = r5.aiS
            if (r0 == 0) goto L80
            android.view.ViewGroup r1 = r5.aiK
            r1.removeView(r0)
            r0 = 0
            r5.aiS = r0
        L80:
            android.view.ViewGroup r0 = r5.aiK
            android.view.ViewGroup r1 = r5.aiJ
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r0.addView(r1, r2)
            android.view.ViewGroup r0 = r5.aiJ
            r0.requestLayout()
            r0 = 100
            r5.setUIWithStateAndMode(r0)
        L98:
            com.kwad.components.core.widget.FeedVideoView$a r0 = r5.aiR
            if (r0 == 0) goto L9f
            r0.rc()
        L9f:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, com.kwad.sdk.widget.k
    public final void E(android.view.View r1) {
            r0 = this;
            super.E(r1)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.api.KsAdVideoPlayConfig r10, com.kwad.components.core.e.d.c r11) {
            r9 = this;
            r9.mApkDownloadHelper = r11
            r11 = 0
            r9.aiT = r11
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            r9.aiQ = r10
            java.lang.String r0 = r0.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 8
            if (r1 != 0) goto L2c
            android.widget.ImageView r1 = r9.hM
            r1.setImageDrawable(r2)
            android.widget.ImageView r1 = r9.hM
            R extends com.kwad.sdk.core.response.model.AdTemplate r4 = r9.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r4)
            android.widget.ImageView r0 = r9.hM
            r0.setVisibility(r11)
            goto L31
        L2c:
            android.widget.ImageView r0 = r9.hM
            r0.setVisibility(r3)
        L31:
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            java.util.List r0 = com.kwad.sdk.core.response.b.a.bp(r0)
            r9.ck = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.K(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L46
            return
        L46:
            com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache r1 = com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache.getInstance()
            com.kwad.sdk.core.video.videoview.a r1 = r1.eF(r0)
            r9.cq = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = r9.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.aq(r1)
            if (r1 == 0) goto L9e
            android.widget.TextView r1 = r9.hA
            r1.setVisibility(r3)
            android.view.View r1 = r9.aiz
            if (r1 == 0) goto Laa
            r1.setVisibility(r11)
            android.widget.TextView r1 = r9.aiy
            com.kwad.sdk.core.response.model.AdInfo r4 = r9.mAdInfo
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.aE(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r9.aiB
            com.kwad.sdk.core.response.model.AdInfo r4 = r9.mAdInfo
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.cl(r4)
            r1.setText(r4)
            com.kwad.components.core.widget.KSCornerImageView r1 = r9.aiA
            com.kwad.sdk.core.response.model.AdInfo r4 = r9.mAdInfo
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.co(r4)
            R extends com.kwad.sdk.core.response.model.AdTemplate r5 = r9.mAdTemplate
            r6 = 4
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r1, r4, r5, r6)
            com.kwad.components.core.e.d.c r1 = r9.mApkDownloadHelper
            if (r1 == 0) goto L93
            com.kwad.sdk.api.KsAppDownloadListener r4 = r9.getAppDownloadListener()
            r1.b(r4)
        L93:
            android.widget.TextView r1 = r9.aiy
            com.kwad.components.core.widget.FeedVideoView$5 r4 = new com.kwad.components.core.widget.FeedVideoView$5
            r4.<init>(r9)
            r1.setOnClickListener(r4)
            goto Laa
        L9e:
            android.view.View r1 = r9.aiz
            if (r1 == 0) goto La5
            r1.setVisibility(r3)
        La5:
            android.widget.TextView r1 = r9.hA
            r1.setVisibility(r11)
        Laa:
            com.kwad.sdk.core.video.videoview.a r1 = r9.cq
            r4 = 1
            if (r1 != 0) goto L13b
            com.kwad.sdk.core.video.videoview.a r1 = new com.kwad.sdk.core.video.videoview.a
            android.content.Context r5 = r9.getContext()
            r1.<init>(r5)
            r9.cq = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = r9.mAdInfo
            com.kwad.sdk.core.response.b.a.ab(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r1 = new com.kwad.sdk.contentalliance.a.a.b$a
            R extends com.kwad.sdk.core.response.model.AdTemplate r5 = r9.mAdTemplate
            r1.<init>(r5)
            R extends com.kwad.sdk.core.response.model.AdTemplate r5 = r9.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r5 = r5.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r1 = r1.a(r5)
            R extends com.kwad.sdk.core.response.model.AdTemplate r5 = r9.mAdTemplate
            java.lang.String r5 = com.kwad.sdk.core.response.b.e.en(r5)
            com.kwad.sdk.contentalliance.a.a.b$a r1 = r1.dg(r5)
            R extends com.kwad.sdk.core.response.model.AdTemplate r5 = r9.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r5 = com.kwad.sdk.core.response.b.e.em(r5)
            java.lang.String r5 = com.kwad.sdk.core.response.b.h.b(r5)
            com.kwad.sdk.contentalliance.a.a.b$a r1 = r1.dh(r5)
            com.kwad.sdk.contentalliance.a.a.a r5 = new com.kwad.sdk.contentalliance.a.a.a
            R extends com.kwad.sdk.core.response.model.AdTemplate r6 = r9.mAdTemplate
            long r7 = java.lang.System.currentTimeMillis()
            r5.<init>(r6, r7)
            com.kwad.sdk.contentalliance.a.a.b$a r1 = r1.b(r5)
            com.kwad.sdk.contentalliance.a.a.b r1 = r1.El()
            com.kwad.sdk.core.video.videoview.a r5 = r9.cq
            r5.a(r1, r2)
            com.kwad.components.core.widget.FeedVideoView$6 r1 = new com.kwad.components.core.widget.FeedVideoView$6
            r1.<init>(r9)
            r9.cz = r1
            com.kwad.sdk.core.video.videoview.a r5 = r9.cq
            r5.setExternalPlayerListener(r1)
            com.kwad.components.core.video.e r1 = new com.kwad.components.core.video.e
            android.content.Context r5 = r9.mContext
            R extends com.kwad.sdk.core.response.model.AdTemplate r6 = r9.mAdTemplate
            com.kwad.sdk.core.video.videoview.a r7 = r9.cq
            r1.<init>(r5, r6, r7, r10)
            r9.Vp = r1
            boolean r5 = r10.isDataFlowAutoStart()
            r1.setDataFlowAutoStart(r5)
            com.kwad.sdk.core.video.videoview.a r1 = r9.cq
            com.kwad.components.core.video.e r5 = r9.Vp
            r1.setController(r5)
            com.kwad.components.core.video.e r1 = r9.Vp
            r1.setAutoRelease(r11)
            int r1 = com.kwad.sdk.core.config.e.EP()
            r5 = 2
            if (r1 != r5) goto L160
            com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache r1 = com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache.getInstance()
            com.kwad.sdk.core.video.videoview.a r5 = r9.cq
            r1.a(r0, r5)
            goto L160
        L13b:
            java.lang.Object r0 = r1.getTag()
            if (r0 == 0) goto L14b
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq     // Catch: java.lang.Exception -> L14b
            java.lang.Object r0 = r0.getTag()     // Catch: java.lang.Exception -> L14b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L14b
            r9.ck = r0     // Catch: java.lang.Exception -> L14b
        L14b:
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            com.kwad.sdk.core.video.videoview.b r0 = r0.getController()
            com.kwad.components.core.video.e r0 = (com.kwad.components.core.video.e) r0
            r9.Vp = r0
            r0.setAutoRelease(r11)
            com.kwad.components.core.video.e r0 = r9.Vp
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            r0.mAdWebVideoPageShowing = r4
        L160:
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            boolean r10 = r10.isVideoSoundEnable()
            r0.setVideoSoundEnable(r10)
            com.kwad.sdk.core.video.videoview.a r10 = r9.cq
            android.view.ViewParent r10 = r10.getParent()
            if (r10 == 0) goto L183
            com.kwad.sdk.core.video.videoview.a r10 = r9.cq
            android.view.ViewParent r10 = r10.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            r10.removeView(r0)
            com.kwad.components.core.video.e r10 = r9.Vp
            r10.tQ()
        L183:
            com.kwad.sdk.widget.RatioFrameLayout r10 = r9.aiv
            java.lang.Object r10 = r10.getTag()
            if (r10 == 0) goto L19b
            com.kwad.sdk.widget.RatioFrameLayout r10 = r9.aiv
            java.lang.Object r0 = r10.getTag()
            android.view.View r0 = (android.view.View) r0
            r10.removeView(r0)
            com.kwad.sdk.widget.RatioFrameLayout r10 = r9.aiv
            r10.setTag(r2)
        L19b:
            com.kwad.sdk.widget.RatioFrameLayout r10 = r9.aiv
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            r10.addView(r0)
            com.kwad.sdk.widget.RatioFrameLayout r10 = r9.aiv
            com.kwad.sdk.core.video.videoview.a r0 = r9.cq
            r10.setTag(r0)
            android.view.ViewGroup r10 = r9.aiG
            r10.setVisibility(r3)
            android.widget.ImageView r10 = r9.aiF
            r10.setVisibility(r3)
            com.kwad.sdk.core.response.model.AdInfo r10 = r9.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r10 = r10.adConversionInfo
            int r10 = r10.h5Type
            if (r10 != r4) goto L1c1
            android.widget.TextView r10 = r9.hA
            r10.setVisibility(r3)
            goto L1d1
        L1c1:
            android.widget.TextView r10 = r9.hA
            r10.setVisibility(r11)
            android.widget.TextView r10 = r9.hA
            com.kwad.sdk.core.response.model.AdInfo r11 = r9.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r11 = r11.adBaseInfo
            java.lang.String r11 = r11.adDescription
            r10.setText(r11)
        L1d1:
            com.kwad.components.core.video.e r10 = r9.Vp
            com.kwad.sdk.core.video.videoview.a r11 = r9.cq
            r9.a(r10, r11)
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.j.c
    public final void bt() {
            r4 = this;
            super.bt()
            com.kwad.sdk.core.video.videoview.a r0 = r4.cq
            if (r0 == 0) goto L2a
            boolean r0 = r0.isPlaying()
            if (r0 != 0) goto L2a
            r4.rN()
            android.os.Handler r0 = r4.getHandler()
            if (r0 == 0) goto L2a
            android.os.Handler r0 = r4.getHandler()
            com.kwad.components.core.t.p r1 = r4.aiV
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r4.getHandler()
            com.kwad.components.core.t.p r1 = r4.aiV
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r1, r2)
        L2a:
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.j.c
    public final void bu() {
            r4 = this;
            super.bu()
            com.kwad.sdk.core.video.videoview.a r0 = r4.cq
            if (r0 == 0) goto L24
            r4.tw()
            android.os.Handler r0 = r4.getHandler()
            if (r0 == 0) goto L24
            android.os.Handler r0 = r4.getHandler()
            com.kwad.components.core.t.p r1 = r4.aiV
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r4.getHandler()
            com.kwad.components.core.t.p r1 = r4.aiV
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r1, r2)
        L24:
            return
    }

    @Override // com.kwad.components.core.widget.b
    protected final void bw() {
            r3 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = new androidx.core.view.NestedScrollingChildHelper
            r0.<init>(r3)
            r3.UX = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_container
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.widget.RatioFrameLayout r0 = (com.kwad.sdk.widget.RatioFrameLayout) r0
            r3.aiv = r0
            r1 = 4603219251149406208(0x3fe1eb8520000000, double:0.5600000023841858)
            r0.setRatio(r1)
            int r0 = com.kwad.sdk.R.id.ksad_video_first_frame_container
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.hM = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_text_below
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.hA = r0
            int r0 = com.kwad.sdk.R.id.ksad_web_video_seek_bar
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.core.view.ScaleAnimSeekBar r0 = (com.kwad.sdk.core.view.ScaleAnimSeekBar) r0
            r3.aiC = r0
            r1 = 100
            r0.setMaxProgress(r1)
            com.kwad.sdk.core.view.ScaleAnimSeekBar r0 = r3.aiC
            r1 = 0
            r0.setMinProgress(r1)
            int r0 = com.kwad.sdk.R.id.ksad_video_text_below_action_bar
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.aiy = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_text_below_action_icon_layout
            android.view.View r0 = r3.findViewById(r0)
            r3.aiz = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_text_below_action_title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.aiB = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_text_below_action_icon
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.widget.KSCornerImageView r0 = (com.kwad.components.core.widget.KSCornerImageView) r0
            r3.aiA = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_control_play_total
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.aiw = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_control_play_duration
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.aix = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_control_play_button
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.aiD = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_control_play_status
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.aiF = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_control_fullscreen
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.aiE = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_control_container
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.aiG = r0
            int r0 = com.kwad.sdk.R.id.ksad_feed_video_container
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.aiJ = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_control_fullscreen_container
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.aiH = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_control_fullscreen_title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.aiI = r0
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            super.d(r1)
            return
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r2 = r0.dispatchNestedFling(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r2 = r0.dispatchNestedPreFling(r2, r3)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r2 = r0.dispatchNestedPreScroll(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.UX
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.kwad.components.core.widget.b
    protected int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_feed_video
            return r0
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r0 = r0.hasNestedScrollingParent()
            return r0
    }

    public final boolean isComplete() {
            r1 = this;
            com.kwad.sdk.core.video.videoview.a r0 = r1.cq
            if (r0 == 0) goto L9
            boolean r0 = r0.isCompleted()
            return r0
        L9:
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    public final void rJ() {
            r1 = this;
            com.kwad.components.core.video.e r0 = r1.Vp
            r0.tQ()
            return
    }

    public final void rN() {
            r3 = this;
            com.kwad.components.core.video.e r0 = r3.Vp
            r0.tT()
            com.kwad.components.core.video.e r0 = r3.Vp
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.core.video.e r0 = r3.Vp
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r3.aiD
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.drawable.ksad_video_player_pause_btn
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r3.aiF
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.drawable.ksad_video_player_pause_center
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            return
    }

    public final void release() {
            r1 = this;
            com.kwad.components.core.video.e r0 = r1.Vp
            if (r0 == 0) goto L7
            r0.release()
        L7:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            r0.setNestedScrollingEnabled(r2)
            return
    }

    public void setOnEndBtnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.fN = r1
            return
    }

    protected void setUIWithStateAndMode(int r4) {
            r3 = this;
            r0 = 101(0x65, float:1.42E-43)
            if (r4 != r0) goto L18
            android.widget.ImageView r0 = r3.aiE
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.drawable.ksad_video_player_exit_fullscreen_btn
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            goto L2b
        L18:
            android.widget.ImageView r0 = r3.aiE
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.drawable.ksad_video_player_fullscreen_btn
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
        L2b:
            r3.aiL = r4
            return
    }

    public void setWindowFullScreenListener(com.kwad.components.core.widget.FeedVideoView.a r1) {
            r0 = this;
            r0.aiR = r1
            return
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r2 = r0.startNestedScroll(r2)
            return r2
    }

    @Override // android.view.View
    public void stopNestedScroll() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            r0.stopNestedScroll()
            return
    }

    public final void tw() {
            r3 = this;
            com.kwad.components.core.video.e r0 = r3.Vp
            r0.tS()
            android.widget.ImageView r0 = r3.aiF
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.aiF
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.drawable.ksad_video_play_176
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r3.aiD
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.drawable.ksad_video_player_play_btn
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            return
    }

    public final boolean wc() {
            r2 = this;
            int r0 = r2.aiL
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto Lb
            r2.wb()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
