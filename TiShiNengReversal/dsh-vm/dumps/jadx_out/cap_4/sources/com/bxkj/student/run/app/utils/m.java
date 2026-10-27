package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.github.mikephil.charting.formatter.ValueFormatter {
        final /* synthetic */ java.util.List a;

        a(java.util.List r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r1, com.github.mikephil.charting.components.AxisBase r2) {
                r0 = this;
                int r1 = (int) r1
                if (r1 < 0) goto L15
                java.util.List r2 = r0.a
                int r2 = r2.size()
                if (r1 < r2) goto Lc
                goto L15
            Lc:
                java.util.List r2 = r0.a
                java.lang.Object r1 = r2.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                return r1
            L15:
                java.lang.String r1 = ""
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends com.github.mikephil.charting.formatter.ValueFormatter {
        final /* synthetic */ java.util.List a;

        b(java.util.List r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r2, com.github.mikephil.charting.components.AxisBase r3) {
                r1 = this;
                java.util.List r3 = r1.a
                int r2 = (int) r2
                r0 = 0
                int r2 = java.lang.Math.max(r2, r0)
                java.util.List r0 = r1.a
                int r0 = r0.size()
                int r0 = r0 + (-1)
                int r2 = java.lang.Math.min(r2, r0)
                java.lang.Object r2 = r3.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends com.github.mikephil.charting.formatter.ValueFormatter {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r2, com.github.mikephil.charting.components.AxisBase r3) {
                r1 = this;
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r0 = 1120403456(0x42c80000, float:100.0)
                float r2 = r2 * r0
                r3.append(r2)
                java.lang.String r2 = "%"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends com.github.mikephil.charting.formatter.ValueFormatter {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r2, com.github.mikephil.charting.components.AxisBase r3) {
                r1 = this;
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r0 = 1120403456(0x42c80000, float:100.0)
                float r2 = r2 * r0
                r3.append(r2)
                java.lang.String r2 = "%"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                return r2
        }
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(com.github.mikephil.charting.charts.Chart r1) {
            r1.clear()
            r1.notifyDataSetChanged()
            java.lang.String r0 = "你还没有记录数据"
            r1.setNoDataText(r0)
            r0 = -1
            r1.setNoDataTextColor(r0)
            r1.invalidate()
            return
    }

    public static void b(com.github.mikephil.charting.charts.BarChart r8, java.util.List<java.lang.String> r9) {
            com.github.mikephil.charting.components.Description r0 = r8.getDescription()
            r1 = 0
            r0.setEnabled(r1)
            r8.setPinchZoom(r1)
            r8.setScaleEnabled(r1)
            r0 = 1
            r8.setDragEnabled(r0)
            java.lang.String r2 = ""
            r8.setNoDataText(r2)
            com.github.mikephil.charting.components.XAxis r2 = r8.getXAxis()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            r2.setPosition(r3)
            r2.setDrawGridLines(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setGranularity(r3)
            com.bxkj.student.run.app.utils.m$b r4 = new com.bxkj.student.run.app.utils.m$b
            r4.<init>(r9)
            r2.setValueFormatter(r4)
            r4 = 1092616192(0x41200000, float:10.0)
            r2.setTextSize(r4)
            android.content.res.Resources r5 = r8.getResources()
            r6 = 2131099699(0x7f060033, float:1.7811759E38)
            int r5 = r5.getColor(r6)
            r2.setTextColor(r5)
            java.lang.String r5 = "#4cffffff"
            int r7 = android.graphics.Color.parseColor(r5)
            r2.setAxisLineColor(r7)
            int r7 = r9.size()
            r2.setLabelCount(r7)
            com.github.mikephil.charting.components.YAxis r2 = r8.getAxisLeft()
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r7 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            r2.setPosition(r7)
            r7 = 0
            r2.setAxisMinimum(r7)
            r2.setDrawGridLines(r1)
            r2.setDrawLabels(r0)
            r2.setDrawAxisLine(r1)
            int r5 = android.graphics.Color.parseColor(r5)
            r2.setAxisLineColor(r5)
            android.content.res.Resources r5 = r8.getResources()
            int r5 = r5.getColor(r6)
            r2.setTextColor(r5)
            com.bxkj.student.run.app.utils.m$c r5 = new com.bxkj.student.run.app.utils.m$c
            r5.<init>()
            r2.setValueFormatter(r5)
            com.github.mikephil.charting.components.YAxis r2 = r8.getAxisRight()
            r2.setEnabled(r1)
            com.github.mikephil.charting.components.Legend r2 = r8.getLegend()
            r2.setEnabled(r1)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r5 = r9.size()
            r6 = 10
            if (r5 > r6) goto La2
            r2.postScale(r3, r3)
            goto Lc3
        La2:
            int r5 = r9.size()
            r6 = 15
            if (r5 > r6) goto Lb0
            r9 = 1069547520(0x3fc00000, float:1.5)
            r2.postScale(r9, r3)
            goto Lc3
        Lb0:
            int r9 = r9.size()
            r5 = 20
            if (r9 > r5) goto Lbe
            r9 = 1073741824(0x40000000, float:2.0)
            r2.postScale(r9, r3)
            goto Lc3
        Lbe:
            r9 = 1077936128(0x40400000, float:3.0)
            r2.postScale(r9, r3)
        Lc3:
            com.github.mikephil.charting.utils.ViewPortHandler r9 = r8.getViewPortHandler()
            r9.refresh(r2, r8, r1)
            r8.setExtraBottomOffset(r4)
            r9 = 1106247680(0x41f00000, float:30.0)
            r8.setExtraTopOffset(r9)
            r8.setFitBars(r0)
            r9 = 1500(0x5dc, float:2.102E-42)
            r8.animateX(r9)
            return
    }

    public static void c(com.github.mikephil.charting.charts.BarLineChartBase r4, java.util.List<java.lang.String> r5, float r6, float r7, boolean r8) {
            r6 = 0
            r4.setDrawGridBackground(r6)
            r4.setDrawBorders(r6)
            r4.setScaleEnabled(r6)
            r7 = 1
            r4.setDragEnabled(r7)
            java.lang.String r0 = ""
            r4.setNoDataText(r0)
            com.github.mikephil.charting.components.Description r0 = r4.getDescription()
            r0.setEnabled(r6)
            com.github.mikephil.charting.components.YAxis r0 = r4.getAxisRight()
            r0.setEnabled(r6)
            com.github.mikephil.charting.components.Legend r0 = r4.getLegend()
            if (r8 == 0) goto L55
            r0.setEnabled(r7)
            r8 = -1
            r0.setTextColor(r8)
            com.github.mikephil.charting.components.Legend$LegendForm r8 = com.github.mikephil.charting.components.Legend.LegendForm.CIRCLE
            r0.setForm(r8)
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r8 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            r0.setHorizontalAlignment(r8)
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r8 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM
            r0.setVerticalAlignment(r8)
            com.github.mikephil.charting.components.Legend$LegendOrientation r8 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL
            r0.setOrientation(r8)
            r8 = 1101004800(0x41a00000, float:20.0)
            r0.setYEntrySpace(r8)
            r1 = 1088421888(0x40e00000, float:7.0)
            r0.setFormSize(r1)
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            r0.setXEntrySpace(r8)
            goto L58
        L55:
            r0.setEnabled(r6)
        L58:
            com.github.mikephil.charting.components.XAxis r8 = r4.getXAxis()
            r8.setDrawAxisLine(r7)
            java.lang.String r0 = "#4cffffff"
            int r0 = android.graphics.Color.parseColor(r0)
            r8.setAxisLineColor(r0)
            r8.setDrawGridLines(r6)
            java.lang.String r0 = "#30FFFFFF"
            int r0 = android.graphics.Color.parseColor(r0)
            r8.setGridColor(r0)
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            r8.setPosition(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r8.setTextSize(r0)
            r1 = 1084227584(0x40a00000, float:5.0)
            r8.setYOffset(r1)
            com.bxkj.student.run.app.utils.m$a r1 = new com.bxkj.student.run.app.utils.m$a
            r1.<init>(r5)
            r8.setValueFormatter(r1)
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131099699(0x7f060033, float:1.7811759E38)
            int r1 = r1.getColor(r2)
            r8.setTextColor(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r8.setGranularity(r1)
            com.github.mikephil.charting.components.YAxis r8 = r4.getAxisLeft()
            r8.setDrawAxisLine(r6)
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r3 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            r8.setPosition(r3)
            r8.setDrawGridLines(r6)
            r8.setDrawZeroLine(r7)
            android.content.res.Resources r7 = r4.getResources()
            int r7 = r7.getColor(r2)
            r8.setTextColor(r7)
            r8.setTextSize(r0)
            r7 = 1097859072(0x41700000, float:15.0)
            r8.setXOffset(r7)
            r7 = 5
            r8.setLabelCount(r7, r6)
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            int r8 = r5.size()
            r0 = 10
            if (r8 > r0) goto Ld8
            r7.postScale(r1, r1)
            goto Lf9
        Ld8:
            int r8 = r5.size()
            r0 = 15
            if (r8 > r0) goto Le6
            r5 = 1069547520(0x3fc00000, float:1.5)
            r7.postScale(r5, r1)
            goto Lf9
        Le6:
            int r5 = r5.size()
            r8 = 20
            if (r5 > r8) goto Lf4
            r5 = 1073741824(0x40000000, float:2.0)
            r7.postScale(r5, r1)
            goto Lf9
        Lf4:
            r5 = 1077936128(0x40400000, float:3.0)
            r7.postScale(r5, r1)
        Lf9:
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r4.getViewPortHandler()
            r5.refresh(r7, r4, r6)
            r5 = 500(0x1f4, float:7.0E-43)
            r4.animateX(r5)
            return
    }

    public static com.github.mikephil.charting.data.BarDataSet d(java.util.List<com.github.mikephil.charting.data.BarEntry> r1, java.lang.String r2, @androidx.annotation.ColorInt int r3, @androidx.annotation.ColorInt int r4) {
            com.github.mikephil.charting.data.BarDataSet r0 = new com.github.mikephil.charting.data.BarDataSet
            r0.<init>(r1, r2)
            r1 = 1084227584(0x40a00000, float:5.0)
            r0.setBarBorderWidth(r1)
            r0.setBarShadowColor(r4)
            r0.setValueTextColor(r3)
            r1 = 0
            r0.setDrawValues(r1)
            return r0
    }

    public static com.github.mikephil.charting.data.LineDataSet e(java.util.List<com.github.mikephil.charting.data.Entry> r1, java.lang.String r2, @androidx.annotation.ColorInt int r3, @androidx.annotation.ColorInt int r4, boolean r5) {
            com.github.mikephil.charting.data.LineDataSet r0 = new com.github.mikephil.charting.data.LineDataSet
            r0.<init>(r1, r2)
            r0.setColor(r4)
            r0.setValueTextColor(r3)
            com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER
            r0.setMode(r1)
            r1 = 0
            r0.setDrawValues(r1)
            r2 = 1
            r0.setDrawCircles(r2)
            r0.setDrawCircleHole(r1)
            r0.setHighlightEnabled(r2)
            r0.setHighLightColor(r1)
            if (r5 == 0) goto L29
            r0.setDrawFilled(r2)
            r0.setFillColor(r4)
        L29:
            r0.setCircleColor(r4)
            r1 = 1080033280(0x40600000, float:3.5)
            r0.setCircleRadius(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setLineWidth(r1)
            return r0
    }

    public static void f(com.github.mikephil.charting.charts.BarChart r1, java.util.List<com.github.mikephil.charting.data.BarEntry> r2, java.lang.String r3, @androidx.annotation.ColorInt int r4) {
            com.github.mikephil.charting.data.BarDataSet r0 = new com.github.mikephil.charting.data.BarDataSet
            r0.<init>(r2, r3)
            r2 = -1
            r0.setValueTextColor(r2)
            r0.setColor(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r0)
            com.github.mikephil.charting.data.BarData r4 = new com.github.mikephil.charting.data.BarData
            r4.<init>(r3)
            r3 = 1092616192(0x41200000, float:10.0)
            r4.setValueTextSize(r3)
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r4.setBarWidth(r3)
            r4.setValueTextColor(r2)
            com.bxkj.student.run.app.utils.m$d r2 = new com.bxkj.student.run.app.utils.m$d
            r2.<init>()
            r4.setValueFormatter(r2)
            r1.setData(r4)
            r1.invalidate()
            return
    }

    public static void g(com.github.mikephil.charting.charts.CombinedChart r4, com.github.mikephil.charting.data.LineData... r5) {
            com.github.mikephil.charting.data.CombinedData r0 = new com.github.mikephil.charting.data.CombinedData
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            r0.setData(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            r4.setData(r0)
            r4.invalidate()
            return
    }
}
