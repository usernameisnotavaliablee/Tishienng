package com.kwad.components.ad.draw.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.sdk.widget.KSFrameLayout {
    private boolean dA;
    private com.kwad.sdk.api.KsDrawAd.AdInteractionListener dh;
    private boolean dl;
    private com.kwad.sdk.core.j.b dn;
    private long fG;
    private com.kwad.components.core.webview.tachikoma.i fU;
    private com.kwad.sdk.widget.KSFrameLayout fV;
    private com.kwad.components.ad.draw.c.a fW;
    private boolean fX;
    private int fY;
    private boolean fZ;
    private com.kwad.components.core.widget.a.b fg;
    private boolean fj;
    private final com.kwad.sdk.core.j.c fo;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public class a extends com.kwad.sdk.core.response.a.a {
        final /* synthetic */ com.kwad.components.ad.draw.view.c ga;
        public boolean gb;
        public int status;

        public a(com.kwad.components.ad.draw.view.c r1) {
                r0 = this;
                r0.ga = r1
                r0.<init>()
                return
        }
    }

    public c(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            com.kwad.components.ad.draw.view.c$2 r0 = new com.kwad.components.ad.draw.view.c$2
            r0.<init>(r1)
            r1.fo = r0
            r1.B(r2)
            return
    }

    private void B(android.content.Context r3) {
            r2 = this;
            r2.mContext = r3
            int r0 = com.kwad.sdk.R.layout.ksad_draw_tk_layout
            com.kwad.sdk.o.m.inflate(r3, r0, r2)
            int r0 = com.kwad.sdk.R.id.ksad_draw_tk_container
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r2.fV = r0
            com.kwad.sdk.core.config.item.k r0 = com.kwad.sdk.core.config.c.aBa
            int r0 = com.kwad.sdk.core.config.e.a(r0)
            com.kwad.components.core.webview.tachikoma.i r1 = new com.kwad.components.core.webview.tachikoma.i
            r1.<init>(r3, r0, r0)
            r2.fU = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.app.Activity r3 = com.kwad.sdk.o.m.ej(r3)
            r0.<init>(r3)
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.components.ad.draw.view.c$1 r3 = new com.kwad.components.ad.draw.view.c$1
            r3.<init>(r2, r0)
            com.kwad.sdk.core.c.b.a(r3)
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.i a(com.kwad.components.ad.draw.view.c r0) {
            com.kwad.components.core.webview.tachikoma.i r0 = r0.fU
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.draw.view.c r0, boolean r1) {
            r0.fZ = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate b(com.kwad.components.ad.draw.view.c r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.draw.view.c r0, boolean r1) {
            r1 = 1
            r0.dA = r1
            return r1
    }

    private void bL() {
            r4 = this;
            com.kwad.components.core.widget.a.b r0 = r4.fg
            com.kwad.sdk.core.j.b r1 = r4.dn
            r0.a(r1)
            com.kwad.components.core.widget.a.b r0 = r4.fg
            com.kwad.sdk.core.j.c r1 = r4.fo
            r0.a(r1)
            com.kwad.components.core.widget.a.b r0 = r4.fg
            r0.wi()
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            if (r0 == 0) goto L34
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.fG = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.components.ad.draw.a.b.g(r0)
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            android.content.Context r1 = r4.mContext
            android.app.Activity r1 = com.kwad.sdk.o.m.ej(r1)
            com.kwad.sdk.core.response.model.AdResultData r2 = r4.mAdResultData
            com.kwad.components.ad.draw.view.c$3 r3 = new com.kwad.components.ad.draw.view.c$3
            r3.<init>(r4)
            r0.a(r1, r2, r3)
        L34:
            return
    }

    private void bM() {
            r4 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            if (r0 == 0) goto Lf
            com.kwad.components.ad.draw.view.c$4 r1 = new com.kwad.components.ad.draw.view.c$4
            r1.<init>(r4)
            java.lang.String r2 = "setVideoPlayStatusCallback"
            r3 = 0
            r0.a(r2, r3, r1)
        Lf:
            return
    }

    private void bN() {
            r4 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            if (r0 == 0) goto L1f
            com.kwad.components.core.webview.tachikoma.c.n r0 = new com.kwad.components.core.webview.tachikoma.c.n
            r0.<init>()
            boolean r1 = r4.bO()
            r0.ahg = r1
            com.kwad.components.core.webview.tachikoma.i r1 = r4.fU
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.String r3 = "setVideoMuteStateListener"
            r1.a(r3, r0, r2)
        L1f:
            return
    }

    private boolean bO() {
            r1 = this;
            boolean r0 = r1.fX
            if (r0 == 0) goto L7
            boolean r0 = r1.fj
            return r0
        L7:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.cb(r0)
            return r0
    }

    static /* synthetic */ com.kwad.sdk.api.KsDrawAd.AdInteractionListener c(com.kwad.components.ad.draw.view.c r0) {
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r0 = r0.dh
            return r0
    }

    static /* synthetic */ boolean d(com.kwad.components.ad.draw.view.c r0) {
            boolean r0 = r0.fZ
            return r0
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout e(com.kwad.components.ad.draw.view.c r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.fV
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.c.a f(com.kwad.components.ad.draw.view.c r0) {
            com.kwad.components.ad.draw.c$a r0 = r0.fW
            return r0
    }

    static /* synthetic */ boolean g(com.kwad.components.ad.draw.view.c r0) {
            boolean r0 = r0.dA
            return r0
    }

    static /* synthetic */ void h(com.kwad.components.ad.draw.view.c r0) {
            r0.bM()
            return
    }

    static /* synthetic */ void i(com.kwad.components.ad.draw.view.c r0) {
            r0.bN()
            return
    }

    static /* synthetic */ int j(com.kwad.components.ad.draw.view.c r0) {
            int r0 = r0.fY
            return r0
    }

    static /* synthetic */ long k(com.kwad.components.ad.draw.view.c r2) {
            long r0 = r2.fG
            return r0
    }

    public final void A(int r4) {
            r3 = this;
            r3.fY = r4
            com.kwad.components.core.webview.tachikoma.i r4 = r3.fU
            if (r4 != 0) goto L7
            return
        L7:
            com.kwad.components.ad.draw.view.c$a r4 = new com.kwad.components.ad.draw.view.c$a
            r4.<init>(r3)
            int r0 = r3.fY
            r4.status = r0
            boolean r0 = r3.dl
            r4.gb = r0
            com.kwad.components.core.webview.tachikoma.i r0 = r3.fU
            org.json.JSONObject r4 = r4.toJson()
            java.lang.String r4 = r4.toString()
            r1 = 0
            java.lang.String r2 = "setVideoPlayerStatus"
            r0.a(r2, r4, r1)
            return
    }

    public final void bK() {
            r1 = this;
            r0 = 1
            r1.dl = r0
            r0 = 0
            r1.A(r0)
            return
    }

    public final void c(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2) {
            r1 = this;
            r1.mAdResultData = r2
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.sdk.core.response.b.c.r(r2)
            r1.mAdTemplate = r2
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            r1.mAdInfo = r2
            com.kwad.components.ad.draw.b r2 = new com.kwad.components.ad.draw.b
            com.kwad.sdk.widget.KSFrameLayout r0 = r1.fV
            r2.<init>(r0)
            r1.fg = r2
            r1.bL()
            return
    }

    public final void setAdInteractionListener(com.kwad.sdk.api.KsDrawAd.AdInteractionListener r1) {
            r0 = this;
            r0.dh = r1
            return
    }

    public final void setLifeStatue(java.lang.String r4) {
            r3 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = r3.fU
            if (r0 == 0) goto La
            java.lang.String r1 = "setLifeStatus"
            r2 = 0
            r0.a(r1, r4, r2)
        La:
            return
    }

    public final void setPageExitListener(com.kwad.sdk.core.j.b r1) {
            r0 = this;
            r0.dn = r1
            return
    }

    public final void setTKLoadStateListener(com.kwad.components.ad.draw.c.a r1) {
            r0 = this;
            r0.fW = r1
            return
    }

    public final void setVideoSound(boolean r2) {
            r1 = this;
            r0 = 1
            r2 = r2 ^ r0
            r1.fj = r2
            r1.fX = r0
            r1.bN()
            return
    }
}
