package com.kwad.components.ad.interstitial.aggregate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.interstitial.h.a {
    private com.kwad.components.core.widget.a.b fg;
    private final com.kwad.sdk.core.j.c fo;
    protected com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener kQ;
    private com.kwad.components.ad.interstitial.aggregate.TransViewPager lc;
    private com.kwad.components.ad.interstitial.aggregate.a ld;
    private com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator le;
    private android.animation.ValueAnimator lf;
    private boolean lg;
    private int lh;
    private int li;
    private boolean lj;
    private final androidx.viewpager.widget.ViewPager.OnPageChangeListener lk;

    @androidx.annotation.NonNull
    protected com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private final java.util.List<com.kwad.sdk.core.response.model.AdTemplate> mAdTemplateList;
    private final android.view.View mRootView;








    public b(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private b(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r2 = 0
            r0.<init>(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mAdTemplateList = r2
            r2 = 10
            r0.lh = r2
            r2 = 0
            r0.li = r2
            com.kwad.components.ad.interstitial.aggregate.b$6 r2 = new com.kwad.components.ad.interstitial.aggregate.b$6
            r2.<init>(r0)
            r0.fo = r2
            com.kwad.components.ad.interstitial.aggregate.b$7 r2 = new com.kwad.components.ad.interstitial.aggregate.b$7
            r2.<init>(r0)
            r0.lk = r2
            r0.mContext = r1
            int r2 = com.kwad.sdk.R.layout.ksad_interstitial_multi_ad
            android.view.View r1 = com.kwad.sdk.o.m.inflate(r1, r2, r0)
            r0.mRootView = r1
            r0.initView()
            return
    }

    private void H(int r5) {
            r4 = this;
            int r0 = r4.getWidth()
            r1 = 0
            int[] r1 = new int[]{r1, r0}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r4.lf = r1
            r2 = 800(0x320, double:3.953E-321)
            r1.setDuration(r2)
            android.animation.ValueAnimator r1 = r4.lf
            com.kwad.components.ad.interstitial.aggregate.b$4 r2 = new com.kwad.components.ad.interstitial.aggregate.b$4
            r2.<init>(r4, r5, r0)
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r0 = r4.lf
            com.kwad.components.ad.interstitial.aggregate.b$5 r1 = new com.kwad.components.ad.interstitial.aggregate.b$5
            r1.<init>(r4, r5)
            r0.addListener(r1)
            android.animation.ValueAnimator r5 = r4.lf
            r5.start()
            return
    }

    static /* synthetic */ com.kwad.components.ad.interstitial.aggregate.TransViewPager a(com.kwad.components.ad.interstitial.aggregate.b r0) {
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r0 = r0.lc
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.interstitial.aggregate.b r0, int r1) {
            r0.H(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.interstitial.aggregate.b r0, boolean r1) {
            r0.lg = r1
            return r1
    }

    static /* synthetic */ android.animation.ValueAnimator b(com.kwad.components.ad.interstitial.aggregate.b r0) {
            android.animation.ValueAnimator r0 = r0.lf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator c(com.kwad.components.ad.interstitial.aggregate.b r0) {
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0 = r0.le
            return r0
    }

    static /* synthetic */ int d(com.kwad.components.ad.interstitial.aggregate.b r0) {
            int r0 = r0.li
            return r0
    }

    private void dC() {
            r2 = this;
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0 = r2.le
            com.kwad.components.ad.interstitial.aggregate.b$3 r1 = new com.kwad.components.ad.interstitial.aggregate.b$3
            r1.<init>(r2)
            r0.setPlayProgressListener(r1)
            return
    }

    static /* synthetic */ boolean e(com.kwad.components.ad.interstitial.aggregate.b r0) {
            boolean r0 = r0.lg
            return r0
    }

    static /* synthetic */ java.util.List f(com.kwad.components.ad.interstitial.aggregate.b r0) {
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r0.mAdTemplateList
            return r0
    }

    private static int g(com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = 10
            if (r1 != 0) goto L5
            return r0
        L5:
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo$CycleAggregationInfo r1 = com.kwad.sdk.core.response.b.c.t(r1)
            if (r1 != 0) goto Lc
            return r0
        Lc:
            int r1 = r1.cycleAggregationInterval
            return r1
    }

    private void initView() {
            r3 = this;
            android.view.View r0 = r3.mRootView
            int r1 = com.kwad.sdk.R.id.ksad_multi_ad_container
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r0 = (com.kwad.components.ad.interstitial.aggregate.TransViewPager) r0
            r3.lc = r0
            android.view.View r0 = r3.mRootView
            int r1 = com.kwad.sdk.R.id.ksad_multi_ad_indicator
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0 = (com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator) r0
            r3.le = r0
            com.kwad.components.core.widget.a.b r0 = new com.kwad.components.core.widget.a.b
            android.view.View r1 = r3.mRootView
            r2 = 100
            r0.<init>(r1, r2)
            r3.fg = r0
            return
    }

    @Override // com.kwad.components.ad.interstitial.h.a
    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r1, com.kwad.components.ad.interstitial.d r2, @androidx.annotation.NonNull com.kwad.sdk.api.KsAdVideoPlayConfig r3, com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r4, int r5) {
            r0 = this;
            r0.mAdResultData = r1
            int r1 = g(r1)
            r0.lh = r1
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r1 = r0.mAdTemplateList
            r1.clear()
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r1 = r0.mAdTemplateList
            com.kwad.sdk.core.response.model.AdResultData r5 = r0.mAdResultData
            java.util.List r5 = r5.getAdTemplateList()
            r1.addAll(r5)
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r1 = r0.mAdTemplateList
            int r1 = r1.size()
            r0.li = r1
            r0.kQ = r4
            com.kwad.components.ad.interstitial.aggregate.a r1 = new com.kwad.components.ad.interstitial.aggregate.a
            com.kwad.sdk.core.response.model.AdResultData r5 = r0.mAdResultData
            r1.<init>(r5, r2, r3, r4)
            r0.ld = r1
            com.kwad.components.ad.interstitial.aggregate.b$1 r2 = new com.kwad.components.ad.interstitial.aggregate.b$1
            r2.<init>(r0)
            r1.a(r2)
            com.kwad.components.ad.interstitial.aggregate.a r1 = r0.ld
            com.kwad.components.ad.interstitial.aggregate.b$2 r2 = new com.kwad.components.ad.interstitial.aggregate.b$2
            r2.<init>(r0)
            r1.a(r2)
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r1 = r0.lc
            com.kwad.components.ad.interstitial.aggregate.a r2 = r0.ld
            r1.setAdapter(r2)
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r1 = r0.lc
            r2 = 0
            r1.setScrollable(r2)
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r1 = r0.lc
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r3 = r0.mAdTemplateList
            int r3 = r3.size()
            int r3 = r3 + (-1)
            r1.setOffscreenPageLimit(r3)
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r1 = r0.lc
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r3 = r0.lk
            r1.addOnPageChangeListener(r3)
            com.kwad.components.ad.interstitial.aggregate.a r1 = r0.ld
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r3 = r0.mAdTemplateList
            r1.d(r3)
            com.kwad.components.ad.interstitial.aggregate.a r1 = r0.ld
            r1.notifyDataSetChanged()
            com.kwad.components.core.widget.a.b r1 = r0.fg
            com.kwad.sdk.core.j.c r3 = r0.fo
            r1.a(r3)
            com.kwad.components.core.widget.a.b r1 = r0.fg
            r1.wi()
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r1 = r0.le
            if (r1 != 0) goto L7b
            return
        L7b:
            r0.dC()
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r1 = r0.le
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto La2
            boolean r3 = com.kwad.sdk.utils.aq.QW()
            r0.lj = r3
            android.content.Context r4 = r0.mContext
            if (r3 == 0) goto L95
            r3 = 1094713344(0x41400000, float:12.0)
            goto L97
        L95:
            r3 = 1086324736(0x40c00000, float:6.0)
        L97:
            int r3 = com.kwad.sdk.c.a.a.a(r4, r3)
            r1.bottomMargin = r3
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r3 = r0.le
            r3.setLayoutParams(r1)
        La2:
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r1 = r0.le
            int r3 = r0.lh
            r1.setAdShowTime(r3)
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r1 = r0.le
            r1.setVisibility(r2)
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r1 = r0.le
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r2 = r0.lc
            r1.setViewPager(r2)
            return
    }

    @Override // com.kwad.components.ad.interstitial.h.a
    public final void dA() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.interstitial.h.a
    public final void dB() {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            com.kwad.components.core.widget.a.b r0 = r2.fg
            com.kwad.sdk.core.j.c r1 = r2.fo
            r0.b(r1)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            r0.wj()
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r2.mAdTemplateList
            r0.clear()
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r0 = r2.lc
            r0.clearOnPageChangeListeners()
            return
    }

    @Override // com.kwad.components.ad.interstitial.h.a
    public final void setAdInteractionListener(com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r1) {
            r0 = this;
            r0.kQ = r1
            return
    }
}
