package com.bxkj.student.run.app.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunStaticsFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private com.github.mikephil.charting.charts.BarChart j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f1172l;

    /* renamed from: m, reason: collision with root package name */
    private float f1173m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.github.mikephil.charting.formatter.ValueFormatter {
        final /* synthetic */ com.bxkj.student.run.app.my.RunStaticsFragment a;

        a(com.bxkj.student.run.app.my.RunStaticsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r3) {
                r2 = this;
                int r3 = (int) r3
                com.bxkj.student.run.app.my.RunStaticsFragment r0 = r2.a
                int r0 = com.bxkj.student.run.app.my.RunStaticsFragment.N(r0)
                r1 = 1
                if (r0 != r1) goto Lf
                java.lang.String r3 = cn.bluemobi.dylan.base.utils.u.n(r3)
                return r3
            Lf:
                com.bxkj.student.run.app.my.RunStaticsFragment r0 = r2.a
                int r0 = com.bxkj.student.run.app.my.RunStaticsFragment.N(r0)
                r1 = 2
                if (r0 != r1) goto L2a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "日"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            L2a:
                com.bxkj.student.run.app.my.RunStaticsFragment r0 = r2.a
                int r0 = com.bxkj.student.run.app.my.RunStaticsFragment.N(r0)
                r1 = 3
                if (r0 != r1) goto L45
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "周"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            L45:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = ""
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    public RunStaticsFragment() {
            r1 = this;
            r1.<init>()
            r0 = 1040746633(0x3e088889, float:0.13333334)
            r1.f1173m = r0
            return
    }

    static /* bridge */ /* synthetic */ int N(com.bxkj.student.run.app.my.RunStaticsFragment r0) {
            int r0 = r0.k
            return r0
    }

    private void O() {
            r4 = this;
            com.github.mikephil.charting.components.Description r0 = new com.github.mikephil.charting.components.Description
            r0.<init>()
            java.lang.String r1 = ""
            r0.setText(r1)
            com.github.mikephil.charting.charts.BarChart r1 = r4.j
            r1.setDescription(r0)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            java.lang.String r1 = "暂无数据"
            r0.setNoDataText(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            r0.setPosition(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r1 = 0
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisRight()
            r0.setEnabled(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisLeft()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisRight()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            com.github.mikephil.charting.components.Legend r0 = r0.getLegend()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            r0.setVerticalAlignment(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            com.github.mikephil.charting.components.Legend r0 = r0.getLegend()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r0.setHorizontalAlignment(r2)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            float[] r2 = r4.f1172l
            int r2 = r2.length
            float r2 = r4.P(r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r3)
            com.github.mikephil.charting.charts.BarChart r2 = r4.j
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r2.getViewPortHandler()
            com.github.mikephil.charting.charts.BarChart r3 = r4.j
            r2.refresh(r0, r3, r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            r0.setPinchZoom(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.j
            r0.setDoubleTapToZoomEnabled(r1)
            return
    }

    private float P(int r2) {
            r1 = this;
            float r2 = (float) r2
            float r0 = r1.f1173m
            float r2 = r2 * r0
            return r2
    }

    private void Q() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            float[] r2 = r6.f1172l
            int r2 = r2.length
            if (r1 >= r2) goto L1c
            com.github.mikephil.charting.data.BarEntry r2 = new com.github.mikephil.charting.data.BarEntry
            int r3 = r1 + 1
            float r4 = (float) r3
            float[] r5 = r6.f1172l
            r1 = r5[r1]
            r2.<init>(r4, r1)
            r0.add(r2)
            r1 = r3
            goto L6
        L1c:
            com.github.mikephil.charting.data.BarDataSet r1 = new com.github.mikephil.charting.data.BarDataSet
            java.lang.String r2 = "里程(KM)"
            r1.<init>(r0, r2)
            android.content.Context r0 = r6.g
            r2 = 2131100565(0x7f060395, float:1.7813515E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.setColor(r0)
            r0 = 1
            r1.setDrawValues(r0)
            r0 = 37
            r1.setHighLightAlpha(r0)
            com.github.mikephil.charting.charts.BarChart r0 = r6.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setGranularity(r2)
            com.bxkj.student.run.app.my.RunStaticsFragment$a r2 = new com.bxkj.student.run.app.my.RunStaticsFragment$a
            r2.<init>(r6)
            r0.setValueFormatter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            com.github.mikephil.charting.data.BarData r1 = new com.github.mikephil.charting.data.BarData
            r1.<init>(r0)
            com.github.mikephil.charting.charts.BarChart r0 = r6.j
            r0.setData(r1)
            return
    }

    public void b() {
            r0 = this;
            return
    }

    protected void e() {
            r2 = this;
            android.os.Bundle r0 = r2.getArguments()
            java.lang.String r1 = "type"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L16
            android.os.Bundle r0 = r2.getArguments()
            int r0 = r0.getInt(r1)
            r2.k = r0
        L16:
            android.os.Bundle r0 = r2.getArguments()
            java.lang.String r1 = "listData"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L2c
            android.os.Bundle r0 = r2.getArguments()
            float[] r0 = r0.getFloatArray(r1)
            r2.f1172l = r0
        L2c:
            r2.O()
            r2.Q()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131296428(0x7f0900ac, float:1.8210772E38)
            android.view.View r1 = r0.c(r1)
            com.github.mikephil.charting.charts.BarChart r1 = (com.github.mikephil.charting.charts.BarChart) r1
            r0.j = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493202(0x7f0c0152, float:1.8609877E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
