package com.bxkj.student.home.teaching.rollcall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RollCallActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    protected int c0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f982k0;

    /* renamed from: p0, reason: collision with root package name */
    protected int f983p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.RollCallActivity k;

        a(com.bxkj.student.home.teaching.rollcall.RollCallActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "课程："
                r0.append(r1)
                java.lang.String r1 = "className"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298953(0x7f090a89, float:1.8215894E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "教师："
                r0.append(r1)
                java.lang.String r1 = "tcheNmae"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299152(0x7f090b50, float:1.8216297E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "周数：第"
                r0.append(r1)
                java.lang.String r1 = "parameter"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r1 = "周"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299190(0x7f090b76, float:1.8216374E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "时间："
                r0.append(r1)
                java.lang.String r1 = "teachingSchoolTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299153(0x7f090b51, float:1.82163E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "状态："
                r0.append(r1)
                java.lang.String r1 = "type"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "分数："
                r0.append(r1)
                java.lang.String r1 = "score"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299093(0x7f090b15, float:1.8216178E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "额外分数："
                r0.append(r1)
                java.lang.String r1 = "eScore"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 2131298896(0x7f090a50, float:1.8215778E38)
                r4.J(r2, r0)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                r4.N(r2, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "备注："
                r0.append(r1)
                java.lang.String r1 = "note"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 2131298993(0x7f090ab1, float:1.8215975E38)
                r4.J(r2, r0)
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                boolean r5 = r5.isEmpty()
                r5 = r5 ^ 1
                r4.N(r2, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.RollCallActivity a;

        b(com.bxkj.student.home.teaching.rollcall.RollCallActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r5 = r4.a
                int r0 = r5.f983p0
                int r1 = r5.c0
                int r2 = r0 / r1
                int r3 = r5.f982k0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.home.teaching.rollcall.RollCallActivity.h0(r5)
                r5.q0()
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.rollcall.RollCallActivity.i0(r5)
                java.lang.String r0 = "没有了"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.f982k0 = r3
                r5.j0()
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r2 = r1.a
                r0 = 1
                r2.f982k0 = r0
                r2.j0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.RollCallActivity a;

        c(com.bxkj.student.home.teaching.rollcall.RollCallActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.rollcall.RollCallActivity.h0(r0)
                r0.w0()
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.rollcall.RollCallActivity.h0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r0 = r3.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.f983p0 = r1
                java.lang.String r0 = "data"
                java.lang.Object r4 = r4.get(r0)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.rollcall.RollCallActivity.g0(r0)
                java.util.List r0 = r0.d()
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r1 = r3.a
                int r1 = r1.f982k0
                r2 = 1
                if (r1 != r2) goto L28
                goto L2c
            L28:
                r0.addAll(r4)
                r4 = r0
            L2c:
                com.bxkj.student.home.teaching.rollcall.RollCallActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.rollcall.RollCallActivity.g0(r0)
                r0.g(r4)
                return
        }
    }

    public RollCallActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 10
            r1.c0 = r0
            r0 = 1
            r1.f982k0 = r0
            r1.f983p0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.rollcall.RollCallActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout h0(com.bxkj.student.home.teaching.rollcall.RollCallActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.home.teaching.rollcall.RollCallActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private rx.e<retrofit2.c0<okhttp3.ResponseBody>> k0() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r0 = r1.A0(r0)
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492982(0x7f0c0076, float:1.8609431E38)
            return r0
    }

    public void R() {
            r5 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r1 = 0
            r0.S0(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r5.V
            r4 = 1
            r2.<init>(r3, r4, r1)
            r0.setLayoutManager(r2)
            com.bxkj.student.home.teaching.rollcall.RollCallActivity$a r0 = new com.bxkj.student.home.teaching.rollcall.RollCallActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493337(0x7f0c01d9, float:1.8610151E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.a0
            r0.<init>(r5, r1, r2, r3)
            r5.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.Z
            r1.setAdapter(r0)
            r5.l0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "查看点名"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298550(0x7f0908f6, float:1.8215076E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Spinner r2 = (android.widget.Spinner) r2
            r0 = 8
            r2.setVisibility(r0)
            r2 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Y = r2
            r2 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.Z = r2
            return
    }

    public void j0() {
            r2 = this;
            rx.e r0 = r2.k0()
            android.content.Context r1 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.rollcall.RollCallActivity$c r1 = new com.bxkj.student.home.teaching.rollcall.RollCallActivity$c
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    public void l0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.home.teaching.rollcall.RollCallActivity$b r1 = new com.bxkj.student.home.teaching.rollcall.RollCallActivity$b
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
