package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d implements com.acse.ottn.service.a.u0 {
    public static com.acse.ottn.d v = null;
    public static java.util.TimerTask w = null;
    public static java.util.TimerTask x = null;
    public static com.acse.ottn.l2 y = null;
    public static java.lang.String z = "acse_ShopHelperService";
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2214b;

    /* renamed from: c, reason: collision with root package name */
    public int f2215c;

    /* renamed from: d, reason: collision with root package name */
    public int f2216d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f2217e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f2218f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List<java.lang.String> f2219g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List<java.lang.String> f2220h;

    /* renamed from: i, reason: collision with root package name */
    public int f2221i;

    /* renamed from: j, reason: collision with root package name */
    public android.accessibilityservice.AccessibilityService f2222j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2223k;
    public android.content.Intent l;
    public java.lang.String m;
    public java.lang.String n;
    public boolean o;
    public java.lang.String p;
    public java.lang.String q;
    public android.os.Handler r;
    public boolean s;
    public android.view.accessibility.AccessibilityNodeInfo t;
    public java.util.List u;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {
        public final /* synthetic */ com.acse.ottn.d a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.d$a$a, reason: collision with other inner class name */
        public class RunnableC0068a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.d.a a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.acse.ottn.d$a$a$a, reason: collision with other inner class name */
            public class C0069a implements com.acse.ottn.q2.c {
                public final /* synthetic */ com.acse.ottn.d.a.RunnableC0068a a;

                public C0069a(com.acse.ottn.d.a.RunnableC0068a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // com.acse.ottn.q2.c
                public void a() {
                        r1 = this;
                        com.acse.ottn.e r0 = com.acse.ottn.e.c()
                        r0.b()
                        return
                }
            }

            public RunnableC0068a(com.acse.ottn.d.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r6 = this;
                    com.acse.ottn.s0 r0 = com.acse.ottn.s0.d()
                    com.acse.ottn.s0 r1 = com.acse.ottn.s0.d()
                    java.lang.String r1 = r1.a()
                    long r0 = r0.c(r1)
                    com.acse.ottn.util.HelpShopAppUtil r2 = com.acse.ottn.util.HelpShopAppUtil.getInstance()
                    java.lang.Long r2 = r2.createRandomNumber()
                    long r2 = r2.longValue()
                    r4 = 1000(0x3e8, double:4.94E-321)
                    long r2 = r2 * r4
                    long r0 = r0 + r2
                    long r2 = java.lang.System.currentTimeMillis()
                    r4 = 0
                    int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r5 <= 0) goto L34
                    java.util.TimerTask r0 = com.acse.ottn.d.x
                    if (r0 == 0) goto L33
                    r0.cancel()
                    com.acse.ottn.d.x = r4
                L33:
                    return
                L34:
                    com.acse.ottn.n4.r()
                    com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                    com.acse.ottn.d$a$a$a r1 = new com.acse.ottn.d$a$a$a
                    r1.<init>(r6)
                    java.lang.String r2 = "heart_beat"
                    r0.b(r2, r4, r1)
                    com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                    java.lang.String r1 = "accessiblity_lists"
                    boolean r0 = r0.a(r1)
                    if (r0 != 0) goto L61
                    com.acse.ottn.b r0 = com.acse.ottn.b.c()
                    r0.b()
                    com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                    java.lang.Boolean r2 = java.lang.Boolean.TRUE
                    r0.a(r1, r2)
                L61:
                    java.lang.String r0 = com.acse.ottn.d.b()
                    java.lang.String r1 = "心跳 倒计时设置位false"
                    com.acse.ottn.h2.b(r0, r1)
                    android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                    com.acse.ottn.k0.a(r0)
                    return
            }
        }

        public a(com.acse.ottn.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.String r0 = com.acse.ottn.d.b()
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                java.util.TimerTask r0 = com.acse.ottn.d.x
                if (r0 == 0) goto L13
                r0.cancel()
                r0 = 0
                com.acse.ottn.d.x = r0
            L13:
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r3) {
                r2 = this;
                android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L14
                android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L14
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
                com.acse.ottn.d$a$a r4 = new com.acse.ottn.d$a$a     // Catch: java.lang.Throwable -> L14
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L14
                r0 = 2000(0x7d0, double:9.88E-321)
                r3.postDelayed(r4, r0)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r3 = move-exception
                java.lang.String r4 = com.acse.ottn.d.b()
                java.lang.String r3 = r3.getMessage()
                com.acse.ottn.h2.a(r4, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.n0.d {
        public final /* synthetic */ com.acse.ottn.d a;

        public b(com.acse.ottn.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "设置时间2="
                r0.append(r1)
                long r1 = java.lang.System.currentTimeMillis()
                r3 = 1000(0x3e8, double:4.94E-321)
                long r1 = r1 / r3
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "samon-->"
                com.acse.ottn.h2.a(r1, r0)
                com.acse.ottn.d r0 = r5.a
                r1 = 0
                r0.o = r1
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.r1.j0 {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.d f2224b;

        public c(com.acse.ottn.d r1, java.lang.String r2) {
                r0 = this;
                r0.f2224b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.r1.j0
        public void a(int r3, int r4) {
                r2 = this;
                r0 = 1
                if (r3 != r0) goto L1f
                if (r4 != r0) goto L13
                com.acse.ottn.m2 r3 = com.acse.ottn.m2.a()
                com.acse.ottn.d r4 = r2.f2224b
                android.accessibilityservice.AccessibilityService r0 = r4.f2222j
                java.lang.String r1 = r2.a
                r3.a(r0, r1, r4)
                return
            L13:
                com.acse.ottn.m2 r3 = com.acse.ottn.m2.a()
                com.acse.ottn.d r4 = r2.f2224b
                android.accessibilityservice.AccessibilityService r4 = r4.f2222j
                r3.b(r4)
                return
            L1f:
                com.acse.ottn.m2 r3 = com.acse.ottn.m2.a()
                com.acse.ottn.d r4 = r2.f2224b
                android.accessibilityservice.AccessibilityService r4 = r4.f2222j
                r3.b(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.acse.ottn.d$d, reason: collision with other inner class name */
    public class C0070d implements com.acse.ottn.n0.d {
        public final /* synthetic */ com.acse.ottn.model.PageSettingTypeModel a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2225b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.d f2226c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.d$d$a */
        public class a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.d.C0070d a;

            public a(com.acse.ottn.d.C0070d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r5 = this;
                    boolean r0 = com.acse.ottn.l0.f2436g
                    java.lang.String r1 = "0"
                    if (r0 != 0) goto L18
                    com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                    java.lang.String r2 = "read_timeout"
                    java.lang.String r0 = r0.a(r2, r1)
                    java.lang.String r2 = "1"
                    boolean r0 = r2.equals(r0)
                    if (r0 == 0) goto L43
                L18:
                    r0 = 0
                    com.acse.ottn.l0.f2436g = r0
                    com.acse.ottn.d$d r0 = r5.a
                    com.acse.ottn.model.PageSettingTypeModel r0 = r0.a
                    java.lang.String r0 = r0.getPackage_name()
                    com.acse.ottn.o r2 = com.acse.ottn.o.c()
                    java.lang.String r2 = r2.t
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L35
                    com.acse.ottn.d$d r0 = r5.a
                    com.acse.ottn.d r0 = r0.f2226c
                    r0.q = r1
                L35:
                    com.acse.ottn.d$d r0 = r5.a
                    com.acse.ottn.d r0 = r0.f2226c
                    java.util.List<java.lang.String> r0 = r0.f2219g
                    if (r0 == 0) goto L44
                    int r0 = r0.size()
                    if (r0 != 0) goto L44
                L43:
                    return
                L44:
                    com.acse.ottn.d$d r0 = r5.a
                    com.acse.ottn.d r1 = r0.f2226c
                    java.util.List<java.lang.String> r2 = r1.f2219g
                    com.acse.ottn.model.PageSettingTypeModel r0 = r0.a
                    java.lang.String r0 = r0.getPackage_name()
                    com.acse.ottn.d$d r3 = r5.a
                    java.lang.String r4 = r3.f2225b
                    com.acse.ottn.d r3 = r3.f2226c
                    java.lang.String r3 = r3.q
                    com.acse.ottn.d.a(r1, r2, r0, r4, r3)
                    return
            }
        }

        public C0070d(com.acse.ottn.d r1, com.acse.ottn.model.PageSettingTypeModel r2, java.lang.String r3) {
                r0 = this;
                r0.f2226c = r1
                r0.a = r2
                r0.f2225b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r4 = this;
                java.util.TimerTask r0 = com.acse.ottn.d.w
                if (r0 == 0) goto La
                r0.cancel()
                r0 = 0
                com.acse.ottn.d.w = r0
            La:
                java.lang.String r0 = com.acse.ottn.d.b()
                java.lang.String r1 = "gainContent finish"
                com.acse.ottn.h2.a(r0, r1)
                com.acse.ottn.d r0 = r4.f2226c
                java.util.List<java.lang.String> r0 = r0.f2219g
                if (r0 == 0) goto Lb1
                int r0 = r0.size()
                r1 = 6
                if (r0 < r1) goto Lb1
                com.acse.ottn.d r0 = r4.f2226c
                java.lang.String r1 = ""
                r0.q = r1
                java.lang.String r0 = com.acse.ottn.d.b()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "model.getPackage_name() ="
                r1.append(r2)
                com.acse.ottn.model.PageSettingTypeModel r2 = r4.a
                java.lang.String r2 = r2.getPackage_name()
                r1.append(r2)
                java.lang.String r2 = "   model.getIs_click_jd_title()="
                r1.append(r2)
                com.acse.ottn.model.PageSettingTypeModel r2 = r4.a
                java.lang.String r2 = r2.getIs_click_jd_title()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.acse.ottn.h2.a(r0, r1)
                com.acse.ottn.model.PageSettingTypeModel r0 = r4.a
                java.lang.String r0 = r0.getPackage_name()
                com.acse.ottn.o r1 = com.acse.ottn.o.c()
                java.lang.String r1 = r1.w
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L8f
                com.acse.ottn.model.PageSettingTypeModel r0 = r4.a
                java.lang.String r0 = r0.getIs_click_jd_title()
                java.lang.String r1 = "0"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L8f
                com.acse.ottn.d r0 = r4.f2226c
                android.accessibilityservice.AccessibilityService r1 = r0.f2222j
                java.lang.String r1 = com.acse.ottn.d.a(r0, r1)
                r0.q = r1
                com.acse.ottn.d r0 = r4.f2226c
                java.lang.String r0 = r0.q
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L8f
                com.acse.ottn.d r0 = r4.f2226c
                java.util.List<java.lang.String> r1 = r0.f2219g
                java.lang.String r0 = r0.q
                r1.add(r0)
            L8f:
                java.lang.String r0 = com.acse.ottn.d.b()
                com.acse.ottn.d r1 = r4.f2226c
                java.util.List<java.lang.String> r1 = r1.f2219g
                java.lang.String r1 = r1.toString()
                com.acse.ottn.h2.a(r0, r1)
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.acse.ottn.d$d$a r1 = new com.acse.ottn.d$d$a
                r1.<init>(r4)
                r2 = 0
                r0.postDelayed(r1, r2)
            Lb1:
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r5) {
                r4 = this;
                com.acse.ottn.d r5 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                java.util.List<java.lang.String> r6 = r5.f2219g     // Catch: java.lang.Throwable -> L16
                if (r6 == 0) goto L19
                java.lang.String r5 = com.acse.ottn.d.b()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d r6 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                java.util.List<java.lang.String> r6 = r6.f2219g     // Catch: java.lang.Throwable -> L16
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.h2.a(r5, r6)     // Catch: java.lang.Throwable -> L16
                goto L23
            L16:
                r5 = move-exception
                goto L139
            L19:
                r6 = 0
                r5.f2221i = r6     // Catch: java.lang.Throwable -> L16
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
                r6.<init>()     // Catch: java.lang.Throwable -> L16
                r5.f2219g = r6     // Catch: java.lang.Throwable -> L16
            L23:
                com.acse.ottn.t0 r5 = com.acse.ottn.t0.b()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d r6 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                java.util.List<java.lang.String> r6 = r6.f2219g     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.model.PageSettingTypeModel r0 = r4.a     // Catch: java.lang.Throwable -> L16
                int r0 = r0.getRead_length()     // Catch: java.lang.Throwable -> L16
                boolean r5 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L16
                java.lang.String r6 = "ocr_screen_state"
                java.lang.String r0 = "1"
                r1 = 0
                java.lang.String r2 = "samon"
                if (r5 == 0) goto Lcf
                com.acse.ottn.model.PageSettingTypeModel r5 = r4.a     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.getPackage_name()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.o r3 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L16
                java.lang.String r3 = r3.t     // Catch: java.lang.Throwable -> L16
                boolean r5 = r5.equals(r3)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto Lb7
                com.acse.ottn.t0 r5 = com.acse.ottn.t0.b()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d r3 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                java.util.List<java.lang.String> r3 = r3.f2219g     // Catch: java.lang.Throwable -> L16
                boolean r5 = r5.a(r3)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L5f
                goto Lb7
            L5f:
                com.acse.ottn.d r5 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.m     // Catch: java.lang.Throwable -> L16
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L9f
                com.acse.ottn.d r5 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.n     // Catch: java.lang.Throwable -> L16
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L9f
                com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.e(r6)     // Catch: java.lang.Throwable -> L16
                boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L9f
                java.lang.String r5 = "开始截屏2"
                com.acse.ottn.h2.a(r2, r5)     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d r5 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.model.PageSettingTypeModel r6 = r4.a     // Catch: java.lang.Throwable -> L16
                java.lang.String r6 = r6.getPackage_name()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.c(r5, r6)     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d r5 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                android.accessibilityservice.AccessibilityService r6 = r5.f2222j     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.model.PageSettingTypeModel r0 = r4.a     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L16
                return
            L9f:
                java.util.TimerTask r5 = com.acse.ottn.d.w     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto Laf
                java.lang.String r5 = "结束读屏2"
                com.acse.ottn.h2.a(r2, r5)     // Catch: java.lang.Throwable -> L16
                java.util.TimerTask r5 = com.acse.ottn.d.w     // Catch: java.lang.Throwable -> L16
                r5.cancel()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.w = r1     // Catch: java.lang.Throwable -> L16
            Laf:
                com.acse.ottn.d r5 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.model.PageSettingTypeModel r6 = r4.a     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.a(r5, r6)     // Catch: java.lang.Throwable -> L16
                return
            Lb7:
                java.util.TimerTask r5 = com.acse.ottn.d.w     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto Lc7
                java.lang.String r5 = "结束读屏1"
                com.acse.ottn.h2.a(r2, r5)     // Catch: java.lang.Throwable -> L16
                java.util.TimerTask r5 = com.acse.ottn.d.w     // Catch: java.lang.Throwable -> L16
                r5.cancel()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.w = r1     // Catch: java.lang.Throwable -> L16
            Lc7:
                com.acse.ottn.d r5 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.model.PageSettingTypeModel r6 = r4.a     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.a(r5, r6)     // Catch: java.lang.Throwable -> L16
                return
            Lcf:
                com.acse.ottn.model.PageSettingTypeModel r5 = r4.a     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.getPackage_name()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.o r3 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L16
                java.lang.String r3 = r3.t     // Catch: java.lang.Throwable -> L16
                boolean r5 = r5.equals(r3)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L11f
                com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.e(r6)     // Catch: java.lang.Throwable -> L16
                boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L11f
                com.acse.ottn.d r5 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.m     // Catch: java.lang.Throwable -> L16
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L107
                com.acse.ottn.d r5 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.n     // Catch: java.lang.Throwable -> L16
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L16
                if (r5 != 0) goto L11f
            L107:
                java.util.TimerTask r5 = com.acse.ottn.d.w     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L117
                java.lang.String r5 = "结束读屏3"
                com.acse.ottn.h2.a(r2, r5)     // Catch: java.lang.Throwable -> L16
                java.util.TimerTask r5 = com.acse.ottn.d.w     // Catch: java.lang.Throwable -> L16
                r5.cancel()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.w = r1     // Catch: java.lang.Throwable -> L16
            L117:
                com.acse.ottn.d r5 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.model.PageSettingTypeModel r6 = r4.a     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.a(r5, r6)     // Catch: java.lang.Throwable -> L16
                return
            L11f:
                java.lang.String r5 = "开始截屏3"
                com.acse.ottn.h2.a(r2, r5)     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d r5 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.model.PageSettingTypeModel r6 = r4.a     // Catch: java.lang.Throwable -> L16
                java.lang.String r6 = r6.getPackage_name()     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.c(r5, r6)     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d r5 = r4.f2226c     // Catch: java.lang.Throwable -> L16
                android.accessibilityservice.AccessibilityService r6 = r5.f2222j     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.model.PageSettingTypeModel r0 = r4.a     // Catch: java.lang.Throwable -> L16
                com.acse.ottn.d.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L16
                return
            L139:
                java.lang.String r6 = com.acse.ottn.d.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "gainContent="
                r0.append(r1)
                java.lang.String r5 = r5.getMessage()
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                com.acse.ottn.h2.a(r6, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.acse.ottn.r1.i0 {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.d f2227b;

        public e(com.acse.ottn.d r1, java.lang.String r2) {
                r0 = this;
                r0.f2227b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.r1.i0
        public void a(com.acse.ottn.model.AccessiblityModel r3) {
                r2 = this;
                com.acse.ottn.d r0 = r2.f2227b
                java.lang.String r1 = r2.a
                r0.a(r3, r1)
                com.acse.ottn.d r3 = r2.f2227b
                java.util.List<java.lang.String> r3 = r3.f2219g
                if (r3 == 0) goto L1e
                r3.removeAll(r3)
                com.acse.ottn.d r3 = r2.f2227b
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.f2219g = r0
                com.acse.ottn.d r3 = r2.f2227b
                r0 = 0
                r3.f2221i = r0
            L1e:
                return
        }

        @Override // com.acse.ottn.r1.i0
        public void a(java.lang.String r2) {
                r1 = this;
                com.acse.ottn.d r2 = r1.f2227b
                java.util.List<java.lang.String> r2 = r2.f2219g
                if (r2 == 0) goto L17
                r2.removeAll(r2)
                com.acse.ottn.d r2 = r1.f2227b
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f2219g = r0
                com.acse.ottn.d r2 = r1.f2227b
                r0 = 0
                r2.f2221i = r0
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.acse.ottn.l4.b {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.d f2228b;

        public f(com.acse.ottn.d r1, android.accessibilityservice.AccessibilityService r2) {
                r0 = this;
                r0.f2228b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.l4.b
        public void a(com.acse.ottn.model.AccessiblityModel r3) {
                r2 = this;
                com.acse.ottn.d r0 = r2.f2228b
                android.accessibilityservice.AccessibilityService r1 = r2.a
                r0.b(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g implements java.lang.Runnable {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2229b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.d f2230c;

        public g(com.acse.ottn.d r1, android.accessibilityservice.AccessibilityService r2, com.acse.ottn.model.AccessiblityModel r3) {
                r0 = this;
                r0.f2230c = r1
                r0.a = r2
                r0.f2229b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.acse.ottn.e2 r0 = com.acse.ottn.e2.a()
                android.accessibilityservice.AccessibilityService r1 = r3.a
                r0.b(r1)
                com.acse.ottn.i0 r0 = com.acse.ottn.i0.d()
                android.accessibilityservice.AccessibilityService r1 = r3.a
                r0.a(r1)
                com.acse.ottn.i0 r0 = com.acse.ottn.i0.d()
                android.accessibilityservice.AccessibilityService r1 = r3.a
                com.acse.ottn.model.AccessiblityModel r2 = r3.f2229b
                r0.b(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class h implements java.lang.Runnable {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2231b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.d f2232c;

        public h(com.acse.ottn.d r1, android.accessibilityservice.AccessibilityService r2, com.acse.ottn.model.AccessiblityModel r3) {
                r0 = this;
                r0.f2232c = r1
                r0.a = r2
                r0.f2231b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                boolean r0 = com.acse.ottn.l0.f2435f
                if (r0 == 0) goto L4c
                com.acse.ottn.d r0 = r4.f2232c
                android.content.Intent r0 = com.acse.ottn.d.c(r0)
                if (r0 == 0) goto L26
                java.lang.String r0 = com.acse.ottn.d.b()
                java.lang.String r1 = "showFloatWindow stop floatIntent"
                com.acse.ottn.h2.a(r0, r1)
                android.accessibilityservice.AccessibilityService r0 = r4.a
                com.acse.ottn.d r1 = r4.f2232c
                android.content.Intent r1 = com.acse.ottn.d.c(r1)
                r0.stopService(r1)
                com.acse.ottn.d r0 = r4.f2232c
                r1 = 0
                com.acse.ottn.d.a(r0, r1)
            L26:
                com.acse.ottn.d r0 = r4.f2232c
                android.content.Intent r1 = new android.content.Intent
                android.accessibilityservice.AccessibilityService r2 = r4.a
                java.lang.Class<com.acse.ottn.service.CircleFlowService> r3 = com.acse.ottn.service.CircleFlowService.class
                r1.<init>(r2, r3)
                com.acse.ottn.d.a(r0, r1)
                com.acse.ottn.d r0 = r4.f2232c
                android.content.Intent r0 = com.acse.ottn.d.c(r0)
                com.acse.ottn.model.AccessiblityModel r1 = r4.f2231b
                java.lang.String r2 = "model"
                r0.putExtra(r2, r1)
                android.accessibilityservice.AccessibilityService r0 = r4.a
                com.acse.ottn.d r1 = r4.f2232c
                android.content.Intent r1 = com.acse.ottn.d.c(r1)
                r0.startService(r1)
            L4c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class i extends android.os.Handler {
        public final /* synthetic */ com.acse.ottn.d a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.model.PageSettingTypeModel a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f2233b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.acse.ottn.d.i f2234c;

            public a(com.acse.ottn.d.i r1, com.acse.ottn.model.PageSettingTypeModel r2, java.lang.String r3) {
                    r0 = this;
                    r0.f2234c = r1
                    r0.a = r2
                    r0.f2233b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.acse.ottn.d$i r0 = r4.f2234c
                    com.acse.ottn.d r0 = r0.a
                    android.accessibilityservice.AccessibilityService r1 = r0.f2222j
                    r0.b(r1)
                    android.os.Message r0 = new android.os.Message
                    r0.<init>()
                    r1 = 10073(0x2759, float:1.4115E-41)
                    r0.what = r1
                    android.os.Bundle r1 = new android.os.Bundle
                    r1.<init>()
                    com.acse.ottn.model.PageSettingTypeModel r2 = r4.a
                    java.lang.String r2 = r2.getPackage_name()
                    java.lang.String r3 = "coupon_packagename"
                    r1.putString(r3, r2)
                    java.lang.String r2 = r4.f2233b
                    java.lang.String r3 = "genuine_packagename"
                    r1.putString(r3, r2)
                    r0.setData(r1)
                    com.acse.ottn.d$i r1 = r4.f2234c
                    com.acse.ottn.d r1 = r1.a
                    android.os.Handler r1 = r1.r
                    r2 = 500(0x1f4, double:2.47E-321)
                    r1.sendMessageDelayed(r0, r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class b implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.model.PageSettingTypeModel a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f2235b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.acse.ottn.d.i f2236c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            public class a implements java.lang.Runnable {
                public final /* synthetic */ com.acse.ottn.d.i.b a;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                /* renamed from: com.acse.ottn.d$i$b$a$a, reason: collision with other inner class name */
                public class C0071a implements com.acse.ottn.t0.b {
                    public final /* synthetic */ com.acse.ottn.d.i.b.a a;

                    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                    /* renamed from: com.acse.ottn.d$i$b$a$a$a, reason: collision with other inner class name */
                    public class RunnableC0072a implements java.lang.Runnable {
                        public final /* synthetic */ com.acse.ottn.d.i.b.a.C0071a a;

                        public RunnableC0072a(com.acse.ottn.d.i.b.a.C0071a r1) {
                                r0 = this;
                                r0.a = r1
                                r0.<init>()
                                return
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                                r4 = this;
                                android.os.Message r0 = new android.os.Message
                                r0.<init>()
                                r1 = 10072(0x2758, float:1.4114E-41)
                                r0.what = r1
                                android.os.Bundle r1 = new android.os.Bundle
                                r1.<init>()
                                com.acse.ottn.d$i$b$a$a r2 = r4.a
                                com.acse.ottn.d$i$b$a r2 = r2.a
                                com.acse.ottn.d$i$b r2 = r2.a
                                com.acse.ottn.model.PageSettingTypeModel r2 = r2.a
                                java.lang.String r2 = r2.getPackage_name()
                                java.lang.String r3 = "coupon_packagename"
                                r1.putString(r3, r2)
                                com.acse.ottn.d$i$b$a$a r2 = r4.a
                                com.acse.ottn.d$i$b$a r2 = r2.a
                                com.acse.ottn.d$i$b r2 = r2.a
                                java.lang.String r2 = r2.f2235b
                                java.lang.String r3 = "genuine_packagename"
                                r1.putString(r3, r2)
                                r0.setData(r1)
                                com.acse.ottn.d$i$b$a$a r1 = r4.a
                                com.acse.ottn.d$i$b$a r1 = r1.a
                                com.acse.ottn.d$i$b r1 = r1.a
                                com.acse.ottn.d$i r1 = r1.f2236c
                                com.acse.ottn.d r1 = r1.a
                                android.os.Handler r1 = r1.r
                                r2 = 0
                                r1.sendMessageDelayed(r0, r2)
                                return
                        }
                    }

                    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                    /* renamed from: com.acse.ottn.d$i$b$a$a$b, reason: collision with other inner class name */
                    public class RunnableC0073b implements java.lang.Runnable {
                        public final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ int f2237b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ com.acse.ottn.d.i.b.a.C0071a f2238c;

                        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                        /* renamed from: com.acse.ottn.d$i$b$a$a$b$a, reason: collision with other inner class name */
                        public class RunnableC0074a implements java.lang.Runnable {
                            public final /* synthetic */ com.acse.ottn.d.i.b.a.C0071a.RunnableC0073b a;

                            public RunnableC0074a(com.acse.ottn.d.i.b.a.C0071a.RunnableC0073b r1) {
                                    r0 = this;
                                    r0.a = r1
                                    r0.<init>()
                                    return
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                    r4 = this;
                                    android.os.Message r0 = new android.os.Message
                                    r0.<init>()
                                    r1 = 10072(0x2758, float:1.4114E-41)
                                    r0.what = r1
                                    android.os.Bundle r1 = new android.os.Bundle
                                    r1.<init>()
                                    com.acse.ottn.d$i$b$a$a$b r2 = r4.a
                                    com.acse.ottn.d$i$b$a$a r2 = r2.f2238c
                                    com.acse.ottn.d$i$b$a r2 = r2.a
                                    com.acse.ottn.d$i$b r2 = r2.a
                                    com.acse.ottn.model.PageSettingTypeModel r2 = r2.a
                                    java.lang.String r2 = r2.getPackage_name()
                                    java.lang.String r3 = "coupon_packagename"
                                    r1.putString(r3, r2)
                                    com.acse.ottn.d$i$b$a$a$b r2 = r4.a
                                    com.acse.ottn.d$i$b$a$a r2 = r2.f2238c
                                    com.acse.ottn.d$i$b$a r2 = r2.a
                                    com.acse.ottn.d$i$b r2 = r2.a
                                    java.lang.String r2 = r2.f2235b
                                    java.lang.String r3 = "genuine_packagename"
                                    r1.putString(r3, r2)
                                    r0.setData(r1)
                                    com.acse.ottn.d$i$b$a$a$b r1 = r4.a
                                    com.acse.ottn.d$i$b$a$a r1 = r1.f2238c
                                    com.acse.ottn.d$i$b$a r1 = r1.a
                                    com.acse.ottn.d$i$b r1 = r1.a
                                    com.acse.ottn.d$i r1 = r1.f2236c
                                    com.acse.ottn.d r1 = r1.a
                                    android.os.Handler r1 = r1.r
                                    r2 = 0
                                    r1.sendMessageDelayed(r0, r2)
                                    return
                            }
                        }

                        public RunnableC0073b(com.acse.ottn.d.i.b.a.C0071a r1, android.view.accessibility.AccessibilityNodeInfo r2, int r3) {
                                r0 = this;
                                r0.f2238c = r1
                                r0.a = r2
                                r0.f2237b = r3
                                r0.<init>()
                                return
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                                r4 = this;
                                com.acse.ottn.a3 r0 = com.acse.ottn.a3.d()
                                android.view.accessibility.AccessibilityNodeInfo r1 = r4.a
                                int r2 = r4.f2237b
                                r0.b(r1, r2)
                                android.os.Handler r0 = new android.os.Handler
                                r0.<init>()
                                com.acse.ottn.d$i$b$a$a$b$a r1 = new com.acse.ottn.d$i$b$a$a$b$a
                                r1.<init>(r4)
                                r2 = 200(0xc8, double:9.9E-322)
                                r0.postDelayed(r1, r2)
                                return
                        }
                    }

                    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                    /* renamed from: com.acse.ottn.d$i$b$a$a$c */
                    public class c implements java.lang.Runnable {
                        public final /* synthetic */ com.acse.ottn.d.i.b.a.C0071a a;

                        public c(com.acse.ottn.d.i.b.a.C0071a r1) {
                                r0 = this;
                                r0.a = r1
                                r0.<init>()
                                return
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                                r4 = this;
                                android.os.Message r0 = new android.os.Message
                                r0.<init>()
                                r1 = 10072(0x2758, float:1.4114E-41)
                                r0.what = r1
                                android.os.Bundle r1 = new android.os.Bundle
                                r1.<init>()
                                com.acse.ottn.d$i$b$a$a r2 = r4.a
                                com.acse.ottn.d$i$b$a r2 = r2.a
                                com.acse.ottn.d$i$b r2 = r2.a
                                com.acse.ottn.model.PageSettingTypeModel r2 = r2.a
                                java.lang.String r2 = r2.getPackage_name()
                                java.lang.String r3 = "coupon_packagename"
                                r1.putString(r3, r2)
                                com.acse.ottn.d$i$b$a$a r2 = r4.a
                                com.acse.ottn.d$i$b$a r2 = r2.a
                                com.acse.ottn.d$i$b r2 = r2.a
                                java.lang.String r2 = r2.f2235b
                                java.lang.String r3 = "genuine_packagename"
                                r1.putString(r3, r2)
                                r0.setData(r1)
                                com.acse.ottn.d$i$b$a$a r1 = r4.a
                                com.acse.ottn.d$i$b$a r1 = r1.a
                                com.acse.ottn.d$i$b r1 = r1.a
                                com.acse.ottn.d$i r1 = r1.f2236c
                                com.acse.ottn.d r1 = r1.a
                                android.os.Handler r1 = r1.r
                                r2 = 0
                                r1.sendMessageDelayed(r0, r2)
                                return
                        }
                    }

                    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                    /* renamed from: com.acse.ottn.d$i$b$a$a$d, reason: collision with other inner class name */
                    public class RunnableC0075d implements java.lang.Runnable {
                        public final /* synthetic */ com.acse.ottn.d.i.b.a.C0071a a;

                        public RunnableC0075d(com.acse.ottn.d.i.b.a.C0071a r1) {
                                r0 = this;
                                r0.a = r1
                                r0.<init>()
                                return
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                                r4 = this;
                                android.os.Message r0 = new android.os.Message
                                r0.<init>()
                                r1 = 10072(0x2758, float:1.4114E-41)
                                r0.what = r1
                                android.os.Bundle r1 = new android.os.Bundle
                                r1.<init>()
                                com.acse.ottn.d$i$b$a$a r2 = r4.a
                                com.acse.ottn.d$i$b$a r2 = r2.a
                                com.acse.ottn.d$i$b r2 = r2.a
                                com.acse.ottn.model.PageSettingTypeModel r2 = r2.a
                                java.lang.String r2 = r2.getPackage_name()
                                java.lang.String r3 = "coupon_packagename"
                                r1.putString(r3, r2)
                                com.acse.ottn.d$i$b$a$a r2 = r4.a
                                com.acse.ottn.d$i$b$a r2 = r2.a
                                com.acse.ottn.d$i$b r2 = r2.a
                                java.lang.String r2 = r2.f2235b
                                java.lang.String r3 = "genuine_packagename"
                                r1.putString(r3, r2)
                                r0.setData(r1)
                                com.acse.ottn.d$i$b$a$a r1 = r4.a
                                com.acse.ottn.d$i$b$a r1 = r1.a
                                com.acse.ottn.d$i$b r1 = r1.a
                                com.acse.ottn.d$i r1 = r1.f2236c
                                com.acse.ottn.d r1 = r1.a
                                android.os.Handler r1 = r1.r
                                r2 = 0
                                r1.sendMessageDelayed(r0, r2)
                                return
                        }
                    }

                    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                    /* renamed from: com.acse.ottn.d$i$b$a$a$e */
                    public class e implements java.lang.Runnable {
                        public final /* synthetic */ com.acse.ottn.d.i.b.a.C0071a a;

                        public e(com.acse.ottn.d.i.b.a.C0071a r1) {
                                r0 = this;
                                r0.a = r1
                                r0.<init>()
                                return
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                                r4 = this;
                                android.os.Message r0 = new android.os.Message
                                r0.<init>()
                                r1 = 10072(0x2758, float:1.4114E-41)
                                r0.what = r1
                                android.os.Bundle r1 = new android.os.Bundle
                                r1.<init>()
                                com.acse.ottn.d$i$b$a$a r2 = r4.a
                                com.acse.ottn.d$i$b$a r2 = r2.a
                                com.acse.ottn.d$i$b r2 = r2.a
                                com.acse.ottn.model.PageSettingTypeModel r2 = r2.a
                                java.lang.String r2 = r2.getPackage_name()
                                java.lang.String r3 = "coupon_packagename"
                                r1.putString(r3, r2)
                                com.acse.ottn.d$i$b$a$a r2 = r4.a
                                com.acse.ottn.d$i$b$a r2 = r2.a
                                com.acse.ottn.d$i$b r2 = r2.a
                                java.lang.String r2 = r2.f2235b
                                java.lang.String r3 = "genuine_packagename"
                                r1.putString(r3, r2)
                                r0.setData(r1)
                                com.acse.ottn.d$i$b$a$a r1 = r4.a
                                com.acse.ottn.d$i$b$a r1 = r1.a
                                com.acse.ottn.d$i$b r1 = r1.a
                                com.acse.ottn.d$i r1 = r1.f2236c
                                com.acse.ottn.d r1 = r1.a
                                android.os.Handler r1 = r1.r
                                r2 = 0
                                r1.sendMessageDelayed(r0, r2)
                                return
                        }
                    }

                    public C0071a(com.acse.ottn.d.i.b.a r1) {
                            r0 = this;
                            r0.a = r1
                            r0.<init>()
                            return
                    }

                    @Override // com.acse.ottn.t0.b
                    public void a(java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7) {
                            r3 = this;
                            java.lang.String r0 = "0"
                            boolean r0 = r4.equals(r0)
                            r1 = 200(0xc8, double:9.9E-322)
                            if (r0 == 0) goto L2d
                            com.acse.ottn.a3 r4 = com.acse.ottn.a3.d()
                            com.acse.ottn.d$i$b$a r6 = r3.a
                            com.acse.ottn.d$i$b r6 = r6.a
                            com.acse.ottn.d$i r6 = r6.f2236c
                            com.acse.ottn.d r6 = r6.a
                            android.accessibilityservice.AccessibilityService r6 = r6.f2222j
                            android.view.accessibility.AccessibilityNodeInfo r6 = r6.getRootInActiveWindow()
                            r4.a(r6, r5)
                            android.os.Handler r4 = new android.os.Handler
                            r4.<init>()
                            com.acse.ottn.d$i$b$a$a$a r5 = new com.acse.ottn.d$i$b$a$a$a
                            r5.<init>(r3)
                            r4.postDelayed(r5, r1)
                            return
                        L2d:
                            java.lang.String r0 = "1"
                            boolean r0 = r4.equals(r0)
                            if (r0 == 0) goto L6c
                            com.acse.ottn.b r4 = com.acse.ottn.b.c()
                            com.acse.ottn.d$i$b$a r7 = r3.a
                            com.acse.ottn.d$i$b r7 = r7.a
                            com.acse.ottn.d$i r7 = r7.f2236c
                            com.acse.ottn.d r7 = r7.a
                            android.accessibilityservice.AccessibilityService r7 = r7.f2222j
                            android.view.accessibility.AccessibilityNodeInfo r4 = r4.j(r7, r6)
                            if (r4 != 0) goto L4b
                            goto L185
                        L4b:
                            com.acse.ottn.a3 r6 = com.acse.ottn.a3.d()
                            com.acse.ottn.d$i$b$a r7 = r3.a
                            com.acse.ottn.d$i$b r7 = r7.a
                            com.acse.ottn.d$i r7 = r7.f2236c
                            com.acse.ottn.d r7 = r7.a
                            android.accessibilityservice.AccessibilityService r7 = r7.f2222j
                            r6.a(r7)
                            android.os.Handler r6 = new android.os.Handler
                            r6.<init>()
                            com.acse.ottn.d$i$b$a$a$b r7 = new com.acse.ottn.d$i$b$a$a$b
                            r7.<init>(r3, r4, r5)
                            r4 = 100
                            r6.postDelayed(r7, r4)
                            return
                        L6c:
                            java.lang.String r0 = "2"
                            boolean r0 = r4.equals(r0)
                            if (r0 == 0) goto L9a
                            com.acse.ottn.a3 r4 = com.acse.ottn.a3.d()
                            com.acse.ottn.d$i$b$a r5 = r3.a
                            com.acse.ottn.d$i$b r5 = r5.a
                            com.acse.ottn.d$i r5 = r5.f2236c
                            com.acse.ottn.d r5 = r5.a
                            android.accessibilityservice.AccessibilityService r5 = r5.f2222j
                            r4.a(r5)
                            com.acse.ottn.a3 r4 = com.acse.ottn.a3.d()
                            r4.a()
                            android.os.Handler r4 = new android.os.Handler
                            r4.<init>()
                            com.acse.ottn.d$i$b$a$a$c r5 = new com.acse.ottn.d$i$b$a$a$c
                            r5.<init>(r3)
                            r4.postDelayed(r5, r1)
                            return
                        L9a:
                            java.lang.String r0 = "3"
                            boolean r0 = r4.equals(r0)
                            if (r0 == 0) goto L100
                            com.acse.ottn.b r4 = com.acse.ottn.b.c()
                            com.acse.ottn.d$i$b$a r0 = r3.a
                            com.acse.ottn.d$i$b r0 = r0.a
                            com.acse.ottn.d$i r0 = r0.f2236c
                            com.acse.ottn.d r0 = r0.a
                            android.accessibilityservice.AccessibilityService r0 = r0.f2222j
                            android.view.accessibility.AccessibilityNodeInfo r4 = r4.j(r0, r6)
                            com.acse.ottn.b r6 = com.acse.ottn.b.c()
                            com.acse.ottn.d$i$b$a r0 = r3.a
                            com.acse.ottn.d$i$b r0 = r0.a
                            com.acse.ottn.d$i r0 = r0.f2236c
                            com.acse.ottn.d r0 = r0.a
                            android.accessibilityservice.AccessibilityService r0 = r0.f2222j
                            android.view.accessibility.AccessibilityNodeInfo r6 = r6.j(r0, r7)
                            if (r4 == 0) goto L185
                            if (r6 != 0) goto Lcc
                            goto L185
                        Lcc:
                            com.acse.ottn.a3 r4 = com.acse.ottn.a3.d()
                            com.acse.ottn.d$i$b$a r6 = r3.a
                            com.acse.ottn.d$i$b r6 = r6.a
                            com.acse.ottn.d$i r6 = r6.f2236c
                            com.acse.ottn.d r6 = r6.a
                            android.accessibilityservice.AccessibilityService r6 = r6.f2222j
                            r4.a(r6)
                            com.acse.ottn.a3 r4 = com.acse.ottn.a3.d()
                            com.acse.ottn.d$i$b$a r6 = r3.a
                            com.acse.ottn.d$i$b r6 = r6.a
                            com.acse.ottn.d$i r6 = r6.f2236c
                            com.acse.ottn.d r6 = r6.a
                            android.accessibilityservice.AccessibilityService r6 = r6.f2222j
                            android.view.accessibility.AccessibilityNodeInfo r6 = r6.getRootInActiveWindow()
                            r4.a(r6, r5)
                            android.os.Handler r4 = new android.os.Handler
                            r4.<init>()
                            com.acse.ottn.d$i$b$a$a$d r5 = new com.acse.ottn.d$i$b$a$a$d
                            r5.<init>(r3)
                            r4.postDelayed(r5, r1)
                            return
                        L100:
                            java.lang.String r5 = "4"
                            boolean r5 = r4.equals(r5)
                            if (r5 == 0) goto L143
                            com.acse.ottn.t0 r4 = com.acse.ottn.t0.b()
                            com.acse.ottn.d$i$b$a r5 = r3.a
                            com.acse.ottn.d$i$b r5 = r5.a
                            com.acse.ottn.d$i r5 = r5.f2236c
                            com.acse.ottn.d r5 = r5.a
                            java.util.List<java.lang.String> r5 = r5.f2220h
                            boolean r4 = r4.a(r5, r6, r7)
                            if (r4 != 0) goto L11d
                            goto L185
                        L11d:
                            com.acse.ottn.a3 r4 = com.acse.ottn.a3.d()
                            com.acse.ottn.d$i$b$a r5 = r3.a
                            com.acse.ottn.d$i$b r5 = r5.a
                            com.acse.ottn.d$i r5 = r5.f2236c
                            com.acse.ottn.d r5 = r5.a
                            android.accessibilityservice.AccessibilityService r5 = r5.f2222j
                            r4.a(r5)
                            com.acse.ottn.a3 r4 = com.acse.ottn.a3.d()
                            r4.a()
                            android.os.Handler r4 = new android.os.Handler
                            r4.<init>()
                            com.acse.ottn.d$i$b$a$a$e r5 = new com.acse.ottn.d$i$b$a$a$e
                            r5.<init>(r3)
                            r4.postDelayed(r5, r1)
                            return
                        L143:
                            java.lang.String r5 = "5"
                            boolean r4 = r4.equals(r5)
                            if (r4 == 0) goto L185
                            android.os.Message r4 = new android.os.Message
                            r4.<init>()
                            r5 = 10073(0x2759, float:1.4115E-41)
                            r4.what = r5
                            android.os.Bundle r5 = new android.os.Bundle
                            r5.<init>()
                            com.acse.ottn.d$i$b$a r6 = r3.a
                            com.acse.ottn.d$i$b r6 = r6.a
                            com.acse.ottn.model.PageSettingTypeModel r6 = r6.a
                            java.lang.String r6 = r6.getPackage_name()
                            java.lang.String r7 = "coupon_packagename"
                            r5.putString(r7, r6)
                            com.acse.ottn.d$i$b$a r6 = r3.a
                            com.acse.ottn.d$i$b r6 = r6.a
                            java.lang.String r6 = r6.f2235b
                            java.lang.String r7 = "genuine_packagename"
                            r5.putString(r7, r6)
                            r4.setData(r5)
                            com.acse.ottn.d$i$b$a r5 = r3.a
                            com.acse.ottn.d$i$b r5 = r5.a
                            com.acse.ottn.d$i r5 = r5.f2236c
                            com.acse.ottn.d r5 = r5.a
                            android.os.Handler r5 = r5.r
                            r6 = 0
                            r5.sendMessageDelayed(r4, r6)
                        L185:
                            return
                    }
                }

                public a(com.acse.ottn.d.i.b r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r4 = this;
                        com.acse.ottn.d$i$b r0 = r4.a
                        com.acse.ottn.d$i r0 = r0.f2236c
                        com.acse.ottn.d r0 = r0.a
                        java.util.List<java.lang.String> r0 = r0.f2220h
                        if (r0 == 0) goto L13
                        java.lang.String r0 = r0.toString()
                        java.lang.String r1 = "samon-->"
                        com.acse.ottn.h2.a(r1, r0)
                    L13:
                        com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
                        com.acse.ottn.d$i$b r1 = r4.a
                        com.acse.ottn.d$i r2 = r1.f2236c
                        com.acse.ottn.d r2 = r2.a
                        java.util.List<java.lang.String> r2 = r2.f2220h
                        com.acse.ottn.model.PageSettingTypeModel r1 = r1.a
                        java.util.List r1 = r1.getContainsTextList()
                        com.acse.ottn.d$i$b$a$a r3 = new com.acse.ottn.d$i$b$a$a
                        r3.<init>(r4)
                        r0.a(r2, r1, r3)
                        return
                }
            }

            public b(com.acse.ottn.d.i r1, com.acse.ottn.model.PageSettingTypeModel r2, java.lang.String r3) {
                    r0 = this;
                    r0.f2236c = r1
                    r0.a = r2
                    r0.f2235b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.acse.ottn.d$i r0 = r4.f2236c
                    com.acse.ottn.d r0 = r0.a
                    android.accessibilityservice.AccessibilityService r1 = r0.f2222j
                    r0.b(r1)
                    android.os.Handler r0 = new android.os.Handler
                    r0.<init>()
                    com.acse.ottn.d$i$b$a r1 = new com.acse.ottn.d$i$b$a
                    r1.<init>(r4)
                    r2 = 100
                    r0.postDelayed(r1, r2)
                    return
            }
        }

        public i(com.acse.ottn.d r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(@com.acse.ottn.io.reactivex.annotations.NonNull android.os.Message r11) {
                r10 = this;
                java.lang.String r0 = "com.alipay.mobile.nebulax.xriver.activity.XRiverActivity"
                java.lang.String r1 = "com.tencent.mm.plugin.appbrand.ui.AppBrandUI"
                super.handleMessage(r11)
                com.acse.ottn.d r2 = r10.a
                r3 = 1
                com.acse.ottn.d.a(r2, r3)
                int r2 = r11.what     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r4 = r10.a     // Catch: java.lang.Throwable -> L36
                int r4 = com.acse.ottn.d.d(r4)     // Catch: java.lang.Throwable -> L36
                r5 = 0
                java.lang.String r6 = ""
                java.lang.String r7 = "genuine_packagename"
                java.lang.String r8 = "coupon_packagename"
                if (r2 != r4) goto L39
                com.acse.ottn.l0.f2434e = r3     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r0 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = r0.getString(r8)     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r11 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r11 = r11.getString(r7)     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d.a(r1, r5, r0, r11, r6)     // Catch: java.lang.Throwable -> L36
                return
            L36:
                r11 = move-exception
                goto L1f3
            L39:
                int r2 = r11.what     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r4 = r10.a     // Catch: java.lang.Throwable -> L36
                int r4 = com.acse.ottn.d.e(r4)     // Catch: java.lang.Throwable -> L36
                java.lang.String r9 = "1"
                if (r2 != r4) goto L14b
                java.lang.String r2 = com.acse.ottn.d.b()     // Catch: java.lang.Throwable -> L36
                java.lang.String r4 = "当前状态 =adRequestCode"
                com.acse.ottn.h2.a(r2, r4)     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r2 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r2 = r2.getString(r8)     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r11 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r11 = r11.getString(r7)     // Catch: java.lang.Throwable -> L36
                boolean r4 = r2.contains(r1)     // Catch: java.lang.Throwable -> L36
                if (r4 == 0) goto L66
                r0 = r1
                goto L6c
            L66:
                boolean r1 = r2.contains(r0)     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L6d
            L6c:
                r2 = r0
            L6d:
                java.lang.String r0 = com.acse.ottn.d.b()     // Catch: java.lang.Throwable -> L36
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
                r1.<init>()     // Catch: java.lang.Throwable -> L36
                java.lang.String r4 = "当前状态samon =activityName="
                r1.append(r4)     // Catch: java.lang.Throwable -> L36
                r1.append(r2)     // Catch: java.lang.Throwable -> L36
                java.lang.String r4 = "  genuinePackagename="
                r1.append(r4)     // Catch: java.lang.Throwable -> L36
                r1.append(r11)     // Catch: java.lang.Throwable -> L36
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.h2.a(r0, r1)     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.model.PageSettingTypeModel r0 = r0.d(r2)     // Catch: java.lang.Throwable -> L36
                if (r0 != 0) goto La1
                java.lang.String r11 = com.acse.ottn.d.b()     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = "model 当前状态 is null"
                com.acse.ottn.h2.a(r11, r0)     // Catch: java.lang.Throwable -> L36
                return
            La1:
                com.acse.ottn.l0.f2434e = r3     // Catch: java.lang.Throwable -> L36
                java.lang.String r1 = com.acse.ottn.d.b()     // Catch: java.lang.Throwable -> L36
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
                r4.<init>()     // Catch: java.lang.Throwable -> L36
                java.lang.String r7 = "model 当前状态 ="
                r4.append(r7)     // Catch: java.lang.Throwable -> L36
                java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L36
                r4.append(r7)     // Catch: java.lang.Throwable -> L36
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.h2.a(r1, r4)     // Catch: java.lang.Throwable -> L36
                java.lang.String r1 = r0.getRead_type()     // Catch: java.lang.Throwable -> L36
                java.lang.String r4 = "0"
                boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto Ld5
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = r0.getPackage_name()     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d.a(r1, r5, r0, r11, r6)     // Catch: java.lang.Throwable -> L36
                return
            Ld5:
                java.lang.String r1 = r0.getRead_type()     // Catch: java.lang.Throwable -> L36
                boolean r1 = r1.equals(r9)     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L102
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                boolean r1 = com.acse.ottn.d.a(r1, r2)     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L1f2
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                boolean r1 = com.acse.ottn.d.b(r1, r11)     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L1f2
                com.acse.ottn.d r1 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r2 = r10.a     // Catch: java.lang.Throwable -> L36
                android.accessibilityservice.AccessibilityService r2 = r2.f2222j     // Catch: java.lang.Throwable -> L36
                r1.f(r2)     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.l0.f2436g = r3     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d.a(r1, r0, r11)     // Catch: java.lang.Throwable -> L36
                return
            L102:
                java.lang.String r1 = r0.getRead_type()     // Catch: java.lang.Throwable -> L36
                java.lang.String r2 = "2"
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L121
                android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L36
                r1.<init>()     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d$i$a r2 = new com.acse.ottn.d$i$a     // Catch: java.lang.Throwable -> L36
                r2.<init>(r10, r0, r11)     // Catch: java.lang.Throwable -> L36
                int r11 = r0.getRead_time()     // Catch: java.lang.Throwable -> L36
                long r3 = (long) r11     // Catch: java.lang.Throwable -> L36
                r1.postDelayed(r2, r3)     // Catch: java.lang.Throwable -> L36
                return
            L121:
                java.lang.String r1 = r0.getRead_type()     // Catch: java.lang.Throwable -> L36
                java.lang.String r2 = "999"
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L1f2
                com.acse.ottn.a3 r1 = com.acse.ottn.a3.d()     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r2 = r10.a     // Catch: java.lang.Throwable -> L36
                android.accessibilityservice.AccessibilityService r2 = r2.f2222j     // Catch: java.lang.Throwable -> L36
                r1.a(r2)     // Catch: java.lang.Throwable -> L36
                android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L36
                r1.<init>()     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d$i$b r2 = new com.acse.ottn.d$i$b     // Catch: java.lang.Throwable -> L36
                r2.<init>(r10, r0, r11)     // Catch: java.lang.Throwable -> L36
                int r11 = r0.getRead_time()     // Catch: java.lang.Throwable -> L36
                long r3 = (long) r11     // Catch: java.lang.Throwable -> L36
                r1.postDelayed(r2, r3)     // Catch: java.lang.Throwable -> L36
                return
            L14b:
                int r0 = r11.what     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                int r1 = com.acse.ottn.d.a(r1)     // Catch: java.lang.Throwable -> L36
                if (r0 != r1) goto L178
                java.lang.String r0 = com.acse.ottn.d.b()     // Catch: java.lang.Throwable -> L36
                java.lang.String r1 = "开始获取页面信息"
                com.acse.ottn.h2.c(r0, r1)     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r0 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = r0.getString(r8)     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r11 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r11 = r11.getString(r7)     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.l0.f2436g = r3     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.l0.f2434e = r3     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d.a(r1, r0, r11)     // Catch: java.lang.Throwable -> L36
                return
            L178:
                int r0 = r11.what     // Catch: java.lang.Throwable -> L36
                r1 = 10072(0x2758, float:1.4114E-41)
                if (r0 != r1) goto L1a4
                com.acse.ottn.l0.f2434e = r3     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r0 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = r0.m     // Catch: java.lang.Throwable -> L36
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L36
                if (r0 != 0) goto L1f2
                android.os.Bundle r0 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = r0.getString(r8)     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r11 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r11 = r11.getString(r7)     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                java.util.List<java.lang.String> r2 = r1.f2220h     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d.a(r1, r2, r0, r11, r6)     // Catch: java.lang.Throwable -> L36
                return
            L1a4:
                r1 = 10073(0x2759, float:1.4115E-41)
                if (r0 != r1) goto L1c2
                com.acse.ottn.l0.f2434e = r3     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r0 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = r0.getString(r8)     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r11 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r11 = r11.getString(r7)     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d r1 = r10.a     // Catch: java.lang.Throwable -> L36
                java.util.List<java.lang.String> r2 = r1.f2220h     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d.a(r1, r2, r0, r11, r6)     // Catch: java.lang.Throwable -> L36
                return
            L1c2:
                r1 = 10017(0x2721, float:1.4037E-41)
                if (r0 != r1) goto L1f2
                com.acse.ottn.l0.f2434e = r3     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r11 = r11.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r11 = r11.getString(r8)     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = r0.t     // Catch: java.lang.Throwable -> L36
                boolean r11 = r0.equals(r11)     // Catch: java.lang.Throwable -> L36
                if (r11 != 0) goto L1dd
                goto L1f2
            L1dd:
                com.acse.ottn.n3 r11 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = "ocr_screen_state"
                java.lang.String r11 = r11.e(r0)     // Catch: java.lang.Throwable -> L36
                boolean r11 = r9.equals(r11)     // Catch: java.lang.Throwable -> L36
                if (r11 == 0) goto L1f2
                com.acse.ottn.d r11 = r10.a     // Catch: java.lang.Throwable -> L36
                com.acse.ottn.d.b(r11)     // Catch: java.lang.Throwable -> L36
            L1f2:
                return
            L1f3:
                java.lang.String r0 = com.acse.ottn.d.b()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "mHandler ="
                r1.append(r2)
                java.lang.String r11 = r11.getMessage()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                com.acse.ottn.h2.a(r0, r11)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class j implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.d a;

        public j(com.acse.ottn.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r1 = "battery_white_accessiblity"
                boolean r0 = r0.a(r1)
                if (r0 != 0) goto L1f
                java.lang.String r0 = com.acse.ottn.d.b()
                java.lang.String r1 = "没有打开"
                com.acse.ottn.h2.a(r0, r1)
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "system_open_accessiblity"
                r0.a(r1)
                return
            L1f:
                java.lang.String r0 = com.acse.ottn.d.b()
                java.lang.String r2 = "开始发送 user_open_accessiblity"
                com.acse.ottn.h2.a(r0, r2)
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r2 = "user_open_accessiblity"
                r0.a(r2)
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                if (r0 == 0) goto L40
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.a(r1, r2)
            L40:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class k implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2239b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.d f2240c;

        public k(com.acse.ottn.d r1, android.accessibilityservice.AccessibilityService r2, java.lang.String r3) {
                r0 = this;
                r0.f2240c = r1
                r0.a = r2
                r0.f2239b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "循环结束 ="
                r0.append(r1)
                com.acse.ottn.d r1 = r2.f2240c
                boolean r1 = r1.s
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "samon-->"
                com.acse.ottn.h2.a(r1, r0)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "开始循环 ="
                r0.append(r1)
                com.acse.ottn.d r1 = r3.f2240c
                boolean r1 = r1.s
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "samon-->"
                com.acse.ottn.h2.a(r1, r0)
                com.acse.ottn.d r0 = r3.f2240c
                boolean r1 = r0.s
                if (r1 != 0) goto L28
                android.accessibilityservice.AccessibilityService r1 = r3.a
                java.lang.String r2 = r3.f2239b
                com.acse.ottn.d.a(r0, r1, r2, r4)
                return
            L28:
                java.util.TimerTask r4 = com.acse.ottn.d.w
                if (r4 == 0) goto L32
                r4.cancel()
                r4 = 0
                com.acse.ottn.d.w = r4
            L32:
                return
        }
    }

    static {
            return
    }

    public d() {
            r3 = this;
            r3.<init>()
            r0 = 100
            r3.a = r0
            r0 = 10069(0x2755, float:1.411E-41)
            r3.f2214b = r0
            r0 = 10067(0x2753, float:1.4107E-41)
            r3.f2215c = r0
            r0 = 10065(0x2751, float:1.4104E-41)
            r3.f2216d = r0
            r0 = 0
            r3.f2221i = r0
            r1 = 1
            r3.f2223k = r1
            java.lang.String r1 = ""
            r3.m = r1
            r3.n = r1
            r3.o = r0
            r3.p = r1
            com.acse.ottn.d$i r1 = new com.acse.ottn.d$i
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r3, r2)
            r3.r = r1
            r3.s = r0
            return
    }

    public static /* synthetic */ int a(com.acse.ottn.d r0) {
            int r0 = r0.f2214b
            return r0
    }

    public static /* synthetic */ android.content.Intent a(com.acse.ottn.d r0, android.content.Intent r1) {
            r0.l = r1
            return r1
    }

    public static /* synthetic */ java.lang.String a(com.acse.ottn.d r0, android.accessibilityservice.AccessibilityService r1) {
            java.lang.String r0 = r0.c(r1)
            return r0
    }

    public static /* synthetic */ void a(com.acse.ottn.d r0, android.accessibilityservice.AccessibilityService r1, com.acse.ottn.model.PageSettingTypeModel r2) {
            r0.a(r1, r2)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.d r0, android.accessibilityservice.AccessibilityService r1, java.lang.String r2, long r3) {
            r0.a(r1, r2, r3)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.d r0, com.acse.ottn.model.PageSettingTypeModel r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.d r0, com.acse.ottn.model.PageSettingTypeModel r1, java.lang.String r2) {
            r0.a(r1, r2)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.d r0, java.lang.String r1, java.lang.String r2) {
            r0.b(r1, r2)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.d r0, java.util.List r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.a(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ boolean a(com.acse.ottn.d r0, java.lang.String r1) {
            boolean r0 = r0.b(r1)
            return r0
    }

    public static /* synthetic */ boolean a(com.acse.ottn.d r0, boolean r1) {
            r0.f2223k = r1
            return r1
    }

    public static /* synthetic */ java.lang.String b() {
            java.lang.String r0 = com.acse.ottn.d.z
            return r0
    }

    public static /* synthetic */ void b(com.acse.ottn.d r0) {
            r0.c()
            return
    }

    public static /* synthetic */ boolean b(com.acse.ottn.d r0, java.lang.String r1) {
            boolean r0 = r0.e(r1)
            return r0
    }

    public static /* synthetic */ android.content.Intent c(com.acse.ottn.d r0) {
            android.content.Intent r0 = r0.l
            return r0
    }

    public static /* synthetic */ void c(com.acse.ottn.d r0, java.lang.String r1) {
            r0.d(r1)
            return
    }

    public static /* synthetic */ int d(com.acse.ottn.d r0) {
            int r0 = r0.f2215c
            return r0
    }

    public static com.acse.ottn.d d() {
            com.acse.ottn.d r0 = com.acse.ottn.d.v
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.d> r0 = com.acse.ottn.d.class
            monitor-enter(r0)
            com.acse.ottn.d r1 = com.acse.ottn.d.v     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.d r1 = new com.acse.ottn.d     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.d.v = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.d r0 = com.acse.ottn.d.v
            return r0
    }

    public static /* synthetic */ int e(com.acse.ottn.d r0) {
            int r0 = r0.f2216d
            return r0
    }

    @Override // com.acse.ottn.service.a.u0
    public void a() {
            r2 = this;
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()
            android.accessibilityservice.AccessibilityService r1 = r2.f2222j
            r0.b(r1)
            return
    }

    public void a(android.accessibilityservice.AccessibilityService r8) {
            r7 = this;
            java.lang.String r0 = "关闭"
            java.lang.String r1 = "vivo"
            com.acse.ottn.l2 r2 = new com.acse.ottn.l2
            r2.<init>(r8)
            com.acse.ottn.d.y = r2
            r2.a()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L12b
            if (r2 != 0) goto L16
            goto L12b
        L16:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r3 = "sessionID"
            java.lang.String r2 = r2.e(r3)     // Catch: java.lang.Throwable -> L12b
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L12b
            if (r2 == 0) goto L30
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L12b
            java.lang.Class<com.acse.ottn.service.ExcessiveService> r3 = com.acse.ottn.service.ExcessiveService.class
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L12b
            r8.startService(r2)     // Catch: java.lang.Throwable -> L12b
        L30:
            android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Throwable -> L12b
            r2.<init>()     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.d$j r3 = new com.acse.ottn.d$j     // Catch: java.lang.Throwable -> L12b
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L12b
            r4 = 3000(0xbb8, double:1.482E-320)
            r2.postDelayed(r3, r4)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r3 = "battery_white_accessiblity"
            boolean r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L12b
            if (r2 != 0) goto L53
            java.lang.String r8 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L12b
            java.lang.String r0 = "没有打开"
            com.acse.ottn.h2.a(r8, r0)     // Catch: java.lang.Throwable -> L12b
            return
        L53:
            java.lang.String r2 = com.acse.ottn.n4.b()     // Catch: java.lang.Throwable -> L12b
            r3 = 100
            boolean r5 = r1.equals(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            if (r5 == 0) goto L99
            android.view.accessibility.AccessibilityWindowInfo r5 = r7.i(r8)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            if (r5 == 0) goto L99
            com.acse.ottn.b r6 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.getRoot()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.c(r5, r0)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            if (r5 == 0) goto L99
            com.acse.ottn.b r6 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            r6.c(r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            com.acse.ottn.d r5 = d()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            r5.e(r8)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            r5.a(r3)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.j(r8, r0)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            if (r0 == 0) goto L99
            com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
            r5.c(r0)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> L12b
        L99:
            java.lang.String r0 = "redmi"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L12b
            if (r0 != 0) goto L11d
            java.lang.String r0 = "xiaomi"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L12b
            if (r0 != 0) goto L11d
            boolean r0 = r1.equals(r2)     // Catch: java.lang.Throwable -> L12b
            if (r0 == 0) goto Lb0
            goto L11d
        Lb0:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            r0.e(r8)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            r0.a(r3)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            r0.e(r8)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            r1 = 400(0x190, double:1.976E-321)
            r0.a(r1)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r1 = "已下载的应用"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.j(r8, r1)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r1 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r2 = "已安装的服务"
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.j(r8, r2)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r5 = "已下载的服务"
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.j(r8, r5)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r6 = "已安装的应用程序"
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.j(r8, r6)     // Catch: java.lang.Throwable -> L12b
            if (r0 != 0) goto L107
            if (r1 != 0) goto L107
            if (r2 != 0) goto L107
            if (r5 == 0) goto Lff
            goto L107
        Lff:
            java.lang.String r8 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L12b
            java.lang.String r0 = "都没有找到"
            com.acse.ottn.h2.a(r8, r0)     // Catch: java.lang.Throwable -> L12b
            goto L12b
        L107:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            r0.a(r3)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            r0.e(r8)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r8 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L12b
            java.lang.String r0 = "找到"
            com.acse.ottn.h2.a(r8, r0)     // Catch: java.lang.Throwable -> L12b
            goto L12b
        L11d:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            r0.e(r8)     // Catch: java.lang.Throwable -> L12b
            com.acse.ottn.b r8 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L12b
            r8.a(r3)     // Catch: java.lang.Throwable -> L12b
        L12b:
            return
    }

    public void a(android.accessibilityservice.AccessibilityService r20, android.view.accessibility.AccessibilityEvent r21) {
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "|"
            java.lang.String r3 = "samon-->"
            java.lang.String r4 = "need_click"
            java.lang.String r5 = "click_state"
            java.lang.String r6 = "pay_secure"
            java.lang.String r7 = "currentActivity"
            java.lang.String r8 = com.acse.ottn.d.z
            java.lang.String r9 = "activityFlow"
            com.acse.ottn.h2.a(r8, r9)
            if (r21 == 0) goto Lbe4
            java.lang.CharSequence r8 = r21.getClassName()
            if (r8 == 0) goto Lbe4
            java.lang.CharSequence r8 = r21.getPackageName()
            if (r8 == 0) goto Lbe4
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            if (r8 != 0) goto L2d
            goto Lbe4
        L2d:
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            java.lang.String r9 = "sessionID"
            java.lang.String r8 = r8.e(r9)
            java.lang.CharSequence r9 = r21.getClassName()
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r10 = r21.getPackageName()     // Catch: java.lang.Throwable -> L69
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r12.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = "activityName1 ="
            r12.append(r13)     // Catch: java.lang.Throwable -> L69
            r12.append(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h2.a(r11, r12)     // Catch: java.lang.Throwable -> L69
            boolean r11 = r1.c(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = "dialog"
            if (r11 == 0) goto L6c
            r19.g(r20)     // Catch: java.lang.Throwable -> L69
            goto L8c
        L69:
            r0 = move-exception
            goto Lbd7
        L6c:
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = "androidx.activity."
            boolean r11 = r11.contains(r13)     // Catch: java.lang.Throwable -> L69
            if (r11 == 0) goto L82
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            boolean r11 = r11.contains(r12)     // Catch: java.lang.Throwable -> L69
            if (r11 != 0) goto Lbe4
        L82:
            java.lang.String r11 = "com.jd.lib.hourlygo.home.HourlyGoLayerActivity"
            boolean r11 = r9.contains(r11)     // Catch: java.lang.Throwable -> L69
            if (r11 == 0) goto L8c
            goto Lbe4
        L8c:
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = "launcher"
            boolean r11 = r11.contains(r13)     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = "m"
            r15 = 1
            if (r11 != 0) goto Lde
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            r16 = 0
            java.lang.String r14 = "activity"
            boolean r11 = r11.contains(r14)     // Catch: java.lang.Throwable -> L69
            if (r11 != 0) goto Le0
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "welcome"
            boolean r11 = r11.contains(r14)     // Catch: java.lang.Throwable -> L69
            if (r11 != 0) goto Le0
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "appbrandui"
            boolean r11 = r11.contains(r14)     // Catch: java.lang.Throwable -> L69
            if (r11 != 0) goto Le0
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "frameLayout"
            boolean r11 = r11.contains(r14)     // Catch: java.lang.Throwable -> L69
            if (r11 == 0) goto Lda
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "android.widget"
            boolean r11 = r11.contains(r14)     // Catch: java.lang.Throwable -> L69
            if (r11 != 0) goto Lda
            goto Le0
        Lda:
            r17 = 1
            goto L1d1
        Lde:
            r16 = 0
        Le0:
            java.lang.String r11 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "androidx.activity.o"
            boolean r11 = r11.equals(r14)     // Catch: java.lang.Throwable -> L69
            if (r11 != 0) goto Lda
            r1.p = r9     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.d4.f2243e = r9     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = "com.sankuai.waimai.business"
            boolean r11 = r9.contains(r11)     // Catch: java.lang.Throwable -> L69
            if (r11 != 0) goto Lfa
            r1.s = r15     // Catch: java.lang.Throwable -> L69
        Lfa:
            java.lang.String r11 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            if (r11 == 0) goto L118
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r14.<init>()     // Catch: java.lang.Throwable -> L69
            r14.append(r10)     // Catch: java.lang.Throwable -> L69
            r14.append(r13)     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L69
            boolean r11 = r11.equals(r14)     // Catch: java.lang.Throwable -> L69
            if (r11 == 0) goto L118
            com.acse.ottn.l0.f2436g = r16     // Catch: java.lang.Throwable -> L69
            r17 = 1
            goto L133
        L118:
            java.lang.String r11 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r14.<init>()     // Catch: java.lang.Throwable -> L69
            r17 = 1
            java.lang.String r15 = "activityFlow   CommonUtil.activityName= "
            r14.append(r15)     // Catch: java.lang.Throwable -> L69
            r14.append(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h2.a(r11, r14)     // Catch: java.lang.Throwable -> L69
            r19.g(r20)     // Catch: java.lang.Throwable -> L69
        L133:
            com.acse.ottn.n3 r11 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = r11.e(r7)     // Catch: java.lang.Throwable -> L69
            boolean r11 = r11.equals(r9)     // Catch: java.lang.Throwable -> L69
            if (r11 != 0) goto L195
            com.acse.ottn.l0.f2434e = r16     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r11.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "页面发生变化1="
            r11.append(r14)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r14 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = r14.e(r7)     // Catch: java.lang.Throwable -> L69
            r11.append(r14)     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.i2.a(r11)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r11.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "页面发生变化="
            r11.append(r14)     // Catch: java.lang.Throwable -> L69
            r11.append(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.i2.a(r11)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r11 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            r11.b(r7, r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r11.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "activityFlow  isShowConpunInfor set false currenttime ="
            r11.append(r14)     // Catch: java.lang.Throwable -> L69
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69
            r11.append(r14)     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h2.a(r7, r11)     // Catch: java.lang.Throwable -> L69
            goto L1b2
        L195:
            java.lang.String r7 = "页面未发生变化"
            com.acse.ottn.i2.a(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r7.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = "activityFlow  isShowConpunInfor set false currenttime =currentActivity is not null ="
            r7.append(r11)     // Catch: java.lang.Throwable -> L69
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69
            r7.append(r14)     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.i2.a(r7)     // Catch: java.lang.Throwable -> L69
        L1b2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r7.<init>()     // Catch: java.lang.Throwable -> L69
            r7.append(r10)     // Catch: java.lang.Throwable -> L69
            r7.append(r13)     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L69
            r1.f2217e = r7     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.p0 r7 = com.acse.ottn.l0.a()     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L1d4
            com.acse.ottn.p0 r7 = com.acse.ottn.l0.a()     // Catch: java.lang.Throwable -> L69
            r7.a()     // Catch: java.lang.Throwable -> L69
            goto L1d4
        L1d1:
            r1.h()     // Catch: java.lang.Throwable -> L69
        L1d4:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L1ed
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> L69
            java.lang.Class<com.acse.ottn.service.ExcessiveService> r11 = com.acse.ottn.service.ExcessiveService.class
            r7.<init>(r0, r11)     // Catch: java.lang.Throwable -> L69
            r0.startService(r7)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L69
            r14 = 500(0x1f4, double:2.47E-321)
            r7.a(r14)     // Catch: java.lang.Throwable -> L69
        L1ed:
            r1.f2222j = r0     // Catch: java.lang.Throwable -> L69
            int r7 = r9.hashCode()     // Catch: java.lang.Throwable -> L69
            switch(r7) {
                case -2147408134: goto L4e8;
                case -2035460121: goto L4dd;
                case -1926262962: goto L4d2;
                case -1894061413: goto L4c7;
                case -1832999902: goto L4bc;
                case -1778613177: goto L4b1;
                case -1711619135: goto L4a6;
                case -1620239497: goto L49b;
                case -1579328238: goto L491;
                case -1508085249: goto L485;
                case -1382023482: goto L479;
                case -1380229299: goto L46d;
                case -1175702985: goto L461;
                case -1168029948: goto L455;
                case -1051285494: goto L44a;
                case -1013685858: goto L43f;
                case -967354737: goto L433;
                case -879761336: goto L427;
                case -864439339: goto L41b;
                case -855542259: goto L40f;
                case -574850954: goto L403;
                case -561462688: goto L3f7;
                case -440952030: goto L3eb;
                case -429355372: goto L3df;
                case -397435987: goto L3d3;
                case -323855397: goto L3c7;
                case -319914319: goto L3bc;
                case -247478570: goto L3b0;
                case -212210409: goto L3a4;
                case -160719894: goto L398;
                case -132113995: goto L38c;
                case -126265811: goto L380;
                case -25542545: goto L374;
                case 119410288: goto L368;
                case 131398296: goto L35c;
                case 175783442: goto L350;
                case 361142561: goto L345;
                case 430486676: goto L339;
                case 508356562: goto L32d;
                case 582603330: goto L321;
                case 585822333: goto L315;
                case 683138905: goto L309;
                case 689482707: goto L2fd;
                case 753430532: goto L2f1;
                case 853447490: goto L2e5;
                case 878567688: goto L2d9;
                case 1005675287: goto L2cd;
                case 1047917365: goto L2c1;
                case 1106978691: goto L2b5;
                case 1246223427: goto L2aa;
                case 1283565504: goto L29e;
                case 1312852042: goto L292;
                case 1353420640: goto L286;
                case 1411022673: goto L27a;
                case 1547975815: goto L26e;
                case 1581662071: goto L262;
                case 1635781687: goto L256;
                case 1696199860: goto L24a;
                case 1788912730: goto L23f;
                case 1791471328: goto L233;
                case 1845580919: goto L227;
                case 1895801658: goto L21b;
                case 1987046881: goto L20f;
                case 2037303769: goto L204;
                case 2146674186: goto L1f8;
                default: goto L1f6;
            }     // Catch: java.lang.Throwable -> L69
        L1f6:
            goto L4f3
        L1f8:
            java.lang.String r7 = "com.iqiyi.vipcashier.activity.PhonePayActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 41
            goto L4f4
        L204:
            java.lang.String r7 = "com.taobao.android.detail.wrapper.activity.DetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 0
            goto L4f4
        L20f:
            java.lang.String r7 = "com.sinovatech.unicom.basic.ui.activity.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 14
            goto L4f4
        L21b:
            java.lang.String r7 = "com.sankuai.waimai.store.goods.list.SCSuperMarketActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 28
            goto L4f4
        L227:
            java.lang.String r7 = "me.ele.shopdetailv2.ShopDetailV2Activity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 31
            goto L4f4
        L233:
            java.lang.String r7 = "me.ele.newretail.shop.RetailShopDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 32
            goto L4f4
        L23f:
            java.lang.String r7 = "com.bytedance.android.shopping.anchorv4.containers.AnchorV4Activity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 7
            goto L4f4
        L24a:
            java.lang.String r7 = "com.achievo.vipshop.activity.LodingActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 18
            goto L4f4
        L256:
            java.lang.String r7 = "com.bytedance.android.shopping.anchorv4.containers.ProductDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 8
            goto L4f4
        L262:
            java.lang.String r7 = "com.meituan.android.hotel.search.HotelSearchResultActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 54
            goto L4f4
        L26e:
            java.lang.String r7 = "androidx.appcompat.app.AlertDialog"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 61
            goto L4f4
        L27a:
            java.lang.String r7 = "com.sankuai.waimai.store.drug.home.NewDrugHomeActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 53
            goto L4f4
        L286:
            java.lang.String r7 = "com.didi.sdk.app.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 47
            goto L4f4
        L292:
            java.lang.String r7 = "org.qiyi.android.video.activitys.SecondPageActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 42
            goto L4f4
        L29e:
            java.lang.String r7 = "com.baidu.netdisk.advertise.ui.AdvertiseContentActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 44
            goto L4f4
        L2aa:
            java.lang.String r7 = "com.taobao.android.tbabilitykit.pop.StdPopActivityGroup"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 2
            goto L4f4
        L2b5:
            java.lang.String r7 = "me.ele.newretail.muise.MuiseEShopActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 34
            goto L4f4
        L2c1:
            java.lang.String r7 = "com.starbucks.cn.home.revamp.RevampMainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 30
            goto L4f4
        L2cd:
            java.lang.String r7 = "com.meituan.android.food.deal.FoodDealDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 27
            goto L4f4
        L2d9:
            java.lang.String r7 = "com.sankuai.waimai.business.page.homepage.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 25
            goto L4f4
        L2e5:
            java.lang.String r7 = "com.tmall.wireless.xdetail.activity.TMXDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 40
            goto L4f4
        L2f1:
            java.lang.String r7 = "com.xingin.xhs.index.v2.IndexActivityV2"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 50
            goto L4f4
        L2fd:
            java.lang.String r7 = "com.yxcorp.gifshow.HomeActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 46
            goto L4f4
        L309:
            java.lang.String r7 = "com.ss.android.ugc.aweme.main.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 9
            goto L4f4
        L315:
            java.lang.String r7 = "com.sankuai.waimai.business.knb.TakeoutKNBWebActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 22
            goto L4f4
        L321:
            java.lang.String r7 = "com.achievo.vipshop.homepage.activity.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 16
            goto L4f4
        L32d:
            java.lang.String r7 = "com.meituan.android.takeout.library.business.main.homepage.TakeoutActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 24
            goto L4f4
        L339:
            java.lang.String r7 = "com.sina.weibo.SplashActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 56
            goto L4f4
        L345:
            java.lang.String r7 = "com.taobao.tao.detail.activity.DetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 1
            goto L4f4
        L350:
            java.lang.String r7 = "com.taobao.idlefish.maincontainer.activity.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 55
            goto L4f4
        L35c:
            java.lang.String r7 = "com.alipay.android.living.activity.LivingNotTransparentDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 52
            goto L4f4
        L368:
            java.lang.String r7 = "com.jingdong.manto.card.MantoLightActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 51
            goto L4f4
        L374:
            java.lang.String r7 = "me.ele.search.XSearchActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 33
            goto L4f4
        L380:
            java.lang.String r7 = "com.achievo.vipshop.commons.logic.baseview.NewSpecialInMainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 17
            goto L4f4
        L38c:
            java.lang.String r7 = "com.taobao.tao.backflow.dialog.a"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 57
            goto L4f4
        L398:
            java.lang.String r7 = "com.oplusos.securitypermission.permission.ui.AppStartConfirmDialogActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 63
            goto L4f4
        L3a4:
            java.lang.String r7 = "com.miui.wakepath.ui.ConfirmStartActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 59
            goto L4f4
        L3b0:
            java.lang.String r7 = "com.huaxiaozhu.sdk.app.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 37
            goto L4f4
        L3bc:
            java.lang.String r7 = "com.jd.lib.productdetail.ProductDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 5
            goto L4f4
        L3c7:
            java.lang.String r7 = "com.jingdong.app.mall.MainFrameActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 10
            goto L4f4
        L3d3:
            java.lang.String r7 = "com.vivo.appfilter.activity.AppJumpPromptActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 58
            goto L4f4
        L3df:
            java.lang.String r7 = "com.ct.client.activity.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 12
            goto L4f4
        L3eb:
            java.lang.String r7 = "com.suning.mobile.ebuy.host.MainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 15
            goto L4f4
        L3f7:
            java.lang.String r7 = "com.tencent.qqlive.vc.VCPageActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 48
            goto L4f4
        L403:
            java.lang.String r7 = "com.sankuai.waimai.business.page.homepage.TakeoutActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 23
            goto L4f4
        L40f:
            java.lang.String r7 = "com.mc10086.cmcc.view.tabs.AppTabFragment"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 11
            goto L4f4
        L41b:
            java.lang.String r7 = "com.taobao.tao.TBMainActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 19
            goto L4f4
        L427:
            java.lang.String r7 = "com.baidu.netdisk.ui.cloudp2p.RichMediaActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 43
            goto L4f4
        L433:
            java.lang.String r7 = "me.ele.android.themis_alsc.eleme.container.EleTMSActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 36
            goto L4f4
        L43f:
            java.lang.String r7 = "com.jd.lib.productdetail.ProductDetailPopActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 6
            goto L4f4
        L44a:
            java.lang.String r7 = "com.taobao.android.detail.alittdetail.TTDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 4
            goto L4f4
        L455:
            java.lang.String r7 = "androidx.appcompat.app.a"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 60
            goto L4f4
        L461:
            java.lang.String r7 = "com.taobao.tao.welcome.Welcome"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 20
            goto L4f4
        L46d:
            java.lang.String r7 = "com.ct.client.widget.MyProgressDialogE"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 13
            goto L4f4
        L479:
            java.lang.String r7 = "com.hihonor.securitycenter.appads.AppSplashAdvertiseActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 62
            goto L4f4
        L485:
            java.lang.String r7 = "com.tmall.wireless.maintab.module.TMMainTabActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 21
            goto L4f4
        L491:
            java.lang.String r7 = "com.taobao.live.liveshop.detail.DTLiveShopDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 3
            goto L4f4
        L49b:
            java.lang.String r7 = "com.baidu.netdisk.ui.vipchannel.VipChannelActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 45
            goto L4f4
        L4a6:
            java.lang.String r7 = "com.originui.widget.dialog.d"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 64
            goto L4f4
        L4b1:
            java.lang.String r7 = "me.ele.application.ui.Launcher.LauncherActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 29
            goto L4f4
        L4bc:
            java.lang.String r7 = "me.ele.shopdetailv2.lmagex.ShopDetailV3Activity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 35
            goto L4f4
        L4c7:
            java.lang.String r7 = "com.tmall.wireless.newdetail.activity.NewDetailActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 39
            goto L4f4
        L4d2:
            java.lang.String r7 = "com.youku.android.paysdk.cashier.VipPaymentActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 49
            goto L4f4
        L4dd:
            java.lang.String r7 = "com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 26
            goto L4f4
        L4e8:
            java.lang.String r7 = "com.yum.android.superkfc.ui.v5.HomeV5Activity"
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L4f3
            r7 = 38
            goto L4f4
        L4f3:
            r7 = -1
        L4f4:
            java.lang.String r11 = "mt"
            java.lang.String r14 = "elm"
            java.lang.String r15 = "delay_read_time"
            r18 = r7
            java.lang.String r7 = "scroll_state"
            switch(r18) {
                case 0: goto Lb6a;
                case 1: goto Lb6a;
                case 2: goto Lb6a;
                case 3: goto Lb6a;
                case 4: goto Lb6a;
                case 5: goto Lb29;
                case 6: goto Lb29;
                case 7: goto Lae7;
                case 8: goto Lae7;
                case 9: goto Lac1;
                case 10: goto La9b;
                case 11: goto La75;
                case 12: goto La4f;
                case 13: goto La4f;
                case 14: goto La29;
                case 15: goto La03;
                case 16: goto L9dd;
                case 17: goto L9dd;
                case 18: goto L9dd;
                case 19: goto L9ae;
                case 20: goto L9ae;
                case 21: goto L988;
                case 22: goto L93f;
                case 23: goto L91b;
                case 24: goto L91b;
                case 25: goto L8f5;
                case 26: goto L8d6;
                case 27: goto L8d6;
                case 28: goto L8d6;
                case 29: goto L8b2;
                case 30: goto L88c;
                case 31: goto L85c;
                case 32: goto L85c;
                case 33: goto L85c;
                case 34: goto L85c;
                case 35: goto L85c;
                case 36: goto L85c;
                case 37: goto L836;
                case 38: goto L810;
                case 39: goto L7c6;
                case 40: goto L7c6;
                case 41: goto L7a0;
                case 42: goto L7a0;
                case 43: goto L77a;
                case 44: goto L77a;
                case 45: goto L77a;
                case 46: goto L75a;
                case 47: goto L734;
                case 48: goto L70e;
                case 49: goto L6e8;
                case 50: goto L6c2;
                case 51: goto L69c;
                case 52: goto L676;
                case 53: goto L650;
                case 54: goto L62a;
                case 55: goto L604;
                case 56: goto L5de;
                case 57: goto L5c4;
                case 58: goto L58b;
                case 59: goto L58b;
                case 60: goto L58b;
                case 61: goto L58b;
                case 62: goto L58b;
                case 63: goto L58b;
                case 64: goto L58b;
                default: goto L501;
            }
        L501:
            com.acse.ottn.g3 r3 = com.acse.ottn.g3.a()     // Catch: java.lang.Throwable -> L69
            boolean r3 = r3.a(r0, r9)     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L50d
            goto Lbcd
        L50d:
            com.acse.ottn.f3 r3 = com.acse.ottn.f3.a()     // Catch: java.lang.Throwable -> L69
            boolean r0 = r3.a(r0, r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L519
            goto Lbcd
        L519:
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.h(r3)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L584
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            r0.append(r10)     // Catch: java.lang.Throwable -> L69
            r0.append(r13)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r1.f2217e = r0     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2216d     // Catch: java.lang.Throwable -> L69
            r4 = 0
            r1.a(r9, r0, r3, r4)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "statistic_view"
            java.lang.String r0 = r0.e(r3)     // Catch: java.lang.Throwable -> L69
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L550
            goto Lbe4
        L550:
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r3.<init>()     // Catch: java.lang.Throwable -> L69
            r3.append(r10)     // Catch: java.lang.Throwable -> L69
            r3.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r3.<init>()     // Catch: java.lang.Throwable -> L69
            r3.append(r9)     // Catch: java.lang.Throwable -> L69
            r3.append(r2)     // Catch: java.lang.Throwable -> L69
            r3.append(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L69
            r0.a(r2)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L584:
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            r1.a(r9, r0)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L58b:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            boolean r2 = r2.a(r6)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L5ac
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L69
            r2.a(r6, r3)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L69
            r3 = 300(0x12c, double:1.48E-321)
            r2.a(r3)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h3.q(r0)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L5ac:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            boolean r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L69
            r2.a(r5, r3)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.z4.e(r0)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L5c4:
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h2.a(r0, r12)     // Catch: java.lang.Throwable -> L69
            java.util.TimerTask r0 = com.acse.ottn.d.w     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L5d3
            r0.cancel()     // Catch: java.lang.Throwable -> L69
            r0 = 0
            com.acse.ottn.d.w = r0     // Catch: java.lang.Throwable -> L69
        L5d3:
            com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "coupon_dialog"
            r0.a(r2)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L5de:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "xlwb"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.C     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L604:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "xusy"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.F     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L62a:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "mtms"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.B     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L650:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "mtyy"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.A     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L676:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "zfbvideo"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.v     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L69c:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "jdwm"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.x     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L6c2:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "xhs"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.n     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L6e8:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "youku"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.M     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L70e:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "tencent"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.L     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L734:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "dd"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.K     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L75a:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "ks"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r2 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r3 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r0, r2, r3)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L77a:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "bdwp"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.q     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L7a0:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "aqy"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.S     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L7c6:
            boolean r2 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r2 = r1.e(r2)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            java.lang.CharSequence r2 = r21.getPackageName()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "com.tmall.wireless"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            r19.f(r20)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = com.acse.ottn.l0.p     // Catch: java.lang.Throwable -> L69
            r0.b(r7, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "tm"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.l0.f2436g = r17     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            int r0 = r0.c(r15)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r2 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r2.u     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r4 = r1.f2214b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L80b
            r0 = 2000(0x7d0, float:2.803E-42)
        L80b:
            r1.b(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L810:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "kfc"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.s     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L836:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "hxz"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.r     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L85c:
            java.lang.CharSequence r0 = r21.getPackageName()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "me.ele"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h2.a(r0, r14)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.R     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L88c:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "xbk"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.Q     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L8b2:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h2.a(r0, r14)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.O     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L8d6:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.N     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L8f5:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "mtwm"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.l     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L91b:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h2.a(r0, r11)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.J     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L93f:
            r2 = 3600000(0x36ee80, float:5.044674E-39)
            boolean r2 = r1.a(r9, r2)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r2 = r1.e(r2)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            java.lang.String r2 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.h2.a(r2, r11)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r2.e(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "1"
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            java.lang.String r2 = "TakeoutKNBWebActivity"
            com.acse.ottn.h2.a(r3, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L69
            r5 = 3500(0xdac, double:1.729E-320)
            r2.a(r5)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "读屏"
            com.acse.ottn.h2.a(r3, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "立即领取"
            r1.b(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "0"
            r0.b(r4, r2)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L988:
            boolean r0 = r1.e(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "tmsy"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.V     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L9ae:
            boolean r0 = r1.e(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "tbsy"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.d r0 = d()     // Catch: java.lang.Throwable -> L69
            android.accessibilityservice.AccessibilityService r2 = r1.f2222j     // Catch: java.lang.Throwable -> L69
            r0.f(r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.T     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        L9dd:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "wph"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.f2529b0     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        La03:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "sn"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.X     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        La29:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "lt"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.Z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        La4f:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "dx"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.Y     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        La75:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "yd"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.f2527a0     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        La9b:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "jdsy"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.W     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        Lac1:
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbcd
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "dy"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.I     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            int r4 = r1.a     // Catch: java.lang.Throwable -> L69
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        Lae7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r2.<init>()     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r3 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r3.H     // Catch: java.lang.Throwable -> L69
            r2.append(r3)     // Catch: java.lang.Throwable -> L69
            r2.append(r13)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L69
            r1.f2217e = r2     // Catch: java.lang.Throwable -> L69
            boolean r2 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r2 = r1.e(r2)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            r19.e(r20)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "dysp"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.l0.f2436g = r17     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.H     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r3 = r1.f2215c     // Catch: java.lang.Throwable -> L69
            r4 = 500(0x1f4, float:7.0E-43)
            r1.b(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        Lb29:
            r4 = 500(0x1f4, float:7.0E-43)
            boolean r2 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            java.lang.String r2 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r2 = r1.e(r2)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lbcd
            r19.e(r20)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = com.acse.ottn.l0.p     // Catch: java.lang.Throwable -> L69
            r0.b(r7, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "jdxq"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.l0.f2436g = r17     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            int r0 = r0.c(r15)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r2 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r2.w     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r5 = r1.f2214b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto Lb65
            r15 = 500(0x1f4, float:7.0E-43)
            goto Lb66
        Lb65:
            r15 = r0
        Lb66:
            r1.b(r2, r3, r5, r15)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        Lb6a:
            r4 = 500(0x1f4, float:7.0E-43)
            java.lang.String r2 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "当前是淘宝"
            com.acse.ottn.h2.a(r2, r3)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.d r2 = d()     // Catch: java.lang.Throwable -> L69
            android.accessibilityservice.AccessibilityService r3 = r1.f2222j     // Catch: java.lang.Throwable -> L69
            r2.f(r3)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.a3 r2 = com.acse.ottn.a3.d()     // Catch: java.lang.Throwable -> L69
            r2.a(r0)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.a3 r0 = com.acse.ottn.a3.d()     // Catch: java.lang.Throwable -> L69
            r2 = 0
            r0.f2060b = r2     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = com.acse.ottn.l0.p     // Catch: java.lang.Throwable -> L69
            r0.b(r7, r2)     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.b(r9)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbc6
            java.lang.String r0 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1.e(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Lbc6
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "当前是淘宝请求"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.l0.f2436g = r17     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L69
            int r0 = r0.c(r15)     // Catch: java.lang.Throwable -> L69
            com.acse.ottn.o r2 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r2.t     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r1.f2217e     // Catch: java.lang.Throwable -> L69
            int r5 = r1.f2214b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto Lbc1
            r15 = 500(0x1f4, float:7.0E-43)
            goto Lbc2
        Lbc1:
            r15 = r0
        Lbc2:
            r1.b(r2, r3, r5, r15)     // Catch: java.lang.Throwable -> L69
            goto Lbcd
        Lbc6:
            java.lang.String r0 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "当前是淘宝请求间隔"
            com.acse.ottn.h2.a(r0, r2)     // Catch: java.lang.Throwable -> L69
        Lbcd:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto Lbe4
            r1.h()     // Catch: java.lang.Throwable -> L69
            return
        Lbd7:
            java.lang.String r2 = com.acse.ottn.d.z
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
        Lbe4:
            return
    }

    public void a(android.accessibilityservice.AccessibilityService r4, com.acse.ottn.model.AccessiblityModel r5) {
            r3 = this;
            com.acse.ottn.l4 r0 = com.acse.ottn.l4.c()
            java.lang.String r1 = r3.f2217e
            com.acse.ottn.d$f r2 = new com.acse.ottn.d$f
            r2.<init>(r3, r4)
            r0.a(r4, r5, r1, r2)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final void a(android.accessibilityservice.AccessibilityService r3, com.acse.ottn.model.PageSettingTypeModel r4) {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.f2219g
            if (r0 == 0) goto La
            r0.removeAll(r0)
            r0 = 0
            r2.f2219g = r0
        La:
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            r2.f2219g = r1     // Catch: java.lang.Throwable -> L1c
            r2.f2221i = r0     // Catch: java.lang.Throwable -> L1c
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getRootInActiveWindow()     // Catch: java.lang.Throwable -> L1c
            r2.a(r3, r4)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r3 = move-exception
            java.util.List<java.lang.String> r4 = r2.f2219g
            if (r4 == 0) goto L34
            r4.removeAll(r4)
            java.util.List<java.lang.String> r4 = r2.f2219g
            r4.clear()
            r2.f2221i = r0
            java.lang.String r4 = com.acse.ottn.d.z
            java.lang.String r3 = r3.getMessage()
            com.acse.ottn.h2.a(r4, r3)
        L34:
            return
    }

    public void a(android.accessibilityservice.AccessibilityService r4, java.lang.String r5) {
            r3 = this;
            int r0 = r5.length()
            r1 = 10
            if (r0 >= r1) goto L9
            goto L56
        L9:
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getJDTitleId = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L54
            r1 = 1
            android.view.accessibility.AccessibilityNodeInfo r4 = r0.a(r4, r5, r1)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L57
            java.lang.String r4 = r4.getViewIdResourceName()     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "getJDTitleId jd id is "
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            r0.append(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L54
            com.acse.ottn.h2.a(r5, r0)     // Catch: java.lang.Throwable -> L54
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L56
            com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "jd_view_id"
            r5.b(r0, r4)     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r4 = move-exception
            goto L5f
        L56:
            return
        L57:
            java.lang.String r4 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "nodeInfo = null"
            com.acse.ottn.h2.a(r4, r5)     // Catch: java.lang.Throwable -> L54
            return
        L5f:
            java.lang.String r5 = com.acse.ottn.d.z
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getViewId Throwable e ="
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.acse.ottn.h2.a(r5, r4)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final void a(android.accessibilityservice.AccessibilityService r1, java.lang.String r2, long r3) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getRootInActiveWindow()     // Catch: java.lang.Throwable -> L7
            r0.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void a(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.u = r0
            r1.b(r2)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r2 = r2.getMessage()
            com.acse.ottn.h2.a(r0, r2)
            return
    }

    public void a(android.view.accessibility.AccessibilityNodeInfo r5, com.acse.ottn.model.PageSettingTypeModel r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L136
            int r1 = r5.getChildCount()
            if (r1 != 0) goto L136
            java.lang.CharSequence r1 = r5.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "samon-->12"
            r3 = 300(0x12c, float:4.2E-43)
            if (r1 != 0) goto L6c
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            com.acse.ottn.t0 r6 = com.acse.ottn.t0.b()
            int r1 = r4.f2221i
            int r6 = r6.a(r5, r1)
            r4.f2221i = r6
            com.acse.ottn.t0 r6 = com.acse.ottn.t0.b()
            int r1 = r4.f2221i
            boolean r6 = r6.a(r1)
            if (r6 == 0) goto L5d
            java.util.List<java.lang.String> r6 = r4.f2219g
            int r6 = r6.size()
            if (r6 >= r3) goto L5d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "getText = "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.acse.ottn.h2.c(r2, r6)
            java.util.List<java.lang.String> r6 = r4.f2219g
            r6.add(r5)
            return
        L5d:
            java.util.List<java.lang.String> r5 = r4.f2219g
            if (r5 == 0) goto L159
            r5.removeAll(r5)
            java.util.List<java.lang.String> r5 = r4.f2219g
            r5.clear()
            r4.f2221i = r0
            return
        L6c:
            java.lang.CharSequence r1 = r5.getContentDescription()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L159
            java.lang.CharSequence r5 = r5.getContentDescription()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r6.getRead_description()
            java.lang.String r1 = "1"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto Ld3
            com.acse.ottn.t0 r6 = com.acse.ottn.t0.b()
            int r1 = r4.f2221i
            int r6 = r6.a(r5, r1)
            r4.f2221i = r6
            com.acse.ottn.t0 r6 = com.acse.ottn.t0.b()
            int r1 = r4.f2221i
            boolean r6 = r6.a(r1)
            if (r6 == 0) goto Lc4
            java.util.List<java.lang.String> r6 = r4.f2219g
            int r6 = r6.size()
            if (r6 >= r3) goto Lc4
            java.util.List<java.lang.String> r6 = r4.f2219g
            r6.add(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "getContentDescription = "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.acse.ottn.h2.c(r2, r5)
            return
        Lc4:
            java.util.List<java.lang.String> r5 = r4.f2219g
            if (r5 == 0) goto L159
            r5.removeAll(r5)
            java.util.List<java.lang.String> r5 = r4.f2219g
            r5.clear()
            r4.f2221i = r0
            return
        Ld3:
            java.lang.String r6 = "月销"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto Lfb
            java.lang.String r6 = "已售"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto Lfb
            java.lang.String r6 = "[1-9]\\d*\\.?\\d*"
            boolean r6 = r5.matches(r6)
            if (r6 != 0) goto Lfb
            java.lang.String r6 = "￥"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto Lfb
            java.lang.String r6 = "¥"
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L159
        Lfb:
            com.acse.ottn.t0 r6 = com.acse.ottn.t0.b()
            int r1 = r4.f2221i
            int r6 = r6.a(r5, r1)
            r4.f2221i = r6
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L127
            com.acse.ottn.t0 r6 = com.acse.ottn.t0.b()
            int r1 = r4.f2221i
            boolean r6 = r6.a(r1)
            if (r6 == 0) goto L127
            java.util.List<java.lang.String> r6 = r4.f2219g
            int r6 = r6.size()
            if (r6 >= r3) goto L127
            java.util.List<java.lang.String> r6 = r4.f2219g
            r6.add(r5)
            return
        L127:
            java.util.List<java.lang.String> r5 = r4.f2219g
            if (r5 == 0) goto L159
            r5.removeAll(r5)
            java.util.List<java.lang.String> r5 = r4.f2219g
            r5.clear()
            r4.f2221i = r0
            return
        L136:
            if (r5 == 0) goto L159
        L138:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto L159
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)     // Catch: java.lang.Throwable -> L14c
            if (r1 == 0) goto L156
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)     // Catch: java.lang.Throwable -> L14c
            r4.a(r1, r6)     // Catch: java.lang.Throwable -> L14c
            goto L156
        L14c:
            r1 = move-exception
            java.lang.String r2 = com.acse.ottn.d.z
            java.lang.String r1 = r1.getMessage()
            com.acse.ottn.h2.a(r2, r1)
        L156:
            int r0 = r0 + 1
            goto L138
        L159:
            return
    }

    public final void a(android.view.accessibility.AccessibilityNodeInfo r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L31
            if (r3 == 0) goto Lf
            java.lang.CharSequence r0 = r3.getText()
            if (r0 != 0) goto Lf
            goto L31
        Lf:
            java.lang.CharSequence r0 = r3.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L31
            int r4 = r0.length()
            r1 = 3
            if (r4 == r1) goto L2f
            int r4 = r0.length()
            r0 = 5
            if (r4 != r0) goto L31
        L2f:
            r2.t = r3
        L31:
            return
    }

    public void a(android.view.accessibility.AccessibilityNodeInfo r6, java.lang.String r7, long r8) {
            r5 = this;
            if (r6 == 0) goto L9c
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L9c
            java.lang.CharSequence r0 = r6.getText()     // Catch: java.lang.Exception -> Lc0
            java.lang.CharSequence r1 = r6.getContentDescription()     // Catch: java.lang.Exception -> Lc0
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lc0
            if (r2 != 0) goto Lc0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Exception -> Lc0
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Exception -> Lc0
            r2 = 1
            java.lang.String r3 = "=找到了 并且已经点击 text ="
            java.lang.String r4 = "samon-->"
            if (r0 == 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r0.<init>()     // Catch: java.lang.Exception -> Lc0
            r0.append(r8)     // Catch: java.lang.Exception -> Lc0
            r0.append(r3)     // Catch: java.lang.Exception -> Lc0
            r0.append(r7)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> Lc0
            com.acse.ottn.h2.a(r4, r7)     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r7.<init>()     // Catch: java.lang.Exception -> Lc0
            r7.append(r8)     // Catch: java.lang.Exception -> Lc0
            r7.append(r3)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Exception -> Lc0
            r7.append(r8)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Lc0
            com.acse.ottn.h2.a(r4, r7)     // Catch: java.lang.Exception -> Lc0
            boolean r7 = r5.s     // Catch: java.lang.Exception -> Lc0
            if (r7 != 0) goto Lc0
            r5.s = r2     // Catch: java.lang.Exception -> Lc0
            com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> Lc0
            r7.g(r6)     // Catch: java.lang.Exception -> Lc0
            return
        L65:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lc0
            if (r0 != 0) goto Lc0
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Exception -> Lc0
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Exception -> Lc0
            if (r0 == 0) goto Lc0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r0.<init>()     // Catch: java.lang.Exception -> Lc0
            r0.append(r8)     // Catch: java.lang.Exception -> Lc0
            r0.append(r3)     // Catch: java.lang.Exception -> Lc0
            r0.append(r7)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> Lc0
            com.acse.ottn.h2.a(r4, r7)     // Catch: java.lang.Exception -> Lc0
            boolean r7 = r5.s     // Catch: java.lang.Exception -> Lc0
            if (r7 != 0) goto Lc0
            r5.s = r2     // Catch: java.lang.Exception -> Lc0
            com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> Lc0
            r7.g(r6)     // Catch: java.lang.Exception -> Lc0
            return
        L9c:
            if (r6 == 0) goto Lc0
            r0 = 0
        L9f:
            int r1 = r6.getChildCount()
            if (r0 >= r1) goto Lc0
            android.view.accessibility.AccessibilityNodeInfo r1 = r6.getChild(r0)     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lbd
            android.view.accessibility.AccessibilityNodeInfo r1 = r6.getChild(r0)     // Catch: java.lang.Throwable -> Lb3
            r5.a(r1, r7, r8)     // Catch: java.lang.Throwable -> Lb3
            goto Lbd
        Lb3:
            r1 = move-exception
            java.lang.String r2 = com.acse.ottn.d.z
            java.lang.String r1 = r1.getMessage()
            com.acse.ottn.h2.a(r2, r1)
        Lbd:
            int r0 = r0 + 1
            goto L9f
        Lc0:
            return
    }

    public void a(com.acse.ottn.model.AccessiblityModel r5, java.lang.String r6) {
            r4 = this;
            com.acse.ottn.a3 r0 = com.acse.ottn.a3.d()
            r0.b()
            int r0 = r5.getR()
            r1 = 1
            if (r1 != r0) goto L41
            com.acse.ottn.o r0 = com.acse.ottn.o.c()
            java.lang.String r0 = r0.l
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L27
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.l
            r0.setPackage_name(r1)
        L27:
            r4.b(r5, r6)
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getNeed_click()
            java.lang.String r1 = "need_click"
            r6.b(r1, r0)
            android.accessibilityservice.AccessibilityService r6 = r4.f2222j
            r4.a(r6, r5)
            return
        L41:
            int r0 = r5.getR()
            if (r0 != 0) goto La7
            java.lang.String r0 = r5.getScrolled_screen()
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = r5.getScrolled_screen()
            java.lang.String r3 = "scroll_state"
            r0.b(r3, r2)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = r5.getProduct_info()
            java.lang.String r3 = "goods_info"
            r0.b(r3, r2)
        L6d:
            r4.b(r5, r6)
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r5.getData()
            if (r6 == 0) goto L95
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r5.getData()
            java.lang.String r6 = r6.getSpop_describe()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L95
            com.acse.ottn.d r6 = d()
            android.accessibilityservice.AccessibilityService r0 = r4.f2222j
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r5.getData()
            java.lang.String r2 = r2.getSpop_describe()
            r6.a(r0, r2)
        L95:
            boolean r6 = com.acse.ottn.activity.AcseHelpManager.mIsDebug
            if (r6 != 0) goto La7
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r5.getData()
            java.lang.String r5 = r5.getDebug_state()
            boolean r5 = r5.equals(r1)
            com.acse.ottn.l0.f2433d = r5
        La7:
            return
    }

    public final void a(com.acse.ottn.model.PageSettingTypeModel r4) {
            r3 = this;
            java.util.TimerTask r0 = com.acse.ottn.d.w
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            com.acse.ottn.d.w = r0
        La:
            java.lang.String r0 = "request_time"
            r1 = 1500(0x5dc, float:2.102E-42)
            boolean r0 = r3.a(r0, r1)
            if (r0 != 0) goto L15
            goto L53
        L15:
            java.lang.String r0 = r4.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.w
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.String r0 = r4.getIs_click_jd_title()
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            android.accessibilityservice.AccessibilityService r0 = r3.f2222j
            java.lang.String r0 = r3.c(r0)
            r3.q = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L46
            java.util.List<java.lang.String> r0 = r3.f2219g
            java.lang.String r1 = r3.q
            r0.add(r1)
        L46:
            r0 = 0
            com.acse.ottn.l0.f2436g = r0
            java.util.List<java.lang.String> r0 = r3.f2219g
            if (r0 == 0) goto L54
            int r0 = r0.size()
            if (r0 != 0) goto L54
        L53:
            return
        L54:
            java.util.List<java.lang.String> r0 = r3.f2219g
            java.lang.String r4 = r4.getPackage_name()
            java.lang.String r1 = r3.f2217e
            java.lang.String r2 = r3.q
            r3.a(r0, r4, r1, r2)
            return
    }

    public final void a(com.acse.ottn.model.PageSettingTypeModel r4, java.lang.String r5) {
            r3 = this;
            java.util.TimerTask r0 = com.acse.ottn.d.w
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            com.acse.ottn.d.w = r0
        La:
            com.acse.ottn.a3 r0 = com.acse.ottn.a3.d()
            r0.b()
            java.util.List<java.lang.String> r0 = r3.f2219g
            if (r0 == 0) goto L1d
            r0.removeAll(r0)
            java.util.List<java.lang.String> r0 = r3.f2219g
            r0.clear()
        L1d:
            r0 = 0
            r3.f2221i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f2219g = r0
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            int r1 = r4.getRead_time()
            com.acse.ottn.d$d r2 = new com.acse.ottn.d$d
            r2.<init>(r3, r4, r5)
            r4 = 400(0x190, float:5.6E-43)
            java.util.TimerTask r4 = r0.b(r1, r4, r2)
            com.acse.ottn.d.w = r4
            return
    }

    @Override // com.acse.ottn.service.a.u0
    public void a(java.lang.String r3) {
            r2 = this;
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.c()
            com.acse.ottn.d$c r1 = new com.acse.ottn.d$c
            r1.<init>(r2, r3)
            r0.a(r3, r1)
            return
    }

    public void a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r1 = "onNoSelectActivity"
            com.acse.ottn.h2.a(r0, r1)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r0 = "android.widget"
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L19
            r2.f2217e = r4
            java.lang.String r3 = ""
            r2.f2218f = r3
        L19:
            return
    }

    public void a(java.lang.String r3, java.lang.String r4, int r5, int r6) {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r1 = "onAdCallBack"
            com.acse.ottn.h2.a(r0, r1)
            r2.f2217e = r4
            boolean r0 = r2.f2223k
            if (r0 == 0) goto L17
            r0 = 0
            r2.f2223k = r0
            java.lang.String r0 = ""
            r2.f2218f = r0
            r2.c(r3, r4, r5, r6)
        L17:
            return
    }

    public final void a(java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            boolean r0 = r6.o
            if (r0 == 0) goto L25
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "设置时间3="
            r7.append(r8)
            long r8 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r0
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "samon-->"
            com.acse.ottn.h2.a(r8, r7)
            r6.f()
            return
        L25:
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.c()
            com.acse.ottn.d$e r5 = new com.acse.ottn.d$e
            r5.<init>(r6, r8)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    public final boolean a(java.lang.String r1, int r2) {
            r0 = this;
            boolean r1 = r0.b(r1, r2)
            return r1
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void b(android.accessibilityservice.AccessibilityService r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f2220h
            if (r0 == 0) goto La
            r0.removeAll(r0)
            r0 = 0
            r1.f2220h = r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            r1.f2220h = r0     // Catch: java.lang.Throwable -> L19
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()     // Catch: java.lang.Throwable -> L19
            r1.c(r2)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r2 = move-exception
            java.util.List<java.lang.String> r0 = r1.f2220h
            if (r0 == 0) goto L2f
            r0.removeAll(r0)
            java.util.List<java.lang.String> r0 = r1.f2220h
            r0.clear()
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r2 = r2.getMessage()
            com.acse.ottn.h2.a(r0, r2)
        L2f:
            return
    }

    public void b(android.accessibilityservice.AccessibilityService r10, android.view.accessibility.AccessibilityEvent r11) {
            r9 = this;
            java.lang.String r0 = "|"
            java.lang.String r1 = ","
            java.lang.String r2 = "，"
            java.lang.String r3 = "local_toast_status"
            java.lang.String r4 = "samon-->"
            java.lang.String r5 = r9.p
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L14
            goto L276
        L14:
            r9.h(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r10.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "页面地址="
            r10.append(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r9.p     // Catch: java.lang.Throwable -> L64
            r10.append(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.h2.a(r4, r10)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L64
            int r10 = r10.c(r3)     // Catch: java.lang.Throwable -> L64
            if (r10 != 0) goto L39
            goto L276
        L39:
            com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "view_gather"
            java.lang.String r5 = r5.e(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r6.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = "view_gather中内容="
            r6.append(r7)     // Catch: java.lang.Throwable -> L64
            r6.append(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.h2.a(r4, r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r9.p     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L67
            boolean r5 = com.acse.ottn.activity.AcseHelpManager.mIsDebug     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L276
            goto L67
        L64:
            r10 = move-exception
            goto L277
        L67:
            java.lang.String r5 = "在view_gather中"
            com.acse.ottn.h2.a(r4, r5)     // Catch: java.lang.Throwable -> L64
            if (r11 == 0) goto L276
            java.util.List r5 = r11.getText()     // Catch: java.lang.Throwable -> L64
            java.lang.CharSequence r11 = r11.getContentDescription()     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = " "
            r7 = 0
            if (r5 == 0) goto Laf
            int r8 = r5.size()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            if (r8 == 0) goto Laf
            java.lang.Object r8 = r5.get(r7)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            if (r8 == 0) goto Laf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r11.<init>()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.String r1 = "source.getText()= "
            r11.append(r1)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r11.append(r5)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            com.acse.ottn.h2.a(r4, r11)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.Object r11 = r5.get(r7)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.String[] r11 = r11.split(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r11 = r11[r7]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            goto L109
        Lac:
            r10 = move-exception
            goto L264
        Laf:
            boolean r5 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            if (r5 != 0) goto L276
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.String r8 = "source.getContentDescription()= "
            r5.append(r8)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r5.append(r11)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            com.acse.ottn.h2.a(r4, r5)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            java.lang.String r11 = r11.trim()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            boolean r5 = r11.contains(r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            if (r5 == 0) goto Lea
            java.lang.String[] r11 = r11.split(r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r11 = r11[r7]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            boolean r1 = r11.contains(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            if (r1 == 0) goto L109
            java.lang.String[] r11 = r11.split(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r11 = r11[r7]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            goto L109
        Lea:
            boolean r2 = r11.contains(r1)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            if (r2 == 0) goto L103
            java.lang.String[] r11 = r11.split(r1)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r11 = r11[r7]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            boolean r1 = r11.contains(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            if (r1 == 0) goto L109
            java.lang.String[] r11 = r11.split(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r11 = r11[r7]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            goto L109
        L103:
            java.lang.String[] r11 = r11.split(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
            r11 = r11[r7]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> Lac
        L109:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r1.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "text="
            r1.append(r2)     // Catch: java.lang.Throwable -> L64
            r1.append(r11)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.h2.a(r4, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r1.<init>()     // Catch: java.lang.Throwable -> L64
            r1.append(r11)     // Catch: java.lang.Throwable -> L64
            r1.append(r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = r9.p     // Catch: java.lang.Throwable -> L64
            r1.append(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "list key ="
            r2.append(r5)     // Catch: java.lang.Throwable -> L64
            r2.append(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.h2.a(r4, r2)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L64
            r5.append(r11)     // Catch: java.lang.Throwable -> L64
            r5.append(r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = r9.p     // Catch: java.lang.Throwable -> L64
            r5.append(r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.model.WxClickDataModel r0 = r2.e(r0)     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L16c
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.model.WxClickDataModel r0 = r0.e(r11)     // Catch: java.lang.Throwable -> L64
            goto L16d
        L16c:
            r11 = r1
        L16d:
            boolean r1 = com.acse.ottn.activity.AcseHelpManager.mIsDebug     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "点击处文字="
            if (r1 == 0) goto L18c
            com.acse.ottn.p4 r1 = com.acse.ottn.p4.a()     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L64
            r5.append(r2)     // Catch: java.lang.Throwable -> L64
            r5.append(r11)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "未知"
            r7 = 7
            r1.a(r7, r5, r6)     // Catch: java.lang.Throwable -> L64
        L18c:
            if (r0 != 0) goto L194
            java.lang.String r10 = "wxClickApplet model is null"
            com.acse.ottn.h2.a(r4, r10)     // Catch: java.lang.Throwable -> L64
            return
        L194:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L64
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            java.lang.Long r1 = r0.getToast_ck_time()     // Catch: java.lang.Throwable -> L64
            long r7 = r1.longValue()     // Catch: java.lang.Throwable -> L64
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L1ad
            java.lang.String r10 = "wxClickApplet getToast_ck_time  is not be up to the mustard"
            com.acse.ottn.h2.a(r4, r10)     // Catch: java.lang.Throwable -> L64
            return
        L1ad:
            long r7 = r0.getToast_ck()     // Catch: java.lang.Throwable -> L64
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L1bb
            java.lang.String r10 = "wxClickApplet Toast_ck  is not be up to the mustard"
            com.acse.ottn.h2.a(r4, r10)     // Catch: java.lang.Throwable -> L64
            return
        L1bb:
            boolean r1 = com.acse.ottn.activity.AcseHelpManager.mIsDebug     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L1d9
            com.acse.ottn.p4 r1 = com.acse.ottn.p4.a()     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r7.<init>()     // Catch: java.lang.Throwable -> L64
            r7.append(r2)     // Catch: java.lang.Throwable -> L64
            r7.append(r11)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = "存在"
            r8 = 8
            r1.a(r8, r2, r7)     // Catch: java.lang.Throwable -> L64
        L1d9:
            int r1 = r0.getToast_times()     // Catch: java.lang.Throwable -> L64
            r2 = 1
            int r1 = r1 - r2
            r0.setToast_times(r1)     // Catch: java.lang.Throwable -> L64
            long r7 = r0.getToast_ck()     // Catch: java.lang.Throwable -> L64
            long r7 = r7 + r5
            r0.setToast_ck(r7)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()     // Catch: java.lang.Throwable -> L64
            r1.a(r11, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r0.getRequest_service_state()     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "1"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L20d
            java.lang.String r10 = "wxClickApplet request service"
            com.acse.ottn.h2.a(r4, r10)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.l0.f2434e = r2     // Catch: java.lang.Throwable -> L64
            java.lang.String r10 = "click_type"
            java.lang.String r0 = ""
            r1 = 0
            r9.a(r1, r11, r10, r0)     // Catch: java.lang.Throwable -> L64
            goto L25e
        L20d:
            java.lang.String r1 = "wxClickApplet jop"
            com.acse.ottn.h2.a(r4, r1)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L64
            int r10 = r10 - r2
            r1.a(r3, r10)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.b r10 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L64
            long r3 = r0.getToast_show_time()     // Catch: java.lang.Throwable -> L64
            r10.a(r3)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.model.AccessiblityModel r10 = new com.acse.ottn.model.AccessiblityModel     // Catch: java.lang.Throwable -> L64
            r10.<init>()     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r10.getData()     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r0.getToast_type()     // Catch: java.lang.Throwable -> L64
            r1.setJump_type(r3)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r10.getData()     // Catch: java.lang.Throwable -> L64
            r1.setPackage_name(r11)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r10.getData()     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r0.getLink()     // Catch: java.lang.Throwable -> L64
            r1.setSpop_link(r3)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r10.getData()     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = r0.getDeeplink()     // Catch: java.lang.Throwable -> L64
            r1.setSpop_deeplink(r0)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.l4 r0 = com.acse.ottn.l4.c()     // Catch: java.lang.Throwable -> L64
            android.accessibilityservice.AccessibilityService r1 = r9.f2222j     // Catch: java.lang.Throwable -> L64
            r0.a(r1, r10)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.r1.d(r11)     // Catch: java.lang.Throwable -> L64
        L25e:
            r9.o = r2     // Catch: java.lang.Throwable -> L64
            r9.f()     // Catch: java.lang.Throwable -> L64
            return
        L264:
            java.lang.String r11 = "wxClickApplet is error"
            com.acse.ottn.h2.a(r4, r11)     // Catch: java.lang.Throwable -> L64
            java.lang.String r11 = com.acse.ottn.d.z     // Catch: java.lang.Throwable -> L64
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L64
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.h2.a(r11, r10)     // Catch: java.lang.Throwable -> L64
        L276:
            return
        L277:
            java.lang.String r11 = com.acse.ottn.d.z
            java.lang.String r10 = r10.getMessage()
            java.lang.String r10 = r10.toString()
            com.acse.ottn.h2.a(r11, r10)
            return
    }

    public void b(android.accessibilityservice.AccessibilityService r9, com.acse.ottn.model.AccessiblityModel r10) {
            r8 = this;
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r1 = "showFloatWindow"
            com.acse.ottn.h2.a(r0, r1)
            if (r10 != 0) goto La
            return
        La:
            r10.getGenuine_packagename()
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            r0.getPackage_name()
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getCoupon_show_package_name()
            java.lang.String r1 = "defined_coupon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            java.lang.String r0 = r10.getGenuine_packagename()
            java.lang.String r1 = r8.f2218f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            com.acse.ottn.e r9 = com.acse.ottn.e.c()
            r9.a(r10)
            return
        L38:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            java.lang.String r2 = "4"
            java.lang.String r3 = "3"
            r4 = 0
            r6 = 1
            java.lang.String r7 = "2"
            if (r0 < r1) goto L12e
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "popup_state"
            java.lang.String r0 = r0.e(r1)
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f
            boolean r0 = l.q.a(r9)
            if (r0 != 0) goto L12e
        L5f:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lb6
            com.acse.ottn.d2 r0 = com.acse.ottn.d2.b()
            r0.a(r10)
            com.acse.ottn.l0.f2435f = r6
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            int r0 = r0.getSecond_price()
            if (r0 == 0) goto L8e
            com.acse.ottn.e2 r0 = com.acse.ottn.e2.a()
            r0.a(r9)
            com.acse.ottn.e2 r0 = com.acse.ottn.e2.a()
            r0.a(r9, r10)
        L8e:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.acse.ottn.d$g r1 = new com.acse.ottn.d$g
            r1.<init>(r8, r9, r10)
            com.acse.ottn.model.AccessiblityModel$DataBean r9 = r10.getData()
            int r9 = r9.getSecond_price()
            if (r9 != 0) goto La7
            goto Lb2
        La7:
            com.acse.ottn.model.AccessiblityModel$DataBean r9 = r10.getData()
            int r9 = r9.getSecond_price()
            int r9 = r9 + 400
            long r4 = (long) r9
        Lb2:
            r0.postDelayed(r1, r4)
            return
        Lb6:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld3
            com.acse.ottn.i0 r0 = com.acse.ottn.i0.d()
            r0.a(r9)
            com.acse.ottn.i0 r0 = com.acse.ottn.i0.d()
            r0.b(r9, r10)
            return
        Ld3:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf0
            com.acse.ottn.o0 r0 = com.acse.ottn.o0.a()
            r0.a(r9)
            com.acse.ottn.o0 r0 = com.acse.ottn.o0.a()
            r0.b(r9, r10)
            return
        Lf0:
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()
            r0.a(r9)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getService_control()
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L10f
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()
            r0.c(r9, r10, r8)
            goto L124
        L10f:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getService_control()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L124
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()
            r0.a(r9, r10, r8)
        L124:
            com.acse.ottn.q2 r9 = com.acse.ottn.q2.b()
            java.lang.String r10 = "flow_window_false"
            r9.a(r10)
            return
        L12e:
            android.content.Intent r0 = r8.l
            if (r0 == 0) goto L141
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r1 = "showFloatWindow stop floatIntent"
            com.acse.ottn.h2.a(r0, r1)
            android.content.Intent r0 = r8.l
            r9.stopService(r0)
            r0 = 0
            r8.l = r0
        L141:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r7.equals(r0)
            java.lang.String r1 = "model"
            if (r0 == 0) goto L19d
            com.acse.ottn.d2 r0 = com.acse.ottn.d2.b()
            r0.a(r10)
            com.acse.ottn.l0.f2435f = r6
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            int r0 = r0.getSecond_price()
            if (r0 == 0) goto L175
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.acse.ottn.service.LjFirstService> r2 = com.acse.ottn.service.LjFirstService.class
            r0.<init>(r9, r2)
            r8.l = r0
            r0.putExtra(r1, r10)
            android.content.Intent r0 = r8.l
            r9.startService(r0)
        L175:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.acse.ottn.d$h r1 = new com.acse.ottn.d$h
            r1.<init>(r8, r9, r10)
            com.acse.ottn.model.AccessiblityModel$DataBean r9 = r10.getData()
            int r9 = r9.getSecond_price()
            if (r9 != 0) goto L18e
            goto L199
        L18e:
            com.acse.ottn.model.AccessiblityModel$DataBean r9 = r10.getData()
            int r9 = r9.getSecond_price()
            int r9 = r9 + 400
            long r4 = (long) r9
        L199:
            r0.postDelayed(r1, r4)
            return
        L19d:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1bd
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.acse.ottn.service.CircleFlowService> r2 = com.acse.ottn.service.CircleFlowService.class
            r0.<init>(r9, r2)
            r8.l = r0
            r0.putExtra(r1, r10)
            android.content.Intent r10 = r8.l
            r9.startService(r10)
            return
        L1bd:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1dd
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.acse.ottn.service.CountdownService> r2 = com.acse.ottn.service.CountdownService.class
            r0.<init>(r9, r2)
            r8.l = r0
            r0.putExtra(r1, r10)
            android.content.Intent r10 = r8.l
            r9.startService(r10)
            return
        L1dd:
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r2 = "showFloatWindow start"
            com.acse.ottn.h2.a(r0, r2)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.acse.ottn.service.MainService> r2 = com.acse.ottn.service.MainService.class
            r0.<init>(r9, r2)
            r8.l = r0
            r0.putExtra(r1, r10)
            android.content.Intent r10 = r8.l
            r9.startService(r10)
            return
    }

    public final void b(android.accessibilityservice.AccessibilityService r3, java.lang.String r4) {
            r2 = this;
            java.util.TimerTask r0 = com.acse.ottn.d.w
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            com.acse.ottn.d.w = r0
        La:
            r0 = 0
            r2.s = r0
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.d$k r1 = new com.acse.ottn.d$k
            r1.<init>(r2, r3, r4)
            r3 = 8000(0x1f40, float:1.121E-41)
            r4 = 500(0x1f4, float:7.0E-43)
            java.util.TimerTask r3 = r0.b(r3, r4, r1)
            com.acse.ottn.d.w = r3
            return
    }

    public void b(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            if (r4 == 0) goto L4a
            int r0 = r4.getChildCount()
            if (r0 != 0) goto L4a
            java.lang.CharSequence r0 = r4.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 40
            if (r0 != 0) goto L2c
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            int r0 = r4.length()
            if (r0 >= r1) goto L6e
            java.util.List r0 = r3.u
            r0.add(r4)
            return
        L2c:
            java.lang.CharSequence r0 = r4.getContentDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6e
            java.lang.CharSequence r4 = r4.getContentDescription()
            java.lang.String r4 = r4.toString()
            int r0 = r4.length()
            if (r0 >= r1) goto L6e
            java.util.List r0 = r3.u
            r0.add(r4)
            return
        L4a:
            if (r4 == 0) goto L6e
            r0 = 0
        L4d:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L6e
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L6b
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Throwable -> L61
            r3.b(r1)     // Catch: java.lang.Throwable -> L61
            goto L6b
        L61:
            r1 = move-exception
            java.lang.String r2 = com.acse.ottn.d.z
            java.lang.String r1 = r1.getMessage()
            com.acse.ottn.h2.a(r2, r1)
        L6b:
            int r0 = r0 + 1
            goto L4d
        L6e:
            return
    }

    public final void b(com.acse.ottn.model.AccessiblityModel r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = r7.getToast_status()
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "samon_"
            if (r0 == 0) goto L31
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r7.getGenuine_packagename()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.s0 r2 = com.acse.ottn.s0.d()
            java.lang.String r2 = r2.a()
            r8.b(r0, r2)
            goto L5b
        L31:
            java.lang.String r0 = r7.getToast_status()
            java.lang.String r3 = "0"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5b
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            com.acse.ottn.s0 r2 = com.acse.ottn.s0.d()
            java.lang.String r2 = r2.a()
            r0.b(r8, r2)
        L5b:
            com.acse.ottn.model.AccessiblityModel$DataBean r8 = r7.getData()
            java.lang.String r8 = r8.getFirst_price()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r0 = "ocr_screen_state"
            if (r8 != 0) goto L7a
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r7.getData()
            java.lang.String r2 = r2.getFirst_price()
            r8.b(r0, r2)
        L7a:
            com.acse.ottn.model.AccessiblityModel$DataBean r8 = r7.getData()
            java.lang.String r8 = r8.getKey_content()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L99
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r7.getData()
            java.lang.String r2 = r2.getKey_content()
            java.lang.String r3 = "key_content"
            r8.b(r3, r2)
        L99:
            com.acse.ottn.model.AccessiblityModel$DataBean r8 = r7.getData()
            java.lang.String r8 = r8.getFind_type()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto Lb8
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r7.getData()
            java.lang.String r2 = r2.getFind_type()
            java.lang.String r3 = "find_type"
            r8.b(r3, r2)
        Lb8:
            com.acse.ottn.model.AccessiblityModel$DataBean r8 = r7.getData()
            java.lang.String r8 = r8.getLocation_type()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto Ld7
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r7.getData()
            java.lang.String r2 = r2.getLocation_type()
            java.lang.String r3 = "location_type"
            r8.b(r3, r2)
        Ld7:
            boolean r8 = com.acse.ottn.activity.AcseHelpManager.mIsDebug
            if (r8 == 0) goto Le2
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            r8.b(r0, r1)
        Le2:
            java.lang.String r8 = r7.getReset_heartbeat()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto Lf7
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            java.lang.String r0 = "appHeartbeat"
            java.lang.String r2 = ""
            r8.b(r0, r2)
        Lf7:
            com.acse.ottn.p4 r8 = com.acse.ottn.p4.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " model.getIs_l()="
            r0.append(r2)
            long r2 = r7.getIs_l()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 5
            java.lang.String r3 = "倒计时"
            r8.b(r2, r3, r0)
            long r2 = r7.getIs_l()
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L127
            com.acse.ottn.g2 r8 = com.acse.ottn.g2.a()
            r8.c()
        L127:
            long r2 = r7.getIs_xp()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L132
            com.acse.ottn.c5.d()
        L132:
            java.lang.String r7 = r7.getReset_tag()
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L143
            com.acse.ottn.r1 r7 = com.acse.ottn.r1.c()
            r7.e()
        L143:
            return
    }

    public final void b(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
            com.acse.ottn.model.AdPackageModel r0 = r0.c()
            java.lang.String r1 = com.acse.ottn.d.z
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdPackageModel.toString() ="
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.model.PageSettingTypeModel r1 = new com.acse.ottn.model.PageSettingTypeModel
            r1.<init>()
            r1.setPackage_name(r5)
            java.lang.String r2 = r0.getIs_click_jd_title()
            r1.setIs_click_jd_title(r2)
            int r2 = r0.getReadpage_time()
            r1.setRead_time(r2)
            java.lang.String r2 = r0.getRead_description()
            r1.setRead_description(r2)
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.t
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L5a
            int r5 = r0.getTb_readpage_size()
            r1.setRead_length(r5)
            java.lang.String r5 = r0.getTb_readpage_type()
            r1.setRead_type(r5)
            goto L8f
        L5a:
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.w
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L75
            java.lang.String r5 = r0.getJd_readpage_type()
            r1.setRead_type(r5)
            int r5 = r0.getJd_readpage_size()
            r1.setRead_length(r5)
            goto L8f
        L75:
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.u
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L8f
            int r5 = r0.getTb_readpage_size()
            r1.setRead_length(r5)
            java.lang.String r5 = r0.getTb_readpage_type()
            r1.setRead_type(r5)
        L8f:
            r4.a(r1, r6)
            return
    }

    public void b(java.lang.String r3, java.lang.String r4, int r5, int r6) {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r1 = "onSelectActivity"
            com.acse.ottn.h2.a(r0, r1)
            r2.f2217e = r4
            r2.f2218f = r4
            r2.c(r3, r4, r5, r6)
            return
    }

    public final boolean b(java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.b(r2, r0)
            return r2
    }

    public final boolean b(java.lang.String r8, int r9) {
            r7 = this;
            if (r9 != 0) goto L4
            r9 = 500(0x1f4, float:7.0E-43)
        L4:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "coupon_"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            long r0 = r0.d(r1)
            java.lang.String r3 = com.acse.ottn.d.z
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "controlCouponShow appPageName ="
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = "-----"
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.acse.ottn.h2.a(r3, r4)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            long r0 = (long) r9
            int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r9 >= 0) goto L53
            java.lang.String r8 = com.acse.ottn.d.z
            java.lang.String r9 = "controlCouponShow return false "
            com.acse.ottn.h2.a(r8, r9)
            r8 = 0
            return r8
        L53:
            com.acse.ottn.n3 r9 = com.acse.ottn.n3.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            long r0 = java.lang.System.currentTimeMillis()
            r9.a(r8, r0)
            java.lang.String r8 = com.acse.ottn.d.z
            java.lang.String r9 = "controlCouponShow return true"
            com.acse.ottn.h2.a(r8, r9)
            r8 = 1
            return r8
    }

    public final java.lang.String c(android.accessibilityservice.AccessibilityService r8) {
            r7 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "jd_view_id"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 == 0) goto L13
            return r3
        L13:
            java.lang.String r2 = com.acse.ottn.d.z
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getJDtitle jd id is "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.acse.ottn.h2.a(r2, r4)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f(r8, r0)
            if (r2 == 0) goto Lbd
            java.lang.CharSequence r4 = r2.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Lbd
            java.lang.String r4 = com.acse.ottn.d.z
            java.lang.String r5 = "nodeInfo.getText()!=null "
            com.acse.ottn.h2.a(r4, r5)
            java.lang.CharSequence r4 = r2.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            int r5 = r4.length()
            r6 = 10
            if (r5 <= r6) goto Lbd
            java.lang.String r5 = "click_jd_title"
            r6 = 1000(0x3e8, float:1.401E-42)
            boolean r5 = r7.b(r5, r6)
            if (r5 == 0) goto L69
            com.acse.ottn.b r5 = com.acse.ottn.b.c()
            r5.g(r2)
        L69:
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r8 = r2.f(r8, r0)
            if (r8 == 0) goto Lbd
            java.lang.CharSequence r2 = r8.getText()
            if (r2 != 0) goto L7a
            goto Lbd
        L7a:
            java.lang.CharSequence r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.trim()
            boolean r2 = r4.contains(r8)
            if (r2 != 0) goto Lb1
            boolean r2 = r8.contains(r4)
            if (r2 == 0) goto L93
            goto Lb1
        L93:
            java.lang.String r8 = com.acse.ottn.d.z
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "getJDtitle jd id is error="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.acse.ottn.h2.a(r8, r0)
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            r8.b(r1, r3)
            goto Lbd
        Lb1:
            int r0 = r4.length()
            int r1 = r8.length()
            if (r0 <= r1) goto Lbc
            return r4
        Lbc:
            return r8
        Lbd:
            return r3
    }

    public final void c() {
            r23 = this;
            r0 = r23
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "key_content"
            java.lang.String[] r1 = r1.f(r2)
            r2 = 14
            r3 = 13
            r4 = 12
            r5 = 11
            r6 = 10
            r7 = 9
            r8 = 8
            r9 = 7
            r10 = 6
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            r15 = 15
            r16 = 1
            r17 = 0
            if (r1 != 0) goto L66
            java.lang.String[] r1 = new java.lang.String[r15]
            java.lang.String r18 = "送礼"
            r1[r17] = r18
            java.lang.String r18 = "立即领取"
            r1[r16] = r18
            java.lang.String r18 = "人已买"
            r1[r14] = r18
            java.lang.String r18 = "回头客"
            r1[r13] = r18
            java.lang.String r18 = "人感兴趣"
            r1[r12] = r18
            java.lang.String r18 = "可再享:"
            r1[r11] = r18
            java.lang.String r18 = "直降"
            r1[r10] = r18
            java.lang.String r18 = "跨境进口"
            r1[r9] = r18
            java.lang.String r18 = "跨境直邮"
            r1[r8] = r18
            java.lang.String r18 = "淘金币已抵"
            r1[r7] = r18
            java.lang.String r18 = "天价保"
            r1[r6] = r18
            java.lang.String r18 = "官方立减"
            r1[r5] = r18
            java.lang.String r18 = "活动价便宜"
            r1[r4] = r18
            java.lang.String r18 = "大促价保"
            r1[r3] = r18
            java.lang.String r18 = "全网低价"
            r1[r2] = r18
        L66:
            r18 = 14
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r19 = 13
            java.lang.String r3 = "find_type"
            java.lang.String[] r2 = r2.f(r3)
            java.lang.String r3 = "3"
            r20 = 12
            java.lang.String r4 = "1"
            if (r2 != 0) goto L9c
            java.lang.String[] r2 = new java.lang.String[r15]
            r2[r17] = r3
            r2[r16] = r3
            r2[r14] = r4
            r2[r13] = r4
            r2[r12] = r4
            r2[r11] = r3
            r2[r10] = r4
            r2[r9] = r4
            r2[r8] = r4
            r2[r7] = r4
            r2[r6] = r4
            r2[r5] = r4
            r2[r20] = r4
            r2[r19] = r3
            r2[r18] = r3
        L9c:
            r21 = 11
            com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()
            r22 = 10
            java.lang.String r6 = "location_type"
            java.lang.String[] r5 = r5.f(r6)
            if (r5 != 0) goto Ld2
            java.lang.String[] r5 = new java.lang.String[r15]
            r5[r17] = r4
            r5[r16] = r3
            java.lang.String r6 = "5"
            r5[r14] = r6
            r5[r13] = r6
            r5[r12] = r6
            java.lang.String r12 = "2"
            r5[r11] = r12
            java.lang.String r11 = "4"
            r5[r10] = r11
            r5[r9] = r6
            r5[r8] = r6
            r5[r7] = r11
            r5[r22] = r6
            r5[r21] = r11
            r5[r20] = r6
            r5[r19] = r6
            r5[r18] = r6
        Ld2:
            r6 = 0
        Ld3:
            int r7 = r1.length
            if (r6 >= r7) goto L130
            r7 = r2[r6]
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto Lef
            com.acse.ottn.b r7 = com.acse.ottn.b.c()
            android.accessibilityservice.AccessibilityService r8 = r0.f2222j
            r9 = r1[r6]
            java.lang.String r9 = r9.trim()
            android.view.accessibility.AccessibilityNodeInfo r7 = r7.j(r8, r9)
            goto L109
        Lef:
            r7 = r2[r6]
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L108
            com.acse.ottn.b r7 = com.acse.ottn.b.c()
            android.accessibilityservice.AccessibilityService r8 = r0.f2222j
            r9 = r1[r6]
            java.lang.String r9 = r9.trim()
            android.view.accessibility.AccessibilityNodeInfo r7 = r7.h(r8, r9)
            goto L109
        L108:
            r7 = 0
        L109:
            if (r7 == 0) goto L12d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "当前字段==》"
            r2.append(r3)
            r1 = r1[r6]
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "samon,"
            com.acse.ottn.h2.a(r2, r1)
            com.acse.ottn.a3 r1 = com.acse.ottn.a3.d()
            r2 = r5[r6]
            r1.a(r7, r2)
            return
        L12d:
            int r6 = r6 + 1
            goto Ld3
        L130:
            return
    }

    public void c(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            if (r4 == 0) goto Lb
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "samon-->aa"
            com.acse.ottn.h2.a(r1, r0)
        Lb:
            if (r4 == 0) goto L47
            int r0 = r4.getChildCount()
            if (r0 != 0) goto L47
            java.lang.CharSequence r0 = r4.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2f
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            java.util.List<java.lang.String> r0 = r3.f2220h
            r0.add(r4)
            return
        L2f:
            java.lang.CharSequence r0 = r4.getContentDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6b
            java.lang.CharSequence r4 = r4.getContentDescription()
            java.lang.String r4 = r4.toString()
            java.util.List<java.lang.String> r0 = r3.f2220h
            r0.add(r4)
            return
        L47:
            if (r4 == 0) goto L6b
            r0 = 0
        L4a:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L6b
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L68
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Throwable -> L5e
            r3.c(r1)     // Catch: java.lang.Throwable -> L5e
            goto L68
        L5e:
            r1 = move-exception
            java.lang.String r2 = com.acse.ottn.d.z
            java.lang.String r1 = r1.getMessage()
            com.acse.ottn.h2.a(r2, r1)
        L68:
            int r0 = r0 + 1
            goto L4a
        L6b:
            return
    }

    public final void c(java.lang.String r3, java.lang.String r4, int r5, int r6) {
            r2 = this;
            android.os.Message r0 = new android.os.Message     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            r0.what = r5     // Catch: java.lang.Throwable -> L20
            android.os.Bundle r5 = new android.os.Bundle     // Catch: java.lang.Throwable -> L20
            r5.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "coupon_packagename"
            r5.putString(r1, r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "genuine_packagename"
            r5.putString(r3, r4)     // Catch: java.lang.Throwable -> L20
            r0.setData(r5)     // Catch: java.lang.Throwable -> L20
            android.os.Handler r3 = r2.r     // Catch: java.lang.Throwable -> L20
            long r4 = (long) r6     // Catch: java.lang.Throwable -> L20
            r3.sendMessageDelayed(r0, r4)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r3 = move-exception
            java.lang.String r4 = com.acse.ottn.d.z
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "sendMessage ="
            r5.append(r6)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.acse.ottn.h2.a(r4, r3)
            return
    }

    public final boolean c(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case -1941262704: goto L3a;
                case -1846082740: goto L2f;
                case 1375384955: goto L24;
                case 1510229602: goto L19;
                case 1694260435: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L44
        Le:
            java.lang.String r0 = "com.hihonor.android.launcher.unihome.UniHomeLauncher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L17
            goto L44
        L17:
            r3 = 4
            goto L44
        L19:
            java.lang.String r0 = "com.android.launcher.Launcher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L22
            goto L44
        L22:
            r3 = 3
            goto L44
        L24:
            java.lang.String r0 = "com.huawei.android.launcher.unihome.UniHomeLauncher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L2d
            goto L44
        L2d:
            r3 = 2
            goto L44
        L2f:
            java.lang.String r0 = "com.bbk.launcher2.Launcher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L38
            goto L44
        L38:
            r3 = 1
            goto L44
        L3a:
            java.lang.String r0 = "com.miui.home.launcher.Launcher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L43
            goto L44
        L43:
            r3 = 0
        L44:
            switch(r3) {
                case 0: goto L48;
                case 1: goto L48;
                case 2: goto L48;
                case 3: goto L48;
                case 4: goto L48;
                default: goto L47;
            }
        L47:
            return r2
        L48:
            return r1
    }

    public void d(android.accessibilityservice.AccessibilityService r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initDemoPermission ="
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            android.accessibilityservice.AccessibilityServiceInfo r0 = new android.accessibilityservice.AccessibilityServiceInfo
            r0.<init>()
            r1 = 88
            r0.flags = r1
            r1 = 300(0x12c, double:1.48E-321)
            r0.notificationTimeout = r1
            r1 = -1
            r0.feedbackType = r1
            r0.eventTypes = r1
            r5.setServiceInfo(r0)
            return
    }

    public final void d(java.lang.String r4) {
            r3 = this;
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r1 = 10017(0x2721, float:1.4037E-41)
            r0.what = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "coupon_packagename"
            r1.putString(r2, r4)
            r0.setData(r1)
            android.os.Handler r4 = r3.r
            r1 = 200(0xc8, double:9.9E-322)
            r4.sendMessageDelayed(r0, r1)
            return
    }

    public void e() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.u = r0
            android.accessibilityservice.AccessibilityService r0 = r2.f2222j     // Catch: java.lang.Throwable -> L11
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRootInActiveWindow()     // Catch: java.lang.Throwable -> L11
            r2.b(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            java.lang.String r1 = com.acse.ottn.d.z
            java.lang.String r0 = r0.getMessage()
            com.acse.ottn.h2.a(r1, r0)
            return
    }

    public void e(android.accessibilityservice.AccessibilityService r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initOpenPermission="
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            android.accessibilityservice.AccessibilityServiceInfo r0 = new android.accessibilityservice.AccessibilityServiceInfo
            r0.<init>()
            r1 = 80
            r0.flags = r1
            r1 = 100
            r0.notificationTimeout = r1
            r1 = -1
            r0.feedbackType = r1
            r0.eventTypes = r1
            r5.setServiceInfo(r0)
            return
    }

    public final boolean e(java.lang.String r5) {
            r4 = this;
            com.acse.ottn.s0 r0 = com.acse.ottn.s0.d()
            java.lang.String r0 = r0.a()
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "samon_"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.e(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "the day not requst packageName ="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.acse.ottn.h2.a(r0, r5)
            r5 = 0
            return r5
        L3f:
            r5 = 1
            return r5
    }

    public final void f() {
            r4 = this;
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.d$b r1 = new com.acse.ottn.d$b
            r1.<init>(r4)
            r2 = 3000(0xbb8, float:4.204E-42)
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.b(r2, r3, r1)
            return
    }

    public void f(android.accessibilityservice.AccessibilityService r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initReadPageInfo="
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            android.accessibilityservice.AccessibilityServiceInfo r0 = new android.accessibilityservice.AccessibilityServiceInfo
            r0.<init>()
            r1 = 90
            r0.flags = r1
            r1 = 100
            r0.notificationTimeout = r1
            r1 = -1
            r0.feedbackType = r1
            r0.eventTypes = r1
            r5.setServiceInfo(r0)
            return
    }

    public final java.lang.Object g() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.d r0 = com.acse.ottn.d.v
            return r0
    }

    public void g(android.accessibilityservice.AccessibilityService r3) {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.d.z
            java.lang.String r1 = "onStopService"
            com.acse.ottn.h2.a(r0, r1)
            android.content.Intent r0 = r2.l
            if (r0 == 0) goto L11
            r3.stopService(r0)
            r3 = 0
            r2.l = r3
        L11:
            return
    }

    public final void h() {
            r4 = this;
            java.util.TimerTask r0 = com.acse.ottn.d.x
            if (r0 == 0) goto L5
            goto L26
        L5:
            com.acse.ottn.s0 r0 = com.acse.ottn.s0.d()
            java.lang.String r0 = r0.a()
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            if (r1 == 0) goto L1e
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "appHeartbeat"
            java.lang.String r1 = r1.e(r2)
            goto L20
        L1e:
            java.lang.String r1 = ""
        L20:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
        L26:
            return
        L27:
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.d$a r1 = new com.acse.ottn.d$a
            r1.<init>(r4)
            r2 = 20000(0x4e20, float:2.8026E-41)
            r3 = 10000(0x2710, float:1.4013E-41)
            java.util.TimerTask r0 = r0.b(r2, r3, r1)
            com.acse.ottn.d.x = r0
            return
    }

    public void h(android.accessibilityservice.AccessibilityService r2) {
            r1 = this;
            com.acse.ottn.a3 r0 = com.acse.ottn.a3.d()
            r0.a(r2)
            r1.f2222j = r2
            return
    }

    public final android.view.accessibility.AccessibilityWindowInfo i(android.accessibilityservice.AccessibilityService r4) {
            r3 = this;
            java.util.List r4 = r4.getWindows()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L8
            java.lang.CharSequence r1 = l.p.a(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L8
            java.lang.CharSequence r1 = l.p.a(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "点按相应功能即可开始使用："
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L8
            return r0
        L35:
            r4 = 0
            return r4
    }

    public final void j(android.accessibilityservice.AccessibilityService r2) {
            r1 = this;
            java.util.List r2 = r2.getWindows()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRoot()
            r1.a(r0)
            goto L8
        L1c:
            return
    }
}
