package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends com.kwad.components.ad.splashscreen.presenter.e {
    private android.widget.ImageView Gh;
    private android.widget.ImageView Gi;
    private boolean Gj;
    private boolean Gk;
    private int Gl;
    private int Gm;
    private long Gn;
    private android.view.View Go;
    private android.view.ViewGroup Gp;
    private com.kwad.components.ad.splashscreen.presenter.playcard.SplashPlayDefaultInfoView Gq;
    java.lang.Runnable Gr;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.splashscreen.presenter.h$1, reason: invalid class name */
    final class AnonymousClass1 implements com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener {
        final /* synthetic */ com.kwad.components.ad.splashscreen.presenter.h Gs;


        AnonymousClass1(com.kwad.components.ad.splashscreen.presenter.h r1) {
                r0 = this;
                r0.Gs = r1
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final boolean onDecode(java.lang.String r1, java.io.InputStream r2, com.kwad.sdk.core.imageloader.core.decode.DecodedResult r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingCancelled(java.lang.String r1, android.view.View r2) {
                r0 = this;
                return
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingComplete(java.lang.String r11, android.view.View r12, com.kwad.sdk.core.imageloader.core.decode.DecodedResult r13) {
                r10 = this;
                com.kwad.sdk.core.config.item.d r11 = com.kwad.components.ad.splashscreen.b.a.FQ
                boolean r11 = com.kwad.sdk.core.config.e.a(r11)
                if (r11 == 0) goto L35
                long r11 = android.os.SystemClock.elapsedRealtime()
                com.kwad.components.ad.splashscreen.monitor.b.lZ()
                com.kwad.components.ad.splashscreen.presenter.h r0 = r10.Gs
                com.kwad.components.ad.splashscreen.h r1 = r0.Gf
                com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
                int r4 = com.kwad.components.ad.splashscreen.presenter.h.b(r0)
                com.kwad.components.ad.splashscreen.presenter.h r0 = r10.Gs
                int r5 = com.kwad.components.ad.splashscreen.presenter.h.c(r0)
                com.kwad.components.ad.splashscreen.presenter.h r0 = r10.Gs
                long r0 = com.kwad.components.ad.splashscreen.presenter.h.d(r0)
                long r6 = r11 - r0
                com.kwad.components.ad.splashscreen.presenter.h r0 = r10.Gs
                com.kwad.components.ad.splashscreen.h r0 = r0.Gf
                com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
                long r0 = r0.showTime
                long r8 = r11 - r0
                r3 = 2
                com.kwad.components.ad.splashscreen.monitor.b.a(r2, r3, r4, r5, r6, r8)
            L35:
                com.kwad.components.ad.splashscreen.presenter.h r11 = r10.Gs
                com.kwad.components.ad.splashscreen.presenter.h.e(r11)
                com.kwad.components.ad.splashscreen.presenter.h r11 = r10.Gs
                android.widget.ImageView r11 = com.kwad.components.ad.splashscreen.presenter.h.f(r11)
                r12 = 0
                r11.setVisibility(r12)
                java.util.concurrent.ExecutorService r11 = com.kwad.sdk.core.threads.GlobalThreadPools.Jo()
                com.kwad.components.ad.splashscreen.presenter.h$1$1 r12 = new com.kwad.components.ad.splashscreen.presenter.h$1$1
                r12.<init>(r10, r13)
                r11.submit(r12)
                return
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingFailed(java.lang.String r1, android.view.View r2, com.kwad.sdk.core.imageloader.core.assist.FailReason r3) {
                r0 = this;
                com.kwad.components.ad.splashscreen.presenter.h r1 = r0.Gs
                com.kwad.components.ad.splashscreen.presenter.h.a(r1)
                return
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingStarted(java.lang.String r1, android.view.View r2) {
                r0 = this;
                return
        }
    }






    public h() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.Gj = r0
            r1.Gk = r0
            r0 = 1
            r1.Gm = r0
            com.kwad.components.ad.splashscreen.presenter.h$5 r0 = new com.kwad.components.ad.splashscreen.presenter.h$5
            r0.<init>(r1)
            r1.Gr = r0
            return
    }

    private void a(android.widget.ImageView r3) {
            r2 = this;
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            int r1 = com.kwad.sdk.R.id.splash_play_card_view
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = 0
            r0.setClipChildren(r1)
            com.kwad.components.ad.splashscreen.presenter.h$4 r0 = new com.kwad.components.ad.splashscreen.presenter.h$4
            r0.<init>(r2, r3)
            r3.post(r0)
            return
    }

    private void a(android.widget.ImageView r3, com.kwad.sdk.core.response.model.AdInfo r4) {
            r2 = this;
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            int r1 = com.kwad.sdk.R.id.splash_play_card_view
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = 0
            r0.setClipChildren(r1)
            com.kwad.sdk.core.response.model.AdInfo$CutRuleInfo r0 = com.kwad.sdk.core.response.b.a.ct(r4)
            com.kwad.components.ad.splashscreen.presenter.h$3 r1 = new com.kwad.components.ad.splashscreen.presenter.h$3
            r1.<init>(r2, r3, r4, r0)
            r3.post(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.h r0) {
            r0.ml()
            return
    }

    static /* synthetic */ int b(com.kwad.components.ad.splashscreen.presenter.h r0) {
            int r0 = r0.Gl
            return r0
    }

    static /* synthetic */ int c(com.kwad.components.ad.splashscreen.presenter.h r0) {
            int r0 = r0.Gm
            return r0
    }

    static /* synthetic */ long d(com.kwad.components.ad.splashscreen.presenter.h r2) {
            long r0 = r2.Gn
            return r0
    }

    static /* synthetic */ void e(com.kwad.components.ad.splashscreen.presenter.h r0) {
            r0.mm()
            return
    }

    static /* synthetic */ android.widget.ImageView f(com.kwad.components.ad.splashscreen.presenter.h r0) {
            android.widget.ImageView r0 = r0.Gi
            return r0
    }

    static /* synthetic */ android.content.Context g(com.kwad.components.ad.splashscreen.presenter.h r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ android.view.View h(com.kwad.components.ad.splashscreen.presenter.h r0) {
            android.view.View r0 = r0.Go
            return r0
    }

    static /* synthetic */ android.content.Context i(com.kwad.components.ad.splashscreen.presenter.h r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ android.view.ViewGroup j(com.kwad.components.ad.splashscreen.presenter.h r0) {
            android.view.ViewGroup r0 = r0.Gp
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.presenter.playcard.SplashPlayDefaultInfoView k(com.kwad.components.ad.splashscreen.presenter.h r0) {
            com.kwad.components.ad.splashscreen.presenter.playcard.SplashPlayDefaultInfoView r0 = r0.Gq
            return r0
    }

    private void l(java.lang.String r3, int r4) {
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L1e
            android.widget.ImageView r4 = r2.Gh
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r4.setScaleType(r1)
            android.widget.ImageView r4 = r2.Gh
            r4.setVisibility(r0)
            android.widget.ImageView r4 = r2.Gh
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.components.ad.splashscreen.presenter.h$1 r1 = new com.kwad.components.ad.splashscreen.presenter.h$1
            r1.<init>(r2)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r4, r3, r0, r1)
            return
        L1e:
            android.widget.ImageView r4 = r2.Gi
            r4.setVisibility(r0)
            com.kwad.sdk.core.config.item.d r4 = com.kwad.components.ad.splashscreen.b.a.FP
            boolean r4 = com.kwad.sdk.core.config.e.a(r4)
            if (r4 == 0) goto L33
            android.widget.ImageView r4 = r2.Gi
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            r2.a(r4, r0)
            goto L38
        L33:
            android.widget.ImageView r4 = r2.Gi
            r2.a(r4)
        L38:
            android.widget.ImageView r4 = r2.Gi
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.components.ad.splashscreen.presenter.h$2 r1 = new com.kwad.components.ad.splashscreen.presenter.h$2
            r1.<init>(r2)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r4, r3, r0, r1)
            return
    }

    private void mk() {
            r3 = this;
            com.kwad.sdk.core.config.item.d r0 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            if (r0 == 0) goto L27
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.Gn = r0
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1 = 2
            int r2 = r3.Gl
            com.kwad.components.ad.splashscreen.monitor.b.e(r0, r1, r2)
            java.lang.Runnable r0 = r3.Gr
            com.kwad.sdk.core.config.item.k r1 = com.kwad.components.ad.splashscreen.b.a.FR
            int r1 = com.kwad.sdk.core.config.e.a(r1)
            long r1 = (long) r1
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
        L27:
            return
    }

    private void ml() {
            r11 = this;
            boolean r0 = r11.Gj
            if (r0 == 0) goto L5
            return
        L5:
            com.kwad.sdk.core.config.item.d r0 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            if (r0 == 0) goto L28
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.components.ad.splashscreen.h r2 = r11.Gf
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            int r5 = r11.Gl
            int r6 = r11.Gm
            long r7 = r11.Gn
            long r7 = r0 - r7
            long r9 = r3.showTime
            long r9 = r0 - r9
            r4 = 2
            com.kwad.components.ad.splashscreen.monitor.b.b(r3, r4, r5, r6, r7, r9)
        L28:
            r0 = 1
            r11.Gj = r0
            android.view.View r0 = r11.Go
            com.kwad.components.ad.splashscreen.presenter.h$6 r1 = new com.kwad.components.ad.splashscreen.presenter.h$6
            r1.<init>(r11)
            r0.post(r1)
            android.widget.ImageView r0 = r11.Gh
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r11.Gi
            r0.setVisibility(r1)
            return
    }

    private void mm() {
            r1 = this;
            boolean r0 = r1.Gk
            if (r0 == 0) goto L5
            goto L15
        L5:
            r0 = 1
            r1.Gk = r0
            com.kwad.sdk.core.config.item.d r0 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            if (r0 == 0) goto L15
            java.lang.Runnable r0 = r1.Gr
            com.kwad.sdk.utils.bw.c(r0)
        L15:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r9 = this;
            super.at()
            int r0 = com.kwad.sdk.R.id.ksad_splash_root_container
            android.view.View r0 = r9.findViewById(r0)
            r9.Go = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_background
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.Gi = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_foreground
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.Gh = r0
            com.kwad.components.ad.splashscreen.h r0 = r9.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r9.mAdInfo = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_default_image_view_container
            android.view.View r0 = r9.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r9.Gp = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_default_image_view
            android.view.View r0 = r9.findViewById(r0)
            com.kwad.components.ad.splashscreen.presenter.playcard.SplashPlayDefaultInfoView r0 = (com.kwad.components.ad.splashscreen.presenter.playcard.SplashPlayDefaultInfoView) r0
            r9.Gq = r0
            com.kwad.components.ad.splashscreen.h r0 = r9.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.splashscreen.h.ac(r0)
            r1 = 2
            if (r0 == 0) goto L4a
            r0 = 2
            goto L4b
        L4a:
            r0 = 1
        L4b:
            r9.Gl = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r0 = r0.materialUrl
            android.widget.ImageView r2 = r9.Gi
            r3 = 0
            r2.setVisibility(r3)
            com.kwad.sdk.core.response.model.AdInfo r2 = r9.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r2 = com.kwad.sdk.core.response.b.a.aU(r2)
            int r2 = r2.source
            r9.mk()
            android.content.Context r3 = r9.getContext()
            if (r3 == 0) goto L98
            com.kwad.components.ad.splashscreen.SplashPreloadManager.lD()
            com.kwad.sdk.core.response.model.AdInfo r3 = r9.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r3 = r3.adPreloadInfo
            java.lang.String r3 = r3.preloadId
            java.io.File r3 = com.kwad.components.ad.splashscreen.SplashPreloadManager.aa(r3)
            if (r3 == 0) goto L95
            boolean r4 = r3.exists()
            if (r4 == 0) goto L95
            long r4 = r3.length()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L95
            r9.Gm = r1
            android.net.Uri r0 = android.net.Uri.fromFile(r3)
            java.lang.String r0 = r0.toString()
        L95:
            r9.l(r0, r2)
        L98:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            r0.mm()
            return
    }
}
