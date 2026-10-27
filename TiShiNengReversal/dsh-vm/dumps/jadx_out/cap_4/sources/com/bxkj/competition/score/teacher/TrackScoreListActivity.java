package com.bxkj.competition.score.teacher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TrackScoreListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private int G0;
    private com.bxkj.base.keyboard.c H0;
    private java.lang.String Y;
    private com.google.android.material.tabs.TabLayout Z;
    private androidx.recyclerview.widget.RecyclerView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> f658k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f659p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity k;

        a(com.bxkj.competition.score.teacher.TrackScoreListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r2.k
                java.lang.String r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.g0(r0)
                java.lang.String r1 = "起点"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L41
                java.lang.String r0 = "start"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                goto L82
            L41:
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r2.k
                java.lang.String r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.g0(r0)
                java.lang.String r1 = "检查"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L56
                java.lang.String r0 = "check"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                goto L82
            L56:
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r2.k
                java.lang.String r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.g0(r0)
                java.lang.String r1 = "名次"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L6b
                java.lang.String r0 = "rank"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                goto L82
            L6b:
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r2.k
                java.lang.String r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.g0(r0)
                java.lang.String r1 = "时间"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L80
                java.lang.String r0 = "time"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                goto L82
            L80:
                java.lang.String r4 = ""
            L82:
                int r0 = com.bxkj.competition.R.id.tv_value
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity a;

        b(com.bxkj.competition.score.teacher.TrackScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.h0(r0)
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
                com.bxkj.competition.score.teacher.TrackScoreListActivity r1 = r5.a
                com.google.android.material.tabs.TabLayout r1 = com.bxkj.competition.score.teacher.TrackScoreListActivity.k0(r1)
                com.bxkj.competition.score.teacher.TrackScoreListActivity r2 = r5.a
                com.google.android.material.tabs.TabLayout r2 = com.bxkj.competition.score.teacher.TrackScoreListActivity.k0(r2)
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
                com.bxkj.competition.score.teacher.TrackScoreListActivity r6 = r5.a
                com.bxkj.competition.score.teacher.TrackScoreListActivity.l0(r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity a;

        c(com.bxkj.competition.score.teacher.TrackScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.m0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.competition.score.teacher.TrackScoreListActivity.o0(r0, r3)
                com.bxkj.competition.score.teacher.TrackScoreListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.competition.score.teacher.TrackScoreListActivity.p0(r3)
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.n0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity a;

        d(com.bxkj.competition.score.teacher.TrackScoreListActivity r1) {
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
                com.bxkj.competition.score.teacher.TrackScoreListActivity r1 = r0.a
                com.bxkj.competition.score.teacher.TrackScoreListActivity.l0(r1)
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity a;

        e(com.bxkj.competition.score.teacher.TrackScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.competition.score.teacher.TrackScoreListActivity r1 = r0.a
                com.bxkj.competition.score.teacher.TrackScoreListActivity.q0(r1, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ int a;
        final /* synthetic */ android.widget.EditText b;
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity c;

        f(com.bxkj.competition.score.teacher.TrackScoreListActivity r1, int r2, android.widget.EditText r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r6 = this;
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r6.c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.p0(r0)
                int r1 = r6.a
                java.lang.Object r0 = r0.getItem(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "traffId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L2f
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.teacher.TrackScoreListActivity r1 = r6.c
                android.content.Context r1 = com.bxkj.competition.score.teacher.TrackScoreListActivity.r0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "该道次为空,不能添加成绩"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                r0.show()
                return
            L2f:
                android.widget.EditText r0 = r6.b
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                com.bxkj.competition.score.teacher.TrackScoreListActivity r2 = r6.c
                java.lang.String r2 = com.bxkj.competition.score.teacher.TrackScoreListActivity.g0(r2)
                java.lang.String r3 = "时间"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L4e
                java.lang.String r2 = "time"
                goto L61
            L4e:
                com.bxkj.competition.score.teacher.TrackScoreListActivity r2 = r6.c
                java.lang.String r2 = com.bxkj.competition.score.teacher.TrackScoreListActivity.g0(r2)
                java.lang.String r3 = "名次"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L5f
                java.lang.String r2 = "rank"
                goto L61
            L5f:
                java.lang.String r2 = ""
            L61:
                java.util.HashMap r3 = new java.util.HashMap
                r4 = 3
                r3.<init>(r4)
                java.lang.String r4 = "_state"
                java.lang.String r5 = "modified"
                r3.put(r4, r5)
                com.bxkj.competition.score.teacher.TrackScoreListActivity r4 = r6.c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.competition.score.teacher.TrackScoreListActivity.p0(r4)
                int r5 = r6.a
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.put(r1, r4)
                r3.put(r2, r0)
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r6.c
                int r1 = r6.a
                com.bxkj.competition.score.teacher.TrackScoreListActivity.s0(r0, r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements android.widget.RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ android.widget.RadioGroup a;
        final /* synthetic */ android.widget.EditText b;
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity c;

        g(com.bxkj.competition.score.teacher.TrackScoreListActivity r1, android.widget.RadioGroup r2, android.widget.EditText r3) {
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
    class h implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ int a;
        final /* synthetic */ android.widget.EditText b;
        final /* synthetic */ android.widget.RadioGroup c;
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity d;

        h(com.bxkj.competition.score.teacher.TrackScoreListActivity r1, int r2, android.widget.EditText r3, android.widget.RadioGroup r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r6 = this;
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r6.d
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.p0(r0)
                int r1 = r6.a
                java.lang.Object r0 = r0.getItem(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "traffId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L2f
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.teacher.TrackScoreListActivity r1 = r6.d
                android.content.Context r1 = com.bxkj.competition.score.teacher.TrackScoreListActivity.i0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "该道次为空,不能添加成绩"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                r0.show()
                return
            L2f:
                android.widget.EditText r0 = r6.b
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                com.bxkj.competition.score.teacher.TrackScoreListActivity r2 = r6.d
                java.lang.String r2 = com.bxkj.competition.score.teacher.TrackScoreListActivity.g0(r2)
                java.lang.String r3 = "起点"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L4e
                java.lang.String r2 = "start"
                goto L61
            L4e:
                com.bxkj.competition.score.teacher.TrackScoreListActivity r2 = r6.d
                java.lang.String r2 = com.bxkj.competition.score.teacher.TrackScoreListActivity.g0(r2)
                java.lang.String r3 = "检查"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L5f
                java.lang.String r2 = "check"
                goto L61
            L5f:
                java.lang.String r2 = ""
            L61:
                java.util.HashMap r3 = new java.util.HashMap
                r4 = 3
                r3.<init>(r4)
                java.lang.String r4 = "_state"
                java.lang.String r5 = "modified"
                r3.put(r4, r5)
                com.bxkj.competition.score.teacher.TrackScoreListActivity r4 = r6.d
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.competition.score.teacher.TrackScoreListActivity.p0(r4)
                int r5 = r6.a
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.put(r1, r4)
                android.widget.RadioGroup r1 = r6.c
                int r1 = r1.getCheckedRadioButtonId()
                android.widget.RadioGroup r4 = r6.c
                r5 = 1
                android.view.View r4 = r4.getChildAt(r5)
                int r4 = r4.getId()
                if (r1 != r4) goto L97
                goto L98
            L97:
                r5 = 0
            L98:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
                r3.put(r2, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto Laa
                java.lang.String r1 = "memo"
                r3.put(r1, r0)
            Laa:
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r6.d
                int r1 = r6.a
                com.bxkj.competition.score.teacher.TrackScoreListActivity.s0(r0, r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ int b;
        final /* synthetic */ com.bxkj.competition.score.teacher.TrackScoreListActivity c;

        i(com.bxkj.competition.score.teacher.TrackScoreListActivity r1, java.util.Map r2, int r3) {
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
                com.bxkj.competition.score.teacher.TrackScoreListActivity r0 = r1.c
                android.content.Context r0 = com.bxkj.competition.score.teacher.TrackScoreListActivity.j0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                java.util.Map r5 = r4.a
                java.lang.String r0 = "start"
                boolean r5 = r5.containsKey(r0)
                java.lang.String r1 = "未犯规"
                java.lang.String r2 = "犯规"
                if (r5 == 0) goto L1c
                java.util.Map r5 = r4.a
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r5, r0)
                if (r3 == 0) goto L18
                r3 = r2
                goto L19
            L18:
                r3 = r1
            L19:
                r5.put(r0, r3)
            L1c:
                java.util.Map r5 = r4.a
                java.lang.String r0 = "check"
                boolean r5 = r5.containsKey(r0)
                if (r5 == 0) goto L32
                java.util.Map r5 = r4.a
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r5, r0)
                if (r3 == 0) goto L2f
                r1 = r2
            L2f:
                r5.put(r0, r1)
            L32:
                java.util.Map r5 = r4.a
                java.lang.String r0 = "time"
                boolean r5 = r5.containsKey(r0)
                if (r5 == 0) goto L45
                java.util.Map r5 = r4.a
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r5.put(r0, r1)
            L45:
                java.util.Map r5 = r4.a
                java.lang.String r0 = "rank"
                boolean r5 = r5.containsKey(r0)
                if (r5 == 0) goto L58
                java.util.Map r5 = r4.a
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r5.put(r0, r1)
            L58:
                com.bxkj.competition.score.teacher.TrackScoreListActivity r5 = r4.c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r5 = com.bxkj.competition.score.teacher.TrackScoreListActivity.p0(r5)
                int r0 = r4.b
                java.lang.Object r5 = r5.getItem(r0)
                java.util.Map r5 = (java.util.Map) r5
                java.util.Map r0 = r4.a
                r5.putAll(r0)
                com.bxkj.competition.score.teacher.TrackScoreListActivity r5 = r4.c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r5 = com.bxkj.competition.score.teacher.TrackScoreListActivity.p0(r5)
                int r0 = r4.b
                r5.notifyItemChanged(r0)
                com.bxkj.competition.score.teacher.TrackScoreListActivity r5 = r4.c
                int r0 = r4.b
                int r0 = r0 + 1
                com.bxkj.competition.score.teacher.TrackScoreListActivity.q0(r5, r0)
                return
        }
    }

    public TrackScoreListActivity() {
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

    static /* synthetic */ java.lang.String g0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            java.lang.String r0 = r0.F0
            return r0
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ com.google.android.material.tabs.TabLayout k0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            com.google.android.material.tabs.TabLayout r0 = r0.Z
            return r0
    }

    static /* synthetic */ void l0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            r0.v0()
            return
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ java.util.List n0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* synthetic */ java.util.List o0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0, java.util.List r1) {
            r0.c0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter p0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f659p0
            return r0
    }

    static /* synthetic */ void q0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0, int r1) {
            r0.w0(r1)
            return
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ void s0(com.bxkj.competition.score.teacher.TrackScoreListActivity r0, java.util.Map r1, int r2) {
            r0.t0(r1, r2)
            return
    }

    private void t0(java.util.Map<java.lang.String, java.lang.Object> r5, int r6) {
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
            com.bxkj.competition.score.teacher.TrackScoreListActivity$i r1 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$i
            r1.<init>(r4, r5, r6)
            r0.setDataListener(r1)
            return
    }

    private void u0() {
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
            com.bxkj.competition.score.teacher.TrackScoreListActivity$b r1 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void v0() {
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
            com.bxkj.competition.score.teacher.TrackScoreListActivity$c r1 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private void w0(int r10) {
            r9 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r9.f659p0
            int r0 = r0.getItemCount()
            if (r10 < r0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r10 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r9.V
            r10.<init>(r0)
            java.lang.String r0 = "最后一条已录入完毕"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r10 = r10.setMessage(r0)
            r10.show()
            return
        L19:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r9.f659p0
            java.lang.Object r0 = r0.getItem(r10)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r9.F0
            java.lang.String r2 = "起点"
            boolean r1 = r1.equals(r2)
            java.lang.String r2 = "时间"
            java.lang.String r3 = "名次"
            if (r1 == 0) goto L36
            java.lang.String r1 = "start"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            goto L67
        L36:
            java.lang.String r1 = r9.F0
            java.lang.String r4 = "检查"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L47
            java.lang.String r1 = "check"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            goto L67
        L47:
            java.lang.String r1 = r9.F0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            java.lang.String r1 = "rank"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            goto L67
        L56:
            java.lang.String r1 = r9.F0
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L65
            java.lang.String r1 = "time"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            goto L67
        L65:
            java.lang.String r1 = ""
        L67:
            int r4 = r9.G0
            r5 = 1
            java.lang.String r6 = "name"
            if (r4 != 0) goto L12c
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r4 = r9.V
            r0.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "道次："
            r4.append(r7)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r7 = r9.f659p0
            java.lang.Object r7 = r7.getItem(r10)
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r8 = "passNum"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r8)
            r4.append(r7)
            java.lang.String r7 = "\u3000姓名："
            r4.append(r7)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r7 = r9.f659p0
            java.lang.Object r7 = r7.getItem(r10)
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r6)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setTitle(r4)
            int r4 = com.bxkj.competition.R.layout.dialog_add_score_input
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setCenterCustomView(r4)
            int r4 = com.bxkj.competition.R.id.et_value
            android.view.View r4 = r0.findViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            r4.setText(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "请输入"
            r1.append(r6)
            java.lang.String r6 = r9.F0
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r4.setHint(r1)
            java.lang.String r1 = r9.F0
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lf2
            java.lang.String r1 = "0123456789:."
            android.text.method.DigitsKeyListener r1 = android.text.method.DigitsKeyListener.getInstance(r1)
            r4.setKeyListener(r1)
            com.bxkj.base.util.w r1 = new com.bxkj.base.util.w
            r1.<init>()
            android.text.InputFilter[] r2 = new android.text.InputFilter[r5]
            r3 = 0
            r2[r3] = r1
            r4.setFilters(r2)
            goto L103
        Lf2:
            java.lang.String r1 = r9.F0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L103
            java.lang.String r1 = "0123456789"
            android.text.method.DigitsKeyListener r1 = android.text.method.DigitsKeyListener.getInstance(r1)
            r4.setKeyListener(r1)
        L103:
            android.view.Window r1 = r0.getWindow()
            android.view.WindowManager$LayoutParams r2 = r1.getAttributes()
            r3 = 17
            r1.setGravity(r3)
            r3 = -1
            r2.width = r3
            r2.height = r3
            r0.onWindowAttributesChanged(r2)
            r1.setAttributes(r2)
            com.bxkj.base.keyboard.c r1 = r9.H0
            r1.a(r4)
            com.bxkj.competition.score.teacher.TrackScoreListActivity$f r1 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$f
            r1.<init>(r9, r10, r4)
            r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
        L12c:
            if (r4 != r5) goto L19b
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r3 = r9.V
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "姓名："
            r3.append(r4)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r4 = r9.f659p0
            java.lang.Object r4 = r4.getItem(r10)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setTitle(r3)
            int r3 = com.bxkj.competition.R.layout.dialog_add_score_radiot
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setCenterCustomView(r3)
            int r3 = com.bxkj.competition.R.id.et_value
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            int r4 = com.bxkj.competition.R.id.rg
            android.view.View r4 = r2.findViewById(r4)
            android.widget.RadioGroup r4 = (android.widget.RadioGroup) r4
            com.bxkj.competition.score.teacher.TrackScoreListActivity$g r6 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$g
            r6.<init>(r9, r4, r3)
            r4.setOnCheckedChangeListener(r6)
            java.lang.String r6 = "犯规"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L187
            android.view.View r1 = r4.getChildAt(r5)
            int r1 = r1.getId()
            r4.check(r1)
        L187:
            java.lang.String r1 = "memo"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            r3.setText(r0)
            com.bxkj.competition.score.teacher.TrackScoreListActivity$h r0 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$h
            r0.<init>(r9, r10, r3, r4)
            r2.setRightButtonOnClickListener(r0)
            r2.show()
        L19b:
            return
    }

    public void L() {
            r2 = this;
            com.google.android.material.tabs.TabLayout r0 = r2.Z
            com.bxkj.competition.score.teacher.TrackScoreListActivity$d r1 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$d
            r1.<init>(r2)
            r0.addOnTabSelectedListener(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f659p0
            com.bxkj.competition.score.teacher.TrackScoreListActivity$e r1 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$e
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
            com.bxkj.base.keyboard.c r0 = new com.bxkj.base.keyboard.c
            r0.<init>(r4)
            r4.H0 = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "scheduleId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1d
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.Y = r0
        L1d:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "type"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L34
            android.content.Intent r0 = r4.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r4.G0 = r0
        L34:
            androidx.recyclerview.widget.RecyclerView r0 = r4.a0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.competition.score.teacher.TrackScoreListActivity$a r0 = new com.bxkj.competition.score.teacher.TrackScoreListActivity$a
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.competition.R.layout.item_for_student_score_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.c0
            r0.<init>(r4, r1, r2, r3)
            r4.f659p0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.a0
            r1.setAdapter(r0)
            r4.u0()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "录入成绩"
            r2.setTitle(r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "menu"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L31
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.F0 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.F0
            r0.append(r1)
            java.lang.String r1 = "录入"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setTitle(r0)
        L31:
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
