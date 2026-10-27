package com.kwad.components.ad.interstitial.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.ad.interstitial.f.b {
    private static int np = 4;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.ad.interstitial.f.c mj;
    private com.kwad.components.ad.interstitial.f.g.a nn;
    private com.kwad.components.ad.interstitial.f.g.b no;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private android.widget.ImageView nq;
        private android.widget.TextView nr;
        private android.widget.TextView ns;
        private com.kwad.components.ad.widget.KsPriceView nt;

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ android.widget.ImageView a(com.kwad.components.ad.interstitial.f.g.a r0) {
                android.widget.ImageView r0 = r0.nq
                return r0
        }

        static /* synthetic */ android.widget.ImageView a(com.kwad.components.ad.interstitial.f.g.a r0, android.widget.ImageView r1) {
                r0.nq = r1
                return r1
        }

        static /* synthetic */ android.widget.TextView a(com.kwad.components.ad.interstitial.f.g.a r0, android.widget.TextView r1) {
                r0.nr = r1
                return r1
        }

        static /* synthetic */ com.kwad.components.ad.widget.KsPriceView a(com.kwad.components.ad.interstitial.f.g.a r0, com.kwad.components.ad.widget.KsPriceView r1) {
                r0.nt = r1
                return r1
        }

        static /* synthetic */ android.widget.TextView b(com.kwad.components.ad.interstitial.f.g.a r0) {
                android.widget.TextView r0 = r0.nr
                return r0
        }

        static /* synthetic */ android.widget.TextView b(com.kwad.components.ad.interstitial.f.g.a r0, android.widget.TextView r1) {
                r0.ns = r1
                return r1
        }

        static /* synthetic */ com.kwad.components.ad.widget.KsPriceView c(com.kwad.components.ad.interstitial.f.g.a r0) {
                com.kwad.components.ad.widget.KsPriceView r0 = r0.nt
                return r0
        }

        static /* synthetic */ android.widget.TextView d(com.kwad.components.ad.interstitial.f.g.a r0) {
                android.widget.TextView r0 = r0.ns
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b {
        private java.lang.String appIconUrl;
        private java.lang.String nu;
        private java.lang.CharSequence nv;
        private java.lang.String nw;
        private java.lang.String nx;
        private java.lang.String price;

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public final void a(java.lang.CharSequence r1) {
                r0 = this;
                r0.nv = r1
                return
        }

        public final java.lang.CharSequence eA() {
                r1 = this;
                java.lang.CharSequence r0 = r1.nv
                return r0
        }

        public final java.lang.String eB() {
                r1 = this;
                java.lang.String r0 = r1.nw
                return r0
        }

        public final java.lang.String eC() {
                r1 = this;
                java.lang.String r0 = r1.nx
                return r0
        }

        public final java.lang.String ez() {
                r1 = this;
                java.lang.String r0 = r1.nu
                return r0
        }

        public final java.lang.String getAppIconUrl() {
                r1 = this;
                java.lang.String r0 = r1.appIconUrl
                return r0
        }

        public final java.lang.String getPrice() {
                r1 = this;
                java.lang.String r0 = r1.price
                return r0
        }

        public final void setPrice(java.lang.String r1) {
                r0 = this;
                r0.price = r1
                return
        }

        public final void w(java.lang.String r1) {
                r0 = this;
                r0.appIconUrl = r1
                return
        }

        public final void x(java.lang.String r1) {
                r0 = this;
                r0.nu = r1
                return
        }

        public final void y(java.lang.String r1) {
                r0 = this;
                r0.nw = r1
                return
        }

        public final void z(java.lang.String r1) {
                r0 = this;
                r0.nx = r1
                return
        }
    }

    static {
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.interstitial.f.g$a r0 = new com.kwad.components.ad.interstitial.f.g$a
            r0.<init>()
            r1.nn = r0
            com.kwad.components.ad.interstitial.f.g$b r0 = new com.kwad.components.ad.interstitial.f.g$b
            r0.<init>()
            r1.no = r0
            return
    }

    private void a(com.kwad.components.ad.interstitial.f.g.a r6, com.kwad.components.ad.interstitial.f.g.b r7, com.kwad.sdk.core.response.model.AdInfo r8, com.kwad.sdk.core.response.model.AdTemplate r9) {
            r5 = this;
            android.widget.ImageView r0 = com.kwad.components.ad.interstitial.f.g.a.a(r6)
            java.lang.String r1 = r7.getAppIconUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 8
            r3 = 0
            if (r1 != 0) goto L40
            r0.setVisibility(r3)
            int r1 = com.kwad.sdk.core.response.b.a.ch(r8)
            r4 = 2
            if (r1 != r4) goto L31
            java.lang.String r9 = r7.getAppIconUrl()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r4 = com.kwad.sdk.R.drawable.ksad_default_app_icon
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r4)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadCircleIcon(r0, r9, r1)
            goto L43
        L31:
            int r1 = com.kwad.sdk.R.drawable.ksad_default_app_icon
            r0.setImageResource(r1)
            java.lang.String r1 = r7.getAppIconUrl()
            int r4 = com.kwad.components.ad.interstitial.f.g.np
            com.kwad.sdk.core.imageloader.KSImageLoader.loadWithRadius(r0, r1, r9, r4)
            goto L43
        L40:
            r0.setVisibility(r2)
        L43:
            android.widget.TextView r9 = com.kwad.components.ad.interstitial.f.g.a.b(r6)
            java.lang.String r0 = r7.ez()
            r9.setText(r0)
            boolean r9 = com.kwad.components.ad.interstitial.b.b.dN()
            if (r9 == 0) goto L7d
            int r8 = com.kwad.sdk.core.response.b.a.ch(r8)
            r9 = 3
            if (r8 != r9) goto L7d
            com.kwad.components.ad.widget.KsPriceView r8 = com.kwad.components.ad.interstitial.f.g.a.c(r6)
            java.lang.String r9 = r7.getPrice()
            java.lang.String r0 = r7.eB()
            r1 = 1
            r8.d(r9, r0, r1)
            com.kwad.components.ad.widget.KsPriceView r8 = com.kwad.components.ad.interstitial.f.g.a.c(r6)
            r8.setVisibility(r3)
            android.widget.TextView r6 = com.kwad.components.ad.interstitial.f.g.a.d(r6)
            r6.setVisibility(r2)
            r5.ey()
            goto L88
        L7d:
            android.widget.TextView r6 = com.kwad.components.ad.interstitial.f.g.a.d(r6)
            java.lang.CharSequence r8 = r7.eA()
            r6.setText(r8)
        L88:
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            com.kwad.components.ad.interstitial.h.d r6 = r6.mk
            java.lang.String r7 = r7.eC()
            r6.f(r7, r3)
            return
    }

    private void d(com.kwad.sdk.core.response.model.AdInfo r4) {
            r3 = this;
            int r0 = com.kwad.sdk.core.response.b.a.ch(r4)
            r1 = 2
            if (r0 != r1) goto L48
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.cO(r4)
            r0.w(r1)
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.cn(r4)
            r0.x(r1)
            int r0 = com.kwad.components.core.widget.e.ajk
            android.text.SpannableString r0 = com.kwad.sdk.core.response.b.a.b(r4, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L29
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cN(r4)
        L29:
            com.kwad.components.ad.interstitial.f.g$b r1 = r3.no
            r1.a(r0)
            boolean r4 = com.kwad.sdk.core.response.b.a.cK(r4)
            if (r4 == 0) goto L3e
            com.kwad.components.ad.interstitial.f.g$b r4 = r3.no
            java.lang.String r0 = com.kwad.components.ad.e.b.aC()
            r4.z(r0)
            return
        L3e:
            com.kwad.components.ad.interstitial.f.g$b r4 = r3.no
            java.lang.String r0 = com.kwad.components.ad.e.b.aF()
            r4.z(r0)
            return
        L48:
            boolean r0 = com.kwad.components.ad.interstitial.b.b.dN()
            if (r0 == 0) goto L7f
            int r0 = com.kwad.sdk.core.response.b.a.ch(r4)
            r1 = 3
            if (r0 != r1) goto L7f
            com.kwad.sdk.core.response.model.AdProductInfo r4 = com.kwad.sdk.core.response.b.a.cV(r4)
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = r4.icon
            r0.w(r1)
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = r4.name
            r0.x(r1)
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = r4.originPrice
            r0.y(r1)
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r4 = r4.price
            r0.setPrice(r4)
            com.kwad.components.ad.interstitial.f.g$b r4 = r3.no
            java.lang.String r0 = com.kwad.components.ad.e.b.aD()
            r4.z(r0)
            return
        L7f:
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r4)
            if (r0 == 0) goto Ld8
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.co(r4)
            r0.w(r1)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.av(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La2
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.av(r4)
            r0.x(r1)
            goto Lc5
        La2:
            com.kwad.sdk.core.response.model.AdInfo$AdvertiserInfo r0 = r4.advertiserInfo
            java.lang.String r0 = r0.adAuthorText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb6
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            com.kwad.sdk.core.response.model.AdInfo$AdvertiserInfo r1 = r4.advertiserInfo
            java.lang.String r1 = r1.adAuthorText
            r0.x(r1)
            goto Lc5
        Lb6:
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            android.content.Context r1 = r3.getContext()
            int r2 = com.kwad.sdk.R.string.ksad_ad_default_username_normal
            java.lang.String r1 = r1.getString(r2)
            r0.x(r1)
        Lc5:
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.au(r4)
            r0.a(r1)
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.aE(r4)
            r0.z(r4)
            return
        Ld8:
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.co(r4)
            r0.w(r1)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ax(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf5
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.ax(r4)
            r0.x(r1)
            goto L118
        Lf5:
            com.kwad.sdk.core.response.model.AdInfo$AdvertiserInfo r0 = r4.advertiserInfo
            java.lang.String r0 = r0.adAuthorText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L109
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            com.kwad.sdk.core.response.model.AdInfo$AdvertiserInfo r1 = r4.advertiserInfo
            java.lang.String r1 = r1.adAuthorText
            r0.x(r1)
            goto L118
        L109:
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            android.content.Context r1 = r3.getContext()
            int r2 = com.kwad.sdk.R.string.ksad_ad_default_username_normal
            java.lang.String r1 = r1.getString(r2)
            r0.x(r1)
        L118:
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.au(r4)
            r0.a(r1)
            com.kwad.components.ad.interstitial.f.g$b r0 = r3.no
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.aE(r4)
            r0.z(r4)
            return
    }

    private void ey() {
            r4 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r4.mj
            com.kwad.components.ad.interstitial.h.d r0 = r0.mk
            int r1 = com.kwad.sdk.R.id.ksad_ad_desc_layout
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.interstitial.f.c r1 = r4.mj
            com.kwad.components.ad.interstitial.h.d r1 = r1.mk
            int r2 = com.kwad.sdk.R.id.ksad_space
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r3 = 1076593951(0x402b851f, float:2.68)
            r2.weight = r3
            r0.setLayoutParams(r2)
            r0 = 8
            r1.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.ad.interstitial.f.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            java.lang.Object r0 = r4.NN()
            com.kwad.components.ad.interstitial.f.c r0 = (com.kwad.components.ad.interstitial.f.c) r0
            r4.mj = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r4.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            com.kwad.components.ad.interstitial.f.g$a r0 = r4.nn
            com.kwad.components.ad.interstitial.f.c r1 = r4.mj
            com.kwad.components.ad.interstitial.h.d r1 = r1.mk
            int r2 = com.kwad.sdk.R.id.ksad_app_icon
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.kwad.components.ad.interstitial.f.g.a.a(r0, r1)
            com.kwad.components.ad.interstitial.f.g$a r0 = r4.nn
            com.kwad.components.ad.interstitial.f.c r1 = r4.mj
            com.kwad.components.ad.interstitial.h.d r1 = r1.mk
            int r2 = com.kwad.sdk.R.id.ksad_app_title
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.kwad.components.ad.interstitial.f.g.a.a(r0, r1)
            com.kwad.components.ad.interstitial.f.g$a r0 = r4.nn
            com.kwad.components.ad.interstitial.f.c r1 = r4.mj
            com.kwad.components.ad.interstitial.h.d r1 = r1.mk
            int r2 = com.kwad.sdk.R.id.ksad_app_desc
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.kwad.components.ad.interstitial.f.g.a.b(r0, r1)
            com.kwad.components.ad.interstitial.f.g$a r0 = r4.nn
            com.kwad.components.ad.interstitial.f.c r1 = r4.mj
            com.kwad.components.ad.interstitial.h.d r1 = r1.mk
            int r2 = com.kwad.sdk.R.id.ksad_product_price
            android.view.View r1 = r1.findViewById(r2)
            com.kwad.components.ad.widget.KsPriceView r1 = (com.kwad.components.ad.widget.KsPriceView) r1
            com.kwad.components.ad.interstitial.f.g.a.a(r0, r1)
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            r4.d(r0)
            com.kwad.components.ad.interstitial.f.g$a r0 = r4.nn
            com.kwad.components.ad.interstitial.f.g$b r1 = r4.no
            com.kwad.sdk.core.response.model.AdInfo r2 = r4.mAdInfo
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            r4.a(r0, r1, r2, r3)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            return
    }
}
