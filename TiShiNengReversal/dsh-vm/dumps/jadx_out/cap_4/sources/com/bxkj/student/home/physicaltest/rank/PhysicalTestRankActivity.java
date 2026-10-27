package com.bxkj.student.home.physicaltest.rank;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class PhysicalTestRankActivity extends cn.bluemobi.dylan.base.BaseActivity {

    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Y;

    @org.jetbrains.annotations.NotNull
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Z;

    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;

    @org.jetbrains.annotations.Nullable
    private android.widget.RadioGroup b0;
    private int c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity a;

        a(com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r0 = r3.a
                java.lang.String r1 = "meaScoreList"
                java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r1)
                java.lang.String r2 = "getList(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity.j0(r0, r1)
                com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity.h0(r0)
                if (r0 == 0) goto L21
                com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r1 = r3.a
                java.util.List r1 = com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity.i0(r1)
                r0.g(r1)
            L21:
                com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r0 = r3.a
                com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity.k0(r0, r4)
                return
        }
    }

    public PhysicalTestRankActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Z = r0
            r0 = 5
            r1.c0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r0, android.widget.RadioGroup r1, int r2) {
            l0(r0, r1, r2)
            return
    }

    public static final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    public static final /* synthetic */ java.util.List i0(com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Z
            return r0
    }

    public static final /* synthetic */ void j0(com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r0, java.util.List r1) {
            r0.Z = r1
            return
    }

    public static final /* synthetic */ void k0(com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r0, java.util.Map r1) {
            r0.m0(r1)
            return
    }

    private static final void l0(com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity r4, android.widget.RadioGroup r5, int r6) {
            android.widget.RadioGroup r5 = r4.b0
            if (r5 == 0) goto L15
            r0 = 0
            android.view.View r5 = r5.getChildAt(r0)
            if (r5 == 0) goto L15
            int r5 = r5.getId()
            if (r6 != r5) goto L15
            r5 = 5
            r4.c0 = r5
            goto L64
        L15:
            android.widget.RadioGroup r5 = r4.b0
            r0 = 4
            r1 = 1
            if (r5 == 0) goto L2a
            android.view.View r5 = r5.getChildAt(r1)
            if (r5 == 0) goto L2a
            int r5 = r5.getId()
            if (r6 != r5) goto L2a
            r4.c0 = r0
            goto L64
        L2a:
            android.widget.RadioGroup r5 = r4.b0
            r2 = 3
            r3 = 2
            if (r5 == 0) goto L3f
            android.view.View r5 = r5.getChildAt(r3)
            if (r5 == 0) goto L3f
            int r5 = r5.getId()
            if (r6 != r5) goto L3f
            r4.c0 = r2
            goto L64
        L3f:
            android.widget.RadioGroup r5 = r4.b0
            if (r5 == 0) goto L52
            android.view.View r5 = r5.getChildAt(r2)
            if (r5 == 0) goto L52
            int r5 = r5.getId()
            if (r6 != r5) goto L52
            r4.c0 = r3
            goto L64
        L52:
            android.widget.RadioGroup r5 = r4.b0
            if (r5 == 0) goto L64
            android.view.View r5 = r5.getChildAt(r0)
            if (r5 == 0) goto L64
            int r5 = r5.getId()
            if (r6 != r5) goto L64
            r4.c0 = r1
        L64:
            r4.R()
            return
    }

    private final void m0(java.util.Map<java.lang.String, ? extends java.lang.Object> r8) {
            r7 = this;
            r0 = 2131298202(0x7f09079a, float:1.821437E38)
            android.view.View r1 = r7.findViewById(r0)
            r2 = 2131298991(0x7f090aaf, float:1.821597E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.View r0 = r7.findViewById(r0)
            r2 = 2131297198(0x7f0903ae, float:1.8212334E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r2 = "myRank"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r2)
            java.lang.String r4 = ""
            r5 = 1
            if (r3 == r5) goto L5c
            r6 = 2
            if (r3 == r6) goto L4e
            r6 = 3
            if (r3 == r6) goto L40
            if (r1 == 0) goto L37
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
            r1.setText(r2)
        L37:
            if (r0 == 0) goto L69
            r1 = 2131231737(0x7f0803f9, float:1.8079563E38)
            r0.setImageResource(r1)
            goto L69
        L40:
            if (r1 == 0) goto L45
            r1.setText(r4)
        L45:
            if (r0 == 0) goto L69
            r1 = 2131690005(0x7f0f0215, float:1.9009041E38)
            r0.setImageResource(r1)
            goto L69
        L4e:
            if (r1 == 0) goto L53
            r1.setText(r4)
        L53:
            if (r0 == 0) goto L69
            r1 = 2131690004(0x7f0f0214, float:1.900904E38)
            r0.setImageResource(r1)
            goto L69
        L5c:
            if (r1 == 0) goto L61
            r1.setText(r4)
        L61:
            if (r0 == 0) goto L69
            r1 = 2131690003(0x7f0f0213, float:1.9009037E38)
            r0.setImageResource(r1)
        L69:
            java.lang.String r0 = "name"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            int r1 = r0.length()
            if (r1 <= r5) goto L93
            kotlin.jvm.internal.g0.m(r0)
            r1 = 0
            java.lang.String r0 = r0.substring(r1, r5)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "同学"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L93:
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto La1
            r1.setText(r0)
        La1:
            r0 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto Lb5
            java.lang.String r1 = "myScore"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
            r0.setText(r1)
        Lb5:
            android.content.Context r0 = r7.V
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "myAvatar"
            java.lang.String r8 = r1.t(r8, r2)
            r1 = 2131297148(0x7f09037c, float:1.8212233E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2131689689(0x7f0f00d9, float:1.90084E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r8, r1, r2, r2)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492989(0x7f0c007d, float:1.8609445E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            int r2 = r4.c0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.Y0(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity$a r1 = new com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "体测排名"
            r1.setTitle(r0)
            return
    }

    public void T(@org.jetbrains.annotations.Nullable android.os.Bundle r3) {
            r2 = this;
            r3 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r0 = "null cannot be cast to non-null type cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView"
            kotlin.jvm.internal.g0.n(r3, r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r3
            r2.Y = r3
            r3 = 2131298361(0x7f090839, float:1.8214693E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.RadioGroup r3 = (android.widget.RadioGroup) r3
            r2.b0 = r3
            if (r3 == 0) goto L3a
            if (r3 == 0) goto L2f
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            if (r0 == 0) goto L2f
            int r0 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L30
        L2f:
            r0 = 0
        L30:
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.intValue()
            r3.check(r0)
        L3a:
            android.widget.RadioGroup r3 = r2.b0
            if (r3 == 0) goto L46
            com.bxkj.student.home.physicaltest.rank.a r0 = new com.bxkj.student.home.physicaltest.rank.a
            r0.<init>(r2)
            r3.setOnCheckedChangeListener(r0)
        L46:
            android.content.Context r3 = r2.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.Z
            com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity$initViews$2 r1 = new com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity$initViews$2
            r1.<init>(r3, r0)
            r2.a0 = r1
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = r2.Y
            if (r3 == 0) goto L58
            r3.setAdapter(r1)
        L58:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = r2.Y
            if (r3 == 0) goto L66
            r0 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r0 = r2.findViewById(r0)
            r3.setEmptyView(r0)
        L66:
            return
    }

    public void onClick(@org.jetbrains.annotations.Nullable android.view.View r1) {
            r0 = this;
            return
    }
}
