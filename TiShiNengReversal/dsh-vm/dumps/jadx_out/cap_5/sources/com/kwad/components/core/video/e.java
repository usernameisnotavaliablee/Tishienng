package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.core.video.a implements com.kwad.sdk.utils.ca.a {
    private android.view.View bP;
    private final com.kwad.sdk.utils.ca bQ;
    private final java.util.concurrent.atomic.AtomicBoolean bR;
    private boolean bS;
    private boolean bT;
    private final com.kwad.sdk.api.KsAdVideoPlayConfig bU;

    public e(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.NonNull com.kwad.sdk.core.video.videoview.c r3, com.kwad.sdk.api.KsAdVideoPlayConfig r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.utils.ca r1 = new com.kwad.sdk.utils.ca
            r1.<init>(r0)
            r0.bQ = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 1
            r1.<init>(r2)
            r0.bR = r1
            r0.bT = r2
            r0.bP = r0
            r0.bU = r4
            return
    }

    private void aa() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.bR
            r1 = 0
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "FeedVideoPlayerController"
            java.lang.String r1 = "onViewAttached"
            com.kwad.sdk.core.d.c.i(r0, r1)
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 1
            r0.sendEmptyMessage(r1)
        L16:
            return
    }

    private boolean ad() {
            r4 = this;
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r4.bU
            boolean r1 = r0 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            r2 = 0
            if (r1 == 0) goto L47
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r0 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r0
            int r1 = r0.getVideoAutoPlayType()
            r3 = 1
            if (r1 != r3) goto L17
            android.content.Context r0 = r4.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            return r0
        L17:
            int r1 = r0.getVideoAutoPlayType()
            r3 = 2
            if (r1 != r3) goto L25
            android.content.Context r0 = r4.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isWifiConnected(r0)
            return r0
        L25:
            int r1 = r0.getVideoAutoPlayType()
            r3 = 3
            if (r1 != r3) goto L2d
            return r2
        L2d:
            int r1 = r0.getDataFlowAutoStartValue()
            if (r1 == 0) goto L47
            boolean r0 = r0.isDataFlowAutoStart()
            if (r0 == 0) goto L40
            android.content.Context r0 = r4.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            return r0
        L40:
            android.content.Context r0 = r4.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isWifiConnected(r0)
            return r0
        L47:
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cc(r0)
            if (r0 == 0) goto L56
            android.content.Context r0 = r4.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            return r0
        L56:
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cd(r0)
            if (r0 == 0) goto L65
            android.content.Context r0 = r4.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isWifiConnected(r0)
            return r0
        L65:
            return r2
    }

    private boolean tR() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            int r1 = r0.type
            r2 = 21
            if (r1 != r2) goto L11
            int r0 = r0.defaultType
            r1 = 1
            if (r0 == r1) goto L10
            r2 = 2
            if (r0 != r2) goto L11
        L10:
            return r1
        L11:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.utils.ca.a
    public final void a(android.os.Message r4) {
            r3 = this;
            boolean r0 = r3.Zn
            if (r0 == 0) goto L5
            goto L26
        L5:
            int r4 = r4.what
            r0 = 1
            if (r4 != r0) goto L26
            android.view.View r4 = r3.bP
            r1 = 30
            boolean r4 = com.kwad.sdk.utils.bz.o(r4, r1)
            if (r4 == 0) goto L1c
            boolean r4 = r3.bS
            if (r4 != 0) goto L1f
            r3.ac()
            goto L1f
        L1c:
            r3.tw()
        L1f:
            com.kwad.sdk.utils.ca r4 = r3.bQ
            r1 = 500(0x1f4, double:2.47E-321)
            r4.sendEmptyMessageDelayed(r0, r1)
        L26:
            return
    }

    public final void ab() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.bR
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "FeedVideoPlayerController"
            java.lang.String r1 = "onViewDetached"
            com.kwad.sdk.core.d.c.i(r0, r1)
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            boolean r0 = r2.bT
            if (r0 == 0) goto L1e
            r2.release()
            return
        L1e:
            com.kwad.sdk.core.video.videoview.c r0 = r2.aKI
            r0.pause()
        L23:
            return
    }

    @Override // com.kwad.components.core.video.a
    protected final void ac() {
            r1 = this;
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            boolean r0 = r0.isIdle()
            if (r0 == 0) goto L4b
            com.kwad.components.core.video.a.a r0 = r1.ZC
            if (r0 == 0) goto Lf
            r0.onStart()
        Lf:
            android.content.Context r0 = r1.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            if (r0 != 0) goto L1b
            r1.tr()
            return
        L1b:
            r1.ts()
            boolean r0 = r1.Zn
            if (r0 == 0) goto L2b
            r1.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.start()
            return
        L2b:
            boolean r0 = r1.ad()
            if (r0 == 0) goto L3a
            r1.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.start()
            return
        L3a:
            boolean r0 = r1.Zl
            if (r0 == 0) goto L47
            r1.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.start()
            return
        L47:
            r1.tt()
            return
        L4b:
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            boolean r0 = r0.isPaused()
            if (r0 != 0) goto L5d
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            boolean r0 = r0.Ke()
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            return
        L5d:
            r1.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.restart()
            return
    }

    @Override // com.kwad.components.core.video.a
    protected final void fA() {
            r6 = this;
            android.content.Context r0 = r6.mContext     // Catch: java.lang.Exception -> L10e
            int r1 = com.kwad.sdk.R.layout.ksad_feed_video_palyer_controller     // Catch: java.lang.Exception -> L10e
            r2 = 0
            android.view.View r0 = com.kwad.sdk.o.m.inflate(r0, r1, r2)     // Catch: java.lang.Exception -> L10e
            r6.ZD = r0     // Catch: java.lang.Exception -> L10e
            int r1 = com.kwad.sdk.R.id.ksad_video_complete_app_container     // Catch: java.lang.Exception -> L10e
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L10e
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L10e
            android.view.View r1 = r6.ZD     // Catch: java.lang.Exception -> L10e
            int r2 = com.kwad.sdk.R.id.ksad_video_complete_app_icon     // Catch: java.lang.Exception -> L10e
            android.view.View r1 = r1.findViewById(r2)     // Catch: java.lang.Exception -> L10e
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch: java.lang.Exception -> L10e
            r6.Dh = r1     // Catch: java.lang.Exception -> L10e
            android.view.View r1 = r6.ZD     // Catch: java.lang.Exception -> L10e
            int r2 = com.kwad.sdk.R.id.ksad_app_name     // Catch: java.lang.Exception -> L10e
            android.view.View r1 = r1.findViewById(r2)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> L10e
            r6.Di = r1     // Catch: java.lang.Exception -> L10e
            android.view.View r1 = r6.ZD     // Catch: java.lang.Exception -> L10e
            int r2 = com.kwad.sdk.R.id.ksad_app_download     // Catch: java.lang.Exception -> L10e
            android.view.View r1 = r1.findViewById(r2)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> L10e
            r6.Zz = r1     // Catch: java.lang.Exception -> L10e
            android.widget.ImageView r1 = r6.Dh     // Catch: java.lang.Exception -> L10e
            com.kwad.sdk.core.response.model.AdTemplate r2 = r6.mAdTemplate     // Catch: java.lang.Exception -> L10e
            java.lang.String r2 = com.kwad.sdk.core.response.b.e.eq(r2)     // Catch: java.lang.Exception -> L10e
            com.kwad.sdk.core.response.model.AdTemplate r3 = r6.mAdTemplate     // Catch: java.lang.Exception -> L10e
            r4 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r1 = r6.Di     // Catch: java.lang.Exception -> L10e
            com.kwad.sdk.core.response.model.AdInfo r2 = r6.mAdInfo     // Catch: java.lang.Exception -> L10e
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cl(r2)     // Catch: java.lang.Exception -> L10e
            r1.setText(r2)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r1 = r6.Zz     // Catch: java.lang.Exception -> L10e
            com.kwad.sdk.core.response.model.AdInfo r2 = r6.mAdInfo     // Catch: java.lang.Exception -> L10e
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r2)     // Catch: java.lang.Exception -> L10e
            r1.setText(r2)     // Catch: java.lang.Exception -> L10e
            r6.Zy = r0     // Catch: java.lang.Exception -> L10e
            android.widget.ImageView r0 = r6.Dh     // Catch: java.lang.Exception -> L10e
            r0.setOnClickListener(r6)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r0 = r6.Di     // Catch: java.lang.Exception -> L10e
            r0.setOnClickListener(r6)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r0 = r6.Zz     // Catch: java.lang.Exception -> L10e
            r0.setOnClickListener(r6)     // Catch: java.lang.Exception -> L10e
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c     // Catch: java.lang.Exception -> L10e
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate     // Catch: java.lang.Exception -> L10e
            r0.<init>(r1)     // Catch: java.lang.Exception -> L10e
            r6.mApkDownloadHelper = r0     // Catch: java.lang.Exception -> L10e
            com.kwad.sdk.core.download.a.a r1 = r6.ZE     // Catch: java.lang.Exception -> L10e
            r0.b(r1)     // Catch: java.lang.Exception -> L10e
            boolean r0 = r6.tR()     // Catch: java.lang.Exception -> L10e
            r1 = 0
            if (r0 == 0) goto L110
            android.widget.ImageView r0 = r6.Dh     // Catch: java.lang.Exception -> L10e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L10e
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L10e
            android.content.Context r2 = r6.mContext     // Catch: java.lang.Exception -> L10e
            r3 = 1116078080(0x42860000, float:67.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)     // Catch: java.lang.Exception -> L10e
            r0.width = r2     // Catch: java.lang.Exception -> L10e
            android.content.Context r2 = r6.mContext     // Catch: java.lang.Exception -> L10e
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)     // Catch: java.lang.Exception -> L10e
            r0.height = r2     // Catch: java.lang.Exception -> L10e
            android.widget.ImageView r2 = r6.Dh     // Catch: java.lang.Exception -> L10e
            r2.setLayoutParams(r0)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r0 = r6.Di     // Catch: java.lang.Exception -> L10e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L10e
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L10e
            android.content.Context r2 = r6.mContext     // Catch: java.lang.Exception -> L10e
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)     // Catch: java.lang.Exception -> L10e
            r0.topMargin = r2     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r2 = r6.Di     // Catch: java.lang.Exception -> L10e
            r2.setLayoutParams(r0)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r0 = r6.Zz     // Catch: java.lang.Exception -> L10e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L10e
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L10e
            android.content.Context r2 = r6.mContext     // Catch: java.lang.Exception -> L10e
            r3 = 1104150528(0x41d00000, float:26.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)     // Catch: java.lang.Exception -> L10e
            r0.topMargin = r2     // Catch: java.lang.Exception -> L10e
            android.content.Context r2 = r6.mContext     // Catch: java.lang.Exception -> L10e
            r3 = 1107296256(0x42000000, float:32.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)     // Catch: java.lang.Exception -> L10e
            r0.height = r2     // Catch: java.lang.Exception -> L10e
            android.content.Context r2 = r6.mContext     // Catch: java.lang.Exception -> L10e
            r3 = 1116733440(0x42900000, float:72.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)     // Catch: java.lang.Exception -> L10e
            r0.width = r2     // Catch: java.lang.Exception -> L10e
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Exception -> L10e
            r2.<init>()     // Catch: java.lang.Exception -> L10e
            java.lang.String r3 = "#FE3666"
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L10e
            r2.setColor(r3)     // Catch: java.lang.Exception -> L10e
            android.content.Context r3 = r6.mContext     // Catch: java.lang.Exception -> L10e
            r4 = 1090519040(0x41000000, float:8.0)
            int r3 = com.kwad.sdk.c.a.a.a(r3, r4)     // Catch: java.lang.Exception -> L10e
            float r3 = (float) r3     // Catch: java.lang.Exception -> L10e
            r2.setCornerRadius(r3)     // Catch: java.lang.Exception -> L10e
            r2.setShape(r1)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r3 = r6.Zz     // Catch: java.lang.Exception -> L10e
            r4 = 2
            r5 = 1094713344(0x41400000, float:12.0)
            r3.setTextSize(r4, r5)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r3 = r6.Zz     // Catch: java.lang.Exception -> L10e
            r3.setLayoutParams(r0)     // Catch: java.lang.Exception -> L10e
            android.widget.TextView r0 = r6.Zz     // Catch: java.lang.Exception -> L10e
            r0.setBackground(r2)     // Catch: java.lang.Exception -> L10e
            goto L110
        L10e:
            r0 = move-exception
            goto L11b
        L110:
            android.view.ViewGroup r0 = r6.Zy     // Catch: java.lang.Exception -> L10e
            r0.setOnClickListener(r6)     // Catch: java.lang.Exception -> L10e
            android.view.ViewGroup r0 = r6.Zy     // Catch: java.lang.Exception -> L10e
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L10e
            return
        L11b:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = "FeedVideoPlayerController"
            java.lang.String r1 = "onAttachedToWindow"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.aa()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            java.lang.String r0 = "FeedVideoPlayerController"
            java.lang.String r1 = "onDetachedFromWindow"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.ab()
            return
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
            r2 = this;
            super.onFinishTemporaryDetach()
            java.lang.String r0 = "FeedVideoPlayerController"
            java.lang.String r1 = "onFinishTemporaryDetach"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.aa()
            return
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
            r2 = this;
            super.onStartTemporaryDetach()
            java.lang.String r0 = "FeedVideoPlayerController"
            java.lang.String r1 = "onStartTemporaryDetach"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.ab()
            return
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            return
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            return
    }

    public final void setAutoRelease(boolean r1) {
            r0 = this;
            r0.bT = r1
            return
    }

    public final void tQ() {
            r2 = this;
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            boolean r0 = r2.bT
            if (r0 == 0) goto Le
            r2.release()
            return
        Le:
            com.kwad.sdk.core.video.videoview.c r0 = r2.aKI
            r0.pause()
            return
    }

    public final void tS() {
            r1 = this;
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.pause()
            r0 = 1
            r1.bS = r0
            return
    }

    public final void tT() {
            r1 = this;
            r1.ac()
            r0 = 0
            r1.bS = r0
            return
    }

    public final void tU() {
            r1 = this;
            r0 = 0
            r1.bS = r0
            return
    }
}
