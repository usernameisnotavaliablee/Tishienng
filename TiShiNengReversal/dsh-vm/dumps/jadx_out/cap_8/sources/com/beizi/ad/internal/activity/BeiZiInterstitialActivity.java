package com.beizi.ad.internal.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BeiZiInterstitialActivity extends android.app.Activity {
    private boolean A;
    private boolean B;
    private android.media.MediaPlayer C;
    private boolean D;
    private int E;
    private boolean F;
    private int G;
    private android.os.CountDownTimer H;
    private boolean I;
    private java.lang.String J;
    private java.lang.String K;
    private java.lang.String L;
    private java.lang.String M;
    private java.lang.String N;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean O;
    private com.beizi.ad.a.a.c P;
    private com.beizi.ad.a.a.e Q;
    private com.beizi.ad.a.a.d R;
    private com.beizi.ad.a.a.a S;
    private com.beizi.ad.a.a.b T;
    private boolean U;
    private java.util.Timer V;
    private java.util.TimerTask W;
    private boolean X;
    private com.beizi.ad.internal.c.a a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.f.c f6557b;

    /* renamed from: c, reason: collision with root package name */
    private android.widget.LinearLayout f6558c;

    /* renamed from: d, reason: collision with root package name */
    private android.widget.LinearLayout f6559d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.LinearLayout f6560e;

    /* renamed from: f, reason: collision with root package name */
    private android.widget.TextView f6561f;

    /* renamed from: g, reason: collision with root package name */
    private android.widget.TextView f6562g;

    /* renamed from: h, reason: collision with root package name */
    private android.widget.TextView f6563h;

    /* renamed from: i, reason: collision with root package name */
    private android.widget.TextView f6564i;

    /* renamed from: j, reason: collision with root package name */
    private android.widget.TextView f6565j;

    /* renamed from: k, reason: collision with root package name */
    private android.widget.RelativeLayout f6566k;
    private android.widget.RelativeLayout l;
    private android.widget.RelativeLayout m;
    private android.widget.RelativeLayout n;
    private android.widget.RelativeLayout o;
    private android.widget.RelativeLayout p;
    private android.widget.FrameLayout q;
    private com.beizi.ad.internal.view.CustomRoundImageView r;
    private com.beizi.ad.internal.view.CustomRoundImageView s;
    private android.widget.ImageView t;
    private android.widget.ImageView u;
    private android.widget.ImageView v;
    private android.widget.VideoView w;
    private android.view.View x;
    private android.view.View y;
    private boolean z;




















    public BeiZiInterstitialActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.z = r0
            r1.A = r0
            r1.D = r0
            r0 = 1
            r1.I = r0
            r1.U = r0
            return
    }

    private void A() {
            r1 = this;
            android.widget.VideoView r0 = r1.w     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L21
            boolean r0 = r1.B     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L21
            android.widget.RelativeLayout r0 = r1.n     // Catch: java.lang.Exception -> L39
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> L39
            if (r0 != 0) goto L14
            r0 = 0
            r1.E = r0     // Catch: java.lang.Exception -> L39
            goto L1c
        L14:
            android.widget.VideoView r0 = r1.w     // Catch: java.lang.Exception -> L39
            int r0 = r0.getCurrentPosition()     // Catch: java.lang.Exception -> L39
            r1.E = r0     // Catch: java.lang.Exception -> L39
        L1c:
            android.widget.VideoView r0 = r1.w     // Catch: java.lang.Exception -> L39
            r0.pause()     // Catch: java.lang.Exception -> L39
        L21:
            com.beizi.ad.a.a.e r0 = r1.Q     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L28
            r0.b()     // Catch: java.lang.Exception -> L39
        L28:
            com.beizi.ad.a.a.a r0 = r1.S     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L2f
            r0.b()     // Catch: java.lang.Exception -> L39
        L2f:
            android.os.CountDownTimer r0 = r1.H     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L36
            r0.cancel()     // Catch: java.lang.Exception -> L39
        L36:
            r0 = 0
            r1.H = r0     // Catch: java.lang.Exception -> L39
        L39:
            return
    }

    static /* synthetic */ int a(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0, int r1) {
            r0.E = r1
            return r1
    }

    static /* synthetic */ android.media.MediaPlayer a(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0, android.media.MediaPlayer r1) {
            r0.C = r1
            return r1
    }

    static /* synthetic */ android.widget.TextView a(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            android.widget.TextView r0 = r0.f6562g
            return r0
    }

    static /* synthetic */ void a(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
            r3 = this;
            com.beizi.ad.internal.c.a r0 = r3.a     // Catch: java.lang.Exception -> L67
            if (r0 != 0) goto L5
            goto L67
        L5:
            boolean r0 = r3.hasWindowFocus()     // Catch: java.lang.Exception -> L67
            if (r0 != 0) goto Lc
            goto L67
        Lc:
            com.beizi.ad.internal.c.a r0 = r3.a     // Catch: java.lang.Exception -> L67
            r1 = r4
            com.beizi.ad.internal.f.c r4 = r0.a     // Catch: java.lang.Exception -> L67
            if (r4 != 0) goto L14
            goto L67
        L14:
            com.beizi.ad.internal.c r0 = r0.d()     // Catch: java.lang.Exception -> L67
            if (r0 != 0) goto L1b
            goto L67
        L1b:
            r2 = r6
            com.beizi.ad.model.d r6 = new com.beizi.ad.model.d     // Catch: java.lang.Exception -> L67
            r6.<init>()     // Catch: java.lang.Exception -> L67
            r6.a(r1)     // Catch: java.lang.Exception -> L67
            r6.e(r8)     // Catch: java.lang.Exception -> L67
            r6.b(r5)     // Catch: java.lang.Exception -> L67
            r6.f(r9)     // Catch: java.lang.Exception -> L67
            r6.c(r2)     // Catch: java.lang.Exception -> L67
            r6.g(r10)     // Catch: java.lang.Exception -> L67
            r6.d(r7)     // Catch: java.lang.Exception -> L67
            r6.h(r11)     // Catch: java.lang.Exception -> L67
            r1 = 1
            r4.a(r1)     // Catch: java.lang.Exception -> L67
            android.widget.LinearLayout r5 = r3.f6558c     // Catch: java.lang.Exception -> L67
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L67
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L67
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L67
            r10 = 10
            long r8 = r8 + r10
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> L67
            boolean r9 = r3.D     // Catch: java.lang.Exception -> L67
            com.beizi.ad.internal.c.a r10 = r3.a     // Catch: java.lang.Exception -> L67
            com.beizi.ad.internal.e r10 = r10.c()     // Catch: java.lang.Exception -> L67
            java.lang.String r10 = r10.a()     // Catch: java.lang.Exception -> L67
            r11 = r12
            r4.a(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L67
            r3.D = r1     // Catch: java.lang.Exception -> L67
            r0.d()     // Catch: java.lang.Exception -> L67
        L67:
            return
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0, boolean r1) {
            r0.U = r1
            return r1
    }

    private void b() {
            r1 = this;
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_content_rl
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r1.f6566k = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_container_ll
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f6558c = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_complain_tv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6561f = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_close_container_rl
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r1.l = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_close_text_container_ll
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f6559d = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_close_iv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.u = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_countdown_tv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6562g = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_material_container_rl
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r1.m = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_video_replay_container_rl
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r1.n = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_video_replay_iv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.v = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_logo_container_fl
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.q = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_img_iv
            android.view.View r0 = r1.findViewById(r0)
            com.beizi.ad.internal.view.CustomRoundImageView r0 = (com.beizi.ad.internal.view.CustomRoundImageView) r0
            r1.r = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_video_vv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.VideoView r0 = (android.widget.VideoView) r0
            r1.w = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_app_icon_iv
            android.view.View r0 = r1.findViewById(r0)
            com.beizi.ad.internal.view.CustomRoundImageView r0 = (com.beizi.ad.internal.view.CustomRoundImageView) r0
            r1.s = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_divide_view
            android.view.View r0 = r1.findViewById(r0)
            r1.x = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_voice_iv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.t = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_title_container_ll
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f6560e = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_title_tv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6564i = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_subtitle_tv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6565j = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_title_divider_view
            android.view.View r0 = r1.findViewById(r0)
            r1.y = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_interaction_container_landscape_rl
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r1.p = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_interaction_container_portrait_rl
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r1.o = r0
            int r0 = com.beizi.fusion.R.id.beizi_interstitial_ad_app_download_info_tv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6563h = r0
            return
    }

    static /* synthetic */ boolean b(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            boolean r0 = r0.F
            return r0
    }

    static /* synthetic */ boolean b(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0, boolean r1) {
            r0.A = r1
            return r1
    }

    static /* synthetic */ int c(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            int r0 = r0.G
            return r0
    }

    private void c() {
            r2 = this;
            com.beizi.ad.internal.c.a r0 = com.beizi.ad.internal.c.a.f6655b     // Catch: java.lang.Exception -> L7f
            r2.a = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r0.a()     // Catch: java.lang.Exception -> L7f
            r2.O = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.ad.internal.c.a r0 = r2.a     // Catch: java.lang.Exception -> L7f
            boolean r0 = r0.e()     // Catch: java.lang.Exception -> L7f
            r2.X = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.O     // Catch: java.lang.Exception -> L7f
            if (r0 != 0) goto L17
            goto L7f
        L17:
            int r0 = r0.getTemplate()     // Catch: java.lang.Exception -> L7f
            r1 = 1
            if (r0 != r1) goto L21
            r2.z = r1     // Catch: java.lang.Exception -> L7f
            goto L24
        L21:
            r0 = 0
            r2.z = r0     // Catch: java.lang.Exception -> L7f
        L24:
            com.beizi.ad.internal.c.a r0 = r2.a     // Catch: java.lang.Exception -> L7f
            com.beizi.ad.internal.f.c r0 = r0.a     // Catch: java.lang.Exception -> L7f
            r2.f6557b = r0     // Catch: java.lang.Exception -> L7f
            if (r0 != 0) goto L2d
            goto L7f
        L2d:
            java.lang.String r0 = r0.f()     // Catch: java.lang.Exception -> L7f
            r2.N = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            boolean r0 = r0.N()     // Catch: java.lang.Exception -> L7f
            r2.B = r0     // Catch: java.lang.Exception -> L7f
            if (r0 == 0) goto L46
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            java.lang.String r0 = r0.M()     // Catch: java.lang.Exception -> L7f
            r2.M = r0     // Catch: java.lang.Exception -> L7f
            goto L4e
        L46:
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            java.lang.String r0 = r0.L()     // Catch: java.lang.Exception -> L7f
            r2.M = r0     // Catch: java.lang.Exception -> L7f
        L4e:
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            java.lang.String r0 = r0.O()     // Catch: java.lang.Exception -> L7f
            r2.J = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            boolean r0 = r0.n()     // Catch: java.lang.Exception -> L7f
            r2.F = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            int r0 = r0.s()     // Catch: java.lang.Exception -> L7f
            r2.G = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            java.lang.String r0 = r0.J()     // Catch: java.lang.Exception -> L7f
            r2.K = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            java.lang.String r0 = r0.K()     // Catch: java.lang.Exception -> L7f
            r2.L = r0     // Catch: java.lang.Exception -> L7f
            com.beizi.ad.internal.f.c r0 = r2.f6557b     // Catch: java.lang.Exception -> L7f
            boolean r0 = r0.m()     // Catch: java.lang.Exception -> L7f
            r0 = r0 ^ r1
            r2.A = r0     // Catch: java.lang.Exception -> L7f
        L7f:
            return
    }

    private void d() {
            r12 = this;
            r0 = 1092616192(0x41200000, float:10.0)
            int r1 = com.beizi.ad.internal.h.u.a(r12, r0)     // Catch: java.lang.Exception -> L19a
            android.widget.LinearLayout r2 = r12.f6558c     // Catch: java.lang.Exception -> L19a
            java.lang.String r3 = "#FFFFFF"
            r4 = 0
            r5 = 0
            com.beizi.ad.internal.h.n.a(r2, r3, r5, r4, r1)     // Catch: java.lang.Exception -> L19a
            r2 = 1111752704(0x42440000, float:49.0)
            int r2 = com.beizi.ad.internal.h.u.a(r12, r2)     // Catch: java.lang.Exception -> L19a
            r3 = 1100480512(0x41980000, float:19.0)
            int r3 = com.beizi.ad.internal.h.u.a(r12, r3)     // Catch: java.lang.Exception -> L19a
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = com.beizi.ad.internal.h.u.a(r12, r6)     // Catch: java.lang.Exception -> L19a
            r7 = 1112539136(0x42500000, float:52.0)
            int r7 = com.beizi.ad.internal.h.u.a(r12, r7)     // Catch: java.lang.Exception -> L19a
            android.widget.TextView r8 = r12.f6561f     // Catch: java.lang.Exception -> L19a
            java.lang.String r9 = "#66303030"
            if (r8 == 0) goto L49
            com.beizi.ad.internal.h.n.a(r8, r9, r5, r4, r1)     // Catch: java.lang.Exception -> L19a
            android.widget.TextView r8 = r12.f6561f     // Catch: java.lang.Exception -> L19a
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout$LayoutParams r8 = (android.widget.RelativeLayout.LayoutParams) r8     // Catch: java.lang.Exception -> L19a
            r8.width = r2     // Catch: java.lang.Exception -> L19a
            r8.height = r3     // Catch: java.lang.Exception -> L19a
            r8.setMargins(r6, r6, r5, r5)     // Catch: java.lang.Exception -> L19a
            r2 = 17
            r8.addRule(r2)     // Catch: java.lang.Exception -> L19a
            android.widget.TextView r2 = r12.f6561f     // Catch: java.lang.Exception -> L19a
            r2.setLayoutParams(r8)     // Catch: java.lang.Exception -> L19a
        L49:
            android.widget.ImageView r2 = r12.t     // Catch: java.lang.Exception -> L19a
            if (r2 == 0) goto L63
            boolean r8 = r12.B     // Catch: java.lang.Exception -> L19a
            if (r8 == 0) goto L63
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2     // Catch: java.lang.Exception -> L19a
            r2.width = r3     // Catch: java.lang.Exception -> L19a
            r2.height = r3     // Catch: java.lang.Exception -> L19a
            r2.setMargins(r5, r6, r1, r5)     // Catch: java.lang.Exception -> L19a
            android.widget.ImageView r8 = r12.t     // Catch: java.lang.Exception -> L19a
            r8.setLayoutParams(r2)     // Catch: java.lang.Exception -> L19a
        L63:
            android.widget.LinearLayout r2 = r12.f6559d     // Catch: java.lang.Exception -> L19a
            if (r2 == 0) goto L7e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2     // Catch: java.lang.Exception -> L19a
            r2.width = r7     // Catch: java.lang.Exception -> L19a
            r2.height = r3     // Catch: java.lang.Exception -> L19a
            r2.setMargins(r5, r6, r6, r5)     // Catch: java.lang.Exception -> L19a
            android.widget.LinearLayout r7 = r12.f6559d     // Catch: java.lang.Exception -> L19a
            r7.setLayoutParams(r2)     // Catch: java.lang.Exception -> L19a
            android.widget.LinearLayout r2 = r12.f6559d     // Catch: java.lang.Exception -> L19a
            com.beizi.ad.internal.h.n.a(r2, r9, r5, r4, r1)     // Catch: java.lang.Exception -> L19a
        L7e:
            android.widget.TextView r2 = r12.f6562g     // Catch: java.lang.Exception -> L19a
            if (r2 == 0) goto L98
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2     // Catch: java.lang.Exception -> L19a
            r2.width = r3     // Catch: java.lang.Exception -> L19a
            r2.height = r3     // Catch: java.lang.Exception -> L19a
            android.widget.TextView r7 = r12.f6562g     // Catch: java.lang.Exception -> L19a
            r7.setLayoutParams(r2)     // Catch: java.lang.Exception -> L19a
            android.widget.TextView r2 = r12.f6562g     // Catch: java.lang.Exception -> L19a
            int r1 = r1 * 2
            com.beizi.ad.internal.h.n.a(r2, r9, r5, r4, r1)     // Catch: java.lang.Exception -> L19a
        L98:
            android.widget.ImageView r1 = r12.u     // Catch: java.lang.Exception -> L19a
            if (r1 == 0) goto Lae
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Exception -> L19a
            r1.width = r3     // Catch: java.lang.Exception -> L19a
            r1.height = r3     // Catch: java.lang.Exception -> L19a
            r1.setMargins(r5, r6, r6, r5)     // Catch: java.lang.Exception -> L19a
            android.widget.ImageView r2 = r12.u     // Catch: java.lang.Exception -> L19a
            r2.setLayoutParams(r1)     // Catch: java.lang.Exception -> L19a
        Lae:
            int r1 = com.beizi.ad.lance.a.q.f(r12)     // Catch: java.lang.Exception -> L19a
            int r2 = com.beizi.ad.lance.a.q.g(r12)     // Catch: java.lang.Exception -> L19a
            double r3 = (double) r1     // Catch: java.lang.Exception -> L19a
            r6 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            double r6 = r6 * r3
            int r1 = (int) r6     // Catch: java.lang.Exception -> L19a
            r6 = 1084227584(0x40a00000, float:5.0)
            int r7 = com.beizi.ad.internal.h.u.a(r12, r6)     // Catch: java.lang.Exception -> L19a
            boolean r8 = r12.z     // Catch: java.lang.Exception -> L19a
            r9 = -2
            if (r8 == 0) goto L122
            r7 = 4605831338911806259(0x3feb333333333333, double:0.85)
            double r3 = r3 * r7
            int r1 = (int) r3     // Catch: java.lang.Exception -> L19a
            int r7 = com.beizi.ad.internal.h.u.a(r12, r0)     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout r0 = r12.p     // Catch: java.lang.Exception -> L19a
            r0.setVisibility(r5)     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout r0 = r12.p     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L141
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L141
            int r3 = r7 * 3
            int r3 = r1 - r3
            r0.width = r3     // Catch: java.lang.Exception -> L19a
            r0.height = r9     // Catch: java.lang.Exception -> L19a
            java.lang.String r3 = r12.J     // Catch: java.lang.Exception -> L19a
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L19a
            if (r3 != 0) goto L10f
            java.lang.String r3 = r12.K     // Catch: java.lang.Exception -> L19a
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L19a
            if (r3 == 0) goto L10f
            java.lang.String r3 = r12.L     // Catch: java.lang.Exception -> L19a
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L19a
            if (r3 == 0) goto L10f
            int r3 = com.beizi.ad.internal.h.u.a(r12, r6)     // Catch: java.lang.Exception -> L19a
            r0.setMargins(r5, r7, r5, r3)     // Catch: java.lang.Exception -> L19a
            goto L11c
        L10f:
            double r3 = (double) r7     // Catch: java.lang.Exception -> L19a
            r10 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r3 = r3 * r10
            int r3 = (int) r3     // Catch: java.lang.Exception -> L19a
            int r4 = com.beizi.ad.internal.h.u.a(r12, r6)     // Catch: java.lang.Exception -> L19a
            r0.setMargins(r5, r3, r5, r4)     // Catch: java.lang.Exception -> L19a
        L11c:
            android.widget.RelativeLayout r3 = r12.p     // Catch: java.lang.Exception -> L19a
            r3.setLayoutParams(r0)     // Catch: java.lang.Exception -> L19a
            goto L141
        L122:
            android.widget.RelativeLayout r0 = r12.o     // Catch: java.lang.Exception -> L19a
            r0.setVisibility(r5)     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout r0 = r12.o     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L141
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L141
            r0.width = r1     // Catch: java.lang.Exception -> L19a
            r0.height = r9     // Catch: java.lang.Exception -> L19a
            int r3 = r7 * 3
            r0.setMargins(r5, r3, r5, r5)     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout r3 = r12.o     // Catch: java.lang.Exception -> L19a
            r3.setLayoutParams(r0)     // Catch: java.lang.Exception -> L19a
        L141:
            android.widget.LinearLayout r0 = r12.f6558c     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L15b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L15b
            r0.width = r1     // Catch: java.lang.Exception -> L19a
            r0.height = r9     // Catch: java.lang.Exception -> L19a
            android.widget.LinearLayout r3 = r12.f6558c     // Catch: java.lang.Exception -> L19a
            r3.setLayoutParams(r0)     // Catch: java.lang.Exception -> L19a
            android.widget.LinearLayout r0 = r12.f6558c     // Catch: java.lang.Exception -> L19a
            r0.setPadding(r7, r7, r7, r7)     // Catch: java.lang.Exception -> L19a
        L15b:
            android.widget.RelativeLayout r0 = r12.m     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L19a
            int r7 = r7 * 2
            int r1 = r1 - r7
            boolean r3 = r12.z     // Catch: java.lang.Exception -> L19a
            if (r3 == 0) goto L170
            double r3 = (double) r1     // Catch: java.lang.Exception -> L19a
            r5 = 4603219251127931372(0x3fe1eb851eb851ec, double:0.56)
        L16c:
            double r3 = r3 * r5
            int r3 = (int) r3     // Catch: java.lang.Exception -> L19a
            goto L177
        L170:
            double r3 = (double) r1     // Catch: java.lang.Exception -> L19a
            r5 = 4610695226509366395(0x3ffc7ae147ae147b, double:1.78)
            goto L16c
        L177:
            double r4 = (double) r3     // Catch: java.lang.Exception -> L19a
            double r6 = (double) r2     // Catch: java.lang.Exception -> L19a
            r8 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r8 = r8 * r6
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L189
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r6 = r6 * r2
            int r3 = (int) r6     // Catch: java.lang.Exception -> L19a
        L189:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L19a
            r0.width = r1     // Catch: java.lang.Exception -> L19a
            r0.height = r3     // Catch: java.lang.Exception -> L19a
            android.widget.RelativeLayout r1 = r12.m     // Catch: java.lang.Exception -> L19a
            r1.setLayoutParams(r0)     // Catch: java.lang.Exception -> L19a
        L19a:
            return
    }

    static /* synthetic */ void d(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            r0.q()
            return
    }

    static /* synthetic */ com.beizi.ad.internal.view.CustomRoundImageView e(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            com.beizi.ad.internal.view.CustomRoundImageView r0 = r0.r
            return r0
    }

    private boolean e() {
            r2 = this;
            boolean r0 = r2.B
            r1 = 1
            if (r0 != 0) goto L10
            boolean r0 = r2.F
            if (r0 == 0) goto Le
            int r0 = r2.G
            if (r0 <= 0) goto Le
            return r1
        Le:
            r0 = 0
            return r0
        L10:
            return r1
    }

    static /* synthetic */ android.widget.RelativeLayout f(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            android.widget.RelativeLayout r0 = r0.m
            return r0
    }

    private void f() {
            r3 = this;
            boolean r0 = r3.e()     // Catch: java.lang.Exception -> L23
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L14
            android.widget.LinearLayout r0 = r3.f6559d     // Catch: java.lang.Exception -> L23
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L23
            android.widget.ImageView r0 = r3.u     // Catch: java.lang.Exception -> L23
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L23
            return
        L14:
            android.widget.LinearLayout r0 = r3.f6559d     // Catch: java.lang.Exception -> L23
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L23
            android.widget.ImageView r0 = r3.u     // Catch: java.lang.Exception -> L23
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L23
            android.widget.LinearLayout r0 = r3.f6559d     // Catch: java.lang.Exception -> L23
            r0.measure(r2, r2)     // Catch: java.lang.Exception -> L23
        L23:
            return
    }

    private void g() {
            r7 = this;
            r0 = 0
            r7.H = r0     // Catch: java.lang.Exception -> L2d
            int r0 = r7.G     // Catch: java.lang.Exception -> L2d
            android.widget.TextView r1 = r7.f6562g     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L2f
            java.lang.CharSequence r1 = r1.getText()     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L23
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L23
            if (r2 != 0) goto L23
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Exception -> L23
            if (r2 != 0) goto L23
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L23
        L23:
            android.widget.TextView r1 = r7.f6562g     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L2d
            r1.setText(r2)     // Catch: java.lang.Exception -> L2d
            goto L2f
        L2d:
            r2 = r7
            goto L3f
        L2f:
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$1 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$1     // Catch: java.lang.Exception -> L2d
            int r0 = r0 * 1000
            long r3 = (long) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            r2 = r7
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Exception -> L3f
            r2.H = r1     // Catch: java.lang.Exception -> L3f
            r1.start()     // Catch: java.lang.Exception -> L3f
        L3f:
            return
    }

    static /* synthetic */ void g(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            r0.o()
            return
    }

    private void h() {
            r3 = this;
            boolean r0 = r3.B     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L26
            com.beizi.ad.internal.view.CustomRoundImageView r0 = r3.r     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L26
            java.lang.String r0 = r3.M     // Catch: java.lang.Exception -> L26
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L11
            goto L26
        L11:
            com.beizi.ad.internal.view.CustomRoundImageView r0 = r3.r     // Catch: java.lang.Exception -> L26
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L26
            r0 = 0
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.a(r0)     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = r3.M     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$12 r2 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$12     // Catch: java.lang.Exception -> L26
            r2.<init>(r3)     // Catch: java.lang.Exception -> L26
            r0.a(r1, r2)     // Catch: java.lang.Exception -> L26
        L26:
            return
    }

    static /* synthetic */ void h(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            r0.u()
            return
    }

    private void i() {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.O     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L5
            goto L26
        L5:
            com.beizi.fusion.model.AdSpacesBean$ComplainBean r0 = r0.getComplain()     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto Lc
            goto L26
        Lc:
            int r0 = r0.getOpen()     // Catch: java.lang.Exception -> L26
            r1 = 1
            if (r0 == r1) goto L14
            goto L26
        L14:
            android.widget.TextView r0 = r2.f6561f     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L26
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L26
            android.widget.TextView r0 = r2.f6561f     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$13 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$13     // Catch: java.lang.Exception -> L26
            r1.<init>(r2)     // Catch: java.lang.Exception -> L26
            r0.setOnClickListener(r1)     // Catch: java.lang.Exception -> L26
        L26:
            return
    }

    static /* synthetic */ void i(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            r0.r()
            return
    }

    private void j() {
            r2 = this;
            r2.A()     // Catch: java.lang.Exception -> L17
            com.beizi.ad.internal.view.a.a$a r0 = new com.beizi.ad.internal.view.a.a$a     // Catch: java.lang.Exception -> L17
            r0.<init>(r2)     // Catch: java.lang.Exception -> L17
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$14 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$14     // Catch: java.lang.Exception -> L17
            r1.<init>(r2)     // Catch: java.lang.Exception -> L17
            r0.a(r1)     // Catch: java.lang.Exception -> L17
            com.beizi.ad.internal.view.a.a r0 = r0.a()     // Catch: java.lang.Exception -> L17
            r0.show()     // Catch: java.lang.Exception -> L17
        L17:
            return
    }

    static /* synthetic */ void j(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            r0.g()
            return
    }

    private void k() {
            r4 = this;
            com.beizi.ad.internal.f.c r0 = r4.f6557b     // Catch: java.lang.Exception -> L67
            if (r0 != 0) goto L5
            goto L67
        L5:
            java.lang.String r0 = r4.J     // Catch: java.lang.Exception -> L67
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto L1e
            android.view.View r0 = r4.x     // Catch: java.lang.Exception -> L67
            r1 = 8
            if (r0 == 0) goto L16
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L67
        L16:
            com.beizi.ad.internal.view.CustomRoundImageView r0 = r4.s     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto L67
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L67
            return
        L1e:
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = com.beizi.ad.internal.h.u.a(r4, r0)     // Catch: java.lang.Exception -> L67
            com.beizi.ad.internal.view.CustomRoundImageView r1 = r4.s     // Catch: java.lang.Exception -> L67
            r2 = 0
            if (r1 == 0) goto L3f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L67
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Exception -> L67
            int r3 = r0 * 2
            r1.width = r3     // Catch: java.lang.Exception -> L67
            r1.height = r3     // Catch: java.lang.Exception -> L67
            com.beizi.ad.internal.view.CustomRoundImageView r3 = r4.s     // Catch: java.lang.Exception -> L67
            r3.setLayoutParams(r1)     // Catch: java.lang.Exception -> L67
            com.beizi.ad.internal.view.CustomRoundImageView r1 = r4.s     // Catch: java.lang.Exception -> L67
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> L67
        L3f:
            android.view.View r1 = r4.x     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto L58
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L67
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Exception -> L67
            r3 = -1
            r1.width = r3     // Catch: java.lang.Exception -> L67
            r1.height = r0     // Catch: java.lang.Exception -> L67
            android.view.View r0 = r4.x     // Catch: java.lang.Exception -> L67
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L67
            android.view.View r0 = r4.x     // Catch: java.lang.Exception -> L67
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L67
        L58:
            r0 = 0
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.a(r0)     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = r4.J     // Catch: java.lang.Exception -> L67
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$15 r2 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$15     // Catch: java.lang.Exception -> L67
            r2.<init>(r4)     // Catch: java.lang.Exception -> L67
            r0.a(r1, r2)     // Catch: java.lang.Exception -> L67
        L67:
            return
    }

    static /* synthetic */ void k(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            r0.j()
            return
    }

    static /* synthetic */ com.beizi.ad.internal.c.a l(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            com.beizi.ad.internal.c.a r0 = r0.a
            return r0
    }

    private void l() {
            r6 = this;
            java.lang.String r0 = r6.K     // Catch: java.lang.Exception -> L121
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L121
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L1a
            java.lang.String r0 = r6.L     // Catch: java.lang.Exception -> L121
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L121
            if (r0 != 0) goto L14
            goto L1a
        L14:
            android.widget.LinearLayout r0 = r6.f6560e     // Catch: java.lang.Exception -> L121
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L121
            goto L1f
        L1a:
            android.widget.LinearLayout r0 = r6.f6560e     // Catch: java.lang.Exception -> L121
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L121
        L1f:
            android.widget.TextView r0 = r6.f6564i     // Catch: java.lang.Exception -> L121
            r3 = 1095761920(0x41500000, float:13.0)
            r4 = 1092616192(0x41200000, float:10.0)
            if (r0 == 0) goto L6c
            java.lang.String r0 = r6.K     // Catch: java.lang.Exception -> L121
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L121
            if (r0 != 0) goto L67
            android.widget.TextView r0 = r6.f6564i     // Catch: java.lang.Exception -> L121
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L121
            android.widget.TextView r0 = r6.f6564i     // Catch: java.lang.Exception -> L121
            java.lang.String r5 = r6.K     // Catch: java.lang.Exception -> L121
            r0.setText(r5)     // Catch: java.lang.Exception -> L121
            android.widget.TextView r0 = r6.f6564i     // Catch: java.lang.Exception -> L121
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L121
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L121
            if (r0 == 0) goto L61
            java.lang.String r5 = r6.L     // Catch: java.lang.Exception -> L121
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L121
            if (r5 != 0) goto L55
            int r5 = com.beizi.ad.internal.h.u.a(r6, r4)     // Catch: java.lang.Exception -> L121
            r0.setMargins(r2, r5, r2, r2)     // Catch: java.lang.Exception -> L121
            goto L5c
        L55:
            int r5 = com.beizi.ad.internal.h.u.a(r6, r3)     // Catch: java.lang.Exception -> L121
            r0.setMargins(r2, r5, r2, r2)     // Catch: java.lang.Exception -> L121
        L5c:
            android.widget.TextView r5 = r6.f6564i     // Catch: java.lang.Exception -> L121
            r5.setLayoutParams(r0)     // Catch: java.lang.Exception -> L121
        L61:
            android.widget.TextView r0 = r6.f6564i     // Catch: java.lang.Exception -> L121
            r0.setPadding(r2, r2, r2, r2)     // Catch: java.lang.Exception -> L121
            goto L6c
        L67:
            android.widget.TextView r0 = r6.f6564i     // Catch: java.lang.Exception -> L121
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L121
        L6c:
            android.widget.TextView r0 = r6.f6565j     // Catch: java.lang.Exception -> L121
            if (r0 == 0) goto Lb7
            java.lang.String r0 = r6.L     // Catch: java.lang.Exception -> L121
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L121
            if (r0 != 0) goto Lb2
            android.widget.TextView r0 = r6.f6565j     // Catch: java.lang.Exception -> L121
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L121
            android.widget.TextView r0 = r6.f6565j     // Catch: java.lang.Exception -> L121
            java.lang.String r5 = r6.L     // Catch: java.lang.Exception -> L121
            r0.setText(r5)     // Catch: java.lang.Exception -> L121
            android.widget.TextView r0 = r6.f6565j     // Catch: java.lang.Exception -> L121
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L121
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L121
            java.lang.String r5 = r6.K     // Catch: java.lang.Exception -> L121
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L121
            if (r5 != 0) goto L9e
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = com.beizi.ad.internal.h.u.a(r6, r3)     // Catch: java.lang.Exception -> L121
            r0.setMargins(r2, r3, r2, r2)     // Catch: java.lang.Exception -> L121
            goto La5
        L9e:
            int r3 = com.beizi.ad.internal.h.u.a(r6, r3)     // Catch: java.lang.Exception -> L121
            r0.setMargins(r2, r3, r2, r2)     // Catch: java.lang.Exception -> L121
        La5:
            if (r0 == 0) goto Lac
            android.widget.TextView r3 = r6.f6565j     // Catch: java.lang.Exception -> L121
            r3.setLayoutParams(r0)     // Catch: java.lang.Exception -> L121
        Lac:
            android.widget.TextView r0 = r6.f6565j     // Catch: java.lang.Exception -> L121
            r0.setPadding(r2, r2, r2, r2)     // Catch: java.lang.Exception -> L121
            goto Lb7
        Lb2:
            android.widget.TextView r0 = r6.f6565j     // Catch: java.lang.Exception -> L121
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L121
        Lb7:
            boolean r0 = r6.z     // Catch: java.lang.Exception -> L121
            if (r0 == 0) goto Lc3
            android.view.View r0 = r6.y     // Catch: java.lang.Exception -> L121
            if (r0 == 0) goto L121
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L121
            return
        Lc3:
            android.view.View r0 = r6.y     // Catch: java.lang.Exception -> L121
            if (r0 == 0) goto L121
            java.lang.String r0 = r6.K     // Catch: java.lang.Exception -> L121
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L121
            if (r0 == 0) goto Le5
            java.lang.String r0 = r6.L     // Catch: java.lang.Exception -> L121
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L121
            if (r0 == 0) goto Le5
            java.lang.String r0 = r6.J     // Catch: java.lang.Exception -> L121
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L121
            if (r0 == 0) goto Le5
            android.view.View r0 = r6.y     // Catch: java.lang.Exception -> L121
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L121
            return
        Le5:
            android.view.View r0 = r6.y     // Catch: java.lang.Exception -> L121
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L121
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L121
            r1 = -2
            r0.width = r1     // Catch: java.lang.Exception -> L121
            java.lang.String r1 = r6.K     // Catch: java.lang.Exception -> L121
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L111
            java.lang.String r1 = r6.L     // Catch: java.lang.Exception -> L121
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L111
            java.lang.String r1 = r6.J     // Catch: java.lang.Exception -> L121
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L121
            if (r1 != 0) goto L111
            r1 = 1084227584(0x40a00000, float:5.0)
            int r1 = com.beizi.ad.internal.h.u.a(r6, r1)     // Catch: java.lang.Exception -> L121
            r0.height = r1     // Catch: java.lang.Exception -> L121
            goto L117
        L111:
            int r1 = com.beizi.ad.internal.h.u.a(r6, r4)     // Catch: java.lang.Exception -> L121
            r0.height = r1     // Catch: java.lang.Exception -> L121
        L117:
            android.view.View r1 = r6.y     // Catch: java.lang.Exception -> L121
            r1.setLayoutParams(r0)     // Catch: java.lang.Exception -> L121
            android.view.View r0 = r6.y     // Catch: java.lang.Exception -> L121
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L121
        L121:
            return
    }

    private void m() {
            r6 = this;
            boolean r0 = r6.B     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto Laf
            android.widget.VideoView r0 = r6.w     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto Laf
            java.lang.String r0 = r6.M     // Catch: java.lang.Exception -> Laf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L12
            goto Laf
        L12:
            android.widget.RelativeLayout r0 = r6.m     // Catch: java.lang.Exception -> Laf
            r1 = 1086324736(0x40c00000, float:6.0)
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L23
            java.lang.String r4 = "#000000"
            int r5 = com.beizi.ad.internal.h.u.a(r6, r1)     // Catch: java.lang.Exception -> Laf
            com.beizi.ad.internal.h.n.a(r0, r4, r3, r2, r5)     // Catch: java.lang.Exception -> Laf
        L23:
            android.widget.ImageView r0 = r6.t     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L3d
            r0.setVisibility(r3)     // Catch: java.lang.Exception -> Laf
            boolean r0 = r6.A     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L36
            android.widget.ImageView r0 = r6.t     // Catch: java.lang.Exception -> Laf
            int r4 = com.beizi.fusion.R.drawable.voice_on     // Catch: java.lang.Exception -> Laf
            r0.setImageResource(r4)     // Catch: java.lang.Exception -> Laf
            goto L3d
        L36:
            android.widget.ImageView r0 = r6.t     // Catch: java.lang.Exception -> Laf
            int r4 = com.beizi.fusion.R.drawable.voice_off     // Catch: java.lang.Exception -> Laf
            r0.setImageResource(r4)     // Catch: java.lang.Exception -> Laf
        L3d:
            android.widget.RelativeLayout r0 = r6.n     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L54
            java.lang.String r4 = "#66303030"
            int r1 = com.beizi.ad.internal.h.u.a(r6, r1)     // Catch: java.lang.Exception -> Laf
            com.beizi.ad.internal.h.n.a(r0, r4, r3, r2, r1)     // Catch: java.lang.Exception -> Laf
            android.widget.RelativeLayout r0 = r6.n     // Catch: java.lang.Exception -> Laf
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$16 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$16     // Catch: java.lang.Exception -> Laf
            r1.<init>(r6)     // Catch: java.lang.Exception -> Laf
            r0.setOnClickListener(r1)     // Catch: java.lang.Exception -> Laf
        L54:
            android.widget.ImageView r0 = r6.v     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L6f
            r0 = 1113063424(0x42580000, float:54.0)
            int r0 = com.beizi.ad.internal.h.u.a(r6, r0)     // Catch: java.lang.Exception -> Laf
            android.widget.ImageView r1 = r6.v     // Catch: java.lang.Exception -> Laf
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> Laf
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Exception -> Laf
            r1.width = r0     // Catch: java.lang.Exception -> Laf
            r1.height = r0     // Catch: java.lang.Exception -> Laf
            android.widget.ImageView r0 = r6.v     // Catch: java.lang.Exception -> Laf
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> Laf
        L6f:
            android.widget.VideoView r0 = r6.w     // Catch: java.lang.Exception -> Laf
            r0.setVisibility(r3)     // Catch: java.lang.Exception -> Laf
            com.beizi.ad.internal.h.t r0 = com.beizi.ad.internal.h.t.a()     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = r6.M     // Catch: java.lang.Exception -> Laf
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$17 r2 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$17     // Catch: java.lang.Exception -> Laf
            r2.<init>(r6)     // Catch: java.lang.Exception -> Laf
            r0.a(r6, r1, r2)     // Catch: java.lang.Exception -> Laf
            android.widget.VideoView r0 = r6.w     // Catch: java.lang.Exception -> Laf
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$18 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$18     // Catch: java.lang.Exception -> Laf
            r1.<init>(r6)     // Catch: java.lang.Exception -> Laf
            r0.setOnCompletionListener(r1)     // Catch: java.lang.Exception -> Laf
            android.widget.VideoView r0 = r6.w     // Catch: java.lang.Exception -> Laf
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$19 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$19     // Catch: java.lang.Exception -> Laf
            r1.<init>(r6)     // Catch: java.lang.Exception -> Laf
            r0.setOnPreparedListener(r1)     // Catch: java.lang.Exception -> Laf
            android.widget.VideoView r0 = r6.w     // Catch: java.lang.Exception -> Laf
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$2 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$2     // Catch: java.lang.Exception -> Laf
            r1.<init>(r6)     // Catch: java.lang.Exception -> Laf
            r0.setOnErrorListener(r1)     // Catch: java.lang.Exception -> Laf
            boolean r0 = r6.F     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto Lac
            int r0 = r6.G     // Catch: java.lang.Exception -> Laf
            if (r0 <= 0) goto Lac
            r6.g()     // Catch: java.lang.Exception -> Laf
            return
        Lac:
            r6.a()     // Catch: java.lang.Exception -> Laf
        Laf:
            return
    }

    static /* synthetic */ void m(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            r0.t()
            return
    }

    static /* synthetic */ com.beizi.ad.internal.view.CustomRoundImageView n(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            com.beizi.ad.internal.view.CustomRoundImageView r0 = r0.s
            return r0
    }

    private void n() {
            r9 = this;
            android.widget.VideoView r0 = r9.w     // Catch: java.lang.Exception -> L94
            if (r0 != 0) goto L6
            goto L94
        L6:
            android.widget.RelativeLayout r0 = r9.m     // Catch: java.lang.Exception -> L94
            int r0 = r0.getWidth()     // Catch: java.lang.Exception -> L94
            android.widget.RelativeLayout r1 = r9.m     // Catch: java.lang.Exception -> L94
            int r1 = r1.getHeight()     // Catch: java.lang.Exception -> L94
            android.widget.VideoView r2 = r9.w     // Catch: java.lang.Exception -> L94
            r3 = 0
            r2.measure(r3, r3)     // Catch: java.lang.Exception -> L94
            android.widget.VideoView r2 = r9.w     // Catch: java.lang.Exception -> L94
            int r2 = r2.getMeasuredWidth()     // Catch: java.lang.Exception -> L94
            android.widget.VideoView r4 = r9.w     // Catch: java.lang.Exception -> L94
            int r4 = r4.getMeasuredHeight()     // Catch: java.lang.Exception -> L94
            double r5 = (double) r2     // Catch: java.lang.Exception -> L94
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 * r7
            double r7 = (double) r4     // Catch: java.lang.Exception -> L94
            double r5 = r5 / r7
            float r5 = (float) r5     // Catch: java.lang.Exception -> L94
            android.widget.VideoView r6 = r9.w     // Catch: java.lang.Exception -> L94
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()     // Catch: java.lang.Exception -> L94
            r7 = -2
            r8 = -1
            if (r2 < r0) goto L39
        L36:
            r7 = -1
            r8 = -2
            goto L41
        L39:
            if (r4 <= r1) goto L3c
            goto L41
        L3c:
            int r0 = r0 - r2
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            goto L36
        L41:
            if (r6 == 0) goto L4c
            r6.width = r7     // Catch: java.lang.Exception -> L94
            r6.height = r8     // Catch: java.lang.Exception -> L94
            android.widget.VideoView r0 = r9.w     // Catch: java.lang.Exception -> L94
            r0.setLayoutParams(r6)     // Catch: java.lang.Exception -> L94
        L4c:
            boolean r0 = r9.z     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L54
            r0 = 1071896330(0x3fe3d70a, float:1.78)
            goto L57
        L54:
            r0 = 1057971241(0x3f0f5c29, float:0.56)
        L57:
            float r0 = r0 - r5
            float r1 = java.lang.Math.abs(r0)     // Catch: java.lang.Exception -> L94
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L94
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Exception -> L94
            double r0 = (double) r0     // Catch: java.lang.Exception -> L94
            r4 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L94
            android.widget.VideoView r0 = r9.w     // Catch: java.lang.Exception -> L94
            com.beizi.ad.a.a.f r1 = new com.beizi.ad.a.a.f     // Catch: java.lang.Exception -> L94
            r2 = 1086324736(0x40c00000, float:6.0)
            int r4 = com.beizi.ad.internal.h.u.a(r9, r2)     // Catch: java.lang.Exception -> L94
            float r4 = (float) r4     // Catch: java.lang.Exception -> L94
            r1.<init>(r4)     // Catch: java.lang.Exception -> L94
            r0.setOutlineProvider(r1)     // Catch: java.lang.Exception -> L94
            android.widget.VideoView r0 = r9.w     // Catch: java.lang.Exception -> L94
            r1 = 1
            r0.setClipToOutline(r1)     // Catch: java.lang.Exception -> L94
            android.widget.RelativeLayout r0 = r9.m     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L94
            java.lang.String r1 = "#FFFFFF"
            int r2 = com.beizi.ad.internal.h.u.a(r9, r2)     // Catch: java.lang.Exception -> L94
            r4 = 0
            com.beizi.ad.internal.h.n.a(r0, r1, r3, r4, r2)     // Catch: java.lang.Exception -> L94
        L94:
            return
    }

    static /* synthetic */ android.widget.RelativeLayout o(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            android.widget.RelativeLayout r0 = r0.n
            return r0
    }

    private void o() {
            r7 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> L65
            r0.<init>(r7)     // Catch: java.lang.Exception -> L65
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L65
            r2 = 17
            r3 = -2
            r1.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L65
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L65
            com.beizi.ad.internal.f.c r1 = r7.f6557b     // Catch: java.lang.Exception -> L65
            com.beizi.ad.internal.f.c$a r1 = r1.A()     // Catch: java.lang.Exception -> L65
            android.widget.FrameLayout r1 = com.beizi.ad.internal.h.u.a(r7, r1)     // Catch: java.lang.Exception -> L65
            r4 = 0
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L65
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L65
            r6 = 1099431936(0x41880000, float:17.0)
            r5.<init>(r3, r3, r6)     // Catch: java.lang.Exception -> L65
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L65
            com.beizi.ad.internal.f.c r1 = r7.f6557b     // Catch: java.lang.Exception -> L65
            com.beizi.ad.internal.f.c$a r1 = r1.z()     // Catch: java.lang.Exception -> L65
            android.widget.FrameLayout r1 = com.beizi.ad.internal.h.u.b(r7, r1)     // Catch: java.lang.Exception -> L65
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L65
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L65
            r5.<init>(r3, r3, r6)     // Catch: java.lang.Exception -> L65
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L65
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L65
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5     // Catch: java.lang.Exception -> L65
            r6 = 5
            r5.setMargins(r6, r4, r4, r4)     // Catch: java.lang.Exception -> L65
            r5.gravity = r2     // Catch: java.lang.Exception -> L65
            r1.setLayoutParams(r5)     // Catch: java.lang.Exception -> L65
            android.widget.FrameLayout r1 = r7.q     // Catch: java.lang.Exception -> L65
            if (r1 == 0) goto L65
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L65
            r2 = 85
            r1.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L65
            r2 = 1090519040(0x41000000, float:8.0)
            int r2 = com.beizi.ad.internal.h.u.a(r7, r2)     // Catch: java.lang.Exception -> L65
            r1.setMargins(r4, r4, r2, r2)     // Catch: java.lang.Exception -> L65
            android.widget.FrameLayout r2 = r7.q     // Catch: java.lang.Exception -> L65
            r2.addView(r0, r1)     // Catch: java.lang.Exception -> L65
        L65:
            return
    }

    static /* synthetic */ android.widget.VideoView p(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            android.widget.VideoView r0 = r0.w
            return r0
    }

    private void p() {
            r2 = this;
            android.widget.RelativeLayout r0 = r2.l
            if (r0 == 0) goto Lc
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$3 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$3
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        Lc:
            android.widget.ImageView r0 = r2.t
            if (r0 == 0) goto L18
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$4 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$4
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        L18:
            return
    }

    static /* synthetic */ android.media.MediaPlayer q(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            android.media.MediaPlayer r0 = r0.C
            return r0
    }

    private void q() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.H
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.H = r0
        La:
            com.beizi.ad.internal.c.a r0 = r1.a
            if (r0 == 0) goto L1d
            com.beizi.ad.internal.c r0 = r0.d()
            if (r0 == 0) goto L1d
            com.beizi.ad.internal.c.a r0 = r1.a
            com.beizi.ad.internal.c r0 = r0.d()
            r0.b()
        L1d:
            r1.finish()
            return
    }

    private void r() {
            r4 = this;
            com.beizi.ad.internal.c.a r0 = r4.a     // Catch: java.lang.Exception -> L27
            if (r0 != 0) goto L5
            goto L27
        L5:
            com.beizi.ad.internal.f.c r1 = r0.a     // Catch: java.lang.Exception -> L27
            if (r1 != 0) goto La
            goto L27
        La:
            com.beizi.ad.internal.c r0 = r0.d()     // Catch: java.lang.Exception -> L27
            if (r0 != 0) goto L11
            goto L27
        L11:
            com.beizi.ad.internal.c.a r2 = r4.a     // Catch: java.lang.Exception -> L27
            com.beizi.ad.internal.e r2 = r2.c()     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L1e
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L27
            goto L1f
        L1e:
            r2 = 0
        L1f:
            android.widget.LinearLayout r3 = r4.f6558c     // Catch: java.lang.Exception -> L27
            r1.a(r3, r2)     // Catch: java.lang.Exception -> L27
            r0.a()     // Catch: java.lang.Exception -> L27
        L27:
            return
    }

    static /* synthetic */ boolean r(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            boolean r0 = r0.A
            return r0
    }

    static /* synthetic */ int s(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            int r0 = r0.E
            return r0
    }

    private void s() {
            r8 = this;
            com.beizi.ad.internal.f.c r0 = r8.f6557b     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L6
            goto L83
        L6:
            int r0 = r0.I()     // Catch: java.lang.Exception -> L83
            r1 = 2
            if (r0 == r1) goto L10
            r1 = 5
            if (r0 != r1) goto L83
        L10:
            android.widget.TextView r0 = r8.f6563h     // Catch: java.lang.Exception -> L83
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L83
            com.beizi.ad.internal.f.c r0 = r8.f6557b     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = r0.B()     // Catch: java.lang.Exception -> L83
            com.beizi.ad.internal.f.c r0 = r8.f6557b     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = r0.D()     // Catch: java.lang.Exception -> L83
            com.beizi.ad.internal.f.c r1 = r8.f6557b     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = r1.C()     // Catch: java.lang.Exception -> L83
            com.beizi.ad.internal.f.c r2 = r8.f6557b     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = r2.F()     // Catch: java.lang.Exception -> L83
            com.beizi.ad.internal.f.c r4 = r8.f6557b     // Catch: java.lang.Exception -> L83
            java.lang.String r4 = r4.E()     // Catch: java.lang.Exception -> L83
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L83
            if (r5 != 0) goto L3c
            r5 = r2
            goto L3d
        L3c:
            r5 = r4
        L3d:
            com.beizi.ad.internal.f.c r2 = r8.f6557b     // Catch: java.lang.Exception -> L83
            java.lang.String r4 = r2.G()     // Catch: java.lang.Exception -> L83
            com.beizi.ad.internal.f.c r2 = r8.f6557b     // Catch: java.lang.Exception -> L83
            java.lang.String r6 = r2.H()     // Catch: java.lang.Exception -> L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L83
            r2.<init>()     // Catch: java.lang.Exception -> L83
            java.lang.String r7 = "应用名称："
            r2.append(r7)     // Catch: java.lang.Exception -> L83
            r2.append(r3)     // Catch: java.lang.Exception -> L83
            java.lang.String r7 = " | 开发者："
            r2.append(r7)     // Catch: java.lang.Exception -> L83
            r2.append(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = " | 应用版本："
            r2.append(r0)     // Catch: java.lang.Exception -> L83
            r2.append(r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = " | <u>权限详情</u> | <u>隐私协议</u> | <u>功能介绍</u>"
            r2.append(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L83
            android.widget.TextView r1 = r8.f6563h     // Catch: java.lang.Exception -> L83
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)     // Catch: java.lang.Exception -> L83
            r1.setText(r0)     // Catch: java.lang.Exception -> L83
            android.widget.TextView r0 = r8.f6563h     // Catch: java.lang.Exception -> L83
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$5 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$5     // Catch: java.lang.Exception -> L83
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L83
            r0.setOnClickListener(r1)     // Catch: java.lang.Exception -> L83
        L83:
            return
    }

    private void t() {
            r2 = this;
            android.widget.VideoView r0 = r2.w     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto Lb
            boolean r1 = r2.B     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto Lb
            r0.resume()     // Catch: java.lang.Exception -> L2b
        Lb:
            com.beizi.ad.a.a.e r0 = r2.Q     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L12
            r0.a()     // Catch: java.lang.Exception -> L2b
        L12:
            com.beizi.ad.a.a.a r0 = r2.S     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L19
            r0.a()     // Catch: java.lang.Exception -> L2b
        L19:
            boolean r0 = r2.I     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto L28
            boolean r0 = r2.F     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L28
            int r0 = r2.G     // Catch: java.lang.Exception -> L2b
            if (r0 <= 0) goto L28
            r2.g()     // Catch: java.lang.Exception -> L2b
        L28:
            r0 = 0
            r2.I = r0     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    static /* synthetic */ boolean t(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            boolean r0 = r0.U
            return r0
    }

    private void u() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.O     // Catch: java.lang.Exception -> L14
            if (r0 != 0) goto L5
            goto L14
        L5:
            r1.z()     // Catch: java.lang.Exception -> L14
            r1.v()     // Catch: java.lang.Exception -> L14
            r1.w()     // Catch: java.lang.Exception -> L14
            r1.x()     // Catch: java.lang.Exception -> L14
            r1.y()     // Catch: java.lang.Exception -> L14
        L14:
            return
    }

    static /* synthetic */ void u(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            r0.n()
            return
    }

    static /* synthetic */ android.widget.ImageView v(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            android.widget.ImageView r0 = r0.t
            return r0
    }

    private void v() {
            r4 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.O     // Catch: java.lang.Exception -> L48
            if (r0 != 0) goto L5
            goto L48
        L5:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r0 = r0.getRegionalClickView()     // Catch: java.lang.Exception -> L48
            if (r0 != 0) goto L24
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r0 = new com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean     // Catch: java.lang.Exception -> L48
            r0.<init>()     // Catch: java.lang.Exception -> L48
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.setBackgroundAlpha(r1)     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "#3976FF"
            r0.setBackgroundColor(r1)     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "点击跳转网页或第三方应用"
            r0.setTitle(r1)     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "#FFFFFF"
            r0.setTitleColor(r1)     // Catch: java.lang.Exception -> L48
        L24:
            com.beizi.ad.a.a.c r1 = new com.beizi.ad.a.a.c     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = r4.N     // Catch: java.lang.Exception -> L48
            boolean r3 = r4.X     // Catch: java.lang.Exception -> L48
            r1.<init>(r4, r0, r2, r3)     // Catch: java.lang.Exception -> L48
            r4.P = r1     // Catch: java.lang.Exception -> L48
            boolean r0 = r4.z     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L39
            android.widget.RelativeLayout r0 = r4.p     // Catch: java.lang.Exception -> L48
            r1.a(r0)     // Catch: java.lang.Exception -> L48
            goto L3e
        L39:
            android.widget.RelativeLayout r0 = r4.o     // Catch: java.lang.Exception -> L48
            r1.a(r0)     // Catch: java.lang.Exception -> L48
        L3e:
            com.beizi.ad.a.a.c r0 = r4.P     // Catch: java.lang.Exception -> L48
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$6 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$6     // Catch: java.lang.Exception -> L48
            r1.<init>(r4)     // Catch: java.lang.Exception -> L48
            r0.a(r1)     // Catch: java.lang.Exception -> L48
        L48:
            return
    }

    static /* synthetic */ com.beizi.ad.a.a.b w(com.beizi.ad.internal.activity.BeiZiInterstitialActivity r0) {
            com.beizi.ad.a.a.b r0 = r0.T
            return r0
    }

    private void w() {
            r4 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.O     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L5
            goto L41
        L5:
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> L41
            boolean r0 = r0.n()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L10
            goto L41
        L10:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.O     // Catch: java.lang.Exception -> L41
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r0.getShakeView()     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L19
            goto L41
        L19:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = r4.O     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r1.getSpaceId()     // Catch: java.lang.Exception -> L41
            com.beizi.ad.a.a.e r2 = new com.beizi.ad.a.a.e     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r4.N     // Catch: java.lang.Exception -> L41
            r2.<init>(r4, r0, r1, r3)     // Catch: java.lang.Exception -> L41
            r4.Q = r2     // Catch: java.lang.Exception -> L41
            boolean r0 = r4.z     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L32
            android.widget.RelativeLayout r0 = r4.p     // Catch: java.lang.Exception -> L41
            r2.a(r0)     // Catch: java.lang.Exception -> L41
            goto L37
        L32:
            android.widget.RelativeLayout r0 = r4.o     // Catch: java.lang.Exception -> L41
            r2.a(r0)     // Catch: java.lang.Exception -> L41
        L37:
            com.beizi.ad.a.a.e r0 = r4.Q     // Catch: java.lang.Exception -> L41
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$7 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$7     // Catch: java.lang.Exception -> L41
            r1.<init>(r4)     // Catch: java.lang.Exception -> L41
            r0.a(r1)     // Catch: java.lang.Exception -> L41
        L41:
            return
    }

    private void x() {
            r4 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.O     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L5
            goto L36
        L5:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = r0.getScrollClick()     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto Lc
            goto L36
        Lc:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = r4.O     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = r1.getSpaceId()     // Catch: java.lang.Exception -> L36
            com.beizi.ad.a.a.d r2 = new com.beizi.ad.a.a.d     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = r4.N     // Catch: java.lang.Exception -> L36
            r2.<init>(r4, r0, r1, r3)     // Catch: java.lang.Exception -> L36
            r4.R = r2     // Catch: java.lang.Exception -> L36
            boolean r0 = r4.z     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L25
            android.widget.RelativeLayout r0 = r4.p     // Catch: java.lang.Exception -> L36
            r2.a(r0)     // Catch: java.lang.Exception -> L36
            goto L2a
        L25:
            android.widget.RelativeLayout r0 = r4.o     // Catch: java.lang.Exception -> L36
            r2.a(r0)     // Catch: java.lang.Exception -> L36
        L2a:
            com.beizi.ad.a.a.d r0 = r4.R     // Catch: java.lang.Exception -> L36
            android.widget.RelativeLayout r1 = r4.f6566k     // Catch: java.lang.Exception -> L36
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$8 r2 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$8     // Catch: java.lang.Exception -> L36
            r2.<init>(r4)     // Catch: java.lang.Exception -> L36
            r0.a(r1, r2)     // Catch: java.lang.Exception -> L36
        L36:
            return
    }

    private void y() {
            r4 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.O     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L5
            goto L41
        L5:
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> L41
            boolean r0 = r0.n()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L10
            goto L41
        L10:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.O     // Catch: java.lang.Exception -> L41
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r0 = r0.getEulerAngleRule()     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L19
            goto L41
        L19:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = r4.O     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r1.getSpaceId()     // Catch: java.lang.Exception -> L41
            com.beizi.ad.a.a.a r2 = new com.beizi.ad.a.a.a     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r4.N     // Catch: java.lang.Exception -> L41
            r2.<init>(r4, r0, r1, r3)     // Catch: java.lang.Exception -> L41
            r4.S = r2     // Catch: java.lang.Exception -> L41
            boolean r0 = r4.z     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L32
            android.widget.RelativeLayout r0 = r4.p     // Catch: java.lang.Exception -> L41
            r2.a(r0)     // Catch: java.lang.Exception -> L41
            goto L37
        L32:
            android.widget.RelativeLayout r0 = r4.o     // Catch: java.lang.Exception -> L41
            r2.a(r0)     // Catch: java.lang.Exception -> L41
        L37:
            com.beizi.ad.a.a.a r0 = r4.S     // Catch: java.lang.Exception -> L41
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$9 r1 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$9     // Catch: java.lang.Exception -> L41
            r1.<init>(r4)     // Catch: java.lang.Exception -> L41
            r0.a(r1)     // Catch: java.lang.Exception -> L41
        L41:
            return
    }

    private void z() {
            r3 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r3.O     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto L5
            goto L1f
        L5:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$FullScreenClickBean r0 = r0.getFullScreenClick()     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto Lc
            goto L1f
        Lc:
            com.beizi.ad.a.a.b r1 = new com.beizi.ad.a.a.b     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = r3.N     // Catch: java.lang.Exception -> L1f
            r1.<init>(r3, r0, r2)     // Catch: java.lang.Exception -> L1f
            r3.T = r1     // Catch: java.lang.Exception -> L1f
            android.widget.RelativeLayout r0 = r3.f6566k     // Catch: java.lang.Exception -> L1f
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$10 r2 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$10     // Catch: java.lang.Exception -> L1f
            r2.<init>(r3)     // Catch: java.lang.Exception -> L1f
            r1.a(r0, r2)     // Catch: java.lang.Exception -> L1f
        L1f:
            return
    }

    public void a() {
            r7 = this;
            java.util.Timer r0 = r7.V     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer     // Catch: java.lang.Exception -> L21
            r0.<init>()     // Catch: java.lang.Exception -> L21
            r7.V = r0     // Catch: java.lang.Exception -> L21
        Lb:
            java.util.TimerTask r0 = r7.W     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto L16
            com.beizi.ad.internal.activity.BeiZiInterstitialActivity$11 r0 = new com.beizi.ad.internal.activity.BeiZiInterstitialActivity$11     // Catch: java.lang.Exception -> L21
            r0.<init>(r7)     // Catch: java.lang.Exception -> L21
            r7.W = r0     // Catch: java.lang.Exception -> L21
        L16:
            java.util.Timer r1 = r7.V     // Catch: java.lang.Exception -> L21
            java.util.TimerTask r2 = r7.W     // Catch: java.lang.Exception -> L21
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            r1.scheduleAtFixedRate(r2, r3, r5)     // Catch: java.lang.Exception -> L21
        L21:
            return
    }

    @Override // android.app.Activity
    protected void onCreate(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            int r1 = com.beizi.fusion.R.layout.activity_beizi_interstitial     // Catch: java.lang.Exception -> L29
            r0.setContentView(r1)     // Catch: java.lang.Exception -> L29
            r0.b()     // Catch: java.lang.Exception -> L29
            r0.c()     // Catch: java.lang.Exception -> L29
            r0.d()     // Catch: java.lang.Exception -> L29
            r0.i()     // Catch: java.lang.Exception -> L29
            r0.k()     // Catch: java.lang.Exception -> L29
            r0.h()     // Catch: java.lang.Exception -> L29
            r0.m()     // Catch: java.lang.Exception -> L29
            r0.f()     // Catch: java.lang.Exception -> L29
            r0.l()     // Catch: java.lang.Exception -> L29
            r0.p()     // Catch: java.lang.Exception -> L29
            r0.s()     // Catch: java.lang.Exception -> L29
        L29:
            return
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r2 = this;
            super.onDestroy()
            com.beizi.ad.a.a.c r0 = r2.P     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto La
            r0.b()     // Catch: java.lang.Exception -> L43
        La:
            r0 = 0
            r2.P = r0     // Catch: java.lang.Exception -> L43
            com.beizi.ad.a.a.e r1 = r2.Q     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L14
            r1.d()     // Catch: java.lang.Exception -> L43
        L14:
            r2.Q = r0     // Catch: java.lang.Exception -> L43
            com.beizi.ad.a.a.a r1 = r2.S     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L1d
            r1.d()     // Catch: java.lang.Exception -> L43
        L1d:
            r2.S = r0     // Catch: java.lang.Exception -> L43
            com.beizi.ad.a.a.d r1 = r2.R     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L26
            r1.a()     // Catch: java.lang.Exception -> L43
        L26:
            r2.R = r0     // Catch: java.lang.Exception -> L43
            com.beizi.ad.a.a.b r1 = r2.T     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L2f
            r1.b()     // Catch: java.lang.Exception -> L43
        L2f:
            r2.T = r0     // Catch: java.lang.Exception -> L43
            java.util.Timer r1 = r2.V     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L38
            r1.cancel()     // Catch: java.lang.Exception -> L43
        L38:
            r2.V = r0     // Catch: java.lang.Exception -> L43
            java.util.TimerTask r1 = r2.W     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L41
            r1.cancel()     // Catch: java.lang.Exception -> L43
        L41:
            r2.W = r0     // Catch: java.lang.Exception -> L43
        L43:
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 == r0) goto Lc
            r0 = 3
            if (r2 != r0) goto L7
            goto Lc
        L7:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
        Lc:
            r2 = 1
            return r2
    }

    @Override // android.app.Activity
    protected void onPause() {
            r0 = this;
            super.onPause()
            r0.A()
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r0 = this;
            super.onResume()
            r0.t()
            return
    }
}
