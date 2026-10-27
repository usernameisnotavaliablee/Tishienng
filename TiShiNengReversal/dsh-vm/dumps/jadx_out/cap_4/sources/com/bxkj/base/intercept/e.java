package com.bxkj.base.intercept;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e implements cn.bluemobi.dylan.http.ResponseInterceptor {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.bjtsn.dylan.lifecycleobserver.b {
        final /* synthetic */ android.app.Dialog a;
        final /* synthetic */ com.bxkj.base.intercept.e b;

        a(com.bxkj.base.intercept.e r1, android.app.Dialog r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.bjtsn.dylan.lifecycleobserver.b
        public void onDestroy() {
                r1 = this;
                android.app.Dialog r0 = r1.a
                if (r0 == 0) goto Lf
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Lf
                android.app.Dialog r0 = r1.a
                r0.dismiss()
            Lf:
                super.onDestroy()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.bxkj.base.intercept.e b;

        b(com.bxkj.base.intercept.e r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()
                r0 = 0
                r6.setLogin(r0)
                com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = ""
                r6.setToken(r0)
                com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()
                r6.setUserId(r0)
                cn.bluemobi.dylan.base.utils.a r6 = cn.bluemobi.dylan.base.utils.a.n()
                r6.j()
                com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()
                int r6 = r6.getUserType()
                r0 = 1
                r1 = 67108864(0x4000000, float:1.5046328E-36)
                if (r6 != r0) goto L63
                android.content.Context r6 = r5.a
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                android.content.ComponentName r2 = new android.content.ComponentName
                java.lang.String r3 = "com.bxkj.student.MainActivity"
                java.lang.String r4 = "com.bxkj.student"
                r2.<init>(r4, r3)
                android.content.Intent r0 = r0.setComponent(r2)
                android.content.Intent r0 = r0.setFlags(r1)
                r6.startActivity(r0)
                android.content.Context r6 = r5.a
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                android.content.ComponentName r1 = new android.content.ComponentName
                java.lang.String r2 = "com.bxkj.student.personal.login.LoginActivity"
                r1.<init>(r4, r2)
                android.content.Intent r0 = r0.setComponent(r1)
                r1 = 268435456(0x10000000, float:2.524355E-29)
                android.content.Intent r0 = r0.setFlags(r1)
                r6.startActivity(r0)
                return
            L63:
                android.content.Context r6 = r5.a
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                android.content.ComponentName r2 = new android.content.ComponentName
                java.lang.String r3 = "com.bxkj.teacher"
                java.lang.String r4 = "com.bxkj.teacher.login.LoginActivity"
                r2.<init>(r3, r4)
                android.content.Intent r0 = r0.setComponent(r2)
                android.content.Intent r0 = r0.setFlags(r1)
                r6.startActivity(r0)
                return
        }
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(com.bxkj.base.intercept.e r0, java.lang.StringBuilder r1, android.content.Context r2) {
            r0.i(r1, r2)
            return
    }

    public static /* synthetic */ void b(com.bxkj.base.intercept.e r0, java.lang.StringBuilder r1, android.content.Context r2) {
            r0.h(r1, r2)
            return
    }

    public static /* synthetic */ void c(android.content.Context r0, android.view.View r1) {
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            r1.i(r0)
            return
    }

    private void d(android.content.Context r2, android.app.Dialog r3) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L13
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            com.bjtsn.dylan.lifecycleobserver.LifecycleObserver r0 = new com.bjtsn.dylan.lifecycleobserver.LifecycleObserver
            r0.<init>(r2)
            com.bxkj.base.intercept.e$a r2 = new com.bxkj.base.intercept.e$a
            r2.<init>(r1, r3)
            r0.c(r2)
        L13:
            return
    }

    private void e(java.lang.String r3) {
            r2 = this;
            com.bxkj.base.BaseApp r0 = com.bxkj.base.BaseApp.c()
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            java.lang.String r1 = "错误信息"
            android.content.ClipData r3 = android.content.ClipData.newPlainText(r1, r3)
            r0.setPrimaryClip(r3)
            return
    }

    private java.lang.String f(java.util.Map<java.lang.String, java.lang.Object> r7) {
            r6 = this;
            if (r7 != 0) goto L5
            java.lang.String r7 = ""
            return r7
        L5:
            java.util.Set r7 = r7.entrySet()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L12:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r3 = "="
            int r4 = r0.indexOf(r3)
            r5 = -1
            if (r4 == r5) goto L36
            java.lang.String r4 = "\n"
            r0.append(r4)
        L36:
            r0.append(r2)
            r0.append(r3)
            r0.append(r1)
            goto L12
        L40:
            java.lang.String r7 = r0.toString()
            return r7
    }

    private java.lang.String g(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.formatJson(r2)     // Catch: java.lang.Exception -> Ld
        Ld:
            return r2
    }

    private /* synthetic */ void h(java.lang.StringBuilder r2, android.content.Context r3) {
            r1 = this;
            java.lang.String r2 = r2.toString()
            r1.e(r2)
            java.lang.String r2 = "已复制到剪切板"
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r3, r2, r0)
            r2.show()
            return
    }

    private /* synthetic */ void i(java.lang.StringBuilder r2, android.content.Context r3) {
            r1 = this;
            java.lang.String r2 = r2.toString()
            r1.e(r2)
            java.lang.String r2 = "已复制到剪切板"
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r3, r2, r0)
            r2.show()
            return
    }

    public void onError(android.content.Context r5, java.lang.Throwable r6) {
            r4 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isOpenModel()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r6 = r6.getMessage()
            com.orhanobut.logger.j.c(r6)
            java.io.StringWriter r6 = new java.io.StringWriter
            r6.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r6)
            java.lang.String r6 = r6.toString()
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            r0.<init>(r5)
            r1 = 3
            r0.setMessageGrivity(r1)
            java.lang.String r1 = "复制到剪切板"
            r0.setLeftButtonText(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "接口请求报错:\n"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.append(r6)
            com.bxkj.base.intercept.d r6 = new com.bxkj.base.intercept.d
            r6.<init>(r4, r1, r5)
            r0.setLeftButtonOnClickListener(r6)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r6 = r0.setMessage(r1)
            r6.show()
            r4.d(r5, r0)
            return
    }

    public boolean onResponse(android.content.Context r2, int r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5, java.lang.String r6) {
            r1 = this;
            r5 = 201(0xc9, float:2.82E-43)
            if (r3 != r5) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/ispwdmod"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/appstu/uploadGatherPhoto"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/runingFace/appRuningFace"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/callStuIdentify/userAddCallStuIdentify"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/face/checkUserByFace"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/appLearnResource/learnResourceDetailOperation"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/sportRecordSetting/checkTimeOut"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/appSportRecord/appAddSportRecord"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            r5.append(r0)
            java.lang.String r0 = "app/getSysUserByThirdId"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L129
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r3.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r3.setMessage(r4)
            r2.show()
            r2 = 1
            return r2
        L129:
            r5 = 601(0x259, float:8.42E-43)
            r6 = 0
            if (r3 != r5) goto L13e
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r3.<init>(r2)
            r3.setCancelable(r6)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r3.setMessage(r4)
            r2.show()
            return r6
        L13e:
            r5 = 602(0x25a, float:8.44E-43)
            if (r3 != r5) goto L15a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r3.<init>(r2)
            r3.setCancelable(r6)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r3.setMessage(r4)
            r4.show()
            com.bxkj.base.intercept.e$b r4 = new com.bxkj.base.intercept.e$b
            r4.<init>(r1, r2)
            r3.setButtonOnClickListener(r4)
            return r6
        L15a:
            r5 = 603(0x25b, float:8.45E-43)
            if (r3 != r5) goto L173
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r3.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r4)
            com.bxkj.base.intercept.c r4 = new com.bxkj.base.intercept.c
            r4.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r3.setButtonOnClickListener(r4)
            r2.show()
        L173:
            return r6
    }

    public boolean onResponseStart(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8, java.lang.String r9, int r10) {
            r5 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isOpenModel()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            r0.<init>(r6)
            java.lang.String r2 = "接口信息"
            r0.setTitle(r2)
            r2 = 3
            r0.setMessageGrivity(r2)
            java.lang.String r2 = "复制到剪切板"
            r0.setLeftButtonText(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "请求地址:\n"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = "\n请求参数:\n"
            r7.append(r3)
            java.lang.String r8 = r5.f(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "\n响应状态:"
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "\n响应数据:\n"
            r7.append(r8)
            java.lang.String r8 = r5.g(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            com.bxkj.base.intercept.b r7 = new com.bxkj.base.intercept.b
            r7.<init>(r5, r2, r6)
            r0.setLeftButtonOnClickListener(r7)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r7 = r0.setMessage(r2)
            r7.show()
            r5.d(r6, r0)
            return r1
    }
}
