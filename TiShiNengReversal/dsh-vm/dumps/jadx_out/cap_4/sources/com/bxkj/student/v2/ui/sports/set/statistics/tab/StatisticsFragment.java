package com.bxkj.student.v2.ui.sports.set.statistics.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class StatisticsFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.FmV2SportsStatisticsBinding, com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM> {

    /* renamed from: l, reason: collision with root package name */
    private com.github.mikephil.charting.charts.BarChart f1436l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private java.util.List<java.lang.Float> f1437m;

    /* renamed from: n, reason: collision with root package name */
    private final float f1438n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends com.github.mikephil.charting.formatter.ValueFormatter {
        final /* synthetic */ int a;

        a(int r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r3) {
                r2 = this;
                int r3 = (int) r3
                int r0 = r2.a
                r1 = 1
                if (r0 != r1) goto Le
                java.lang.String r3 = cn.bluemobi.dylan.base.utils.u.n(r3)
                kotlin.jvm.internal.g0.m(r3)
                return r3
            Le:
                r1 = 2
                if (r0 != r1) goto L23
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "日"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            L23:
                r1 = 3
                if (r0 != r1) goto L38
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "周"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            L38:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    public StatisticsFragment() {
            r1 = this;
            r1.<init>()
            r0 = 1040746633(0x3e088889, float:0.13333334)
            r1.f1438n = r0
            return
    }

    private final void e() {
            r6 = this;
            com.github.mikephil.charting.components.Description r0 = new com.github.mikephil.charting.components.Description
            r0.<init>()
            java.lang.String r1 = ""
            r0.setText(r1)
            com.github.mikephil.charting.charts.BarChart r1 = r6.f1436l
            r2 = 0
            java.lang.String r3 = "barChart"
            if (r1 != 0) goto L15
            kotlin.jvm.internal.g0.S(r3)
            r1 = r2
        L15:
            r1.setDescription(r0)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L20
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L20:
            java.lang.String r1 = "暂无数据"
            r0.setNoDataText(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L2d
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L2d:
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisLeft()
            r1 = 0
            r0.setAxisMinimum(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L3d
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L3d:
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            r0.setPosition(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L4e
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L4e:
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r1 = 0
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L5e
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L5e:
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisRight()
            r0.setEnabled(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L6d
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L6d:
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisLeft()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L7c
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L7c:
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisRight()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L8b
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L8b:
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L9a
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L9a:
            r0.dispatchSetSelected(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto La5
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        La5:
            com.github.mikephil.charting.components.Legend r0 = r0.getLegend()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            r0.setVerticalAlignment(r4)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto Lb6
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        Lb6:
            com.github.mikephil.charting.components.Legend r0 = r0.getLegend()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r0.setHorizontalAlignment(r4)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto Lc7
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        Lc7:
            r4 = 1
            r0.setTouchEnabled(r4)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            java.util.List<java.lang.Float> r4 = r6.f1437m
            kotlin.jvm.internal.g0.m(r4)
            int r4 = r4.size()
            float r4 = r6.f(r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r4, r5)
            com.github.mikephil.charting.charts.BarChart r4 = r6.f1436l
            if (r4 != 0) goto Lea
            kotlin.jvm.internal.g0.S(r3)
            r4 = r2
        Lea:
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r4.getViewPortHandler()
            com.github.mikephil.charting.charts.BarChart r5 = r6.f1436l
            if (r5 != 0) goto Lf6
            kotlin.jvm.internal.g0.S(r3)
            r5 = r2
        Lf6:
            r4.refresh(r0, r5, r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L101
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L101:
            r0.setPinchZoom(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r6.f1436l
            if (r0 != 0) goto L10c
            kotlin.jvm.internal.g0.S(r3)
            goto L10d
        L10c:
            r2 = r0
        L10d:
            r2.setDoubleTapToZoomEnabled(r1)
            return
    }

    private final float f(int r2) {
            r1 = this;
            float r2 = (float) r2
            float r0 = r1.f1438n
            float r2 = r2 * r0
            return r2
    }

    private final void g(int r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.lang.Float> r1 = r7.f1437m
            kotlin.jvm.internal.g0.m(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L12:
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 >= r1) goto L32
            com.github.mikephil.charting.data.BarEntry r5 = new com.github.mikephil.charting.data.BarEntry
            float r6 = (float) r3
            float r6 = r6 + r4
            java.util.List<java.lang.Float> r4 = r7.f1437m
            kotlin.jvm.internal.g0.m(r4)
            java.lang.Object r4 = r4.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5.<init>(r6, r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto L12
        L32:
            com.github.mikephil.charting.data.BarDataSet r1 = new com.github.mikephil.charting.data.BarDataSet
            java.lang.String r3 = "里程(KM)"
            r1.<init>(r0, r3)
            android.content.Context r0 = r7.G()
            r3 = 2131100565(0x7f060395, float:1.7813515E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r3)
            r1.setColor(r0)
            android.content.Context r0 = r7.G()
            r3 = 2131099737(0x7f060059, float:1.7811836E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r3)
            r1.setBarBorderColor(r0)
            r1.setDrawValues(r2)
            r0 = 37
            r1.setHighLightAlpha(r0)
            com.github.mikephil.charting.charts.BarChart r0 = r7.f1436l
            r2 = 0
            java.lang.String r3 = "barChart"
            if (r0 != 0) goto L68
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L68:
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            java.lang.String r5 = "getXAxis(...)"
            kotlin.jvm.internal.g0.o(r0, r5)
            r0.setGranularity(r4)
            com.bxkj.student.v2.ui.sports.set.statistics.tab.StatisticsFragment$a r4 = new com.bxkj.student.v2.ui.sports.set.statistics.tab.StatisticsFragment$a
            r4.<init>(r8)
            r0.setValueFormatter(r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.add(r1)
            com.github.mikephil.charting.data.BarData r0 = new com.github.mikephil.charting.data.BarData
            r0.<init>(r8)
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            r0.setBarWidth(r8)
            com.github.mikephil.charting.charts.BarChart r8 = r7.f1436l
            if (r8 != 0) goto L97
            kotlin.jvm.internal.g0.S(r3)
            goto L98
        L97:
            r2 = r8
        L98:
            r2.setData(r0)
            return
    }

    public final void h(int r2, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r3) {
            r1 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 1
            if (r2 == r0) goto L31
            r0 = 2
            if (r2 == r0) goto L20
            r0 = 3
            if (r2 == r0) goto Lf
            goto L41
        Lf:
            java.lang.String r0 = "sysTerm"
            java.lang.Object r3 = r3.get(r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L41
            java.util.List r3 = kotlin.jvm.internal.u0.g(r3)
            r1.f1437m = r3
            goto L41
        L20:
            java.lang.String r0 = "month"
            java.lang.Object r3 = r3.get(r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L41
            java.util.List r3 = kotlin.jvm.internal.u0.g(r3)
            r1.f1437m = r3
            goto L41
        L31:
            java.lang.String r0 = "week"
            java.lang.Object r3 = r3.get(r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L41
            java.util.List r3 = kotlin.jvm.internal.u0.g(r3)
            r1.f1437m = r3
        L41:
            r1.e()
            r1.g(r2)
            com.github.mikephil.charting.charts.BarChart r2 = r1.f1436l
            if (r2 != 0) goto L51
            java.lang.String r2 = "barChart"
            kotlin.jvm.internal.g0.S(r2)
            r2 = 0
        L51:
            r3 = 1000(0x3e8, float:1.401E-42)
            r2.animateY(r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FmV2SportsStatisticsBinding r0 = (com.bxkj.student.databinding.FmV2SportsStatisticsBinding) r0
            com.bxkj.student.v2.common.view.CustomBarChart r0 = r0.barChart
            java.lang.String r1 = "barChart"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.f1436l = r0
            if (r0 != 0) goto L15
            kotlin.jvm.internal.g0.S(r1)
            r0 = 0
        L15:
            java.lang.String r1 = "暂无数据"
            r0.setNoDataText(r1)
            return
    }
}
