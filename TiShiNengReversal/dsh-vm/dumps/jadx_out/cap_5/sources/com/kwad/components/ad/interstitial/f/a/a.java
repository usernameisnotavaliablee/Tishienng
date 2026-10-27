package com.kwad.components.ad.interstitial.f.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a extends com.kwad.components.ad.interstitial.f.b implements com.kwad.components.core.webview.tachikoma.j {
    private com.kwad.components.core.webview.tachikoma.i fU;


    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.kwad.components.ad.interstitial.f.c a(com.kwad.components.ad.interstitial.f.a.a r0) {
            com.kwad.components.ad.interstitial.f.c r0 = r0.mj
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.a.C0094a r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            if (r0 == 0) goto L79
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r0.kQ
            if (r0 != 0) goto La
            goto L79
        La:
            java.lang.String r3 = r3.acf
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -2079474009: goto L44;
                case -1929947611: goto L39;
                case -1228923142: goto L2e;
                case 1609027339: goto L23;
                case 1852274314: goto L18;
                default: goto L17;
            }
        L17:
            goto L4e
        L18:
            java.lang.String r0 = "adClickCallback"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L21
            goto L4e
        L21:
            r1 = 4
            goto L4e
        L23:
            java.lang.String r0 = "adAutoCloseCallback"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2c
            goto L4e
        L2c:
            r1 = 3
            goto L4e
        L2e:
            java.lang.String r0 = "adCloseCallback"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L37
            goto L4e
        L37:
            r1 = 2
            goto L4e
        L39:
            java.lang.String r0 = "adShowCallback"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
            goto L4e
        L42:
            r1 = 1
            goto L4e
        L44:
            java.lang.String r0 = "adSkipCallback"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            switch(r1) {
                case 0: goto L72;
                case 1: goto L6a;
                case 2: goto L62;
                case 3: goto L5a;
                case 4: goto L52;
                default: goto L51;
            }
        L51:
            goto L79
        L52:
            com.kwad.components.ad.interstitial.f.c r3 = r2.mj
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r3 = r3.kQ
            r3.onAdClicked()
            return
        L5a:
            com.kwad.components.ad.interstitial.f.c r3 = r2.mj
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r3 = r3.kQ
            r3.onPageDismiss()
            return
        L62:
            com.kwad.components.ad.interstitial.f.c r3 = r2.mj
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r3 = r3.kQ
            r3.onAdClosed()
            return
        L6a:
            com.kwad.components.ad.interstitial.f.c r3 = r2.mj
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r3 = r3.kQ
            r3.onAdShow()
            return
        L72:
            com.kwad.components.ad.interstitial.f.c r3 = r2.mj
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r3 = r3.kQ
            r3.onSkippedAd()
        L79:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public void a(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.o r3) {
            r2 = this;
            com.kwad.components.core.webview.tachikoma.c.n r0 = new com.kwad.components.core.webview.tachikoma.c.n
            r0.<init>()
            com.kwad.components.ad.interstitial.f.c r1 = r2.mj
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r1.bU
            boolean r1 = r1.isVideoSoundEnable()
            r1 = r1 ^ 1
            r0.ahg = r1
            r3.c(r0)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.p r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.c.n r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public void a(com.kwad.components.core.webview.tachikoma.c.u r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public void a(com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public void a(com.kwad.sdk.components.t r2, com.kwad.sdk.core.webview.b r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.b.i r3 = new com.kwad.components.core.webview.tachikoma.b.i
            com.kwad.components.ad.interstitial.f.a.a$1 r0 = new com.kwad.components.ad.interstitial.f.a.a$1
            r0.<init>(r1)
            r3.<init>(r0)
            r2.c(r3)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r6) {
            r5 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r5.mj
            r1 = 1
            r0.ml = r1
            int r1 = r6.aNP
            long r1 = (long) r1
            int r6 = r6.mI
            long r3 = (long) r6
            r0.c(r1, r3)
            return
    }

    @Override // com.kwad.components.ad.interstitial.f.b, com.kwad.sdk.mvp.Presenter
    public void at() {
            r3 = this;
            super.at()
            com.kwad.components.core.webview.tachikoma.i r0 = r3.fU
            android.app.Activity r1 = r3.getActivity()
            com.kwad.components.ad.interstitial.f.c r2 = r3.mj
            com.kwad.sdk.core.response.model.AdResultData r2 = r2.mAdResultData
            r0.a(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void f(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public com.kwad.sdk.widget.g getTouchCoordsView() {
            r1 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.fV
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onCreate() {
            r4 = this;
            super.onCreate()
            com.kwad.components.core.webview.tachikoma.i r0 = new com.kwad.components.core.webview.tachikoma.i
            r1 = -1
            android.content.Context r3 = r4.getContext()
            r0.<init>(r1, r3)
            r4.fU = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.core.webview.tachikoma.i r0 = r1.fU
            if (r0 == 0) goto La
            r0.kz()
        La:
            return
    }
}
