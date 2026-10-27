package com.bxkj.student.home.teaching.rollcall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SignActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Button Y;
    private java.lang.String Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.SignActivity a;

        a(com.bxkj.student.home.teaching.rollcall.SignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.rollcall.SignActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.SignActivity.h0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "签到成功"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }
    }

    public SignActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.rollcall.SignActivity r0, android.view.View r1) {
            r0.i0(r1)
            return
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.student.home.teaching.rollcall.SignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void i0(android.view.View r1) {
            r0 = this;
            r0.j0()
            return
    }

    private void j0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.Z
            rx.e r1 = r1.j0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.rollcall.SignActivity$a r1 = new com.bxkj.student.home.teaching.rollcall.SignActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.Y
            com.bxkj.student.home.teaching.rollcall.i r1 = new com.bxkj.student.home.teaching.rollcall.i
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493038(0x7f0c00ae, float:1.8609545E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.Z = r0
        L16:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "上课签到"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296614(0x7f090166, float:1.821115E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
