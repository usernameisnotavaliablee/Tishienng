package com.bxkj.student.run.app.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunFrequencySetActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.RadioGroup Y;
    private android.widget.Button Z;

    public RunFrequencySetActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.set.RunFrequencySetActivity r0, android.widget.RadioGroup r1, int r2) {
            r0.i0(r1, r2)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.run.app.set.RunFrequencySetActivity r0, android.view.View r1) {
            r0.j0(r1)
            return
    }

    private /* synthetic */ void i0(android.widget.RadioGroup r2, int r3) {
            r1 = this;
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            android.widget.RadioGroup r0 = r1.Y
            android.view.View r3 = r0.findViewById(r3)
            int r3 = r0.indexOfChild(r3)
            r2.setFrequency(r3)
            return
    }

    private /* synthetic */ void j0(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    public void L() {
            r2 = this;
            android.widget.RadioGroup r0 = r2.Y
            com.bxkj.student.run.app.set.a r1 = new com.bxkj.student.run.app.set.a
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            android.widget.Button r0 = r2.Z
            com.bxkj.student.run.app.set.b r1 = new com.bxkj.student.run.app.set.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493028(0x7f0c00a4, float:1.8609525E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.widget.RadioGroup r0 = r2.Y
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r1 = r1.getFrequency()
            android.view.View r0 = r0.getChildAt(r1)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r1 = 1
            r0.setChecked(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "播报频率设置"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298361(0x7f090839, float:1.8214693E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
            r0.Y = r1
            r1 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
