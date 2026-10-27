package com.bxkj.student.personal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class UserInfoActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private static final int d1 = 221;
    private static final java.lang.String e1 = "temp_photo.jpg";
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.EditText I0;
    private android.widget.EditText J0;
    private android.widget.TextView K0;
    private android.widget.EditText L0;
    private android.widget.Button M0;
    private com.bxkj.student.common.view.ToggleButton N0;
    private com.bxkj.student.common.view.ToggleButton O0;
    private android.widget.ImageView P0;
    private android.widget.ImageView Q0;
    private android.widget.TextView R0;
    private android.widget.TextView S0;
    private android.widget.ImageView T0;
    private android.widget.TextView U0;
    private final int V0;
    private java.io.File W0;
    private java.lang.String X0;
    private android.widget.TextView Y;
    private java.lang.String Y0;
    private android.widget.TextView Z;
    private java.lang.String Z0;
    private android.widget.TextView a0;

    /* renamed from: a1, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1126a1;
    private android.widget.TextView b0;

    /* renamed from: b1, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1127b1;
    private android.widget.TextView c0;

    /* renamed from: c1, reason: collision with root package name */
    com.umeng.socialize.UMAuthListener f1128c1;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1129k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1130p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        a(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.bxkj.student.personal.UserInfoActivity r0 = r1.a
                com.bxkj.student.common.view.ToggleButton r0 = com.bxkj.student.personal.UserInfoActivity.m0(r0)
                r0.toggle()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        b(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.bxkj.student.personal.UserInfoActivity r0 = r1.a
                com.bxkj.student.common.view.ToggleButton r0 = com.bxkj.student.personal.UserInfoActivity.n0(r0)
                r0.toggle()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        c(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r3) {
                r2 = this;
                super.netOnFailure(r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.personal.UserInfoActivity.P0(r0)
                r3.<init>(r0)
                java.lang.String r0 = "上传失败，请重新再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                com.bxkj.student.personal.UserInfoActivity r3 = r2.a
                android.widget.ImageView r0 = com.bxkj.student.personal.UserInfoActivity.g0(r3)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getHeadImageUrl()
                r3.f1(r0, r1)
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.UserInfoActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.personal.UserInfoActivity.O0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                com.bxkj.student.personal.UserInfoActivity r2 = r1.a
                android.widget.ImageView r3 = com.bxkj.student.personal.UserInfoActivity.g0(r2)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r0.getHeadImageUrl()
                r2.f1(r3, r0)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "data"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setHeadImageUrl(r3)
                com.bxkj.student.personal.UserInfoActivity r3 = r2.a
                android.widget.ImageView r0 = com.bxkj.student.personal.UserInfoActivity.g0(r3)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getHeadImageUrl()
                r3.f1(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        d(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r3) {
                r2 = this;
                super.netOnFailure(r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.personal.UserInfoActivity.R0(r0)
                r3.<init>(r0)
                java.lang.String r0 = "上传失败，请重新再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                com.bxkj.student.personal.UserInfoActivity r3 = r2.a
                android.widget.ImageView r0 = com.bxkj.student.personal.UserInfoActivity.g0(r3)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getHeadImageUrl()
                r3.f1(r0, r1)
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.UserInfoActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.personal.UserInfoActivity.Q0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                com.bxkj.student.personal.UserInfoActivity r2 = r1.a
                android.widget.ImageView r3 = com.bxkj.student.personal.UserInfoActivity.g0(r2)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r0.getHeadImageUrl()
                r2.f1(r3, r0)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "data"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setHeadImageUrl(r3)
                com.bxkj.student.personal.UserInfoActivity r3 = r2.a
                android.widget.ImageView r0 = com.bxkj.student.personal.UserInfoActivity.g0(r3)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getHeadImageUrl()
                r3.f1(r0, r1)
                cn.bluemobi.dylan.base.utils.a r3 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.main.MyFragment> r0 = com.bxkj.student.main.MyFragment.class
                androidx.fragment.app.Fragment r3 = r3.o(r0)
                com.bxkj.student.main.MyFragment r3 = (com.bxkj.student.main.MyFragment) r3
                if (r3 == 0) goto L2f
                r3.f0()
            L2f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements com.umeng.socialize.UMAuthListener {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        e(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r2, int r3) {
                r1 = this;
                com.bxkj.student.personal.UserInfoActivity r2 = r1.a
                android.content.Context r2 = com.bxkj.student.personal.UserInfoActivity.J0(r2)
                java.lang.String r3 = "您取消了绑定"
                r0 = 1
                android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                r2.show()
                return
        }

        public void onComplete(com.umeng.socialize.bean.SHARE_MEDIA r4, int r5, java.util.Map<java.lang.String, java.lang.String> r6) {
                r3 = this;
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "platform="
                r5.append(r0)
                java.lang.String r0 = r4.name()
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                com.orhanobut.logger.j.c(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "data="
                r5.append(r0)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.orhanobut.logger.j.c(r5)
                com.umeng.socialize.bean.SHARE_MEDIA r5 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
                if (r4 != r5) goto L33
                java.lang.String r4 = "1"
                goto L35
            L33:
                java.lang.String r4 = "0"
            L35:
                com.bxkj.student.personal.UserInfoActivity r5 = r3.a
                java.lang.String r0 = "openid"
                java.lang.Object r0 = r6.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "name"
                java.lang.Object r1 = r6.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "iconurl"
                java.lang.Object r6 = r6.get(r2)
                java.lang.String r6 = (java.lang.String) r6
                com.bxkj.student.personal.UserInfoActivity.C0(r5, r4, r0, r1, r6)
                return
        }

        public void onError(com.umeng.socialize.bean.SHARE_MEDIA r1, int r2, java.lang.Throwable r3) {
                r0 = this;
                java.lang.String r1 = r3.getMessage()
                com.orhanobut.logger.j.c(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "action="
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.orhanobut.logger.j.c(r1)
                com.bxkj.student.personal.UserInfoActivity r1 = r0.a
                android.content.Context r1 = com.bxkj.student.personal.UserInfoActivity.I0(r1)
                java.lang.String r2 = "绑定失败,请稍后再试"
                r3 = 1
                android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
                r1.show()
                return
        }

        public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ java.lang.String d;
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity e;

        f(com.bxkj.student.personal.UserInfoActivity r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r2 = r1.a
                java.lang.String r0 = "0"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L10
                com.bxkj.student.personal.UserInfoActivity r2 = r1.e
                com.bxkj.student.personal.UserInfoActivity.D0(r2)
                return
            L10:
                java.lang.String r2 = r1.a
                java.lang.String r0 = "1"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L1f
                com.bxkj.student.personal.UserInfoActivity r2 = r1.e
                com.bxkj.student.personal.UserInfoActivity.E0(r2)
            L1f:
                return
        }

        public void netOnOtherStatus(int r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r1 = r0.a
                java.lang.String r2 = "0"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L10
                com.bxkj.student.personal.UserInfoActivity r1 = r0.e
                com.bxkj.student.personal.UserInfoActivity.D0(r1)
                return
            L10:
                java.lang.String r1 = r0.a
                java.lang.String r2 = "1"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L1f
                com.bxkj.student.personal.UserInfoActivity r1 = r0.e
                com.bxkj.student.personal.UserInfoActivity.E0(r1)
            L1f:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                java.lang.String r3 = r2.a
                java.lang.String r0 = "0"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L2c
                com.bxkj.student.personal.UserInfoActivity r3 = r2.e
                com.bxkj.student.common.view.ToggleButton r3 = com.bxkj.student.personal.UserInfoActivity.m0(r3)
                java.lang.String r0 = r2.b
                r3.setTag(r0)
                com.bxkj.student.personal.UserInfoActivity r3 = r2.e
                android.widget.ImageView r0 = com.bxkj.student.personal.UserInfoActivity.h0(r3)
                java.lang.String r1 = r2.c
                r3.f1(r0, r1)
                com.bxkj.student.personal.UserInfoActivity r3 = r2.e
                android.widget.TextView r3 = com.bxkj.student.personal.UserInfoActivity.q0(r3)
                java.lang.String r0 = r2.d
                r3.setText(r0)
                return
            L2c:
                java.lang.String r3 = r2.a
                java.lang.String r0 = "1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L57
                com.bxkj.student.personal.UserInfoActivity r3 = r2.e
                com.bxkj.student.common.view.ToggleButton r3 = com.bxkj.student.personal.UserInfoActivity.n0(r3)
                java.lang.String r0 = r2.b
                r3.setTag(r0)
                com.bxkj.student.personal.UserInfoActivity r3 = r2.e
                android.widget.ImageView r0 = com.bxkj.student.personal.UserInfoActivity.i0(r3)
                java.lang.String r1 = r2.c
                r3.f1(r0, r1)
                com.bxkj.student.personal.UserInfoActivity r3 = r2.e
                android.widget.TextView r3 = com.bxkj.student.personal.UserInfoActivity.r0(r3)
                java.lang.String r0 = r2.d
                r3.setText(r0)
            L57:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity b;

        g(com.bxkj.student.personal.UserInfoActivity r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                java.lang.String r2 = "1"
                java.lang.String r0 = r1.a
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L13
                com.bxkj.student.personal.UserInfoActivity r2 = r1.b
                com.bxkj.student.personal.UserInfoActivity.E0(r2)
                return
            L13:
                java.lang.String r2 = "0"
                java.lang.String r0 = r1.a
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L22
                com.bxkj.student.personal.UserInfoActivity r2 = r1.b
                com.bxkj.student.personal.UserInfoActivity.D0(r2)
            L22:
                return
        }

        public void netOnOtherStatus(int r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r1 = "1"
                java.lang.String r2 = r0.a
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L10
                com.bxkj.student.personal.UserInfoActivity r1 = r0.b
                com.bxkj.student.personal.UserInfoActivity.E0(r1)
                return
            L10:
                java.lang.String r1 = "0"
                java.lang.String r2 = r0.a
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L1f
                com.bxkj.student.personal.UserInfoActivity r1 = r0.b
                com.bxkj.student.personal.UserInfoActivity.D0(r1)
            L1f:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r4 = "1"
                java.lang.String r0 = r3.a
                boolean r4 = r4.equals(r0)
                java.lang.String r0 = ""
                r1 = 0
                if (r4 == 0) goto L29
                com.bxkj.student.personal.UserInfoActivity r4 = r3.b
                com.bxkj.student.common.view.ToggleButton r4 = com.bxkj.student.personal.UserInfoActivity.n0(r4)
                r4.setTag(r1)
                com.bxkj.student.personal.UserInfoActivity r4 = r3.b
                android.widget.ImageView r4 = com.bxkj.student.personal.UserInfoActivity.i0(r4)
                r4.setImageBitmap(r1)
                com.bxkj.student.personal.UserInfoActivity r4 = r3.b
                android.widget.TextView r4 = com.bxkj.student.personal.UserInfoActivity.r0(r4)
                r4.setText(r0)
                return
            L29:
                java.lang.String r4 = "0"
                java.lang.String r2 = r3.a
                boolean r4 = r4.equals(r2)
                if (r4 == 0) goto L4e
                com.bxkj.student.personal.UserInfoActivity r4 = r3.b
                com.bxkj.student.common.view.ToggleButton r4 = com.bxkj.student.personal.UserInfoActivity.m0(r4)
                r4.setTag(r1)
                com.bxkj.student.personal.UserInfoActivity r4 = r3.b
                android.widget.ImageView r4 = com.bxkj.student.personal.UserInfoActivity.h0(r4)
                r4.setImageBitmap(r1)
                com.bxkj.student.personal.UserInfoActivity r4 = r3.b
                android.widget.TextView r4 = com.bxkj.student.personal.UserInfoActivity.q0(r4)
                r4.setText(r0)
            L4e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        h(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                com.bxkj.student.personal.UserInfoActivity.A0(r0, r3)
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                java.lang.String r1 = "photoUploaded"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.personal.UserInfoActivity.t0(r0, r1)
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                java.lang.String r1 = "suspId"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.personal.UserInfoActivity.v0(r0, r1)
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                java.lang.String r1 = "sysStuDetailId"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.personal.UserInfoActivity.w0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements android.widget.CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        i(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
                r1 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "tag_qq="
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.orhanobut.logger.j.c(r2)
                if (r3 == 0) goto L1c
                com.bxkj.student.personal.UserInfoActivity r2 = r1.a
                com.bxkj.student.personal.UserInfoActivity.y0(r2)
                return
            L1c:
                com.bxkj.student.personal.UserInfoActivity r2 = r1.a
                java.lang.String r3 = "0"
                com.bxkj.student.personal.UserInfoActivity.F0(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j implements android.widget.CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        j(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L8
                com.bxkj.student.personal.UserInfoActivity r1 = r0.a
                com.bxkj.student.personal.UserInfoActivity.z0(r1)
                return
            L8:
                com.bxkj.student.personal.UserInfoActivity r1 = r0.a
                java.lang.String r2 = "1"
                com.bxkj.student.personal.UserInfoActivity.F0(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class k extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        k(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlin.n1 a(com.bxkj.student.personal.UserInfoActivity.k r0, java.io.File r1) {
                kotlin.n1 r0 = r0.b(r1)
                return r0
        }

        private /* synthetic */ kotlin.n1 b(java.io.File r3) {
                r2 = this;
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.personal.UserInfoActivity.K0(r0)
                com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
                com.bumptech.glide.h r0 = r0.J(r3)
                com.bxkj.student.personal.UserInfoActivity r1 = r2.a
                android.widget.ImageView r1 = com.bxkj.student.personal.UserInfoActivity.g0(r1)
                r0.m1(r1)
                android.net.Uri r3 = android.net.Uri.fromFile(r3)
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                com.bxkj.student.personal.UserInfoActivity.x0(r0, r3)
                r3 = 0
                return r3
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.personal.UserInfoActivity r3 = r2.a
                java.lang.String r3 = com.bxkj.student.personal.UserInfoActivity.k0(r3)
                java.lang.String r0 = "1"
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L1f
                com.bxkj.base.v2.common.utils.w r3 = com.bxkj.base.v2.common.utils.w.a
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                androidx.fragment.app.FragmentActivity r0 = com.bxkj.student.personal.UserInfoActivity.G0(r0)
                com.bxkj.student.personal.a r1 = new com.bxkj.student.personal.a
                r1.<init>(r2)
                r3.q(r0, r1)
                return
            L1f:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.personal.UserInfoActivity.H0(r0)
                r3.<init>(r0)
                java.lang.String r0 = "不允许重复上传，如有疑问请联系管理员"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class l extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        l(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                boolean r2 = android.text.TextUtils.isEmpty(r3)
                if (r2 == 0) goto L8
                java.lang.String r3 = "服务器异常，请联系管理员"
            L8:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.UserInfoActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.personal.UserInfoActivity.L0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.personal.UserInfoActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class m implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog a;
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.personal.UserInfoActivity.m a;

            a(com.bxkj.student.personal.UserInfoActivity.m r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                    r0 = this;
                    com.bxkj.student.personal.UserInfoActivity$m r1 = r0.a
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.a
                    r1.dismiss()
                    return
            }
        }

        m(com.bxkj.student.personal.UserInfoActivity r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r4 = this;
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r4.a
                r0.show()
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r4.a
                r1 = 2131296939(0x7f0902ab, float:1.8211809E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2a
                com.bxkj.student.personal.UserInfoActivity r0 = r4.b
                java.lang.String r1 = "密码不能为空"
                r0.f0(r1)
                return
            L2a:
                com.bxkj.base.util.x r1 = new com.bxkj.base.util.x     // Catch: java.lang.Exception -> L5e
                r1.<init>()     // Catch: java.lang.Exception -> L5e
                java.lang.String r0 = r1.a(r0)     // Catch: java.lang.Exception -> L5e
                com.bxkj.student.personal.UserInfoActivity r1 = r4.b     // Catch: java.lang.Exception -> L5e
                android.content.Context r1 = com.bxkj.student.personal.UserInfoActivity.M0(r1)     // Catch: java.lang.Exception -> L5e
                cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)     // Catch: java.lang.Exception -> L5e
                java.lang.Class<d0.a> r2 = d0.a.class
                java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)     // Catch: java.lang.Exception -> L5e
                d0.a r2 = (d0.a) r2     // Catch: java.lang.Exception -> L5e
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L5e
                java.lang.String r3 = r3.getUserId()     // Catch: java.lang.Exception -> L5e
                rx.e r0 = r2.v(r3, r0)     // Catch: java.lang.Exception -> L5e
                cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)     // Catch: java.lang.Exception -> L5e
                com.bxkj.student.personal.UserInfoActivity$m$a r1 = new com.bxkj.student.personal.UserInfoActivity$m$a     // Catch: java.lang.Exception -> L5e
                r1.<init>(r4)     // Catch: java.lang.Exception -> L5e
                r0.setDataListener(r1)     // Catch: java.lang.Exception -> L5e
                return
            L5e:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.UserInfoActivity r1 = r4.b
                android.content.Context r1 = com.bxkj.student.personal.UserInfoActivity.N0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "验证密码异常，请联系管理员"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                r0.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class n extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        n(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.personal.UserInfoActivity.s0(r0, r3)
                com.bxkj.student.personal.UserInfoActivity r3 = r2.a
                java.util.List r0 = com.bxkj.student.personal.UserInfoActivity.j0(r3)
                com.bxkj.student.personal.UserInfoActivity r1 = r2.a
                android.widget.TextView r1 = com.bxkj.student.personal.UserInfoActivity.p0(r1)
                com.bxkj.student.personal.UserInfoActivity.B0(r3, r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class o extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity a;

        o(com.bxkj.student.personal.UserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.personal.UserInfoActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.personal.UserInfoActivity.u0(r0, r3)
                com.bxkj.student.personal.UserInfoActivity r3 = r2.a
                java.util.List r0 = com.bxkj.student.personal.UserInfoActivity.l0(r3)
                com.bxkj.student.personal.UserInfoActivity r1 = r2.a
                android.widget.TextView r1 = com.bxkj.student.personal.UserInfoActivity.o0(r1)
                com.bxkj.student.personal.UserInfoActivity.B0(r3, r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class p implements com.bigkoo.pickerview.b.InterfaceC0008b {
        final /* synthetic */ android.widget.TextView a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ com.bxkj.student.personal.UserInfoActivity c;

        p(com.bxkj.student.personal.UserInfoActivity r1, android.widget.TextView r2, java.util.List r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.bigkoo.pickerview.b.InterfaceC0008b
        public void a(int r1, int r2, int r3, android.view.View r4) {
                r0 = this;
                android.widget.TextView r2 = r0.a
                java.util.List r3 = r0.b
                java.lang.Object r3 = r3.get(r1)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "id"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
                r2.setTag(r3)
                android.widget.TextView r2 = r0.a
                java.util.List r3 = r0.b
                java.lang.Object r1 = r3.get(r1)
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r3 = "name"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
                r2.setText(r1)
                return
        }
    }

    public UserInfoActivity() {
            r1 = this;
            r1.<init>()
            r0 = 204(0xcc, float:2.86E-43)
            r1.V0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1126a1 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1127b1 = r0
            com.bxkj.student.personal.UserInfoActivity$e r0 = new com.bxkj.student.personal.UserInfoActivity$e
            r0.<init>(r1)
            r1.f1128c1 = r0
            return
    }

    static /* bridge */ /* synthetic */ void A0(com.bxkj.student.personal.UserInfoActivity r0, java.util.Map r1) {
            r0.g1(r1)
            return
    }

    static /* bridge */ /* synthetic */ void B0(com.bxkj.student.personal.UserInfoActivity r0, java.util.List r1, android.widget.TextView r2) {
            r0.j1(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void C0(com.bxkj.student.personal.UserInfoActivity r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.k1(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ void D0(com.bxkj.student.personal.UserInfoActivity r0) {
            r0.m1()
            return
    }

    static /* bridge */ /* synthetic */ void E0(com.bxkj.student.personal.UserInfoActivity r0) {
            r0.n1()
            return
    }

    static /* bridge */ /* synthetic */ void F0(com.bxkj.student.personal.UserInfoActivity r0, java.lang.String r1) {
            r0.o1(r1)
            return
    }

    static /* synthetic */ androidx.fragment.app.FragmentActivity G0(com.bxkj.student.personal.UserInfoActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    static /* synthetic */ android.content.Context H0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context I0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context J0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context K0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context L0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context M0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context N0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context O0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context P0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context Q0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context R0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void S0() {
            r1 = this;
            r0 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.Y = r0
            r0 = 2131298770(0x7f0909d2, float:1.8215523E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.Z = r0
            r0 = 2131299091(0x7f090b13, float:1.8216174E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.a0 = r0
            r0 = 2131298877(0x7f090a3d, float:1.821574E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.c0 = r0
            r0 = 2131298971(0x7f090a9b, float:1.821593E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1129k0 = r0
            r0 = 2131298836(0x7f090a14, float:1.8215656E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.F0 = r0
            r0 = 2131298989(0x7f090aad, float:1.8215967E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.G0 = r0
            r0 = 2131298814(0x7f0909fe, float:1.8215612E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.H0 = r0
            r0 = 2131298934(0x7f090a76, float:1.8215855E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.I0 = r0
            r0 = 2131298767(0x7f0909cf, float:1.8215516E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.J0 = r0
            r0 = 2131299035(0x7f090adb, float:1.821606E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.K0 = r0
            r0 = 2131298890(0x7f090a4a, float:1.8215766E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.L0 = r0
            r0 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.M0 = r0
            r0 = 2131298922(0x7f090a6a, float:1.821583E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1130p0 = r0
            r0 = 2131299099(0x7f090b1b, float:1.821619E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.b0 = r0
            r0 = 2131298627(0x7f090943, float:1.8215233E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bxkj.student.common.view.ToggleButton r0 = (com.bxkj.student.common.view.ToggleButton) r0
            r1.N0 = r0
            r0 = 2131298621(0x7f09093d, float:1.821522E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bxkj.student.common.view.ToggleButton r0 = (com.bxkj.student.common.view.ToggleButton) r0
            r1.O0 = r0
            r0 = 2131297214(0x7f0903be, float:1.8212367E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.P0 = r0
            r0 = 2131297257(0x7f0903e9, float:1.8212454E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.Q0 = r0
            r0 = 2131299189(0x7f090b75, float:1.8216372E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.R0 = r0
            r0 = 2131299056(0x7f090af0, float:1.8216103E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.S0 = r0
            r0 = 2131298888(0x7f090a48, float:1.8215762E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.U0 = r0
            r0 = 2131297148(0x7f09037c, float:1.8212233E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.T0 = r0
            return
    }

    private void T0() {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "绑定手机号需要验证你的身份，请输入登录密码进行验证"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r0.setMessage(r1)
            r2 = 2131493147(0x7f0c011b, float:1.8609766E38)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setCenterCustomView(r2)
            com.bxkj.student.personal.UserInfoActivity$m r2 = new com.bxkj.student.personal.UserInfoActivity$m
            r2.<init>(r3, r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.setRightButtonOnClickListener(r2)
            r0.show()
            return
    }

    private void U0() {
            r10 = this;
            android.widget.EditText r0 = r10.L0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r0.trim()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L20
            boolean r0 = cn.bluemobi.dylan.base.utils.u.U(r3)
            if (r0 != 0) goto L20
            java.lang.String r0 = "请输入正确的邮箱"
            r10.f0(r0)
            return
        L20:
            android.widget.EditText r0 = r10.J0
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L38
            android.widget.EditText r0 = r10.J0
            android.text.Editable r0 = r0.getText()
        L2e:
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r7 = r0
            goto L3f
        L38:
            android.widget.EditText r0 = r10.J0
            java.lang.Object r0 = r0.getTag()
            goto L2e
        L3f:
            android.content.Context r0 = r10.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            android.widget.TextView r4 = r10.G0
            java.lang.Object r4 = r4.getTag()
            android.widget.TextView r5 = r10.H0
            java.lang.Object r5 = r5.getTag()
            android.widget.EditText r6 = r10.I0
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.trim()
            java.lang.String r8 = r10.Y0
            java.lang.String r9 = r10.Z0
            rx.e r1 = r1.f1(r2, r3, r4, r5, r6, r7, r8, r9)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.UserInfoActivity$l r1 = new com.bxkj.student.personal.UserInfoActivity$l
            r1.<init>(r10)
            r0.setDataListener(r1)
            return
    }

    private void V0(android.net.Uri r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            android.content.Context r0 = r5.V
            java.io.File r0 = r0.getExternalCacheDir()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L20
            r0.mkdirs()
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L28
            boolean r1 = r0.exists()
            if (r1 != 0) goto L37
        L28:
            android.content.Context r0 = r5.V
            java.io.File r0 = r0.getCacheDir()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L37
            r0.mkdirs()
        L37:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "avatar"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L47
            r1.mkdirs()
        L47:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r3 = "_"
            r2.append(r3)
            java.lang.String r3 = "temp_photo.jpg"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            com.yalantis.ucrop.b$a r1 = new com.yalantis.ucrop.b$a
            r1.<init>()
            android.content.Context r2 = r5.V
            r3 = 2131099737(0x7f060059, float:1.7811836E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            r1.D(r2)
            android.content.Context r2 = r5.V
            r3 = 2131099735(0x7f060057, float:1.7811832E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            r1.A(r2)
            android.content.Context r2 = r5.V
            r3 = 2131099736(0x7f060058, float:1.7811834E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            r1.y(r2)
            android.content.Context r2 = r5.V
            r3 = 2131099731(0x7f060053, float:1.7811823E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            r1.c(r2)
            com.yalantis.ucrop.b r6 = com.yalantis.ucrop.b.i(r6, r0)
            com.yalantis.ucrop.b r6 = r6.s(r1)
            r0 = 1091567616(0x41100000, float:9.0)
            r1 = 1098907648(0x41800000, float:16.0)
            com.yalantis.ucrop.b r6 = r6.q(r0, r1)
            r0 = 295(0x127, float:4.13E-43)
            r1 = 413(0x19d, float:5.79E-43)
            com.yalantis.ucrop.b r6 = r6.r(r0, r1)
            r0 = 69
            r6.k(r5, r0)
            return
    }

    private android.graphics.Bitmap W0(android.net.Uri r2) {
            r1 = this;
            android.content.ContentResolver r0 = r1.getContentResolver()     // Catch: java.io.FileNotFoundException -> Ld
            java.io.InputStream r2 = r0.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> Ld
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.io.FileNotFoundException -> Ld
            return r2
        Ld:
            r2 = 0
            return r2
    }

    private void X0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.x1()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.UserInfoActivity$n r1 = new com.bxkj.student.personal.UserInfoActivity$n
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void Y0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.l0()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.UserInfoActivity$o r1 = new com.bxkj.student.personal.UserInfoActivity$o
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void a1() {
            r3 = this;
            android.content.Context r0 = r3.V
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            boolean r0 = r0.isInstall(r3, r1)
            if (r0 != 0) goto L21
            java.lang.String r0 = "您还未安装QQ或QQ版本过低"
            r3.f0(r0)
            java.lang.Thread r0 = new java.lang.Thread
            com.bxkj.student.personal.UserInfoActivity$a r1 = new com.bxkj.student.personal.UserInfoActivity$a
            r1.<init>(r3)
            r0.<init>(r1)
            r0.start()
            return
        L21:
            android.content.Context r0 = r3.V
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            com.umeng.socialize.UMAuthListener r2 = r3.f1128c1
            r0.getPlatformInfo(r3, r1, r2)
            return
    }

    private void b1() {
            r3 = this;
            android.content.Context r0 = r3.V
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            boolean r0 = r0.isInstall(r3, r1)
            if (r0 != 0) goto L21
            java.lang.String r0 = "您还未安装微信或微信版本过低"
            r3.f0(r0)
            java.lang.Thread r0 = new java.lang.Thread
            com.bxkj.student.personal.UserInfoActivity$b r1 = new com.bxkj.student.personal.UserInfoActivity$b
            r1.<init>(r3)
            r0.<init>(r1)
            r0.start()
            return
        L21:
            android.content.Context r0 = r3.V
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            com.umeng.socialize.UMAuthListener r2 = r3.f1128c1
            r0.getPlatformInfo(r3, r1, r2)
            return
    }

    private void e1() {
            r2 = this;
            com.bxkj.student.common.view.ToggleButton r0 = r2.O0
            com.bxkj.student.personal.UserInfoActivity$i r1 = new com.bxkj.student.personal.UserInfoActivity$i
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView g0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.widget.ImageView r0 = r0.T0
            return r0
    }

    private void g1(java.util.Map<java.lang.String, java.lang.Object> r6) {
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "userNum"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setAccount(r2)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "name"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setRealName(r2)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            r1.setPhone(r0)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "sex"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setSex(r3)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = "schoolName"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
            r1.setSchoolName(r3)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = "collectPhoto"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
            r1.setHeadImageUrl(r3)
            android.widget.ImageView r1 = r5.T0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getHeadImageUrl()
            r5.f1(r1, r3)
            android.widget.TextView r1 = r5.Y
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getRealName()
            r1.setText(r3)
            android.widget.TextView r1 = r5.Z
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getAccount()
            r1.setText(r3)
            android.widget.TextView r1 = r5.b0
            java.lang.String r3 = "1"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L86
            java.lang.String r2 = "男"
            goto L88
        L86:
            java.lang.String r2 = "女"
        L88:
            r1.setText(r2)
            android.widget.TextView r1 = r5.a0
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolName()
            r1.setText(r2)
            android.widget.TextView r1 = r5.K0
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getPhone()
            r1.setText(r2)
            android.widget.TextView r1 = r5.c0
            java.lang.String r2 = "faculty"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setText(r2)
            android.widget.TextView r1 = r5.f1129k0
            java.lang.String r2 = "profession"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setText(r2)
            android.widget.TextView r1 = r5.f1130p0
            java.lang.String r2 = "grade"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setText(r2)
            android.widget.TextView r1 = r5.F0
            java.lang.String r2 = "class"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setText(r2)
            android.widget.TextView r1 = r5.G0
            java.lang.String r2 = "nationId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setTag(r2)
            android.widget.TextView r1 = r5.G0
            java.lang.String r2 = "nationName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setText(r2)
            android.widget.TextView r1 = r5.H0
            java.lang.String r2 = "sourceId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setTag(r2)
            android.widget.TextView r1 = r5.H0
            java.lang.String r2 = "sourceName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setText(r2)
            android.widget.EditText r1 = r5.I0
            java.lang.String r2 = "address"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setText(r2)
            java.lang.String r1 = "certificate"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            android.widget.EditText r2 = r5.J0
            r2.setText(r1)
            android.widget.EditText r1 = r5.L0
            java.lang.String r2 = "email"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setText(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L142
            android.widget.TextView r1 = r5.K0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "(\\d{3})\\d{4}(\\d{4})"
            java.lang.String r4 = "$1****$2"
            java.lang.String r0 = r0.replaceAll(r3, r4)
            r2.append(r0)
            java.lang.String r0 = "(更换)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
        L142:
            java.lang.String r0 = "weixinId"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L172
            com.bxkj.student.common.view.ToggleButton r1 = r5.N0
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
            r1.setTag(r0)
            com.bxkj.student.common.view.ToggleButton r0 = r5.N0
            r0.toggle()
            android.widget.ImageView r0 = r5.Q0
            java.lang.String r1 = "weixinImg"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            r5.f1(r0, r1)
            android.widget.TextView r0 = r5.R0
            java.lang.String r1 = "weixinNickName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            r0.setText(r1)
        L172:
            java.lang.String r0 = "qqId"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a2
            com.bxkj.student.common.view.ToggleButton r1 = r5.O0
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
            r1.setTag(r0)
            com.bxkj.student.common.view.ToggleButton r0 = r5.O0
            r0.toggle()
            android.widget.ImageView r0 = r5.P0
            java.lang.String r1 = "qqImg"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            r5.f1(r0, r1)
            android.widget.TextView r0 = r5.S0
            java.lang.String r1 = "qqNickName"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            r0.setText(r6)
        L1a2:
            r5.h1()
            r5.e1()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView h0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.widget.ImageView r0 = r0.P0
            return r0
    }

    private void h1() {
            r2 = this;
            com.bxkj.student.common.view.ToggleButton r0 = r2.N0
            com.bxkj.student.personal.UserInfoActivity$j r1 = new com.bxkj.student.personal.UserInfoActivity$j
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView i0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.widget.ImageView r0 = r0.Q0
            return r0
    }

    private void i1(java.lang.String[] r4, int r5) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r0.putExtra(r4, r5)
            r3.startActivity(r0)
            r4 = 2130772094(0x7f01007e, float:1.7147297E38)
            r5 = 2130772095(0x7f01007f, float:1.7147299E38)
            r3.overridePendingTransition(r4, r5)
            return
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.personal.UserInfoActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1126a1
            return r0
    }

    private void j1(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4, android.widget.TextView r5) {
            r3 = this;
            com.bigkoo.pickerview.b$a r0 = new com.bigkoo.pickerview.b$a
            android.content.Context r1 = r3.V
            com.bxkj.student.personal.UserInfoActivity$p r2 = new com.bxkj.student.personal.UserInfoActivity$p
            r2.<init>(r3, r5, r4)
            r0.<init>(r1, r2)
            com.bigkoo.pickerview.b r5 = r0.H()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.next()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "name"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.add(r1)
            goto L19
        L2f:
            r5.A(r0)
            r5.t()
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String k0(com.bxkj.student.personal.UserInfoActivity r0) {
            java.lang.String r0 = r0.X0
            return r0
    }

    private void k1(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            android.content.Context r0 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            d0.a r2 = (d0.a) r2
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r1.getUserId()
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            rx.e r9 = r2.g1(r3, r4, r5, r6, r7)
            r3 = r4
            r4 = r5
            r5 = r7
            cn.bluemobi.dylan.http.HttpRequest r9 = r0.setObservable(r9)
            com.bxkj.student.personal.UserInfoActivity$f r1 = new com.bxkj.student.personal.UserInfoActivity$f
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r9.setDataListener(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.student.personal.UserInfoActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1127b1
            return r0
    }

    public static byte[] l1(java.lang.String r9) {
            r1 = 0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.lang.String r2 = "r"
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r7 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r5 = 0
            java.nio.MappedByteBuffer r9 = r3.map(r4, r5, r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.nio.MappedByteBuffer r9 = r9.load()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            boolean r0 = r9.isLoaded()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            com.orhanobut.logger.j.c(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r0 = (int) r4     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            if (r2 <= 0) goto L41
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r4 = 0
            r9.get(r0, r4, r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            goto L41
        L3d:
            r0 = move-exception
            r9 = r0
            r1 = r3
            goto L4a
        L41:
            r3.close()     // Catch: java.io.IOException -> L44
        L44:
            return r0
        L45:
            r0 = move-exception
            r9 = r0
            goto L4a
        L48:
            r3 = r1
            goto L4e
        L4a:
            r1.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r9
        L4e:
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            return r1
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.ToggleButton m0(com.bxkj.student.personal.UserInfoActivity r0) {
            com.bxkj.student.common.view.ToggleButton r0 = r0.O0
            return r0
    }

    private void m1() {
            r2 = this;
            com.bxkj.student.common.view.ToggleButton r0 = r2.O0
            if (r0 == 0) goto L10
            r1 = 0
            r0.setOnCheckedChangeListener(r1)
            com.bxkj.student.common.view.ToggleButton r0 = r2.O0
            r0.toggle()
            r2.e1()
        L10:
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.ToggleButton n0(com.bxkj.student.personal.UserInfoActivity r0) {
            com.bxkj.student.common.view.ToggleButton r0 = r0.N0
            return r0
    }

    private void n1() {
            r2 = this;
            com.bxkj.student.common.view.ToggleButton r0 = r2.N0
            if (r0 == 0) goto L10
            r1 = 0
            r0.setOnCheckedChangeListener(r1)
            com.bxkj.student.common.view.ToggleButton r0 = r2.N0
            r0.toggle()
            r2.h1()
        L10:
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.widget.TextView r0 = r0.H0
            return r0
    }

    private void o1(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L1f
            com.bxkj.student.common.view.ToggleButton r0 = r3.N0
            java.lang.Object r0 = r0.getTag()
            if (r0 == 0) goto L3d
            com.bxkj.student.common.view.ToggleButton r0 = r3.N0
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = cn.bluemobi.dylan.base.utils.u.b0(r0)
            if (r0 == 0) goto L3e
            goto L3d
        L1f:
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L3e
            com.bxkj.student.common.view.ToggleButton r0 = r3.O0
            java.lang.Object r0 = r0.getTag()
            if (r0 == 0) goto L3d
            com.bxkj.student.common.view.ToggleButton r0 = r3.O0
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = cn.bluemobi.dylan.base.utils.u.b0(r0)
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.a1(r4, r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.UserInfoActivity$g r1 = new com.bxkj.student.personal.UserInfoActivity$g
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView p0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.widget.TextView r0 = r0.G0
            return r0
    }

    private void p1(android.net.Uri r4) {
            r3 = this;
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r4 = com.bxkj.base.util.j.c(r0, r4)
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            r3.W0 = r0
            android.content.Context r4 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r4 = cn.bluemobi.dylan.http.Http.with(r4)
            cn.bluemobi.dylan.http.HttpRequest r4 = r4.hideOtherStatusMessage()
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            java.io.File r2 = r3.W0
            java.lang.String r2 = r2.getPath()
            java.lang.String r2 = com.bxkj.base.util.j.b(r2)
            rx.e r0 = r0.O(r1, r2)
            cn.bluemobi.dylan.http.HttpRequest r4 = r4.setObservable(r0)
            com.bxkj.student.personal.UserInfoActivity$d r0 = new com.bxkj.student.personal.UserInfoActivity$d
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView q0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.widget.TextView r0 = r0.S0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView r0(com.bxkj.student.personal.UserInfoActivity r0) {
            android.widget.TextView r0 = r0.R0
            return r0
    }

    static /* bridge */ /* synthetic */ void s0(com.bxkj.student.personal.UserInfoActivity r0, java.util.List r1) {
            r0.f1126a1 = r1
            return
    }

    static /* bridge */ /* synthetic */ void t0(com.bxkj.student.personal.UserInfoActivity r0, java.lang.String r1) {
            r0.X0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void u0(com.bxkj.student.personal.UserInfoActivity r0, java.util.List r1) {
            r0.f1127b1 = r1
            return
    }

    static /* bridge */ /* synthetic */ void v0(com.bxkj.student.personal.UserInfoActivity r0, java.lang.String r1) {
            r0.Y0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void w0(com.bxkj.student.personal.UserInfoActivity r0, java.lang.String r1) {
            r0.Z0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void x0(com.bxkj.student.personal.UserInfoActivity r0, android.net.Uri r1) {
            r0.V0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void y0(com.bxkj.student.personal.UserInfoActivity r0) {
            r0.a1()
            return
    }

    static /* bridge */ /* synthetic */ void z0(com.bxkj.student.personal.UserInfoActivity r0) {
            r0.b1()
            return
    }

    public void L() {
            r1 = this;
            android.widget.TextView r0 = r1.G0
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.H0
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.K0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.M0
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.U0
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r1.T0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493042(0x7f0c00b2, float:1.8609553E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.j1()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.UserInfoActivity$h r1 = new com.bxkj.student.personal.UserInfoActivity$h
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "个人资料"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r0.S0()
            return
    }

    public void Z0(android.content.Context r3, android.content.Intent r4, android.net.Uri r5, boolean r6) {
            r2 = this;
            if (r6 == 0) goto L4
            r6 = 3
            goto L5
        L4:
            r6 = 1
        L5:
            r4.addFlags(r6)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            r1 = 65536(0x10000, float:9.1835E-41)
            java.util.List r4 = r0.queryIntentActivities(r4, r1)
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r0 = r0.packageName
            r3.grantUriPermission(r0, r5, r6)
            goto L16
        L2a:
            return
    }

    public void c1(java.io.File r2) {
            r1 = this;
            android.content.Context r0 = r1.V
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            com.bumptech.glide.h r2 = r0.J(r2)
            android.widget.ImageView r0 = r1.T0
            r2.m1(r0)
            return
    }

    public java.io.File d1(android.content.Context r7, android.graphics.Bitmap r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L7e
            boolean r1 = r8.isRecycled()
            if (r1 == 0) goto Lb
            goto L7e
        Lb:
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1c
            java.io.File r1 = r7.getExternalCacheDir()
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L25
            boolean r2 = r1.exists()
            if (r2 != 0) goto L29
        L25:
            java.io.File r1 = r7.getCacheDir()
        L29:
            java.io.File r7 = new java.io.File
            java.lang.String r2 = "avatar"
            r7.<init>(r1, r2)
            boolean r1 = r7.exists()
            if (r1 != 0) goto L3a
            boolean r1 = r7.mkdirs()
        L3a:
            if (r1 == 0) goto L7e
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r2 = ".png"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r7, r2)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6e java.io.FileNotFoundException -> L70
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L6e java.io.FileNotFoundException -> L70
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L69 java.io.FileNotFoundException -> L6c
            r3 = 100
            r8.compress(r2, r3, r7)     // Catch: java.lang.Throwable -> L69 java.io.FileNotFoundException -> L6c
            r7.close()     // Catch: java.io.IOException -> L68
        L68:
            return r1
        L69:
            r8 = move-exception
            r0 = r7
            goto L73
        L6c:
            goto L79
        L6e:
            r8 = move-exception
            goto L73
        L70:
            r7 = r0
            goto L79
        L73:
            if (r0 == 0) goto L78
            r0.close()     // Catch: java.io.IOException -> L78
        L78:
            throw r8
        L79:
            if (r7 == 0) goto L7e
            r7.close()     // Catch: java.io.IOException -> L7e
        L7e:
            return r0
    }

    public void f1(android.widget.ImageView r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.V
            r1 = 2131689689(0x7f0f00d9, float:1.90084E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r4, r3, r1, r1)
            return
    }

    protected void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r3, r4, r5)
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r2)
            r0.onActivityResult(r3, r4, r5)
            r0 = 204(0xcc, float:2.86E-43)
            r1 = -1
            if (r3 != r0) goto L6e
            if (r4 != r1) goto L6e
            java.io.File r3 = r2.W0
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            android.graphics.Bitmap r3 = r2.W0(r3)
            android.widget.ImageView r4 = r2.T0
            r4.setImageBitmap(r3)
            android.content.Context r4 = r2.V
            java.io.File r3 = r2.d1(r4, r3)
            r2.W0 = r3
            android.content.Context r3 = r2.V
            com.bumptech.glide.i r3 = com.bumptech.glide.b.D(r3)
            java.io.File r4 = r2.W0
            com.bumptech.glide.h r3 = r3.J(r4)
            android.widget.ImageView r4 = r2.T0
            r3.m1(r4)
            android.content.Context r3 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r3 = cn.bluemobi.dylan.http.Http.with(r3)
            cn.bluemobi.dylan.http.HttpRequest r3 = r3.hideOtherStatusMessage()
            java.lang.Class<d0.a> r4 = d0.a.class
            java.lang.Object r4 = cn.bluemobi.dylan.http.Http.getApiService(r4)
            d0.a r4 = (d0.a) r4
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r5.getUserId()
            java.io.File r0 = r2.W0
            java.lang.String r0 = r0.getPath()
            java.lang.String r0 = com.bxkj.base.util.j.b(r0)
            rx.e r4 = r4.O(r5, r0)
            cn.bluemobi.dylan.http.HttpRequest r3 = r3.setObservable(r4)
            com.bxkj.student.personal.UserInfoActivity$c r4 = new com.bxkj.student.personal.UserInfoActivity$c
            r4.<init>(r2)
            r3.setDataListener(r4)
            return
        L6e:
            r0 = 221(0xdd, float:3.1E-43)
            if (r3 != r0) goto L7f
            if (r4 != r1) goto L7f
            android.net.Uri r3 = r5.getData()
            if (r3 != 0) goto L7b
            goto La8
        L7b:
            r2.p1(r3)
            return
        L7f:
            if (r4 != r1) goto L8d
            r0 = 69
            if (r3 != r0) goto L8d
            android.net.Uri r3 = com.yalantis.ucrop.b.e(r5)
            r2.p1(r3)
            return
        L8d:
            r3 = 96
            if (r4 != r3) goto La8
            java.lang.Throwable r3 = com.yalantis.ucrop.b.a(r5)
            r3.getClass()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r4 = r2.V
            r3.<init>(r4)
            java.lang.String r4 = "头像裁剪失败，请重新再试"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r4)
            r3.show()
        La8:
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            switch(r3) {
                case 2131296599: goto L71;
                case 2131297148: goto L59;
                case 2131298814: goto L45;
                case 2131298888: goto L20;
                case 2131298989: goto Lc;
                case 2131299035: goto L8;
                default: goto L7;
            }
        L7:
            goto L67
        L8:
            r2.T0()
            return
        Lc:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r2.f1126a1
            int r3 = r3.size()
            if (r3 != 0) goto L18
            r2.X0()
            return
        L18:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r2.f1126a1
            android.widget.TextView r0 = r2.G0
            r2.j1(r3, r0)
            return
        L20:
            android.content.Context r3 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r3 = cn.bluemobi.dylan.http.Http.with(r3)
            cn.bluemobi.dylan.http.HttpRequest r3 = r3.hideSuccessMessage()
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            d0.a r0 = (d0.a) r0
            java.lang.String r1 = "3"
            rx.e r0 = r0.c1(r1)
            cn.bluemobi.dylan.http.HttpRequest r3 = r3.setObservable(r0)
            com.bxkj.student.personal.UserInfoActivity$k r0 = new com.bxkj.student.personal.UserInfoActivity$k
            r0.<init>(r2)
            r3.setDataListener(r0)
            return
        L45:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r2.f1127b1
            int r3 = r3.size()
            if (r3 != 0) goto L51
            r2.Y0()
            return
        L51:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r2.f1127b1
            android.widget.TextView r0 = r2.H0
            r2.j1(r3, r0)
            return
        L59:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getHeadImageUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L68
        L67:
            return
        L68:
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r0 = 1
            r2.i1(r3, r0)
            return
        L71:
            r2.U0()
            return
    }

    protected void onResume() {
            r5 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getPhone()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2f
            android.widget.TextView r1 = r5.K0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "(\\d{3})\\d{4}(\\d{4})"
            java.lang.String r4 = "$1****$2"
            java.lang.String r0 = r0.replaceAll(r3, r4)
            r2.append(r0)
            java.lang.String r0 = "(更换)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
        L2f:
            return
    }
}
