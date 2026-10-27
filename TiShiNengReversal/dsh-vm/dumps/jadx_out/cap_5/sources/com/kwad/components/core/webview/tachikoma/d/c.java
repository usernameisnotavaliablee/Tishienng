package com.kwad.components.core.webview.tachikoma.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c extends com.kwad.components.core.webview.tachikoma.d.a {
    private java.lang.String AI;
    private android.widget.FrameLayout Yp;
    private com.kwad.components.core.webview.tachikoma.d.e afi;
    private com.kwad.components.core.webview.tachikoma.b.p ahv;
    private com.kwad.components.core.webview.jshandler.az ahw;
    private com.kwad.components.core.webview.tachikoma.f.e ahx;




    public c() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.d.c$2 r0 = new com.kwad.components.core.webview.tachikoma.d.c$2
            r0.<init>(r1)
            r1.ahx = r0
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az a(com.kwad.components.core.webview.tachikoma.d.c r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.ahw
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.d.e b(com.kwad.components.core.webview.tachikoma.d.c r0) {
            com.kwad.components.core.webview.tachikoma.d.e r0 = r0.afi
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.core.webview.tachikoma.d.c r0) {
            r0.vF()
            return
    }

    private void vF() {
            r3 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = r3.ahp
            com.kwad.components.core.webview.tachikoma.d.e$a r0 = r0.ahu
            if (r0 == 0) goto L9
            r0.hc()
        L9:
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            java.lang.String r1 = r3.getTkTemplateId()
            java.lang.String r2 = r3.getTKReaderScene()
            r0.t(r1, r2)
            com.kwad.components.core.webview.tachikoma.d.b r0 = r3.ahp
            com.kwad.sdk.components.l r0 = r0.ahr
            if (r0 == 0) goto L24
            r1 = 0
            java.lang.String r2 = "render failed"
            r0.callbackPageStatus(r1, r2)
        L24:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.a.C0094a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r7) {
            r6 = this;
            android.content.Context r0 = r6.getContext()
            float r0 = com.kwad.sdk.c.a.a.bj(r0)
            android.widget.FrameLayout r1 = r6.Yp
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r1.getHeight()
            float r1 = (float) r1
            android.widget.FrameLayout r3 = r6.Yp
            int r3 = r3.getWidth()
            float r3 = (float) r3
            goto L1c
        L1a:
            r1 = 0
            r3 = 0
        L1c:
            r4 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 == 0) goto L32
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L27
            goto L32
        L27:
            float r3 = r3 / r0
            float r3 = r3 + r4
            int r2 = (int) r3
            r7.width = r2
            float r1 = r1 / r0
            float r1 = r1 + r4
            int r0 = (int) r1
            r7.height = r0
            return
        L32:
            android.content.Context r1 = r6.getContext()
            int r1 = com.kwad.sdk.utils.br.getScreenWidth(r1)
            float r1 = (float) r1
            float r1 = r1 / r0
            float r1 = r1 + r4
            int r1 = (int) r1
            r7.width = r1
            android.content.Context r1 = r6.getContext()
            int r1 = com.kwad.sdk.utils.br.getScreenHeight(r1)
            float r1 = (float) r1
            float r1 = r1 / r0
            float r1 = r1 + r4
            int r0 = (int) r1
            r7.height = r0
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            r0.ahw = r1
            return
    }

    public void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.d.e r2 = r1.afi
            if (r2 == 0) goto L1e
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L15
            com.kwad.components.core.webview.tachikoma.d.e r2 = r1.afi
            com.kwad.components.core.webview.tachikoma.d.c$3 r0 = new com.kwad.components.core.webview.tachikoma.d.c$3
            r0.<init>(r1)
            r2.d(r0)
            goto L18
        L15:
            r1.vF()
        L18:
            com.kwad.components.core.webview.tachikoma.d.e r2 = r1.afi
            r2.dismiss()
            return
        L1e:
            r1.vF()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.p r5) {
            r4 = this;
            r4.ahv = r5
            com.kwad.components.core.webview.tachikoma.d.b r0 = r4.ahp
            long r0 = r0.AO
            if (r5 == 0) goto L22
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L22
            com.kwad.components.core.webview.tachikoma.c.z r5 = new com.kwad.components.core.webview.tachikoma.c.z
            r5.<init>()
            float r0 = (float) r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r5.qz = r0
            com.kwad.components.core.webview.tachikoma.b.p r0 = r4.ahv
            r0.a(r5)
        L22:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.c.u r2) {
            r1 = this;
            super.a(r2)
            com.kwad.components.core.webview.tachikoma.d.e r2 = r1.afi
            if (r2 == 0) goto La
            r2.dismiss()
        La:
            com.kwad.components.core.webview.tachikoma.d.b r2 = r1.ahp
            com.kwad.components.core.webview.tachikoma.f.c r2 = r2.Yd
            if (r2 == 0) goto L14
            r0 = 1
            r2.G(r0)
        L14:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a
    protected final void a(com.kwad.components.core.webview.tachikoma.d.b r2) {
            r1 = this;
            super.a(r2)
            com.kwad.components.core.webview.tachikoma.d.b r2 = r1.ahp
            java.lang.String r0 = r2.AI
            r1.AI = r0
            com.kwad.components.core.webview.tachikoma.d.e r2 = r2.afi
            r1.afi = r2
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a, com.kwad.components.core.webview.tachikoma.j
    public void a(com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            super.a(r1)
            com.kwad.components.core.webview.tachikoma.d.b r1 = r0.ahp
            com.kwad.sdk.components.l r1 = r1.ahr
            if (r1 == 0) goto Lc
            r1.callbackDialogDismiss()
        Lc:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a, com.kwad.components.core.webview.tachikoma.j
    public final void aA() {
            r2 = this;
            super.aA()
            com.kwad.components.core.webview.tachikoma.d.b r0 = r2.ahp
            boolean r1 = r0.aht
            if (r1 == 0) goto L12
            com.kwad.components.core.webview.tachikoma.f.c r0 = r0.Yd
            if (r0 == 0) goto L22
            r1 = 1
            r0.G(r1)
            return
        L12:
            com.kwad.components.core.webview.tachikoma.d.e r0 = r2.afi
            if (r0 == 0) goto L19
            r0.dismiss()
        L19:
            com.kwad.components.core.webview.tachikoma.d.b r0 = r2.ahp
            com.kwad.components.core.webview.tachikoma.f.c r0 = r0.Yd
            if (r0 == 0) goto L22
            r0.hj()
        L22:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void aB() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            com.kwad.components.core.webview.tachikoma.d.e r0 = r3.afi
            if (r0 == 0) goto Lc
            com.kwad.components.core.webview.tachikoma.f.e r1 = r3.ahx
            r0.a(r1)
        Lc:
            com.kwad.components.core.webview.tachikoma.d.b r0 = r3.ahp
            com.kwad.sdk.components.l r0 = r0.ahr
            if (r0 == 0) goto L2e
            com.kwad.components.core.webview.tachikoma.i r0 = r3.fU
            com.kwad.components.core.webview.tachikoma.d.c$1 r1 = new com.kwad.components.core.webview.tachikoma.d.c$1
            r1.<init>(r3)
            r0.a(r1)
            com.kwad.components.core.webview.tachikoma.d.b r0 = r3.ahp
            com.kwad.sdk.components.l r0 = r0.ahr
            com.kwad.components.core.webview.tachikoma.i r1 = r3.fU
            r0.a(r1)
            com.kwad.components.core.webview.tachikoma.i r0 = r3.fU
            java.lang.String r1 = "hasTKBridge"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.a(r1, r2)
        L2e:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r3 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = r3.ahp
            com.kwad.sdk.components.l r0 = r0.ahr
            if (r0 == 0) goto Lb
            r1 = 1
            r2 = 0
            r0.callbackPageStatus(r1, r2)
        Lb:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public java.lang.String getRegisterViewKey() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public android.widget.FrameLayout getTKContainer() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.Yp
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_dialog"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = r1.ahp
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r0.Yf
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.templateId
            return r0
        L9:
            java.lang.String r0 = r1.AI
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_tk_dialog_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.Yp = r0
            return
    }
}
