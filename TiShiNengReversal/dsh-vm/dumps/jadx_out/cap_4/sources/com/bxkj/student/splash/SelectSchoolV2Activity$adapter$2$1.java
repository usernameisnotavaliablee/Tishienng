package com.bxkj.student.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SelectSchoolV2Activity$adapter$2$1 extends com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForSchoolListV2Binding> {
    final /* synthetic */ com.bxkj.student.splash.SelectSchoolV2Activity f;

    SelectSchoolV2Activity$adapter$2$1(com.bxkj.student.splash.SelectSchoolV2Activity r1, java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r0 = this;
            r0.f = r1
            r0.<init>(r2)
            return
    }

    public static /* synthetic */ kotlin.n1 m(com.bxkj.student.splash.SelectSchoolV2Activity r0, java.util.Map r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            kotlin.n1 r0 = q(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ void n(com.bxkj.student.splash.SelectSchoolV2Activity r0, java.util.Map r1, android.view.View r2) {
            p(r0, r1, r2)
            return
    }

    private static final void p(com.bxkj.student.splash.SelectSchoolV2Activity r9, java.util.Map r10, android.view.View r11) {
            androidx.fragment.app.FragmentActivity r0 = r9.q()
            com.bxkj.base.v2.common.utils.x r11 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "school_name"
            java.lang.String r11 = r11.t(r10, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "确定您要选择"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = "吗?"
            r1.append(r11)
            java.lang.String r2 = r1.toString()
            com.bxkj.student.splash.i r3 = new com.bxkj.student.splash.i
            r3.<init>(r9, r10)
            r7 = 57
            r8 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private static final kotlin.n1 q(com.bxkj.student.splash.SelectSchoolV2Activity r5, java.util.Map r6, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r7) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r7, r0)
            com.bxkj.student.splash.SelectSchoolV2Activity.h(r5)
            com.bxkj.base.v2.common.utils.x r7 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r0 = "school_name"
            java.lang.String r0 = r7.t(r6, r0)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "school_id"
            java.lang.String r2 = r7.t(r6, r2)
            r1.setSchoolId(r2)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "sysType"
            int r2 = r7.k(r6, r2)
            r1.setSysType(r2)
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r3 = "isOpenLive"
            int r3 = r7.k(r6, r3)
            r2.G0(r3)
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r3 = "isOpenSQZS"
            r4 = 1
            int r3 = r7.l(r6, r3, r4)
            r2.I0(r3)
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r3 = "isOpenGGLBT"
            int r3 = r7.l(r6, r3, r4)
            r2.F0(r3)
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r3 = "openPhoneLogin"
            r4 = 0
            int r3 = r7.l(r6, r3, r4)
            r2.H0(r3)
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r3 = "insideNetwork"
            int r3 = r7.k(r6, r3)
            r2.p0(r3)
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r3 = "insideNetworkMsg"
            java.lang.String r3 = r7.t(r6, r3)
            r2.q0(r3)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r2 = r2.getSysType()
            r3 = 2
            if (r2 != r3) goto Lb4
            com.bxkj.base.v2.data.b r2 = r1.a()
            r2.O0(r0)
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r3 = "schoolCode"
            java.lang.String r3 = r7.t(r6, r3)
            r2.M0(r3)
            com.bxkj.student.v2.retrofit.b$a r2 = com.bxkj.student.v2.retrofit.b.a
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "lan_url"
            java.lang.String r6 = r7.u(r6, r3, r2)
            com.bxkj.base.v2.data.b r7 = r1.a()
            r7.P0(r6)
            com.bxkj.student.v2.retrofit.e r6 = com.bxkj.student.v2.retrofit.e.a
            r6.b()
            goto Lfa
        Lb4:
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            r1.setSchoolName(r0)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "isOpenKeep"
            int r2 = r7.k(r6, r2)
            r1.setIsOpenKeep(r2)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "isOpenEncry"
            java.lang.String r2 = r7.t(r6, r2)
            r1.setIsOpenEncry(r2)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "openId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            r1.setAppId(r2)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = "school_url"
            java.lang.String r6 = r7.t(r6, r2)
            r1.setServerUrl(r6)
            com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r6.getServerUrl()
            cn.bluemobi.dylan.http.Http.changeBaseUrl(r6)
        Lfa:
            android.content.Context r6 = r5.G()
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r1 = r5.G()
            java.lang.Class<com.bxkj.student.splash.SplashActivity> r2 = com.bxkj.student.splash.SplashActivity.class
            r7.<init>(r1, r2)
            r6.startActivity(r7)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r6.add(r0)
            r5.finish()
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    @Override // com.bxkj.base.v2.base.BaseAdapter
    public /* bridge */ /* synthetic */ void f(com.bxkj.student.databinding.ItemForSchoolListV2Binding r1, java.util.Map<java.lang.String, java.lang.Object> r2, int r3) {
            r0 = this;
            com.bxkj.student.databinding.ItemForSchoolListV2Binding r1 = (com.bxkj.student.databinding.ItemForSchoolListV2Binding) r1
            java.util.Map r2 = (java.util.Map) r2
            r0.o(r1, r2, r3)
            return
    }

    public void o(com.bxkj.student.databinding.ItemForSchoolListV2Binding r4, java.util.Map<java.lang.String, java.lang.Object> r5, int r6) {
            r3 = this;
            java.lang.String r6 = "itemBinding"
            kotlin.jvm.internal.g0.p(r4, r6)
            java.lang.String r6 = "bean"
            kotlin.jvm.internal.g0.p(r5, r6)
            android.widget.TextView r6 = r4.tvName
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "school_name"
            java.lang.String r2 = r1.t(r5, r2)
            r0.append(r2)
            java.lang.String r2 = " ("
            r0.append(r2)
            java.lang.String r2 = "provinceName"
            java.lang.String r1 = r1.t(r5, r2)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
            android.widget.TextView r4 = r4.tvName
            com.bxkj.student.splash.SelectSchoolV2Activity r6 = r3.f
            com.bxkj.student.splash.h r0 = new com.bxkj.student.splash.h
            r0.<init>(r6, r5)
            r4.setOnClickListener(r0)
            return
    }
}
