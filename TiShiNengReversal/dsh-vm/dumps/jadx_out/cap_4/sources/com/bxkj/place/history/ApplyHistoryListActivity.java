package com.bxkj.place.history;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyHistoryListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private int G0;
    private int Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f684k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f685p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.place.history.ApplyHistoryListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.place.history.ApplyHistoryListActivity$a$a, reason: collision with other inner class name */
        class C0066a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.place.history.ApplyHistoryListActivity.a c;

            C0066a(com.bxkj.place.history.ApplyHistoryListActivity.a r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    java.util.Map r3 = r2.a
                    r0 = 2
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.String r1 = "status"
                    r3.put(r1, r0)
                    com.bxkj.place.history.ApplyHistoryListActivity$a r3 = r2.c
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = r2.b
                    int r0 = r0.f()
                    r3.notifyItemChanged(r0)
                    return
            }
        }

        a(com.bxkj.place.history.ApplyHistoryListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.place.history.ApplyHistoryListActivity.a r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, android.view.View r4) {
                r1.getClass()
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                android.content.Context r0 = r1.e
                r4.<init>(r0)
                java.lang.String r0 = "确定要取消吗？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setMessage(r0)
                com.bxkj.place.history.b r0 = new com.bxkj.place.history.b
                r0.<init>(r1, r2, r3)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r4.setRightButtonOnClickListener(r0)
                r1.show()
                return
        }

        public static /* synthetic */ void n(com.bxkj.place.history.ApplyHistoryListActivity.a r0, java.util.Map r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2) {
                r0.p(r1, r2)
                return
        }

        private /* synthetic */ void p(java.util.Map r7, cn.bluemobi.dylan.base.adapter.common.ViewHolder r8) {
                r6 = this;
                android.content.Context r0 = r6.e
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<c0.b> r1 = c0.b.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                c0.b r1 = (c0.b) r1
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = r2.getUserId()
                java.lang.String r3 = "fieldPlanDateId"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                java.lang.String r4 = "detailId"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r4)
                java.lang.String r5 = "2"
                rx.e r1 = r1.c(r2, r3, r4, r5)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.place.history.ApplyHistoryListActivity$a$a r1 = new com.bxkj.place.history.ApplyHistoryListActivity$a$a
                r1.<init>(r6, r7, r8)
                r0.setDataListener(r1)
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
                int r0 = com.bxkj.place.R.id.tv_feild_name
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "场地名称："
                r1.append(r2)
                java.lang.String r2 = "fieldname"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.place.R.id.tv_day
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "时间："
                r1.append(r2)
                java.lang.String r2 = "date"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.place.R.id.tv_time
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "starttime"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r6, r2)
                r1.append(r2)
                java.lang.String r2 = "-"
                r1.append(r2)
                java.lang.String r2 = "stoptime"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.place.R.id.tv_type
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "状态:"
                r1.append(r2)
                java.lang.String r2 = "statusStr"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.place.R.id.tv_status
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "签到状态:"
                r1.append(r2)
                java.lang.String r2 = "signStatusStr"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.place.R.id.bt_cancel
                android.view.View r0 = r5.h(r0)
                android.widget.Button r0 = (android.widget.Button) r0
                java.lang.String r1 = "isCanCancel"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                java.lang.String r2 = "status"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                java.lang.String r3 = "1"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto Lcd
                boolean r1 = r2.equals(r3)
                if (r1 == 0) goto Lcd
                r1 = 1
                r0.setEnabled(r1)
                com.bxkj.place.history.ApplyHistoryListActivity r1 = r4.k
                int r1 = com.bxkj.place.history.ApplyHistoryListActivity.g0(r1)
                r2 = 2
                if (r1 != r2) goto Lc7
                java.lang.String r1 = "取消申请"
                goto Lc9
            Lc7:
                java.lang.String r1 = "取消预约"
            Lc9:
                r0.setText(r1)
                goto Ld6
            Lcd:
                r1 = 0
                r0.setEnabled(r1)
                java.lang.String r1 = "取消"
                r0.setText(r1)
            Ld6:
                com.bxkj.place.history.a r1 = new com.bxkj.place.history.a
                r1.<init>(r4, r6, r5)
                r0.setOnClickListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.place.history.ApplyHistoryListActivity a;

        b(com.bxkj.place.history.ApplyHistoryListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.place.history.ApplyHistoryListActivity r4 = r3.a
                int r4 = com.bxkj.place.history.ApplyHistoryListActivity.h0(r4)
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r3.a
                int r0 = com.bxkj.place.history.ApplyHistoryListActivity.j0(r0)
                int r4 = r4 / r0
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r3.a
                int r0 = com.bxkj.place.history.ApplyHistoryListActivity.k0(r0)
                com.bxkj.place.history.ApplyHistoryListActivity r1 = r3.a
                int r1 = com.bxkj.place.history.ApplyHistoryListActivity.h0(r1)
                com.bxkj.place.history.ApplyHistoryListActivity r2 = r3.a
                int r2 = com.bxkj.place.history.ApplyHistoryListActivity.j0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.place.history.ApplyHistoryListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.place.history.ApplyHistoryListActivity.n0(r4)
                r4.q0()
                com.bxkj.place.history.ApplyHistoryListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.place.history.ApplyHistoryListActivity r4 = r3.a
                com.bxkj.place.history.ApplyHistoryListActivity.m0(r4)
                com.bxkj.place.history.ApplyHistoryListActivity r4 = r3.a
                com.bxkj.place.history.ApplyHistoryListActivity.o0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.place.history.ApplyHistoryListActivity r2 = r1.a
                r0 = 1
                com.bxkj.place.history.ApplyHistoryListActivity.l0(r2, r0)
                com.bxkj.place.history.ApplyHistoryListActivity r2 = r1.a
                com.bxkj.place.history.ApplyHistoryListActivity.o0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.place.history.ApplyHistoryListActivity a;

        c(com.bxkj.place.history.ApplyHistoryListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.place.history.ApplyHistoryListActivity.n0(r0)
                r0.w0()
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.place.history.ApplyHistoryListActivity.n0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r2.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r3, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.place.history.ApplyHistoryListActivity.i0(r0, r1)
                java.lang.String r0 = "data"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r2.a
                int r0 = com.bxkj.place.history.ApplyHistoryListActivity.k0(r0)
                r1 = 1
                if (r0 != r1) goto L26
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r2.a
                com.bxkj.place.history.ApplyHistoryListActivity.q0(r0, r3)
                goto L2f
            L26:
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.place.history.ApplyHistoryListActivity.p0(r0)
                r0.addAll(r3)
            L2f:
                com.bxkj.place.history.ApplyHistoryListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.place.history.ApplyHistoryListActivity.r0(r3)
                com.bxkj.place.history.ApplyHistoryListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.place.history.ApplyHistoryListActivity.p0(r0)
                r3.g(r0)
                return
        }
    }

    public ApplyHistoryListActivity() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f685p0 = r0
            r1 = 10
            r2.F0 = r1
            r2.G0 = r0
            return
    }

    static /* synthetic */ int g0(com.bxkj.place.history.ApplyHistoryListActivity r0) {
            int r0 = r0.Y
            return r0
    }

    static /* synthetic */ int h0(com.bxkj.place.history.ApplyHistoryListActivity r0) {
            int r0 = r0.G0
            return r0
    }

    static /* synthetic */ int i0(com.bxkj.place.history.ApplyHistoryListActivity r0, int r1) {
            r0.G0 = r1
            return r1
    }

    static /* synthetic */ int j0(com.bxkj.place.history.ApplyHistoryListActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* synthetic */ int k0(com.bxkj.place.history.ApplyHistoryListActivity r0) {
            int r0 = r0.f685p0
            return r0
    }

    static /* synthetic */ int l0(com.bxkj.place.history.ApplyHistoryListActivity r0, int r1) {
            r0.f685p0 = r1
            return r1
    }

    static /* synthetic */ int m0(com.bxkj.place.history.ApplyHistoryListActivity r2) {
            int r0 = r2.f685p0
            int r1 = r0 + 1
            r2.f685p0 = r1
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout n0(com.bxkj.place.history.ApplyHistoryListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.b0
            return r0
    }

    static /* synthetic */ void o0(com.bxkj.place.history.ApplyHistoryListActivity r0) {
            r0.s0()
            return
    }

    static /* synthetic */ java.util.List p0(com.bxkj.place.history.ApplyHistoryListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* synthetic */ java.util.List q0(com.bxkj.place.history.ApplyHistoryListActivity r0, java.util.List r1) {
            r0.c0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0(com.bxkj.place.history.ApplyHistoryListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f684k0
            return r0
    }

    private void s0() {
            r6 = this;
            android.content.Context r0 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<c0.b> r1 = c0.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            c0.b r1 = (c0.b) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            int r3 = r6.Y
            int r4 = r6.f685p0
            int r5 = r6.F0
            rx.e r1 = r1.a(r2, r3, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.place.history.ApplyHistoryListActivity$c r1 = new com.bxkj.place.history.ApplyHistoryListActivity$c
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.place.R.layout.pub_recyclerview_with_empty_view
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "appointType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L17
            android.content.Intent r0 = r4.getIntent()
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r4.Y = r0
        L17:
            int r0 = r4.Y
            r1 = 2
            if (r0 != r1) goto L1f
            java.lang.String r0 = "我的场馆申请记录"
            goto L21
        L1f:
            java.lang.String r0 = "我的场馆预约记录"
        L21:
            r4.setTitle(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.place.R.anim.zoom_in
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setLayoutAnimation(r0)
            com.bxkj.place.history.ApplyHistoryListActivity$a r0 = new com.bxkj.place.history.ApplyHistoryListActivity$a
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.place.R.layout.item_for_apply_place_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.c0
            r0.<init>(r4, r1, r2, r3)
            r4.f684k0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            android.widget.TextView r1 = r4.a0
            r0.setEmptyView(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.b0
            com.bxkj.place.history.ApplyHistoryListActivity$b r1 = new com.bxkj.place.history.ApplyHistoryListActivity$b
            r1.<init>(r4)
            r0.m1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.b0
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的申请记录"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.place.R.id.recyclerView
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            int r1 = com.bxkj.place.R.id.refresh
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.b0 = r1
            int r1 = com.bxkj.place.R.id.tv_emptyView
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
