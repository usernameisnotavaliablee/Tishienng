package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i0 {

    /* renamed from: g, reason: collision with root package name */
    public static android.view.View f2358g = null;

    /* renamed from: h, reason: collision with root package name */
    public static android.view.WindowManager f2359h = null;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f2360i = "MainService";

    /* renamed from: j, reason: collision with root package name */
    public static com.acse.ottn.i0 f2361j;

    /* renamed from: k, reason: collision with root package name */
    public static java.util.TimerTask f2362k;
    public android.view.WindowManager.LayoutParams a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.RelativeLayout f2363b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f2364c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f2365d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f2366e;

    /* renamed from: f, reason: collision with root package name */
    public com.acse.ottn.p0 f2367f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2368b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i0 f2369c;

        public a(com.acse.ottn.i0 r1, android.app.Service r2, com.acse.ottn.model.AccessiblityModel r3) {
                r0 = this;
                r0.f2369c = r1
                r0.a = r2
                r0.f2368b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                java.util.TimerTask r4 = com.acse.ottn.i0.f2362k
                if (r4 == 0) goto L7
                r4.cancel()
            L7:
                com.acse.ottn.i0 r4 = r3.f2369c
                android.app.Service r0 = r3.a
                r4.b(r0)
                com.acse.ottn.q2 r4 = com.acse.ottn.q2.b()
                java.lang.String r0 = "tb_lj_circle_click"
                r4.a(r0)
                com.acse.ottn.service.a r4 = com.acse.ottn.service.a.b()
                android.app.Service r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2368b
                r2 = 0
                r4.a(r0, r1, r2)
                com.acse.ottn.d2 r4 = com.acse.ottn.d2.b()
                r4.a()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i0 f2370b;

        public b(com.acse.ottn.i0 r1, android.app.Service r2) {
                r0 = this;
                r0.f2370b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.i0 r2 = r1.f2370b
                android.app.Service r0 = r1.a
                r2.b(r0)
                com.acse.ottn.q2 r2 = com.acse.ottn.q2.b()
                java.lang.String r0 = "tb_lj_circle_close"
                r2.a(r0)
                com.acse.ottn.d2 r2 = com.acse.ottn.d2.b()
                r2.a()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.p0 {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i0 f2371b;

        public c(com.acse.ottn.i0 r1, android.app.Service r2) {
                r0 = this;
                r0.f2371b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.p0
        public void a() {
                r2 = this;
                java.util.TimerTask r0 = com.acse.ottn.i0.f2362k
                if (r0 == 0) goto L7
                r0.cancel()
            L7:
                com.acse.ottn.i0 r0 = r2.f2371b
                android.app.Service r1 = r2.a
                r0.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2372b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i0 f2373c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.i0.d a;

            public a(com.acse.ottn.i0.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    boolean r0 = com.acse.ottn.l0.f2434e
                    if (r0 != 0) goto L1b
                    java.util.TimerTask r0 = com.acse.ottn.i0.f2362k
                    if (r0 == 0) goto Lb
                    r0.cancel()
                Lb:
                    com.acse.ottn.d2 r0 = com.acse.ottn.d2.b()
                    r0.a()
                    com.acse.ottn.i0$d r0 = r2.a
                    com.acse.ottn.i0 r1 = r0.f2373c
                    android.app.Service r0 = r0.a
                    r1.b(r0)
                L1b:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class b implements android.view.View.OnClickListener {
            public final /* synthetic */ com.acse.ottn.i0.d a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            public class a implements android.view.View.OnClickListener {
                public final /* synthetic */ com.acse.ottn.i0.d.b a;

                public a(com.acse.ottn.i0.d.b r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View r4) {
                        r3 = this;
                        java.util.TimerTask r4 = com.acse.ottn.i0.f2362k
                        if (r4 == 0) goto L7
                        r4.cancel()
                    L7:
                        com.acse.ottn.q2 r4 = com.acse.ottn.q2.b()
                        java.lang.String r0 = "tb_lj_circle_again"
                        r4.a(r0)
                        com.acse.ottn.i0$d$b r4 = r3.a
                        com.acse.ottn.i0$d r4 = r4.a
                        com.acse.ottn.i0 r0 = r4.f2373c
                        android.app.Service r4 = r4.a
                        r0.b(r4)
                        com.acse.ottn.i0$d$b r4 = r3.a
                        com.acse.ottn.i0$d r4 = r4.a
                        com.acse.ottn.model.AccessiblityModel r4 = r4.f2372b
                        if (r4 != 0) goto L24
                        return
                    L24:
                        com.acse.ottn.service.a r4 = com.acse.ottn.service.a.b()
                        com.acse.ottn.i0$d$b r0 = r3.a
                        com.acse.ottn.i0$d r0 = r0.a
                        android.app.Service r1 = r0.a
                        com.acse.ottn.model.AccessiblityModel r0 = r0.f2372b
                        r2 = 0
                        r4.a(r1, r0, r2)
                        com.acse.ottn.d2 r4 = com.acse.ottn.d2.b()
                        r4.a()
                        return
                }
            }

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.acse.ottn.i0$d$b$b, reason: collision with other inner class name */
            public class C0077b implements com.acse.ottn.n0.d {
                public final /* synthetic */ com.acse.ottn.i0.d.b a;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                /* renamed from: com.acse.ottn.i0$d$b$b$a */
                public class a implements java.lang.Runnable {
                    public final /* synthetic */ com.acse.ottn.i0.d.b.C0077b a;

                    public a(com.acse.ottn.i0.d.b.C0077b r1) {
                            r0 = this;
                            r0.a = r1
                            r0.<init>()
                            return
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                            r2 = this;
                            boolean r0 = com.acse.ottn.l0.f2434e
                            if (r0 != 0) goto L1f
                            java.util.TimerTask r0 = com.acse.ottn.i0.f2362k
                            if (r0 == 0) goto Lb
                            r0.cancel()
                        Lb:
                            com.acse.ottn.d2 r0 = com.acse.ottn.d2.b()
                            r0.a()
                            com.acse.ottn.i0$d$b$b r0 = r2.a
                            com.acse.ottn.i0$d$b r0 = r0.a
                            com.acse.ottn.i0$d r0 = r0.a
                            com.acse.ottn.i0 r1 = r0.f2373c
                            android.app.Service r0 = r0.a
                            r1.b(r0)
                        L1f:
                            return
                    }
                }

                public C0077b(com.acse.ottn.i0.d.b r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // com.acse.ottn.n0.d
                public void a() {
                        r2 = this;
                        com.acse.ottn.d2 r0 = com.acse.ottn.d2.b()
                        r0.a()
                        com.acse.ottn.i0$d$b r0 = r2.a
                        com.acse.ottn.i0$d r0 = r0.a
                        com.acse.ottn.i0 r1 = r0.f2373c
                        android.app.Service r0 = r0.a
                        r1.b(r0)
                        return
                }

                @Override // com.acse.ottn.n0.d
                public void a(long r3) {
                        r2 = this;
                        android.os.Handler r3 = new android.os.Handler
                        android.os.Looper r4 = android.os.Looper.getMainLooper()
                        r3.<init>(r4)
                        com.acse.ottn.i0$d$b$b$a r4 = new com.acse.ottn.i0$d$b$b$a
                        r4.<init>(r2)
                        r0 = 0
                        r3.postDelayed(r4, r0)
                        return
                }
            }

            public b(com.acse.ottn.i0.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.acse.ottn.q2 r4 = com.acse.ottn.q2.b()
                    java.lang.String r0 = "tb_lj_fan_click"
                    r4.a(r0)
                    com.acse.ottn.i0$d r4 = r3.a
                    com.acse.ottn.i0 r4 = r4.f2373c
                    android.widget.ImageView r4 = com.acse.ottn.i0.c(r4)
                    r0 = 8
                    r4.setVisibility(r0)
                    com.acse.ottn.i0$d r4 = r3.a
                    com.acse.ottn.i0 r4 = r4.f2373c
                    android.widget.TextView r4 = com.acse.ottn.i0.b(r4)
                    r0 = 0
                    r4.setVisibility(r0)
                    com.acse.ottn.i0$d r4 = r3.a
                    com.acse.ottn.i0 r4 = r4.f2373c
                    android.widget.ImageView r4 = com.acse.ottn.i0.a(r4)
                    r4.setVisibility(r0)
                    com.acse.ottn.i0$d r4 = r3.a
                    com.acse.ottn.i0 r4 = r4.f2373c
                    android.view.WindowManager$LayoutParams r4 = com.acse.ottn.i0.d(r4)
                    com.acse.ottn.i0$d r0 = r3.a
                    android.app.Service r0 = r0.a
                    r1 = 1121189888(0x42d40000, float:106.0)
                    int r0 = com.acse.ottn.x0.a(r0, r1)
                    r4.width = r0
                    com.acse.ottn.i0$d r4 = r3.a
                    com.acse.ottn.i0 r4 = r4.f2373c
                    android.view.WindowManager$LayoutParams r4 = com.acse.ottn.i0.d(r4)
                    com.acse.ottn.i0$d r0 = r3.a
                    android.app.Service r0 = r0.a
                    r1 = 1117782016(0x42a00000, float:80.0)
                    int r0 = com.acse.ottn.x0.a(r0, r1)
                    r4.height = r0
                    android.view.WindowManager r4 = com.acse.ottn.i0.c()
                    android.view.View r0 = com.acse.ottn.i0.b()
                    com.acse.ottn.i0$d r1 = r3.a
                    com.acse.ottn.i0 r1 = r1.f2373c
                    android.view.WindowManager$LayoutParams r1 = com.acse.ottn.i0.d(r1)
                    r4.updateViewLayout(r0, r1)
                    com.acse.ottn.i0$d r4 = r3.a
                    com.acse.ottn.i0 r4 = r4.f2373c
                    android.widget.ImageView r4 = com.acse.ottn.i0.a(r4)
                    com.acse.ottn.i0$d$b$a r0 = new com.acse.ottn.i0$d$b$a
                    r0.<init>(r3)
                    r4.setOnClickListener(r0)
                    com.acse.ottn.n0 r4 = com.acse.ottn.n0.a()
                    com.acse.ottn.i0$d r0 = r3.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.f2372b
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    int r0 = r0.getTime_four()
                    com.acse.ottn.i0$d$b$b r1 = new com.acse.ottn.i0$d$b$b
                    r1.<init>(r3)
                    r2 = 500(0x1f4, float:7.0E-43)
                    java.util.TimerTask r4 = r4.b(r0, r2, r1)
                    com.acse.ottn.i0.f2362k = r4
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class c implements com.acse.ottn.n0.d {
            public final /* synthetic */ com.acse.ottn.i0.d a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            public class a implements java.lang.Runnable {
                public final /* synthetic */ com.acse.ottn.i0.d.c a;

                public a(com.acse.ottn.i0.d.c r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r2 = this;
                        boolean r0 = com.acse.ottn.l0.f2434e
                        if (r0 != 0) goto L1d
                        java.util.TimerTask r0 = com.acse.ottn.i0.f2362k
                        if (r0 == 0) goto Lb
                        r0.cancel()
                    Lb:
                        com.acse.ottn.d2 r0 = com.acse.ottn.d2.b()
                        r0.a()
                        com.acse.ottn.i0$d$c r0 = r2.a
                        com.acse.ottn.i0$d r0 = r0.a
                        com.acse.ottn.i0 r1 = r0.f2373c
                        android.app.Service r0 = r0.a
                        r1.b(r0)
                    L1d:
                        return
                }
            }

            public c(com.acse.ottn.i0.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.acse.ottn.n0.d
            public void a() {
                    r2 = this;
                    com.acse.ottn.d2 r0 = com.acse.ottn.d2.b()
                    r0.a()
                    com.acse.ottn.i0$d r0 = r2.a
                    com.acse.ottn.i0 r1 = r0.f2373c
                    android.app.Service r0 = r0.a
                    r1.b(r0)
                    return
            }

            @Override // com.acse.ottn.n0.d
            public void a(long r3) {
                    r2 = this;
                    android.os.Handler r3 = new android.os.Handler
                    android.os.Looper r4 = android.os.Looper.getMainLooper()
                    r3.<init>(r4)
                    com.acse.ottn.i0$d$c$a r4 = new com.acse.ottn.i0$d$c$a
                    r4.<init>(r2)
                    r0 = 0
                    r3.postDelayed(r4, r0)
                    return
            }
        }

        public d(com.acse.ottn.i0 r1, android.app.Service r2, com.acse.ottn.model.AccessiblityModel r3) {
                r0 = this;
                r0.f2373c = r1
                r0.a = r2
                r0.f2372b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r4 = this;
                java.lang.String r0 = com.acse.ottn.i0.a()     // Catch: java.lang.Throwable -> L81
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0 r0 = r4.f2373c     // Catch: java.lang.Throwable -> L81
                android.widget.ImageView r0 = com.acse.ottn.i0.a(r0)     // Catch: java.lang.Throwable -> L81
                r1 = 8
                r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0 r0 = r4.f2373c     // Catch: java.lang.Throwable -> L81
                android.widget.TextView r0 = com.acse.ottn.i0.b(r0)     // Catch: java.lang.Throwable -> L81
                r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0 r0 = r4.f2373c     // Catch: java.lang.Throwable -> L81
                android.widget.ImageView r0 = com.acse.ottn.i0.c(r0)     // Catch: java.lang.Throwable -> L81
                r1 = 0
                r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0 r0 = r4.f2373c     // Catch: java.lang.Throwable -> L81
                android.view.WindowManager$LayoutParams r0 = com.acse.ottn.i0.d(r0)     // Catch: java.lang.Throwable -> L81
                android.app.Service r1 = r4.a     // Catch: java.lang.Throwable -> L81
                r2 = 1114374144(0x426c0000, float:59.0)
                int r1 = com.acse.ottn.x0.a(r1, r2)     // Catch: java.lang.Throwable -> L81
                r0.width = r1     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0 r0 = r4.f2373c     // Catch: java.lang.Throwable -> L81
                android.view.WindowManager$LayoutParams r0 = com.acse.ottn.i0.d(r0)     // Catch: java.lang.Throwable -> L81
                android.app.Service r1 = r4.a     // Catch: java.lang.Throwable -> L81
                r2 = 1116602368(0x428e0000, float:71.0)
                int r1 = com.acse.ottn.x0.a(r1, r2)     // Catch: java.lang.Throwable -> L81
                r0.height = r1     // Catch: java.lang.Throwable -> L81
                android.view.WindowManager r0 = com.acse.ottn.i0.c()     // Catch: java.lang.Throwable -> L81
                android.view.View r1 = com.acse.ottn.i0.b()     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0 r2 = r4.f2373c     // Catch: java.lang.Throwable -> L81
                android.view.WindowManager$LayoutParams r2 = com.acse.ottn.i0.d(r2)     // Catch: java.lang.Throwable -> L81
                r0.updateViewLayout(r1, r2)     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0 r0 = r4.f2373c     // Catch: java.lang.Throwable -> L81
                android.widget.ImageView r0 = com.acse.ottn.i0.c(r0)     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0$d$b r1 = new com.acse.ottn.i0$d$b     // Catch: java.lang.Throwable -> L81
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L81
                r0.setOnClickListener(r1)     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.model.AccessiblityModel r1 = r4.f2372b     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()     // Catch: java.lang.Throwable -> L81
                int r1 = r1.getCoupon_detail_url()     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0$d$c r2 = new com.acse.ottn.i0$d$c     // Catch: java.lang.Throwable -> L81
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L81
                r3 = 500(0x1f4, float:7.0E-43)
                java.util.TimerTask r0 = r0.b(r1, r3, r2)     // Catch: java.lang.Throwable -> L81
                com.acse.ottn.i0.f2362k = r0     // Catch: java.lang.Throwable -> L81
            L81:
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r3) {
                r2 = this;
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r4 = android.os.Looper.getMainLooper()
                r3.<init>(r4)
                com.acse.ottn.i0$d$a r4 = new com.acse.ottn.i0$d$a
                r4.<init>(r2)
                r0 = 0
                r3.postDelayed(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.acse.ottn.p0 {
        public final /* synthetic */ com.acse.ottn.i0 a;

        public e(com.acse.ottn.i0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.p0
        public void a() {
                r0 = this;
                return
        }
    }

    static {
            return
    }

    public i0() {
            r1 = this;
            r1.<init>()
            com.acse.ottn.i0$e r0 = new com.acse.ottn.i0$e
            r0.<init>(r1)
            r1.f2367f = r0
            return
    }

    public static /* synthetic */ android.widget.ImageView a(com.acse.ottn.i0 r0) {
            android.widget.ImageView r0 = r0.f2365d
            return r0
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.i0.f2360i
            return r0
    }

    public static /* synthetic */ android.view.View b() {
            android.view.View r0 = com.acse.ottn.i0.f2358g
            return r0
    }

    public static /* synthetic */ android.widget.TextView b(com.acse.ottn.i0 r0) {
            android.widget.TextView r0 = r0.f2366e
            return r0
    }

    public static /* synthetic */ android.view.WindowManager c() {
            android.view.WindowManager r0 = com.acse.ottn.i0.f2359h
            return r0
    }

    public static /* synthetic */ android.widget.ImageView c(com.acse.ottn.i0 r0) {
            android.widget.ImageView r0 = r0.f2364c
            return r0
    }

    public static /* synthetic */ android.view.WindowManager.LayoutParams d(com.acse.ottn.i0 r0) {
            android.view.WindowManager$LayoutParams r0 = r0.a
            return r0
    }

    public static com.acse.ottn.i0 d() {
            com.acse.ottn.i0 r0 = com.acse.ottn.i0.f2361j
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.i0> r0 = com.acse.ottn.i0.class
            monitor-enter(r0)
            com.acse.ottn.i0 r1 = com.acse.ottn.i0.f2361j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.i0 r1 = new com.acse.ottn.i0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.i0.f2361j = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.i0 r0 = com.acse.ottn.i0.f2361j
            return r0
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void a(android.app.Service r3) {
            r2 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r2.a = r0
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a()
            boolean r0 = r0.a(r3)
            java.lang.String r1 = "window"
            if (r0 == 0) goto L39
            android.app.Application r0 = r3.getApplication()
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            com.acse.ottn.i0.f2359h = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2c
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2038(0x7f6, float:2.856E-42)
            r0.type = r1
            goto L32
        L2c:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2002(0x7d2, float:2.805E-42)
            r0.type = r1
        L32:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 8
            r0.flags = r1
            goto L4b
        L39:
            java.lang.Object r0 = r3.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            com.acse.ottn.i0.f2359h = r0
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2032(0x7f0, float:2.847E-42)
            r0.type = r1
            r1 = 800(0x320, float:1.121E-42)
            r0.flags = r1
        L4b:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 1
            r0.format = r1
            r1 = 16973827(0x1030003, float:2.4060908E-38)
            r0.windowAnimations = r1
            r1 = 85
            r0.gravity = r1
            r1 = 0
            r0.x = r1
            r1 = 700(0x2bc, float:9.81E-43)
            r0.y = r1
            r1 = 1121189888(0x42d40000, float:106.0)
            int r1 = com.acse.ottn.x0.a(r3, r1)
            r0.width = r1
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 1117782016(0x42a00000, float:80.0)
            int r3 = com.acse.ottn.x0.a(r3, r1)
            r0.height = r3
            return
    }

    public final void a(android.app.Service r2, int r3) {
            r1 = this;
            android.app.Application r2 = r2.getApplication()     // Catch: java.lang.Throwable -> L13
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)     // Catch: java.lang.Throwable -> L13
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r0)     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.i0.f2358g = r2     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r2.measure(r3, r3)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public final void a(android.app.Service r4, com.acse.ottn.model.AccessiblityModel r5) {
            r3 = this;
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()
            int r1 = r1.getThird_price()
            com.acse.ottn.i0$d r2 = new com.acse.ottn.i0$d
            r2.<init>(r3, r4, r5)
            r4 = 500(0x1f4, float:7.0E-43)
            java.util.TimerTask r4 = r0.b(r1, r4, r2)
            com.acse.ottn.i0.f2362k = r4
            return
    }

    public void b(android.app.Service r3) {
            r2 = this;
            android.view.View r0 = com.acse.ottn.i0.f2358g     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L20
        L9:
            android.view.WindowManager r0 = com.acse.ottn.i0.f2359h     // Catch: java.lang.Throwable -> L20
            android.view.View r1 = com.acse.ottn.i0.f2358g     // Catch: java.lang.Throwable -> L20
            r0.removeView(r1)     // Catch: java.lang.Throwable -> L20
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a()     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.a(r3)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            android.accessibilityservice.AccessibilityService r3 = (android.accessibilityservice.AccessibilityService) r3     // Catch: java.lang.Throwable -> L20
        L1d:
            r3.stopSelf()     // Catch: java.lang.Throwable -> L20
        L20:
            return
    }

    public void b(android.app.Service r4, com.acse.ottn.model.AccessiblityModel r5) {
            r3 = this;
            int r0 = com.acse.ottn.R.layout.circle_lj_background
            r3.a(r4, r0)
            android.view.View r0 = com.acse.ottn.i0.f2358g
            int r1 = com.acse.ottn.R.id.treasure_box
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r3.f2363b = r0
            android.view.View r0 = com.acse.ottn.i0.f2358g
            int r1 = com.acse.ottn.R.id.tv_context
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f2366e = r0
            android.view.View r0 = com.acse.ottn.i0.f2358g
            int r1 = com.acse.ottn.R.id.tv_fan
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f2364c = r0
            android.view.View r0 = com.acse.ottn.i0.f2358g
            int r1 = com.acse.ottn.R.id.image
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f2365d = r0
            android.widget.TextView r0 = r3.f2366e
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()
            java.lang.String r1 = r1.getSpop_title()
            r0.setText(r1)
            android.widget.ImageView r0 = r3.f2365d
            com.acse.ottn.i0$a r1 = new com.acse.ottn.i0$a
            r1.<init>(r3, r4, r5)
            r0.setOnClickListener(r1)
            android.view.View r0 = com.acse.ottn.i0.f2358g
            int r1 = com.acse.ottn.R.id.iv_didi_setting
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.acse.ottn.i0$b r1 = new com.acse.ottn.i0$b
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.WindowManager r0 = com.acse.ottn.i0.f2359h     // Catch: java.lang.Throwable -> Lab
            android.view.View r1 = com.acse.ottn.i0.f2358g     // Catch: java.lang.Throwable -> Lab
            android.view.WindowManager$LayoutParams r2 = r3.a     // Catch: java.lang.Throwable -> Lab
            r0.addView(r1, r2)     // Catch: java.lang.Throwable -> Lab
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()     // Catch: java.lang.Throwable -> Lab
            int r0 = r0.getThird_price()     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto La0
            android.widget.ImageView r0 = r3.f2365d     // Catch: java.lang.Throwable -> Lab
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> Lab
            android.widget.TextView r0 = r3.f2366e     // Catch: java.lang.Throwable -> Lab
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> Lab
            android.widget.ImageView r0 = r3.f2364c     // Catch: java.lang.Throwable -> Lab
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> Lab
            android.view.WindowManager$LayoutParams r0 = r3.a     // Catch: java.lang.Throwable -> Lab
            r1 = 1114374144(0x426c0000, float:59.0)
            int r1 = com.acse.ottn.x0.a(r4, r1)     // Catch: java.lang.Throwable -> Lab
            r0.width = r1     // Catch: java.lang.Throwable -> Lab
            android.view.WindowManager$LayoutParams r0 = r3.a     // Catch: java.lang.Throwable -> Lab
            r1 = 1116602368(0x428e0000, float:71.0)
            int r1 = com.acse.ottn.x0.a(r4, r1)     // Catch: java.lang.Throwable -> Lab
            r0.height = r1     // Catch: java.lang.Throwable -> Lab
            android.view.WindowManager r0 = com.acse.ottn.i0.f2359h     // Catch: java.lang.Throwable -> Lab
            android.view.View r1 = com.acse.ottn.i0.f2358g     // Catch: java.lang.Throwable -> Lab
            android.view.WindowManager$LayoutParams r2 = r3.a     // Catch: java.lang.Throwable -> Lab
            r0.updateViewLayout(r1, r2)     // Catch: java.lang.Throwable -> Lab
        La0:
            r3.a(r4, r5)     // Catch: java.lang.Throwable -> Lab
            com.acse.ottn.i0$c r5 = new com.acse.ottn.i0$c     // Catch: java.lang.Throwable -> Lab
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lab
            com.acse.ottn.l0.a(r5)     // Catch: java.lang.Throwable -> Lab
        Lab:
            return
    }

    public final java.lang.Object e() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.i0 r0 = com.acse.ottn.i0.f2361j
            return r0
    }
}
