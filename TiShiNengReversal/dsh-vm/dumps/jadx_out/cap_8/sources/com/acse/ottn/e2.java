package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e2 {

    /* renamed from: c, reason: collision with root package name */
    public static android.view.View f2278c = null;

    /* renamed from: d, reason: collision with root package name */
    public static android.view.WindowManager f2279d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f2280e = "MainService";

    /* renamed from: f, reason: collision with root package name */
    public static com.acse.ottn.e2 f2281f;
    public android.view.WindowManager.LayoutParams a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.model.AccessiblityModel f2282b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e2 f2283b;

        public a(com.acse.ottn.e2 r1, android.app.Service r2) {
                r0 = this;
                r0.f2283b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.q2 r2 = com.acse.ottn.q2.b()
                java.lang.String r0 = "tb_lj_bannner_close"
                r2.a(r0)
                r2 = 0
                com.acse.ottn.l0.f2435f = r2
                com.acse.ottn.e2 r2 = r1.f2283b
                android.app.Service r0 = r1.a
                r2.b(r0)
                com.acse.ottn.d2 r2 = com.acse.ottn.d2.b()
                r2.a()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2284b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e2 f2285c;

        public b(com.acse.ottn.e2 r1, android.app.Service r2, com.acse.ottn.model.AccessiblityModel r3) {
                r0 = this;
                r0.f2285c = r1
                r0.a = r2
                r0.f2284b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                r4 = 0
                com.acse.ottn.l0.f2435f = r4
                com.acse.ottn.e2 r4 = r3.f2285c
                android.app.Service r0 = r3.a
                r4.b(r0)
                com.acse.ottn.q2 r4 = com.acse.ottn.q2.b()
                java.lang.String r0 = "tb_lj_bannner_click"
                r4.a(r0)
                com.acse.ottn.service.a r4 = com.acse.ottn.service.a.b()
                android.app.Service r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2284b
                r2 = 0
                r4.a(r0, r1, r2)
                com.acse.ottn.d2 r4 = com.acse.ottn.d2.b()
                r4.a()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements java.lang.Runnable {
        public final /* synthetic */ android.widget.RelativeLayout a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e2 f2286b;

        public c(com.acse.ottn.e2 r1, android.widget.RelativeLayout r2) {
                r0 = this;
                r0.f2286b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.acse.ottn.e2 r0 = r2.f2286b
                android.widget.RelativeLayout r1 = r2.a
                com.acse.ottn.e2.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ android.widget.RelativeLayout a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e2 f2287b;

        public d(com.acse.ottn.e2 r1, android.widget.RelativeLayout r2) {
                r0 = this;
                r0.f2287b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                android.widget.RelativeLayout r0 = r1.a
                r0.setScaleX(r2)
                android.widget.RelativeLayout r0 = r1.a
                r0.setScaleY(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ android.widget.RelativeLayout a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e2 f2288b;

        public e(com.acse.ottn.e2 r1, android.widget.RelativeLayout r2) {
                r0 = this;
                r0.f2288b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                java.lang.String r0 = "samon-->"
                java.lang.String r1 = "addUpdateListener"
                com.acse.ottn.h2.a(r0, r1)
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                android.widget.RelativeLayout r0 = r2.a
                r0.setTranslationX(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2289b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e2 f2290c;

        public f(com.acse.ottn.e2 r1, android.app.Service r2, java.lang.String r3) {
                r0 = this;
                r0.f2290c = r1
                r0.a = r2
                r0.f2289b = r3
                r0.<init>()
                return
        }

        public void a(java.lang.String r4) throws java.lang.Exception {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r4)
                java.lang.String r4 = "r"
                int r4 = r0.getInt(r4)
                r1 = 0
                r2 = 1
                if (r4 != r2) goto L2d
                java.lang.String r4 = "code"
                int r4 = r0.getInt(r4)
                if (r4 != r2) goto L23
                com.acse.ottn.l0.f2435f = r1
                com.acse.ottn.e2 r4 = r3.f2290c
                android.app.Service r0 = r3.a
                java.lang.String r1 = r3.f2289b
                com.acse.ottn.e2.a(r4, r0, r1)
                return
            L23:
                com.acse.ottn.l0.f2435f = r1
                com.acse.ottn.e2 r4 = r3.f2290c
                android.app.Service r0 = r3.a
                r4.b(r0)
                return
            L2d:
                com.acse.ottn.l0.f2435f = r1
                com.acse.ottn.e2 r4 = r3.f2290c
                android.app.Service r0 = r3.a
                r4.b(r0)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.String r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.e2 a;

        public g(com.acse.ottn.e2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class h implements com.acse.ottn.service.a.u0 {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e2 f2291b;

        public h(com.acse.ottn.e2 r1, android.app.Service r2) {
                r0 = this;
                r0.f2291b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.service.a.u0
        public void a() {
                r2 = this;
                r0 = 0
                com.acse.ottn.l0.f2435f = r0
                com.acse.ottn.e2 r0 = r2.f2291b
                android.app.Service r1 = r2.a
                r0.b(r1)
                return
        }

        @Override // com.acse.ottn.service.a.u0
        public void a(java.lang.String r2) {
                r1 = this;
                r2 = 0
                com.acse.ottn.l0.f2435f = r2
                com.acse.ottn.e2 r2 = r1.f2291b
                android.app.Service r0 = r1.a
                r2.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class i implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2292b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e2 f2293c;

        public i(com.acse.ottn.e2 r1, android.app.Service r2, java.lang.String r3) {
                r0 = this;
                r0.f2293c = r1
                r0.a = r2
                r0.f2292b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                r3 = 0
                com.acse.ottn.l0.f2435f = r3
                com.acse.ottn.q2 r3 = com.acse.ottn.q2.b()
                java.lang.String r0 = "tb_lj_bannner_setting"
                r3.a(r0)
                com.acse.ottn.e2 r3 = r2.f2293c
                android.app.Service r0 = r2.a
                java.lang.String r1 = r2.f2292b
                com.acse.ottn.e2.b(r3, r0, r1)
                return
        }
    }

    static {
            return
    }

    public e2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.e2 a() {
            com.acse.ottn.e2 r0 = com.acse.ottn.e2.f2281f
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.e2> r0 = com.acse.ottn.e2.class
            monitor-enter(r0)
            com.acse.ottn.e2 r1 = com.acse.ottn.e2.f2281f     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.e2 r1 = new com.acse.ottn.e2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.e2.f2281f = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.e2 r0 = com.acse.ottn.e2.f2281f
            return r0
    }

    public static /* synthetic */ void a(com.acse.ottn.e2 r0, android.app.Service r1, java.lang.String r2) {
            r0.b(r1, r2)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.e2 r0, android.widget.RelativeLayout r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ void b(com.acse.ottn.e2 r0, android.app.Service r1, java.lang.String r2) {
            r0.a(r1, r2)
            return
    }

    public void a(android.app.Service r3) {
            r2 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r2.a = r0
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a()
            boolean r0 = r0.a(r3)
            java.lang.String r1 = "window"
            if (r0 == 0) goto L39
            android.app.Application r3 = r3.getApplication()
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            com.acse.ottn.e2.f2279d = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r3 < r0) goto L2c
            android.view.WindowManager$LayoutParams r3 = r2.a
            r0 = 2038(0x7f6, float:2.856E-42)
            r3.type = r0
            goto L32
        L2c:
            android.view.WindowManager$LayoutParams r3 = r2.a
            r0 = 2002(0x7d2, float:2.805E-42)
            r3.type = r0
        L32:
            android.view.WindowManager$LayoutParams r3 = r2.a
            r0 = 8
            r3.flags = r0
            goto L4b
        L39:
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            com.acse.ottn.e2.f2279d = r3
            android.view.WindowManager$LayoutParams r3 = r2.a
            r0 = 2032(0x7f0, float:2.847E-42)
            r3.type = r0
            r0 = 800(0x320, float:1.121E-42)
            r3.flags = r0
        L4b:
            android.view.WindowManager$LayoutParams r3 = r2.a
            r0 = 1
            r3.format = r0
            r0 = 16973827(0x1030003, float:2.4060908E-38)
            r3.windowAnimations = r0
            r0 = 85
            r3.gravity = r0
            r0 = 80
            r3.x = r0
            r0 = 400(0x190, float:5.6E-43)
            r3.y = r0
            r0 = -2
            r3.width = r0
            return
    }

    public final void a(android.app.Service r2, int r3) {
            r1 = this;
            android.app.Application r2 = r2.getApplication()     // Catch: java.lang.Throwable -> L13
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)     // Catch: java.lang.Throwable -> L13
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r0)     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.e2.f2278c = r2     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r2.measure(r3, r3)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public final void a(android.app.Service r2, android.widget.ImageView r3, java.lang.String r4) {
            r1 = this;
            com.acse.ottn.e2$i r0 = new com.acse.ottn.e2$i
            r0.<init>(r1, r2, r4)
            r3.setOnClickListener(r0)
            return
    }

    public void a(android.app.Service r8, com.acse.ottn.model.AccessiblityModel r9) {
            r7 = this;
            int r0 = com.acse.ottn.R.layout.lj_first_background
            r7.a(r8, r0)
            android.view.WindowManager$LayoutParams r0 = r7.a
            r1 = 1120403456(0x42c80000, float:100.0)
            int r1 = com.acse.ottn.x0.a(r8, r1)
            r0.height = r1
            android.view.View r0 = com.acse.ottn.e2.f2278c
            int r1 = com.acse.ottn.R.id.firs_lj
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.View r1 = com.acse.ottn.e2.f2278c
            int r2 = com.acse.ottn.R.id.beijing
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            android.view.View r3 = com.acse.ottn.e2.f2278c
            int r4 = com.acse.ottn.R.id.iv_tb_big_recommend_icon
            android.view.View r3 = r3.findViewById(r4)
            com.acse.ottn.widget.RoundRectImageView r3 = (com.acse.ottn.widget.RoundRectImageView) r3
            android.view.View r4 = com.acse.ottn.e2.f2278c
            int r5 = com.acse.ottn.R.id.iv_didi_setting
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.view.View r5 = com.acse.ottn.e2.f2278c
            int r6 = com.acse.ottn.R.id.iv_setting2
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r9.getData()
            java.lang.String r6 = r6.getPackage_name()
            r7.a(r8, r5, r6)
            com.acse.ottn.e2$a r5 = new com.acse.ottn.e2$a
            r5.<init>(r7, r8)
            r4.setOnClickListener(r5)
            com.acse.ottn.e2$b r4 = new com.acse.ottn.e2$b
            r4.<init>(r7, r8, r9)
            r1.setOnClickListener(r4)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r9.getData()
            java.lang.String r1 = r1.getNew_time_remaining()
            r0.setText(r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r9.getData()
            java.lang.String r0 = r0.getSpop_pic()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L88
            com.bumptech.glide.i r8 = com.bumptech.glide.b.D(r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r9.getData()
            java.lang.String r0 = r0.getSpop_pic()
            com.bumptech.glide.h r8 = r8.M(r0)
            r8.m1(r3)
        L88:
            android.view.View r8 = com.acse.ottn.e2.f2278c
            android.view.View r8 = r8.findViewById(r2)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            android.view.WindowManager r0 = com.acse.ottn.e2.f2279d
            android.view.View r1 = com.acse.ottn.e2.f2278c
            android.view.WindowManager$LayoutParams r2 = r7.a
            r0.addView(r1, r2)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.acse.ottn.e2$c r1 = new com.acse.ottn.e2$c
            r1.<init>(r7, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r8 = r9.getData()
            int r8 = r8.getSecond_price()
            long r8 = (long) r8
            r0.postDelayed(r1, r8)
            return
    }

    public final void a(android.app.Service r5, java.lang.String r6) {
            r4 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = "limitType"
            java.lang.String r2 = "lj"
            r0.put(r1, r2)
            java.lang.String r1 = "is_snt"
            java.lang.String r2 = "0"
            r0.put(r1, r2)
            java.lang.String r1 = "package_name"
            r0.put(r1, r6)
            com.acse.ottn.g0 r1 = new com.acse.ottn.g0
            r1.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            java.lang.String r3 = ""
            okhttp3.RequestBody r0 = r2.a(r0, r3)
            rx.e r0 = r1.i(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.e2$f r1 = new com.acse.ottn.e2$f
            r1.<init>(r4, r5, r6)
            com.acse.ottn.e2$g r5 = new com.acse.ottn.e2$g
            r5.<init>(r4)
            r0.u5(r1, r5)
            return
    }

    public final void a(android.widget.RelativeLayout r6) {
            r5 = this;
            int r0 = r6.getWidth()
            float r0 = (float) r0
            r6.setPivotX(r0)
            int r0 = r6.getHeight()
            r1 = 2
            int r0 = r0 * 2
            int r0 = r0 / 3
            float r0 = (float) r0
            r6.setPivotY(r0)
            float[] r0 = new float[r1]
            r0 = {x0050: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.acse.ottn.e2$d r2 = new com.acse.ottn.e2$d
            r2.<init>(r5, r6)
            r0.addUpdateListener(r2)
            r2 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r2)
            float[] r1 = new float[r1]
            r1 = {x0058: FILL_ARRAY_DATA , data: [1120403456, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            com.acse.ottn.e2$e r4 = new com.acse.ottn.e2$e
            r4.<init>(r5, r6)
            r1.addUpdateListener(r4)
            r1.setDuration(r2)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.AnimatorSet$Builder r0 = r6.play(r0)
            r0.with(r1)
            r6.start()
            return
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.e2 r0 = com.acse.ottn.e2.f2281f
            return r0
    }

    public void b(android.app.Service r3) {
            r2 = this;
            android.view.View r0 = com.acse.ottn.e2.f2278c     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L23
        L9:
            android.view.WindowManager r0 = com.acse.ottn.e2.f2279d     // Catch: java.lang.Throwable -> L23
            android.view.View r1 = com.acse.ottn.e2.f2278c     // Catch: java.lang.Throwable -> L23
            r0.removeView(r1)     // Catch: java.lang.Throwable -> L23
            r0 = 0
            com.acse.ottn.e2.f2278c = r0     // Catch: java.lang.Throwable -> L23
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a()     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.a(r3)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            android.accessibilityservice.AccessibilityService r3 = (android.accessibilityservice.AccessibilityService) r3     // Catch: java.lang.Throwable -> L23
        L20:
            r3.stopSelf()     // Catch: java.lang.Throwable -> L23
        L23:
            return
    }

    public final void b(android.app.Service r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = com.acse.ottn.e2.f2280e
            java.lang.String r1 = "noShowCoupon "
            com.acse.ottn.h2.c(r0, r1)
            android.view.WindowManager r0 = com.acse.ottn.e2.f2279d     // Catch: java.lang.Throwable -> L36
            android.view.View r1 = com.acse.ottn.e2.f2278c     // Catch: java.lang.Throwable -> L36
            r0.removeView(r1)     // Catch: java.lang.Throwable -> L36
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L15
            return
        L15:
            int r0 = com.acse.ottn.R.layout.coupon_no_showbackground     // Catch: java.lang.Throwable -> L36
            r3.a(r4, r0)     // Catch: java.lang.Throwable -> L36
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()     // Catch: java.lang.Throwable -> L36
            android.view.View r1 = com.acse.ottn.e2.f2278c     // Catch: java.lang.Throwable -> L36
            com.acse.ottn.e2$h r2 = new com.acse.ottn.e2$h     // Catch: java.lang.Throwable -> L36
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L36
            r4 = 0
            r0.a(r1, r5, r4, r2)     // Catch: java.lang.Throwable -> L36
            android.view.WindowManager$LayoutParams r4 = r3.a     // Catch: java.lang.Throwable -> L36
            r5 = -2
            r4.height = r5     // Catch: java.lang.Throwable -> L36
            android.view.WindowManager r5 = com.acse.ottn.e2.f2279d     // Catch: java.lang.Throwable -> L36
            android.view.View r0 = com.acse.ottn.e2.f2278c     // Catch: java.lang.Throwable -> L36
            r5.addView(r0, r4)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r4 = move-exception
            java.lang.String r5 = com.acse.ottn.e2.f2280e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "noShowCoupon e="
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.acse.ottn.h2.c(r5, r4)
            return
    }
}
