package com.kwad.components.ad.interstitial.aggregate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class InterstitialAggregateManualTipsView extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    private com.kwad.components.ad.interstitial.aggregate.TransViewPager lc;
    private int li;
    private android.widget.ImageView lo;
    private android.widget.ImageView lp;
    private android.widget.ImageView lq;
    private int lr;
    private final androidx.viewpager.widget.ViewPager.OnPageChangeListener ls;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private final android.content.Context mContext;


    public InterstitialAggregateManualTipsView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public InterstitialAggregateManualTipsView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public InterstitialAggregateManualTipsView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.kwad.components.ad.interstitial.aggregate.InterstitialAggregateManualTipsView$1 r2 = new com.kwad.components.ad.interstitial.aggregate.InterstitialAggregateManualTipsView$1
            r2.<init>(r0)
            r0.ls = r2
            r0.mContext = r1
            r0.initView()
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.interstitial.aggregate.InterstitialAggregateManualTipsView r0) {
            int r0 = r0.lr
            return r0
    }

    static /* synthetic */ int a(com.kwad.components.ad.interstitial.aggregate.InterstitialAggregateManualTipsView r0, int r1) {
            r0.lr = r1
            return r1
    }

    static /* synthetic */ int b(com.kwad.components.ad.interstitial.aggregate.InterstitialAggregateManualTipsView r0) {
            int r0 = r0.li
            return r0
    }

    static /* synthetic */ android.widget.ImageView c(com.kwad.components.ad.interstitial.aggregate.InterstitialAggregateManualTipsView r0) {
            android.widget.ImageView r0 = r0.lo
            return r0
    }

    static /* synthetic */ android.widget.ImageView d(com.kwad.components.ad.interstitial.aggregate.InterstitialAggregateManualTipsView r0) {
            android.widget.ImageView r0 = r0.lp
            return r0
    }

    private void dD() {
            r3 = this;
            int r0 = r3.lr
            int r1 = r3.li
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto Le
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r1 = r3.lc
            int r0 = r0 + r2
            r1.setCurrentItem(r0, r2)
        Le:
            return
    }

    private void initView() {
            r5 = this;
            android.content.Context r0 = r5.mContext
            int r1 = com.kwad.sdk.R.layout.ksad_interstitial_aggregate_manual_tips
            com.kwad.sdk.o.m.inflate(r0, r1, r5)
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_aggregate_cut
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.lo = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_aggregate_refresh
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.lp = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_aggregate_convert
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.lq = r0
            android.widget.ImageView r1 = r5.lo
            android.widget.ImageView r2 = r5.lp
            r3 = 3
            android.view.View[] r3 = new android.view.View[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r1 = 2
            r3[r1] = r0
            com.kwad.sdk.c.a.a.a(r5, r3)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.lo
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            r1.dD()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            r0 = 162(0xa2, float:2.27E-43)
            com.kwad.sdk.core.adlog.c.p(r2, r0)
            return
        L13:
            android.widget.ImageView r0 = r1.lp
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L26
            r1.dD()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            r0 = 36
            com.kwad.sdk.core.adlog.c.p(r2, r0)
            return
        L26:
            android.widget.ImageView r0 = r1.lq
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L3b
            com.kwad.components.ad.interstitial.aggregate.TransViewPager r2 = r1.lc
            int r0 = r1.lr
            com.kwad.components.ad.interstitial.h.c r2 = r2.J(r0)
            if (r2 == 0) goto L3b
            r2.fc()
        L3b:
            return
    }
}
