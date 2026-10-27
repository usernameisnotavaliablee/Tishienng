package com.bxkj.student.v2.ui.sports.v3.record.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordInValidFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.V3FmInvalidRecordListBinding, com.bxkj.student.v2.vm.sports.record.RecordVM> {

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.lang.String f1473l;

    /* renamed from: m, reason: collision with root package name */
    private int f1474m;

    /* renamed from: n, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1475n;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListBinding> f1476o;

    /* renamed from: p, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, ? extends java.lang.Object> f1477p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements m2.e {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment a;

        a(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r2) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2 = r1.a
                int r2 = com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.k(r2)
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0 = r1.a
                int r2 = r2 + 1
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.M(r0, r2)
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.l(r2)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.M(r2, r0)
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.l(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment a;

        b(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r2) {
                r1 = this;
                if (r2 == 0) goto L33
                int r2 = r2.getPosition()
                if (r2 == 0) goto L1f
                r0 = 1
                if (r2 == r0) goto L17
                r0 = 2
                if (r2 == r0) goto Lf
                goto L26
            Lf:
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2 = r1.a
                java.lang.String r0 = "-1"
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.L(r2, r0)
                goto L26
            L17:
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2 = r1.a
                java.lang.String r0 = "2"
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.L(r2, r0)
                goto L26
            L1f:
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2 = r1.a
                java.lang.String r0 = "0"
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.L(r2, r0)
            L26:
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2 = r1.a
                androidx.databinding.ViewDataBinding r2 = r2.K()
                com.bxkj.student.databinding.V3FmInvalidRecordListBinding r2 = (com.bxkj.student.databinding.V3FmInvalidRecordListBinding) r2
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r2.refresh
                r2.D()
            L33:
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    public V3RecordInValidFragment() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "0"
            r1.f1473l = r0
            r0 = 1
            r1.f1474m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1475n = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f1477p = r0
            return
    }

    public static final /* synthetic */ void L(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, java.lang.String r1) {
            r0.f1473l = r1
            return
    }

    public static final /* synthetic */ void M(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, int r1) {
            r0.f1474m = r1
            return
    }

    private final void N(int r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            if (r10 <= 0) goto L1a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "还剩"
            r12.append(r0)
            r12.append(r10)
            java.lang.String r0 = "次申诉机会,确定是否申诉？"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
        L18:
            r2 = r12
            goto L1d
        L1a:
            java.lang.String r12 = "还剩0次申诉机会,无法进行申诉！"
            goto L18
        L1d:
            if (r10 > 0) goto L27
            android.content.Context r10 = r9.G()
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r10, r2)
            return
        L27:
            android.content.Context r0 = r9.G()
            com.bxkj.student.v2.ui.sports.v3.record.tab.a r3 = new com.bxkj.student.v2.ui.sports.v3.record.tab.a
            r3.<init>(r9, r11)
            r7 = 57
            r8 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private static final kotlin.n1 O(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2, java.lang.String r3, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r4, r0)
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r0 = r2.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity> r1 = com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity.class
            r4.<init>(r0, r1)
            java.lang.String r0 = "exerciseRecordId"
            android.content.Intent r3 = r4.putExtra(r0, r3)
            r2.startActivity(r3)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 Q(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r4, java.lang.String r5) {
            android.content.Context r0 = r4.G()
            if (r5 != 0) goto L8
            java.lang.String r5 = "上传成功"
        L8:
            r1 = 2
            r2 = 0
            r3 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r0, r5, r3, r1, r2)
            com.bxkj.student.v2.common.data.i$a r5 = com.bxkj.student.v2.common.data.i.a
            r5.m0(r3)
            cn.bluemobi.dylan.base.utils.a r5 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity> r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.class
            android.app.Activity r5 = r5.getActivity(r0)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r5 = (com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity) r5
            if (r5 == 0) goto L24
            r5.D1()
        L24:
            r4.Z()
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    private final void S() {
            r5 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r5.C()
            com.bxkj.student.v2.vm.sports.record.RecordVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordVM) r0
            java.lang.String r1 = r5.f1473l
            int r2 = r5.f1474m
            com.bxkj.student.v2.ui.sports.v3.record.tab.d r3 = new com.bxkj.student.v2.ui.sports.v3.record.tab.d
            r3.<init>(r5)
            com.bxkj.student.v2.ui.sports.v3.record.tab.e r4 = new com.bxkj.student.v2.ui.sports.v3.record.tab.e
            r4.<init>(r5)
            r0.H(r1, r2, r3, r4)
            return
    }

    private static final kotlin.n1 T(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2, java.util.List r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.f1474m
            r1 = 1
            if (r0 != r1) goto Lf
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1475n
            r0.clear()
        Lf:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1475n
            java.util.Collection r3 = (java.util.Collection) r3
            r0.addAll(r3)
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListBinding> r2 = r2.f1476o
            if (r2 == 0) goto L1d
            r2.notifyDataSetChanged()
        L1d:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 U(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1) {
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.V3FmInvalidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmInvalidRecordListBinding) r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.refresh
            r0.w0()
            androidx.databinding.ViewDataBinding r1 = r1.K()
            com.bxkj.student.databinding.V3FmInvalidRecordListBinding r1 = (com.bxkj.student.databinding.V3FmInvalidRecordListBinding) r1
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r1.refresh
            r1.q0()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void W() {
            r2 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1475n
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$initAdapter$1 r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$initAdapter$1
            r1.<init>(r2, r0)
            r2.f1476o = r1
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V3FmInvalidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmInvalidRecordListBinding) r0
            com.bxkj.base.v2.common.view.EmptyRecyclerView r0 = r0.recyclerView
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListBinding> r1 = r2.f1476o
            r0.setAdapter(r1)
            return
    }

    private final void X() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V3FmInvalidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmInvalidRecordListBinding) r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.refresh
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$a r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$a
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private final void Y() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V3FmInvalidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmInvalidRecordListBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tb
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$b r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$b
            r1.<init>(r2)
            r0.addOnTabSelectedListener(r1)
            return
    }

    private static final kotlin.n1 a0(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1, java.util.Map r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f1477p = r2
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void b0(android.widget.Button r12, java.util.Map<java.lang.String, ? extends java.lang.Object> r13) {
            r11 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "sportType"
            int r2 = r0.k(r13, r1)
            r3 = -1
            r4 = 2
            r5 = 1
            if (r2 != r5) goto L16
            java.util.Map<java.lang.String, ? extends java.lang.Object> r2 = r11.f1477p
            java.lang.String r6 = "validitySunRun"
            int r2 = r0.k(r2, r6)
            goto L26
        L16:
            int r2 = r0.k(r13, r1)
            if (r2 != r4) goto L25
            java.util.Map<java.lang.String, ? extends java.lang.Object> r2 = r11.f1477p
            java.lang.String r6 = "validityMorningRun"
            int r2 = r0.k(r2, r6)
            goto L26
        L25:
            r2 = -1
        L26:
            int r6 = r0.k(r13, r1)
            r7 = 0
            if (r6 != r5) goto L36
            java.util.Map<java.lang.String, ? extends java.lang.Object> r1 = r11.f1477p
            java.lang.String r4 = "balanceSunRun"
            int r1 = r0.k(r1, r4)
            goto L46
        L36:
            int r1 = r0.k(r13, r1)
            if (r1 != r4) goto L45
            java.util.Map<java.lang.String, ? extends java.lang.Object> r1 = r11.f1477p
            java.lang.String r4 = "balanceMorningRun"
            int r1 = r0.k(r1, r4)
            goto L46
        L45:
            r1 = 0
        L46:
            java.math.BigDecimal r4 = new java.math.BigDecimal
            long r5 = java.lang.System.currentTimeMillis()
            r4.<init>(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            java.lang.String r6 = "startTime"
            long r8 = r0.o(r13, r6)
            r5.<init>(r8)
            java.math.BigDecimal r4 = r4.subtract(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            r6 = 86400000(0x5265c00, float:7.82218E-36)
            r5.<init>(r6)
            r6 = 10
            r8 = 4
            java.math.BigDecimal r4 = r4.divide(r5, r6, r8)
            double r4 = r4.doubleValue()
            r6 = 8
            if (r2 != r3) goto L79
            r12.setVisibility(r6)
            goto Lbd
        L79:
            double r2 = (double) r2
            java.lang.String r8 = "va"
            java.lang.String r9 = "enable"
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 > 0) goto L94
            r12.setVisibility(r7)
            boolean r2 = r0.d(r13, r9)
            r12.setEnabled(r2)
            java.lang.String r0 = r0.t(r13, r8)
            r12.setText(r0)
            goto Lbd
        L94:
            java.lang.String r2 = "status"
            java.lang.String r2 = r0.t(r13, r2)
            java.lang.String r3 = "1"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto La6
            r12.setVisibility(r6)
            goto Lbd
        La6:
            boolean r2 = r0.d(r13, r9)
            if (r2 == 0) goto Lb0
            r12.setVisibility(r6)
            goto Lbd
        Lb0:
            r12.setVisibility(r7)
            r12.setEnabled(r7)
            java.lang.String r0 = r0.t(r13, r8)
            r12.setText(r0)
        Lbd:
            com.bxkj.student.v2.ui.sports.v3.record.tab.c r0 = new com.bxkj.student.v2.ui.sports.v3.record.tab.c
            r0.<init>(r11, r1, r13)
            r12.setOnClickListener(r0)
            return
    }

    private static final void c0(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2, int r3, java.util.Map r4, android.view.View r5) {
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r0 = "id"
            java.lang.String r0 = r5.t(r4, r0)
            java.lang.String r1 = "identify"
            java.lang.String r4 = r5.t(r4, r1)
            r2.N(r3, r0, r4)
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0) {
            kotlin.n1 r0 = U(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, java.lang.String r1) {
            kotlin.n1 r0 = Q(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, java.lang.String r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            kotlin.n1 r0 = O(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ void h(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, int r1, java.util.Map r2, android.view.View r3) {
            c0(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ kotlin.n1 i(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = a0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 j(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, java.util.List r1) {
            kotlin.n1 r0 = T(r0, r1)
            return r0
    }

    public static final /* synthetic */ int k(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0) {
            int r0 = r0.f1474m
            return r0
    }

    public static final /* synthetic */ void l(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0) {
            r0.S()
            return
    }

    public static final /* synthetic */ void m(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, android.widget.Button r1, java.util.Map r2) {
            r0.b0(r1, r2)
            return
    }

    public final void P(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.sports.record.RecordVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordVM) r0
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "identify"
            java.lang.String r4 = r1.t(r4, r2)
            com.bxkj.student.v2.ui.sports.v3.record.tab.b r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.b
            r1.<init>(r3)
            r0.R(r4, r1)
            return
    }

    public final void R(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r8) {
            r7 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r8, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "faceUrl"
            java.lang.String r2 = r0.t(r8, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L33
            com.bxkj.student.v2.common.utils.h r2 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r3 = r7.q()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r5 = "name"
            java.lang.String r6 = "核对人脸信息"
            r4.put(r5, r6)
            java.lang.String r5 = "linkUrl"
            java.lang.String r8 = r0.t(r8, r1)
            r4.put(r5, r8)
            kotlin.n1 r8 = kotlin.n1.a
            r2.b(r3, r4)
        L33:
            return
    }

    public final void V(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r5) {
            r4 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r5, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isLocal"
            boolean r1 = r0.d(r5, r1)
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity> r2 = com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity.class
            if (r1 == 0) goto L28
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r3 = r4.G()
            r1.<init>(r3, r2)
            java.lang.String r2 = "identify"
            java.lang.String r5 = r0.t(r5, r2)
            android.content.Intent r5 = r1.putExtra(r2, r5)
            r4.startActivity(r5)
            return
        L28:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r3 = r4.G()
            r1.<init>(r3, r2)
            java.lang.String r2 = "id"
            java.lang.String r5 = r0.t(r5, r2)
            java.lang.String r0 = "exerciseRecordId"
            android.content.Intent r5 = r1.putExtra(r0, r5)
            r4.startActivity(r5)
            return
    }

    public final void Z() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V3FmInvalidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmInvalidRecordListBinding) r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.refresh
            r0.D()
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.sports.record.RecordVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordVM) r0
            com.bxkj.student.v2.ui.sports.v3.record.tab.f r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.f
            r1.<init>(r2)
            r0.K(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r0 = this;
            r0.Y()
            r0.X()
            r0.W()
            r0.Z()
            return
    }
}
