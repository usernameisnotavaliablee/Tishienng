package com.bxkj.student;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SecretActivity extends cn.bluemobi.dylan.base.BaseActivity {
    java.util.List<java.lang.String> Y;

    public SecretActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Y = r0
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493025(0x7f0c00a1, float:1.8609518E38)
            return r0
    }

    public void R() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.Y
            java.lang.String r1 = "e56b888b-b2fc-32c8-83da-7eb52687835a"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r5.Y
            java.lang.String r1 = "0801e54a-a7ca-336a-b609-ca6ac126952b"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r5.Y
            java.lang.String r1 = "28523735-bfaf-3bc2-aa09-7e98b083b790"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r5.Y
            java.lang.String r1 = "6c3141fb-0c80-3d6f-805d-63381dd5c59e"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r5.Y
            java.lang.String r1 = "b1f4540e-210e-38c9-be3e-3bdb68eaa485"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r5.Y
            java.lang.String r1 = "2a4965bb-5f90-38aa-887c-18b2b7d47a04"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r5.Y
            java.lang.String r1 = "c9f0a9cd-f563-35fa-a3b8-b440228f1f44"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r5.Y
            java.lang.String r1 = "6b53cbf2-d6c8-3ee9-8909-d90f2eefb9e9"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r5.Y
            com.bxkj.base.v2.common.utils.f r1 = com.bxkj.base.v2.common.utils.f.a
            android.content.Context r2 = r5.V
            java.lang.String r1 = r1.d(r2)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L51
            java.lang.String r0 = "你想干什么？"
            r5.f0(r0)
            r5.finish()
            return
        L51:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "school_name"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto Lc8
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r2 = "school_url"
            boolean r0 = r0.hasExtra(r2)
            if (r0 == 0) goto Lc8
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r3 = "school_id"
            boolean r0 = r0.hasExtra(r3)
            if (r0 == 0) goto Lc8
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r2 = r2.getStringExtra(r3)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            r3.setSchoolName(r0)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setServerUrl(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setSchoolId(r2)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "openId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto Lbd
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            r1.setAppId(r0)
        Lbd:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            cn.bluemobi.dylan.http.Http.changeBaseUrl(r0)
        Lc8:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "userId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L130
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r2 = "name"
            boolean r0 = r0.hasExtra(r2)
            if (r0 == 0) goto L130
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r3 = "userNum"
            boolean r0 = r0.hasExtra(r3)
            if (r0 == 0) goto L130
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r2 = r2.getStringExtra(r3)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            r4 = 1
            r3.setLogin(r4)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            r3.setUserId(r0)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setRealName(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setAccount(r2)
            android.content.Context r0 = r5.V
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r5.V
            java.lang.Class<com.bxkj.student.MainActivity> r3 = com.bxkj.student.MainActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            goto L13e
        L130:
            android.content.Context r0 = r5.V
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r5.V
            java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r3 = com.bxkj.student.personal.login.LoginActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
        L13e:
            r5.finish()
            return
    }

    public void S() {
            r0 = this;
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
