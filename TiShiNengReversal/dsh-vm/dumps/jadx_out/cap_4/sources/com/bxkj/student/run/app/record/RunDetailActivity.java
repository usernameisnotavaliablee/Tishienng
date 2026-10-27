package com.bxkj.student.run.app.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.google.android.material.tabs.TabLayout Y;
    private com.bxkj.student.run.app.record.TraceDetailFragment Z;
    private com.bxkj.student.run.app.vm.RunVM a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ android.os.Bundle a;
        final /* synthetic */ com.bxkj.student.run.app.record.RunDetailActivity b;

        a(com.bxkj.student.run.app.record.RunDetailActivity r1, android.os.Bundle r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "gitudeLatitude"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r2 = "latLngTimeSpeed"
                r0.putString(r2, r1)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "avgspeed"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r2 = "speed"
                r0.putString(r2, r1)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "peisu"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r0.putString(r1, r2)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "sportTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r2 = "time"
                r0.putString(r2, r1)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "sportRange"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r2 = "distance"
                r0.putString(r2, r1)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "okPointList"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.putString(r1, r2)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "stepNumbers"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r2 = "step"
                r0.putString(r2, r1)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "geofence"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r2 = "geoFence"
                r0.putString(r2, r1)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "punchCoordinate"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.putString(r1, r4)
                com.bxkj.student.run.app.record.RunDetailActivity r4 = r3.b
                android.os.Bundle r0 = r3.a
                com.bxkj.student.run.app.record.RunDetailActivity.i0(r4, r0)
                return
        }
    }

    public RunDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.record.RunDetailActivity r0) {
            r0.m0()
            return
    }

    public static /* synthetic */ kotlin.n1 h0(com.bxkj.student.run.app.record.RunDetailActivity r0, android.os.Bundle r1, java.util.List r2) {
            kotlin.n1 r0 = r0.l0(r1, r2)
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.run.app.record.RunDetailActivity r0, android.os.Bundle r1) {
            r0.j0(r1)
            return
    }

    private void j0(android.os.Bundle r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bxkj.student.run.app.record.TraceDetailFragment r1 = new com.bxkj.student.run.app.record.TraceDetailFragment
            r1.<init>()
            r4.Z = r1
            com.bxkj.student.run.app.record.StepDetailFragment r1 = new com.bxkj.student.run.app.record.StepDetailFragment
            r1.<init>()
            com.bxkj.student.run.app.record.TraceDetailFragment r2 = r4.Z
            r2.setArguments(r5)
            r1.setArguments(r5)
            com.bxkj.student.run.app.record.TraceDetailFragment r5 = r4.Z
            r0.add(r5)
            r0.add(r1)
            cn.bluemobi.dylan.base.adapter.b r5 = new cn.bluemobi.dylan.base.adapter.b
            androidx.fragment.app.FragmentManager r1 = r4.getSupportFragmentManager()
            r2 = 2131298030(0x7f0906ee, float:1.8214022E38)
            com.google.android.material.tabs.TabLayout r3 = r4.Y
            r5.<init>(r1, r0, r2, r3)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "runType"
            boolean r5 = r5.hasExtra(r0)
            if (r5 == 0) goto L50
            android.content.Intent r5 = r4.getIntent()
            r1 = 2
            int r5 = r5.getIntExtra(r0, r1)
            if (r5 != 0) goto L50
            com.google.android.material.tabs.TabLayout r5 = r4.Y
            r0 = 1
            com.google.android.material.tabs.TabLayout$Tab r5 = r5.getTabAt(r0)
            r5.select()
        L50:
            return
    }

    private void k0() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L7
            goto L28
        L7:
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "currentActivityThread"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L28
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L28
            java.lang.Object r1 = r1.invoke(r2, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "mHiddenApiWarningShown"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L28
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L28
            r0.setBoolean(r1, r3)     // Catch: java.lang.Exception -> L28
        L28:
            return
    }

    private /* synthetic */ kotlin.n1 l0(android.os.Bundle r2, java.util.List r3) {
            r1 = this;
            if (r3 == 0) goto L1d
            int r0 = r3.size()
            if (r0 <= 0) goto L1d
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            com.bxkj.student.run.app.offline.table.RunDb r3 = (com.bxkj.student.run.app.offline.table.RunDb) r3
            if (r3 == 0) goto L1a
            java.lang.String r0 = "step"
            java.lang.String r3 = r3.getStepList()
            r2.putString(r0, r3)
        L1a:
            r1.j0(r2)
        L1d:
            r2 = 0
            return r2
    }

    private /* synthetic */ void m0() {
            r1 = this;
            com.bxkj.student.run.app.record.TraceDetailFragment r0 = r1.Z
            if (r0 == 0) goto L7
            r0.q0()
        L7:
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493010(0x7f0c0092, float:1.8609488E38)
            return r0
    }

    public void R() {
            r4 = this;
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            r0.<init>(r4)
            java.lang.Class<com.bxkj.student.run.app.vm.RunVM> r1 = com.bxkj.student.run.app.vm.RunVM.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            com.bxkj.student.run.app.vm.RunVM r0 = (com.bxkj.student.run.app.vm.RunVM) r0
            r4.a0 = r0
            r4.k0()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "sportRecordId"
            boolean r1 = r1.hasExtra(r2)
            if (r1 == 0) goto L4d
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Context r2 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            java.lang.Class<com.bxkj.student.run.app.a> r3 = com.bxkj.student.run.app.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            com.bxkj.student.run.app.a r3 = (com.bxkj.student.run.app.a) r3
            rx.e r1 = r3.m(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r2.setObservable(r1)
            com.bxkj.student.run.app.record.RunDetailActivity$a r2 = new com.bxkj.student.run.app.record.RunDetailActivity$a
            r2.<init>(r4, r0)
            r1.setDataListener(r2)
            return
        L4d:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "latLngTimeSpeed"
            boolean r1 = r1.hasExtra(r2)
            if (r1 == 0) goto Lc3
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "speed"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "peisu"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "time"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "distance"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "okPointList"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "step"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "geoFence"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            r4.j0(r0)
            return
        Lc3:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "runDataDbId"
            boolean r1 = r1.hasExtra(r2)
            if (r1 == 0) goto Lec
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putString(r2, r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            com.bxkj.student.run.app.vm.RunVM r2 = r4.a0
            com.bxkj.student.run.app.record.i r3 = new com.bxkj.student.run.app.record.i
            r3.<init>(r4, r0)
            r2.w(r1, r3)
        Lec:
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "跑步详情"
            r2.setTitle(r0)
            com.bxkj.student.run.app.record.j r0 = new com.bxkj.student.run.app.record.j
            r0.<init>(r2)
            java.lang.String r1 = "分享"
            r2.b0(r1, r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.Y = r1
            return
    }

    public void onActivityResult(int r2, int r3, @androidx.annotation.Nullable android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            android.content.Context r0 = r1.V
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            r0.onActivityResult(r2, r3, r4)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
