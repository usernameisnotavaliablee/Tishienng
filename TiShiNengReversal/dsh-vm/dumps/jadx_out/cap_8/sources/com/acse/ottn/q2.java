package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class q2 {
    public static com.acse.ottn.q2 a;

    /* renamed from: b, reason: collision with root package name */
    public static android.app.Activity f2597b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.q2.c f2598b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.q2 f2599c;

        public a(com.acse.ottn.q2 r1, java.lang.String r2, com.acse.ottn.q2.c r3) {
                r0 = this;
                r0.f2599c = r1
                r0.a = r2
                r0.f2598b = r3
                r0.<init>()
                return
        }

        public void a(java.lang.String r6) throws java.lang.Exception {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "统计发送成功 =="
                r0.append(r1)
                java.lang.String r1 = r5.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MobclickAgentUtil"
                com.acse.ottn.h2.a(r1, r0)
                java.lang.String r0 = r5.a
                java.lang.String r2 = "heart_beat"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L132
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r6)
                r2 = 1
                com.acse.ottn.l0.f2434e = r2
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                com.acse.ottn.s0 r3 = com.acse.ottn.s0.d()
                java.lang.String r3 = r3.a()
                java.lang.String r4 = "appHeartbeat"
                r2.b(r4, r3)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "aes_key"
                java.lang.String r4 = r0.getString(r3)
                r2.b(r3, r4)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "show_ad_activity"
                r2.b(r3, r6)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "s= =="
                r2.append(r3)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MobclickAgentUtilsamon"
                com.acse.ottn.h2.a(r3, r2)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "ocr_screen_scroll"
                java.lang.String r4 = r0.getString(r3)
                r2.b(r3, r4)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "statistic_view"
                java.lang.String r4 = r0.getString(r3)
                r2.b(r3, r4)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "local_toast_info"
                java.lang.String r3 = r0.getString(r3)
                java.lang.String r4 = "applet_data"
                r2.b(r4, r3)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "local_toast_status"
                int r4 = r0.getInt(r3)
                r2.a(r3, r4)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "view_gather"
                java.lang.String r4 = r0.getString(r3)
                r2.b(r3, r4)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "popup_state"
                java.lang.String r4 = r0.getString(r3)
                r2.b(r3, r4)
                com.acse.ottn.q2 r2 = r5.f2599c
                r2.c()
                com.acse.ottn.d r2 = com.acse.ottn.d.d()
                r3 = 0
                r2.o = r3
                java.lang.String r2 = "xiaomi"
                java.lang.String r3 = com.acse.ottn.n4.b()     // Catch: java.lang.Exception -> Ldb
                boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Ldb
                if (r2 != 0) goto Ldc
                boolean r2 = com.acse.ottn.activity.AcseHelpManager.mIsDebug     // Catch: java.lang.Exception -> Ldb
                if (r2 != 0) goto Ldc
                com.acse.ottn.r1 r2 = com.acse.ottn.r1.c()     // Catch: java.lang.Exception -> Ldb
                r2.g()     // Catch: java.lang.Exception -> Ldb
                goto Ldc
            Ldb:
            Ldc:
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r3 = "notification_control"
                java.lang.String r4 = r0.getString(r3)
                r2.b(r3, r4)
                java.lang.String r2 = "app_list"
                java.lang.String r0 = r0.getString(r2)
                java.lang.String r2 = "1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L117
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                java.lang.String r3 = "click_state"
                r0.a(r3, r2)
                java.lang.String r0 = "honor"
                java.lang.String r2 = com.acse.ottn.n4.b()     // Catch: java.lang.Throwable -> L116
                boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L116
                if (r0 != 0) goto L117
                com.acse.ottn.o r0 = com.acse.ottn.o.c()     // Catch: java.lang.Throwable -> L116
                r0.b()     // Catch: java.lang.Throwable -> L116
                goto L117
            L116:
            L117:
                com.acse.ottn.q2$c r0 = r5.f2598b
                if (r0 == 0) goto L11e
                r0.a()
            L11e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "appStatistics s= "
                r0.append(r2)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                com.acse.ottn.h2.a(r1, r6)
            L132:
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
    public class b implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.q2 a;

        public b(com.acse.ottn.q2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r3) throws java.lang.Exception {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "统计发送失败 throwable ="
                r0.append(r1)
                java.lang.String r3 = r3.getMessage()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "MobclickAgentUtil"
                com.acse.ottn.h2.a(r0, r3)
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
    public interface c {
        void a();
    }

    public q2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.String, java.lang.String> a(java.lang.String r5, java.lang.String r6) {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            boolean r1 = d()
            java.lang.String r2 = "1"
            java.lang.String r3 = "0"
            if (r1 == 0) goto L2e
            r1 = r2
            goto L2f
        L2e:
            r1 = r3
        L2f:
            java.lang.String r4 = "open_all_permission"
            r0.put(r4, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.a()
            if (r1 == 0) goto L40
            r1 = r2
            goto L41
        L40:
            r1 = r3
        L41:
            java.lang.String r4 = "flow_permission"
            r0.put(r4, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.e()
            if (r1 == 0) goto L52
            r1 = r2
            goto L53
        L52:
            r1 = r3
        L53:
            java.lang.String r4 = "accessiblity_permission"
            r0.put(r4, r1)
            com.acse.ottn.b5 r1 = com.acse.ottn.b5.a()
            java.lang.String r4 = com.acse.ottn.l0.w
            boolean r1 = r1.b(r4)
            if (r1 == 0) goto L65
            goto L66
        L65:
            r2 = r3
        L66:
            java.lang.String r1 = "battery_permission"
            r0.put(r1, r2)
            java.lang.String r1 = "statistics_type"
            r0.put(r1, r5)
            java.lang.String r1 = com.acse.ottn.n4.o()
            java.lang.String r2 = "mobile_id"
            r0.put(r2, r1)
            java.lang.String r1 = "heart_beat"
            boolean r5 = r1.equals(r5)
            java.lang.String r1 = "is_snt"
            if (r5 == 0) goto L89
            java.lang.String r5 = "3"
            r0.put(r1, r5)
            goto L8c
        L89:
            r0.put(r1, r3)
        L8c:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L97
            java.lang.String r5 = "accessiblity_list"
            r0.put(r5, r6)
        L97:
            java.lang.String r5 = "maven_version"
            java.lang.String r6 = "1.2.6.6"
            r0.put(r5, r6)
            java.lang.String r5 = com.acse.ottn.n4.b()
            java.lang.String r6 = "mobile"
            r0.put(r6, r5)
            java.lang.String r5 = com.acse.ottn.l0.y
            java.lang.String r6 = "mobile_version_release"
            r0.put(r6, r5)
            java.lang.String r5 = com.acse.ottn.l0.x
            java.lang.String r6 = "app_versione"
            r0.put(r6, r5)
            java.lang.String r5 = com.acse.ottn.n4.d()
            java.lang.String r6 = "app_system_model"
            r0.put(r6, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r5.append(r1)
            java.lang.String r6 = ""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "time"
            r0.put(r6, r5)
            java.lang.String r5 = com.acse.ottn.n4.p()
            java.lang.String r6 = "system_model"
            r0.put(r6, r5)
            java.lang.String r5 = com.acse.ottn.l0.f2440k
            java.lang.String r6 = "new_version"
            r0.put(r6, r5)
            return r0
    }

    public static com.acse.ottn.q2 b() {
            com.acse.ottn.q2 r0 = com.acse.ottn.q2.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.q2> r0 = com.acse.ottn.q2.class
            monitor-enter(r0)
            com.acse.ottn.q2 r1 = com.acse.ottn.q2.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.q2 r1 = new com.acse.ottn.q2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.q2.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.q2 r0 = com.acse.ottn.q2.a
            return r0
    }

    public static boolean d() {
            com.acse.ottn.g3 r0 = com.acse.ottn.g3.a()
            boolean r0 = r0.d()
            r1 = 1
            if (r0 == 0) goto L2e
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.e()
            if (r0 == 0) goto L2c
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.a()
            if (r0 == 0) goto L2c
            com.acse.ottn.b5 r0 = com.acse.ottn.b5.a()
            java.lang.String r2 = com.acse.ottn.l0.w
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto L2c
            return r1
        L2c:
            r0 = 0
            return r0
        L2e:
            return r1
    }

    public void a() {
            r7 = this;
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            java.util.List r0 = r0.getInstalledAccessibilityServiceList()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r0.next()
            android.accessibilityservice.AccessibilityServiceInfo r2 = (android.accessibilityservice.AccessibilityServiceInfo) r2
            android.content.pm.ResolveInfo r3 = r2.getResolveInfo()
            android.content.pm.ServiceInfo r3 = r3.serviceInfo
            java.lang.String r3 = r3.name
            android.content.pm.ResolveInfo r4 = r2.getResolveInfo()
            android.content.pm.ServiceInfo r4 = r4.serviceInfo
            java.lang.String r4 = r4.packageName
            android.content.pm.ResolveInfo r2 = r2.getResolveInfo()
            android.content.Context r5 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.CharSequence r2 = r2.loadLabel(r5)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "应用名称："
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = "--->app包名："
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = "---->service路径："
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r1.add(r2)
            goto L19
        L6e:
            com.acse.ottn.q2 r0 = b()
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            java.lang.String r2 = "accessiblity_list"
            r0.b(r2, r1)
            return
    }

    public void a(android.app.Activity r1) {
            r0 = this;
            com.acse.ottn.q2.f2597b = r1
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 == 0) goto L22
            java.lang.String r0 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r0 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1e
            goto L22
        L1e:
            r0 = 0
            r1.a(r2, r0, r0)
        L22:
            return
    }

    public final void a(java.lang.String r3, java.lang.String r4, com.acse.ottn.q2.c r5) {
            r2 = this;
            java.lang.String r0 = "MobclickAgentUtil"
            java.lang.String r1 = "埋点"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto Le
            return
        Le:
            com.acse.ottn.g0 r0 = new com.acse.ottn.g0
            r0.<init>()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            java.util.Map r4 = a(r3, r4)
            okhttp3.RequestBody r4 = r1.a(r4, r3)
            rx.e r4 = r0.a(r4)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r4 = r4.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r4 = r4.I3(r0)
            com.acse.ottn.q2$a r0 = new com.acse.ottn.q2$a
            r0.<init>(r2, r3, r5)
            com.acse.ottn.q2$b r3 = new com.acse.ottn.q2$b
            r3.<init>(r2)
            r4.u5(r0, r3)
            return
    }

    public void b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 == 0) goto L22
            java.lang.String r0 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r0 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1e
            goto L22
        L1e:
            r0 = 0
            r1.a(r2, r3, r0)
        L22:
            return
    }

    public void b(java.lang.String r2, java.lang.String r3, com.acse.ottn.q2.c r4) {
            r1 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 == 0) goto L21
            java.lang.String r0 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L21
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r0 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1e
            goto L21
        L1e:
            r1.a(r2, r3, r4)
        L21:
            return
    }

    public void c() {
            r5 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "accession_size"
            r2 = 0
            r0.a(r1, r2)
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L19
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "accessibility_enabled"
            int r0 = android.provider.Settings.Secure.getInt(r0, r3)     // Catch: java.lang.Exception -> L19
            goto L35
        L19:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error finding setting, default accessibility to not found: "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AccessibilityIntroduce"
            com.acse.ottn.h2.b(r3, r0)
            r0 = 0
        L35:
            android.text.TextUtils$SimpleStringSplitter r3 = new android.text.TextUtils$SimpleStringSplitter
            r4 = 58
            r3.<init>(r4)
            r4 = 1
            if (r0 != r4) goto L6e
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r4 = "enabled_accessibility_services"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r4)
            if (r0 == 0) goto L6e
            r3.setString(r0)
        L52:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6e
            java.lang.String r0 = r3.next()
            java.lang.String r4 = ".service.ShopHelperService"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L52
            int r2 = r2 + 1
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            r0.a(r1, r2)
            goto L52
        L6e:
            return
    }

    public final java.lang.Object e() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.q2 r0 = com.acse.ottn.q2.a
            return r0
    }
}
