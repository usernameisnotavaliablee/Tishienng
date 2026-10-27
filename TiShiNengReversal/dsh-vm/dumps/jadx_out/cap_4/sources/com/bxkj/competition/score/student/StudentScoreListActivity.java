package com.bxkj.competition.score.student;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class StudentScoreListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.recyclerview.widget.RecyclerView F0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> H0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> I0;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener J0;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener K0;
    private java.lang.String Y;
    private com.bxkj.base.view.ObservableHorizontalScrollView Z;
    private android.widget.LinearLayout a0;
    private com.google.android.material.tabs.TabLayout b0;
    private androidx.recyclerview.widget.RecyclerView c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f652k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f653p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        private int a;
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity b;

        a(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView r2, android.view.MotionEvent r3) {
                r1 = this;
                int r0 = r2.getScrollState()
                if (r0 != 0) goto L9
                r1.onTouchEvent(r2, r3)
            L9:
                r2 = 0
                return r2
        }

        public void onRequestDisallowInterceptTouchEvent(boolean r1) {
                r0 = this;
                return
        }

        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView r2, android.view.MotionEvent r3) {
                r1 = this;
                int r0 = r3.getAction()
                if (r0 != 0) goto L22
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r1.b
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.competition.score.student.StudentScoreListActivity.j0(r0)
                int r0 = r0.getScrollState()
                if (r0 != 0) goto L22
                int r3 = r2.getScrollY()
                r1.a = r3
                com.bxkj.competition.score.student.StudentScoreListActivity r3 = r1.b
                androidx.recyclerview.widget.RecyclerView$OnScrollListener r3 = com.bxkj.competition.score.student.StudentScoreListActivity.l0(r3)
                r2.addOnScrollListener(r3)
                return
            L22:
                int r3 = r3.getAction()
                r0 = 1
                if (r3 != r0) goto L3a
                int r3 = r2.getScrollY()
                int r0 = r1.a
                if (r3 != r0) goto L3a
                com.bxkj.competition.score.student.StudentScoreListActivity r3 = r1.b
                androidx.recyclerview.widget.RecyclerView$OnScrollListener r3 = com.bxkj.competition.score.student.StudentScoreListActivity.l0(r3)
                r2.removeOnScrollListener(r3)
            L3a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        private int a;
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity b;

        b(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView r2, android.view.MotionEvent r3) {
                r1 = this;
                int r0 = r2.getScrollState()
                if (r0 != 0) goto L9
                r1.onTouchEvent(r2, r3)
            L9:
                r2 = 0
                return r2
        }

        public void onRequestDisallowInterceptTouchEvent(boolean r1) {
                r0 = this;
                return
        }

        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView r2, android.view.MotionEvent r3) {
                r1 = this;
                int r0 = r3.getAction()
                if (r0 != 0) goto L22
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r1.b
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.competition.score.student.StudentScoreListActivity.j0(r0)
                int r0 = r0.getScrollState()
                if (r0 != 0) goto L22
                int r3 = r2.getScrollY()
                r1.a = r3
                com.bxkj.competition.score.student.StudentScoreListActivity r3 = r1.b
                androidx.recyclerview.widget.RecyclerView$OnScrollListener r3 = com.bxkj.competition.score.student.StudentScoreListActivity.m0(r3)
                r2.addOnScrollListener(r3)
                return
            L22:
                int r3 = r3.getAction()
                r0 = 1
                if (r3 != r0) goto L3a
                int r3 = r2.getScrollY()
                int r0 = r1.a
                if (r3 != r0) goto L3a
                com.bxkj.competition.score.student.StudentScoreListActivity r3 = r1.b
                androidx.recyclerview.widget.RecyclerView$OnScrollListener r3 = com.bxkj.competition.score.student.StudentScoreListActivity.m0(r3)
                r2.removeOnScrollListener(r3)
            L3a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bxkj.base.view.ObservableHorizontalScrollView.a {
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity a;

        c(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.view.ObservableHorizontalScrollView.a
        public void a(com.bxkj.base.view.ObservableHorizontalScrollView r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r0.a
                androidx.recyclerview.widget.RecyclerView r1 = com.bxkj.competition.score.student.StudentScoreListActivity.j0(r1)
                com.bxkj.competition.score.student.StudentScoreListActivity r2 = r0.a
                androidx.recyclerview.widget.RecyclerView$OnScrollListener r2 = com.bxkj.competition.score.student.StudentScoreListActivity.l0(r2)
                r1.removeOnScrollListener(r2)
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r0.a
                androidx.recyclerview.widget.RecyclerView r1 = com.bxkj.competition.score.student.StudentScoreListActivity.j0(r1)
                com.bxkj.competition.score.student.StudentScoreListActivity r2 = r0.a
                androidx.recyclerview.widget.RecyclerView$OnScrollListener r2 = com.bxkj.competition.score.student.StudentScoreListActivity.m0(r2)
                r1.removeOnScrollListener(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity k;

        d(com.bxkj.competition.score.student.StudentScoreListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                int r0 = com.bxkj.competition.R.id.tv_score
                java.lang.String r1 = "name"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity k;

        e(com.bxkj.competition.score.student.StudentScoreListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                int r0 = r4.f()
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r3.k
                java.util.List r1 = com.bxkj.competition.score.student.StudentScoreListActivity.g0(r1)
                int r1 = r1.size()
                int r0 = r0 % r1
                int r1 = com.bxkj.competition.R.id.tv_score
                com.bxkj.competition.score.student.StudentScoreListActivity r2 = r3.k
                java.util.List r2 = com.bxkj.competition.score.student.StudentScoreListActivity.g0(r2)
                java.lang.Object r0 = r2.get(r0)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r2 = "key"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r4.J(r1, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends com.bxkj.base.util.UniversalItemDecoration {
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity g;

        f(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.util.UniversalItemDecoration
        public com.bxkj.base.util.UniversalItemDecoration.b a(int r3) {
                r2 = this;
                com.bxkj.base.util.UniversalItemDecoration$a r3 = new com.bxkj.base.util.UniversalItemDecoration$a
                r3.<init>()
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r2.g
                android.content.Context r0 = com.bxkj.competition.score.student.StudentScoreListActivity.h0(r0)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
                r3.d = r0
                int r0 = com.bxkj.competition.R.color.cardDivider
                r3.f = r0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends com.bxkj.base.util.UniversalItemDecoration {
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity g;

        g(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.util.UniversalItemDecoration
        public com.bxkj.base.util.UniversalItemDecoration.b a(int r3) {
                r2 = this;
                com.bxkj.base.util.UniversalItemDecoration$a r3 = new com.bxkj.base.util.UniversalItemDecoration$a
                r3.<init>()
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r2.g
                android.content.Context r0 = com.bxkj.competition.score.student.StudentScoreListActivity.n0(r0)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
                r3.d = r0
                r3.b = r0
                int r0 = com.bxkj.competition.R.color.cardDivider
                r3.f = r0
                return r3
        }

        public boolean c(int r1, int r2) {
                r0 = this;
                int r2 = r2 % r1
                if (r2 != 0) goto L5
                r1 = 1
                return r1
            L5:
                r1 = 0
                return r1
        }

        public boolean d(int r2, int r3) {
                r1 = this;
                int r3 = r3 % r2
                r0 = 1
                int r2 = r2 - r0
                if (r3 != r2) goto L6
                return r0
            L6:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity a;

        h(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.student.StudentScoreListActivity.o0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r6) {
                r5 = this;
                java.lang.String r0 = "data"
                int r6 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                r0 = 1
            L7:
                if (r0 > r6) goto L39
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r5.a
                com.google.android.material.tabs.TabLayout r1 = com.bxkj.competition.score.student.StudentScoreListActivity.p0(r1)
                com.bxkj.competition.score.student.StudentScoreListActivity r2 = r5.a
                com.google.android.material.tabs.TabLayout r2 = com.bxkj.competition.score.student.StudentScoreListActivity.p0(r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r2.newTab()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "第"
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "组"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.google.android.material.tabs.TabLayout$Tab r2 = r2.setText(r3)
                r1.addTab(r2)
                int r0 = r0 + 1
                goto L7
            L39:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity a;

        i(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        private void a() {
                r2 = this;
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.score.student.StudentScoreListActivity.r0(r0)
                r0.clear()
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.competition.score.student.StudentScoreListActivity.t0(r0)
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r2.a
                java.util.List r1 = com.bxkj.competition.score.student.StudentScoreListActivity.r0(r1)
                r0.g(r1)
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.score.student.StudentScoreListActivity.u0(r0)
                r0.clear()
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.competition.score.student.StudentScoreListActivity.v0(r0)
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r2.a
                java.util.List r1 = com.bxkj.competition.score.student.StudentScoreListActivity.u0(r1)
                r0.g(r1)
                return
        }

        public void netOnFailure(java.lang.Throwable r1) {
                r0 = this;
                super.netOnFailure(r1)
                r0.a()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                r1.a()
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.student.StudentScoreListActivity.q0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r7) {
                r6 = this;
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r6.a
                java.lang.String r1 = "data"
                java.util.List r7 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r1)
                com.bxkj.competition.score.student.StudentScoreListActivity.s0(r0, r7)
                com.bxkj.competition.score.student.StudentScoreListActivity r7 = r6.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r7 = com.bxkj.competition.score.student.StudentScoreListActivity.t0(r7)
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r6.a
                java.util.List r0 = com.bxkj.competition.score.student.StudentScoreListActivity.r0(r0)
                r7.g(r0)
                com.bxkj.competition.score.student.StudentScoreListActivity r7 = r6.a
                java.util.List r7 = com.bxkj.competition.score.student.StudentScoreListActivity.u0(r7)
                r7.clear()
                com.bxkj.competition.score.student.StudentScoreListActivity r7 = r6.a
                java.util.List r7 = com.bxkj.competition.score.student.StudentScoreListActivity.r0(r7)
                java.util.Iterator r7 = r7.iterator()
            L2d:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L6c
                java.lang.Object r0 = r7.next()
                java.util.Map r0 = (java.util.Map) r0
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r6.a
                java.util.List r1 = com.bxkj.competition.score.student.StudentScoreListActivity.g0(r1)
                java.util.Iterator r1 = r1.iterator()
            L43:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r1.next()
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "key"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
                java.util.HashMap r4 = new java.util.HashMap
                r5 = 2
                r4.<init>(r5)
                r4.put(r2, r3)
                com.bxkj.competition.score.student.StudentScoreListActivity r2 = r6.a
                java.util.List r2 = com.bxkj.competition.score.student.StudentScoreListActivity.u0(r2)
                r2.add(r4)
                goto L43
            L6c:
                com.bxkj.competition.score.student.StudentScoreListActivity r7 = r6.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r7 = com.bxkj.competition.score.student.StudentScoreListActivity.v0(r7)
                com.bxkj.competition.score.student.StudentScoreListActivity r0 = r6.a
                java.util.List r0 = com.bxkj.competition.score.student.StudentScoreListActivity.u0(r0)
                r7.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity a;

        j(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r0.a
                com.bxkj.competition.score.student.StudentScoreListActivity.i0(r1)
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class k extends com.bxkj.base.view.MyOnScrollListener {

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity f654t;

        k(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.f654t = r1
                r0.<init>()
                return
        }

        public void onScrolled(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                super.onScrolled(r1, r2, r3)
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r0.f654t
                androidx.recyclerview.widget.RecyclerView r1 = com.bxkj.competition.score.student.StudentScoreListActivity.j0(r1)
                r1.scrollBy(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class l extends com.bxkj.base.view.MyOnScrollListener {

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.bxkj.competition.score.student.StudentScoreListActivity f655t;

        l(com.bxkj.competition.score.student.StudentScoreListActivity r1) {
                r0 = this;
                r0.f655t = r1
                r0.<init>()
                return
        }

        public void onScrolled(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                super.onScrolled(r1, r2, r3)
                com.bxkj.competition.score.student.StudentScoreListActivity r1 = r0.f655t
                androidx.recyclerview.widget.RecyclerView r1 = com.bxkj.competition.score.student.StudentScoreListActivity.k0(r1)
                r1.scrollBy(r2, r3)
                return
        }
    }

    public StudentScoreListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f653p0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.H0 = r0
            com.bxkj.competition.score.student.StudentScoreListActivity$k r0 = new com.bxkj.competition.score.student.StudentScoreListActivity$k
            r0.<init>(r1)
            r1.J0 = r0
            com.bxkj.competition.score.student.StudentScoreListActivity$l r0 = new com.bxkj.competition.score.student.StudentScoreListActivity$l
            r0.<init>(r1)
            r1.K0 = r0
            return
    }

    private void A0() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.c0
            com.bxkj.competition.score.student.StudentScoreListActivity$a r1 = new com.bxkj.competition.score.student.StudentScoreListActivity$a
            r1.<init>(r2)
            r0.addOnItemTouchListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.F0
            com.bxkj.competition.score.student.StudentScoreListActivity$b r1 = new com.bxkj.competition.score.student.StudentScoreListActivity$b
            r1.<init>(r2)
            r0.addOnItemTouchListener(r1)
            com.bxkj.base.view.ObservableHorizontalScrollView r0 = r2.Z
            com.bxkj.competition.score.student.StudentScoreListActivity$c r1 = new com.bxkj.competition.score.student.StudentScoreListActivity$c
            r1.<init>(r2)
            r0.setScrollViewListener(r1)
            return
    }

    static /* synthetic */ java.util.List g0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.I0
            return r0
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ void i0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            r0.x0()
            return
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView j0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.F0
            return r0
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView k0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.c0
            return r0
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView.OnScrollListener l0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r0 = r0.J0
            return r0
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView.OnScrollListener m0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r0 = r0.K0
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ com.google.android.material.tabs.TabLayout p0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            com.google.android.material.tabs.TabLayout r0 = r0.b0
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ java.util.List r0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f653p0
            return r0
    }

    static /* synthetic */ java.util.List s0(com.bxkj.competition.score.student.StudentScoreListActivity r0, java.util.List r1) {
            r0.f653p0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter t0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f652k0
            return r0
    }

    static /* synthetic */ java.util.List u0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.H0
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter v0(com.bxkj.competition.score.student.StudentScoreListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.G0
            return r0
    }

    private void w0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r3.Y
            rx.e r1 = r1.k(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.student.StudentScoreListActivity$h r1 = new com.bxkj.competition.score.student.StudentScoreListActivity$h
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void x0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r4.Y
            com.google.android.material.tabs.TabLayout r3 = r4.b0
            int r3 = r3.getSelectedTabPosition()
            int r3 = r3 + 1
            rx.e r1 = r1.n(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.student.StudentScoreListActivity$i r1 = new com.bxkj.competition.score.student.StudentScoreListActivity$i
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void y0() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.c0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.competition.score.student.StudentScoreListActivity$d r0 = new com.bxkj.competition.score.student.StudentScoreListActivity$d
            android.content.Context r1 = r5.V
            int r2 = com.bxkj.competition.R.layout.item_score
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.f653p0
            r0.<init>(r5, r1, r2, r3)
            r5.f652k0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.c0
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.F0
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r3 = r5.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.I0
            int r4 = r4.size()
            r1.<init>(r3, r4)
            r0.setLayoutManager(r1)
            com.bxkj.competition.score.student.StudentScoreListActivity$e r0 = new com.bxkj.competition.score.student.StudentScoreListActivity$e
            android.content.Context r1 = r5.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.H0
            r0.<init>(r5, r1, r2, r3)
            r5.G0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.F0
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.c0
            com.bxkj.competition.score.student.StudentScoreListActivity$f r1 = new com.bxkj.competition.score.student.StudentScoreListActivity$f
            r1.<init>(r5)
            r0.addItemDecoration(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.F0
            com.bxkj.competition.score.student.StudentScoreListActivity$g r1 = new com.bxkj.competition.score.student.StudentScoreListActivity$g
            r1.<init>(r5)
            r0.addItemDecoration(r1)
            return
    }

    private void z0() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.I0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r2 = "道次"
            java.lang.String r3 = "name"
            r0.put(r3, r2)
            java.lang.String r2 = "passNum"
            java.lang.String r4 = "key"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.I0
            r2.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r2 = "号码簿"
            r0.put(r3, r2)
            java.lang.String r2 = "num"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.I0
            r2.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r2 = "单位"
            r0.put(r3, r2)
            java.lang.String r2 = "areaName"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.I0
            r2.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r2 = "检录"
            r0.put(r3, r2)
            java.lang.String r2 = "stateName"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.I0
            r2.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r2 = "起点"
            r0.put(r3, r2)
            java.lang.String r2 = "start"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.I0
            r2.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r2 = "检查"
            r0.put(r3, r2)
            java.lang.String r2 = "check"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.I0
            r2.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r2 = "名次"
            r0.put(r3, r2)
            java.lang.String r2 = "rank"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.I0
            r2.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r2 = "成绩"
            r0.put(r3, r2)
            java.lang.String r2 = "time"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.I0
            r2.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r1 = "备注"
            r0.put(r3, r1)
            java.lang.String r1 = "memo"
            r0.put(r4, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.I0
            r1.add(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.I0
            java.util.Iterator r1 = r1.iterator()
        Ld1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L106
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            android.content.Context r5 = r8.V
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r6 = com.bxkj.competition.R.layout.item_score
            r7 = 0
            android.view.View r5 = r5.inflate(r6, r7)
            int r6 = com.bxkj.competition.R.id.tv_score
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r6.setText(r7)
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            r6.setTag(r2)
            android.widget.LinearLayout r2 = r8.a0
            r2.addView(r5, r0)
            goto Ld1
        L106:
            return
    }

    public void L() {
            r2 = this;
            com.google.android.material.tabs.TabLayout r0 = r2.b0
            com.bxkj.competition.score.student.StudentScoreListActivity$j r1 = new com.bxkj.competition.score.student.StudentScoreListActivity$j
            r1.<init>(r2)
            r0.addOnTabSelectedListener(r1)
            r2.A0()
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_student_score_list
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "scheduleId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.Y = r0
        L16:
            r2.z0()
            r2.y0()
            r2.w0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "查看成绩"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.competition.R.id.tb_group
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.b0 = r1
            int r1 = com.bxkj.competition.R.id.ll_top
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.a0 = r1
            int r1 = com.bxkj.competition.R.id.rv_student
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.c0 = r1
            int r1 = com.bxkj.competition.R.id.rv_score
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.F0 = r1
            int r1 = com.bxkj.competition.R.id.sv_room
            android.view.View r1 = r0.findViewById(r1)
            com.bxkj.base.view.ObservableHorizontalScrollView r1 = (com.bxkj.base.view.ObservableHorizontalScrollView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
