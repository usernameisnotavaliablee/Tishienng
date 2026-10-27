package com.bxkj.student.home.teaching.learning;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LearnHomeListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.ProgressBar F0;
    private android.widget.TextView G0;
    private android.widget.Button H0;
    private android.widget.Button I0;
    private android.widget.ImageView J0;
    private java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> K0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> L0;
    private int M0;
    private int N0;
    private int O0;
    private com.bxkj.student.home.teaching.learning.LearnHomeListAdapter P0;
    private final int Q0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.LinearLayout a0;
    private androidx.cardview.widget.CardView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f858k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f859p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.LearnHomeListActivity a;

        a(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r0 = this;
                super.netOnFinish()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r3.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                java.lang.String r0 = "data"
                java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0)
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto L27
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r3.a
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.y0(r0, r4)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r4 = r3.a
                android.widget.ImageView r4 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.o0(r4)
                r0 = 8
                r4.setVisibility(r0)
                return
            L27:
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r4 = r3.a
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.z0(r4, r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r4 = r3.a
                android.widget.ImageView r4 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.o0(r4)
                r4.setVisibility(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.LearnHomeListActivity a;

        b(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.learning.LearnHomeListActivity.b r0) {
                r0.c()
                return
        }

        public static /* synthetic */ void b(com.bxkj.student.home.teaching.learning.LearnHomeListActivity.b r0) {
                r0.d()
                return
        }

        private /* synthetic */ void c() {
                r4 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.D0(r2)
                java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyLearnActivity> r3 = com.bxkj.student.home.teaching.learning.my.MyLearnActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }

        private /* synthetic */ void d() {
                r4 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.C0(r2)
                java.lang.Class<com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity> r3 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "data"
                int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r0)
                if (r3 <= 0) goto L43
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.a
                com.bxkj.student.home.teaching.learning.h r0 = new com.bxkj.student.home.teaching.learning.h
                r0.<init>(r2)
                r1 = 2131689956(0x7f0f01e4, float:1.9008942E38)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.A0(r3, r1, r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.a
                r3.invalidateOptionsMenu()
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.B0(r0)
                r3.<init>(r0)
                java.lang.String r0 = "您有教师批改后不合格题目，请到个人学习中心处理"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)
                java.lang.String r0 = "稍后再说"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setLeftButtonText(r0)
                java.lang.String r0 = "现在处理"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonText(r0)
                com.bxkj.student.home.teaching.learning.i r0 = new com.bxkj.student.home.teaching.learning.i
                r0.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonOnClickListener(r0)
                r3.show()
            L43:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.LearnHomeListActivity a;

        c(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.learning.LearnHomeListActivity.c r0) {
                r0.c()
                return
        }

        public static /* synthetic */ void b(com.bxkj.student.home.teaching.learning.LearnHomeListActivity.c r0) {
                r0.d()
                return
        }

        private /* synthetic */ void c() {
                r4 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.H0(r2)
                java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyLearnActivity> r3 = com.bxkj.student.home.teaching.learning.my.MyLearnActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }

        private /* synthetic */ void d() {
                r4 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.G0(r2)
                java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyLearnActivity> r3 = com.bxkj.student.home.teaching.learning.my.MyLearnActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "data"
                int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r0)
                if (r3 <= 0) goto L16
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.a
                com.bxkj.student.home.teaching.learning.j r0 = new com.bxkj.student.home.teaching.learning.j
                r0.<init>(r2)
                r1 = 2131689956(0x7f0f01e4, float:1.9008942E38)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.E0(r3, r1, r0)
                goto L23
            L16:
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.a
                com.bxkj.student.home.teaching.learning.k r0 = new com.bxkj.student.home.teaching.learning.k
                r0.<init>(r2)
                r1 = 2131689955(0x7f0f01e3, float:1.900894E38)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.F0(r3, r1, r0)
            L23:
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.a
                r3.invalidateOptionsMenu()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.LearnHomeListActivity b;

        d(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r2.b
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                java.lang.String r0 = "data"
                java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L23
                java.lang.String r0 = "id"
                java.lang.String r1 = r2.a
                r3.put(r0, r1)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r2.b
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.y0(r0, r3)
                return
            L23:
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.b
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.z0(r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.LearnHomeListActivity a;

        e(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "data"
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r0)
                r0 = 1
                if (r2 != r0) goto L14
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.m0(r2)
                java.lang.String r0 = "已完成本章节学习"
                r2.setText(r0)
            L14:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.google.android.material.tabs.TabLayout a;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.LearnHomeListActivity b;

        f(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1, com.google.android.material.tabs.TabLayout r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.b
                androidx.cardview.widget.CardView r3 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.n0(r3)
                r0 = 8
                r3.setVisibility(r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.b
                java.util.List r3 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.l0(r3)
                r3.clear()
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.b
                com.bxkj.student.home.teaching.learning.LearnHomeListAdapter r3 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.p0(r3)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r2.b
                java.util.List r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.l0(r0)
                r3.g(r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r3 = r2.b
                android.widget.LinearLayout r3 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.q0(r3)
                com.google.android.material.tabs.TabLayout r0 = r2.a
                int r3 = r3.indexOfChild(r0)
            L2f:
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r2.b
                java.util.List r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.r0(r0)
                int r0 = r0.size()
                int r1 = r3 + 1
                if (r0 <= r1) goto L5c
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r2.b
                java.util.List r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.r0(r0)
                int r0 = r0.size()
                int r0 = r0 + (-1)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1 = r2.b
                java.util.List r1 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.r0(r1)
                r1.remove(r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1 = r2.b
                android.widget.LinearLayout r1 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.q0(r1)
                r1.removeViewAt(r0)
                goto L2f
            L5c:
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r2.b
                java.util.List r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.r0(r0)
                java.lang.Object r3 = r0.get(r3)
                java.util.List r3 = (java.util.List) r3
                com.google.android.material.tabs.TabLayout r0 = r2.a
                int r0 = r0.getSelectedTabPosition()
                java.lang.Object r3 = r3.get(r0)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "id"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r2.b
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.x0(r0, r3)
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.LearnHomeListActivity a;

        g(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r4 = r3.a
                int r4 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.v0(r4)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.t0(r0)
                int r4 = r4 / r0
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.s0(r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r1 = r3.a
                int r1 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.v0(r1)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r2 = r3.a
                int r2 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.t0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.u0(r4)
                r4.q0()
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r4 = r3.a
                int r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.s0(r4)
                int r0 = r0 + 1
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.w0(r4, r0)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity.w0(r2, r0)
                return
        }
    }

    public LearnHomeListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.K0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.L0 = r0
            r0 = 10
            r1.M0 = r0
            r0 = 1
            r1.N0 = r0
            r0 = 0
            r1.O0 = r0
            r0 = 170(0xaa, float:2.38E-43)
            r1.Q0 = r0
            return
    }

    static /* synthetic */ cn.bluemobi.dylan.base.BaseActivity A0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, int r1, cn.bluemobi.dylan.base.BaseActivity.c r2) {
            cn.bluemobi.dylan.base.BaseActivity r0 = r0.Z(r1, r2)
            return r0
    }

    static /* synthetic */ android.content.Context B0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context C0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context D0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.BaseActivity E0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, int r1, cn.bluemobi.dylan.base.BaseActivity.c r2) {
            cn.bluemobi.dylan.base.BaseActivity r0 = r0.Z(r1, r2)
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.BaseActivity F0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, int r1, cn.bluemobi.dylan.base.BaseActivity.c r2) {
            cn.bluemobi.dylan.base.BaseActivity r0 = r0.Z(r1, r2)
            return r0
    }

    static /* synthetic */ android.content.Context G0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context H0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void I0() {
            r3 = this;
            r0 = 0
        L1:
            android.widget.LinearLayout r1 = r3.a0
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L1c
            android.widget.LinearLayout r1 = r3.a0
            android.view.View r1 = r1.getChildAt(r0)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            com.bxkj.student.home.teaching.learning.LearnHomeListActivity$f r2 = new com.bxkj.student.home.teaching.learning.LearnHomeListActivity$f
            r2.<init>(r3, r1)
            r1.setOnTabSelectedListener(r2)
            int r0 = r0 + 1
            goto L1
        L1c:
            return
    }

    private void J0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            rx.e r1 = r1.f()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.LearnHomeListActivity$a r1 = new com.bxkj.student.home.teaching.learning.LearnHomeListActivity$a
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void K0(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            rx.e r1 = r1.m(r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.LearnHomeListActivity$d r1 = new com.bxkj.student.home.teaching.learning.LearnHomeListActivity$d
            r1.<init>(r2, r3)
            r0.setDataListener(r1)
            return
    }

    private void L0() {
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
            com.bxkj.student.home.teaching.learning.LearnHomeListActivity$b r1 = new com.bxkj.student.home.teaching.learning.LearnHomeListActivity$b
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void M0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.home.teaching.learning.LearnHomeListActivity$g r1 = new com.bxkj.student.home.teaching.learning.LearnHomeListActivity$g
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private /* synthetic */ void N0(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            r0.I0()
            return
    }

    private /* synthetic */ void O0(android.view.View r4) {
            r3 = this;
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r4 = r3.K0
            if (r4 == 0) goto L2d
            int r4 = r4.size()
            if (r4 != 0) goto Lb
            goto L2d
        Lb:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r0 = r3.K0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r4.<init>(r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.LearningCategoryActivity> r2 = com.bxkj.student.home.teaching.learning.LearningCategoryActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "list"
            android.content.Intent r4 = r0.putExtra(r1, r4)
            r0 = 170(0xaa, float:2.38E-43)
            r3.startActivityForResult(r4, r0)
        L2d:
            return
    }

    private /* synthetic */ void P0(android.view.View r3) {
            r2 = this;
            android.widget.Button r3 = r2.I0
            java.lang.Object r3 = r3.getTag()
            java.lang.String r3 = r3.toString()
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            rx.e r3 = r1.r(r3)
            cn.bluemobi.dylan.http.HttpRequest r3 = r0.setObservable(r3)
            com.bxkj.student.home.teaching.learning.LearnHomeListActivity$e r0 = new com.bxkj.student.home.teaching.learning.LearnHomeListActivity$e
            r0.<init>(r2)
            r3.setDataListener(r0)
            return
    }

    private /* synthetic */ void Q0(android.view.View r4) {
            r3 = this;
            android.widget.Button r4 = r3.H0
            java.lang.Object r4 = r4.getTag()
            java.lang.String r4 = r4.toString()
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity> r2 = com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "type"
            r2 = 2
            android.content.Intent r0 = r0.putExtra(r1, r2)
            java.lang.String r1 = "resourceId"
            android.content.Intent r4 = r0.putExtra(r1, r4)
            r3.startActivity(r4)
            return
    }

    private /* synthetic */ void R0() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.my.MyLearnActivity> r2 = com.bxkj.student.home.teaching.learning.my.MyLearnActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    private void T0(java.util.Map<java.lang.String, java.lang.Object> r7) {
            r6 = this;
            java.lang.String r0 = "articles"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r0)
            r6.L0 = r0
            boolean r0 = r0.isEmpty()
            r1 = 8
            if (r0 != 0) goto L101
            androidx.cardview.widget.CardView r0 = r6.b0
            r2 = 0
            r0.setVisibility(r2)
            com.bxkj.student.home.teaching.learning.LearnHomeListAdapter r0 = r6.P0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.L0
            r0.g(r3)
            android.widget.TextView r0 = r6.c0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "当前章节积分："
            r3.append(r4)
            java.lang.String r4 = "leafTotalScore"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.setText(r3)
            android.widget.TextView r0 = r6.f858k0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "总积分："
            r3.append(r4)
            java.lang.String r4 = "sumIntegral"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.setText(r3)
            android.widget.TextView r0 = r6.f859p0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "目标积分："
            r3.append(r4)
            java.lang.String r4 = "desIntegral"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.setText(r3)
            java.lang.String r0 = "completedAmount"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
            java.lang.String r3 = "totalAmount"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r3)
            android.widget.ProgressBar r4 = r6.F0
            r4.setMax(r3)
            android.widget.ProgressBar r4 = r6.F0
            r4.setProgress(r0)
            android.widget.TextView r4 = r6.G0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "/"
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            r4.setText(r0)
            java.lang.String r0 = "hasQuestion"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
            java.lang.String r3 = "id"
            r4 = 1
            if (r0 != r4) goto Lba
            android.widget.Button r0 = r6.H0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.H0
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
            r0.setTag(r5)
            goto Lbf
        Lba:
            android.widget.Button r0 = r6.H0
            r0.setVisibility(r1)
        Lbf:
            java.lang.String r0 = "showButton"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
            if (r0 != r4) goto Lfb
            android.widget.Button r0 = r6.I0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.I0
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
            r0.setTag(r1)
            java.lang.String r0 = "competedType"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
            if (r0 != r4) goto Le5
            android.widget.Button r7 = r6.I0
            java.lang.String r0 = "已完成本章节学习"
            r7.setText(r0)
            return
        Le5:
            android.widget.Button r0 = r6.I0
            java.lang.String r1 = "结束本章节学习"
            r0.setText(r1)
            android.widget.Button r0 = r6.I0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.I0
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
            r0.setTag(r7)
            return
        Lfb:
            android.widget.Button r7 = r6.I0
            r7.setVisibility(r1)
            return
        L101:
            androidx.cardview.widget.CardView r7 = r6.b0
            r7.setVisibility(r1)
            return
    }

    private void U0(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r6) {
            r5 = this;
            if (r6 == 0) goto L69
            int r0 = r6.size()
            if (r0 != 0) goto L9
            goto L69
        L9:
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r1 = r5.K0
            r1.add(r6)
            android.content.Context r1 = r5.V
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131493277(0x7f0c019d, float:1.861003E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            java.util.Iterator r6 = r6.iterator()
        L29:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r6.next()
            java.util.Map r2 = (java.util.Map) r2
            com.google.android.material.tabs.TabLayout$Tab r3 = r1.newTab()
            java.lang.String r4 = "typeName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            com.google.android.material.tabs.TabLayout$Tab r2 = r3.setText(r2)
            r1.addTab(r2)
            goto L29
        L47:
            android.widget.LinearLayout r6 = r5.a0
            r6.addView(r1)
            java.lang.String r6 = "isLeaf"
            int r6 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r6)
            java.lang.String r1 = "childNode"
            java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r1)
            if (r6 != 0) goto L66
            if (r1 == 0) goto L66
            int r6 = r1.size()
            if (r6 <= 0) goto L66
            r5.U0(r1)
            return
        L66:
            r5.T0(r0)
        L69:
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, android.view.View r1) {
            r0.P0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, android.view.View r1) {
            r0.O0(r1)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            r0.R0()
            return
    }

    public static /* synthetic */ void j0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.N0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* synthetic */ void k0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, android.view.View r1) {
            r0.Q0(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button m0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            android.widget.Button r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.cardview.widget.CardView n0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            androidx.cardview.widget.CardView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView o0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            android.widget.ImageView r0 = r0.J0
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.learning.LearnHomeListAdapter p0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            com.bxkj.student.home.teaching.learning.LearnHomeListAdapter r0 = r0.P0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.LinearLayout q0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            android.widget.LinearLayout r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List r0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r0 = r0.K0
            return r0
    }

    static /* bridge */ /* synthetic */ int s0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            int r0 = r0.N0
            return r0
    }

    static /* bridge */ /* synthetic */ int t0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            int r0 = r0.M0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout u0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int v0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0) {
            int r0 = r0.O0
            return r0
    }

    static /* bridge */ /* synthetic */ void w0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, int r1) {
            r0.N0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void x0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, java.lang.String r1) {
            r0.K0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void y0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, java.util.Map r1) {
            r0.T0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void z0(com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0, java.util.List r1) {
            r0.U0(r1)
            return
    }

    public void L() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.a0
            com.bxkj.student.home.teaching.learning.c r1 = new com.bxkj.student.home.teaching.learning.c
            r1.<init>(r2)
            r0.addOnLayoutChangeListener(r1)
            android.widget.ImageView r0 = r2.J0
            com.bxkj.student.home.teaching.learning.d r1 = new com.bxkj.student.home.teaching.learning.d
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r2.I0
            com.bxkj.student.home.teaching.learning.e r1 = new com.bxkj.student.home.teaching.learning.e
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r2.H0
            com.bxkj.student.home.teaching.learning.f r1 = new com.bxkj.student.home.teaching.learning.f
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492964(0x7f0c0064, float:1.8609395E38)
            return r0
    }

    public void R() {
            r3 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r3.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.learning.LearnHomeListAdapter r0 = new com.bxkj.student.home.teaching.learning.LearnHomeListAdapter
            android.content.Context r1 = r3.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r3.L0
            r0.<init>(r1, r2)
            r3.P0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r3.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r3.findViewById(r1)
            r0.setEmptyView(r1)
            android.widget.FrameLayout r0 = r3.P()
            r1 = 8
            r0.setVisibility(r1)
            r3.J0()
            r3.L0()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "在线学习"
            r2.setTitle(r0)
            com.bxkj.student.home.teaching.learning.g r0 = new com.bxkj.student.home.teaching.learning.g
            r0.<init>(r2)
            r1 = 2131689955(0x7f0f01e3, float:1.900894E38)
            r2.Z(r1, r0)
            r2.invalidateOptionsMenu()
            return
    }

    public void S0() {
            r3 = this;
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r0 = r3.K0
            if (r0 == 0) goto L47
            int r0 = r0.size()
            if (r0 <= 0) goto L47
            android.widget.LinearLayout r0 = r3.a0
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L47
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r0 = r3.K0
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r1 = r3.K0
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            android.widget.LinearLayout r2 = r3.a0
            android.view.View r0 = r2.getChildAt(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            if (r1 == 0) goto L47
            int r2 = r1.size()
            if (r2 <= 0) goto L47
            if (r0 == 0) goto L47
            int r0 = r0.getSelectedTabPosition()
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "id"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            r3.K0(r0)
        L47:
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298052(0x7f090704, float:1.8214066E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.a0 = r1
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            r1 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            r1 = 2131296693(0x7f0901b5, float:1.821131E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            r0.b0 = r1
            r1 = 2131298857(0x7f090a29, float:1.82157E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131299169(0x7f090b61, float:1.8216332E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f858k0 = r1
            r1 = 2131299150(0x7f090b4e, float:1.8216293E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f859p0 = r1
            r1 = 2131298306(0x7f090802, float:1.8214581E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.F0 = r1
            r1 = 2131299051(0x7f090aeb, float:1.8216092E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.G0 = r1
            r1 = 2131296633(0x7f090179, float:1.8211188E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.H0 = r1
            r1 = 2131296611(0x7f090163, float:1.8211144E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.I0 = r1
            r1 = 2131297187(0x7f0903a3, float:1.8212312E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.J0 = r1
            return
    }

    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            if (r4 != 0) goto L6
            goto L24
        L6:
            r0 = -1
            if (r3 == r0) goto La
            goto L24
        La:
            r3 = 170(0xaa, float:2.38E-43)
            if (r2 != r3) goto L24
            java.lang.String r2 = "index"
            r3 = 0
            int r2 = r4.getIntExtra(r2, r3)
            android.widget.LinearLayout r4 = r1.a0
            android.view.View r3 = r4.getChildAt(r3)
            com.google.android.material.tabs.TabLayout r3 = (com.google.android.material.tabs.TabLayout) r3
            com.google.android.material.tabs.TabLayout$Tab r2 = r3.getTabAt(r2)
            r2.select()
        L24:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onRestart() {
            r2 = this;
            super/*android.app.Activity*/.onRestart()
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
            com.bxkj.student.home.teaching.learning.LearnHomeListActivity$c r1 = new com.bxkj.student.home.teaching.learning.LearnHomeListActivity$c
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }
}
