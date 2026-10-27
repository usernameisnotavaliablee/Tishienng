package com.bxkj.student.personal.sign;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SignInActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private android.widget.Button Z;
    private cn.bluemobi.dylan.base.view.CycleViewPager a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.personal.sign.SignInActivity a;

        a(com.bxkj.student.personal.sign.SignInActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r4 = this;
                com.bxkj.student.personal.sign.SignInActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.personal.sign.SignInActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.personal.sign.SignInActivity.i0(r2)
                java.lang.Class<com.bxkj.student.personal.sign.SignRecordListActivity> r3 = com.bxkj.student.personal.sign.SignRecordListActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.sign.SignInActivity a;

        b(com.bxkj.student.personal.sign.SignInActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.personal.sign.SignInActivity r0 = r3.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.personal.sign.SignInActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.personal.sign.SignInActivity.h0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "我的积分："
                r1.append(r2)
                java.lang.String r2 = "sumIntegral"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                java.lang.String r0 = "isSign"
                boolean r4 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r4, r0)
                com.bxkj.student.personal.sign.SignInActivity r0 = r3.a
                android.widget.Button r0 = com.bxkj.student.personal.sign.SignInActivity.g0(r0)
                r1 = r4 ^ 1
                r0.setEnabled(r1)
                if (r4 == 0) goto L49
                com.bxkj.student.personal.sign.SignInActivity r4 = r3.a
                android.widget.Button r4 = com.bxkj.student.personal.sign.SignInActivity.g0(r4)
                java.lang.String r0 = "今日已签到"
                r4.setText(r0)
                return
            L49:
                com.bxkj.student.personal.sign.SignInActivity r4 = r3.a
                android.widget.Button r4 = com.bxkj.student.personal.sign.SignInActivity.g0(r4)
                java.lang.String r0 = "立即签到"
                r4.setText(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.sign.SignInActivity a;

        c(com.bxkj.student.personal.sign.SignInActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.personal.sign.SignInActivity r2 = r1.a
                r2.R()
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.sign.SignInActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.personal.sign.SignInActivity.j0(r0)
                r2.<init>(r0)
                r0 = 2131493161(0x7f0c0129, float:1.8609794E38)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setCenterCustomView(r0)
                r2.show()
                return
        }
    }

    public SignInActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button g0(com.bxkj.student.personal.sign.SignInActivity r0) {
            android.widget.Button r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView h0(com.bxkj.student.personal.sign.SignInActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.personal.sign.SignInActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.personal.sign.SignInActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void k0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getAccount()
            rx.e r1 = r1.i(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.sign.SignInActivity$c r1 = new com.bxkj.student.personal.sign.SignInActivity$c
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493030(0x7f0c00a6, float:1.8609529E38)
            return r0
    }

    public void R() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getAccount()
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getRealName()
            rx.e r1 = r1.u(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.sign.SignInActivity$b r1 = new com.bxkj.student.personal.sign.SignInActivity$b
            r1.<init>(r5)
            r0.setDataListener(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cn.bluemobi.dylan.base.view.CycleViewPager r1 = r5.a0
            r2 = 0
            r1.setData(r0, r2)
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "签到领积分"
            r2.setTitle(r0)
            r0 = 2131099737(0x7f060059, float:1.7811836E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r2.d0(r0)
            com.bxkj.student.personal.sign.SignInActivity$a r0 = new com.bxkj.student.personal.sign.SignInActivity$a
            r0.<init>(r2)
            java.lang.String r1 = "记录"
            r2.b0(r1, r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            r2 = 2131296644(0x7f090184, float:1.821121E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.Z = r2
            r2 = 2131296829(0x7f09023d, float:1.8211586E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.CycleViewPager r2 = (cn.bluemobi.dylan.base.view.CycleViewPager) r2
            r1.a0 = r2
            android.widget.FrameLayout r2 = r1.P()
            r0 = 4
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296644(0x7f090184, float:1.821121E38)
            if (r2 == r0) goto La
            return
        La:
            r1.k0()
            return
    }
}
