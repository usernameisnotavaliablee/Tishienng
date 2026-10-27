package com.bxkj.student.home.teaching.leave.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LeaveRecordListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Y;
    private android.widget.TextView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private java.lang.String b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity k;

        a(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "周数："
                r0.append(r1)
                java.lang.String r1 = "week"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299190(0x7f090b76, float:1.8216374E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "状态："
                r0.append(r1)
                java.lang.String r1 = "status"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "教师："
                r0.append(r1)
                java.lang.String r1 = "auditorName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299151(0x7f090b4f, float:1.8216295E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "课程："
                r0.append(r1)
                java.lang.String r1 = "teacherCurriculumName"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 2131298953(0x7f090a89, float:1.8215894E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity a;

        b(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity.j0(r0, r3)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity.h0(r3)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity.i0(r0)
                r3.g(r0)
                return
        }
    }

    public LeaveRecordListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.l0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    private void k0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.String r1 = "加载中..."
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setLoadingMessage(r1)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.b0
            rx.e r1 = r1.A(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity$b r1 = new com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void l0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r0.V
            java.lang.Class<com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity> r3 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.class
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.c0
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r0.startActivity(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            com.bxkj.student.home.teaching.leave.recorder.b r1 = new com.bxkj.student.home.teaching.leave.recorder.b
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493640(0x7f0c0308, float:1.8610766E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.b0 = r0
        L16:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity$a r0 = new com.bxkj.student.home.teaching.leave.recorder.LeaveRecordListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493272(0x7f0c0198, float:1.861002E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Y
            android.widget.TextView r1 = r4.Z
            r0.setEmptyView(r1)
            r4.k0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "请假记录列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Y = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
