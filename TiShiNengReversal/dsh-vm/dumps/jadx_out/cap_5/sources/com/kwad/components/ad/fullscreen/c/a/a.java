package com.kwad.components.ad.fullscreen.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b implements com.kwad.sdk.utils.ca.a {
    private com.kwad.sdk.utils.ca bQ;
    private com.kwad.components.core.video.m jE;
    private android.widget.TextView jV;
    private android.view.View jW;
    private boolean jX;
    private long jY;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;


    public a() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.fullscreen.c.a.a$1 r0 = new com.kwad.components.ad.fullscreen.c.a.a$1
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    private void G(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.jV
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.setText(r2)
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.fullscreen.c.a.a r0, long r1) {
            r0.jY = r1
            return r1
    }

    private void a(long r1, long r3) {
            r0 = this;
            long r1 = r1 - r3
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            if (r1 > 0) goto Lc
            r1 = 1
        Lc:
            r0.G(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.fullscreen.c.a.a r0, long r1, long r3) {
            r0.a(r1, r3)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.fullscreen.c.a.a r0) {
            boolean r0 = r0.jX
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.fullscreen.c.a.a r0, boolean r1) {
            r1 = 1
            r0.jX = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.utils.ca b(com.kwad.components.ad.fullscreen.c.a.a r0) {
            com.kwad.sdk.utils.ca r0 = r0.bQ
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g c(com.kwad.components.ad.fullscreen.c.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ long d(com.kwad.components.ad.fullscreen.c.a.a r2) {
            long r0 = r2.jY
            return r0
    }

    private void dm() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r2.mAdInfo = r0
            android.widget.TextView r1 = r2.jV
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            android.widget.TextView r0 = r2.jV
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.a(r1)
            return
    }

    static /* synthetic */ android.widget.TextView e(com.kwad.components.ad.fullscreen.c.a.a r0) {
            android.widget.TextView r0 = r0.jV
            return r0
    }

    static /* synthetic */ android.view.View f(com.kwad.components.ad.fullscreen.c.a.a r0) {
            android.view.View r0 = r0.jW
            return r0
    }

    static /* synthetic */ android.content.Context g(com.kwad.components.ad.fullscreen.c.a.a r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // com.kwad.sdk.utils.ca.a
    public final void a(android.os.Message r8) {
            r7 = this;
            int r8 = r8.what
            r0 = 1
            if (r8 != r0) goto L51
            com.kwad.components.ad.reward.g r8 = r7.tm
            boolean r8 = r8.gV()
            r1 = 500(0x1f4, double:2.47E-321)
            if (r8 != 0) goto L4c
            com.kwad.components.ad.reward.g r8 = r7.tm
            boolean r8 = r8.gU()
            if (r8 == 0) goto L18
            goto L4c
        L18:
            long r3 = r7.jY
            long r3 = r3 + r1
            r7.jY = r3
            r5 = 30000(0x7530, double:1.4822E-319)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L43
            android.widget.TextView r8 = r7.jV
            r0 = 8
            r8.setVisibility(r0)
            android.view.View r8 = r7.jW
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            android.content.Context r0 = r7.getContext()
            r1 = 0
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            r8.leftMargin = r0
            android.view.View r0 = r7.jW
            r0.setLayoutParams(r8)
            return
        L43:
            r7.a(r5, r3)
            com.kwad.sdk.utils.ca r8 = r7.bQ
            r8.sendEmptyMessageDelayed(r0, r1)
            return
        L4c:
            com.kwad.sdk.utils.ca r8 = r7.bQ
            r8.sendEmptyMessageDelayed(r0, r1)
        L51:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.sdk.utils.ca r0 = new com.kwad.sdk.utils.ca
            r0.<init>(r1)
            r1.bQ = r0
            r1.dm()
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L1c
            r0 = 30
            r1.G(r0)
        L1c:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_count_down
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.jV = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_sound_switch
            android.view.View r0 = r1.findViewById(r0)
            r1.jW = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            r0 = 0
            r2.jX = r0
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }
}
