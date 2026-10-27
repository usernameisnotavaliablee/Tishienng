package com.bxkj.student.run.app.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunPermissionSetActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Button Y;
    private android.widget.TextView Z;
    private android.widget.LinearLayout a0;
    private android.widget.Button b0;
    private android.widget.CheckBox c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.os.CountDownTimer {
        final /* synthetic */ com.bxkj.student.run.app.set.RunPermissionSetActivity a;

        a(com.bxkj.student.run.app.set.RunPermissionSetActivity r1, long r2, long r4) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r2 = this;
                com.bxkj.student.run.app.set.RunPermissionSetActivity r0 = r2.a
                android.widget.Button r0 = com.bxkj.student.run.app.set.RunPermissionSetActivity.j0(r0)
                r1 = 1
                r0.setEnabled(r1)
                com.bxkj.student.run.app.set.RunPermissionSetActivity r0 = r2.a
                android.widget.Button r0 = com.bxkj.student.run.app.set.RunPermissionSetActivity.j0(r0)
                java.lang.String r1 = "开始跑步"
                r0.setText(r1)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r5) {
                r4 = this;
                com.bxkj.student.run.app.set.RunPermissionSetActivity r0 = r4.a
                android.widget.Button r0 = com.bxkj.student.run.app.set.RunPermissionSetActivity.j0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "开始跑步("
                r1.append(r2)
                r2 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 / r2
                r1.append(r5)
                java.lang.String r5 = "秒)"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.setText(r5)
                return
        }
    }

    public RunPermissionSetActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.set.RunPermissionSetActivity r0, android.view.View r1) {
            r0.m0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.run.app.set.RunPermissionSetActivity r0, android.view.View r1) {
            r0.n0(r1)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.run.app.set.RunPermissionSetActivity r0, android.view.View r1) {
            r0.o0(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button j0(com.bxkj.student.run.app.set.RunPermissionSetActivity r0) {
            android.widget.Button r0 = r0.b0
            return r0
    }

    private void k0(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = 2131296988(0x7f0902dc, float:1.8211908E38)
            r0.add(r1, r3)
            r0.commit()
            return
    }

    private void l0() {
            r3 = this;
            android.widget.Button r0 = r3.Y
            com.bxkj.student.v2.common.utils.p$a r1 = com.bxkj.student.v2.common.utils.p.a
            boolean r2 = r1.b()
            r2 = r2 ^ 1
            r0.setEnabled(r2)
            android.widget.Button r0 = r3.Y
            boolean r1 = r1.b()
            if (r1 == 0) goto L18
            java.lang.String r1 = "权限已开启"
            goto L1a
        L18:
            java.lang.String r1 = "一键自动开启"
        L1a:
            r0.setText(r1)
            return
    }

    private /* synthetic */ void m0(android.view.View r2) {
            r1 = this;
            com.bxkj.student.v2.common.utils.p$a r2 = com.bxkj.student.v2.common.utils.p.a
            androidx.fragment.app.FragmentActivity r0 = r1.W
            r2.e(r0)
            return
    }

    private /* synthetic */ void n0(android.view.View r3) {
            r2 = this;
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            android.widget.CheckBox r0 = r2.c0
            boolean r0 = r0.isChecked()
            r3.setCheckIgnoreRunSet(r0)
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.run.app.StartRunActivity> r1 = com.bxkj.student.run.app.StartRunActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            r2.finish()
            return
    }

    private /* synthetic */ void o0(android.view.View r4) {
            r3 = this;
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r4.setAction(r0)
            android.content.Context r0 = r3.V
            java.lang.String r0 = r0.getPackageName()
            r1 = 0
            java.lang.String r2 = "package"
            android.net.Uri r0 = android.net.Uri.fromParts(r2, r0, r1)
            r4.setData(r0)
            return
    }

    private void p0() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            r1 = 2131952187(0x7f13023b, float:1.954081E38)
            java.lang.String r1 = r2.getString(r1)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.run.app.set.c r1 = new com.bxkj.student.run.app.set.c
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setButtonOnClickListener(r1)
            r0.show()
            return
    }

    public void L() {
            r3 = this;
            android.widget.Button r0 = r3.Y
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            int r1 = r1.b0()
            r2 = 1
            if (r1 != r2) goto L11
            r1 = 0
            goto L13
        L11:
            r1 = 8
        L13:
            r0.setVisibility(r1)
            android.widget.Button r0 = r3.Y
            com.bxkj.student.run.app.set.e r1 = new com.bxkj.student.run.app.set.e
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493012(0x7f0c0094, float:1.8609492E38)
            return r0
    }

    public void R() {
            r9 = this;
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "isShowBottom"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L34
            android.content.Intent r0 = r9.getIntent()
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 == 0) goto L34
            android.widget.LinearLayout r0 = r9.a0
            r0.setVisibility(r2)
            com.bxkj.student.run.app.set.RunPermissionSetActivity$a r3 = new com.bxkj.student.run.app.set.RunPermissionSetActivity$a
            r5 = 4000(0xfa0, double:1.9763E-320)
            r7 = 1000(0x3e8, double:4.94E-321)
            r4 = r9
            r3.<init>(r4, r5, r7)
            r3.start()
            android.widget.Button r0 = r4.b0
            com.bxkj.student.run.app.set.d r1 = new com.bxkj.student.run.app.set.d
            r1.<init>(r9)
            r0.setOnClickListener(r1)
            goto L35
        L34:
            r4 = r9
        L35:
            java.lang.String r0 = com.bxkj.base.util.b0.d()
            android.widget.TextView r1 = r4.Z
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "您的手机品牌："
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            java.lang.String r1 = "Xiaomi"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L60
            com.bxkj.student.run.app.set.brandset.XiaomiSetFragment r0 = new com.bxkj.student.run.app.set.brandset.XiaomiSetFragment
            r0.<init>()
            r9.k0(r0)
            goto Lac
        L60:
            java.lang.String r1 = "HUAWEI"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L71
            com.bxkj.student.run.app.set.brandset.HUAWEISetFragment r0 = new com.bxkj.student.run.app.set.brandset.HUAWEISetFragment
            r0.<init>()
            r9.k0(r0)
            goto Lac
        L71:
            java.lang.String r1 = "OPPO"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L82
            com.bxkj.student.run.app.set.brandset.OPPOSetFragment r0 = new com.bxkj.student.run.app.set.brandset.OPPOSetFragment
            r0.<init>()
            r9.k0(r0)
            goto Lac
        L82:
            java.lang.String r1 = "Vivo"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L93
            com.bxkj.student.run.app.set.brandset.VivoSetFragment r0 = new com.bxkj.student.run.app.set.brandset.VivoSetFragment
            r0.<init>()
            r9.k0(r0)
            goto Lac
        L93:
            java.lang.String r1 = "Meizu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La4
            com.bxkj.student.run.app.set.brandset.MeizuFragment r0 = new com.bxkj.student.run.app.set.brandset.MeizuFragment
            r0.<init>()
            r9.k0(r0)
            goto Lac
        La4:
            com.bxkj.student.run.app.set.brandset.OtherSetFramgment r0 = new com.bxkj.student.run.app.set.brandset.OtherSetFramgment
            r0.<init>()
            r9.k0(r0)
        Lac:
            r9.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "运动权限设置"
            r1.setTitle(r0)
            r0 = 2131099737(0x7f060059, float:1.7811836E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r1, r0)
            r1.d0(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296610(0x7f090162, float:1.8211142E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Y = r1
            r1 = 2131298816(0x7f090a00, float:1.8215616E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131298015(0x7f0906df, float:1.8213991E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.a0 = r1
            r1 = 2131296646(0x7f090186, float:1.8211215E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.b0 = r1
            r1 = 2131296720(0x7f0901d0, float:1.8211365E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.c0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onResume() {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            r0.l0()
            return
    }
}
