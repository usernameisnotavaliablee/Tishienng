package com.kwad.components.ad.interstitial.aggregate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends androidx.viewpager.widget.PagerAdapter {
    private final com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private final com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener kQ;
    private final com.kwad.components.ad.interstitial.d kW;
    private final boolean kX;
    private com.kwad.components.ad.interstitial.aggregate.a.b kY;
    private com.kwad.components.ad.interstitial.aggregate.a.InterfaceC0020a kZ;
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private final java.util.List<com.kwad.sdk.core.response.model.AdTemplate> mAdTemplateList;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.interstitial.aggregate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0020a {
        void dz();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(com.kwad.components.ad.interstitial.h.c r1, int r2);
    }

    public a(com.kwad.sdk.core.response.model.AdResultData r2, com.kwad.components.ad.interstitial.d r3, com.kwad.sdk.api.KsAdVideoPlayConfig r4, com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAdTemplateList = r0
            r1.mAdResultData = r2
            r1.kW = r3
            r1.bU = r4
            r1.kQ = r5
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.sdk.core.response.b.c.r(r2)
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            int r2 = com.kwad.sdk.core.response.b.a.cA(r2)
            r3 = 1
            if (r2 != r3) goto L22
            goto L23
        L22:
            r3 = 0
        L23:
            r1.kX = r3
            return
    }

    static /* synthetic */ java.util.List a(com.kwad.components.ad.interstitial.aggregate.a r0) {
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r0.mAdTemplateList
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.interstitial.aggregate.a.InterfaceC0020a b(com.kwad.components.ad.interstitial.aggregate.a r0) {
            com.kwad.components.ad.interstitial.aggregate.a$a r0 = r0.kZ
            return r0
    }

    public final void a(com.kwad.components.ad.interstitial.aggregate.a.InterfaceC0020a r1) {
            r0 = this;
            r0.kZ = r1
            return
    }

    public final void a(com.kwad.components.ad.interstitial.aggregate.a.b r1) {
            r0 = this;
            r0.kY = r1
            return
    }

    public final void d(java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r2) {
            r1 = this;
            if (r2 == 0) goto L12
            int r0 = r2.size()
            if (r0 <= 0) goto L12
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r1.mAdTemplateList
            r0.clear()
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r1.mAdTemplateList
            r0.addAll(r2)
        L12:
            return
    }

    public final void destroyItem(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2, java.lang.Object r3) {
            r0 = this;
            boolean r2 = r3 instanceof android.view.View
            if (r2 == 0) goto L9
            android.view.View r3 = (android.view.View) r3
            r1.removeView(r3)
        L9:
            return
    }

    public final int getCount() {
            r1 = this;
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r1.mAdTemplateList
            int r0 = r0.size()
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.Object instantiateItem(@androidx.annotation.NonNull android.view.ViewGroup r7, int r8) {
            r6 = this;
            com.kwad.components.ad.interstitial.h.c r0 = new com.kwad.components.ad.interstitial.h.c
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1)
            r7.addView(r0)
            if (r8 <= 0) goto L10
            r7 = 1
            goto L11
        L10:
            r7 = 0
        L11:
            r0.setAggregateAdView(r7)
            com.kwad.components.ad.interstitial.aggregate.a$1 r7 = new com.kwad.components.ad.interstitial.aggregate.a$1
            r7.<init>(r6, r8)
            r0.setAdAggregateClickActionListener(r7)
            if (r8 <= 0) goto L23
            r7 = 8
            r0.setAggregateShowTriggerType(r7)
        L23:
            com.kwad.sdk.core.response.model.AdResultData r1 = r6.mAdResultData
            com.kwad.components.ad.interstitial.d r2 = r6.kW
            com.kwad.sdk.api.KsAdVideoPlayConfig r3 = r6.bU
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r4 = r6.kQ
            r5 = r8
            r0.a(r1, r2, r3, r4, r5)
            com.kwad.components.ad.interstitial.aggregate.a$b r7 = r6.kY
            if (r7 == 0) goto L36
            r7.a(r0, r5)
        L36:
            return r0
    }

    public final boolean isViewFromObject(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull java.lang.Object r2) {
            r0 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }
}
