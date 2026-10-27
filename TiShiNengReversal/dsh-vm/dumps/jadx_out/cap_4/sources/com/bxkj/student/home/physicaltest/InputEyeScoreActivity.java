package com.bxkj.student.home.physicaltest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class InputEyeScoreActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.Button b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f776k0;

    /* renamed from: p0, reason: collision with root package name */
    boolean f777p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.InputEyeScoreActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.physicaltest.InputEyeScoreActivity$a$a, reason: collision with other inner class name */
        class C0074a implements android.text.TextWatcher {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.physicaltest.InputEyeScoreActivity.a b;

            C0074a(com.bxkj.student.home.physicaltest.InputEyeScoreActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable r3) {
                    r2 = this;
                    java.util.Map r0 = r2.a
                    java.lang.String r1 = "score"
                    java.lang.String r3 = r3.toString()
                    r0.put(r1, r3)
                    return
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                    r0 = this;
                    return
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                    r0 = this;
                    return
            }
        }

        a(com.bxkj.student.home.physicaltest.InputEyeScoreActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "examName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299053(0x7f090aed, float:1.8216097E38)
                r3.J(r1, r0)
                java.lang.String r0 = "score"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131296949(0x7f0902b5, float:1.821183E38)
                r3.J(r1, r0)
                android.view.View r3 = r3.h(r1)
                android.widget.EditText r3 = (android.widget.EditText) r3
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity$a$a r0 = new com.bxkj.student.home.physicaltest.InputEyeScoreActivity$a$a
                r0.<init>(r2, r4)
                r3.addTextChangedListener(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.InputEyeScoreActivity a;

        b(com.bxkj.student.home.physicaltest.InputEyeScoreActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity.j0(r0, r3)
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.physicaltest.InputEyeScoreActivity.h0(r3)
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.InputEyeScoreActivity.i0(r0)
                r3.g(r0)
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity r3 = r2.a
                java.util.List r3 = com.bxkj.student.home.physicaltest.InputEyeScoreActivity.i0(r3)
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L30
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity r3 = r2.a
                android.widget.FrameLayout r3 = r3.P()
                r0 = 0
                r3.setVisibility(r0)
            L30:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ int a;
        final /* synthetic */ com.bxkj.student.home.physicaltest.InputEyeScoreActivity b;

        c(com.bxkj.student.home.physicaltest.InputEyeScoreActivity r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity r2 = r1.b
                int r0 = r1.a
                int r0 = r0 + 1
                com.bxkj.student.home.physicaltest.InputEyeScoreActivity.k0(r2, r0)
                return
        }
    }

    public InputEyeScoreActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            r0 = 1
            r1.f777p0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.physicaltest.InputEyeScoreActivity r0, android.view.View r1) {
            r0.o0(r1)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.physicaltest.InputEyeScoreActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f776k0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.physicaltest.InputEyeScoreActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.physicaltest.InputEyeScoreActivity r0, java.util.List r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.physicaltest.InputEyeScoreActivity r0, int r1) {
            r0.m0(r1)
            return
    }

    private void l0() {
            r1 = this;
            r0 = 1
            r1.f777p0 = r0
            r0 = 0
            r1.m0(r0)
            return
    }

    private void m0(int r8) {
            r7 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r7.c0
            int r0 = r0.size()
            if (r8 != r0) goto L20
            r7.n0()
            boolean r8 = r7.f777p0
            if (r8 != 0) goto L1f
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r8 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r7.V
            r8.<init>(r0)
            java.lang.String r0 = "添加成功"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r8 = r8.setMessage(r0)
            r8.show()
        L1f:
            return
        L20:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r7.c0
            java.lang.Object r0 = r0.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "score"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L74
            r2 = 0
            r7.f777p0 = r2
            android.content.Context r2 = r7.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideSuccessMessage()
            java.lang.Class<d0.a> r3 = d0.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            d0.a r3 = (d0.a) r3
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getUserId()
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r5.getAccount()
            java.lang.String r6 = "id"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r6)
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            rx.e r0 = r3.X(r4, r5, r6, r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r2.setObservable(r0)
            com.bxkj.student.home.physicaltest.InputEyeScoreActivity$c r1 = new com.bxkj.student.home.physicaltest.InputEyeScoreActivity$c
            r1.<init>(r7, r8)
            r0.setDataListener(r1)
            return
        L74:
            int r8 = r8 + 1
            r7.m0(r8)
            return
    }

    private void n0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.E1(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.InputEyeScoreActivity$b r1 = new com.bxkj.student.home.physicaltest.InputEyeScoreActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void o0(android.view.View r1) {
            r0 = this;
            r0.l0()
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.b0
            com.bxkj.student.home.physicaltest.a r1 = new com.bxkj.student.home.physicaltest.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492953(0x7f0c0059, float:1.8609372E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.P()
            r1 = 8
            r0.setVisibility(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.physicaltest.InputEyeScoreActivity$a r0 = new com.bxkj.student.home.physicaltest.InputEyeScoreActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493265(0x7f0c0191, float:1.8610005E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.c0
            r0.<init>(r4, r1, r2, r3)
            r4.f776k0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            android.widget.TextView r1 = r4.a0
            r0.setEmptyView(r1)
            r4.n0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "自助视力"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Y = r2
            r2 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r2
            r1.Z = r2
            r2 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.b0 = r2
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.Y
            r0 = 0
            r2.X0(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.Y
            r2.S0(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
