package com.bxkj.competition.score;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CompetitionProjectListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> H0;
    private java.lang.String I0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f650k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f651p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.d {
        final /* synthetic */ com.bxkj.competition.score.CompetitionProjectListActivity a;

        a(com.bxkj.competition.score.CompetitionProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void n(l2.h r1) {
                r0 = this;
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r0.a
                com.bxkj.competition.score.CompetitionProjectListActivity.h0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.score.CompetitionProjectListActivity k;

        b(com.bxkj.competition.score.CompetitionProjectListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                int r0 = com.bxkj.competition.R.id.tv_name
                java.lang.String r1 = "sportItem"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r5.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_group
                java.lang.String r1 = "groupName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r5.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_progress
                java.lang.String r1 = "gameForm"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r5.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_type
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "分组："
                r1.append(r2)
                java.lang.String r2 = "group"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L3c
                java.lang.String r2 = "未分组"
                goto L40
            L3c:
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            L40:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_time
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "sportCompetitionDateName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r1.append(r2)
                java.lang.String r2 = "competitionTime"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_type2
                java.lang.String r1 = "type"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                java.lang.String r1 = "1"
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto L7d
                java.lang.String r6 = "径赛"
                goto L7f
            L7d:
                java.lang.String r6 = "田赛"
            L7f:
                r5.J(r0, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.CompetitionProjectListActivity a;

        c(com.bxkj.competition.score.CompetitionProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.score.CompetitionProjectListActivity.s0(r0)
                r0.w0()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.CompetitionProjectListActivity.i0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.competition.score.CompetitionProjectListActivity.u0(r0, r3)
                com.bxkj.competition.score.CompetitionProjectListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.competition.score.CompetitionProjectListActivity.v0(r3)
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.score.CompetitionProjectListActivity.t0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.competition.score.CompetitionProjectListActivity a;

        d(com.bxkj.competition.score.CompetitionProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r4, android.view.View r5, java.lang.Object r6, int r7) {
                r3 = this;
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                int r4 = r4.getUserType()
                r5 = 2
                java.lang.String r6 = "id"
                java.lang.String r0 = "scheduleId"
                if (r4 != r5) goto L77
                com.bxkj.competition.score.CompetitionProjectListActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.competition.score.CompetitionProjectListActivity.v0(r4)
                java.lang.Object r4 = r4.getItem(r7)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "type"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "1"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L50
                com.bxkj.competition.score.CompetitionProjectListActivity r4 = r3.a
                android.content.Intent r5 = new android.content.Intent
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.competition.score.CompetitionProjectListActivity.w0(r1)
                java.lang.Class<com.bxkj.competition.score.teacher.AddScoreMenuActivity> r2 = com.bxkj.competition.score.teacher.AddScoreMenuActivity.class
                r5.<init>(r1, r2)
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.competition.score.CompetitionProjectListActivity.v0(r1)
                java.lang.Object r7 = r1.getItem(r7)
                java.util.Map r7 = (java.util.Map) r7
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r6)
                android.content.Intent r5 = r5.putExtra(r0, r6)
                r4.startActivity(r5)
                return
            L50:
                com.bxkj.competition.score.CompetitionProjectListActivity r4 = r3.a
                android.content.Intent r5 = new android.content.Intent
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.competition.score.CompetitionProjectListActivity.x0(r1)
                java.lang.Class<com.bxkj.competition.score.teacher.FieldScoreListActivity> r2 = com.bxkj.competition.score.teacher.FieldScoreListActivity.class
                r5.<init>(r1, r2)
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.competition.score.CompetitionProjectListActivity.v0(r1)
                java.lang.Object r7 = r1.getItem(r7)
                java.util.Map r7 = (java.util.Map) r7
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r6)
                android.content.Intent r5 = r5.putExtra(r0, r6)
                r4.startActivity(r5)
                return
            L77:
                com.bxkj.competition.score.CompetitionProjectListActivity r4 = r3.a
                android.content.Intent r5 = new android.content.Intent
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.competition.score.CompetitionProjectListActivity.y0(r1)
                java.lang.Class<com.bxkj.competition.score.student.StudentScoreListActivity> r2 = com.bxkj.competition.score.student.StudentScoreListActivity.class
                r5.<init>(r1, r2)
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.competition.score.CompetitionProjectListActivity.v0(r1)
                java.lang.Object r7 = r1.getItem(r7)
                java.util.Map r7 = (java.util.Map) r7
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r6)
                android.content.Intent r5 = r5.putExtra(r0, r6)
                r4.startActivity(r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.CompetitionProjectListActivity a;

        e(com.bxkj.competition.score.CompetitionProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.CompetitionProjectListActivity.z0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r3.a
                java.lang.String r1 = "data"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r1)
                com.bxkj.competition.score.CompetitionProjectListActivity.B0(r0, r4)
                java.util.HashMap r4 = new java.util.HashMap
                r0 = 2
                r4.<init>(r0)
                java.lang.String r0 = "id"
                java.lang.String r1 = "-1"
                r4.put(r0, r1)
                java.lang.String r0 = "name"
                java.lang.String r1 = "全部时间"
                r4.put(r0, r1)
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.competition.score.CompetitionProjectListActivity.A0(r0)
                r1 = 0
                r0.add(r1, r4)
                com.bxkj.competition.score.CompetitionProjectListActivity r4 = r3.a
                android.widget.TextView r0 = com.bxkj.competition.score.CompetitionProjectListActivity.j0(r4)
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                java.util.List r1 = com.bxkj.competition.score.CompetitionProjectListActivity.A0(r1)
                java.lang.String r2 = "请选择时间"
                r4.J0(r0, r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.CompetitionProjectListActivity a;

        f(com.bxkj.competition.score.CompetitionProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.CompetitionProjectListActivity.k0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r3.a
                java.lang.String r1 = "data"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r1)
                com.bxkj.competition.score.CompetitionProjectListActivity.m0(r0, r4)
                java.util.HashMap r4 = new java.util.HashMap
                r0 = 2
                r4.<init>(r0)
                java.lang.String r0 = "id"
                java.lang.String r1 = "-1"
                r4.put(r0, r1)
                java.lang.String r0 = "name"
                java.lang.String r1 = "全部分组"
                r4.put(r0, r1)
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.competition.score.CompetitionProjectListActivity.l0(r0)
                r1 = 0
                r0.add(r1, r4)
                com.bxkj.competition.score.CompetitionProjectListActivity r4 = r3.a
                android.widget.TextView r0 = com.bxkj.competition.score.CompetitionProjectListActivity.n0(r4)
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                java.util.List r1 = com.bxkj.competition.score.CompetitionProjectListActivity.l0(r1)
                java.lang.String r2 = "请选择组别"
                r4.J0(r0, r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.score.CompetitionProjectListActivity a;

        g(com.bxkj.competition.score.CompetitionProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.score.CompetitionProjectListActivity.o0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r3.a
                java.lang.String r1 = "data"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r1)
                com.bxkj.competition.score.CompetitionProjectListActivity.q0(r0, r4)
                java.util.HashMap r4 = new java.util.HashMap
                r0 = 2
                r4.<init>(r0)
                java.lang.String r0 = "id"
                java.lang.String r1 = "-1"
                r4.put(r0, r1)
                java.lang.String r0 = "name"
                java.lang.String r1 = "全部项目"
                r4.put(r0, r1)
                com.bxkj.competition.score.CompetitionProjectListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.competition.score.CompetitionProjectListActivity.p0(r0)
                r1 = 0
                r0.add(r1, r4)
                com.bxkj.competition.score.CompetitionProjectListActivity r4 = r3.a
                android.widget.TextView r0 = com.bxkj.competition.score.CompetitionProjectListActivity.r0(r4)
                com.bxkj.competition.score.CompetitionProjectListActivity r1 = r3.a
                java.util.List r1 = com.bxkj.competition.score.CompetitionProjectListActivity.p0(r1)
                java.lang.String r2 = "请选择项目"
                r4.J0(r0, r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ android.widget.TextView a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ com.bxkj.competition.score.CompetitionProjectListActivity c;

        h(com.bxkj.competition.score.CompetitionProjectListActivity r1, android.widget.TextView r2, java.util.List r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                android.widget.TextView r3 = r2.a
                java.util.List r0 = r2.b
                java.lang.Object r0 = r0.get(r4)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.base.utils.u.O(r0, r1)
                r3.setText(r0)
                android.widget.TextView r3 = r2.a
                java.util.List r0 = r2.b
                java.lang.Object r4 = r0.get(r4)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r0 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.base.utils.u.O(r4, r0)
                r3.setTag(r4)
                android.widget.TextView r3 = r2.a
                int r3 = r3.getId()
                com.bxkj.competition.score.CompetitionProjectListActivity r4 = r2.c
                android.widget.TextView r4 = com.bxkj.competition.score.CompetitionProjectListActivity.n0(r4)
                int r4 = r4.getId()
                if (r3 != r4) goto L4e
                com.bxkj.competition.score.CompetitionProjectListActivity r3 = r2.c
                android.widget.TextView r3 = com.bxkj.competition.score.CompetitionProjectListActivity.r0(r3)
                java.lang.String r4 = "全部项目"
                r3.setText(r4)
                com.bxkj.competition.score.CompetitionProjectListActivity r3 = r2.c
                android.widget.TextView r3 = com.bxkj.competition.score.CompetitionProjectListActivity.r0(r3)
                java.lang.String r4 = "-1"
                r3.setTag(r4)
            L4e:
                com.bxkj.competition.score.CompetitionProjectListActivity r3 = r2.c
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = com.bxkj.competition.score.CompetitionProjectListActivity.s0(r3)
                r3.D()
                return
        }
    }

    public CompetitionProjectListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f650k0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f651p0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.F0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.G0 = r0
            return
    }

    static /* synthetic */ java.util.List A0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f650k0
            return r0
    }

    static /* synthetic */ java.util.List B0(com.bxkj.competition.score.CompetitionProjectListActivity r0, java.util.List r1) {
            r0.f650k0 = r1
            return r1
    }

    private void C0(android.app.Dialog r4, int r5) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "android:id/titleDivider"
            r2 = 0
            int r0 = r0.getIdentifier(r1, r2, r2)
            android.view.View r4 = r4.findViewById(r0)
            if (r4 == 0) goto L18
            r4.setBackgroundColor(r5)
        L18:
            return
    }

    private void D0() {
            r8 = this;
            android.content.Context r0 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r8.I0
            android.widget.TextView r3 = r8.b0
            java.lang.Object r3 = r3.getTag()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "-1"
            boolean r3 = r3.equals(r4)
            r5 = 0
            if (r3 == 0) goto L2d
            r3 = r5
            goto L33
        L2d:
            android.widget.TextView r3 = r8.b0
            java.lang.Object r3 = r3.getTag()
        L33:
            android.widget.TextView r6 = r8.c0
            java.lang.Object r6 = r6.getTag()
            java.lang.String r6 = r6.toString()
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L45
            r6 = r5
            goto L4b
        L45:
            android.widget.TextView r6 = r8.c0
            java.lang.Object r6 = r6.getTag()
        L4b:
            android.widget.TextView r7 = r8.a0
            java.lang.Object r7 = r7.getTag()
            java.lang.String r7 = r7.toString()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L5c
            goto L62
        L5c:
            android.widget.TextView r4 = r8.a0
            java.lang.Object r5 = r4.getTag()
        L62:
            rx.e r1 = r1.v(r2, r3, r6, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.CompetitionProjectListActivity$c r1 = new com.bxkj.competition.score.CompetitionProjectListActivity$c
            r1.<init>(r8)
            r0.setDataListener(r1)
            return
    }

    private void E0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r3.I0
            rx.e r1 = r1.x(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.CompetitionProjectListActivity$e r1 = new com.bxkj.competition.score.CompetitionProjectListActivity$e
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void F0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r3.I0
            rx.e r1 = r1.t(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.CompetitionProjectListActivity$f r1 = new com.bxkj.competition.score.CompetitionProjectListActivity$f
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void G0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            android.widget.TextView r2 = r3.b0
            java.lang.Object r2 = r2.getTag()
            java.lang.String r2 = r2.toString()
            rx.e r1 = r1.o(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.score.CompetitionProjectListActivity$g r1 = new com.bxkj.competition.score.CompetitionProjectListActivity$g
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void H0() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.competition.score.CompetitionProjectListActivity$b r0 = new com.bxkj.competition.score.CompetitionProjectListActivity$b
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.competition.R.layout.item_for_addscore_project_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.G0
            r0.<init>(r4, r1, r2, r3)
            r4.H0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            int r1 = com.bxkj.competition.R.id.tv_emptyView
            android.view.View r1 = r4.findViewById(r1)
            r0.setEmptyView(r1)
            return
    }

    private void I0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.competition.score.CompetitionProjectListActivity$a r1 = new com.bxkj.competition.score.CompetitionProjectListActivity$a
            r1.<init>(r2)
            r0.l1(r1)
            return
    }

    static /* synthetic */ void h0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            r0.D0()
            return
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.widget.TextView j0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ java.util.List l0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f651p0
            return r0
    }

    static /* synthetic */ java.util.List m0(com.bxkj.competition.score.CompetitionProjectListActivity r0, java.util.List r1) {
            r0.f651p0 = r1
            return r1
    }

    static /* synthetic */ android.widget.TextView n0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ java.util.List p0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* synthetic */ java.util.List q0(com.bxkj.competition.score.CompetitionProjectListActivity r0, java.util.List r1) {
            r0.F0 = r1
            return r1
    }

    static /* synthetic */ android.widget.TextView r0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout s0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* synthetic */ java.util.List t0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.G0
            return r0
    }

    static /* synthetic */ java.util.List u0(com.bxkj.competition.score.CompetitionProjectListActivity r0, java.util.List r1) {
            r0.G0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter v0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.H0
            return r0
    }

    static /* synthetic */ android.content.Context w0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context x0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context y0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context z0(com.bxkj.competition.score.CompetitionProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public void J0(android.widget.TextView r6, java.lang.String r7, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r8) {
            r5 = this;
            int r0 = r8.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L7:
            int r2 = r8.size()
            if (r1 >= r2) goto L1e
            java.lang.Object r2 = r8.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "name"
            java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r2, r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L1e:
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            android.content.Context r2 = r5.V
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.bxkj.competition.R.layout.dialog_title
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4)
            int r3 = com.bxkj.competition.R.id.tvTitle
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r7)
            r1.setCustomTitle(r2)
            com.bxkj.competition.score.CompetitionProjectListActivity$h r7 = new com.bxkj.competition.score.CompetitionProjectListActivity$h
            r7.<init>(r5, r6, r8)
            r1.setItems(r0, r7)
            androidx.appcompat.app.AlertDialog r6 = r1.create()
            android.widget.ListView r7 = r6.getListView()
            android.graphics.drawable.ColorDrawable r8 = new android.graphics.drawable.ColorDrawable
            java.lang.String r0 = "#999999"
            int r0 = android.graphics.Color.parseColor(r0)
            r8.<init>(r0)
            r7.setDivider(r8)
            android.widget.ListView r7 = r6.getListView()
            r8 = 1056964608(0x3f000000, float:0.5)
            android.content.Context r0 = r5.V
            int r8 = r5.g0(r8, r0)
            r7.setDividerHeight(r8)
            r6.show()
            java.lang.String r7 = "#8e8b8b"
            int r7 = android.graphics.Color.parseColor(r7)
            r5.C0(r6, r7)
            return
    }

    public void L() {
            r2 = this;
            android.widget.TextView r0 = r2.a0
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.b0
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.c0
            r0.setOnClickListener(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.H0
            com.bxkj.competition.score.CompetitionProjectListActivity$d r1 = new com.bxkj.competition.score.CompetitionProjectListActivity$d
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_addscore_project_list
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "competitionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.I0 = r0
        L16:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "id"
            java.lang.String r2 = "-1"
            r0.put(r1, r2)
            java.lang.String r1 = "name"
            java.lang.String r2 = "全部项目"
            r0.put(r1, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.F0
            r1.add(r0)
            r3.I0()
            r3.H0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.Y
            r1 = 1
            r0.X0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.Y
            r1 = 0
            r0.S0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "竞赛项目列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.competition.R.id.refresh
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            int r1 = com.bxkj.competition.R.id.recyclerView
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            int r1 = com.bxkj.competition.R.id.tv_time
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            int r1 = com.bxkj.competition.R.id.tv_group
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            int r1 = com.bxkj.competition.R.id.tv_project
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            return
    }

    public int g0(float r3, android.content.Context r4) {
            r2 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            android.view.Display r4 = r4.getDefaultDisplay()
            r4.getMetrics(r0)
            float r4 = r0.density
            float r3 = r3 * r4
            double r3 = (double) r3
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r3 = r3 + r0
            int r3 = (int) r3
            return r3
    }

    public void onClick(android.view.View r4) {
            r3 = this;
            int r0 = r4.getId()
            android.widget.TextView r1 = r3.a0
            int r1 = r1.getId()
            java.lang.String r2 = "请选择组别"
            if (r0 != r1) goto L25
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r3.f650k0
            if (r4 == 0) goto L21
            int r4 = r4.size()
            if (r4 != 0) goto L19
            goto L21
        L19:
            android.widget.TextView r4 = r3.a0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.f650k0
            r3.J0(r4, r2, r0)
            return
        L21:
            r3.E0()
            return
        L25:
            int r0 = r4.getId()
            android.widget.TextView r1 = r3.b0
            int r1 = r1.getId()
            if (r0 != r1) goto L48
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r3.f651p0
            if (r4 == 0) goto L44
            int r4 = r4.size()
            if (r4 != 0) goto L3c
            goto L44
        L3c:
            android.widget.TextView r4 = r3.b0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.f651p0
            r3.J0(r4, r2, r0)
            return
        L44:
            r3.F0()
            return
        L48:
            int r4 = r4.getId()
            android.widget.TextView r0 = r3.c0
            int r0 = r0.getId()
            if (r4 != r0) goto L83
            android.widget.TextView r4 = r3.b0
            java.lang.Object r4 = r4.getTag()
            if (r4 == 0) goto L73
            android.widget.TextView r4 = r3.b0
            java.lang.Object r4 = r4.getTag()
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "-1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L6f
            goto L73
        L6f:
            r3.G0()
            return
        L73:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            java.lang.String r0 = "请先选择组别"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
        L83:
            return
    }
}
