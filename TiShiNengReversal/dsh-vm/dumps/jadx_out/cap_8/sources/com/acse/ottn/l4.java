package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l4 {

    /* renamed from: b, reason: collision with root package name */
    public static com.acse.ottn.l4 f2458b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f2459c = "StartAppUtil";
    public java.util.TimerTask a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.accessibilityservice.AccessibilityService f2460b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.l4.b f2461c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.l4 f2462d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.l4$a$a, reason: collision with other inner class name */
        public class RunnableC0078a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.l4.a a;

            public RunnableC0078a(com.acse.ottn.l4.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    if (r0 == 0) goto L2bb
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    if (r0 != 0) goto Le
                    goto L2bb
                Le:
                    java.lang.String r0 = com.acse.ottn.l4.a()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "currenttime 2="
                    r1.append(r2)
                    long r2 = java.lang.System.currentTimeMillis()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.acse.ottn.h2.a(r0, r1)
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    java.lang.String r0 = r0.getGenuine_packagename()
                    java.lang.String r1 = "click_type"
                    boolean r0 = r1.equals(r0)
                    if (r0 != 0) goto L48
                    boolean r0 = com.acse.ottn.l0.f2434e
                    if (r0 != 0) goto L48
                    java.lang.String r0 = com.acse.ottn.l4.a()
                    java.lang.String r1 = "isShowConpunInfor is false1"
                    com.acse.ottn.h2.a(r0, r1)
                    return
                L48:
                    java.lang.String r0 = com.acse.ottn.l4.a()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "couponCountDown CommonUtil.isShowConpunInfor()111 ="
                    r1.append(r2)
                    boolean r2 = com.acse.ottn.l0.f2434e
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.acse.ottn.h2.a(r0, r1)
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    java.lang.String r0 = r0.getDiscount()
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L7f
                    com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    java.lang.String r2 = "click_state"
                    r0.a(r2, r1)
                L7f:
                    java.lang.String r0 = com.acse.ottn.l4.a()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "couponCountDown couponModel.getRed_package() ="
                    r1.append(r2)
                    com.acse.ottn.l4$a r2 = r4.a
                    com.acse.ottn.model.AccessiblityModel r2 = r2.a
                    int r2 = r2.getRed_package()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.acse.ottn.h2.a(r0, r1)
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    int r0 = r0.getRed_package()
                    r1 = 1
                    if (r0 != r1) goto L2b0
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    java.lang.String r0 = r0.getPresent_price()
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto Lf0
                    com.acse.ottn.w1 r0 = com.acse.ottn.w1.a()
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getPresent_price()
                    com.acse.ottn.model.PlunInstallModel r0 = r0.a(r1)
                    java.lang.String r0 = r0.getVersion()
                    java.lang.String r1 = "0"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto Le6
                    java.lang.String r0 = com.acse.ottn.l4.a()
                    java.lang.String r1 = "current phone have not app"
                    com.acse.ottn.h2.a(r0, r1)
                    return
                Le6:
                    java.lang.String r0 = com.acse.ottn.l4.a()
                    java.lang.String r1 = "current phone have app"
                    com.acse.ottn.h2.a(r0, r1)
                    goto Lf9
                Lf0:
                    java.lang.String r0 = com.acse.ottn.l4.a()
                    java.lang.String r1 = "packageName is null"
                    com.acse.ottn.h2.a(r0, r1)
                Lf9:
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    java.lang.String r0 = r0.getAuto_open_coupon()
                    java.lang.String r1 = "1"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L11b
                    com.acse.ottn.l4 r0 = com.acse.ottn.l4.c()
                    com.acse.ottn.l4$a r1 = r4.a
                    android.accessibilityservice.AccessibilityService r2 = r1.f2460b
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    r0.b(r2, r1)
                    return
                L11b:
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    java.lang.String r0 = r0.getAuto_open_coupon()
                    java.lang.String r1 = "5"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L152
                    com.acse.ottn.o r0 = com.acse.ottn.o.c()
                    com.acse.ottn.l4$a r1 = r4.a
                    android.accessibilityservice.AccessibilityService r2 = r1.f2460b
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getTkl_turn_url()
                    r0.a(r2, r1)
                    com.acse.ottn.l4 r0 = com.acse.ottn.l4.c()
                    com.acse.ottn.l4$a r1 = r4.a
                    android.accessibilityservice.AccessibilityService r2 = r1.f2460b
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    r0.b(r2, r1)
                    return
                L152:
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    java.lang.String r0 = r0.getAuto_open_coupon()
                    java.lang.String r1 = "3"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L20d
                    com.acse.ottn.l4 r0 = com.acse.ottn.l4.c()
                    r0.b()
                    android.content.Intent r0 = new android.content.Intent
                    com.acse.ottn.l4$a r1 = r4.a
                    android.accessibilityservice.AccessibilityService r1 = r1.f2460b
                    java.lang.Class<com.acse.ottn.service.ExcessService> r2 = com.acse.ottn.service.ExcessService.class
                    r0.<init>(r1, r2)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getTkl_turn_url()
                    java.lang.String r2 = "password"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getSpop_deeplink()
                    java.lang.String r2 = "deeplink"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getSpop_link()
                    java.lang.String r2 = "link"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getPackage_name()
                    java.lang.String r2 = "name"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    int r1 = r1.getCoupon_load_time()
                    java.lang.String r2 = "time"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getOrigin_url()
                    java.lang.String r2 = "origin_url"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getJump_type()
                    java.lang.String r2 = "jump_type"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    int r1 = r1.getActivity_dismiss_time()
                    java.lang.String r2 = "dissmiss_time"
                    r0.putExtra(r2, r1)
                    r1 = 268435456(0x10000000, float:2.524355E-29)
                    r0.addFlags(r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    android.accessibilityservice.AccessibilityService r1 = r1.f2460b
                    r1.startService(r0)
                    return
                L20d:
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    java.lang.String r0 = r0.getAuto_open_coupon()
                    java.lang.String r1 = "4"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L256
                    android.content.Intent r0 = new android.content.Intent
                    com.acse.ottn.l4$a r1 = r4.a
                    android.accessibilityservice.AccessibilityService r1 = r1.f2460b
                    java.lang.Class<com.acse.ottn.service.WebViewService> r2 = com.acse.ottn.service.WebViewService.class
                    r0.<init>(r1, r2)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getOrigin_url()
                    java.lang.String r2 = "url"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    com.acse.ottn.model.AccessiblityModel r1 = r1.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                    java.lang.String r1 = r1.getTkl_turn_url()
                    java.lang.String r2 = "shortLink"
                    r0.putExtra(r2, r1)
                    com.acse.ottn.l4$a r1 = r4.a
                    android.accessibilityservice.AccessibilityService r1 = r1.f2460b
                    r1.startService(r0)
                    return
                L256:
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    java.lang.String r0 = r0.getAuto_open_coupon()
                    java.lang.String r1 = "6"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L276
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.l4$b r1 = r0.f2461c
                    if (r1 == 0) goto L2bb
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    r1.a(r0)
                    return
                L276:
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    java.lang.String r0 = r0.getAuto_open_coupon()
                    java.lang.String r1 = "8888"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L2bb
                    java.lang.String r0 = com.acse.ottn.l4.a()
                    java.lang.String r1 = "couponCountDown showFloatWindow 8888"
                    com.acse.ottn.h2.a(r0, r1)
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                    com.acse.ottn.o r1 = com.acse.ottn.o.c()
                    java.lang.String r1 = r1.U
                    r0.setPackage_name(r1)
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.l4$b r1 = r0.f2461c
                    if (r1 == 0) goto L2bb
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    r1.a(r0)
                    return
                L2b0:
                    com.acse.ottn.l4$a r0 = r4.a
                    com.acse.ottn.l4$b r1 = r0.f2461c
                    if (r1 == 0) goto L2bb
                    com.acse.ottn.model.AccessiblityModel r0 = r0.a
                    r1.a(r0)
                L2bb:
                    return
            }
        }

        public a(com.acse.ottn.l4 r1, com.acse.ottn.model.AccessiblityModel r2, android.accessibilityservice.AccessibilityService r3, com.acse.ottn.l4.b r4) {
                r0 = this;
                r0.f2462d = r1
                r0.a = r2
                r0.f2460b = r3
                r0.f2461c = r4
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r4 = this;
                android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L14
                android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L14
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
                com.acse.ottn.l4$a$a r1 = new com.acse.ottn.l4$a$a     // Catch: java.lang.Throwable -> L14
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L14
                r2 = 0
                r0.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r0 = move-exception
                java.lang.String r1 = com.acse.ottn.l4.a()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "couponCountDown e ="
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.acse.ottn.h2.a(r1, r0)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(com.acse.ottn.model.AccessiblityModel r1);
    }

    static {
            return
    }

    public l4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.l4.f2459c
            return r0
    }

    public static com.acse.ottn.l4 c() {
            com.acse.ottn.l4 r0 = com.acse.ottn.l4.f2458b
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.l4> r0 = com.acse.ottn.l4.class
            monitor-enter(r0)
            com.acse.ottn.l4 r1 = com.acse.ottn.l4.f2458b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.l4 r1 = new com.acse.ottn.l4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.l4.f2458b = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.l4 r0 = com.acse.ottn.l4.f2458b
            return r0
    }

    public void a(android.accessibilityservice.AccessibilityService r4, com.acse.ottn.model.AccessiblityModel r5, java.lang.String r6, com.acse.ottn.l4.b r7) {
            r3 = this;
            java.lang.String r6 = com.acse.ottn.l4.f2459c
            java.lang.String r0 = "couponCountDown "
            com.acse.ottn.h2.a(r6, r0)
            java.util.TimerTask r6 = r3.a
            if (r6 == 0) goto L11
            r6.cancel()
            r6 = 0
            r3.a = r6
        L11:
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r5.getData()
            java.lang.String r6 = r6.getSpop_describe()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L2e
            com.acse.ottn.d r6 = com.acse.ottn.d.d()
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getSpop_describe()
            r6.a(r4, r0)
        L2e:
            java.lang.String r6 = com.acse.ottn.l4.f2459c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "currenttime 1="
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r6, r0)
            com.acse.ottn.n0 r6 = com.acse.ottn.n0.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            int r0 = r0.getShow_coupon_time()
            com.acse.ottn.l4$a r1 = new com.acse.ottn.l4$a
            r1.<init>(r3, r5, r4, r7)
            r4 = 200(0xc8, float:2.8E-43)
            java.util.TimerTask r4 = r6.b(r0, r4, r1)
            r3.a = r4
            return
    }

    public void a(android.content.Context r4, com.acse.ottn.model.AccessiblityModel r5) {
            r3 = this;
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L39
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = r1.getPackage_name()     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = r0.l(r1)     // Catch: java.lang.Exception -> L39
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L39
            if (r1 != 0) goto L1d
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()     // Catch: java.lang.Exception -> L39
            r1.setSpop_deeplink(r0)     // Catch: java.lang.Exception -> L39
        L1d:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = r0.getSpop_deeplink()     // Catch: java.lang.Exception -> L39
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = r1.getSpop_link()     // Catch: java.lang.Exception -> L39
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r5.getData()     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = r2.getJump_type()     // Catch: java.lang.Exception -> L39
            r3.a(r4, r0, r1, r2)     // Catch: java.lang.Exception -> L39
            return
        L39:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getSpop_deeplink()
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()
            java.lang.String r1 = r1.getSpop_link()
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r5.getData()
            java.lang.String r5 = r5.getJump_type()
            r3.a(r4, r0, r1, r5)
            return
    }

    public final void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            java.lang.String r0 = r0.a(r2)
            com.tencent.mm.opensdk.openapi.IWXAPI r2 = com.tencent.mm.opensdk.openapi.WXAPIFactory.createWXAPI(r2, r0)
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req r0 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req
            r0.<init>()
            r0.userName = r4
            r0.path = r3
            r3 = 0
            r0.miniprogramType = r3
            r2.sendReq(r0)
            return
    }

    public void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            if (r3 != 0) goto L5
            goto L45
        L5:
            java.lang.String r1 = "1"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L15
            if (r4 == 0) goto L45
            if (r5 == 0) goto L45
            r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L45
            return
        L15:
            r5 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> L2c
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L2c
            r6.<init>(r0, r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "android.intent.category.BROWSABLE"
            r6.addCategory(r1)     // Catch: java.lang.Exception -> L2c
            r6.addFlags(r5)     // Catch: java.lang.Exception -> L2c
            r3.startActivity(r6)     // Catch: java.lang.Exception -> L2c
            return
        L2c:
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> L3c
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L3c
            r6.<init>(r0, r4)     // Catch: java.lang.Exception -> L3c
            r6.addFlags(r5)     // Catch: java.lang.Exception -> L3c
            r3.startActivity(r6)     // Catch: java.lang.Exception -> L3c
            goto L45
        L3c:
            com.acse.ottn.q2 r3 = com.acse.ottn.q2.b()
            java.lang.String r4 = "open_browser_fail"
            r3.a(r4)
        L45:
            return
    }

    public void b() {
            r3 = this;
            java.util.List<java.lang.ref.WeakReference<android.app.Activity>> r0 = com.acse.ottn.p.m
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L8:
            if (r1 < 0) goto L21
            java.lang.Object r2 = r0.get(r1)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L1e
            r2.finish()
            r0.remove(r1)
        L1e:
            int r1 = r1 + (-1)
            goto L8
        L21:
            return
    }

    public void b(android.content.Context r9, com.acse.ottn.model.AccessiblityModel r10) {
            r8 = this;
            if (r10 == 0) goto L154
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getSpop_deeplink()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L154
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getSpop_link()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L154
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getPackage_name()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2e
            goto L154
        L2e:
            com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "clickcoupon_"
            r1.append(r2)
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r10.getData()
            java.lang.String r2 = r2.getPackage_name()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getTo_loading()
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "jump_type"
            java.lang.String r2 = "dissmiss_time"
            java.lang.String r3 = "origin_url"
            java.lang.String r4 = "link"
            r5 = 268435456(0x10000000, float:2.524355E-29)
            if (r0 == 0) goto Ld0
            r8.b()     // Catch: java.lang.Exception -> Lcc
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> Lcc
            java.lang.Class<com.acse.ottn.activity.SeedingLoadingActivity> r6 = com.acse.ottn.activity.SeedingLoadingActivity.class
            r0.<init>(r9, r6)     // Catch: java.lang.Exception -> Lcc
            r0.addFlags(r5)     // Catch: java.lang.Exception -> Lcc
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r10.getData()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r5 = r5.getSpop_link()     // Catch: java.lang.Exception -> Lcc
            r0.putExtra(r4, r5)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = "packagename"
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r10.getData()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r5 = r5.getPackage_name()     // Catch: java.lang.Exception -> Lcc
            r0.putExtra(r4, r5)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = "tkl_turn_url"
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r10.getData()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r5 = r5.getTkl_turn_url()     // Catch: java.lang.Exception -> Lcc
            r0.putExtra(r4, r5)     // Catch: java.lang.Exception -> Lcc
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r10.getData()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = r4.getOrigin_url()     // Catch: java.lang.Exception -> Lcc
            r0.putExtra(r3, r4)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r3 = "pic_type"
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r10.getData()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = r4.getPic_type()     // Catch: java.lang.Exception -> Lcc
            r0.putExtra(r3, r4)     // Catch: java.lang.Exception -> Lcc
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r10.getData()     // Catch: java.lang.Exception -> Lcc
            int r3 = r3.getActivity_dismiss_time()     // Catch: java.lang.Exception -> Lcc
            r0.putExtra(r2, r3)     // Catch: java.lang.Exception -> Lcc
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r10.getData()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r2 = r2.getJump_type()     // Catch: java.lang.Exception -> Lcc
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lcc
            r9.startActivity(r0)     // Catch: java.lang.Exception -> Lcc
            return
        Lcc:
            r8.a(r9, r10)
            return
        Ld0:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r10.getData()
            java.lang.String r0 = r0.getTo_loading()
            java.lang.String r6 = "2"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L151
            r8.b()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.acse.ottn.activity.ExcessActivity> r6 = com.acse.ottn.activity.ExcessActivity.class
            r0.<init>(r9, r6)
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r10.getData()
            java.lang.String r6 = r6.getTkl_turn_url()
            java.lang.String r7 = "password"
            r0.putExtra(r7, r6)
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r10.getData()
            java.lang.String r6 = r6.getSpop_deeplink()
            java.lang.String r7 = "deeplink"
            r0.putExtra(r7, r6)
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r10.getData()
            java.lang.String r6 = r6.getSpop_link()
            r0.putExtra(r4, r6)
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r10.getData()
            int r4 = r4.getCoupon_load_time()
            java.lang.String r6 = "time"
            r0.putExtra(r6, r4)
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r10.getData()
            java.lang.String r4 = r4.getPackage_name()
            java.lang.String r6 = "name"
            r0.putExtra(r6, r4)
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r10.getData()
            java.lang.String r4 = r4.getOrigin_url()
            r0.putExtra(r3, r4)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r10.getData()
            int r3 = r3.getActivity_dismiss_time()
            r0.putExtra(r2, r3)
            com.acse.ottn.model.AccessiblityModel$DataBean r10 = r10.getData()
            java.lang.String r10 = r10.getJump_type()
            r0.putExtra(r1, r10)
            r0.addFlags(r5)
            r9.startActivity(r0)
            return
        L151:
            r8.a(r9, r10)
        L154:
            return
    }
}
