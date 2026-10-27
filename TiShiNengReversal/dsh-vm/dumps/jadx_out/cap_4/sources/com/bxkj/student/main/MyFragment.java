package com.bxkj.student.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView A;
    private android.widget.TextView B;
    private android.widget.Button C;
    private android.widget.LinearLayout D;
    private android.widget.LinearLayout E;
    private android.widget.LinearLayout F;
    private android.widget.LinearLayout G;
    private android.widget.LinearLayout H;
    private android.widget.LinearLayout I;
    private android.widget.Button j;
    private android.widget.TextView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f1096l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f1097m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.TextView f1098n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.TextView f1099o;

    /* renamed from: p, reason: collision with root package name */
    private android.widget.TextView f1100p;

    /* renamed from: q, reason: collision with root package name */
    private android.widget.TextView f1101q;

    /* renamed from: r, reason: collision with root package name */
    private android.widget.TextView f1102r;

    /* renamed from: s, reason: collision with root package name */
    private android.widget.ImageView f1103s;

    /* renamed from: t, reason: collision with root package name */
    private android.widget.LinearLayout f1104t;

    /* renamed from: u, reason: collision with root package name */
    private android.widget.LinearLayout f1105u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1106v;

    /* renamed from: w, reason: collision with root package name */
    private android.widget.ImageView f1107w;

    /* renamed from: x, reason: collision with root package name */
    private android.widget.LinearLayout f1108x;

    /* renamed from: y, reason: collision with root package name */
    private android.widget.LinearLayout f1109y;

    /* renamed from: z, reason: collision with root package name */
    private android.widget.LinearLayout f1110z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.main.MyFragment a;

        a(com.bxkj.student.main.MyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r4 = this;
                com.bxkj.student.personal.login.c.c()
                com.bxkj.student.main.MyFragment r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.main.MyFragment r2 = r4.a
                android.content.Context r2 = com.bxkj.student.main.MyFragment.R(r2)
                java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r3 = com.bxkj.student.personal.login.LoginActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.MyFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.main.MyFragment.b a;

            a(com.bxkj.student.main.MyFragment.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public static /* synthetic */ kotlin.n1 a(com.bxkj.student.main.MyFragment.b.a r0) {
                    kotlin.n1 r0 = r0.b()
                    return r0
            }

            private /* synthetic */ kotlin.n1 b() {
                    r4 = this;
                    com.bxkj.student.main.MyFragment$b r0 = r4.a
                    com.bxkj.student.main.MyFragment r0 = r0.a
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.main.MyFragment$b r2 = r4.a
                    com.bxkj.student.main.MyFragment r2 = r2.a
                    android.content.Context r2 = com.bxkj.student.main.MyFragment.S(r2)
                    java.lang.Class<com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity> r3 = com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.class
                    r1.<init>(r2, r3)
                    r0.startActivity(r1)
                    r0 = 0
                    return r0
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.main.MyFragment$b r3 = r2.a
                    com.bxkj.student.main.MyFragment r3 = r3.a
                    androidx.fragment.app.FragmentActivity r3 = r3.getActivity()
                    com.bxkj.student.main.f r0 = new com.bxkj.student.main.f
                    r0.<init>(r2)
                    java.lang.String r1 = "人脸采集"
                    com.bxkj.base.v2.common.ext.t.p(r3, r1, r0)
                    return
            }
        }

        b(com.bxkj.student.main.MyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.main.MyFragment r3 = r2.a
                android.content.Context r3 = com.bxkj.student.main.MyFragment.T(r3)
                cn.bluemobi.dylan.http.HttpRequest r3 = cn.bluemobi.dylan.http.Http.with(r3)
                cn.bluemobi.dylan.http.HttpRequest r3 = r3.hideSuccessMessage()
                java.lang.Class<d0.a> r0 = d0.a.class
                java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
                d0.a r0 = (d0.a) r0
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getUserId()
                rx.e r0 = r0.p(r1)
                cn.bluemobi.dylan.http.HttpRequest r3 = r3.setObservable(r0)
                com.bxkj.student.main.MyFragment$b$a r0 = new com.bxkj.student.main.MyFragment$b$a
                r0.<init>(r2)
                r3.setDataListener(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.umeng.socialize.utils.ShareBoardlistener {
        final /* synthetic */ com.bxkj.student.main.MyFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.umeng.socialize.UMShareListener {
            final /* synthetic */ com.bxkj.student.main.MyFragment.c a;

            a(com.bxkj.student.main.MyFragment.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.student.main.MyFragment$c r3 = r2.a
                    com.bxkj.student.main.MyFragment r3 = r3.a
                    android.content.Context r3 = com.bxkj.student.main.MyFragment.W(r3)
                    java.lang.String r0 = " 分享取消了"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    return
            }

            public void onError(com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.Throwable r3) {
                    r1 = this;
                    r3.getClass()
                    com.bxkj.student.main.MyFragment$c r2 = r1.a
                    com.bxkj.student.main.MyFragment r2 = r2.a
                    android.content.Context r2 = com.bxkj.student.main.MyFragment.V(r2)
                    java.lang.String r3 = " 分享失败啦"
                    r0 = 0
                    android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                    r2.show()
                    return
            }

            public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                    r0 = this;
                    return
            }

            public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                    r0 = this;
                    return
            }
        }

        c(com.bxkj.student.main.MyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onclick(com.umeng.socialize.shareboard.SnsPlatform r4, com.umeng.socialize.bean.SHARE_MEDIA r5) {
                r3 = this;
                com.umeng.socialize.media.UMWeb r4 = new com.umeng.socialize.media.UMWeb
                java.lang.String r0 = "http://sj.qq.com/myapp/detail.htm?apkName=com.bxkj.student"
                r4.<init>(r0)
                java.lang.String r0 = "校园生活如此简单"
                r4.setTitle(r0)
                com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
                com.bxkj.student.main.MyFragment r1 = r3.a
                android.content.Context r1 = com.bxkj.student.main.MyFragment.U(r1)
                java.lang.String r2 = "http://m.boxkj.com/resources/wechat/images/xiaowei.png"
                r0.<init>(r1, r2)
                r4.setThumb(r0)
                com.bxkj.student.main.MyFragment r0 = r3.a
                r1 = 2131952726(0x7f130456, float:1.9541903E38)
                java.lang.String r0 = r0.getString(r1)
                r4.setDescription(r0)
                com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
                com.bxkj.student.main.MyFragment r1 = r3.a
                androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
                r0.<init>(r1)
                com.umeng.socialize.ShareAction r5 = r0.setPlatform(r5)
                com.bxkj.student.main.MyFragment$c$a r0 = new com.bxkj.student.main.MyFragment$c$a
                r0.<init>(r3)
                com.umeng.socialize.ShareAction r5 = r5.setCallback(r0)
                com.umeng.socialize.ShareAction r4 = r5.withMedia(r4)
                r4.share()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.MyFragment a;

        d(com.bxkj.student.main.MyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "data"
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r0)
                com.bxkj.student.main.MyFragment r0 = r1.a
                android.widget.ImageView r0 = com.bxkj.student.main.MyFragment.Q(r0)
                if (r2 <= 0) goto L10
                r2 = 0
                goto L12
            L10:
                r2 = 8
            L12:
                r0.setVisibility(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.MyFragment a;

        e(com.bxkj.student.main.MyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "userNum"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setAccount(r1)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "name"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setRealName(r1)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "phone"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setPhone(r1)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "sex"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setSex(r1)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "schoolName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setSchoolName(r1)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "collectPhoto"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setHeadImageUrl(r3)
                com.bxkj.student.main.MyFragment r3 = r2.a
                r3.f0()
                return
        }
    }

    public MyFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1106v = r0
            return
    }

    public static /* synthetic */ void N(com.bxkj.student.main.MyFragment r0, int r1, android.content.Intent r2) {
            r0.c0(r1, r2)
            return
    }

    public static /* synthetic */ kotlin.n1 O(com.bxkj.student.main.MyFragment r0) {
            kotlin.n1 r0 = r0.d0()
            return r0
    }

    public static /* synthetic */ void P(com.bxkj.student.main.MyFragment r0, android.view.View r1) {
            r0.b0(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView Q(com.bxkj.student.main.MyFragment r0) {
            android.widget.ImageView r0 = r0.f1103s
            return r0
    }

    static /* synthetic */ android.content.Context R(com.bxkj.student.main.MyFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context S(com.bxkj.student.main.MyFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context T(com.bxkj.student.main.MyFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context U(com.bxkj.student.main.MyFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context V(com.bxkj.student.main.MyFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context W(com.bxkj.student.main.MyFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void X() {
            r3 = this;
            java.lang.String r0 = "mqqwpa://im/chat?chat_type=wpa&uin=884165111"
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L11
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L11
            r3.startActivity(r1)     // Catch: java.lang.Exception -> L11
            return
        L11:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.g
            r0.<init>(r1)
            java.lang.String r1 = "请先安装QQ！"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
    }

    private void Y() {
            r3 = this;
            android.content.Context r0 = r3.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = "2"
            rx.e r1 = r1.c1(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.MyFragment$b r1 = new com.bxkj.student.main.MyFragment$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void b0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.g
            java.lang.Class<com.bxkj.student.v2.ui.my.AdSwitchActivity> r1 = com.bxkj.student.v2.ui.my.AdSwitchActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void c0(int r2, android.content.Intent r3) {
            r1 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "人脸识别回调resultCode="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.orhanobut.logger.j.c(r3)
            r3 = -1
            if (r2 != r3) goto L27
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r3 = r1.g
            r2.<init>(r3)
            java.lang.String r3 = "人脸验证成功"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
            r2.show()
        L27:
            return
    }

    private /* synthetic */ kotlin.n1 d0() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.g
            java.lang.Class<com.bxkj.student.run.app.face.FaceDetectExpActivity> r2 = com.bxkj.student.run.app.face.FaceDetectExpActivity.class
            r0.<init>(r1, r2)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "identify"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "isShowSuccessMessage"
            r2 = 0
            r0.putExtra(r1, r2)
            t.b r1 = new t.b
            r1.<init>(r3)
            t.b r0 = r1.startActivityForResult(r0)
            com.bxkj.student.main.c r1 = new com.bxkj.student.main.c
            r1.<init>(r3)
            r0.c(r1)
            r0 = 0
            return r0
    }

    private void e0() {
            r4 = this;
            boolean r0 = r4.f1106v
            if (r0 == 0) goto L40
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L19
            r4.f0()
            android.widget.Button r0 = r4.C
            java.lang.String r1 = "退出"
            r0.setText(r1)
            return
        L19:
            android.content.Context r0 = r4.g
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getHeadImageUrl()
            android.widget.ImageView r2 = r4.f1107w
            r3 = 2131689689(0x7f0f00d9, float:1.90084E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r1, r2, r3, r3)
            android.widget.TextView r0 = r4.A
            java.lang.String r1 = "未登录"
            r0.setText(r1)
            android.widget.TextView r0 = r4.B
            java.lang.String r1 = "请登录"
            r0.setText(r1)
            android.widget.Button r0 = r4.C
            java.lang.String r1 = "登录"
            r0.setText(r1)
        L40:
            return
    }

    private void g0() {
            r4 = this;
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            r0.<init>(r1)
            r1 = 4
            com.umeng.socialize.bean.SHARE_MEDIA[] r1 = new com.umeng.socialize.bean.SHARE_MEDIA[r1]
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r3 = 0
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r3 = 1
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r3 = 2
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r3 = 3
            r1[r3] = r2
            com.umeng.socialize.ShareAction r0 = r0.setDisplayList(r1)
            com.bxkj.student.main.MyFragment$c r1 = new com.bxkj.student.main.MyFragment$c
            r1.<init>(r4)
            com.umeng.socialize.ShareAction r0 = r0.setShareboardclickCallback(r1)
            r0.open()
            return
    }

    public void Z() {
            r4 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L48
            android.content.Context r0 = r4.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.s(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.MyFragment$d r1 = new com.bxkj.student.main.MyFragment$d
            r1.<init>(r4)
            r0.setDataListener(r1)
        L48:
            return
    }

    public void a0() {
            r2 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L28
            android.content.Context r0 = r2.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.j1()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.MyFragment$e r1 = new com.bxkj.student.main.MyFragment$e
            r1.<init>(r2)
            r0.setDataListener(r1)
        L28:
            return
    }

    public void b() {
            r2 = this;
            android.widget.Button r0 = r2.j
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.k
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1096l
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1097m
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1098n
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1099o
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1100p
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1101q
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1102r
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r2.f1107w
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.A
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.B
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r2.C
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.D
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.F
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.E
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.G
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.f1104t
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.H
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.I
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.f1108x
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.f1109y
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.f1105u
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.f1110z
            r0.setOnClickListener(r2)
            r0 = 2131298062(0x7f09070e, float:1.8214087E38)
            android.view.View r0 = r2.c(r0)
            com.bxkj.student.main.d r1 = new com.bxkj.student.main.d
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected void e() {
            r0 = this;
            r0.a0()
            r0.e0()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131296618(0x7f09016a, float:1.8211158E38)
            android.view.View r1 = r0.c(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.j = r1
            r1 = 2131299178(0x7f090b6a, float:1.821635E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.k = r1
            r1 = 2131299086(0x7f090b0e, float:1.8216163E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1096l = r1
            r1 = 2131299149(0x7f090b4d, float:1.8216291E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1097m = r1
            r1 = 2131296279(0x7f090017, float:1.821047E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1098n = r1
            r1 = 2131298931(0x7f090a73, float:1.821585E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1099o = r1
            r1 = 2131299100(0x7f090b1c, float:1.8216192E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1100p = r1
            r1 = 2131298983(0x7f090aa7, float:1.8215955E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1101q = r1
            r1 = 2131298906(0x7f090a5a, float:1.8215798E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1102r = r1
            r1 = 2131297148(0x7f09037c, float:1.8212233E38)
            android.view.View r1 = r0.c(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f1107w = r1
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.A = r1
            r1 = 2131298997(0x7f090ab5, float:1.8215983E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.B = r1
            r1 = 2131296619(0x7f09016b, float:1.821116E38)
            android.view.View r1 = r0.c(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.C = r1
            r1 = 2131298037(0x7f0906f5, float:1.8214036E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.D = r1
            r1 = 2131298077(0x7f09071d, float:1.8214117E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.F = r1
            r1 = 2131298075(0x7f09071b, float:1.8214113E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.E = r1
            r1 = 2131298055(0x7f090707, float:1.8214072E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.G = r1
            r1 = 2131298025(0x7f0906e9, float:1.8214012E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f1104t = r1
            r1 = 2131298047(0x7f0906ff, float:1.8214056E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.H = r1
            r1 = 2131298064(0x7f090710, float:1.821409E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.I = r1
            r1 = 2131298035(0x7f0906f3, float:1.8214032E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f1108x = r1
            r1 = 2131298014(0x7f0906de, float:1.821399E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f1109y = r1
            r1 = 2131298036(0x7f0906f4, float:1.8214034E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f1105u = r1
            r1 = 2131298061(0x7f09070d, float:1.8214085E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f1110z = r1
            r1 = 2131297200(0x7f0903b0, float:1.8212338E38)
            android.view.View r1 = r0.c(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f1103s = r1
            r1 = 1
            r0.f1106v = r1
            r0.Z()
            return
    }

    public void f0() {
            r4 = this;
            android.content.Context r0 = r4.g
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getHeadImageUrl()
            android.widget.ImageView r2 = r4.f1107w
            r3 = 2131689689(0x7f0f00d9, float:1.90084E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r1, r2, r3, r3)
            android.widget.TextView r0 = r4.A
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getRealName()
            r0.setText(r1)
            android.widget.TextView r0 = r4.B
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            r0.setText(r1)
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493195(0x7f0c014b, float:1.8609863E38)
            return r0
    }

    public void onClick(android.view.View r6) {
            r5 = this;
            int r0 = r6.getId()
            r1 = 2131298014(0x7f0906de, float:1.821399E38)
            java.lang.String r2 = "url"
            java.lang.String r3 = "title"
            java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r4 = com.bxkj.base.webview.H5DetailActivity.class
            if (r0 != r1) goto L2a
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r0 = r5.g
            r6.<init>(r0, r4)
            java.lang.String r0 = "用户协议"
            android.content.Intent r6 = r6.putExtra(r3, r0)
            com.bxkj.student.v2.retrofit.b$a r0 = com.bxkj.student.v2.retrofit.b.a
            java.lang.String r0 = r0.c()
            android.content.Intent r6 = r6.putExtra(r2, r0)
            r5.startActivity(r6)
            return
        L2a:
            int r0 = r6.getId()
            r1 = 2131298061(0x7f09070d, float:1.8214085E38)
            if (r0 != r1) goto L4e
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r0 = r5.g
            r6.<init>(r0, r4)
            java.lang.String r0 = "隐私政策"
            android.content.Intent r6 = r6.putExtra(r3, r0)
            com.bxkj.student.v2.retrofit.b$a r0 = com.bxkj.student.v2.retrofit.b.a
            java.lang.String r0 = r0.b()
            android.content.Intent r6 = r6.putExtra(r2, r0)
            r5.startActivity(r6)
            return
        L4e:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L65
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r0 = r5.g
            java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r1 = com.bxkj.student.personal.login.LoginActivity.class
            r6.<init>(r0, r1)
            r5.startActivity(r6)
            return
        L65:
            int r6 = r6.getId()
            java.lang.Class<com.bxkj.student.personal.UserInfoActivity> r0 = com.bxkj.student.personal.UserInfoActivity.class
            switch(r6) {
                case 2131296619: goto Lc7;
                case 2131297148: goto Lbc;
                case 2131298035: goto Lb8;
                case 2131298036: goto La9;
                case 2131298037: goto La5;
                case 2131298047: goto L98;
                case 2131298055: goto L8d;
                case 2131298064: goto L80;
                case 2131298075: goto L73;
                case 2131298077: goto L6f;
                case 2131298983: goto L80;
                case 2131298986: goto Lbc;
                case 2131298997: goto Lbc;
                case 2131299178: goto L8d;
                default: goto L6e;
            }
        L6e:
            return
        L6f:
            r5.g0()
            return
        L73:
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r0 = r5.g
            java.lang.Class<com.bxkj.student.personal.SystemSetActivity> r1 = com.bxkj.student.personal.SystemSetActivity.class
            r6.<init>(r0, r1)
            r5.startActivity(r6)
            return
        L80:
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r0 = r5.g
            java.lang.Class<com.bxkj.student.personal.MyQRCodeActivity> r1 = com.bxkj.student.personal.MyQRCodeActivity.class
            r6.<init>(r0, r1)
            r5.startActivity(r6)
            return
        L8d:
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r1 = r5.g
            r6.<init>(r1, r0)
            r5.startActivity(r6)
            return
        L98:
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r0 = r5.g
            java.lang.Class<com.bxkj.student.personal.sign.SignInActivity> r1 = com.bxkj.student.personal.sign.SignInActivity.class
            r6.<init>(r0, r1)
            r5.startActivity(r6)
            return
        La5:
            r5.X()
            return
        La9:
            androidx.fragment.app.FragmentActivity r6 = r5.getActivity()
            com.bxkj.student.main.e r0 = new com.bxkj.student.main.e
            r0.<init>(r5)
            java.lang.String r1 = "人脸验证"
            com.bxkj.base.v2.common.ext.t.p(r6, r1, r0)
            return
        Lb8:
            r5.Y()
            return
        Lbc:
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r1 = r5.g
            r6.<init>(r1, r0)
            r5.startActivity(r6)
            return
        Lc7:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r6 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r0 = r5.g
            r6.<init>(r0)
            java.lang.String r0 = "提示"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r6 = r6.setTitle(r0)
            java.lang.String r0 = "您确定要退出登录吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r6 = r6.setMessage(r0)
            com.bxkj.student.main.MyFragment$a r0 = new com.bxkj.student.main.MyFragment$a
            r0.<init>(r5)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r6 = r6.setRightButtonOnClickListener(r0)
            r6.show()
            return
    }

    public void onResume() {
            r0 = this;
            super/*androidx.fragment.app.Fragment*/.onResume()
            r0.e0()
            return
    }
}
