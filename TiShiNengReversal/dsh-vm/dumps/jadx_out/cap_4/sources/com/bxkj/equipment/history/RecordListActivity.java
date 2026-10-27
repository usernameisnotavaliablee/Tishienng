package com.bxkj.equipment.history;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RecordListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private int G0;
    private int H0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Y;
    private android.widget.TextView Z;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f676k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f677p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.equipment.history.RecordListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.equipment.history.RecordListActivity$a$a, reason: collision with other inner class name */
        class C0064a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.equipment.history.RecordListActivity.a a;

            C0064a(com.bxkj.equipment.history.RecordListActivity.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                    r0 = this;
                    com.bxkj.equipment.history.RecordListActivity$a r1 = r0.a
                    com.bxkj.equipment.history.RecordListActivity r1 = r1.k
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = com.bxkj.equipment.history.RecordListActivity.g0(r1)
                    r1.D()
                    return
            }
        }

        a(com.bxkj.equipment.history.RecordListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.equipment.history.RecordListActivity.a r1, java.util.Map r2, android.view.View r3) {
                r1.getClass()
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                android.content.Context r0 = r1.e
                r3.<init>(r0)
                java.lang.String r0 = "确定要取消吗？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)
                com.bxkj.equipment.history.b r0 = new com.bxkj.equipment.history.b
                r0.<init>(r1, r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r3.setRightButtonOnClickListener(r0)
                r1.show()
                return
        }

        public static /* synthetic */ void n(com.bxkj.equipment.history.RecordListActivity.a r0, java.util.Map r1) {
                r0.p(r1)
                return
        }

        private /* synthetic */ void p(java.util.Map r13) {
                r12 = this;
                android.content.Context r0 = r12.e
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<com.bxkj.equipment.i> r1 = com.bxkj.equipment.i.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                r2 = r1
                com.bxkj.equipment.i r2 = (com.bxkj.equipment.i) r2
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r3 = r1.getUserId()
                java.lang.String r1 = "id"
                java.lang.String r11 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r1)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                java.lang.String r10 = "6"
                rx.e r13 = r2.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                cn.bluemobi.dylan.http.HttpRequest r13 = r0.setObservable(r13)
                com.bxkj.equipment.history.RecordListActivity$a$a r0 = new com.bxkj.equipment.history.RecordListActivity$a$a
                r0.<init>(r12)
                r13.setDataListener(r0)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                int r0 = com.bxkj.equipment.R.id.tv_feild_name
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "器材名称："
                r1.append(r2)
                java.lang.String r2 = "equInfo"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.equipment.R.id.tv_day
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "预计领取时间："
                r1.append(r2)
                java.lang.String r2 = "forReceiveTime"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.equipment.R.id.tv_time
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "预计归还时间："
                r1.append(r2)
                java.lang.String r2 = "forBackTime"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.equipment.R.id.tv_receive_date
                java.lang.String r1 = "receiveTime"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                r2 = r2 ^ 1
                r5.N(r0, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "实际领取时间："
                r2.append(r3)
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r6, r1)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.equipment.R.id.tv_return_date
                java.lang.String r1 = "backTime"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                r2 = r2 ^ 1
                r5.N(r0, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "实际归还时间："
                r2.append(r3)
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.equipment.R.id.tv_type
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "状态:"
                r1.append(r2)
                java.lang.String r2 = "statusStr"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.equipment.R.id.bt_cancel
                android.view.View r5 = r5.h(r0)
                android.widget.Button r5 = (android.widget.Button) r5
                java.lang.String r0 = "status"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                java.lang.String r1 = "0"
                boolean r0 = r0.equals(r1)
                r5.setEnabled(r0)
                com.bxkj.equipment.history.a r0 = new com.bxkj.equipment.history.a
                r0.<init>(r4, r6)
                r5.setOnClickListener(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.equipment.history.RecordListActivity a;

        b(com.bxkj.equipment.history.RecordListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.equipment.history.RecordListActivity r4 = r3.a
                int r4 = com.bxkj.equipment.history.RecordListActivity.h0(r4)
                com.bxkj.equipment.history.RecordListActivity r0 = r3.a
                int r0 = com.bxkj.equipment.history.RecordListActivity.j0(r0)
                int r4 = r4 / r0
                com.bxkj.equipment.history.RecordListActivity r0 = r3.a
                int r0 = com.bxkj.equipment.history.RecordListActivity.k0(r0)
                com.bxkj.equipment.history.RecordListActivity r1 = r3.a
                int r1 = com.bxkj.equipment.history.RecordListActivity.h0(r1)
                com.bxkj.equipment.history.RecordListActivity r2 = r3.a
                int r2 = com.bxkj.equipment.history.RecordListActivity.j0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.equipment.history.RecordListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.equipment.history.RecordListActivity.g0(r4)
                r4.q0()
                com.bxkj.equipment.history.RecordListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.equipment.history.RecordListActivity r4 = r3.a
                com.bxkj.equipment.history.RecordListActivity.m0(r4)
                com.bxkj.equipment.history.RecordListActivity r4 = r3.a
                com.bxkj.equipment.history.RecordListActivity.n0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.equipment.history.RecordListActivity r2 = r1.a
                r0 = 1
                com.bxkj.equipment.history.RecordListActivity.l0(r2, r0)
                com.bxkj.equipment.history.RecordListActivity r2 = r1.a
                com.bxkj.equipment.history.RecordListActivity.n0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.equipment.history.RecordListActivity a;

        c(com.bxkj.equipment.history.RecordListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.equipment.history.RecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.equipment.history.RecordListActivity.g0(r0)
                r0.w0()
                com.bxkj.equipment.history.RecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.equipment.history.RecordListActivity.g0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.equipment.history.RecordListActivity r0 = r2.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r3, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.equipment.history.RecordListActivity.i0(r0, r1)
                java.lang.String r0 = "data"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.equipment.history.RecordListActivity r0 = r2.a
                int r0 = com.bxkj.equipment.history.RecordListActivity.k0(r0)
                r1 = 1
                if (r0 != r1) goto L26
                com.bxkj.equipment.history.RecordListActivity r0 = r2.a
                com.bxkj.equipment.history.RecordListActivity.p0(r0, r3)
                goto L2f
            L26:
                com.bxkj.equipment.history.RecordListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.equipment.history.RecordListActivity.o0(r0)
                r0.addAll(r3)
            L2f:
                com.bxkj.equipment.history.RecordListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.equipment.history.RecordListActivity.q0(r3)
                com.bxkj.equipment.history.RecordListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.equipment.history.RecordListActivity.o0(r0)
                r3.g(r0)
                return
        }
    }

    public RecordListActivity() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f677p0 = r0
            r0 = 1
            r2.F0 = r0
            r1 = 10
            r2.G0 = r1
            r2.H0 = r0
            return
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout g0(com.bxkj.equipment.history.RecordListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.a0
            return r0
    }

    static /* synthetic */ int h0(com.bxkj.equipment.history.RecordListActivity r0) {
            int r0 = r0.H0
            return r0
    }

    static /* synthetic */ int i0(com.bxkj.equipment.history.RecordListActivity r0, int r1) {
            r0.H0 = r1
            return r1
    }

    static /* synthetic */ int j0(com.bxkj.equipment.history.RecordListActivity r0) {
            int r0 = r0.G0
            return r0
    }

    static /* synthetic */ int k0(com.bxkj.equipment.history.RecordListActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* synthetic */ int l0(com.bxkj.equipment.history.RecordListActivity r0, int r1) {
            r0.F0 = r1
            return r1
    }

    static /* synthetic */ int m0(com.bxkj.equipment.history.RecordListActivity r2) {
            int r0 = r2.F0
            int r1 = r0 + 1
            r2.F0 = r1
            return r0
    }

    static /* synthetic */ void n0(com.bxkj.equipment.history.RecordListActivity r0) {
            r0.r0()
            return
    }

    static /* synthetic */ java.util.List o0(com.bxkj.equipment.history.RecordListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* synthetic */ java.util.List p0(com.bxkj.equipment.history.RecordListActivity r0, java.util.List r1) {
            r0.b0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter q0(com.bxkj.equipment.history.RecordListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    private void r0() {
            r5 = this;
            java.lang.Class<com.bxkj.equipment.i> r0 = com.bxkj.equipment.i.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.equipment.i r1 = (com.bxkj.equipment.i) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            int r3 = r5.F0
            int r4 = r5.G0
            rx.e r1 = r1.b(r2, r3, r4)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r2 = r2.getUserType()
            r3 = 2
            if (r2 != r3) goto L35
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.equipment.i r0 = (com.bxkj.equipment.i) r0
            java.lang.String r1 = r5.f676k0
            int r2 = r5.f677p0
            int r3 = r5.F0
            int r4 = r5.G0
            rx.e r1 = r0.a(r1, r2, r3, r4)
        L35:
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.equipment.history.RecordListActivity$c r1 = new com.bxkj.equipment.history.RecordListActivity$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.equipment.R.layout.pub_recyclerview_with_empty_view
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "teacherCurriculumId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.f676k0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "week"
            boolean r0 = r0.hasExtra(r1)
            r2 = 0
            if (r0 == 0) goto L2d
            android.content.Intent r0 = r4.getIntent()
            int r0 = r0.getIntExtra(r1, r2)
            r4.f677p0 = r0
        L2d:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r4.V
            r1.<init>(r3)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.V
            int r3 = com.bxkj.equipment.R.anim.zoom_in
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r3)
            r0.<init>(r1)
            r0.setOrder(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Y
            r1.setLayoutAnimation(r0)
            com.bxkj.equipment.history.RecordListActivity$a r0 = new com.bxkj.equipment.history.RecordListActivity$a
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.equipment.R.layout.item_for_record_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.b0
            r0.<init>(r4, r1, r2, r3)
            r4.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Y
            android.widget.TextView r1 = r4.Z
            r0.setEmptyView(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.a0
            com.bxkj.equipment.history.RecordListActivity$b r1 = new com.bxkj.equipment.history.RecordListActivity$b
            r1.<init>(r4)
            r0.m1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.a0
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的器材申请记录"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.equipment.R.id.recyclerView
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Y = r1
            int r1 = com.bxkj.equipment.R.id.refresh
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.a0 = r1
            int r1 = com.bxkj.equipment.R.id.tv_emptyView
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
