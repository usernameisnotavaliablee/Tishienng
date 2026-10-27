package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d4 {

    /* renamed from: c, reason: collision with root package name */
    public static com.acse.ottn.d4 f2241c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f2242d = "ScrolledReadUtil";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f2243e = "";
    public java.util.List<java.lang.String> a;

    /* renamed from: b, reason: collision with root package name */
    public int f2244b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.io.reactivex.functions.Consumer<com.acse.ottn.model.AccessiblityModel> {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.d4 f2245b;

        public a(com.acse.ottn.d4 r1, java.lang.String r2) {
                r0 = this;
                r0.f2245b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(com.acse.ottn.model.AccessiblityModel r4) throws java.lang.Exception {
                r3 = this;
                java.lang.String r0 = com.acse.ottn.d4.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "请求成功 string ="
                r1.append(r2)
                java.lang.String r2 = r4.toString()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.acse.ottn.h2.a(r0, r1)
                int r0 = r4.getR()
                r1 = 1
                if (r1 != r0) goto L2c
                com.acse.ottn.d r0 = com.acse.ottn.d.d()
                java.lang.String r1 = r3.a
                r0.a(r4, r1)
            L2c:
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(com.acse.ottn.model.AccessiblityModel r1) throws java.lang.Exception {
                r0 = this;
                com.acse.ottn.model.AccessiblityModel r1 = (com.acse.ottn.model.AccessiblityModel) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(com.acse.ottn.model.AccessiblityModel r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.d4 a;

        public b(com.acse.ottn.d4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r4) throws java.lang.Exception {
                r3 = this;
                java.lang.String r0 = com.acse.ottn.d4.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "报错了="
                r1.append(r2)
                java.lang.String r4 = r4.getMessage()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.acse.ottn.h2.b(r0, r4)
                com.acse.ottn.d4 r4 = r3.a
                java.util.List r4 = com.acse.ottn.d4.a(r4)
                if (r4 == 0) goto L33
                com.acse.ottn.d4 r4 = r3.a
                java.util.List r4 = com.acse.ottn.d4.a(r4)
                com.acse.ottn.d4 r0 = r3.a
                java.util.List r0 = com.acse.ottn.d4.a(r0)
                r4.removeAll(r0)
            L33:
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

    static {
            return
    }

    public d4() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2244b = r0
            return
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.d4.f2242d
            return r0
    }

    public static /* synthetic */ java.util.List a(com.acse.ottn.d4 r0) {
            java.util.List<java.lang.String> r0 = r0.a
            return r0
    }

    public static com.acse.ottn.d4 c() {
            com.acse.ottn.d4 r0 = com.acse.ottn.d4.f2241c
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.d4> r0 = com.acse.ottn.d4.class
            monitor-enter(r0)
            com.acse.ottn.d4 r1 = com.acse.ottn.d4.f2241c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.d4 r1 = new com.acse.ottn.d4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.d4.f2241c = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.d4 r0 = com.acse.ottn.d4.f2241c
            return r0
    }

    public void a(android.accessibilityservice.AccessibilityService r6) {
            r5 = this;
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
            goto L17e
        La:
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2528b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2530c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2531d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2532e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2533f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2538k
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2537j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2536i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            java.lang.String r0 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2535h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17e
        L88:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L9e
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r6.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L9e:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "scroll_state"
            java.lang.String r0 = r0.e(r1)
            java.lang.String r2 = com.acse.ottn.d4.f2242d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CommonUtil.SCROLLED_SCREEN_START="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.acse.ottn.h2.a(r2, r3)
            java.lang.String r2 = com.acse.ottn.l0.q
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L17e
            boolean r0 = r5.b()
            if (r0 == 0) goto L17e
            com.acse.ottn.o r0 = com.acse.ottn.o.c()
            java.lang.String r0 = r0.t
            java.lang.String r2 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.f2535h
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L112
            java.lang.String r2 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.f2536i
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lef
            goto L112
        Lef:
            java.lang.String r2 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.f2538k
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L10b
            java.lang.String r2 = com.acse.ottn.d4.f2243e
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.f2537j
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
        L10b:
            com.acse.ottn.o r0 = com.acse.ottn.o.c()
            java.lang.String r0 = r0.u
            goto L118
        L112:
            com.acse.ottn.o r0 = com.acse.ottn.o.c()
            java.lang.String r0 = r0.w
        L118:
            java.util.List<java.lang.String> r2 = r5.a
            if (r2 == 0) goto L124
            r2.removeAll(r2)
            java.util.List<java.lang.String> r2 = r5.a
            r2.clear()
        L124:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15a
            r2.<init>()     // Catch: java.lang.Throwable -> L15a
            r5.a = r2     // Catch: java.lang.Throwable -> L15a
            android.view.accessibility.AccessibilityNodeInfo r2 = r6.getRootInActiveWindow()     // Catch: java.lang.Throwable -> L15a
            r5.a(r2)     // Catch: java.lang.Throwable -> L15a
            java.util.List<java.lang.String> r2 = r5.a     // Catch: java.lang.Throwable -> L15a
            boolean r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L15a
            if (r2 == 0) goto L17e
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L15a
            java.lang.String r3 = com.acse.ottn.l0.p     // Catch: java.lang.Throwable -> L15a
            r2.b(r1, r3)     // Catch: java.lang.Throwable -> L15a
            java.util.List<java.lang.String> r2 = r5.a     // Catch: java.lang.Throwable -> L15a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15a
            r3.<init>()     // Catch: java.lang.Throwable -> L15a
            r3.append(r0)     // Catch: java.lang.Throwable -> L15a
            java.lang.String r4 = "m"
            r3.append(r4)     // Catch: java.lang.Throwable -> L15a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L15a
            r5.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L15a
            return
        L15a:
            r6 = move-exception
            java.util.List<java.lang.String> r0 = r5.a
            if (r0 == 0) goto L175
            r0.removeAll(r0)
            r0 = 0
            r5.f2244b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.a = r0
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = "0"
            r0.b(r1, r2)
        L175:
            java.lang.String r0 = com.acse.ottn.d4.f2242d
            java.lang.String r6 = r6.getMessage()
            com.acse.ottn.h2.a(r0, r6)
        L17e:
            return
    }

    public final void a(android.accessibilityservice.AccessibilityService r5, java.util.List<java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            java.lang.String r5 = com.acse.ottn.d4.f2242d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "current packageName  ="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r5, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto Ldb
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L24
            goto Ldb
        L24:
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.String r0 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r1 = "ak"
            r5.put(r1, r0)
            java.lang.String r0 = "app"
            r5.put(r0, r7)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r0 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r1 = "marker"
            r5.put(r1, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = "data"
            if (r6 == 0) goto L6b
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r6)
            r5.put(r1, r2)
            java.lang.String r1 = com.acse.ottn.d4.f2242d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getCouponInfo string ="
            r2.append(r3)
            java.lang.String r6 = com.alibaba.fastjson.JSON.toJSONString(r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.acse.ottn.h2.a(r1, r6)
            goto L6e
        L6b:
            r5.put(r1, r0)
        L6e:
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()
            java.lang.String r1 = "goods_info"
            java.lang.String r6 = r6.e(r1)
            java.lang.String r1 = "product_info"
            r5.put(r1, r6)
            java.lang.String r6 = com.acse.ottn.l0.f2440k
            java.lang.String r1 = "new_version"
            r5.put(r1, r6)
            com.acse.ottn.t0 r6 = com.acse.ottn.t0.b()
            java.lang.String r6 = r6.j(r7)
            java.lang.String r1 = "coupon_type"
            r5.put(r1, r6)
            java.lang.String r6 = "genuine_packagename"
            r5.put(r6, r8)
            java.lang.String r6 = com.acse.ottn.n4.b()
            java.lang.String r8 = "device_brand"
            r5.put(r8, r6)
            java.lang.String r6 = com.acse.ottn.l0.f2440k
            java.lang.String r8 = "is_snt"
            r5.put(r8, r6)
            java.lang.String r6 = com.acse.ottn.l0.x
            java.lang.String r8 = "version"
            r5.put(r8, r6)
            com.acse.ottn.l1 r6 = new com.acse.ottn.l1
            r6.<init>()
            com.acse.ottn.t0 r8 = com.acse.ottn.t0.b()
            okhttp3.RequestBody r5 = r8.a(r5, r0)
            rx.e r5 = r6.j(r5)
            rx.h r6 = com.acse.ottn.i.a()
            rx.e r5 = r5.I3(r6)
            rx.h r6 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r5 = r5.w5(r6)
            com.acse.ottn.d4$a r6 = new com.acse.ottn.d4$a
            r6.<init>(r4, r7)
            com.acse.ottn.d4$b r7 = new com.acse.ottn.d4$b
            r7.<init>(r4)
            r5.u5(r6, r7)
        Ldb:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void a(android.view.accessibility.AccessibilityNodeInfo r8) {
            r7 = this;
            java.lang.String r0 = "0"
            java.lang.String r1 = "scroll_state"
            r2 = 0
            if (r8 == 0) goto Lc6
            int r3 = r8.getChildCount()
            if (r3 != 0) goto Lc6
            java.lang.CharSequence r3 = r8.getText()
            r4 = 100
            r5 = 2
            r6 = 25
            if (r3 == 0) goto L6c
            java.lang.CharSequence r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.trim()
            int r3 = r8.length()
            if (r3 >= r6) goto Lf1
            int r3 = r8.length()
            if (r3 <= r5) goto Lf1
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            int r5 = r7.f2244b
            int r3 = r3.a(r8, r5)
            r7.f2244b = r3
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            int r5 = r7.f2244b
            boolean r3 = r3.a(r5)
            if (r3 == 0) goto L56
            java.util.List<java.lang.String> r3 = r7.a
            int r3 = r3.size()
            if (r3 >= r4) goto L56
            java.util.List<java.lang.String> r0 = r7.a
            r0.add(r8)
            return
        L56:
            java.util.List<java.lang.String> r8 = r7.a
            if (r8 == 0) goto Lf1
            r8.removeAll(r8)
            java.util.List<java.lang.String> r8 = r7.a
            r8.clear()
            r7.f2244b = r2
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            r8.b(r1, r0)
            return
        L6c:
            java.lang.CharSequence r3 = r8.getContentDescription()
            if (r3 == 0) goto Lf1
            java.lang.CharSequence r8 = r8.getContentDescription()
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.trim()
            int r3 = r8.length()
            if (r3 >= r6) goto Lf1
            int r3 = r8.length()
            if (r3 <= r5) goto Lf1
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            int r5 = r7.f2244b
            int r3 = r3.a(r8, r5)
            r7.f2244b = r3
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            int r5 = r7.f2244b
            boolean r3 = r3.a(r5)
            if (r3 == 0) goto Lb0
            java.util.List<java.lang.String> r3 = r7.a
            int r3 = r3.size()
            if (r3 >= r4) goto Lb0
            java.util.List<java.lang.String> r0 = r7.a
            r0.add(r8)
            return
        Lb0:
            java.util.List<java.lang.String> r8 = r7.a
            if (r8 == 0) goto Lf1
            r8.removeAll(r8)
            java.util.List<java.lang.String> r8 = r7.a
            r8.clear()
            r7.f2244b = r2
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            r8.b(r1, r0)
            return
        Lc6:
            if (r8 == 0) goto Lf1
        Lc8:
            int r3 = r8.getChildCount()     // Catch: java.lang.Throwable -> Ldc
            if (r2 >= r3) goto Lf1
            android.view.accessibility.AccessibilityNodeInfo r3 = r8.getChild(r2)     // Catch: java.lang.Throwable -> Ldc
            if (r3 == 0) goto Lde
            android.view.accessibility.AccessibilityNodeInfo r3 = r8.getChild(r2)     // Catch: java.lang.Throwable -> Ldc
            r7.a(r3)     // Catch: java.lang.Throwable -> Ldc
            goto Lde
        Ldc:
            r8 = move-exception
            goto Le1
        Lde:
            int r2 = r2 + 1
            goto Lc8
        Le1:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "ScrolledReadUtil"
            com.acse.ottn.h2.a(r0, r8)
        Lf1:
            return
    }

    public boolean a(java.util.List<java.lang.String> r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L6b
            int r1 = r5.size()
            if (r1 != 0) goto La
            goto L6b
        La:
            java.lang.String r1 = com.acse.ottn.d4.f2242d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "samon--lists  ="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r1, r2)
            r1 = 0
        L21:
            int r2 = r5.size()
            if (r1 >= r2) goto L6a
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "进店逛逛"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L61
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "天猫国际"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L61
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "去频道逛逛"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5e
            goto L61
        L5e:
            int r1 = r1 + 1
            goto L21
        L61:
            java.lang.String r5 = "zkj_samon"
            java.lang.String r0 = "包含"
            com.acse.ottn.h2.a(r5, r0)
            r5 = 1
            return r5
        L6a:
            return r0
        L6b:
            java.lang.String r5 = com.acse.ottn.d4.f2242d
            java.lang.String r1 = "lists = null"
            com.acse.ottn.h2.a(r5, r1)
            return r0
    }

    public final boolean b() {
            r7 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "scrolled_screen_time"
            long r2 = r0.d(r1)
            java.lang.String r0 = com.acse.ottn.d4.f2242d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "controlCouponShow appPageName ="
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.acse.ottn.h2.b(r0, r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L39
            java.lang.String r0 = com.acse.ottn.d4.f2242d
            java.lang.String r1 = "controlCouponShow return false "
            com.acse.ottn.h2.a(r0, r1)
            r0 = 0
            return r0
        L39:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            long r2 = java.lang.System.currentTimeMillis()
            r0.a(r1, r2)
            java.lang.String r0 = com.acse.ottn.d4.f2242d
            java.lang.String r1 = "controlCouponShow return true"
            com.acse.ottn.h2.a(r0, r1)
            r0 = 1
            return r0
    }

    public final java.lang.Object d() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.d4 r0 = com.acse.ottn.d4.f2241c
            return r0
    }
}
