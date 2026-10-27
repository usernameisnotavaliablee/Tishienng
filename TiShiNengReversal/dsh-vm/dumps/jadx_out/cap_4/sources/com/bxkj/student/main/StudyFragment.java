package com.bxkj.student.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class StudyFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private androidx.recyclerview.widget.RecyclerView j;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> k;

    /* renamed from: l, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1111l;

    /* renamed from: m, reason: collision with root package name */
    private com.scwang.smartrefresh.layout.SmartRefreshLayout f1112m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f1113n;

    /* renamed from: o, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1114o;

    /* renamed from: p, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1115p;

    /* renamed from: q, reason: collision with root package name */
    private int f1116q;

    /* renamed from: r, reason: collision with root package name */
    private int f1117r;

    /* renamed from: s, reason: collision with root package name */
    private int f1118s;

    /* renamed from: t, reason: collision with root package name */
    private int f1119t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.main.StudyFragment k;

        a(com.bxkj.student.main.StudyFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "name"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                java.lang.String r2 = "推荐"
                boolean r1 = r1.equals(r2)
                r2 = 2131297264(0x7f0903f0, float:1.8212468E38)
                r4.N(r2, r1)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r4.J(r1, r5)
                int r5 = r4.f()
                com.bxkj.student.main.StudyFragment r0 = r3.k
                int r0 = com.bxkj.student.main.StudyFragment.N(r0)
                if (r5 != r0) goto L36
                com.bxkj.student.main.StudyFragment r5 = r3.k
                android.content.res.Resources r5 = r5.getResources()
                r0 = 2131231950(0x7f0804ce, float:1.8079995E38)
                android.graphics.drawable.Drawable r5 = r5.getDrawable(r0)
                goto L37
            L36:
                r5 = 0
            L37:
                r0 = 2131297091(0x7f090343, float:1.8212117E38)
                r4.q(r0, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.main.StudyFragment k;

        b(com.bxkj.student.main.StudyFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "title"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "playNum"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299042(0x7f090ae2, float:1.8216074E38)
                r3.J(r1, r0)
                java.lang.String r0 = "uploadDate"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299158(0x7f090b56, float:1.821631E38)
                r3.J(r1, r0)
                java.lang.String r0 = "coverImg"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131689801(0x7f0f0149, float:1.9008628E38)
                r1 = 2131297182(0x7f09039e, float:1.8212302E38)
                r3.t(r1, r4, r0, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.main.StudyFragment a;

        c(com.bxkj.student.main.StudyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.main.StudyFragment r4 = r3.a
                int r4 = com.bxkj.student.main.StudyFragment.R(r4)
                com.bxkj.student.main.StudyFragment r0 = r3.a
                int r0 = com.bxkj.student.main.StudyFragment.P(r0)
                int r4 = r4 / r0
                com.bxkj.student.main.StudyFragment r0 = r3.a
                int r0 = com.bxkj.student.main.StudyFragment.O(r0)
                com.bxkj.student.main.StudyFragment r1 = r3.a
                int r1 = com.bxkj.student.main.StudyFragment.R(r1)
                com.bxkj.student.main.StudyFragment r2 = r3.a
                int r2 = com.bxkj.student.main.StudyFragment.P(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.main.StudyFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.main.StudyFragment.Q(r4)
                r4.q0()
                com.bxkj.student.main.StudyFragment r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.L(r0)
                return
            L38:
                com.bxkj.student.main.StudyFragment r4 = r3.a
                int r0 = com.bxkj.student.main.StudyFragment.O(r4)
                int r0 = r0 + 1
                com.bxkj.student.main.StudyFragment.W(r4, r0)
                com.bxkj.student.main.StudyFragment r4 = r3.a
                com.bxkj.student.main.StudyFragment.a0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.main.StudyFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.main.StudyFragment.W(r2, r0)
                com.bxkj.student.main.StudyFragment r2 = r1.a
                java.util.List r2 = com.bxkj.student.main.StudyFragment.T(r2)
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L18
                com.bxkj.student.main.StudyFragment r2 = r1.a
                com.bxkj.student.main.StudyFragment.b0(r2)
                return
            L18:
                com.bxkj.student.main.StudyFragment r2 = r1.a
                com.bxkj.student.main.StudyFragment.a0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.StudyFragment a;

        d(com.bxkj.student.main.StudyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.main.StudyFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.StudyFragment.Q(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L18
                com.bxkj.student.main.StudyFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.StudyFragment.Q(r0)
                r0.w0()
            L18:
                com.bxkj.student.main.StudyFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.StudyFragment.Q(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L2d
                com.bxkj.student.main.StudyFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.StudyFragment.Q(r0)
                r0.q0()
            L2d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.main.StudyFragment r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.main.StudyFragment.Z(r0, r3)
                com.bxkj.student.main.StudyFragment r3 = r2.a
                com.bxkj.student.main.StudyFragment.c0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.StudyFragment a;

        e(com.bxkj.student.main.StudyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.main.StudyFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.StudyFragment.Q(r0)
                r0.w0()
                com.bxkj.student.main.StudyFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.StudyFragment.Q(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.main.StudyFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.main.StudyFragment.X(r0, r1)
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.main.StudyFragment r0 = r2.a
                int r0 = com.bxkj.student.main.StudyFragment.O(r0)
                r1 = 1
                if (r0 != r1) goto L20
                com.bxkj.student.main.StudyFragment r0 = r2.a
                com.bxkj.student.main.StudyFragment.Y(r0, r3)
                goto L29
            L20:
                com.bxkj.student.main.StudyFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.main.StudyFragment.T(r0)
                r0.addAll(r3)
            L29:
                com.bxkj.student.main.StudyFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.main.StudyFragment.U(r3)
                com.bxkj.student.main.StudyFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.main.StudyFragment.T(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.main.StudyFragment a;

        f(com.bxkj.student.main.StudyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.student.main.StudyFragment r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.main.StudyFragment.S(r1)
                com.bxkj.student.main.StudyFragment r2 = r0.a
                int r2 = com.bxkj.student.main.StudyFragment.N(r2)
                r1.notifyItemChanged(r2)
                com.bxkj.student.main.StudyFragment r1 = r0.a
                com.bxkj.student.main.StudyFragment.V(r1, r4)
                com.bxkj.student.main.StudyFragment r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.main.StudyFragment.S(r1)
                com.bxkj.student.main.StudyFragment r2 = r0.a
                int r2 = com.bxkj.student.main.StudyFragment.N(r2)
                r1.notifyItemChanged(r2)
                com.bxkj.student.main.StudyFragment r1 = r0.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = com.bxkj.student.main.StudyFragment.Q(r1)
                r1.D()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.main.StudyFragment a;

        g(com.bxkj.student.main.StudyFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.main.StudyFragment r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.main.StudyFragment r4 = r1.a
                android.content.Context r4 = com.bxkj.student.main.StudyFragment.d0(r4)
                java.lang.Class<com.bxkj.student.study.VideoPlayActivity> r0 = com.bxkj.student.study.VideoPlayActivity.class
                r3.<init>(r4, r0)
                com.bxkj.student.main.StudyFragment r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.main.StudyFragment.U(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r0 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                java.lang.String r0 = "videoId"
                android.content.Intent r3 = r3.putExtra(r0, r4)
                com.bxkj.student.main.StudyFragment r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.main.StudyFragment.U(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "title"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "videoName"
                android.content.Intent r3 = r3.putExtra(r5, r4)
                r2.startActivity(r3)
                return
        }
    }

    public StudyFragment() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1115p = r0
            r0 = 0
            r2.f1116q = r0
            r0 = 1
            r2.f1117r = r0
            r1 = 10
            r2.f1118s = r1
            r2.f1119t = r0
            return
    }

    static /* bridge */ /* synthetic */ int N(com.bxkj.student.main.StudyFragment r0) {
            int r0 = r0.f1116q
            return r0
    }

    static /* bridge */ /* synthetic */ int O(com.bxkj.student.main.StudyFragment r0) {
            int r0 = r0.f1117r
            return r0
    }

    static /* bridge */ /* synthetic */ int P(com.bxkj.student.main.StudyFragment r0) {
            int r0 = r0.f1118s
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout Q(com.bxkj.student.main.StudyFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.f1112m
            return r0
    }

    static /* bridge */ /* synthetic */ int R(com.bxkj.student.main.StudyFragment r0) {
            int r0 = r0.f1119t
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter S(com.bxkj.student.main.StudyFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List T(com.bxkj.student.main.StudyFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1115p
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter U(com.bxkj.student.main.StudyFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1114o
            return r0
    }

    static /* bridge */ /* synthetic */ void V(com.bxkj.student.main.StudyFragment r0, int r1) {
            r0.f1116q = r1
            return
    }

    static /* bridge */ /* synthetic */ void W(com.bxkj.student.main.StudyFragment r0, int r1) {
            r0.f1117r = r1
            return
    }

    static /* bridge */ /* synthetic */ void X(com.bxkj.student.main.StudyFragment r0, int r1) {
            r0.f1119t = r1
            return
    }

    static /* bridge */ /* synthetic */ void Y(com.bxkj.student.main.StudyFragment r0, java.util.List r1) {
            r0.f1115p = r1
            return
    }

    static /* bridge */ /* synthetic */ void Z(com.bxkj.student.main.StudyFragment r0, java.util.List r1) {
            r0.f1111l = r1
            return
    }

    static /* bridge */ /* synthetic */ void a0(com.bxkj.student.main.StudyFragment r0) {
            r0.e0()
            return
    }

    static /* bridge */ /* synthetic */ void b0(com.bxkj.student.main.StudyFragment r0) {
            r0.f0()
            return
    }

    static /* bridge */ /* synthetic */ void c0(com.bxkj.student.main.StudyFragment r0) {
            r0.h0()
            return
    }

    static /* synthetic */ android.content.Context d0(com.bxkj.student.main.StudyFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void e0() {
            r8 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.k
            int r0 = r0.getItemCount()
            if (r0 <= 0) goto L4a
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.k
            int r1 = r8.f1116q
            java.lang.Object r0 = r0.getItem(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "id"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            android.content.Context r0 = r8.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            w.f r2 = (w.f) r2
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r1.getSchoolId()
            int r6 = r8.f1117r
            int r7 = r8.f1118s
            java.lang.String r4 = ""
            rx.e r1 = r2.q(r3, r4, r5, r6, r7)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.StudyFragment$e r1 = new com.bxkj.student.main.StudyFragment$e
            r1.<init>(r8)
            r0.setDataListener(r1)
            return
        L4a:
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r8.f1112m
            r0.w0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r8.f1112m
            r0.q0()
            return
    }

    private void f0() {
            r4 = this;
            android.content.Context r0 = r4.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.d(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.StudyFragment$d r1 = new com.bxkj.student.main.StudyFragment$d
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void g0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.f1112m
            com.bxkj.student.main.StudyFragment$c r1 = new com.bxkj.student.main.StudyFragment$c
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private void h0() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 10
            r0.<init>(r1)
            java.lang.String r1 = "id"
            java.lang.String r2 = "groom"
            r0.put(r1, r2)
            java.lang.String r1 = "name"
            java.lang.String r2 = "推荐"
            r0.put(r1, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.f1111l
            r2 = 0
            r1.add(r2, r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.k
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.f1111l
            r0.g(r1)
            r3.e0()
            return
    }

    public void b() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.k
            com.bxkj.student.main.StudyFragment$f r1 = new com.bxkj.student.main.StudyFragment$f
            r1.<init>(r2)
            r0.k(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1114o
            com.bxkj.student.main.StudyFragment$g r1 = new com.bxkj.student.main.StudyFragment$g
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected void e() {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.j
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r6.g
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r6.g
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r3 = r6.j
            r3.setLayoutAnimation(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.j
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r3 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r4 = r6.g
            r5 = 1
            r3.<init>(r4, r5)
            r0.addItemDecoration(r3)
            com.bxkj.student.main.StudyFragment$a r0 = new com.bxkj.student.main.StudyFragment$a
            android.content.Context r3 = r6.g
            r4 = 2131493336(0x7f0c01d8, float:1.861015E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r6.f1111l
            r0.<init>(r6, r3, r4, r5)
            r6.k = r0
            androidx.recyclerview.widget.RecyclerView r3 = r6.j
            r3.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.f1113n
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r4 = r6.g
            r3.<init>(r4)
            r0.setLayoutManager(r3)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r3 = r6.g
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r3, r2)
            r0.<init>(r2)
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.f1113n
            r1.setLayoutAnimation(r0)
            com.bxkj.student.main.StudyFragment$b r0 = new com.bxkj.student.main.StudyFragment$b
            android.content.Context r1 = r6.g
            r2 = 2131493335(0x7f0c01d7, float:1.8610147E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.f1115p
            r0.<init>(r6, r1, r2, r3)
            r6.f1114o = r0
            androidx.recyclerview.widget.RecyclerView r1 = r6.f1113n
            r1.setAdapter(r0)
            r6.g0()
            r6.f0()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298442(0x7f09088a, float:1.8214857E38)
            android.view.View r1 = r0.c(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.j = r1
            r1 = 2131298444(0x7f09088c, float:1.8214861E38)
            android.view.View r1 = r0.c(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.f1113n = r1
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.c(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.f1112m = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493183(0x7f0c013f, float:1.8609839E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
