package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m2 {

    /* renamed from: c, reason: collision with root package name */
    public static android.view.View f2481c = null;

    /* renamed from: d, reason: collision with root package name */
    public static android.view.WindowManager f2482d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f2483e = "MainService";

    /* renamed from: f, reason: collision with root package name */
    public static com.acse.ottn.m2 f2484f;
    public android.view.WindowManager.LayoutParams a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.model.AccessiblityModel f2485b;

    static {
            return
    }

    public m2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.m2 a() {
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.f2484f
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.m2> r0 = com.acse.ottn.m2.class
            monitor-enter(r0)
            com.acse.ottn.m2 r1 = com.acse.ottn.m2.f2484f     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.m2 r1 = new com.acse.ottn.m2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.m2.f2484f = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.f2484f
            return r0
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
            com.acse.ottn.m2.f2482d = r3
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
            com.acse.ottn.m2.f2482d = r3
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
            r0 = 51
            r3.gravity = r0
            r0 = 0
            r3.x = r0
            r3.y = r0
            r0 = -1
            r3.width = r0
            return
    }

    public final void a(android.app.Service r3, int r4) {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "setLayoutView "
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a()     // Catch: java.lang.Exception -> L28
            boolean r0 = r0.a(r3)     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L12
            goto L14
        L12:
            android.accessibilityservice.AccessibilityService r3 = (android.accessibilityservice.AccessibilityService) r3     // Catch: java.lang.Exception -> L28
        L14:
            android.app.Application r3 = r3.getApplication()     // Catch: java.lang.Exception -> L28
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)     // Catch: java.lang.Exception -> L28
            r0 = 0
            android.view.View r3 = r3.inflate(r4, r0)     // Catch: java.lang.Exception -> L28
            com.acse.ottn.m2.f2481c = r3     // Catch: java.lang.Exception -> L28
            r4 = 0
            r3.measure(r4, r4)     // Catch: java.lang.Exception -> L28
            return
        L28:
            r3 = move-exception
            java.lang.String r4 = com.acse.ottn.m2.f2483e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setLayoutView e = "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.acse.ottn.h2.a(r4, r3)
            return
    }

    public void a(android.app.Service r3, com.acse.ottn.model.AccessiblityModel r4, com.acse.ottn.service.a.u0 r5) {
            r2 = this;
            if (r4 == 0) goto L92
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r4.getData()
            if (r0 != 0) goto La
            goto L92
        La:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r4.getData()
            java.lang.String r0 = r0.getCoupon_type()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3c
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r4.getData()
            java.lang.String r0 = r0.getCoupon_type()
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            int r0 = com.acse.ottn.R.layout.video_taobao_main_background
            r2.a(r3, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.b(r3, r1, r4, r5)
            android.view.WindowManager$LayoutParams r5 = r2.a
            r0 = -1
            r5.height = r0
            goto L54
        L3c:
            int r0 = com.acse.ottn.R.layout.custom_smile_background
            r2.a(r3, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.c(r3, r1, r4, r5)
            android.view.WindowManager$LayoutParams r5 = r2.a
            r0 = 1134559232(0x43a00000, float:320.0)
            int r0 = com.acse.ottn.x0.a(r3, r0)
            r5.height = r0
        L54:
            boolean r5 = com.acse.ottn.l0.f2434e
            if (r5 == 0) goto L92
            java.lang.String r5 = com.acse.ottn.m2.f2483e     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = "show view"
            com.acse.ottn.h2.a(r5, r0)     // Catch: java.lang.Exception -> L77
            android.view.WindowManager r5 = com.acse.ottn.m2.f2482d     // Catch: java.lang.Exception -> L77
            android.view.View r0 = com.acse.ottn.m2.f2481c     // Catch: java.lang.Exception -> L77
            android.view.WindowManager$LayoutParams r1 = r2.a     // Catch: java.lang.Exception -> L77
            r5.addView(r0, r1)     // Catch: java.lang.Exception -> L77
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r4.getData()     // Catch: java.lang.Exception -> L77
            int r4 = r4.getPlay_audio()     // Catch: java.lang.Exception -> L77
            r5 = 1
            if (r4 != r5) goto L92
            com.acse.ottn.util.HelpShopAppUtil.playVideo(r3)     // Catch: java.lang.Exception -> L77
            return
        L77:
            r3 = move-exception
            java.lang.String r4 = com.acse.ottn.m2.f2483e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "添加失败 e="
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.acse.ottn.h2.a(r4, r3)
        L92:
            return
    }

    public void a(android.app.Service r3, java.lang.String r4, com.acse.ottn.service.a.u0 r5) {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "noShowCoupon "
            com.acse.ottn.h2.c(r0, r1)
            android.view.WindowManager r0 = com.acse.ottn.m2.f2482d     // Catch: java.lang.Exception -> L31
            android.view.View r1 = com.acse.ottn.m2.f2481c     // Catch: java.lang.Exception -> L31
            r0.removeView(r1)     // Catch: java.lang.Exception -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L15
            return
        L15:
            int r0 = com.acse.ottn.R.layout.coupon_no_showbackground     // Catch: java.lang.Exception -> L31
            r2.a(r3, r0)     // Catch: java.lang.Exception -> L31
            com.acse.ottn.service.a r3 = com.acse.ottn.service.a.b()     // Catch: java.lang.Exception -> L31
            android.view.View r0 = com.acse.ottn.m2.f2481c     // Catch: java.lang.Exception -> L31
            r1 = 1
            r3.a(r0, r4, r1, r5)     // Catch: java.lang.Exception -> L31
            android.view.WindowManager$LayoutParams r3 = r2.a     // Catch: java.lang.Exception -> L31
            r4 = -2
            r3.height = r4     // Catch: java.lang.Exception -> L31
            android.view.WindowManager r4 = com.acse.ottn.m2.f2482d     // Catch: java.lang.Exception -> L31
            android.view.View r5 = com.acse.ottn.m2.f2481c     // Catch: java.lang.Exception -> L31
            r4.addView(r5, r3)     // Catch: java.lang.Exception -> L31
            return
        L31:
            r3 = move-exception
            java.lang.String r4 = com.acse.ottn.m2.f2483e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "noShowCoupon e="
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.acse.ottn.h2.c(r4, r3)
            return
    }

    public final void a(java.lang.String r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "pic_type"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ShopHelperService"
            java.lang.String r1 = "isShowBigPicture "
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "MainServiceShowUtil"
            if (r0 == 0) goto L3d
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r0 = r0.e(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " ---samon QuickPreference.getInstance() jsondata="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r1, r2)
            goto L3f
        L3d:
            java.lang.String r0 = ""
        L3f:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = "isShowBigPicture ---samon label1= "
            if (r2 != 0) goto L7d
            if (r0 != 0) goto L4a
            goto L7d
        L4a:
            java.lang.Class<com.acse.ottn.model.ShowWindowModel> r2 = com.acse.ottn.model.ShowWindowModel.class
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r0, r2)
            com.acse.ottn.model.ShowWindowModel r2 = (com.acse.ottn.model.ShowWindowModel) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "isShowBigPicture ---samon jsondata= "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.acse.ottn.h2.a(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r2.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r1, r0)
            goto L9d
        L7d:
            com.acse.ottn.model.ShowWindowModel r2 = new com.acse.ottn.model.ShowWindowModel
            r2.<init>()
            java.lang.String r0 = "isShowBigPicture ---samon jsondata= is null"
            com.acse.ottn.h2.a(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r2.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r1, r0)
        L9d:
            r2.setAppName(r7)
            com.acse.ottn.s0 r0 = com.acse.ottn.s0.d()
            java.lang.String r0 = r0.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isShowBigPicture ---samon label2 = "
            r3.append(r4)
            java.lang.String r4 = r2.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.acse.ottn.h2.a(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isShowBigPicture ---samon date= "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.acse.ottn.h2.a(r1, r3)
            java.lang.String r3 = r2.getShowBigWindowData()
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L13f
            r2.setShowBigWindowData(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "isShowBigPicture ---samon label3 = "
            r0.append(r3)
            java.lang.String r3 = r2.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r1, r0)
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isShowBigPicture ---samon  str= "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            if (r2 == 0) goto L13f
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r7, r0)
            java.lang.String r0 = "isShowBigPicture ---samon  jsondata= is null"
            com.acse.ottn.h2.a(r1, r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r7 = r0.e(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " ---samon s= "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.acse.ottn.h2.a(r1, r7)
        L13f:
            return
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.f2484f
            return r0
    }

    public void b(android.app.Service r4) {
            r3 = this;
            android.view.View r0 = com.acse.ottn.m2.f2481c     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto Lc
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> La
            goto Lc
        La:
            r4 = move-exception
            goto L24
        Lc:
            android.view.WindowManager r0 = com.acse.ottn.m2.f2482d     // Catch: java.lang.Exception -> La
            android.view.View r1 = com.acse.ottn.m2.f2481c     // Catch: java.lang.Exception -> La
            r0.removeView(r1)     // Catch: java.lang.Exception -> La
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a()     // Catch: java.lang.Exception -> La
            boolean r0 = r0.a(r4)     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            android.accessibilityservice.AccessibilityService r4 = (android.accessibilityservice.AccessibilityService) r4     // Catch: java.lang.Exception -> La
        L20:
            r4.stopSelf()     // Catch: java.lang.Exception -> La
            return
        L24:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dismiss e="
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.acse.ottn.h2.a(r0, r4)
            return
    }

    public final void b(android.app.Service r6, com.acse.ottn.model.AccessiblityModel r7, com.acse.ottn.service.a.u0 r8) {
            r5 = this;
            if (r7 == 0) goto L6a4
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            if (r0 == 0) goto L6a4
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            goto L6a4
        L18:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getCoupon_type()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "1"
            r2 = -1
            if (r0 != 0) goto L293
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getCoupon_type()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L293
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.t
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L246
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.u
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L61
            goto L246
        L61:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.w
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lc2
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9d
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "jd礼金大图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.jd_lijin_big_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.J(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L9d:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "jd大图"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            r5.a(r0)
            int r0 = com.acse.ottn.R.layout.jd_shop_big_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.I(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        Lc2:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.J
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L221
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.N
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L221
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.l
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L100
            goto L221
        L100:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.m
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L139
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "tb FZ大图"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            r5.a(r0)
            int r0 = com.acse.ottn.R.layout.tbfz_shop_big_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.u(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L139:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.O
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1fc
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.R
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L163
            goto L1fc
        L163:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.x
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19c
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "京东外卖大图"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            r5.a(r0)
            int r0 = com.acse.ottn.R.layout.jdwm_shop_big_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.v(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L19c:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.K
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d5
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "didi大图"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            r5.a(r0)
            int r0 = com.acse.ottn.R.layout.didi_big_background
            r5.a(r6, r0)
            android.view.WindowManager$LayoutParams r0 = r5.a
            r0.height = r2
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.s(r6, r1, r7, r8)
            return
        L1d5:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.U
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a4
            int r0 = com.acse.ottn.R.layout.video_taobao_main_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.b(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L1fc:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "eleme大图"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            r5.a(r0)
            int r0 = com.acse.ottn.R.layout.eleme_shop_big_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.E(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L221:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "mt大图"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            r5.a(r0)
            int r0 = com.acse.ottn.R.layout.meituan_big_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.y(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L246:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L26e
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "taobao礼金大图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.tb_lijin_big_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.B(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L26e:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            r5.a(r0)
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "淘宝大图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.taobao_old_big_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.z(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L293:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.t
            boolean r0 = r0.equals(r3)
            r3 = 1134559232(0x43a00000, float:320.0)
            if (r0 != 0) goto L65f
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r4 = com.acse.ottn.o.c()
            java.lang.String r4 = r4.u
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L2bf
            goto L65f
        L2bf:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.w
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2f1
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "jd小图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.jd_shop_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.K(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L2f1:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.J
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L641
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.N
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L641
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.l
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32f
            goto L641
        L32f:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.m
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L361
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "tb FZ小图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.tbfz_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.G(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L361:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.O
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L623
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.R
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38b
            goto L623
        L38b:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.x
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3bd
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "京东小图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.jdwm_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.w(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L3bd:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.K
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3ef
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "didi小图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.didi_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.t(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L3ef:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.y
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L421
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "美团鲜花"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.mt_xh_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.o(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L421:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.A
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L453
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "美团医药"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.mt_yy_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.q(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L453:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.B
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L485
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "美团酒店"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.mt_hotel_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.p(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L485:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.D
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b7
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "美团超市"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.mt_shop_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.r(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L4b7:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.F
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e9
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "咸鱼"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.idlefish_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.d(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L4e9:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.G
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51b
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "闪购"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.shangou_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.h(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L51b:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.T
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54d
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "淘宝首页"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.tb_home_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.i(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L54d:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.W
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L57f
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "jd首页"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.jd_home_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.e(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L57f:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.o
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L605
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.p
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a8
            goto L605
        L5a8:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.f2529b0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5da
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "唯品会"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.wph_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.l(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L5da:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.U
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a4
            int r0 = com.acse.ottn.R.layout.custom_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.c(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L605:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "快手和快手极速版"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.ks_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.g(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L623:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "eleme小图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.eleme_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.F(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L641:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "mt小图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.meituan_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.x(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r7 = r5.a
            int r6 = com.acse.ottn.x0.a(r6, r3)
            r7.height = r6
            return
        L65f:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r7.getData()
            java.lang.String r0 = r0.getPic_type()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L687
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "taobao礼金图"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.tb_lj_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.A(r6, r1, r7, r8)
            android.view.WindowManager$LayoutParams r6 = r5.a
            r6.height = r2
            return
        L687:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "tb小图"
            com.acse.ottn.h2.a(r0, r1)
            android.view.WindowManager$LayoutParams r0 = r5.a
            int r1 = com.acse.ottn.x0.a(r6, r3)
            r0.height = r1
            int r0 = com.acse.ottn.R.layout.shop_smile_background
            r5.a(r6, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r1 = com.acse.ottn.m2.f2481c
            r0.C(r6, r1, r7, r8)
        L6a4:
            return
    }

    public void c(android.app.Service r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r3 = this;
            if (r5 == 0) goto L1e2
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            if (r0 == 0) goto L1e2
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            goto L1e2
        L18:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "开始显示弹框="
            r1.append(r2)
            java.lang.String r2 = r5.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.S
            boolean r0 = r0.equals(r1)
            r1 = -1
            if (r0 == 0) goto L5b
            int r0 = com.acse.ottn.R.layout.video_aiqiyi_background
            r3.a(r4, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r2 = com.acse.ottn.m2.f2481c
            r0.k(r4, r2, r5, r6)
            android.view.WindowManager$LayoutParams r6 = r3.a
            r6.height = r1
            goto L18c
        L5b:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.M
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L83
            int r0 = com.acse.ottn.R.layout.youku_background
            r3.a(r4, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r2 = com.acse.ottn.m2.f2481c
            r0.n(r4, r2, r5, r6)
            android.view.WindowManager$LayoutParams r6 = r3.a
            r6.height = r1
            goto L18c
        L83:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.L
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lab
            int r0 = com.acse.ottn.R.layout.tencent_background
            r3.a(r4, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r2 = com.acse.ottn.m2.f2481c
            r0.j(r4, r2, r5, r6)
            android.view.WindowManager$LayoutParams r6 = r3.a
            r6.height = r1
            goto L18c
        Lab:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.q
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld3
            int r0 = com.acse.ottn.R.layout.baidu_wnagpan_background
            r3.a(r4, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r2 = com.acse.ottn.m2.f2481c
            r0.a(r4, r2, r5, r6)
            android.view.WindowManager$LayoutParams r6 = r3.a
            r6.height = r1
            goto L18c
        Ld3:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.s
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lfb
            int r0 = com.acse.ottn.R.layout.kfc_background
            r3.a(r4, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r2 = com.acse.ottn.m2.f2481c
            r0.f(r4, r2, r5, r6)
            android.view.WindowManager$LayoutParams r6 = r3.a
            r6.height = r1
            goto L18c
        Lfb:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.r
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L122
            int r0 = com.acse.ottn.R.layout.hxz_shop_big_background
            r3.a(r4, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r2 = com.acse.ottn.m2.f2481c
            r0.H(r4, r2, r5, r6)
            android.view.WindowManager$LayoutParams r6 = r3.a
            r6.height = r1
            goto L18c
        L122:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.Q
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L15b
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r2 = "xbk大图"
            com.acse.ottn.h2.a(r0, r2)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            r3.a(r0)
            int r0 = com.acse.ottn.R.layout.xbk_background
            r3.a(r4, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r2 = com.acse.ottn.m2.f2481c
            r0.D(r4, r2, r5, r6)
            android.view.WindowManager$LayoutParams r6 = r3.a
            r6.height = r1
            goto L18c
        L15b:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.n
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L182
            int r0 = com.acse.ottn.R.layout.xhs_main_background
            r3.a(r4, r0)
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.b()
            android.view.View r2 = com.acse.ottn.m2.f2481c
            r0.m(r4, r2, r5, r6)
            android.view.WindowManager$LayoutParams r6 = r3.a
            r6.height = r1
            goto L18c
        L182:
            java.lang.String r0 = com.acse.ottn.m2.f2483e
            java.lang.String r1 = "show setGoodData"
            com.acse.ottn.h2.a(r0, r1)
            r3.b(r4, r5, r6)
        L18c:
            java.lang.String r6 = com.acse.ottn.m2.f2483e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "show view   CommonUtil.isShowConpunInfor= "
            r0.append(r1)
            boolean r1 = com.acse.ottn.l0.f2434e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r6, r0)
            boolean r6 = com.acse.ottn.l0.f2434e
            if (r6 == 0) goto L1e2
            java.lang.String r6 = com.acse.ottn.m2.f2483e     // Catch: java.lang.Exception -> L1c7
            java.lang.String r0 = "show view"
            com.acse.ottn.h2.a(r6, r0)     // Catch: java.lang.Exception -> L1c7
            android.view.WindowManager r6 = com.acse.ottn.m2.f2482d     // Catch: java.lang.Exception -> L1c7
            android.view.View r0 = com.acse.ottn.m2.f2481c     // Catch: java.lang.Exception -> L1c7
            android.view.WindowManager$LayoutParams r1 = r3.a     // Catch: java.lang.Exception -> L1c7
            r6.addView(r0, r1)     // Catch: java.lang.Exception -> L1c7
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r5.getData()     // Catch: java.lang.Exception -> L1c7
            int r5 = r5.getPlay_audio()     // Catch: java.lang.Exception -> L1c7
            r6 = 1
            if (r5 != r6) goto L1e2
            com.acse.ottn.util.HelpShopAppUtil.playVideo(r4)     // Catch: java.lang.Exception -> L1c7
            return
        L1c7:
            r4 = move-exception
            java.lang.String r5 = com.acse.ottn.m2.f2483e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "添加失败 e="
            r6.append(r0)
            java.lang.String r4 = r4.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.acse.ottn.h2.a(r5, r4)
        L1e2:
            return
    }
}
