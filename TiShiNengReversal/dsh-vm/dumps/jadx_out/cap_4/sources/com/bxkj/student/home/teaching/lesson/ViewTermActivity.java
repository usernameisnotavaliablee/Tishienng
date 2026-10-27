package com.bxkj.student.home.teaching.lesson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ViewTermActivity extends cn.bluemobi.dylan.base.BaseActivity {
    protected int F0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private java.lang.String c0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f975k0;

    /* renamed from: p0, reason: collision with root package name */
    protected int f976p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ViewTermActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.lesson.ViewTermActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0100a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.teaching.lesson.ViewTermActivity.a b;

            ViewOnClickListenerC0100a(com.bxkj.student.home.teaching.lesson.ViewTermActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r5) {
                    r4 = this;
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r0 = "查看"
                    r5.append(r0)
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r0 = r0.getViewAfterLabelName()
                    r5.append(r0)
                    java.lang.String r5 = r5.toString()
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity$a r0 = r4.b
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity r0 = r0.k
                    java.lang.String r0 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.h0(r0)
                    boolean r5 = r5.equals(r0)
                    java.lang.String r0 = "id"
                    if (r5 == 0) goto L48
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity$a r5 = r4.b
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity r5 = r5.k
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity$a r2 = r4.b
                    android.content.Context r2 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.a.m(r2)
                    java.lang.Class<com.bxkj.student.home.teaching.lesson.ViewLessonActivity> r3 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.class
                    r1.<init>(r2, r3)
                    java.util.Map r2 = r4.a
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                    android.content.Intent r0 = r1.putExtra(r0, r2)
                    r5.startActivity(r0)
                    return
                L48:
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity$a r5 = r4.b
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity r5 = r5.k
                    java.lang.String r5 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.h0(r5)
                    java.lang.String r1 = "查看点名"
                    boolean r5 = r1.equals(r5)
                    if (r5 == 0) goto L76
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity$a r5 = r4.b
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity r5 = r5.k
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.home.teaching.lesson.ViewTermActivity$a r2 = r4.b
                    android.content.Context r2 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.a.n(r2)
                    java.lang.Class<com.bxkj.student.home.teaching.rollcall.RollCallActivity> r3 = com.bxkj.student.home.teaching.rollcall.RollCallActivity.class
                    r1.<init>(r2, r3)
                    java.util.Map r2 = r4.a
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                    android.content.Intent r0 = r1.putExtra(r0, r2)
                    r5.startActivity(r0)
                L76:
                    return
            }
        }

        a(com.bxkj.student.home.teaching.lesson.ViewTermActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.home.teaching.lesson.ViewTermActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.home.teaching.lesson.ViewTermActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "sysTermName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298861(0x7f090a2d, float:1.8215707E38)
                r3.J(r1, r0)
                java.lang.String r0 = "sysUserName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "sysUserUserNum"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298991(0x7f090aaf, float:1.821597E38)
                r3.J(r1, r0)
                java.lang.String r0 = "type"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r3.J(r1, r0)
                java.lang.String r0 = "score"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299093(0x7f090b15, float:1.8216178E38)
                r3.J(r1, r0)
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r0 = r2.k
                java.lang.String r0 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.h0(r0)
                r1 = 2131296623(0x7f09016f, float:1.8211168E38)
                r3.J(r1, r0)
                com.bxkj.student.home.teaching.lesson.ViewTermActivity$a$a r0 = new com.bxkj.student.home.teaching.lesson.ViewTermActivity$a$a
                r0.<init>(r2, r4)
                r3.w(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ViewTermActivity a;

        b(com.bxkj.student.home.teaching.lesson.ViewTermActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r5 = r4.a
                int r0 = r5.F0
                int r1 = r5.f975k0
                int r2 = r0 / r1
                int r3 = r5.f976p0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.i0(r5)
                r5.q0()
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.j0(r5)
                java.lang.String r0 = "没有了"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.f976p0 = r3
                r5.k0()
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r2 = r1.a
                r0 = 1
                r2.f976p0 = r0
                r2.k0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ViewTermActivity a;

        c(com.bxkj.student.home.teaching.lesson.ViewTermActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.i0(r0)
                r0.w0()
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.i0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r0 = r3.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.F0 = r1
                java.lang.String r0 = "data"
                java.lang.Object r4 = r4.get(r0)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.g0(r0)
                java.util.List r0 = r0.d()
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r1 = r3.a
                int r1 = r1.f976p0
                r2 = 1
                if (r1 != r2) goto L28
                goto L2c
            L28:
                r0.addAll(r4)
                r4 = r0
            L2c:
                com.bxkj.student.home.teaching.lesson.ViewTermActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.g0(r0)
                r0.g(r4)
                return
        }
    }

    public ViewTermActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 10
            r1.f975k0 = r0
            r0 = 1
            r1.f976p0 = r0
            r1.F0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.lesson.ViewTermActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.home.teaching.lesson.ViewTermActivity r0) {
            java.lang.String r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout i0(com.bxkj.student.home.teaching.lesson.ViewTermActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.home.teaching.lesson.ViewTermActivity r0) {
            android.content.Context r0 = r0.V
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
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "from"
            java.lang.String r0 = r0.getStringExtra(r1)
            r5.c0 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r3 = 1
            r4 = 0
            r1.<init>(r2, r3, r4)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.lesson.ViewTermActivity$a r0 = new com.bxkj.student.home.teaching.lesson.ViewTermActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493331(0x7f0c01d3, float:1.861014E38)
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
            java.lang.String r0 = "查看学期"
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

    public void k0() {
            r4 = this;
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            int r2 = r4.f976p0
            int r3 = r4.f975k0
            rx.e r0 = r0.M(r1, r2, r3)
            android.content.Context r1 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.lesson.ViewTermActivity$c r1 = new com.bxkj.student.home.teaching.lesson.ViewTermActivity$c
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void l0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.home.teaching.lesson.ViewTermActivity$b r1 = new com.bxkj.student.home.teaching.lesson.ViewTermActivity$b
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
