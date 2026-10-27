package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.core.video.a implements com.kwad.sdk.utils.ca.a {
    private boolean HY;
    private boolean aaI;
    private boolean aaJ;
    private android.view.View bP;
    private final com.kwad.sdk.utils.ca bQ;
    private final java.util.concurrent.atomic.AtomicBoolean bR;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a extends com.kwad.components.core.video.a.c {
        void onVideoPlayError(int r1, int r2);
    }

    public f(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.NonNull com.kwad.sdk.core.video.videoview.c r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.utils.ca r1 = new com.kwad.sdk.utils.ca
            r1.<init>(r0)
            r0.bQ = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 1
            r1.<init>(r2)
            r0.bR = r1
            r1 = 0
            r0.HY = r1
            r0.aaI = r1
            r0.aaJ = r1
            r0.bP = r0
            return
    }

    private void aa() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.bR
            r1 = 0
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "InterstitialVideoPlayerController"
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
            if (r0 != 0) goto L19
            java.lang.String r0 = "InterstitialVideoPlayerController"
            java.lang.String r1 = "onViewDetached"
            com.kwad.sdk.core.d.c.i(r0, r1)
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.release()
        L19:
            return
    }

    private void tV() {
            r1 = this;
            r0 = 0
            r1.HY = r0
            return
    }

    @Override // com.kwad.sdk.utils.ca.a
    public final void a(android.os.Message r5) {
            r4 = this;
            boolean r0 = r4.HY
            if (r0 == 0) goto L5
            goto L2c
        L5:
            int r5 = r5.what
            r0 = 1
            if (r5 != r0) goto L2c
            boolean r5 = r4.aaJ
            r1 = 500(0x1f4, double:2.47E-321)
            if (r5 == 0) goto L16
            com.kwad.sdk.utils.ca r5 = r4.bQ
            r5.sendEmptyMessageDelayed(r0, r1)
            return
        L16:
            android.view.View r5 = r4.bP
            r3 = 70
            boolean r5 = com.kwad.sdk.utils.bz.o(r5, r3)
            if (r5 == 0) goto L24
            r4.ac()
            goto L27
        L24:
            r4.tw()
        L27:
            com.kwad.sdk.utils.ca r5 = r4.bQ
            r5.sendEmptyMessageDelayed(r0, r1)
        L2c:
            return
    }

    @Override // com.kwad.components.core.video.a
    public final void ac() {
            r0 = this;
            super.ac()
            return
    }

    @Override // com.kwad.components.core.video.a
    protected final void fA() {
            r1 = this;
            boolean r0 = r1.aaI
            if (r0 == 0) goto L7
            super.fA()
        L7:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = "InterstitialVideoPlayerController"
            java.lang.String r1 = "onAttachedToWindow"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.tV()
            r2.aa()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            java.lang.String r0 = "InterstitialVideoPlayerController"
            java.lang.String r1 = "onDetachedFromWindow"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.ab()
            return
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
            r2 = this;
            super.onFinishTemporaryDetach()
            java.lang.String r0 = "InterstitialVideoPlayerController"
            java.lang.String r1 = "onFinishTemporaryDetach"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r2.aa()
            return
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
            r2 = this;
            super.onStartTemporaryDetach()
            java.lang.String r0 = "InterstitialVideoPlayerController"
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

    @Override // com.kwad.components.core.video.a
    public final void release() {
            r1 = this;
            super.release()
            r0 = 1
            r1.HY = r0
            return
    }

    public final void setShowLandingPage(boolean r1) {
            r0 = this;
            r0.aaJ = r1
            return
    }

    @Override // com.kwad.components.core.video.a
    protected final void tq() {
            r2 = this;
            super.tq()
            android.widget.ImageView r0 = r2.pz
            if (r0 == 0) goto Lc
            int r1 = com.kwad.sdk.R.drawable.ksad_interstitial_video_play
            r0.setImageResource(r1)
        Lc:
            android.widget.TextView r0 = r2.pA
            if (r0 == 0) goto L15
            r1 = 8
            r0.setVisibility(r1)
        L15:
            return
    }

    @Override // com.kwad.components.core.video.a
    public final void tw() {
            r0 = this;
            super.tw()
            return
    }
}
