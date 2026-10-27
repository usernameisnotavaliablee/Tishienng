package com.bxkj.student.personal.sign;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SignRecordListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private int G0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private int b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private com.bxkj.student.life.mall.order.a f1142k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f1143p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.personal.sign.SignRecordListActivity k;

        a(com.bxkj.student.personal.sign.SignRecordListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "积分+"
                r0.append(r1)
                java.lang.String r1 = "integral"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "integralDate"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131299158(0x7f090b56, float:1.821631E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.personal.sign.SignRecordListActivity a;

        b(com.bxkj.student.personal.sign.SignRecordListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.personal.sign.SignRecordListActivity r4 = r3.a
                int r4 = com.bxkj.student.personal.sign.SignRecordListActivity.l0(r4)
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r3.a
                int r0 = com.bxkj.student.personal.sign.SignRecordListActivity.j0(r0)
                int r4 = r4 / r0
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r3.a
                int r0 = com.bxkj.student.personal.sign.SignRecordListActivity.i0(r0)
                com.bxkj.student.personal.sign.SignRecordListActivity r1 = r3.a
                int r1 = com.bxkj.student.personal.sign.SignRecordListActivity.l0(r1)
                com.bxkj.student.personal.sign.SignRecordListActivity r2 = r3.a
                int r2 = com.bxkj.student.personal.sign.SignRecordListActivity.j0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.personal.sign.SignRecordListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.personal.sign.SignRecordListActivity.k0(r4)
                r4.q0()
                com.bxkj.student.personal.sign.SignRecordListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.personal.sign.SignRecordListActivity r4 = r3.a
                int r0 = com.bxkj.student.personal.sign.SignRecordListActivity.i0(r4)
                int r0 = r0 + 1
                com.bxkj.student.personal.sign.SignRecordListActivity.m0(r4, r0)
                com.bxkj.student.personal.sign.SignRecordListActivity r4 = r3.a
                com.bxkj.student.personal.sign.SignRecordListActivity.o0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.personal.sign.SignRecordListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.personal.sign.SignRecordListActivity.m0(r2, r0)
                com.bxkj.student.personal.sign.SignRecordListActivity r2 = r1.a
                com.bxkj.student.personal.sign.SignRecordListActivity.o0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.sign.SignRecordListActivity a;

        c(com.bxkj.student.personal.sign.SignRecordListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.sign.SignRecordListActivity.k0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.sign.SignRecordListActivity.k0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.sign.SignRecordListActivity.k0(r0)
                r0.w0()
            L20:
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.sign.SignRecordListActivity.k0(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.sign.SignRecordListActivity.k0(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.sign.SignRecordListActivity.k0(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.personal.sign.SignRecordListActivity.n0(r0, r1)
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r2.a
                int r0 = com.bxkj.student.personal.sign.SignRecordListActivity.i0(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.personal.sign.SignRecordListActivity.h0(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.personal.sign.SignRecordListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.personal.sign.SignRecordListActivity.h0(r0)
                r0.addAll(r3)
                com.bxkj.student.personal.sign.SignRecordListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.personal.sign.SignRecordListActivity.g0(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public SignRecordListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 1
            r1.f1143p0 = r0
            r0 = 15
            r1.F0 = r0
            r0 = 0
            r1.G0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.personal.sign.SignRecordListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.personal.sign.SignRecordListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ int i0(com.bxkj.student.personal.sign.SignRecordListActivity r0) {
            int r0 = r0.f1143p0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.personal.sign.SignRecordListActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout k0(com.bxkj.student.personal.sign.SignRecordListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int l0(com.bxkj.student.personal.sign.SignRecordListActivity r0) {
            int r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.personal.sign.SignRecordListActivity r0, int r1) {
            r0.f1143p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.personal.sign.SignRecordListActivity r0, int r1) {
            r0.G0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.personal.sign.SignRecordListActivity r0) {
            r0.p0()
            return
    }

    private void p0() {
            r6 = this;
            android.content.Context r0 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getAccount()
            int r4 = r6.f1143p0
            int r5 = r6.F0
            rx.e r1 = r1.m(r2, r3, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.sign.SignRecordListActivity$c r1 = new com.bxkj.student.personal.sign.SignRecordListActivity$c
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    private void q0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.personal.sign.SignRecordListActivity$b r1 = new com.bxkj.student.personal.sign.SignRecordListActivity$b
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493641(0x7f0c0309, float:1.8610768E38)
            return r0
    }

    public void R() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.personal.sign.SignRecordListActivity$a r0 = new com.bxkj.student.personal.sign.SignRecordListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493324(0x7f0c01cc, float:1.8610125E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r4.findViewById(r1)
            r0.setEmptyView(r1)
            r4.q0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "签到记录"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
