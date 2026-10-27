package com.kwad.components.ad.interstitial.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.sdk.widget.KSFrameLayout implements com.kwad.sdk.widget.d {
    private com.kwad.sdk.widget.KSFrameLayout fC;
    private android.widget.ImageView gw;
    private android.widget.TextView hE;
    private android.widget.ImageView hM;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.widget.KsLogoView mLogoView;
    private com.kwad.sdk.widget.KSFrameLayout mO;
    private java.lang.String oa;

    @androidx.annotation.Nullable
    private android.view.View ob;
    private android.widget.ImageView oc;
    private com.kwad.components.core.page.widget.TextProgressBar od;
    private android.view.ViewGroup oe;
    private android.view.ViewGroup of;
    private android.widget.ImageView og;
    private android.view.View oh;
    private android.view.View oi;
    private android.widget.TextView oj;
    private android.widget.ImageView ok;
    private android.widget.TextView ol;
    private android.widget.TextView om;
    private android.widget.TextView on;
    private com.kwad.components.core.page.widget.TextProgressBar oo;
    private android.widget.TextView op;
    private com.kwad.components.ad.interstitial.h.e oq;
    private final com.kwad.components.ad.interstitial.h.d.a or;
    private boolean os;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private boolean ou;
        private boolean ov;
        private int ow;
        private boolean ox;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.ou = r0
                r1.ov = r0
                r1.ow = r0
                r0 = 1
                r1.ox = r0
                return
        }

        static /* synthetic */ boolean a(com.kwad.components.ad.interstitial.h.d.a r0) {
                boolean r0 = r0.ou
                return r0
        }

        static /* synthetic */ boolean b(com.kwad.components.ad.interstitial.h.d.a r0) {
                boolean r0 = r0.ov
                return r0
        }

        public final void R(int r1) {
                r0 = this;
                r0.ow = r1
                return
        }

        public final int fk() {
                r1 = this;
                int r0 = r1.ow
                return r0
        }

        public final boolean fl() {
                r1 = this;
                boolean r0 = r1.ox
                return r0
        }

        public final void w(boolean r1) {
                r0 = this;
                r0.ou = r1
                return
        }

        public final void x(boolean r1) {
                r0 = this;
                r0.ov = r1
                return
        }

        public final void y(boolean r1) {
                r0 = this;
                r0.ox = r1
                return
        }
    }

    public d(@androidx.annotation.NonNull android.content.Context r2, com.kwad.components.ad.interstitial.h.d.a r3) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r0 = "%s秒后进入试玩页"
            r1.oa = r0
            r0 = 0
            r1.os = r0
            r1.or = r3
            boolean r0 = r3.fl()
            if (r0 == 0) goto L15
            int r0 = com.kwad.sdk.R.layout.ksad_interstitial_native_above
            goto L17
        L15:
            int r0 = com.kwad.sdk.R.layout.ksad_interstitial_native
        L17:
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            boolean r2 = com.kwad.components.ad.interstitial.h.d.a.a(r3)
            r1.t(r2)
            return
    }

    static /* synthetic */ android.widget.ImageView a(com.kwad.components.ad.interstitial.h.d r0) {
            android.widget.ImageView r0 = r0.og
            return r0
    }

    private void a(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.content.Context r1 = r2.getContext()
            float r4 = (float) r4
            int r4 = com.kwad.sdk.c.a.a.a(r1, r4)
            r0.width = r4
            android.content.Context r4 = r2.getContext()
            float r5 = (float) r5
            int r4 = com.kwad.sdk.c.a.a.a(r4, r5)
            r0.height = r4
            r3.setLayoutParams(r0)
            return
    }

    private void a(com.kwad.sdk.widget.KSFrameLayout r3, boolean r4) {
            r2 = this;
            r0 = 1
            r3.setClickable(r0)
            com.kwad.sdk.widget.h r1 = new com.kwad.sdk.widget.h
            r1.<init>(r3, r2)
            com.kwad.sdk.widget.KSFrameLayout r3 = r2.fC
            r4 = r4 ^ r0
            r3.setWidthBasedRatio(r4)
            return
    }

    static /* synthetic */ com.kwad.components.ad.interstitial.h.e b(com.kwad.components.ad.interstitial.h.d r0) {
            com.kwad.components.ad.interstitial.h.e r0 = r0.oq
            return r0
    }

    private void d(android.view.View r2, boolean r3) {
            r1 = this;
            com.kwad.components.ad.interstitial.h.e r0 = r1.oq
            if (r0 == 0) goto Le
            r0.q(r3)
            com.kwad.components.ad.interstitial.h.e r3 = r1.oq
            com.kwad.sdk.widget.KSFrameLayout r0 = r1.mO
            r3.a(r0)
        Le:
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L1c
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.ei()
            return
        L1c:
            android.view.View r3 = r1.oh
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L35
            com.kwad.components.ad.interstitial.h.d$a r2 = r1.or
            int r2 = r2.fk()
            r3 = 1
            if (r3 != r2) goto L34
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.eh()
        L34:
            return
        L35:
            com.kwad.components.core.page.widget.TextProgressBar r3 = r1.oo
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L45
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.ej()
            return
        L45:
            android.view.ViewGroup r3 = r1.of
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L55
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.eu()
            return
        L55:
            com.kwad.components.core.page.widget.TextProgressBar r3 = r1.od
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L65
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.ek()
            return
        L65:
            android.view.View r3 = r1.oi
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L75
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.en()
            return
        L75:
            com.kwad.sdk.widget.KSFrameLayout r3 = r1.fC
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L85
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.el()
            return
        L85:
            android.widget.ImageView r3 = r1.hM
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L95
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.em()
            return
        L95:
            android.widget.ImageView r3 = r1.gw
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto La5
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.eo()
            return
        La5:
            android.widget.TextView r3 = r1.ol
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lb5
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.ep()
            return
        Lb5:
            android.widget.TextView r3 = r1.hE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lc5
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.eq()
            return
        Lc5:
            android.widget.ImageView r3 = r1.ok
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Ld5
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.er()
            return
        Ld5:
            android.widget.TextView r3 = r1.om
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Le5
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.es()
            return
        Le5:
            android.widget.TextView r3 = r1.on
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lf4
            com.kwad.components.ad.interstitial.h.e r2 = r1.oq
            if (r2 == 0) goto Lf4
            r2.et()
        Lf4:
            return
    }

    private void e(android.view.View r2, int r3) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            float r3 = (float) r3
            int r3 = com.kwad.sdk.c.a.a.a(r0, r3)
            r0 = 0
            com.kwad.sdk.c.a.a.b(r2, r0, r3, r0, r0)
            return
    }

    private void fe() {
            r3 = this;
            android.widget.ImageView r0 = r3.ok
            r1 = 40
            r3.a(r0, r1, r1)
            com.kwad.components.core.page.widget.TextProgressBar r0 = r3.oo
            r1 = 130(0x82, float:1.82E-43)
            r2 = 30
            r3.a(r0, r1, r2)
            android.widget.TextView r0 = r3.om
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r1)
            com.kwad.components.core.page.widget.TextProgressBar r0 = r3.oo
            r1 = 11
            r3.e(r0, r1)
            android.widget.TextView r0 = r3.om
            r1 = 7
            r3.e(r0, r1)
            android.widget.TextView r0 = r3.on
            r3.e(r0, r1)
            return
    }

    private void t(boolean r4) {
            r3 = this;
            r0 = 1
            r3.setClickable(r0)
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_native_container
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r3.mO = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_native_video_container
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r3.fC = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_full_bg
            android.view.View r0 = r3.findViewById(r0)
            r3.ob = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_tail_frame
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.oc = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_first_frame_container
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.hM = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_interstitial_logo
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r3.mLogoView = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_playing
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.oe = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_play_end
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.of = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_download_btn
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.page.widget.TextProgressBar r0 = (com.kwad.components.core.page.widget.TextProgressBar) r0
            r3.od = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_close_outer
            android.view.View r0 = r3.findViewById(r0)
            r3.oh = r0
            com.kwad.components.core.page.widget.TextProgressBar r0 = r3.od
            if (r0 == 0) goto L7c
            android.content.Context r1 = r3.getContext()
            r2 = 1092616192(0x41200000, float:10.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            float r1 = (float) r1
            r0.setTextDimen(r1)
            com.kwad.components.core.page.widget.TextProgressBar r0 = r3.od
            r1 = -1
            r0.setTextColor(r1)
        L7c:
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_mute
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.og = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_count_down
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.oj = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_logo
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.ok = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_name
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.om = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_desc
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.on = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_download_btn
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.page.widget.TextProgressBar r0 = (com.kwad.components.core.page.widget.TextProgressBar) r0
            r3.oo = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_download_container
            android.view.View r0 = r3.findViewById(r0)
            r3.oi = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_icon
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.gw = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.ol = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_desc
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.hE = r0
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            r0.<init>(r3, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.ImageView r1 = r3.hM
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            com.kwad.components.core.page.widget.TextProgressBar r1 = r3.od
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            com.kwad.components.core.page.widget.TextProgressBar r1 = r3.oo
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.View r1 = r3.oh
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r1 = r3.of
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.TextView r1 = r3.oj
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.View r1 = r3.oi
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.ImageView r1 = r3.gw
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.TextView r1 = r3.ol
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.TextView r1 = r3.hE
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.ImageView r1 = r3.ok
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.TextView r1 = r3.om
            r0.<init>(r1, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.TextView r1 = r3.on
            r0.<init>(r1, r3)
            android.widget.ImageView r0 = r3.og
            com.kwad.components.ad.interstitial.h.d$1 r1 = new com.kwad.components.ad.interstitial.h.d$1
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_playable_timer
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.op = r0
            com.kwad.sdk.widget.KSFrameLayout r0 = r3.fC
            r3.a(r0, r4)
            boolean r4 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r4 != 0) goto L160
            r3.fe()
        L160:
            return
    }

    public final void A(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.oj
            if (r0 != 0) goto L5
            goto L24
        L5:
            if (r2 == 0) goto La
            r0.setText(r2)
        La:
            com.kwad.components.ad.interstitial.h.d$a r2 = r1.or
            boolean r2 = com.kwad.components.ad.interstitial.h.d.a.b(r2)
            if (r2 == 0) goto L24
            boolean r2 = r1.os
            if (r2 != 0) goto L24
            android.widget.TextView r2 = r1.oj
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L24
            android.widget.TextView r2 = r1.oj
            r0 = 0
            r2.setVisibility(r0)
        L24:
            return
    }

    public final void H(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.core.widget.KsLogoView r0 = r1.mLogoView
            r0.aP(r2)
            return
    }

    public final void a(float r2, com.kwad.sdk.core.video.videoview.a r3) {
            r1 = this;
            com.kwad.sdk.widget.KSFrameLayout r0 = r1.fC
            r0.setRatio(r2)
            com.kwad.sdk.widget.KSFrameLayout r2 = r1.fC
            r2.addView(r3)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r0 = 0
            r2.topMargin = r0
            r0 = -1
            r2.width = r0
            r2.height = r0
            r0 = 17
            r2.gravity = r0
            r3.setLayoutParams(r2)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.d(r2, r0)
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdTemplate r5, com.kwad.sdk.core.response.model.AdInfo r6) {
            r4 = this;
            android.widget.ImageView r0 = r4.ok
            int r1 = com.kwad.sdk.R.drawable.ksad_default_app_icon
            r0.setImageResource(r1)
            int r0 = com.kwad.sdk.core.response.b.a.ci(r6)
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L50
            android.widget.ImageView r5 = r4.ok
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cO(r6)
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadCircleIcon(r5, r0, r1)
            android.widget.TextView r5 = r4.om
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cn(r6)
            r5.setText(r0)
            android.widget.TextView r5 = r4.on
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r6)
            r5.setText(r0)
            boolean r5 = com.kwad.sdk.core.response.b.a.cK(r6)
            if (r5 == 0) goto L46
            com.kwad.components.core.page.widget.TextProgressBar r5 = r4.oo
            java.lang.String r6 = com.kwad.components.ad.e.b.aC()
            r5.e(r6, r3)
            return
        L46:
            com.kwad.components.core.page.widget.TextProgressBar r5 = r4.oo
            java.lang.String r6 = com.kwad.components.ad.e.b.aF()
            r5.e(r6, r3)
            return
        L50:
            boolean r0 = com.kwad.components.ad.interstitial.b.b.dN()
            r1 = 4
            if (r0 == 0) goto L81
            int r0 = com.kwad.sdk.core.response.b.a.ci(r6)
            r2 = 3
            if (r0 != r2) goto L81
            com.kwad.sdk.core.response.model.AdProductInfo r6 = com.kwad.sdk.core.response.b.a.cV(r6)
            android.widget.ImageView r0 = r4.ok
            java.lang.String r2 = r6.icon
            com.kwad.sdk.core.imageloader.KSImageLoader.loadWithRadius(r0, r2, r5, r1)
            android.widget.TextView r5 = r4.om
            java.lang.String r6 = r6.name
            r5.setText(r6)
            android.widget.TextView r5 = r4.on
            r6 = 8
            r5.setVisibility(r6)
            com.kwad.components.core.page.widget.TextProgressBar r5 = r4.oo
            java.lang.String r6 = com.kwad.components.ad.e.b.aD()
            r5.e(r6, r3)
            return
        L81:
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r6)
            if (r0 == 0) goto Lac
            android.widget.ImageView r0 = r4.ok
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.co(r6)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadWithRadius(r0, r2, r5, r1)
            android.widget.TextView r5 = r4.om
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.av(r6)
            r5.setText(r0)
            android.widget.TextView r5 = r4.on
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r6)
            r5.setText(r0)
            com.kwad.components.core.page.widget.TextProgressBar r5 = r4.oo
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aE(r6)
            r5.e(r6, r3)
            return
        Lac:
            android.widget.ImageView r0 = r4.ok
            java.lang.String r2 = com.kwad.sdk.core.response.b.e.eq(r5)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadWithRadius(r0, r2, r5, r1)
            android.widget.TextView r5 = r4.om
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cl(r6)
            r5.setText(r0)
            android.widget.TextView r5 = r4.on
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r6)
            r5.setText(r0)
            com.kwad.components.core.page.widget.TextProgressBar r5 = r4.oo
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aE(r6)
            r5.e(r6, r3)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            r1.d(r2, r0)
        Lc:
            return
    }

    public final void b(boolean r4, int r5) {
            r3 = this;
            android.widget.TextView r4 = r3.op
            if (r4 != 0) goto L5
            goto L1f
        L5:
            r0 = 0
            r4.setVisibility(r0)
            if (r5 < 0) goto L1f
            android.widget.TextView r4 = r3.op
            java.lang.String r1 = r3.oa
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r5
            java.lang.String r5 = java.lang.String.format(r1, r2)
            r4.setText(r5)
        L1f:
            return
    }

    public final void c(java.lang.String r3, com.kwad.sdk.core.response.model.AdTemplate r4) {
            r2 = this;
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r3)
            if (r0 != 0) goto L11
            android.widget.ImageView r0 = r2.hM
            r1 = 0
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r2.hM
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r3, r4)
        L11:
            return
    }

    public final void c(boolean r2, boolean r3) {
            r1 = this;
            android.widget.ImageView r0 = r1.hM
            if (r0 == 0) goto L12
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
            android.widget.ImageView r2 = r1.hM
            r2.setClickable(r3)
        L12:
            return
    }

    public final void f(int r2, int r3) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.width = r2
            r0.height = r3
            r1.setLayoutParams(r0)
            return
    }

    public final void f(java.lang.String r2, int r3) {
            r1 = this;
            com.kwad.components.core.page.widget.TextProgressBar r3 = r1.od
            r0 = 0
            if (r3 == 0) goto L8
            r3.e(r2, r0)
        L8:
            com.kwad.components.core.page.widget.TextProgressBar r3 = r1.oo
            if (r3 == 0) goto Lf
            r3.e(r2, r0)
        Lf:
            return
    }

    public final void ff() {
            r2 = this;
            android.widget.TextView r0 = r2.oj
            if (r0 == 0) goto Lc
            r1 = 8
            r0.setVisibility(r1)
            r0 = 1
            r2.os = r0
        Lc:
            return
    }

    public final void fg() {
            r2 = this;
            android.view.View r0 = r2.oh
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)
        L9:
            return
    }

    public final void fh() {
            r2 = this;
            r0 = 0
            r2.u(r0)
            android.view.ViewGroup r1 = r2.of
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.oc
            r1.setVisibility(r0)
            return
    }

    public final void fi() {
            r2 = this;
            android.view.ViewGroup r0 = r2.of
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.oc
            r0.setVisibility(r1)
            r0 = 1
            r2.u(r0)
            return
    }

    public final boolean fj() {
            r2 = this;
            android.view.ViewGroup r0 = r2.of
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            return r1
    }

    @androidx.annotation.Nullable
    public final android.view.View getBlurBgView() {
            r1 = this;
            android.view.View r0 = r1.ob
            return r0
    }

    public final android.widget.ImageView getTailFrameView() {
            r1 = this;
            android.widget.ImageView r0 = r1.oc
            return r0
    }

    public final void setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.mAdTemplate = r1
            return
    }

    public final void setViewListener(com.kwad.components.ad.interstitial.h.e r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public final void u(boolean r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.oe
            if (r0 == 0) goto Ld
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
        Ld:
            return
    }

    public final void v(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.og
            if (r0 == 0) goto L7
            r0.setSelected(r2)
        L7:
            return
    }
}
