package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.ad.nativead.a.a implements android.view.View.OnClickListener, android.view.View.OnTouchListener {
    private android.widget.TextView ee;
    private android.widget.ImageView gw;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private android.view.ViewGroup pH;
    private android.widget.TextView pI;
    private android.view.MotionEvent pJ;
    private com.kwad.sdk.api.KsAppDownloadListener pK;





    public f() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.nativead.b.f$2 r0 = new com.kwad.components.ad.nativead.b.f$2
            r0.<init>(r1)
            r1.pK = r0
            return
    }

    private void T(int r3) {
            r2 = this;
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r1)
            com.kwad.components.core.e.d.a$a r3 = r0.aB(r3)
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r3 = r3.b(r0)
            com.kwad.components.ad.nativead.a.b r0 = r2.pq
            if (r0 == 0) goto L26
            com.kwad.components.ad.nativead.c.a r0 = r0.pr
            if (r0 == 0) goto L26
            long r0 = r0.getPlayDuration()
            goto L28
        L26:
            r0 = 0
        L28:
            com.kwad.components.core.e.d.a$a r3 = r3.A(r0)
            com.kwad.components.ad.nativead.b.f$3 r0 = new com.kwad.components.ad.nativead.b.f$3
            r0.<init>(r2)
            com.kwad.components.core.e.d.a$a r3 = r3.a(r0)
            com.kwad.components.core.e.d.a.a(r3)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b.f r0) {
            r0.fA()
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.nativead.b.f r0) {
            r0.fB()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo c(com.kwad.components.ad.nativead.b.f r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ android.widget.TextView d(com.kwad.components.ad.nativead.b.f r0) {
            android.widget.TextView r0 = r0.pI
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate e(com.kwad.components.ad.nativead.b.f r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b f(com.kwad.components.ad.nativead.b.f r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    private void fA() {
            r4 = this;
            android.widget.ImageView r0 = r4.gw
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.co(r1)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            r3 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r0, r1, r2, r3)
            android.widget.TextView r0 = r4.ee
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.av(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r4.pI
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aE(r1)
            r0.setText(r1)
            com.kwad.components.core.e.d.c r0 = r4.mApkDownloadHelper
            if (r0 == 0) goto L2e
            com.kwad.sdk.api.KsAppDownloadListener r1 = r4.pK
            r0.b(r1)
        L2e:
            android.view.ViewGroup r0 = r4.pH
            r0.setOnClickListener(r4)
            android.view.ViewGroup r0 = r4.pH
            r0.setOnTouchListener(r4)
            android.view.ViewGroup r0 = r4.pH
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.ee
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.pI
            r0.setVisibility(r1)
            return
    }

    private void fB() {
            r2 = this;
            android.widget.TextView r0 = r2.ee     // Catch: java.lang.Throwable -> L12
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L12
            android.widget.TextView r0 = r2.pI     // Catch: java.lang.Throwable -> L12
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L12
            android.view.ViewGroup r0 = r2.pH     // Catch: java.lang.Throwable -> L12
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    private void fC() {
            r3 = this;
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            com.kwad.components.ad.nativead.a.b r1 = r3.pq
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r1)
            com.kwad.components.ad.nativead.a.b r1 = r3.pq
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r0 = r0.b(r1)
            com.kwad.components.ad.nativead.a.b r1 = r3.pq
            com.kwad.components.ad.nativead.c.a r1 = r1.pr
            long r1 = r1.getPlayDuration()
            com.kwad.components.core.e.d.a$a r0 = r0.A(r1)
            com.kwad.components.ad.nativead.b.f$4 r1 = new com.kwad.components.ad.nativead.b.f$4
            r1.<init>(r3)
            com.kwad.components.core.e.d.a$a r0 = r0.a(r1)
            com.kwad.components.core.e.d.a.a(r0)
            return
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b g(com.kwad.components.ad.nativead.b.f r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b h(com.kwad.components.ad.nativead.b.f r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    private void n(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.pH
            if (r2 != r0) goto La
            r1.fC()
            r1.notifyAdClick()
        La:
            return
    }

    private void notifyAdClick() {
            r2 = this;
            android.view.ViewGroup r0 = r2.pH
            if (r0 == 0) goto Lb
            com.kwad.components.ad.nativead.a.b r1 = r2.pq
            com.kwad.components.ad.nativead.d$a r1 = r1.oW
            r1.m(r0)
        Lb:
            return
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.nativead.a.b r0 = r2.pq
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r2.mAdInfo = r0
            com.kwad.components.ad.nativead.a.b r0 = r2.pq
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r2.mApkDownloadHelper = r0
            com.kwad.components.ad.nativead.b.f$1 r0 = new com.kwad.components.ad.nativead.b.f$1
            r0.<init>(r2)
            r2.mVideoPlayStateListener = r0
            com.kwad.components.ad.nativead.a.b r1 = r2.pq
            com.kwad.components.ad.nativead.c.a r1 = r1.pr
            r1.a2(r0)
            android.view.ViewGroup r0 = r2.pH
            if (r0 == 0) goto L2c
            r1 = 8
            r0.setVisibility(r1)
        L2c:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            com.kwad.components.ad.nativead.a.b r0 = r1.pq
            boolean r0 = r0.px
            if (r0 != 0) goto L7
            goto L1e
        L7:
            android.view.ViewGroup r0 = r1.pH
            if (r2 != r0) goto L13
            r2 = 2
            r1.T(r2)
            r1.notifyAdClick()
            return
        L13:
            android.widget.TextView r0 = r1.pI
            if (r2 != r0) goto L1e
            r2 = 1
            r1.T(r2)
            r1.notifyAdClick()
        L1e:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_complete_app_container
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.pH = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_icon
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.gw = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_name
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ee = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_download
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.pI = r0
            android.view.ViewGroup r0 = r2.pH
            java.lang.String r1 = "NativePlayEndAppPresenter: R.id.ksad_video_complete_app_container is null"
            com.kwad.components.ad.nativead.a.a.a(r0, r1)
            android.widget.ImageView r0 = r2.gw
            java.lang.String r1 = "NativePlayEndAppPresenter: R.id.ksad_app_icon is null"
            com.kwad.components.ad.nativead.a.a.a(r0, r1)
            android.widget.TextView r0 = r2.ee
            java.lang.String r1 = "NativePlayEndAppPresenter: R.id.ksad_app_name is null"
            com.kwad.components.ad.nativead.a.a.a(r0, r1)
            android.widget.TextView r0 = r2.pI
            java.lang.String r1 = "NativePlayEndAppPresenter: R.id.ksad_app_download is null"
            com.kwad.components.ad.nativead.a.a.a(r0, r1)
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            int r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto Le
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r6)
            r4.pJ = r5
            return r1
        Le:
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 != r3) goto L15
            goto L16
        L15:
            return r1
        L16:
            android.view.MotionEvent r0 = r4.pJ
            boolean r0 = com.kwad.sdk.utils.b.a(r0, r6)
            if (r0 == 0) goto L32
            com.kwad.components.ad.nativead.a.b r0 = r4.pq
            boolean r0 = r0.pw
            if (r0 == 0) goto L31
            android.view.MotionEvent r0 = r4.pJ
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            boolean r6 = com.kwad.sdk.utils.b.a(r0, r6, r1)
            if (r6 == 0) goto L31
            r4.n(r5)
        L31:
            r1 = 1
        L32:
            r5 = 0
            r4.pJ = r5
            return r1
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto Lc
            com.kwad.sdk.api.KsAppDownloadListener r1 = r2.pK
            r0.c(r1)
        Lc:
            return
    }
}
