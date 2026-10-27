package com.kwad.components.ad.reward.presenter.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e implements com.kwad.components.ad.reward.g.a {
    private com.kwad.components.core.webview.jshandler.az cX;
    private boolean zU;
    private boolean zV;

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private void ki() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            if (r0 == 0) goto L1b
            boolean r1 = r2.zV
            if (r1 == 0) goto L1b
            boolean r1 = r2.zU
            if (r1 != 0) goto L18
            r0.uF()
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            r0.uG()
            r0 = 1
            r2.zU = r0
            return
        L18:
            r0.uJ()
        L1b:
            return
    }

    public final void A(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r1.a(r0)
            return
    }

    public final void B(com.kwad.components.ad.reward.g r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto Lc
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            r0.uI()
        Lc:
            r2.b(r1)
            return
    }

    public final void az() {
            r0 = this;
            r0.ki()
            return
    }

    public final void b(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            r0.cX = r1
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hd() {
            r1 = this;
            r0 = 1
            r1.zV = r0
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void he() {
            r1 = this;
            r0 = 1
            r1.zV = r0
            r1.ki()
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hf() {
            r1 = this;
            r0 = 0
            r1.zV = r0
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto La
            r0.uK()
        La:
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hg() {
            r1 = this;
            r0 = 0
            r1.zV = r0
            return
    }

    public final void kj() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto Lc
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            r0.uI()
        Lc:
            return
    }
}
