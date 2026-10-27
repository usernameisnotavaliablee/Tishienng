package com.bxkj.student.personal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SystemSetActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.LinearLayout F0;
    private android.widget.LinearLayout Y;
    private android.widget.LinearLayout Z;
    private android.widget.LinearLayout a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.LinearLayout f1124k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.LinearLayout f1125p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bxkj.student.common.versionupdate.a.d {
        final /* synthetic */ com.bxkj.student.common.versionupdate.a a;
        final /* synthetic */ com.bxkj.student.personal.SystemSetActivity b;

        a(com.bxkj.student.personal.SystemSetActivity r1, com.bxkj.student.common.versionupdate.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.versionupdate.a.d
        public void a(boolean r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                if (r1 == 0) goto L8
                com.bxkj.student.common.versionupdate.a r1 = r0.a
                r1.d(r2, r3, r4)
                return
            L8:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.SystemSetActivity r2 = r0.b
                android.content.Context r2 = com.bxkj.student.personal.SystemSetActivity.g0(r2)
                r1.<init>(r2)
                java.lang.String r2 = "当前已是最新版本"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
                r1.show()
                return
        }

        @Override // com.bxkj.student.common.versionupdate.a.d
        public void b() {
                r0 = this;
                return
        }
    }

    public SystemSetActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context g0(com.bxkj.student.personal.SystemSetActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static long h0(java.io.File r7) {
            r0 = 0
            if (r7 != 0) goto L5
            return r0
        L5:
            boolean r2 = r7.isDirectory()
            if (r2 != 0) goto Lc
            return r0
        Lc:
            java.io.File[] r7 = r7.listFiles()
            int r2 = r7.length
            r3 = 0
        L12:
            if (r3 >= r2) goto L35
            r4 = r7[r3]
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L22
            long r4 = r4.length()
        L20:
            long r0 = r0 + r4
            goto L32
        L22:
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L32
            long r5 = r4.length()
            long r0 = r0 + r5
            long r4 = h0(r4)
            goto L20
        L32:
            int r3 = r3 + 1
            goto L12
        L35:
            return r0
    }

    public void L() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.a0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.f1125p0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.F0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.f1124k0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.Y
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.Z
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493036(0x7f0c00ac, float:1.860954E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.widget.TextView r0 = r3.c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "v"
            r1.append(r2)
            java.lang.String r2 = r3.i0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.content.Context r0 = r3.V     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = com.bxkj.student.common.utils.d.k(r0)     // Catch: java.lang.Exception -> L25
            android.widget.TextView r1 = r3.b0     // Catch: java.lang.Exception -> L25
            r1.setText(r0)     // Catch: java.lang.Exception -> L25
        L25:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "系统设置"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298033(0x7f0906f1, float:1.8214028E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Y = r1
            r1 = 2131298038(0x7f0906f6, float:1.8214038E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Z = r1
            r1 = 2131298024(0x7f0906e8, float:1.821401E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.a0 = r1
            r1 = 2131298823(0x7f090a07, float:1.821563E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131299182(0x7f090b6e, float:1.8216358E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131298044(0x7f0906fc, float:1.821405E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f1124k0 = r1
            r1 = 2131298084(0x7f090724, float:1.8214131E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f1125p0 = r1
            r1 = 2131298008(0x7f0906d8, float:1.8213977E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.F0 = r1
            return
    }

    public java.lang.String i0() {
            r3 = this;
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Exception -> L10
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Exception -> L10
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L10
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Exception -> L10
            return r0
        L10:
            java.lang.String r0 = "1.0"
            return r0
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            switch(r3) {
                case 2131298008: goto L55;
                case 2131298024: goto L3f;
                case 2131298033: goto L32;
                case 2131298038: goto L25;
                case 2131298044: goto L18;
                case 2131298084: goto L8;
                default: goto L7;
            }
        L7:
            return
        L8:
            com.bxkj.student.common.versionupdate.a r3 = new com.bxkj.student.common.versionupdate.a
            android.content.Context r0 = r2.V
            r3.<init>(r0)
            com.bxkj.student.personal.SystemSetActivity$a r0 = new com.bxkj.student.personal.SystemSetActivity$a
            r0.<init>(r2, r3)
            r3.b(r0)
            return
        L18:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.personal.HelpCenterListActivity> r1 = com.bxkj.student.personal.HelpCenterListActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
        L25:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.personal.password.forget.FindPasswordTypeActivity> r1 = com.bxkj.student.personal.password.forget.FindPasswordTypeActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
        L32:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.personal.password.UpdatePasswordActivity> r1 = com.bxkj.student.personal.password.UpdatePasswordActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
        L3f:
            android.content.Context r3 = r2.V
            com.bxkj.student.common.utils.d.g(r3)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r2.V
            r3.<init>(r0)
            java.lang.String r0 = "缓存清除成功"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
            r3.show()
            return
        L55:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.personal.AboutUsActivity> r1 = com.bxkj.student.personal.AboutUsActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }
}
