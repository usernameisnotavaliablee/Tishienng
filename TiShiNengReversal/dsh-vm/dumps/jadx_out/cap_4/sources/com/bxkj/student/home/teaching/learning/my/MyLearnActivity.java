package com.bxkj.student.home.teaching.learning.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyLearnActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.TextView I0;
    private android.widget.TextView Y;
    private android.widget.LinearLayout Z;
    private android.widget.TextView a0;
    private android.widget.LinearLayout b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.ListView f944k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f945p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.my.MyLearnActivity a;

        a(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0 = r4.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0 = r4.a
                com.bxkj.student.home.teaching.learning.my.MyLearnActivity.p0(r0, r5)
                com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.learning.my.MyLearnActivity.n0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "我的点赞("
                r1.append(r2)
                java.lang.String r2 = "sumLike"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.learning.my.MyLearnActivity.m0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "我的收藏("
                r1.append(r3)
                java.lang.String r3 = "sumCollection"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r3)
                r1.append(r5)
                r1.append(r2)
                java.lang.String r5 = r1.toString()
                r0.setText(r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.my.MyLearnActivity a;

        b(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "data"
                int r4 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r0)
                com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.learning.my.MyLearnActivity.o0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "待处理作业("
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.setText(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.my.MyLearnActivity e;

        c(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "termSysTerm"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299155(0x7f090b53, float:1.8216303E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "时长："
                r0.append(r1)
                java.lang.String r1 = "termSumDuration"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298887(0x7f090a47, float:1.821576E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "积分："
                r0.append(r1)
                java.lang.String r1 = "termSumIntegral"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 2131298948(0x7f090a84, float:1.8215884E38)
                r3.J(r0, r4)
                return
        }
    }

    public MyLearnActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0, android.view.View r1) {
            r0.x0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0, android.view.View r1) {
            r0.u0(r1)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0, android.view.View r1) {
            r0.t0(r1)
            return
    }

    public static /* synthetic */ void j0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0, android.view.View r1) {
            r0.s0(r1)
            return
    }

    public static /* synthetic */ void k0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0, android.view.View r1) {
            r0.v0(r1)
            return
    }

    public static /* synthetic */ void l0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0, android.view.View r1) {
            r0.w0(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0) {
            android.widget.TextView r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0) {
            android.widget.TextView r0 = r0.f945p0
            return r0
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.teaching.learning.my.MyLearnActivity r0, java.util.Map r1) {
            r0.y0(r1)
            return
    }

    private void q0() {
            r3 = this;
            r3.r0()
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.h(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.my.MyLearnActivity$a r1 = new com.bxkj.student.home.teaching.learning.my.MyLearnActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void r0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            rx.e r1 = r1.t()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.my.MyLearnActivity$b r1 = new com.bxkj.student.home.teaching.learning.my.MyLearnActivity$b
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void s0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity> r1 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void t0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyRecordListActivity> r1 = com.bxkj.student.home.teaching.learning.my.MyRecordListActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "title"
            java.lang.String r1 = "我的点赞"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "resultType"
            java.lang.String r1 = "3"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void u0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyRecordListActivity> r1 = com.bxkj.student.home.teaching.learning.my.MyRecordListActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "title"
            java.lang.String r1 = "我的收藏"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "resultType"
            java.lang.String r1 = "2"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void v0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyRecordListActivity> r1 = com.bxkj.student.home.teaching.learning.my.MyRecordListActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "title"
            java.lang.String r1 = "浏览记录"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "resultType"
            java.lang.String r1 = "1"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void w0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyRecordListActivity> r1 = com.bxkj.student.home.teaching.learning.my.MyRecordListActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "title"
            java.lang.String r1 = "分享记录"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "resultType"
            java.lang.String r1 = "4"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void x0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyIntegralListActivity> r1 = com.bxkj.student.home.teaching.learning.my.MyIntegralListActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "title"
            java.lang.String r1 = "我的积分"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "resultType"
            java.lang.String r1 = "5"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private void y0(java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            android.widget.TextView r0 = r4.Y
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sumDuration"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r2)
            java.lang.String r2 = "分钟"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.a0
            java.lang.String r1 = "sumIntegral"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
            r0.setText(r1)
            android.widget.TextView r0 = r4.c0
            java.lang.String r1 = "rank"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
            r0.setText(r1)
            java.lang.String r0 = "termData"
            java.util.List r5 = cn.bluemobi.dylan.http.JsonParse.getList(r5, r0)
            android.widget.ListView r0 = r4.f944k0
            com.bxkj.student.home.teaching.learning.my.MyLearnActivity$c r1 = new com.bxkj.student.home.teaching.learning.my.MyLearnActivity$c
            android.content.Context r2 = r4.V
            r3 = 2131493288(0x7f0c01a8, float:1.8610052E38)
            r1.<init>(r4, r2, r3, r5)
            r0.setAdapter(r1)
            return
    }

    public void L() {
            r2 = this;
            android.widget.TextView r0 = r2.f945p0
            com.bxkj.student.home.teaching.learning.my.a r1 = new com.bxkj.student.home.teaching.learning.my.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.F0
            com.bxkj.student.home.teaching.learning.my.b r1 = new com.bxkj.student.home.teaching.learning.my.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.G0
            com.bxkj.student.home.teaching.learning.my.c r1 = new com.bxkj.student.home.teaching.learning.my.c
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.H0
            com.bxkj.student.home.teaching.learning.my.d r1 = new com.bxkj.student.home.teaching.learning.my.d
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.I0
            com.bxkj.student.home.teaching.learning.my.e r1 = new com.bxkj.student.home.teaching.learning.my.e
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r2.Z
            com.bxkj.student.home.teaching.learning.my.f r1 = new com.bxkj.student.home.teaching.learning.my.f
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492976(0x7f0c0070, float:1.860942E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.P()
            r1 = 8
            r0.setVisibility(r1)
            r2.q0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的学习"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298887(0x7f090a47, float:1.821576E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298047(0x7f0906ff, float:1.8214056E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Z = r1
            r1 = 2131298948(0x7f090a84, float:1.8215884E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131298067(0x7f090713, float:1.8214097E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.b0 = r1
            r1 = 2131299062(0x7f090af6, float:1.8216115E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r0.f944k0 = r1
            r1 = 2131299068(0x7f090afc, float:1.8216127E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f945p0 = r1
            r1 = 2131298958(0x7f090a8e, float:1.8215904E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.F0 = r1
            r1 = 2131298841(0x7f090a19, float:1.8215667E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.G0 = r1
            r1 = 2131299067(0x7f090afb, float:1.8216125E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.H0 = r1
            r1 = 2131299100(0x7f090b1c, float:1.8216192E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.I0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onRestart() {
            r0 = this;
            super/*android.app.Activity*/.onRestart()
            r0.q0()
            return
    }
}
