package com.bxkj.student.run.app.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunSettingActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.LinearLayout Y;
    private android.widget.LinearLayout Z;

    public RunSettingActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.set.RunSettingActivity r0, android.view.View r1) {
            r0.j0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.run.app.set.RunSettingActivity r0, android.view.View r1) {
            r0.i0(r1)
            return
    }

    private /* synthetic */ void i0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.run.app.set.RunPermissionSetActivity> r1 = com.bxkj.student.run.app.set.RunPermissionSetActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void j0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.run.app.set.RunFrequencySetActivity> r1 = com.bxkj.student.run.app.set.RunFrequencySetActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    public void L() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.Y
            com.bxkj.student.run.app.set.f r1 = new com.bxkj.student.run.app.set.f
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r2.Z
            com.bxkj.student.run.app.set.g r1 = new com.bxkj.student.run.app.set.g
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493015(0x7f0c0097, float:1.8609498E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "跑步设置"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298059(0x7f09070b, float:1.821408E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Y = r1
            r1 = 2131298039(0x7f0906f7, float:1.821404E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
