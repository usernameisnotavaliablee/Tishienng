package com.bxkj.student.v2.ui.sports.v3.record.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3StatisticsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3StatisticsFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/record/tab/V3StatisticsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,202:1\n1878#2,3:203\n1878#2,3:206\n1878#2,3:209\n37#3,2:212\n37#3,2:214\n*S KotlinDebug\n*F\n+ 1 V3StatisticsFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/record/tab/V3StatisticsFragment\n*L\n131#1:203,3\n148#1:206,3\n165#1:209,3\n185#1:212,2\n195#1:214,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3StatisticsFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.FmV3RecordListTotalBinding, com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM> {

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.Double> f1481l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.String> f1482m;

    /* renamed from: n, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.set.statistics.tab.StatisticsFragment f1483n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment a;

        a(com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r3) {
                r2 = this;
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r0 = r2.a
                com.bxkj.base.v2.base.BaseViewModel r0 = r0.C()
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r0 = (com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM) r0
                androidx.lifecycle.MutableLiveData r0 = r0.v()
                java.lang.Object r0 = r0.getValue()
                java.util.Map r0 = (java.util.Map) r0
                if (r0 == 0) goto L1f
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r1 = r2.a
                if (r3 == 0) goto L1f
                int r3 = r3.getPosition()
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment.g(r1, r3, r0)
            L1f:
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        b(kotlin.jvm.functions.Function1 r2) {
                r1 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.lifecycle.Observer
                r1 = 0
                if (r0 == 0) goto L18
                boolean r0 = r3 instanceof kotlin.jvm.internal.b0
                if (r0 == 0) goto L18
                kotlin.n r0 = r2.getFunctionDelegate()
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
                kotlin.n r3 = r3.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L18:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.n<?> getFunctionDelegate() {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kotlin.n r0 = r1.getFunctionDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        public final /* synthetic */ void onChanged(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                r0.invoke(r2)
                return
        }
    }

    public V3StatisticsFragment() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = kotlin.collections.f0.J()
            r1.f1481l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1482m = r0
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = i(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = h(r0, r1)
            return r0
    }

    public static final /* synthetic */ void g(com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r0, int r1, java.util.Map r2) {
            r0.j(r1, r2)
            return
    }

    private static final kotlin.n1 h(com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r12, java.util.Map r13) {
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tbType
            int r0 = r0.getSelectedTabPosition()
            kotlin.jvm.internal.g0.m(r13)
            r12.j(r0, r13)
            java.lang.String r0 = "qualifyTotalRangeSunRun"
            boolean r1 = r13.containsKey(r0)
            r2 = 8
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 0
            if (r1 == 0) goto Lda
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            com.google.android.material.card.MaterialCardView r1 = r1.cardSunRun
            r1.setVisibility(r4)
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            android.widget.TextView r1 = r1.tvYxlc
            com.bxkj.base.v2.common.utils.h r5 = com.bxkj.base.v2.common.utils.h.a
            com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r7 = "totalRangeZongSunRun"
            double r8 = r6.f(r13, r7)
            java.lang.String r5 = r5.a(r8)
            r1.setText(r5)
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            android.widget.TextView r1 = r1.tvDblc
            java.lang.String r5 = r6.t(r13, r0)
            r1.setText(r5)
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            android.widget.TextView r1 = r1.tvSylc
            java.lang.String r5 = "leaveTotalRangeZongSunRun"
            java.lang.String r5 = r6.t(r13, r5)
            r1.setText(r5)
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            android.widget.ProgressBar r1 = r1.pbDistance
            double r8 = r6.f(r13, r0)
            double r10 = (double) r3
            double r8 = r8 * r10
            int r0 = (int) r8
            r1.setMax(r0)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.ProgressBar r0 = r0.pbDistance
            double r7 = r6.f(r13, r7)
            double r7 = r7 * r10
            int r1 = (int) r7
            r0.setProgress(r1)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.TextView r0 = r0.tvYxcs
            java.lang.String r1 = "totalCountZongSunRun"
            java.lang.String r5 = r6.t(r13, r1)
            r0.setText(r5)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.TextView r0 = r0.tvDbcs
            java.lang.String r5 = "qualifyTotalCountSunRun"
            java.lang.String r7 = r6.t(r13, r5)
            r0.setText(r7)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.TextView r0 = r0.tvSycs
            java.lang.String r7 = "leaveTotalCountZongSunRun"
            java.lang.String r7 = r6.t(r13, r7)
            r0.setText(r7)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.ProgressBar r0 = r0.pbCount
            int r5 = r6.k(r13, r5)
            r0.setMax(r5)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.ProgressBar r0 = r0.pbCount
            int r1 = r6.k(r13, r1)
            r0.setProgress(r1)
            goto Le5
        Lda:
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            com.google.android.material.card.MaterialCardView r0 = r0.cardSunRun
            r0.setVisibility(r2)
        Le5:
            java.lang.String r0 = "qualifyTotalRangeMorningRun"
            boolean r1 = r13.containsKey(r0)
            if (r1 == 0) goto L1a8
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            com.google.android.material.card.MaterialCardView r1 = r1.cardMorningRun
            r1.setVisibility(r4)
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            android.widget.TextView r1 = r1.tvYxlcMorning
            com.bxkj.base.v2.common.utils.h r2 = com.bxkj.base.v2.common.utils.h.a
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = "totalRangeZongMorningRun"
            double r6 = r4.f(r13, r5)
            java.lang.String r2 = r2.a(r6)
            r1.setText(r2)
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            android.widget.TextView r1 = r1.tvDblcMorning
            java.lang.String r2 = r4.t(r13, r0)
            r1.setText(r2)
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            android.widget.TextView r1 = r1.tvSylcMorning
            java.lang.String r2 = "leaveTotalRangeZongMorningRun"
            java.lang.String r2 = r4.t(r13, r2)
            r1.setText(r2)
            androidx.databinding.ViewDataBinding r1 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r1 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r1
            android.widget.ProgressBar r1 = r1.pbDistanceMorning
            double r6 = r4.f(r13, r0)
            double r2 = (double) r3
            double r6 = r6 * r2
            int r0 = (int) r6
            r1.setMax(r0)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.ProgressBar r0 = r0.pbDistanceMorning
            double r5 = r4.f(r13, r5)
            double r5 = r5 * r2
            int r1 = (int) r5
            r0.setProgress(r1)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.TextView r0 = r0.tvYxcsMorning
            java.lang.String r1 = "totalCountZongMorningRun"
            java.lang.String r2 = r4.t(r13, r1)
            r0.setText(r2)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.TextView r0 = r0.tvDbcsMorning
            java.lang.String r2 = "qualifyTotalCountMorningRun"
            java.lang.String r3 = r4.t(r13, r2)
            r0.setText(r3)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.TextView r0 = r0.tvSycsMorning
            java.lang.String r3 = "leaveTotalCountZongMorningRun"
            java.lang.String r3 = r4.t(r13, r3)
            r0.setText(r3)
            androidx.databinding.ViewDataBinding r0 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            android.widget.ProgressBar r0 = r0.pbCountMorning
            int r2 = r4.k(r13, r2)
            r0.setMax(r2)
            androidx.databinding.ViewDataBinding r12 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r12 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r12
            android.widget.ProgressBar r12 = r12.pbCountMorning
            int r13 = r4.k(r13, r1)
            r12.setProgress(r13)
            goto L1b3
        L1a8:
            androidx.databinding.ViewDataBinding r12 = r12.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r12 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r12
            com.google.android.material.card.MaterialCardView r12 = r12.cardMorningRun
            r12.setVisibility(r2)
        L1b3:
            kotlin.n1 r12 = kotlin.n1.a
            return r12
    }

    private static final kotlin.n1 i(com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r5, java.util.Map r6) {
            android.content.Context r0 = r5.G()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "imageRouteUrl"
            java.lang.String r2 = r1.t(r6, r2)
            androidx.databinding.ViewDataBinding r3 = r5.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r3 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r3
            com.google.android.material.imageview.ShapeableImageView r3 = r3.ivHead
            r4 = 2131690190(0x7f0f02ce, float:1.9009417E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r2, r3, r4, r4)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            java.lang.String r3 = "nickName"
            java.lang.String r6 = r1.t(r6, r3)
            r2.X0(r6)
            androidx.databinding.ViewDataBinding r6 = r5.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r6 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r6
            android.widget.TextView r6 = r6.tvName
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.U()
            r6.setText(r1)
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r5 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r5
            android.widget.TextView r5 = r5.tvAccount
            com.bxkj.base.v2.data.b r6 = r0.a()
            java.lang.String r6 = r6.S()
            r5.setText(r6)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private final void j(int r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
            r7 = this;
            java.util.List<java.lang.String> r0 = r7.f1482m
            r0.clear()
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L211
            if (r8 == r1) goto L10e
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvDay
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "sysTermDay"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgDistance
            com.bxkj.base.v2.common.utils.h r4 = com.bxkj.base.v2.common.utils.h.a
            java.lang.String r5 = "sysTermAvgRange"
            double r5 = r3.f(r9, r5)
            java.lang.String r5 = r4.a(r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgCount
            java.lang.String r5 = "sysTermAvgCount"
            java.lang.String r5 = r3.t(r9, r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgTime
            java.lang.String r5 = "sysTermAvgTime"
            java.lang.String r5 = r3.t(r9, r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvDistance
            java.lang.String r5 = "sysTermTotalMileage"
            double r5 = r3.f(r9, r5)
            java.lang.String r4 = r4.a(r5)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvCount
            java.lang.String r4 = "sysTermNum"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvTime
            java.lang.String r4 = "sysTermTime"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvPace
            java.lang.String r4 = "sysTermAvgSpeed"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvHeart
            java.lang.String r4 = "sysTermCalorie"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvStep
            java.lang.String r4 = "sysTermAvgstep"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvStepDistance
            java.lang.String r4 = "sysTermStride"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            java.lang.String r2 = "sysTerm"
            java.util.List r2 = r3.h(r9, r2)
            r7.f1481l = r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        Le0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30c
            java.lang.Object r3 = r2.next()
            int r4 = r0 + 1
            if (r0 >= 0) goto Lf1
            kotlin.collections.f0.b0()
        Lf1:
            java.lang.Number r3 = (java.lang.Number) r3
            r3.doubleValue()
            java.util.List<java.lang.String> r0 = r7.f1482m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r5 = "周"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.add(r3)
            r0 = r4
            goto Le0
        L10e:
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvDay
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "monthDay"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgDistance
            com.bxkj.base.v2.common.utils.h r4 = com.bxkj.base.v2.common.utils.h.a
            java.lang.String r5 = "monthAvgRange"
            double r5 = r3.f(r9, r5)
            java.lang.String r5 = r4.a(r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgCount
            java.lang.String r5 = "monthAvgCount"
            java.lang.String r5 = r3.t(r9, r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgTime
            java.lang.String r5 = "monthAvgTime"
            java.lang.String r5 = r3.t(r9, r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvDistance
            java.lang.String r5 = "monthTotalMileage"
            double r5 = r3.f(r9, r5)
            java.lang.String r4 = r4.a(r5)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvCount
            java.lang.String r4 = "monthNum"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvTime
            java.lang.String r4 = "monthTime"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvPace
            java.lang.String r4 = "monthAvgSpeed"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvHeart
            java.lang.String r4 = "monthCalorie"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvStep
            java.lang.String r4 = "monthAvgstep"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvStepDistance
            java.lang.String r4 = "monthStride"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            java.lang.String r2 = "month"
            java.util.List r2 = r3.h(r9, r2)
            r7.f1481l = r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L1e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30c
            java.lang.Object r3 = r2.next()
            int r4 = r0 + 1
            if (r0 >= 0) goto L1f4
            kotlin.collections.f0.b0()
        L1f4:
            java.lang.Number r3 = (java.lang.Number) r3
            r3.doubleValue()
            java.util.List<java.lang.String> r0 = r7.f1482m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r5 = "日"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.add(r3)
            r0 = r4
            goto L1e3
        L211:
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvDay
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "weekDay"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgDistance
            com.bxkj.base.v2.common.utils.h r4 = com.bxkj.base.v2.common.utils.h.a
            java.lang.String r5 = "weekAvgRange"
            double r5 = r3.f(r9, r5)
            java.lang.String r5 = r4.a(r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgCount
            java.lang.String r5 = "weekAvgCount"
            java.lang.String r5 = r3.t(r9, r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvAvgTime
            java.lang.String r5 = "weekAvgTime"
            java.lang.String r5 = r3.t(r9, r5)
            r2.setText(r5)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvDistance
            java.lang.String r5 = "weekTotalMileage"
            double r5 = r3.f(r9, r5)
            java.lang.String r4 = r4.a(r5)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvCount
            java.lang.String r4 = "weekNum"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvTime
            java.lang.String r4 = "weekTime"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvHeart
            java.lang.String r4 = "weekCalorie"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvPace
            java.lang.String r4 = "weekAvgSpeed"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvStep
            java.lang.String r4 = "weekAvgstep"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            android.widget.TextView r2 = r2.tvStepDistance
            java.lang.String r4 = "weekStride"
            java.lang.String r4 = r3.t(r9, r4)
            r2.setText(r4)
            java.lang.String r2 = "week"
            java.util.List r2 = r3.h(r9, r2)
            r7.f1481l = r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L2e6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30c
            java.lang.Object r3 = r2.next()
            int r4 = r0 + 1
            if (r0 >= 0) goto L2f7
            kotlin.collections.f0.b0()
        L2f7:
            java.lang.Number r3 = (java.lang.Number) r3
            r3.doubleValue()
            java.util.List<java.lang.String> r0 = r7.f1482m
            java.lang.String r3 = cn.bluemobi.dylan.base.utils.u.n(r4)
            java.lang.String r5 = "changeWeekToHanzi(...)"
            kotlin.jvm.internal.g0.o(r3, r5)
            r0.add(r3)
            r0 = r4
            goto L2e6
        L30c:
            com.bxkj.student.v2.ui.sports.set.statistics.tab.StatisticsFragment r0 = r7.f1483n
            if (r0 == 0) goto L314
            int r8 = r8 + r1
            r0.h(r8, r9)
        L314:
            return
    }

    private final void k() {
            r49 = this;
            r0 = r49
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
            r47 = 4095(0xfff, float:5.738E-42)
            r48 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = -1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r2 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartType.Column
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.chartType(r2)
            java.lang.String r2 = ""
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.title(r2)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.subtitle(r2)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.yAxisTitle(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.dataLabelsEnabled(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.yAxisLabelsEnabled(r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.xAxisLabelsEnabled(r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.legendEnabled(r3)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.tooltipEnabled(r3)
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.yAxisGridLineWidth(r5)
            java.util.List<java.lang.String> r6 = r0.f1482m
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.Object[] r6 = r6.toArray(r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.categories(r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.yAxisVisible(r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r6 = new com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
            r6.<init>()
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r6.name(r2)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r2.lineWidth(r5)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r2.enableMouseTracking(r4)
            r4 = 1090519040(0x41000000, float:8.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r2.borderRadius(r4)
            r4 = 134(0x86, float:1.88E-43)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 203(0xcb, float:2.84E-43)
            java.lang.String r4 = com.github.aachartmodel.aainfographics.aatools.AAColorKt.AARgba(r3, r6, r4, r5)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r2.color(r4)
            java.util.List<java.lang.Double> r4 = r0.f1481l
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Object[] r4 = r4.toArray(r5)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r2.data(r4)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.series(r4)
            androidx.databinding.ViewDataBinding r2 = r0.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r2 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartView r2 = r2.AAChartView
            r2.aa_drawChartWithChartModel(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            r1 = 2131297003(0x7f0902eb, float:1.8211939E38)
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.bxkj.student.v2.ui.sports.set.statistics.tab.StatisticsFragment"
            kotlin.jvm.internal.g0.n(r0, r1)
            com.bxkj.student.v2.ui.sports.set.statistics.tab.StatisticsFragment r0 = (com.bxkj.student.v2.ui.sports.set.statistics.tab.StatisticsFragment) r0
            r4.f1483n = r0
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.FmV3RecordListTotalBinding r0 = (com.bxkj.student.databinding.FmV3RecordListTotalBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tbType
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment$a r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment$a
            r1.<init>(r4)
            r0.addOnTabSelectedListener(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r0 = (com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.v()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.record.tab.n r2 = new com.bxkj.student.v2.ui.sports.v3.record.tab.n
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment$b r3 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment$b
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r0 = (com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.z()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.bxkj.student.v2.ui.sports.v3.record.tab.o r2 = new com.bxkj.student.v2.ui.sports.v3.record.tab.o
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment$b r3 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment$b
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r1 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r0 = (com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM) r0
            r0.w()
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r0 = (com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM) r0
            r0.y()
            return
    }
}
