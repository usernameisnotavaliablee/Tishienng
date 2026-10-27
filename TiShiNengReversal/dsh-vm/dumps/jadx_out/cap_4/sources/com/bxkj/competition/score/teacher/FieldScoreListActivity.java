package com.bxkj.competition.score.teacher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FieldScoreListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText F0;
    private java.lang.String Y;
    private com.google.android.material.tabs.TabLayout Z;
    private androidx.recyclerview.widget.RecyclerView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> f656k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f657p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.score.teacher.FieldScoreListActivity k;

        a(com.bxkj.competition.score.teacher.FieldScoreListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                int r0 = com.bxkj.competition.R.id.tv_no
                java.lang.String r1 = "passNum"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_name
                java.lang.String r1 = "name"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_num
                java.lang.String r1 = "num"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_stateName
                java.lang.String r1 = "stateName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_check
                java.lang.String r1 = "check"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_rank
                java.lang.String r1 = "rank"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_time
                java.lang.String r1 = "time"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.teacher.FieldScoreListActivity a;

        b(com.bxkj.competition.score.teacher.FieldScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.teacher.FieldScoreListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.teacher.FieldScoreListActivity.g0(r0)
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
                com.bxkj.competition.score.teacher.FieldScoreListActivity r1 = r5.a
                com.google.android.material.tabs.TabLayout r1 = com.bxkj.competition.score.teacher.FieldScoreListActivity.h0(r1)
                com.bxkj.competition.score.teacher.FieldScoreListActivity r2 = r5.a
                com.google.android.material.tabs.TabLayout r2 = com.bxkj.competition.score.teacher.FieldScoreListActivity.h0(r2)
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
                com.bxkj.competition.score.teacher.FieldScoreListActivity r6 = r5.a
                com.bxkj.competition.score.teacher.FieldScoreListActivity.j0(r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.teacher.FieldScoreListActivity a;

        c(com.bxkj.competition.score.teacher.FieldScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.teacher.FieldScoreListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.teacher.FieldScoreListActivity.k0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.score.teacher.FieldScoreListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.competition.score.teacher.FieldScoreListActivity.m0(r0, r3)
                com.bxkj.competition.score.teacher.FieldScoreListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.competition.score.teacher.FieldScoreListActivity.n0(r3)
                com.bxkj.competition.score.teacher.FieldScoreListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.score.teacher.FieldScoreListActivity.l0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.bxkj.competition.score.teacher.FieldScoreListActivity a;

        d(com.bxkj.competition.score.teacher.FieldScoreListActivity r1) {
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
                com.bxkj.competition.score.teacher.FieldScoreListActivity r1 = r0.a
                com.bxkj.competition.score.teacher.FieldScoreListActivity.j0(r1)
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.competition.score.teacher.FieldScoreListActivity a;

        e(com.bxkj.competition.score.teacher.FieldScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.competition.score.teacher.FieldScoreListActivity r1 = r0.a
                com.bxkj.competition.score.teacher.FieldScoreListActivity.o0(r1, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements android.widget.RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ android.widget.RadioGroup a;
        final /* synthetic */ android.widget.EditText b;
        final /* synthetic */ com.bxkj.competition.score.teacher.FieldScoreListActivity c;

        f(com.bxkj.competition.score.teacher.FieldScoreListActivity r1, android.widget.RadioGroup r2, android.widget.EditText r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.RadioGroup r2, int r3) {
                r1 = this;
                android.widget.RadioGroup r2 = r1.a
                r0 = 1
                android.view.View r2 = r2.getChildAt(r0)
                int r2 = r2.getId()
                if (r3 != r2) goto L14
                android.widget.EditText r2 = r1.b
                r3 = 0
                r2.setVisibility(r3)
                return
            L14:
                android.widget.EditText r2 = r1.b
                r3 = 8
                r2.setVisibility(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ int a;
        final /* synthetic */ android.widget.EditText b;
        final /* synthetic */ android.widget.EditText c;
        final /* synthetic */ android.widget.RadioGroup d;
        final /* synthetic */ com.bxkj.competition.score.teacher.FieldScoreListActivity e;

        g(com.bxkj.competition.score.teacher.FieldScoreListActivity r1, int r2, android.widget.EditText r3, android.widget.EditText r4, android.widget.RadioGroup r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r7 = this;
                com.bxkj.competition.score.teacher.FieldScoreListActivity r0 = r7.e
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.competition.score.teacher.FieldScoreListActivity.n0(r0)
                int r1 = r7.a
                java.lang.Object r0 = r0.getItem(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "traffId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L2f
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.teacher.FieldScoreListActivity r1 = r7.e
                android.content.Context r1 = com.bxkj.competition.score.teacher.FieldScoreListActivity.p0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "该道次为空,不能添加成绩"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                r0.show()
                return
            L2f:
                android.widget.EditText r0 = r7.b
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                android.widget.EditText r2 = r7.c
                android.text.Editable r2 = r2.getText()
                java.lang.String r2 = r2.toString()
                java.lang.String r2 = r2.trim()
                com.bxkj.competition.score.teacher.FieldScoreListActivity r3 = r7.e
                android.widget.EditText r3 = com.bxkj.competition.score.teacher.FieldScoreListActivity.q0(r3)
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.trim()
                java.util.HashMap r4 = new java.util.HashMap
                r5 = 3
                r4.<init>(r5)
                java.lang.String r5 = "_state"
                java.lang.String r6 = "modified"
                r4.put(r5, r6)
                com.bxkj.competition.score.teacher.FieldScoreListActivity r5 = r7.e
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r5 = com.bxkj.competition.score.teacher.FieldScoreListActivity.n0(r5)
                int r6 = r7.a
                java.lang.Object r5 = r5.getItem(r6)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r4.put(r1, r5)
                android.widget.RadioGroup r1 = r7.d
                int r1 = r1.getCheckedRadioButtonId()
                android.widget.RadioGroup r5 = r7.d
                r6 = 1
                android.view.View r5 = r5.getChildAt(r6)
                int r5 = r5.getId()
                if (r1 != r5) goto L93
                goto L94
            L93:
                r6 = 0
            L94:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
                java.lang.String r5 = "check"
                r4.put(r5, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto La8
                java.lang.String r1 = "memo"
                r4.put(r1, r0)
            La8:
                java.lang.String r0 = "rank"
                r4.put(r0, r2)
                java.lang.String r0 = "time"
                r4.put(r0, r3)
                com.bxkj.competition.score.teacher.FieldScoreListActivity r0 = r7.e
                int r1 = r7.a
                com.bxkj.competition.score.teacher.FieldScoreListActivity.r0(r0, r4, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ int b;
        final /* synthetic */ com.bxkj.competition.score.teacher.FieldScoreListActivity c;

        h(com.bxkj.competition.score.teacher.FieldScoreListActivity r1, java.util.Map r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.teacher.FieldScoreListActivity r0 = r1.c
                android.content.Context r0 = com.bxkj.competition.score.teacher.FieldScoreListActivity.i0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                java.util.Map r3 = r2.a
                java.lang.String r0 = "check"
                boolean r1 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r0)
                if (r1 == 0) goto Ld
                java.lang.String r1 = "犯规"
                goto Lf
            Ld:
                java.lang.String r1 = "未犯规"
            Lf:
                r3.put(r0, r1)
                java.util.Map r3 = r2.a
                java.lang.String r0 = "time"
                boolean r3 = r3.containsKey(r0)
                if (r3 == 0) goto L25
                java.util.Map r3 = r2.a
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r3.put(r0, r1)
            L25:
                java.util.Map r3 = r2.a
                java.lang.String r0 = "rank"
                boolean r3 = r3.containsKey(r0)
                if (r3 == 0) goto L38
                java.util.Map r3 = r2.a
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r3.put(r0, r1)
            L38:
                com.bxkj.competition.score.teacher.FieldScoreListActivity r3 = r2.c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.competition.score.teacher.FieldScoreListActivity.n0(r3)
                int r0 = r2.b
                java.lang.Object r3 = r3.getItem(r0)
                java.util.Map r3 = (java.util.Map) r3
                java.util.Map r0 = r2.a
                r3.putAll(r0)
                com.bxkj.competition.score.teacher.FieldScoreListActivity r3 = r2.c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.competition.score.teacher.FieldScoreListActivity.n0(r3)
                int r0 = r2.b
                r3.notifyItemChanged(r0)
                com.bxkj.competition.score.teacher.FieldScoreListActivity r3 = r2.c
                int r0 = r2.b
                int r0 = r0 + 1
                com.bxkj.competition.score.teacher.FieldScoreListActivity.o0(r3, r0)
                return
        }
    }

    public FieldScoreListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            return
    }

    static /* synthetic */ android.content.Context g0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ com.google.android.material.tabs.TabLayout h0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            com.google.android.material.tabs.TabLayout r0 = r0.Z
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ void j0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            r0.u0()
            return
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ java.util.List l0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* synthetic */ java.util.List m0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0, java.util.List r1) {
            r0.c0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter n0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f657p0
            return r0
    }

    static /* synthetic */ void o0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0, int r1) {
            r0.v0(r1)
            return
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.widget.EditText q0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0) {
            android.widget.EditText r0 = r0.F0
            return r0
    }

    static /* synthetic */ void r0(com.bxkj.competition.score.teacher.FieldScoreListActivity r0, java.util.Map r1, int r2) {
            r0.s0(r1, r2)
            return
    }

    private void s0(java.util.Map<java.lang.String, java.lang.Object> r5, int r6) {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r5)
            rx.e r1 = r1.m(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.teacher.FieldScoreListActivity$h r1 = new com.bxkj.competition.score.teacher.FieldScoreListActivity$h
            r1.<init>(r4, r5, r6)
            r0.setDataListener(r1)
            return
    }

    private void t0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r3.Y
            rx.e r1 = r1.k(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.teacher.FieldScoreListActivity$b r1 = new com.bxkj.competition.score.teacher.FieldScoreListActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void u0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r5.Y
            com.google.android.material.tabs.TabLayout r3 = r5.Z
            int r3 = r3.getSelectedTabPosition()
            int r3 = r3 + 1
            java.lang.String r4 = "1"
            rx.e r1 = r1.l(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.teacher.FieldScoreListActivity$c r1 = new com.bxkj.competition.score.teacher.FieldScoreListActivity$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private void v0(int r9) {
            r8 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.f657p0
            int r0 = r0.getItemCount()
            if (r9 < r0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r9 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r8.V
            r9.<init>(r0)
            java.lang.String r0 = "最后一条已录入完毕"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r9 = r9.setMessage(r0)
            r9.show()
            return
        L19:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r8.V
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "道次："
            r1.append(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.f657p0
            java.lang.Object r2 = r2.getItem(r9)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "passNum"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r1.append(r2)
            java.lang.String r2 = "\u3000姓名："
            r1.append(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.f657p0
            java.lang.Object r2 = r2.getItem(r9)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "name"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setTitle(r1)
            int r1 = com.bxkj.competition.R.layout.dialog_add_score_field
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setCenterCustomView(r1)
            int r1 = com.bxkj.competition.R.id.et_value
            android.view.View r1 = r0.findViewById(r1)
            r5 = r1
            android.widget.EditText r5 = (android.widget.EditText) r5
            int r1 = com.bxkj.competition.R.id.et_rank
            android.view.View r1 = r0.findViewById(r1)
            r6 = r1
            android.widget.EditText r6 = (android.widget.EditText) r6
            int r1 = com.bxkj.competition.R.id.et_time
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r8.F0 = r1
            com.bxkj.base.util.w r2 = new com.bxkj.base.util.w
            r2.<init>()
            r3 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r3]
            r7 = 0
            r4[r7] = r2
            r1.setFilters(r4)
            android.view.Window r1 = r0.getWindow()
            android.view.WindowManager$LayoutParams r2 = r1.getAttributes()
            r4 = 48
            r1.setGravity(r4)
            r4 = -1
            r2.width = r4
            r4 = -2
            r2.height = r4
            r0.onWindowAttributesChanged(r2)
            r1.setAttributes(r2)
            com.bxkj.base.keyboard.c r1 = new com.bxkj.base.keyboard.c
            r1.<init>(r8)
            r1.a(r6)
            android.widget.EditText r2 = r8.F0
            r1.a(r2)
            int r1 = com.bxkj.competition.R.id.rg
            android.view.View r1 = r0.findViewById(r1)
            r7 = r1
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            com.bxkj.competition.score.teacher.FieldScoreListActivity$f r1 = new com.bxkj.competition.score.teacher.FieldScoreListActivity$f
            r1.<init>(r8, r7, r5)
            r7.setOnCheckedChangeListener(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.f657p0
            java.lang.Object r1 = r1.getItem(r9)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "memo"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r5.setText(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.f657p0
            java.lang.Object r1 = r1.getItem(r9)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "rank"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r6.setText(r1)
            android.widget.EditText r1 = r8.F0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.f657p0
            java.lang.Object r2 = r2.getItem(r9)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r4 = "time"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            r1.setText(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.f657p0
            java.lang.Object r1 = r1.getItem(r9)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "check"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            java.lang.String r2 = "犯规"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L116
            android.view.View r1 = r7.getChildAt(r3)
            int r1 = r1.getId()
            r7.check(r1)
        L116:
            com.bxkj.competition.score.teacher.FieldScoreListActivity$g r2 = new com.bxkj.competition.score.teacher.FieldScoreListActivity$g
            r3 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0.setRightButtonOnClickListener(r2)
            android.view.Window r9 = r0.getWindow()
            r1 = 131080(0x20008, float:1.83682E-40)
            r9.clearFlags(r1)
            android.view.Window r9 = r0.getWindow()
            r1 = 18
            r9.setSoftInputMode(r1)
            r0.show()
            return
    }

    public void L() {
            r2 = this;
            com.google.android.material.tabs.TabLayout r0 = r2.Z
            com.bxkj.competition.score.teacher.FieldScoreListActivity$d r1 = new com.bxkj.competition.score.teacher.FieldScoreListActivity$d
            r1.<init>(r2)
            r0.addOnTabSelectedListener(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f657p0
            com.bxkj.competition.score.teacher.FieldScoreListActivity$e r1 = new com.bxkj.competition.score.teacher.FieldScoreListActivity$e
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_student_list_add_score
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "scheduleId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.Y = r0
        L16:
            androidx.recyclerview.widget.RecyclerView r0 = r4.a0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.competition.score.teacher.FieldScoreListActivity$a r0 = new com.bxkj.competition.score.teacher.FieldScoreListActivity$a
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.competition.R.layout.item_for_field_score_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.c0
            r0.<init>(r4, r1, r2, r3)
            r4.f657p0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.a0
            r1.setAdapter(r0)
            r4.t0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "录入成绩"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.competition.R.id.rv
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.a0 = r1
            int r1 = com.bxkj.competition.R.id.tb_group
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
