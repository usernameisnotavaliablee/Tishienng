package com.bxkj.student.run.app.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunStatisticsActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.google.android.material.tabs.TabLayout Y;
    private java.util.Map<java.lang.String, java.lang.Object> Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.my.RunStatisticsActivity a;

        a(com.bxkj.student.run.app.my.RunStatisticsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r11) {
                r10 = this;
                com.bxkj.student.run.app.my.RunStatisticsActivity r0 = r10.a
                com.bxkj.student.run.app.my.RunStatisticsActivity.i0(r0, r11)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                com.bxkj.student.run.app.my.RunStaticsFragment r0 = new com.bxkj.student.run.app.my.RunStaticsFragment
                r0.<init>()
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                com.bxkj.student.run.app.my.RunStatisticsActivity r2 = r10.a
                java.util.Map r2 = com.bxkj.student.run.app.my.RunStatisticsActivity.g0(r2)
                java.lang.String r3 = "week"
                java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
                java.util.List r2 = cn.bluemobi.dylan.http.JsonParse.getList(r2, r3, r4)
                int r3 = r2.size()
                float[] r3 = new float[r3]
                r5 = 0
                r6 = 0
            L2a:
                int r7 = r2.size()
                if (r6 >= r7) goto L3f
                java.lang.Object r7 = r2.get(r6)
                java.lang.Float r7 = (java.lang.Float) r7
                float r7 = r7.floatValue()
                r3[r6] = r7
                int r6 = r6 + 1
                goto L2a
            L3f:
                java.lang.String r2 = "type"
                r6 = 1
                r1.putInt(r2, r6)
                java.lang.String r6 = "listData"
                r1.putFloatArray(r6, r3)
                r0.setArguments(r1)
                r11.add(r0)
                com.bxkj.student.run.app.my.RunStaticsFragment r0 = new com.bxkj.student.run.app.my.RunStaticsFragment
                r0.<init>()
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                com.bxkj.student.run.app.my.RunStatisticsActivity r3 = r10.a
                java.util.Map r3 = com.bxkj.student.run.app.my.RunStatisticsActivity.g0(r3)
                java.lang.String r7 = "month"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r7, r4)
                int r7 = r3.size()
                float[] r7 = new float[r7]
                r8 = 0
            L6d:
                int r9 = r3.size()
                if (r8 >= r9) goto L82
                java.lang.Object r9 = r3.get(r8)
                java.lang.Float r9 = (java.lang.Float) r9
                float r9 = r9.floatValue()
                r7[r8] = r9
                int r8 = r8 + 1
                goto L6d
            L82:
                r3 = 2
                r1.putInt(r2, r3)
                r1.putFloatArray(r6, r7)
                r0.setArguments(r1)
                r11.add(r0)
                com.bxkj.student.run.app.my.RunStaticsFragment r0 = new com.bxkj.student.run.app.my.RunStaticsFragment
                r0.<init>()
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                com.bxkj.student.run.app.my.RunStatisticsActivity r3 = r10.a
                java.util.Map r3 = com.bxkj.student.run.app.my.RunStatisticsActivity.g0(r3)
                java.lang.String r7 = "sysTerm"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r7, r4)
                int r4 = r3.size()
                float[] r4 = new float[r4]
            Lab:
                int r7 = r3.size()
                if (r5 >= r7) goto Lc0
                java.lang.Object r7 = r3.get(r5)
                java.lang.Float r7 = (java.lang.Float) r7
                float r7 = r7.floatValue()
                r4[r5] = r7
                int r5 = r5 + 1
                goto Lab
            Lc0:
                r3 = 3
                r1.putInt(r2, r3)
                r1.putFloatArray(r6, r4)
                r0.setArguments(r1)
                r11.add(r0)
                cn.bluemobi.dylan.base.adapter.b r0 = new cn.bluemobi.dylan.base.adapter.b
                com.bxkj.student.run.app.my.RunStatisticsActivity r1 = r10.a
                androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
                com.bxkj.student.run.app.my.RunStatisticsActivity r2 = r10.a
                com.google.android.material.tabs.TabLayout r2 = com.bxkj.student.run.app.my.RunStatisticsActivity.h0(r2)
                r3 = 2131298030(0x7f0906ee, float:1.8214022E38)
                r0.<init>(r1, r11, r3, r2)
                return
        }
    }

    public RunStatisticsActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ java.util.Map g0(com.bxkj.student.run.app.my.RunStatisticsActivity r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.material.tabs.TabLayout h0(com.bxkj.student.run.app.my.RunStatisticsActivity r0) {
            com.google.android.material.tabs.TabLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.run.app.my.RunStatisticsActivity r0, java.util.Map r1) {
            r0.Z = r1
            return
    }

    private void j0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.j(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.my.RunStatisticsActivity$a r1 = new com.bxkj.student.run.app.my.RunStatisticsActivity$a
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
            r0 = 2131493016(0x7f0c0098, float:1.86095E38)
            return r0
    }

    public void R() {
            r0 = this;
            r0.j0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "跑步统计"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298643(0x7f090953, float:1.8215265E38)
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
