package com.bxkj.student.run.app.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyRunActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.LinearLayout Y;
    private android.widget.LinearLayout Z;
    private android.widget.LinearLayout a0;
    private android.widget.LinearLayout b0;

    public MyRunActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.my.MyRunActivity r0, android.view.View r1) {
            r0.l0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.run.app.my.MyRunActivity r0, android.view.View r1) {
            r0.m0(r1)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.run.app.my.MyRunActivity r0, android.view.View r1) {
            r0.k0(r1)
            return
    }

    public static /* synthetic */ void j0(com.bxkj.student.run.app.my.MyRunActivity r0, android.view.View r1) {
            r0.n0(r1)
            return
    }

    private /* synthetic */ void k0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.run.app.record.RunRecorderListActivity> r1 = com.bxkj.student.run.app.record.RunRecorderListActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void l0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.run.app.set.RunSettingActivity> r1 = com.bxkj.student.run.app.set.RunSettingActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void m0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.run.app.my.RunRankActivity> r1 = com.bxkj.student.run.app.my.RunRankActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void n0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.run.app.my.RunStatisticsActivity> r1 = com.bxkj.student.run.app.my.RunStatisticsActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    public void L() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.Y
            com.bxkj.student.run.app.my.b r1 = new com.bxkj.student.run.app.my.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r2.b0
            com.bxkj.student.run.app.my.c r1 = new com.bxkj.student.run.app.my.c
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r2.a0
            com.bxkj.student.run.app.my.d r1 = new com.bxkj.student.run.app.my.d
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r2.Z
            com.bxkj.student.run.app.my.e r1 = new com.bxkj.student.run.app.my.e
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492980(0x7f0c0074, float:1.8609427E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的跑步"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298070(0x7f090716, float:1.8214103E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Y = r1
            r1 = 2131298072(0x7f090718, float:1.8214107E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Z = r1
            r1 = 2131298069(0x7f090715, float:1.82141E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.a0 = r1
            r1 = 2131298071(0x7f090717, float:1.8214105E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.b0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onResume() {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            return
    }
}
