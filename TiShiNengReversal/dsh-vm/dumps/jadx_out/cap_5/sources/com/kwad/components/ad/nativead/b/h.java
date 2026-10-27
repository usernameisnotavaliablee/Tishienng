package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends com.kwad.components.ad.nativead.a.a implements android.view.View.OnClickListener, android.view.View.OnTouchListener {
    private android.view.MotionEvent pJ;
    private android.view.ViewGroup pO;
    private android.widget.TextView pP;




    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b.h r0) {
            r0.fA()
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.nativead.b.h r0) {
            r0.fB()
            return
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b c(com.kwad.components.ad.nativead.b.h r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b d(com.kwad.components.ad.nativead.b.h r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b e(com.kwad.components.ad.nativead.b.h r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b f(com.kwad.components.ad.nativead.b.h r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    private void fA() {
            r2 = this;
            android.widget.TextView r0 = r2.pP     // Catch: java.lang.Throwable -> L27
            com.kwad.components.ad.nativead.a.b r1 = r2.pq     // Catch: java.lang.Throwable -> L27
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate     // Catch: java.lang.Throwable -> L27
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aE(r1)     // Catch: java.lang.Throwable -> L27
            r0.setText(r1)     // Catch: java.lang.Throwable -> L27
            android.view.ViewGroup r0 = r2.pO     // Catch: java.lang.Throwable -> L27
            r0.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L27
            android.view.ViewGroup r0 = r2.pO     // Catch: java.lang.Throwable -> L27
            r0.setOnTouchListener(r2)     // Catch: java.lang.Throwable -> L27
            android.view.ViewGroup r0 = r2.pO     // Catch: java.lang.Throwable -> L27
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L27
            android.widget.TextView r0 = r2.pP     // Catch: java.lang.Throwable -> L27
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    private void fB() {
            r2 = this;
            android.view.ViewGroup r0 = r2.pO     // Catch: java.lang.Throwable -> Ld
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r0 = r2.pP     // Catch: java.lang.Throwable -> Ld
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
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
            com.kwad.components.ad.nativead.b.h$3 r1 = new com.kwad.components.ad.nativead.b.h$3
            r1.<init>(r3)
            com.kwad.components.core.e.d.a$a r0 = r0.a(r1)
            com.kwad.components.core.e.d.a.a(r0)
            return
    }

    private void fF() {
            r2 = this;
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            com.kwad.components.ad.nativead.a.b r1 = r2.pq
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r1)
            r1 = 2
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r1)
            com.kwad.components.ad.nativead.b.h$2 r1 = new com.kwad.components.ad.nativead.b.h$2
            r1.<init>(r2)
            com.kwad.components.core.e.d.a$a r0 = r0.a(r1)
            com.kwad.components.core.e.d.a.a(r0)
            return
    }

    private void n(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.pO
            if (r2 != r0) goto La
            r1.fC()
            r1.notifyAdClick()
        La:
            return
    }

    private void notifyAdClick() {
            r2 = this;
            android.view.ViewGroup r0 = r2.pO
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
            com.kwad.components.ad.nativead.b.h$1 r0 = new com.kwad.components.ad.nativead.b.h$1
            r0.<init>(r2)
            r2.mVideoPlayStateListener = r0
            com.kwad.components.ad.nativead.a.b r1 = r2.pq
            com.kwad.components.ad.nativead.c.a r1 = r1.pr
            r1.a2(r0)
            android.view.ViewGroup r0 = r2.pO
            if (r0 == 0) goto L1a
            r1 = 8
            r0.setVisibility(r1)
        L1a:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            com.kwad.components.ad.nativead.a.b r1 = r0.pq
            boolean r1 = r1.px
            if (r1 != 0) goto L7
            return
        L7:
            r0.fF()
            r0.notifyAdClick()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_complete_h5_container
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.pO = r0
            int r0 = com.kwad.sdk.R.id.ksad_h5_open
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.pP = r0
            android.view.ViewGroup r0 = r2.pO
            java.lang.String r1 = "NativePlayEndH5Presenter: R.id.ksad_video_complete_h5_container is null"
            com.kwad.components.ad.nativead.a.a.a(r0, r1)
            android.widget.TextView r0 = r2.pP
            java.lang.String r1 = "NativePlayEndH5Presenter: R.id.ksad_h5_open is null"
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
            if (r0 == 0) goto L34
            com.kwad.components.ad.nativead.a.b r0 = r4.pq
            boolean r1 = r0.pw
            if (r1 == 0) goto L33
            android.view.MotionEvent r1 = r4.pJ
            if (r1 == 0) goto L33
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r6 = com.kwad.sdk.utils.b.a(r1, r6, r0)
            if (r6 == 0) goto L33
            r4.n(r5)
        L33:
            r1 = 1
        L34:
            r5 = 0
            r4.pJ = r5
            return r1
    }
}
