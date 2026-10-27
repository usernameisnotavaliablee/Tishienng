package com.bxkj.competition.signup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CostProjectListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.LinearLayout F0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private int H0;
    private int I0;
    private int J0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> K0;
    private java.lang.String L0;
    private com.bxkj.competition.signup.StickyDecoration M0;
    private java.lang.String N0;
    private int O0;
    private double P0;
    private double Q0;
    private double R0;
    private int S0;
    private java.lang.StringBuilder T0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f664k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.CheckBox f665p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.competition.signup.CostProjectListActivity a;

        a(com.bxkj.competition.signup.CostProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.competition.signup.CostProjectListActivity r4 = r3.a
                int r4 = com.bxkj.competition.signup.CostProjectListActivity.g0(r4)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r3.a
                int r0 = com.bxkj.competition.signup.CostProjectListActivity.i0(r0)
                int r4 = r4 / r0
                com.bxkj.competition.signup.CostProjectListActivity r0 = r3.a
                int r0 = com.bxkj.competition.signup.CostProjectListActivity.r0(r0)
                com.bxkj.competition.signup.CostProjectListActivity r1 = r3.a
                int r1 = com.bxkj.competition.signup.CostProjectListActivity.g0(r1)
                com.bxkj.competition.signup.CostProjectListActivity r2 = r3.a
                int r2 = com.bxkj.competition.signup.CostProjectListActivity.i0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.competition.signup.CostProjectListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.competition.signup.CostProjectListActivity.u0(r4)
                r4.q0()
                com.bxkj.competition.signup.CostProjectListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.competition.signup.CostProjectListActivity r4 = r3.a
                com.bxkj.competition.signup.CostProjectListActivity.t0(r4)
                com.bxkj.competition.signup.CostProjectListActivity r4 = r3.a
                com.bxkj.competition.signup.CostProjectListActivity.v0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.competition.signup.CostProjectListActivity r2 = r1.a
                r0 = 1
                com.bxkj.competition.signup.CostProjectListActivity.s0(r2, r0)
                com.bxkj.competition.signup.CostProjectListActivity r2 = r1.a
                com.bxkj.competition.signup.CostProjectListActivity.v0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.signup.CostProjectListActivity a;

        b(com.bxkj.competition.signup.CostProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ int a(int r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                int r1 = r0.c(r1, r2)
                return r1
        }

        public int b(int r1) {
                r0 = this;
                int r1 = com.bxkj.competition.R.layout.item_for_competition_cost
                return r1
        }

        public int c(int r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.bxkj.competition.signup.CostProjectListActivity f666l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.widget.CompoundButton.OnCheckedChangeListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.competition.signup.CostProjectListActivity.c b;

            a(com.bxkj.competition.signup.CostProjectListActivity.c r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
                    r1 = this;
                    java.util.Map r2 = r1.a
                    java.lang.String r0 = "isChecked"
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    r2.put(r0, r3)
                    com.bxkj.competition.signup.CostProjectListActivity$c r2 = r1.b
                    com.bxkj.competition.signup.CostProjectListActivity r2 = r2.f666l
                    com.bxkj.competition.signup.CostProjectListActivity.z0(r2)
                    return
            }
        }

        c(com.bxkj.competition.signup.CostProjectListActivity r1, android.content.Context r2, java.util.List r3, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r4) {
                r0 = this;
                r0.f666l = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                int r0 = com.bxkj.competition.R.id.tv_name
                java.lang.String r1 = "itemName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r7.J(r0, r1)
                java.lang.String r0 = "operation"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
                int r1 = com.bxkj.competition.R.id.cb
                android.view.View r1 = r7.h(r1)
                android.widget.CheckBox r1 = (android.widget.CheckBox) r1
                com.bxkj.competition.signup.CostProjectListActivity r2 = r6.f666l
                java.lang.String r2 = com.bxkj.competition.signup.CostProjectListActivity.w0(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L71
                int r2 = com.bxkj.competition.R.id.tv_price
                com.bxkj.competition.signup.CostProjectListActivity r5 = r6.f666l
                int r5 = com.bxkj.competition.signup.CostProjectListActivity.x0(r5)
                if (r5 != r4) goto L33
                r5 = 1
                goto L34
            L33:
                r5 = 0
            L34:
                r7.N(r2, r5)
                java.lang.String r5 = "isChecked"
                boolean r5 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r8, r5)
                r1.setChecked(r5)
                com.bxkj.competition.signup.CostProjectListActivity$c$a r5 = new com.bxkj.competition.signup.CostProjectListActivity$c$a
                r5.<init>(r6, r8)
                r1.setOnCheckedChangeListener(r5)
                if (r0 == 0) goto L4c
                r5 = 1
                goto L4d
            L4c:
                r5 = 0
            L4d:
                r1.setChecked(r5)
                if (r0 != 0) goto L53
                r3 = 1
            L53:
                r1.setEnabled(r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "￥"
                r0.append(r1)
                java.lang.String r1 = "itemEntryFee"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getMoney(r8, r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r7.J(r2, r8)
                return
            L71:
                if (r0 != r4) goto L81
                r1.setChecked(r4)
                r1.setEnabled(r3)
                int r8 = com.bxkj.competition.R.id.tv_price
                java.lang.String r0 = "待审核"
                r7.J(r8, r0)
                return
            L81:
                r2 = 2
                if (r0 != r2) goto L92
                r1.setChecked(r4)
                r1.setEnabled(r3)
                int r8 = com.bxkj.competition.R.id.tv_price
                java.lang.String r0 = "驳回"
                r7.J(r8, r0)
                return
            L92:
                r2 = 3
                if (r0 != r2) goto La3
                r1.setChecked(r4)
                r1.setEnabled(r3)
                int r8 = com.bxkj.competition.R.id.tv_price
                java.lang.String r0 = "院系通过"
                r7.J(r8, r0)
                return
            La3:
                r2 = 4
                if (r0 != r2) goto Lb4
                r1.setChecked(r4)
                r1.setEnabled(r3)
                int r8 = com.bxkj.competition.R.id.tv_price
                java.lang.String r0 = "体育部审核"
                r7.J(r8, r0)
                return
            Lb4:
                r2 = 5
                if (r0 != r2) goto Lc5
                r1.setChecked(r4)
                r1.setEnabled(r3)
                int r8 = com.bxkj.competition.R.id.tv_price
                java.lang.String r0 = "体育部通过"
                r7.J(r8, r0)
                return
            Lc5:
                r1.setChecked(r4)
                r1.setEnabled(r3)
                int r0 = com.bxkj.competition.R.id.tv_price
                java.lang.String r1 = "status"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r7.J(r0, r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.signup.CostProjectListActivity a;

        d(com.bxkj.competition.signup.CostProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.competition.signup.CostProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.signup.CostProjectListActivity.u0(r0)
                r0.w0()
                com.bxkj.competition.signup.CostProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.signup.CostProjectListActivity.u0(r0)
                r0.q0()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.signup.CostProjectListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.signup.CostProjectListActivity.q0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r7) {
                r6 = this;
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                java.lang.String r1 = "signupType"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r1)
                com.bxkj.competition.signup.CostProjectListActivity.y0(r0, r1)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r7, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.competition.signup.CostProjectListActivity.h0(r0, r1)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                int r0 = com.bxkj.competition.signup.CostProjectListActivity.x0(r0)
                r1 = 2
                java.lang.String r2 = "competitionEntryFee"
                java.lang.String r3 = "￥"
                if (r0 != r1) goto L43
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.competition.signup.CostProjectListActivity.A0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getMoney(r7, r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
            L43:
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                double r1 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r2)
                com.bxkj.competition.signup.CostProjectListActivity.B0(r0, r1)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                java.lang.String r1 = "insuranceFee"
                double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r1)
                com.bxkj.competition.signup.CostProjectListActivity.j0(r0, r4)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.competition.signup.CostProjectListActivity.k0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getMoney(r7, r1)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.setText(r1)
                java.lang.String r0 = "itemDetail"
                java.lang.Object r7 = r7.get(r0)
                java.util.List r7 = (java.util.List) r7
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                int r0 = com.bxkj.competition.signup.CostProjectListActivity.r0(r0)
                r1 = 1
                if (r0 != r1) goto L8a
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                com.bxkj.competition.signup.CostProjectListActivity.m0(r0, r7)
                goto L93
            L8a:
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                java.util.List r0 = com.bxkj.competition.signup.CostProjectListActivity.l0(r0)
                r0.addAll(r7)
            L93:
                com.bxkj.competition.signup.CostProjectListActivity r7 = r6.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r7 = com.bxkj.competition.signup.CostProjectListActivity.n0(r7)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                java.util.List r0 = com.bxkj.competition.signup.CostProjectListActivity.l0(r0)
                r7.g(r0)
                com.bxkj.competition.signup.CostProjectListActivity r7 = r6.a     // Catch: java.lang.Exception -> Lb1
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r7 = com.bxkj.competition.signup.CostProjectListActivity.p0(r7)     // Catch: java.lang.Exception -> Lb1
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a     // Catch: java.lang.Exception -> Lb1
                com.bxkj.competition.signup.StickyDecoration r0 = com.bxkj.competition.signup.CostProjectListActivity.o0(r0)     // Catch: java.lang.Exception -> Lb1
                r7.removeItemDecoration(r0)     // Catch: java.lang.Exception -> Lb1
            Lb1:
                com.bxkj.competition.signup.CostProjectListActivity r7 = r6.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r7 = com.bxkj.competition.signup.CostProjectListActivity.p0(r7)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r6.a
                com.bxkj.competition.signup.StickyDecoration r0 = com.bxkj.competition.signup.CostProjectListActivity.o0(r0)
                r7.addItemDecoration(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.signup.CostProjectListActivity a;

        e(com.bxkj.competition.signup.CostProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.competition.signup.CostProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.signup.CostProjectListActivity.u0(r0)
                r0.w0()
                com.bxkj.competition.signup.CostProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.signup.CostProjectListActivity.u0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.signup.CostProjectListActivity r0 = r2.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r3, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.competition.signup.CostProjectListActivity.h0(r0, r1)
                java.lang.String r0 = "data"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.competition.signup.CostProjectListActivity r0 = r2.a
                int r0 = com.bxkj.competition.signup.CostProjectListActivity.r0(r0)
                r1 = 1
                if (r0 != r1) goto L26
                com.bxkj.competition.signup.CostProjectListActivity r0 = r2.a
                com.bxkj.competition.signup.CostProjectListActivity.m0(r0, r3)
                goto L2f
            L26:
                com.bxkj.competition.signup.CostProjectListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.signup.CostProjectListActivity.l0(r0)
                r0.addAll(r3)
            L2f:
                com.bxkj.competition.signup.CostProjectListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.CostProjectListActivity.n0(r3)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.signup.CostProjectListActivity.l0(r0)
                r3.g(r0)
                com.bxkj.competition.signup.CostProjectListActivity r3 = r2.a     // Catch: java.lang.Exception -> L4d
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = com.bxkj.competition.signup.CostProjectListActivity.p0(r3)     // Catch: java.lang.Exception -> L4d
                com.bxkj.competition.signup.CostProjectListActivity r0 = r2.a     // Catch: java.lang.Exception -> L4d
                com.bxkj.competition.signup.StickyDecoration r0 = com.bxkj.competition.signup.CostProjectListActivity.o0(r0)     // Catch: java.lang.Exception -> L4d
                r3.removeItemDecoration(r0)     // Catch: java.lang.Exception -> L4d
            L4d:
                com.bxkj.competition.signup.CostProjectListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = com.bxkj.competition.signup.CostProjectListActivity.p0(r3)
                com.bxkj.competition.signup.CostProjectListActivity r0 = r2.a
                com.bxkj.competition.signup.StickyDecoration r0 = com.bxkj.competition.signup.CostProjectListActivity.o0(r0)
                r3.addItemDecoration(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements android.widget.CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ com.bxkj.competition.signup.CostProjectListActivity a;

        f(com.bxkj.competition.signup.CostProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                com.bxkj.competition.signup.CostProjectListActivity r1 = r0.a
                com.bxkj.competition.signup.CostProjectListActivity.z0(r1)
                return
        }
    }

    public CostProjectListActivity() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.G0 = r0
            r0 = 1
            r2.H0 = r0
            r0 = 0
            r2.I0 = r0
            r0 = 10
            r2.J0 = r0
            r0 = 0
            r2.P0 = r0
            return
    }

    static /* synthetic */ android.widget.TextView A0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* synthetic */ double B0(com.bxkj.competition.signup.CostProjectListActivity r0, double r1) {
            r0.Q0 = r1
            return r1
    }

    private void C0() {
            r0 = this;
            return
    }

    private void D0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r4.L0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.b(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.CostProjectListActivity$d r1 = new com.bxkj.competition.signup.CostProjectListActivity$d
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void E0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r4.L0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.h(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.CostProjectListActivity$e r1 = new com.bxkj.competition.signup.CostProjectListActivity$e
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void F0() {
            r11 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0)
            r0 = 0
            r11.S0 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r11.T0 = r0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r11.G0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r1
        L1a:
            boolean r5 = r0.hasNext()
            r6 = 4
            r7 = 2
            if (r5 == 0) goto L65
            java.lang.Object r5 = r0.next()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r8 = "isChecked"
            boolean r8 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r5, r8)
            if (r8 == 0) goto L1a
            int r8 = r11.S0
            int r8 = r8 + 1
            r11.S0 = r8
            java.math.BigDecimal r8 = new java.math.BigDecimal
            java.lang.String r9 = "itemEntryFee"
            double r9 = cn.bluemobi.dylan.http.JsonParse.getDouble(r5, r9)
            r8.<init>(r9)
            java.math.BigDecimal r6 = r8.setScale(r7, r6)
            double r6 = r6.doubleValue()
            double r3 = r3 + r6
            java.lang.StringBuilder r6 = r11.T0
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L59
            java.lang.StringBuilder r6 = r11.T0
            java.lang.String r7 = ","
            r6.append(r7)
        L59:
            java.lang.StringBuilder r6 = r11.T0
            java.lang.String r7 = "id"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r7)
            r6.append(r5)
            goto L1a
        L65:
            android.widget.TextView r0 = r11.b0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "共"
            r5.append(r8)
            int r8 = r11.S0
            r5.append(r8)
            java.lang.String r8 = "项合计："
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r0.setText(r5)
            int r0 = r11.O0
            if (r0 != r7) goto L88
            double r3 = r11.Q0
        L88:
            android.widget.CheckBox r0 = r11.f665p0
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L92
            double r1 = r11.P0
        L92:
            android.widget.TextView r0 = r11.c0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "￥"
            r5.append(r8)
            java.text.DecimalFormat r8 = new java.text.DecimalFormat
            java.lang.String r9 = "0.00"
            r8.<init>(r9)
            java.lang.String r8 = r8.format(r3)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r0.setText(r5)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r3)
            java.math.BigDecimal r0 = r0.setScale(r7, r6)
            double r3 = r0.doubleValue()
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.math.BigDecimal r0 = r0.setScale(r7, r6)
            double r0 = r0.doubleValue()
            double r3 = r3 + r0
            r11.R0 = r3
            android.widget.TextView r0 = r11.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "确认报名(￥"
            r1.append(r2)
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            r2.<init>(r9)
            java.math.BigDecimal r3 = new java.math.BigDecimal
            double r4 = r11.R0
            r3.<init>(r4)
            java.math.BigDecimal r3 = r3.setScale(r7, r6)
            double r3 = r3.doubleValue()
            java.lang.String r2 = r2.format(r3)
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
    }

    private void G0() {
            r4 = this;
            com.bxkj.competition.signup.CostProjectListActivity$b r0 = new com.bxkj.competition.signup.CostProjectListActivity$b
            r0.<init>(r4)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r4.V
            r2.<init>(r3)
            r1.setLayoutManager(r2)
            android.view.animation.LayoutAnimationController r1 = new android.view.animation.LayoutAnimationController
            int r2 = com.bxkj.competition.R.anim.zoom_in
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r4, r2)
            r1.<init>(r2)
            r2 = 0
            r1.setOrder(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r4.Z
            r2.setLayoutAnimation(r1)
            com.bxkj.competition.signup.CostProjectListActivity$c r1 = new com.bxkj.competition.signup.CostProjectListActivity$c
            android.content.Context r2 = r4.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.G0
            r1.<init>(r4, r2, r3, r0)
            r4.K0 = r1
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            r0.setAdapter(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            int r1 = com.bxkj.competition.R.id.tv_emptyView
            android.view.View r1 = r4.findViewById(r1)
            r0.setEmptyView(r1)
            com.bxkj.competition.signup.StickyDecoration r0 = new com.bxkj.competition.signup.StickyDecoration
            android.content.Context r1 = r4.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.G0
            r0.<init>(r1, r2)
            r4.M0 = r0
            return
    }

    private void H0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.competition.signup.CostProjectListActivity$a r1 = new com.bxkj.competition.signup.CostProjectListActivity$a
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    static /* synthetic */ int g0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            int r0 = r0.H0
            return r0
    }

    static /* synthetic */ int h0(com.bxkj.competition.signup.CostProjectListActivity r0, int r1) {
            r0.H0 = r1
            return r1
    }

    static /* synthetic */ int i0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            int r0 = r0.J0
            return r0
    }

    static /* synthetic */ double j0(com.bxkj.competition.signup.CostProjectListActivity r0, double r1) {
            r0.P0 = r1
            return r1
    }

    static /* synthetic */ android.widget.TextView k0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            android.widget.TextView r0 = r0.f664k0
            return r0
    }

    static /* synthetic */ java.util.List l0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.G0
            return r0
    }

    static /* synthetic */ java.util.List m0(com.bxkj.competition.signup.CostProjectListActivity r0, java.util.List r1) {
            r0.G0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter n0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.K0
            return r0
    }

    static /* synthetic */ com.bxkj.competition.signup.StickyDecoration o0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            com.bxkj.competition.signup.StickyDecoration r0 = r0.M0
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView p0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r0.Z
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ int r0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            int r0 = r0.I0
            return r0
    }

    static /* synthetic */ int s0(com.bxkj.competition.signup.CostProjectListActivity r0, int r1) {
            r0.I0 = r1
            return r1
    }

    static /* synthetic */ int t0(com.bxkj.competition.signup.CostProjectListActivity r2) {
            int r0 = r2.I0
            int r1 = r0 + 1
            r2.I0 = r1
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout u0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* synthetic */ void v0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            r0.D0()
            return
    }

    static /* synthetic */ java.lang.String w0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            java.lang.String r0 = r0.N0
            return r0
    }

    static /* synthetic */ int x0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            int r0 = r0.O0
            return r0
    }

    static /* synthetic */ int y0(com.bxkj.competition.signup.CostProjectListActivity r0, int r1) {
            r0.O0 = r1
            return r1
    }

    static /* synthetic */ void z0(com.bxkj.competition.signup.CostProjectListActivity r0) {
            r0.F0()
            return
    }

    public void L() {
            r2 = this;
            android.widget.TextView r0 = r2.a0
            r0.setOnClickListener(r2)
            android.widget.CheckBox r0 = r2.f665p0
            com.bxkj.competition.signup.CostProjectListActivity$f r1 = new com.bxkj.competition.signup.CostProjectListActivity$f
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_competition_project_list
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "competitionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.L0 = r0
        L16:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "from"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.N0 = r0
        L2c:
            r2.H0()
            r2.G0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            r1 = 0
            r0.X0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            r0.S0(r1)
            java.lang.String r0 = r2.N0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L55
            java.lang.String r0 = "我报名的竞赛项目"
            r2.setTitle(r0)
            android.widget.LinearLayout r0 = r2.F0
            r1 = 8
            r0.setVisibility(r1)
            r2.E0()
            return
        L55:
            r2.D0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "竞赛报名项目列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            int r2 = com.bxkj.competition.R.id.refresh
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Y = r2
            int r2 = com.bxkj.competition.R.id.recyclerView
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r2
            r1.Z = r2
            int r2 = com.bxkj.competition.R.id.tv_ok
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            int r2 = com.bxkj.competition.R.id.tv_count
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            int r2 = com.bxkj.competition.R.id.tv_price
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            int r2 = com.bxkj.competition.R.id.tv_bx_price
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f664k0 = r2
            int r2 = com.bxkj.competition.R.id.cb_insurance
            android.view.View r2 = r1.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r1.f665p0 = r2
            int r2 = com.bxkj.competition.R.id.ll_bottom
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.F0 = r2
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r4.getId()
            int r0 = com.bxkj.competition.R.id.tv_ok
            if (r4 != r0) goto L65
            java.lang.StringBuilder r4 = r3.T0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L16
            java.lang.String r4 = "请选择项目"
            r3.f0(r4)
            return
        L16:
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r0 = r3.V
            java.lang.Class<com.bxkj.competition.signup.pay.CompetitionPayActivity> r1 = com.bxkj.competition.signup.pay.CompetitionPayActivity.class
            r4.<init>(r0, r1)
            java.lang.String r0 = "competitionId"
            java.lang.String r1 = r3.L0
            android.content.Intent r4 = r4.putExtra(r0, r1)
            java.lang.StringBuilder r0 = r3.T0
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "itemIds"
            android.content.Intent r4 = r4.putExtra(r1, r0)
            android.widget.CheckBox r0 = r3.f665p0
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L42
            double r0 = r3.P0
            goto L44
        L42:
            r0 = 0
        L44:
            java.lang.String r2 = "insuranceFee"
            android.content.Intent r4 = r4.putExtra(r2, r0)
            java.lang.String r0 = "competitionFee"
            double r1 = r3.Q0
            android.content.Intent r4 = r4.putExtra(r0, r1)
            java.lang.String r0 = "totalPrice"
            double r1 = r3.R0
            android.content.Intent r4 = r4.putExtra(r0, r1)
            java.lang.String r0 = "payPrize"
            double r1 = r3.R0
            android.content.Intent r4 = r4.putExtra(r0, r1)
            r3.startActivity(r4)
        L65:
            return
    }
}
