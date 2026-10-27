package com.bxkj.student.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class HomeFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private final java.lang.String j;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.ViewFlipper f1082l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f1083m;

    /* renamed from: n, reason: collision with root package name */
    private cn.bluemobi.dylan.base.view.CycleViewPager f1084n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f1085o;

    /* renamed from: p, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1086p;

    /* renamed from: q, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1087q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.main.HomeFragment k;

        a(com.bxkj.student.main.HomeFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                com.bxkj.student.main.HomeFragment r0 = r2.k
                java.lang.String r1 = "icon"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                int r4 = r0.Y(r4)
                r0 = 2131297155(0x7f090383, float:1.8212247E38)
                r3.r(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.HomeFragment a;

        b(com.bxkj.student.main.HomeFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.main.HomeFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.HomeFragment.O(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.main.HomeFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.HomeFragment.O(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.main.HomeFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.HomeFragment.O(r0)
                r0.w0()
            L20:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "data"
                java.util.List r2 = cn.bluemobi.dylan.http.JsonParse.getList(r2, r0)
                com.bxkj.student.main.HomeFragment r0 = r1.a
                com.bxkj.student.main.HomeFragment.S(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.HomeFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.main.HomeFragment.c b;

            a(com.bxkj.student.main.HomeFragment.c r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    android.content.Intent r3 = new android.content.Intent
                    com.bxkj.student.main.HomeFragment$c r0 = r2.b
                    com.bxkj.student.main.HomeFragment r0 = r0.a
                    android.content.Context r0 = com.bxkj.student.main.HomeFragment.U(r0)
                    java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r1 = com.bxkj.base.webview.H5DetailActivity.class
                    r3.<init>(r0, r1)
                    java.util.Map r0 = r2.a
                    java.lang.String r1 = "title"
                    java.lang.String r0 = cn.bluemobi.dylan.base.utils.u.O(r0, r1)
                    r3.putExtra(r1, r0)
                    java.util.Map r0 = r2.a
                    java.lang.String r1 = "url"
                    java.lang.String r0 = cn.bluemobi.dylan.base.utils.u.O(r0, r1)
                    r3.putExtra(r1, r0)
                    com.bxkj.student.main.HomeFragment$c r0 = r2.b
                    com.bxkj.student.main.HomeFragment r0 = r0.a
                    r0.startActivity(r3)
                    return
            }
        }

        c(com.bxkj.student.main.HomeFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r7) {
                r6 = this;
                com.bxkj.student.main.HomeFragment r0 = r6.a
                android.widget.ViewFlipper r0 = com.bxkj.student.main.HomeFragment.P(r0)
                r0.removeAllViews()
                java.lang.String r0 = "data"
                java.lang.Object r7 = r7.get(r0)
                java.util.List r7 = (java.util.List) r7
                java.util.Iterator r7 = r7.iterator()
            L15:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L7a
                java.lang.Object r0 = r7.next()
                java.util.Map r0 = (java.util.Map) r0
                com.bxkj.student.main.HomeFragment r1 = r6.a
                android.content.Context r1 = com.bxkj.student.main.HomeFragment.T(r1)
                r2 = 2131493338(0x7f0c01da, float:1.8610153E38)
                r3 = 0
                android.view.View r1 = android.view.View.inflate(r1, r2, r3)
                r2 = 2131299164(0x7f090b5c, float:1.8216322E38)
                android.view.View r2 = r1.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r3 = 2131297200(0x7f0903b0, float:1.8212338E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r4 = 2131297100(0x7f09034c, float:1.8212135E38)
                android.view.View r4 = r1.findViewById(r4)
                r5 = 8
                r4.setVisibility(r5)
                java.lang.String r4 = "title"
                java.lang.String r4 = cn.bluemobi.dylan.base.utils.u.O(r0, r4)
                r2.setText(r4)
                java.lang.String r2 = "isread"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r0, r2)
                java.lang.String r4 = "0"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L65
                r5 = 0
            L65:
                r3.setVisibility(r5)
                com.bxkj.student.main.HomeFragment$c$a r2 = new com.bxkj.student.main.HomeFragment$c$a
                r2.<init>(r6, r0)
                r1.setOnClickListener(r2)
                com.bxkj.student.main.HomeFragment r0 = r6.a
                android.widget.ViewFlipper r0 = com.bxkj.student.main.HomeFragment.P(r0)
                r0.addView(r1)
                goto L15
            L7a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.main.HomeFragment a;

        d(com.bxkj.student.main.HomeFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.home.d r2 = new com.bxkj.student.home.d
                com.bxkj.student.main.HomeFragment r3 = r1.a
                androidx.fragment.app.FragmentActivity r3 = r3.getActivity()
                com.bxkj.student.main.HomeFragment r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.main.HomeFragment.N(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r0 = "icon"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                com.bxkj.student.main.HomeFragment r0 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.main.HomeFragment.N(r0)
                java.lang.Object r5 = r0.getItem(r5)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "name"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r2.<init>(r3, r4, r5)
                r2.f()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements m2.d {
        final /* synthetic */ com.bxkj.student.main.HomeFragment a;

        e(com.bxkj.student.main.HomeFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void n(l2.h r1) {
                r0 = this;
                com.bxkj.student.main.HomeFragment r1 = r0.a
                com.bxkj.student.main.HomeFragment.Q(r1)
                com.bxkj.student.main.HomeFragment r1 = r0.a
                com.bxkj.student.main.HomeFragment.R(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener {
        final /* synthetic */ java.util.List a;
        final /* synthetic */ com.bxkj.student.main.HomeFragment b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<okhttp3.ResponseBody> {
            final /* synthetic */ com.bxkj.student.main.HomeFragment.f a;

            a(com.bxkj.student.main.HomeFragment.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void g(okhttp3.ResponseBody r3) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "onNext="
                    r0.append(r1)
                    java.lang.String r3 = r3.toString()
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    com.orhanobut.logger.j.c(r3)
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    java.lang.String r0 = "onCompleted"
                    com.orhanobut.logger.j.c(r0)
                    return
            }

            public void onError(java.lang.Throwable r1) {
                    r0 = this;
                    r1.getClass()
                    java.lang.String r1 = "Throwable"
                    com.orhanobut.logger.j.c(r1)
                    return
            }

            public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                    r0 = this;
                    okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                    r0.g(r1)
                    return
            }
        }

        f(com.bxkj.student.main.HomeFragment r1, java.util.List r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onImageClick(java.lang.String r3, int r4, android.view.View r5) {
                r2 = this;
                java.util.List r3 = r2.a
                if (r3 == 0) goto L85
                int r3 = r3.size()
                if (r3 <= r4) goto L85
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.main.HomeFragment r5 = r2.b
                android.content.Context r5 = com.bxkj.student.main.HomeFragment.V(r5)
                java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r0 = com.bxkj.base.webview.H5DetailActivity.class
                r3.<init>(r5, r0)
                java.util.List r5 = r2.a
                java.lang.Object r5 = r5.get(r4)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "clickUrl"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                java.lang.String r0 = "url"
                r3.putExtra(r0, r5)
                java.util.List r5 = r2.a
                java.lang.Object r4 = r5.get(r4)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "titleName"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "title"
                r3.putExtra(r5, r4)
                com.bxkj.student.main.HomeFragment r4 = r2.b
                r4.startActivity(r3)
                com.bxkj.student.main.HomeFragment$f$a r3 = new com.bxkj.student.main.HomeFragment$f$a
                r3.<init>(r2)
                java.lang.Class<w.f> r4 = w.f.class
                java.lang.Object r4 = cn.bluemobi.dylan.http.Http.getApiService(r4)
                w.f r4 = (w.f) r4
                java.util.List r5 = r2.a
                r0 = 0
                java.lang.Object r5 = r5.get(r0)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "id"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r0.getSchoolId()
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getUserId()
                rx.e r4 = r4.v(r5, r0, r1)
                rx.h r5 = rx.schedulers.c.e()
                rx.e r4 = r4.w5(r5)
                rx.h r5 = rx.android.schedulers.a.b()
                rx.e r4 = r4.I3(r5)
                r4.r5(r3)
            L85:
                return
        }
    }

    public HomeFragment() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "groupType"
            r1.j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1086p = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter N(com.bxkj.student.main.HomeFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1087q
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout O(com.bxkj.student.main.HomeFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ViewFlipper P(com.bxkj.student.main.HomeFragment r0) {
            android.widget.ViewFlipper r0 = r0.f1082l
            return r0
    }

    static /* bridge */ /* synthetic */ void Q(com.bxkj.student.main.HomeFragment r0) {
            r0.W()
            return
    }

    static /* bridge */ /* synthetic */ void R(com.bxkj.student.main.HomeFragment r0) {
            r0.X()
            return
    }

    static /* bridge */ /* synthetic */ void S(com.bxkj.student.main.HomeFragment r0, java.util.List r1) {
            r0.b0(r1)
            return
    }

    static /* synthetic */ android.content.Context T(com.bxkj.student.main.HomeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context U(com.bxkj.student.main.HomeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context V(com.bxkj.student.main.HomeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void W() {
            r2 = this;
            android.content.Context r0 = r2.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.r0()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.HomeFragment$b r1 = new com.bxkj.student.main.HomeFragment$b
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void X() {
            r6 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L10
            android.widget.ViewFlipper r0 = r6.f1082l
            r0.removeAllViews()
            return
        L10:
            com.bxkj.student.common.jpush.a r0 = com.bxkj.student.common.jpush.a.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r2 = r2.isLogin()
            r0.d(r1, r2)
            android.content.Context r0 = r6.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            r3 = 1
            r4 = 10
            java.lang.String r5 = "0"
            rx.e r1 = r1.l1(r2, r5, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.HomeFragment$c r1 = new com.bxkj.student.main.HomeFragment$c
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    private void a0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.k
            r1 = 0
            r0.S0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.k
            com.bxkj.student.main.HomeFragment$e r1 = new com.bxkj.student.main.HomeFragment$e
            r1.<init>(r2)
            r0.l1(r1)
            return
    }

    private void b0(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L32
            int r1 = r5.size()
            if (r1 != 0) goto Le
            goto L32
        Le:
            java.util.Iterator r1 = r5.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "announcementUrl"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r0.add(r2)
            goto L12
        L28:
            cn.bluemobi.dylan.base.view.CycleViewPager r1 = r4.f1084n
            com.bxkj.student.main.HomeFragment$f r2 = new com.bxkj.student.main.HomeFragment$f
            r2.<init>(r4, r5)
            r1.setData(r0, r2)
        L32:
            cn.bluemobi.dylan.base.view.CycleViewPager r5 = r4.f1084n
            r0 = 2131231120(0x7f080190, float:1.8078312E38)
            r1 = 2131231121(0x7f080191, float:1.8078314E38)
            r5.setIndicators(r0, r1)
            return
    }

    public int Y(java.lang.String r4) {
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()
            android.content.Context r1 = r3.g
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "mipmap"
            int r0 = r0.getIdentifier(r4, r2, r1)
            java.lang.String r1 = "ic_home_word"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L29
            android.content.res.Resources r0 = r3.getResources()
            android.content.Context r1 = r3.g
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "drawable"
            int r4 = r0.getIdentifier(r4, r2, r1)
            return r4
        L29:
            return r0
    }

    public void Z() {
            r3 = this;
            com.bxkj.student.home.a r0 = com.bxkj.student.home.a.b()
            java.util.List r0 = r0.c()
            r3.f1086p = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "更多"
            r0.put(r1, r2)
            java.lang.String r1 = "icon"
            java.lang.String r2 = "icon_more2"
            r0.put(r1, r2)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "type"
            r0.put(r2, r1)
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "groupType"
            r0.put(r2, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.f1086p
            r1.add(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.f1087q
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.f1086p
            r0.g(r1)
            return
    }

    public void b() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1087q
            com.bxkj.student.main.HomeFragment$d r1 = new com.bxkj.student.main.HomeFragment$d
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected void e() {
            r4 = this;
            r4.W()     // Catch: java.lang.Exception -> L3
        L3:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1083m
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r2 = r4.g
            r3 = 4
            r1.<init>(r2, r3)
            r0.setLayoutManager(r1)
            com.bxkj.student.main.HomeFragment$a r0 = new com.bxkj.student.main.HomeFragment$a
            android.content.Context r1 = r4.g
            r2 = 2131493260(0x7f0c018c, float:1.8609995E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1086p
            r0.<init>(r4, r1, r2, r3)
            r4.f1087q = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.f1083m
            r1.setAdapter(r0)
            r4.Z()
            r4.a0()
            r4.X()
            return
    }

    protected void f(android.view.View r3) {
            r2 = this;
            r3 = 2131299252(0x7f090bb4, float:1.82165E38)
            android.view.View r3 = r2.c(r3)
            android.widget.ViewFlipper r3 = (android.widget.ViewFlipper) r3
            r2.f1082l = r3
            r3 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r3 = r2.c(r3)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r3
            r2.k = r3
            r3 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r3 = r2.c(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r2.f1083m = r3
            r3 = 2131296829(0x7f09023d, float:1.8211586E38)
            android.view.View r3 = r2.c(r3)
            cn.bluemobi.dylan.base.view.CycleViewPager r3 = (cn.bluemobi.dylan.base.view.CycleViewPager) r3
            r2.f1084n = r3
            r3 = 2131298428(0x7f09087c, float:1.8214829E38)
            android.view.View r3 = r2.c(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r2.f1085o = r3
            android.view.animation.LayoutAnimationController r3 = new android.view.animation.LayoutAnimationController
            android.content.Context r0 = r2.g
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r1)
            r3.<init>(r0)
            r0 = 0
            r3.setOrder(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.f1083m
            r0.setLayoutAnimation(r3)
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493187(0x7f0c0143, float:1.8609847E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            android.widget.ViewFlipper r0 = r1.f1082l
            r0.stopFlipping()
            return
    }

    public void onResume() {
            r1 = this;
            super/*androidx.fragment.app.Fragment*/.onResume()
            r1.X()
            android.widget.ViewFlipper r0 = r1.f1082l
            r0.startFlipping()
            return
    }
}
