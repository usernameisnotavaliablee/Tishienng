package com.bxkj.student.run.app.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunRankActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.my.RunRankActivity a;

        a(com.bxkj.student.run.app.my.RunRankActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.run.app.my.RunRankActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.my.RunRankActivity.g0(r0)
                java.lang.String r1 = "clazzRank"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setText(r1)
                com.bxkj.student.run.app.my.RunRankActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.my.RunRankActivity.i0(r0)
                java.lang.String r1 = "majorRank"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setText(r1)
                com.bxkj.student.run.app.my.RunRankActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.my.RunRankActivity.h0(r0)
                java.lang.String r1 = "deptRank"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setText(r1)
                com.bxkj.student.run.app.my.RunRankActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.my.RunRankActivity.j0(r0)
                java.lang.String r1 = "schoolRank"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setText(r3)
                return
        }
    }

    public RunRankActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView g0(com.bxkj.student.run.app.my.RunRankActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView h0(com.bxkj.student.run.app.my.RunRankActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView i0(com.bxkj.student.run.app.my.RunRankActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView j0(com.bxkj.student.run.app.my.RunRankActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    private void k0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.c(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.my.RunRankActivity$a r1 = new com.bxkj.student.run.app.my.RunRankActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493014(0x7f0c0096, float:1.8609496E38)
            return r0
    }

    public void R() {
            r0 = this;
            r0.k0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "跑步排名"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131299082(0x7f090b0a, float:1.8216155E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131299084(0x7f090b0c, float:1.821616E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131299083(0x7f090b0b, float:1.8216157E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131299085(0x7f090b0d, float:1.8216161E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
