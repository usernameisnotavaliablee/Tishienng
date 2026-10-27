package com.bxkj.student.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CircleFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout j;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f1073l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f1074m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.android.material.tabs.TabLayout f1075n;

    /* renamed from: o, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1076o;

    /* renamed from: p, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1077p;

    /* renamed from: q, reason: collision with root package name */
    private int f1078q;

    /* renamed from: r, reason: collision with root package name */
    private int f1079r;

    /* renamed from: s, reason: collision with root package name */
    private int f1080s;

    /* renamed from: t, reason: collision with root package name */
    private java.lang.String f1081t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.main.CircleFragment k;

        a(com.bxkj.student.main.CircleFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r1 = "姓名："
                r0.append(r1)
                java.lang.String r1 = "sysStudentName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "课程："
                r0.append(r1)
                java.lang.String r1 = "teacherCurriculumName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298954(0x7f090a8a, float:1.8215896E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "教师："
                r0.append(r1)
                java.lang.String r1 = "sysTeacherName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299151(0x7f090b4f, float:1.8216295E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "票数："
                r0.append(r1)
                java.lang.String r1 = "votesTotalNumber"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298996(0x7f090ab4, float:1.821598E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "排名："
                r0.append(r1)
                java.lang.String r1 = "rank"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299062(0x7f090af6, float:1.8216115E38)
                r3.J(r1, r0)
                java.lang.String r0 = "sysStudentImage"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131689689(0x7f0f00d9, float:1.90084E38)
                r1 = 2131297148(0x7f09037c, float:1.8212233E38)
                r3.t(r1, r4, r0, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.CircleFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
            final /* synthetic */ com.bxkj.student.main.CircleFragment.b a;

            a(com.bxkj.student.main.CircleFragment.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                    r0 = this;
                    return
            }

            public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r3) {
                    r2 = this;
                    com.bxkj.student.main.CircleFragment$b r0 = r2.a
                    com.bxkj.student.main.CircleFragment r0 = r0.a
                    r1 = 1
                    com.bxkj.student.main.CircleFragment.Y(r0, r1)
                    com.bxkj.student.main.CircleFragment$b r0 = r2.a
                    com.bxkj.student.main.CircleFragment r0 = r0.a
                    java.lang.CharSequence r3 = r3.getText()
                    java.lang.String r3 = r3.toString()
                    com.bxkj.student.main.CircleFragment.X(r0, r3)
                    com.bxkj.student.main.CircleFragment$b r3 = r2.a
                    com.bxkj.student.main.CircleFragment r3 = r3.a
                    com.bxkj.student.main.CircleFragment.a0(r3)
                    return
            }

            public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                    r0 = this;
                    return
            }
        }

        b(com.bxkj.student.main.CircleFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.main.CircleFragment r0 = r3.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.main.CircleFragment.U(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.main.CircleFragment r0 = r3.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.main.CircleFragment.U(r0)
                com.bxkj.student.main.CircleFragment$b$a r1 = new com.bxkj.student.main.CircleFragment$b$a
                r1.<init>(r3)
                r0.setOnTabSelectedListener(r1)
                java.lang.String r0 = "data"
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0, r1)
                com.bxkj.student.main.CircleFragment r0 = r3.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.main.CircleFragment.U(r0)
                r0.removeAllTabs()
                java.util.Iterator r4 = r4.iterator()
            L2d:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L51
                java.lang.Object r0 = r4.next()
                java.lang.String r0 = (java.lang.String) r0
                com.bxkj.student.main.CircleFragment r1 = r3.a
                com.google.android.material.tabs.TabLayout r1 = com.bxkj.student.main.CircleFragment.U(r1)
                com.bxkj.student.main.CircleFragment r2 = r3.a
                com.google.android.material.tabs.TabLayout r2 = com.bxkj.student.main.CircleFragment.U(r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r2.newTab()
                com.google.android.material.tabs.TabLayout$Tab r0 = r2.setText(r0)
                r1.addTab(r0)
                goto L2d
            L51:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.main.CircleFragment a;

        c(com.bxkj.student.main.CircleFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.main.CircleFragment r4 = r3.a
                int r4 = com.bxkj.student.main.CircleFragment.V(r4)
                com.bxkj.student.main.CircleFragment r0 = r3.a
                int r0 = com.bxkj.student.main.CircleFragment.S(r0)
                int r4 = r4 / r0
                com.bxkj.student.main.CircleFragment r0 = r3.a
                int r0 = com.bxkj.student.main.CircleFragment.R(r0)
                com.bxkj.student.main.CircleFragment r1 = r3.a
                int r1 = com.bxkj.student.main.CircleFragment.V(r1)
                com.bxkj.student.main.CircleFragment r2 = r3.a
                int r2 = com.bxkj.student.main.CircleFragment.S(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L41
                com.bxkj.student.main.CircleFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.main.CircleFragment.T(r4)
                r4.q0()
                com.bxkj.student.main.CircleFragment r4 = r3.a
                android.content.Context r4 = com.bxkj.student.main.CircleFragment.b0(r4)
                java.lang.String r0 = "没有了"
                r1 = 0
                android.widget.Toast r4 = android.widget.Toast.makeText(r4, r0, r1)
                r4.show()
                return
            L41:
                com.bxkj.student.main.CircleFragment r4 = r3.a
                int r0 = com.bxkj.student.main.CircleFragment.R(r4)
                int r0 = r0 + 1
                com.bxkj.student.main.CircleFragment.Y(r4, r0)
                com.bxkj.student.main.CircleFragment r4 = r3.a
                com.bxkj.student.main.CircleFragment.a0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.main.CircleFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.main.CircleFragment.Y(r2, r0)
                com.bxkj.student.main.CircleFragment r2 = r1.a
                com.bxkj.student.main.CircleFragment.a0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.CircleFragment a;

        d(com.bxkj.student.main.CircleFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.main.CircleFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.CircleFragment.T(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.main.CircleFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.CircleFragment.T(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.main.CircleFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.CircleFragment.T(r0)
                r0.w0()
            L20:
                com.bxkj.student.main.CircleFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.CircleFragment.T(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.main.CircleFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.CircleFragment.T(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.main.CircleFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.CircleFragment.T(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.main.CircleFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.main.CircleFragment.Z(r0, r1)
                com.bxkj.student.main.CircleFragment r0 = r2.a
                int r0 = com.bxkj.student.main.CircleFragment.V(r0)
                if (r0 <= 0) goto L1d
                com.bxkj.student.main.CircleFragment r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.main.CircleFragment.W(r0)
                r1 = 0
                r0.setVisibility(r1)
            L1d:
                com.bxkj.student.main.CircleFragment r0 = r2.a
                int r0 = com.bxkj.student.main.CircleFragment.R(r0)
                r1 = 1
                if (r0 != r1) goto L2f
                com.bxkj.student.main.CircleFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.main.CircleFragment.Q(r0)
                r0.clear()
            L2f:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.main.CircleFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.main.CircleFragment.Q(r0)
                r0.addAll(r3)
                com.bxkj.student.main.CircleFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.main.CircleFragment.P(r3)
                r3.notifyDataSetChanged()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
                r0 = this;
                super.netOnSuccess(r1, r2)
                boolean r1 = android.text.TextUtils.isEmpty(r2)
                if (r1 != 0) goto L1c
                java.lang.String r1 = "null"
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L12
                goto L1c
            L12:
                com.bxkj.student.main.CircleFragment r1 = r0.a
                android.widget.TextView r1 = com.bxkj.student.main.CircleFragment.W(r1)
                r1.setText(r2)
                return
            L1c:
                com.bxkj.student.main.CircleFragment r1 = r0.a
                android.widget.TextView r1 = com.bxkj.student.main.CircleFragment.W(r1)
                r2 = 8
                r1.setVisibility(r2)
                return
        }
    }

    public CircleFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1077p = r0
            r0 = 10
            r1.f1078q = r0
            r0 = 1
            r1.f1079r = r0
            r0 = 0
            r1.f1080s = r0
            return
    }

    public static /* synthetic */ void N(com.bxkj.student.main.CircleFragment r0, boolean r1) {
            r0.g0(r1)
            return
    }

    public static /* synthetic */ void O(com.bxkj.student.main.CircleFragment r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.f0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter P(com.bxkj.student.main.CircleFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1076o
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List Q(com.bxkj.student.main.CircleFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1077p
            return r0
    }

    static /* bridge */ /* synthetic */ int R(com.bxkj.student.main.CircleFragment r0) {
            int r0 = r0.f1079r
            return r0
    }

    static /* bridge */ /* synthetic */ int S(com.bxkj.student.main.CircleFragment r0) {
            int r0 = r0.f1078q
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout T(com.bxkj.student.main.CircleFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.material.tabs.TabLayout U(com.bxkj.student.main.CircleFragment r0) {
            com.google.android.material.tabs.TabLayout r0 = r0.f1075n
            return r0
    }

    static /* bridge */ /* synthetic */ int V(com.bxkj.student.main.CircleFragment r0) {
            int r0 = r0.f1080s
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView W(com.bxkj.student.main.CircleFragment r0) {
            android.widget.TextView r0 = r0.f1074m
            return r0
    }

    static /* bridge */ /* synthetic */ void X(com.bxkj.student.main.CircleFragment r0, java.lang.String r1) {
            r0.f1081t = r1
            return
    }

    static /* bridge */ /* synthetic */ void Y(com.bxkj.student.main.CircleFragment r0, int r1) {
            r0.f1079r = r1
            return
    }

    static /* bridge */ /* synthetic */ void Z(com.bxkj.student.main.CircleFragment r0, int r1) {
            r0.f1080s = r1
            return
    }

    static /* bridge */ /* synthetic */ void a0(com.bxkj.student.main.CircleFragment r0) {
            r0.c0()
            return
    }

    static /* synthetic */ android.content.Context b0(com.bxkj.student.main.CircleFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void c0() {
            r5 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L29
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.j
            if (r0 == 0) goto L19
            boolean r0 = r0.w()
            if (r0 == 0) goto L19
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.j
            r0.w0()
        L19:
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.j
            if (r0 == 0) goto L28
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L28
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.j
            r0.q0()
        L28:
            return
        L29:
            android.content.Context r0 = r5.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            int r2 = r5.f1079r
            int r3 = r5.f1078q
            java.lang.String r4 = r5.f1081t
            rx.e r1 = r1.r1(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.CircleFragment$d r1 = new com.bxkj.student.main.CircleFragment$d
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private void d0() {
            r2 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            com.bxkj.student.main.b r1 = new com.bxkj.student.main.b
            r1.<init>(r2)
            r0.addLoginListener(r1)
            return
    }

    private /* synthetic */ void f0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r0.g
            java.lang.Class<com.bxkj.student.circle.CircleDetailActivity> r3 = com.bxkj.student.circle.CircleDetailActivity.class
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.f1076o
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.lang.String r3 = "learnSelectionWorkId"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r0.startActivity(r1)
            return
    }

    private /* synthetic */ void g0(boolean r1) {
            r0 = this;
            r0.h0(r1)
            return
    }

    private void h0(boolean r3) {
            r2 = this;
            r0 = 8
            if (r3 == 0) goto L4f
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getSchoolId()
            java.lang.String r1 = "79"
            boolean r3 = r1.equalsIgnoreCase(r3)
            if (r3 != 0) goto L30
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getSchoolId()
            java.lang.String r1 = "130"
            boolean r3 = r1.equalsIgnoreCase(r3)
            if (r3 == 0) goto L25
            goto L30
        L25:
            com.google.android.material.tabs.TabLayout r3 = r2.f1075n
            r3.setVisibility(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.j
            r3.D()
            return
        L30:
            android.content.Context r3 = r2.g
            cn.bluemobi.dylan.http.HttpRequest r3 = cn.bluemobi.dylan.http.Http.with(r3)
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            d0.a r0 = (d0.a) r0
            rx.e r0 = r0.x0()
            cn.bluemobi.dylan.http.HttpRequest r3 = r3.setObservable(r0)
            com.bxkj.student.main.CircleFragment$b r0 = new com.bxkj.student.main.CircleFragment$b
            r0.<init>(r2)
            r3.setDataListener(r0)
            return
        L4f:
            android.widget.TextView r3 = r2.f1074m
            r3.setVisibility(r0)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r2.f1077p
            r3.clear()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r3 = r2.f1076o
            r3.notifyDataSetChanged()
            return
    }

    public void b() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1076o
            com.bxkj.student.main.a r1 = new com.bxkj.student.main.a
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected void e() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.k
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.g
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.main.CircleFragment$a r0 = new com.bxkj.student.main.CircleFragment$a
            android.content.Context r1 = r4.g
            r2 = 2131493237(0x7f0c0175, float:1.8609948E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1077p
            r0.<init>(r4, r1, r2, r3)
            r4.f1076o = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.k
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.k
            android.widget.TextView r1 = r4.f1073l
            r0.setEmptyView(r1)
            r4.e0()
            r4.d0()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            r4.h0(r0)
            return
    }

    public void e0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.j
            com.bxkj.student.main.CircleFragment$c r1 = new com.bxkj.student.main.CircleFragment$c
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.c(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.j = r1
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.c(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.k = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1073l = r1
            r1 = 2131298879(0x7f090a3f, float:1.8215744E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1074m = r1
            r1 = 2131298643(0x7f090953, float:1.8215265E38)
            android.view.View r1 = r0.c(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.f1075n = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493181(0x7f0c013d, float:1.8609835E38)
            return r0
    }

    public void i0() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.j
            r0.D()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
