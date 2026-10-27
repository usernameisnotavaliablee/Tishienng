package com.bxkj.student.home.teaching.leave;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SelectLessenListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.recyclerview.widget.RecyclerView Y;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f967k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f968p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.leave.SelectLessenListActivity k;

        a(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.leave.SelectLessenListActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.q(r1, r2)
                return
        }

        public static /* synthetic */ void n(com.bxkj.student.home.teaching.leave.SelectLessenListActivity.a r0, cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.util.Map r2, android.view.View r3) {
                r0.p(r1, r2, r3)
                return
        }

        private /* synthetic */ void p(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map r4, android.view.View r5) {
                r2 = this;
                android.content.Intent r5 = new android.content.Intent
                android.content.Context r0 = r2.e
                java.lang.Class<com.bxkj.student.home.teaching.leave.LeaveActivity> r1 = com.bxkj.student.home.teaching.leave.LeaveActivity.class
                r5.<init>(r0, r1)
                java.lang.String r0 = "position"
                int r3 = r3.f()
                r5.putExtra(r0, r3)
                java.lang.String r3 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.base.utils.u.O(r4, r3)
                r5.putExtra(r3, r4)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r3 = r2.k
                r3.startActivity(r5)
                return
        }

        private /* synthetic */ void q(java.util.Map r3, android.view.View r4) {
                r2 = this;
                android.content.Intent r4 = new android.content.Intent
                android.content.Context r0 = r2.e
                java.lang.Class<com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity> r1 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity.class
                r4.<init>(r0, r1)
                java.lang.String r0 = "id"
                java.lang.String r3 = cn.bluemobi.dylan.base.utils.u.O(r3, r0)
                r4.putExtra(r0, r3)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r3 = r2.k
                r3.startActivity(r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "termName"
                java.lang.String r0 = cn.bluemobi.dylan.base.utils.u.O(r4, r0)
                r1 = 2131299155(0x7f090b53, float:1.8216303E38)
                r3.J(r1, r0)
                java.lang.String r0 = "schoolTimeName"
                java.lang.String r0 = cn.bluemobi.dylan.base.utils.u.O(r4, r0)
                r1 = 2131299158(0x7f090b56, float:1.821631E38)
                r3.J(r1, r0)
                java.lang.String r0 = "teacherName"
                java.lang.String r0 = cn.bluemobi.dylan.base.utils.u.O(r4, r0)
                r1 = 2131299151(0x7f090b4f, float:1.8216295E38)
                r3.J(r1, r0)
                java.lang.String r0 = "curriculumName"
                java.lang.String r0 = cn.bluemobi.dylan.base.utils.u.O(r4, r0)
                r1 = 2131298953(0x7f090a89, float:1.8215894E38)
                r3.J(r1, r0)
                com.bxkj.student.home.teaching.leave.c r0 = new com.bxkj.student.home.teaching.leave.c
                r0.<init>(r2, r3, r4)
                r1 = 2131296615(0x7f090167, float:1.8211152E38)
                r3.w(r1, r0)
                com.bxkj.student.home.teaching.leave.d r0 = new com.bxkj.student.home.teaching.leave.d
                r0.<init>(r2, r4)
                r4 = 2131296635(0x7f09017b, float:1.8211192E38)
                r3.w(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.leave.SelectLessenListActivity a;

        b(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r4 = r3.a
                int r4 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.l0(r4)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.j0(r0)
                int r4 = r4 / r0
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.i0(r0)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r1 = r3.a
                int r1 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.l0(r1)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r2 = r3.a
                int r2 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.j0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.k0(r4)
                r4.q0()
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r4 = r3.a
                int r0 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.i0(r4)
                int r0 = r0 + 1
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity.n0(r4, r0)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r4 = r3.a
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity.p0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity.n0(r2, r0)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r2 = r1.a
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity.p0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.leave.SelectLessenListActivity a;

        c(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.k0(r0)
                r0.w0()
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.k0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r2.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r3, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity.o0(r0, r1)
                java.lang.String r0 = "data"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r2.a
                int r0 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.i0(r0)
                r1 = 1
                if (r0 != r1) goto L26
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r2.a
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity.m0(r0, r3)
                goto L2f
            L26:
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.h0(r0)
                r0.addAll(r3)
            L2f:
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.g0(r3)
                com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public SelectLessenListActivity() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.c0 = r0
            r1 = 10
            r2.f967k0 = r1
            r2.f968p0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ int i0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0) {
            int r0 = r0.f967k0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout k0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ int l0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0) {
            int r0 = r0.f968p0
            return r0
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0, int r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0, int r1) {
            r0.f968p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.teaching.leave.SelectLessenListActivity r0) {
            r0.q0()
            return
    }

    private void q0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.m0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.leave.SelectLessenListActivity$c r1 = new com.bxkj.student.home.teaching.leave.SelectLessenListActivity$c
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
            r0 = 2131492999(0x7f0c0087, float:1.8609466E38)
            return r0
    }

    public void R() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.V
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setLayoutAnimation(r0)
            com.bxkj.student.home.teaching.leave.SelectLessenListActivity$a r0 = new com.bxkj.student.home.teaching.leave.SelectLessenListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493271(0x7f0c0197, float:1.8610017E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Z
            com.bxkj.student.home.teaching.leave.SelectLessenListActivity$b r1 = new com.bxkj.student.home.teaching.leave.SelectLessenListActivity$b
            r1.<init>(r4)
            r0.m1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Z
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "选择要请假的课程"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Y = r1
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void r0(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.b0
            if (r0 == 0) goto L20
            int r0 = r0.getItemCount()
            if (r4 >= r0) goto L20
            if (r4 < 0) goto L20
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.b0
            java.lang.Object r0 = r0.getItem(r4)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "status"
            java.lang.String r2 = "待审核"
            r0.put(r1, r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.b0
            r0.notifyItemChanged(r4)
        L20:
            return
    }
}
