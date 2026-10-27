package com.kwad.components.ad.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.mvp.a {
    public android.widget.FrameLayout bH;
    public com.kwad.components.ad.c.b.a bI;
    public com.kwad.sdk.api.KsAdVideoPlayConfig bJ;
    public java.util.List<com.kwad.sdk.core.response.model.AdTemplate> bK;
    private com.kwad.sdk.api.KsBannerAd.BannerAdInteractionListener bL;
    private com.kwad.components.ad.c.d bM;
    public com.kwad.components.offline.api.tk.model.StyleTemplate bN;
    public boolean bO;
    public com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    public com.kwad.sdk.internal.api.SceneImpl mAdScene;
    public android.content.Context mContext;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void Z();
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.bO = r0
            return
    }

    public static boolean a(com.kwad.sdk.core.response.model.AdTemplate r2) {
            boolean r0 = com.kwad.sdk.core.config.e.Fq()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdBannerTKInfo r2 = com.kwad.sdk.core.response.b.b.dy(r2)
            if (r2 == 0) goto L1c
            java.lang.String r0 = r2.templateId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1c
            int r2 = r2.renderType
            r0 = 1
            if (r2 != r0) goto L1c
            return r0
        L1c:
            return r1
    }

    @androidx.annotation.MainThread
    public final void W() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 1
            r0.converted = r1
            com.kwad.sdk.api.KsBannerAd$BannerAdInteractionListener r0 = r2.bL
            if (r0 == 0) goto Lc
            r0.onAdShow()
        Lc:
            return
    }

    @androidx.annotation.MainThread
    public final void X() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 1
            r0.converted = r1
            com.kwad.sdk.api.KsBannerAd$BannerAdInteractionListener r0 = r2.bL
            if (r0 == 0) goto Lc
            r0.onAdClicked()
        Lc:
            return
    }

    @androidx.annotation.MainThread
    public final void Y() {
            r1 = this;
            com.kwad.sdk.api.KsBannerAd$BannerAdInteractionListener r0 = r1.bL
            if (r0 == 0) goto L7
            r0.onAdClose()
        L7:
            return
    }

    public final void a(com.kwad.components.ad.c.b.a r1) {
            r0 = this;
            r0.bI = r1
            return
    }

    public final void a(com.kwad.sdk.api.KsBannerAd.BannerAdInteractionListener r1) {
            r0 = this;
            r0.bL = r1
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            r0.mAdResultData = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r1)
            r0.mAdTemplate = r1
            return
    }

    public final void b(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            r1.mAdTemplate = r2
            com.kwad.components.ad.c.d r0 = r1.bM
            r0.b(r2)
            return
    }

    @androidx.annotation.MainThread
    public final void c(int r2, java.lang.String r3) {
            r1 = this;
            com.kwad.sdk.api.KsBannerAd$BannerAdInteractionListener r2 = r1.bL
            if (r2 == 0) goto L8
            r0 = 0
            r2.onAdShowError(r0, r3)
        L8:
            return
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
            r0 = this;
            return
    }

    public final void setBannerUpdateAdResultDataListener(com.kwad.components.ad.c.d r1) {
            r0 = this;
            r0.bM = r1
            return
    }
}
