package com.bxkj.student.home.physicaltest.scanscore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TestScoreListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity k;

        a(com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity.a r0, java.lang.String r1, java.util.Map r2, android.view.View r3) {
                r0.o(r1, r2, r3)
                return
        }

        private /* synthetic */ void o(java.lang.String r4, java.util.Map r5, android.view.View r6) {
                r3 = this;
                boolean r6 = android.text.TextUtils.isEmpty(r4)
                if (r6 == 0) goto L7
                return
            L7:
                com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r6 = r3.k
                android.content.Intent r0 = new android.content.Intent
                android.content.Context r1 = r3.e
                java.lang.Class<com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity> r2 = com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "meaScoreId"
                android.content.Intent r4 = r0.putExtra(r1, r4)
                java.lang.String r0 = "stuName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                android.content.Intent r4 = r4.putExtra(r0, r1)
                java.lang.String r0 = "stuNum"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                android.content.Intent r4 = r4.putExtra(r0, r5)
                r6.startActivity(r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                java.lang.String r0 = "meaScoreId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r2 = 2131299081(0x7f090b09, float:1.8216153E38)
                r7.N(r2, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                java.lang.String r3 = "gradeType"
                java.lang.String r4 = "year"
                r5 = 2131298922(0x7f090a6a, float:1.821583E38)
                if (r1 == 0) goto L2c
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r4)
                r7.J(r5, r1)
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r3)
                r7.J(r2, r1)
                goto L4b
            L2c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r4)
                r1.append(r2)
                java.lang.String r2 = "年"
                r1.append(r2)
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r7.J(r5, r1)
            L4b:
                java.lang.String r1 = "stuName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131298986(0x7f090aaa, float:1.821596E38)
                r7.J(r2, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "totalScore"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
                r1.append(r2)
                java.lang.String r2 = "分"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 2131299093(0x7f090b15, float:1.8216178E38)
                r7.J(r2, r1)
                java.lang.String r1 = "rank"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131299062(0x7f090af6, float:1.8216115E38)
                r7.J(r2, r1)
                java.lang.String r1 = "meaStatus"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r7.J(r2, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r1 = r1 ^ 1
                r2 = 2131297100(0x7f09034c, float:1.8212135E38)
                r7.N(r2, r1)
                com.bxkj.student.home.physicaltest.scanscore.b r1 = new com.bxkj.student.home.physicaltest.scanscore.b
                r1.<init>(r6, r0, r8)
                r8 = 2131296688(0x7f0901b0, float:1.82113E38)
                r7.w(r8, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity a;

        b(com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity.i0(r0, r3)
                com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity.g0(r3)
                com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public TestScoreListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    private void j0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.p0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity$b r1 = new com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492999(0x7f0c0087, float:1.8609466E38)
            return r0
    }

    public void R() {
            r5 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r5, r1)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setLayoutAnimation(r0)
            com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity$a r0 = new com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity$a
            android.content.Context r2 = r5.V
            r3 = 2131493333(0x7f0c01d5, float:1.8610143E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.a0
            r0.<init>(r5, r2, r3, r4)
            r5.b0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.X0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.S0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r1 = 2
            r0.setOverScrollMode(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r5.findViewById(r1)
            r0.setEmptyView(r1)
            r5.j0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "体测成绩汇总"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
