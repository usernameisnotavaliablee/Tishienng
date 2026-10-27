package com.bxkj.student.run.app.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class StepDetailFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private com.github.mikephil.charting.charts.BarChart j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.github.mikephil.charting.formatter.ValueFormatter {
        final /* synthetic */ com.bxkj.student.run.app.record.StepDetailFragment a;

        a(com.bxkj.student.run.app.record.StepDetailFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r2) {
                r1 = this;
                int r2 = (int) r2
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = "分钟"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends com.github.mikephil.charting.formatter.ValueFormatter {
        final /* synthetic */ com.bxkj.student.run.app.record.StepDetailFragment a;

        b(com.bxkj.student.run.app.record.StepDetailFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r2) {
                r1 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = (int) r2
                r0.append(r2)
                java.lang.String r2 = ""
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    public StepDetailFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private void N() {
            r3 = this;
            com.github.mikephil.charting.components.Description r0 = new com.github.mikephil.charting.components.Description
            r0.<init>()
            java.lang.String r1 = ""
            r0.setText(r1)
            com.github.mikephil.charting.charts.BarChart r1 = r3.j
            r1.setDescription(r0)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            java.lang.String r1 = "暂无数据"
            r0.setNoDataText(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            r0.setPosition(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r1 = 0
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r2 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisLeft()
            r0.setTextSize(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisRight()
            r0.setEnabled(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisLeft()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisRight()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.Legend r0 = r0.getLegend()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            r0.setVerticalAlignment(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.Legend r0 = r0.getLegend()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r0.setHorizontalAlignment(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.Legend r0 = r0.getLegend()
            r0.setTextSize(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setGranularity(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.setExtraBottomOffset(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r3.j
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisLeft()
            r1 = 0
            r0.setAxisMinimum(r1)
            return
    }

    private void O() {
            r8 = this;
            java.lang.String r0 = ","
            android.os.Bundle r1 = r8.getArguments()
            java.lang.String r2 = "step"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L106
            android.os.Bundle r1 = r8.getArguments()
            java.lang.String r1 = r1.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L1e
            goto L106
        L1e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parse(r1)     // Catch: java.lang.Exception -> L33
            boolean r4 = r4 instanceof com.alibaba.fastjson.JSONArray     // Catch: java.lang.Exception -> L33
            if (r4 == 0) goto L35
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            java.util.List r2 = com.alibaba.fastjson.JSON.parseArray(r1, r4)     // Catch: java.lang.Exception -> L33
            goto L6b
        L33:
            goto L50
        L35:
            java.lang.String[] r4 = r1.split(r0)     // Catch: java.lang.Exception -> L33
            int r5 = r4.length     // Catch: java.lang.Exception -> L33
            if (r5 <= 0) goto L6b
            int r5 = r4.length     // Catch: java.lang.Exception -> L33
            r6 = 0
        L3e:
            if (r6 >= r5) goto L6b
            r7 = r4[r6]     // Catch: java.lang.Exception -> L33
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L33
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L33
            r2.add(r7)     // Catch: java.lang.Exception -> L33
            int r6 = r6 + 1
            goto L3e
        L50:
            java.lang.String[] r0 = r1.split(r0)
            int r1 = r0.length
            if (r1 <= 0) goto L6b
            int r1 = r0.length
            r4 = 0
        L59:
            if (r4 >= r1) goto L6b
            r5 = r0[r4]
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L59
        L6b:
            if (r2 == 0) goto L106
            int r0 = r2.size()
            if (r0 != 0) goto L75
            goto L106
        L75:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4 = 0
        L80:
            int r5 = r2.size()
            if (r3 >= r5) goto La9
            java.lang.Object r5 = r2.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            int r4 = r4 + r6
            int r3 = r3 + 1
            java.lang.String r6 = java.lang.String.valueOf(r3)
            r0.add(r6)
            com.github.mikephil.charting.data.BarEntry r6 = new com.github.mikephil.charting.data.BarEntry
            float r7 = (float) r3
            int r5 = r5.intValue()
            float r5 = (float) r5
            r6.<init>(r7, r5)
            r1.add(r6)
            goto L80
        La9:
            com.github.mikephil.charting.data.BarDataSet r0 = new com.github.mikephil.charting.data.BarDataSet
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "步数(共"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            android.content.Context r1 = r8.g
            r2 = 2131100565(0x7f060395, float:1.7813515E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.setColor(r1)
            r1 = 1
            r0.setDrawValues(r1)
            r1 = 37
            r0.setHighLightAlpha(r1)
            com.github.mikephil.charting.charts.BarChart r1 = r8.j
            com.github.mikephil.charting.components.XAxis r1 = r1.getXAxis()
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setGranularity(r2)
            com.bxkj.student.run.app.record.StepDetailFragment$a r2 = new com.bxkj.student.run.app.record.StepDetailFragment$a
            r2.<init>(r8)
            r1.setValueFormatter(r2)
            com.bxkj.student.run.app.record.StepDetailFragment$b r1 = new com.bxkj.student.run.app.record.StepDetailFragment$b
            r1.<init>(r8)
            r0.setValueFormatter(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            com.github.mikephil.charting.data.BarData r0 = new com.github.mikephil.charting.data.BarData
            r0.<init>(r1)
            com.github.mikephil.charting.charts.BarChart r1 = r8.j
            r1.setData(r0)
        L106:
            return
    }

    public void b() {
            r0 = this;
            return
    }

    protected void e() {
            r0 = this;
            r0.N()
            r0.O()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131296738(0x7f0901e2, float:1.8211401E38)
            android.view.View r1 = r0.c(r1)
            com.github.mikephil.charting.charts.BarChart r1 = (com.github.mikephil.charting.charts.BarChart) r1
            r0.j = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493200(0x7f0c0150, float:1.8609873E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
