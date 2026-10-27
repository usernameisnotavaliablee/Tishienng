package com.bxkj.student.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SelectSchoolActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog F0;
    private int G0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private androidx.recyclerview.widget.RecyclerView c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1301k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1302p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.splash.SelectSchoolActivity k;

        a(com.bxkj.student.splash.SelectSchoolActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                java.lang.String r0 = "province_name"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r2.J(r0, r3)
                int r3 = r2.f()
                com.bxkj.student.splash.SelectSchoolActivity r0 = r1.k
                int r0 = com.bxkj.student.splash.SelectSchoolActivity.h0(r0)
                if (r3 != r0) goto L26
                com.bxkj.student.splash.SelectSchoolActivity r3 = r1.k
                android.content.res.Resources r3 = r3.getResources()
                r0 = 2131231950(0x7f0804ce, float:1.8079995E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r0)
                goto L27
            L26:
                r3 = 0
            L27:
                r0 = 2131297091(0x7f090343, float:1.8212117E38)
                r2.q(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.splash.SelectSchoolActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;
            final /* synthetic */ com.bxkj.student.splash.SelectSchoolActivity.b b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.splash.SelectSchoolActivity$b$a$a, reason: collision with other inner class name */
            class C0140a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
                final /* synthetic */ com.bxkj.student.splash.SelectSchoolActivity.b.a a;

                C0140a(com.bxkj.student.splash.SelectSchoolActivity.b.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void buttonRightOnClick() {
                        r6 = this;
                        java.lang.String r0 = "school_name"
                        com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r3 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r3 = r3.a     // Catch: java.lang.Exception -> L1b1
                        int r3 = r3.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r3)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)     // Catch: java.lang.Exception -> L1b1
                        r1.setSchoolName(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r3 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r3 = r3.a     // Catch: java.lang.Exception -> L1b1
                        int r3 = r3.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r3)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r3 = "school_url"
                        java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)     // Catch: java.lang.Exception -> L1b1
                        r1.setServerUrl(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r3 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r3 = r3.a     // Catch: java.lang.Exception -> L1b1
                        int r3 = r3.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r3)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r3 = "school_id"
                        java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)     // Catch: java.lang.Exception -> L1b1
                        r1.setSchoolId(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r3 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r3 = r3.a     // Catch: java.lang.Exception -> L1b1
                        int r3 = r3.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r3)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r3 = "isOpenEncry"
                        java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)     // Catch: java.lang.Exception -> L1b1
                        r1.setIsOpenEncry(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r3 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r3 = r3.a     // Catch: java.lang.Exception -> L1b1
                        int r3 = r3.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r3)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r3 = "sysType"
                        int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)     // Catch: java.lang.Exception -> L1b1
                        r1.setSysType(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r3 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r3 = r3.a     // Catch: java.lang.Exception -> L1b1
                        int r3 = r3.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r3)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r3 = "isOpenKeep"
                        int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)     // Catch: java.lang.Exception -> L1b1
                        r1.setIsOpenKeep(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.v2.data.b r2 = r1.a()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r4 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r4 = r4.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r4 = r4.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.splash.SelectSchoolActivity.g0(r4)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r5 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r5 = r5.a     // Catch: java.lang.Exception -> L1b1
                        int r5 = r5.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r4 = r4.getItem(r5)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r0 = r3.t(r4, r0)     // Catch: java.lang.Exception -> L1b1
                        r2.O0(r0)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.v2.data.b r0 = r1.a()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r4 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r4 = r4.a     // Catch: java.lang.Exception -> L1b1
                        int r4 = r4.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r4)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r4 = "schoolCode"
                        java.lang.String r2 = r3.t(r2, r4)     // Catch: java.lang.Exception -> L1b1
                        r0.M0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.v2.data.b r0 = r1.a()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r4 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r4 = r4.a     // Catch: java.lang.Exception -> L1b1
                        int r4 = r4.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r4)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r4 = "isOpenLive"
                        int r2 = r3.k(r2, r4)     // Catch: java.lang.Exception -> L1b1
                        r0.G0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.v2.data.b r0 = r1.a()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r2 = r2.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.splash.SelectSchoolActivity.g0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r4 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r4 = r4.a     // Catch: java.lang.Exception -> L1b1
                        int r4 = r4.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r2 = r2.getItem(r4)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r4 = "isOpenSQZS"
                        r5 = 1
                        int r2 = r3.l(r2, r4, r5)     // Catch: java.lang.Exception -> L1b1
                        r0.I0(r2)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r0 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r0 = r0.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r0 = r0.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.splash.SelectSchoolActivity.g0(r0)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r2 = r2.a     // Catch: java.lang.Exception -> L1b1
                        int r2 = r2.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r0 = r0.getItem(r2)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r2 = "lan_url"
                        com.bxkj.student.v2.retrofit.b$a r4 = com.bxkj.student.v2.retrofit.b.a     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r4 = r4.a()     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r0 = r3.u(r0, r2, r4)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        int r2 = r2.getSysType()     // Catch: java.lang.Exception -> L1b1
                        r3 = 2
                        if (r2 != r3) goto L1b3
                        com.bxkj.base.v2.data.b r1 = r1.a()     // Catch: java.lang.Exception -> L1b1
                        r1.P0(r0)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.v2.retrofit.e r0 = com.bxkj.student.v2.retrofit.e.a     // Catch: java.lang.Exception -> L1b1
                        r0.b()     // Catch: java.lang.Exception -> L1b1
                        goto L1e3
                    L1b1:
                        r0 = move-exception
                        goto L217
                    L1b3:
                        com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r0 = r0.getServerUrl()     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.http.Http.changeBaseUrl(r0)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r1 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r1 = r1.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r1 = r1.k     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.splash.SelectSchoolActivity.g0(r1)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r2 = r2.a     // Catch: java.lang.Exception -> L1b1
                        int r2 = r2.f()     // Catch: java.lang.Exception -> L1b1
                        java.lang.Object r1 = r1.getItem(r2)     // Catch: java.lang.Exception -> L1b1
                        java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r2 = "openId"
                        java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)     // Catch: java.lang.Exception -> L1b1
                        r0.setAppId(r1)     // Catch: java.lang.Exception -> L1b1
                    L1e3:
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r0 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r0 = r0.b     // Catch: java.lang.Exception -> L1b1
                        android.content.Context r0 = com.bxkj.student.splash.SelectSchoolActivity.b.n(r0)     // Catch: java.lang.Exception -> L1b1
                        android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r2 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r2 = r2.b     // Catch: java.lang.Exception -> L1b1
                        android.content.Context r2 = com.bxkj.student.splash.SelectSchoolActivity.b.m(r2)     // Catch: java.lang.Exception -> L1b1
                        java.lang.Class<com.bxkj.student.splash.SplashActivity> r3 = com.bxkj.student.splash.SplashActivity.class
                        r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L1b1
                        r0.startActivity(r1)     // Catch: java.lang.Exception -> L1b1
                        java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Exception -> L1b1
                        r0.<init>()     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L1b1
                        java.lang.String r1 = r1.getSchoolName()     // Catch: java.lang.Exception -> L1b1
                        r0.add(r1)     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b$a r0 = r6.a     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity$b r0 = r0.b     // Catch: java.lang.Exception -> L1b1
                        com.bxkj.student.splash.SelectSchoolActivity r0 = r0.k     // Catch: java.lang.Exception -> L1b1
                        r0.finish()     // Catch: java.lang.Exception -> L1b1
                        return
                    L217:
                        java.lang.String r0 = r0.getMessage()
                        com.orhanobut.logger.j.c(r0)
                        return
                }
            }

            a(com.bxkj.student.splash.SelectSchoolActivity.b r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                    com.bxkj.student.splash.SelectSchoolActivity$b r0 = r3.b
                    android.content.Context r0 = com.bxkj.student.splash.SelectSchoolActivity.b.o(r0)
                    r4.<init>(r0)
                    java.lang.String r0 = "提示"
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setTitle(r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "确定您要选择"
                    r0.append(r1)
                    com.bxkj.student.splash.SelectSchoolActivity$b r1 = r3.b
                    com.bxkj.student.splash.SelectSchoolActivity r1 = r1.k
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.splash.SelectSchoolActivity.g0(r1)
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r2 = r3.a
                    int r2 = r2.f()
                    java.lang.Object r1 = r1.getItem(r2)
                    java.util.Map r1 = (java.util.Map) r1
                    java.lang.String r2 = "school_name"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r0.append(r1)
                    java.lang.String r1 = "吗?"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setMessage(r0)
                    com.bxkj.student.splash.SelectSchoolActivity$b$a$a r0 = new com.bxkj.student.splash.SelectSchoolActivity$b$a$a
                    r0.<init>(r3)
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setRightButtonOnClickListener(r0)
                    r4.show()
                    return
            }
        }

        b(com.bxkj.student.splash.SelectSchoolActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.splash.SelectSchoolActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.splash.SelectSchoolActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context o(com.bxkj.student.splash.SelectSchoolActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.p(r1, r2)
                return
        }

        public void p(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                java.lang.String r0 = "school_name"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r2.J(r0, r3)
                com.bxkj.student.splash.SelectSchoolActivity$b$a r3 = new com.bxkj.student.splash.SelectSchoolActivity$b$a
                r3.<init>(r1, r2)
                r2.w(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.splash.SelectSchoolActivity a;

        c(com.bxkj.student.splash.SelectSchoolActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.splash.SelectSchoolActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.splash.SelectSchoolActivity.m0(r0, r3)
                com.bxkj.student.splash.SelectSchoolActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.splash.SelectSchoolActivity.k0(r3)
                com.bxkj.student.splash.SelectSchoolActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.splash.SelectSchoolActivity.i0(r0)
                r3.g(r0)
                com.bxkj.student.splash.SelectSchoolActivity r3 = r2.a
                com.bxkj.student.splash.SelectSchoolActivity.o0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.splash.SelectSchoolActivity a;

        d(com.bxkj.student.splash.SelectSchoolActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.splash.SelectSchoolActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.splash.SelectSchoolActivity.n0(r0, r3)
                com.bxkj.student.splash.SelectSchoolActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.splash.SelectSchoolActivity.g0(r3)
                com.bxkj.student.splash.SelectSchoolActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.splash.SelectSchoolActivity.j0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.splash.SelectSchoolActivity a;

        e(com.bxkj.student.splash.SelectSchoolActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.student.splash.SelectSchoolActivity r1 = r0.a
                com.bxkj.student.splash.SelectSchoolActivity.l0(r1, r4)
                com.bxkj.student.splash.SelectSchoolActivity r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.splash.SelectSchoolActivity.k0(r1)
                r1.notifyDataSetChanged()
                com.bxkj.student.splash.SelectSchoolActivity r1 = r0.a
                com.bxkj.student.splash.SelectSchoolActivity.o0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.splash.SelectSchoolActivity a;

        f(com.bxkj.student.splash.SelectSchoolActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                com.bxkj.student.splash.SelectSchoolActivity r0 = r3.a
                r1 = 2131951695(0x7f13004f, float:1.9539812E38)
                java.lang.String r0 = r0.getString(r1)
                r4.setSchoolName(r0)
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = "https://m.boxkj.com/"
                r4.setServerUrl(r0)
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = "-1"
                r4.setSchoolId(r0)
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r4 = r4.getServerUrl()
                cn.bluemobi.dylan.http.Http.changeBaseUrl(r4)
                com.bxkj.student.splash.SelectSchoolActivity r4 = r3.a
                android.content.Context r4 = com.bxkj.student.splash.SelectSchoolActivity.q0(r4)
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.splash.SelectSchoolActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.splash.SelectSchoolActivity.p0(r1)
                java.lang.Class<com.bxkj.student.MainActivity> r2 = com.bxkj.student.MainActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                java.util.HashSet r4 = new java.util.HashSet
                r4.<init>()
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r0.getSchoolName()
                r4.add(r0)
                com.bxkj.student.splash.SelectSchoolActivity r4 = r3.a
                r4.finish()
                return
        }
    }

    public SelectSchoolActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.G0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.splash.SelectSchoolActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1301k0
            return r0
    }

    static /* bridge */ /* synthetic */ int h0(com.bxkj.student.splash.SelectSchoolActivity r0) {
            int r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.splash.SelectSchoolActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.splash.SelectSchoolActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter k0(com.bxkj.student.splash.SelectSchoolActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.splash.SelectSchoolActivity r0, int r1) {
            r0.G0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.splash.SelectSchoolActivity r0, java.util.List r1) {
            r0.Y = r1
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.splash.SelectSchoolActivity r0, java.util.List r1) {
            r0.b0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.splash.SelectSchoolActivity r0) {
            r0.t0()
            return
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.splash.SelectSchoolActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.splash.SelectSchoolActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void r0() {
            r1 = this;
            r0 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.c0 = r0
            r0 = 2131298429(0x7f09087d, float:1.821483E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.Z = r0
            r0 = 2131299006(0x7f090abe, float:1.8216001E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1302p0 = r0
            return
    }

    private void s0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            rx.e r1 = r1.f()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.splash.SelectSchoolActivity$c r1 = new com.bxkj.student.splash.SelectSchoolActivity$c
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void t0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.a0
            int r3 = r4.G0
            java.lang.Object r2 = r2.getItem(r3)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "province_id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            rx.e r1 = r1.n(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.splash.SelectSchoolActivity$d r1 = new com.bxkj.student.splash.SelectSchoolActivity$d
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.a0
            com.bxkj.student.splash.SelectSchoolActivity$e r1 = new com.bxkj.student.splash.SelectSchoolActivity$e
            r1.<init>(r2)
            r0.k(r1)
            android.widget.TextView r0 = r2.f1302p0
            com.bxkj.student.splash.SelectSchoolActivity$f r1 = new com.bxkj.student.splash.SelectSchoolActivity$f
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493021(0x7f0c009d, float:1.860951E38)
            return r0
    }

    public void R() {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r6.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r6, r1)
            r0.<init>(r2)
            r2 = 0
            r0.setOrder(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r6.Z
            r3.setLayoutAnimation(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.Z
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r3 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r4 = r6.V
            r5 = 1
            r3.<init>(r4, r5)
            r0.addItemDecoration(r3)
            com.bxkj.student.splash.SelectSchoolActivity$a r0 = new com.bxkj.student.splash.SelectSchoolActivity$a
            android.content.Context r3 = r6.V
            r4 = 2131493300(0x7f0c01b4, float:1.8610076E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r6.Y
            r0.<init>(r6, r3, r4, r5)
            r6.a0 = r0
            androidx.recyclerview.widget.RecyclerView r3 = r6.Z
            r3.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.c0
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r4 = r6.V
            r3.<init>(r4)
            r0.setLayoutManager(r3)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r6, r1)
            r0.<init>(r1)
            r0.setOrder(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r6.c0
            r1.setLayoutAnimation(r0)
            com.bxkj.student.splash.SelectSchoolActivity$b r0 = new com.bxkj.student.splash.SelectSchoolActivity$b
            android.content.Context r1 = r6.V
            r2 = 2131493316(0x7f0c01c4, float:1.8610109E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.b0
            r0.<init>(r6, r1, r2, r3)
            r6.f1301k0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r6.c0
            r1.setAdapter(r0)
            r6.s0()
            return
    }

    public void S() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "isShowBack"
            boolean r0 = r0.hasExtra(r1)
            r2.Y(r0)
            java.lang.String r0 = "选择学校"
            r2.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r0.r0()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.F0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lf
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.F0
            r0.dismiss()
        Lf:
            super.onDestroy()
            return
    }
}
