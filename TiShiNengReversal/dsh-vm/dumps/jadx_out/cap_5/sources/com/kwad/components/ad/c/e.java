package com.kwad.components.ad.c;

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
            java.lang.String r0 = "BannerVideoPlayerController"
            java.lang.String r1 = "onViewAttached"
            com.kwad.sdk.core.d.c.i(r0, r1)
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 1
            r0.sendEmptyMessage(r1)
        L16:
            return
    }

    private void ab() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.bR
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "BannerVideoPlayerController"
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
            boolean r0 = com.kwad.sdk.core.response.b.a.bY(r0)
            if (r0 == 0) goto L56
            android.content.Context r0 = r4.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            return r0
        L56:
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.bZ(r0)
            if (r0 == 0) goto L65
            android.content.Context r0 = r4.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isWifiConnected(r0)
            return r0
        L65:
            return r2
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

    @Override // com.kwad.components.core.video.a
    public final void ac() {
            r3 = this;
            com.kwad.sdk.core.video.videoview.c r0 = r3.aKI
            boolean r0 = r0.isIdle()
            if (r0 == 0) goto L64
            com.kwad.components.core.video.a.a r0 = r3.ZC
            if (r0 == 0) goto Lf
            r0.onStart()
        Lf:
            android.content.Context r0 = r3.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            if (r0 != 0) goto L1b
            r3.tr()
            return
        L1b:
            r3.ts()
            boolean r0 = r3.Zn
            if (r0 == 0) goto L2b
            r3.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r3.aKI
            r0.start()
            return
        L2b:
            boolean r0 = r3.ad()
            if (r0 == 0) goto L3a
            r3.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r3.aKI
            r0.start()
            return
        L3a:
            boolean r0 = r3.Zl
            if (r0 == 0) goto L47
            r3.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r3.aKI
            r0.start()
            return
        L47:
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = 60
            r0.<init>(r1, r1)
            r1 = 13
            r2 = -1
            r0.addRule(r1, r2)
            android.widget.TextView r1 = r3.pA
            r2 = 8
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r3.pz
            r1.setLayoutParams(r0)
            r3.tt()
            return
        L64:
            com.kwad.sdk.core.video.videoview.c r0 = r3.aKI
            boolean r0 = r0.isPaused()
            if (r0 != 0) goto L76
            com.kwad.sdk.core.video.videoview.c r0 = r3.aKI
            boolean r0 = r0.Ke()
            if (r0 == 0) goto L75
            goto L76
        L75:
            return
        L76:
            r3.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r3.aKI
            r0.restart()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = "BannerVideoPlayerController"
            java.lang.String r1 = "onAttachedToWindow"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.aa()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            java.lang.String r0 = "BannerVideoPlayerController"
            java.lang.String r1 = "onDetachedFromWindow"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.ab()
            return
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
            r2 = this;
            super.onFinishTemporaryDetach()
            java.lang.String r0 = "BannerVideoPlayerController"
            java.lang.String r1 = "onFinishTemporaryDetach"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.aa()
            return
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
            r2 = this;
            super.onStartTemporaryDetach()
            java.lang.String r0 = "BannerVideoPlayerController"
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
}
