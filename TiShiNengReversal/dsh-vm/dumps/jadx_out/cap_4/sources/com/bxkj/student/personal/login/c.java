package com.bxkj.student.personal.login;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a() {
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.getOpenId()
            return
    }

    public static void b(android.app.Activity r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = ""
            r0.setTempUserId(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setTempUserNumber(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setTempUserName(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setTempUserPhone(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            long r1 = java.lang.System.currentTimeMillis()
            r0.setLastLoginTime(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = "id"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r0.setUserId(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = "name"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            java.lang.String r1 = r1.trim()
            r0.setRealName(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = "userNum"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r0.setAccount(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = "phone"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r0.setPhone(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = "sex"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r0.setSex(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = "token"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r0.setToken(r4)
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0 = 1
            r4.setLogin(r0)
            com.bxkj.student.common.jpush.a r4 = com.bxkj.student.common.jpush.a.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.d(r1, r0)
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getUserId()
            com.umeng.analytics.MobclickAgent.onProfileSignIn(r4)
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.bxkj.student.MainActivity> r0 = com.bxkj.student.MainActivity.class
            r4.<init>(r3, r0)
            r3.startActivity(r4)
            cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
            android.app.Activity r4 = r4.getActivity(r0)
            com.bxkj.student.MainActivity r4 = (com.bxkj.student.MainActivity) r4
            if (r4 == 0) goto Le7
            r4.u0()
            r4.y0()
            cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.main.MyFragment> r0 = com.bxkj.student.main.MyFragment.class
            androidx.fragment.app.Fragment r4 = r4.o(r0)
            com.bxkj.student.main.MyFragment r4 = (com.bxkj.student.main.MyFragment) r4
            if (r4 == 0) goto Le7
            r4.Z()
            r4.a0()
        Le7:
            a()
            r3.finish()
            return
    }

    public static void c() {
            com.bxkj.student.common.jpush.a r0 = com.bxkj.student.common.jpush.a.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.d(r1, r2)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setLogin(r2)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setAuthorizationInMall(r2)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setAuthorizationInLost(r2)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setAuthorizationInSecondHand(r2)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setAuthorizationInJob(r2)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = ""
            r0.setHeadImageUrl(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setUserId(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setToken(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setTempUserId(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setTempUserNumber(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setTempUserName(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setTempUserPhone(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setHeadImageUrl(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setKeepToken(r1)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            r0.l()
            return
    }
}
