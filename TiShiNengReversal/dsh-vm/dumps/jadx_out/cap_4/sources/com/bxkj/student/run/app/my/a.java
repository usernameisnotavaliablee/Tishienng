package com.bxkj.student.run.app.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static final java.lang.String c = "BarChartUtils";
    private com.github.mikephil.charting.charts.BarChart a;
    private com.github.mikephil.charting.components.XAxis b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.run.app.my.a$a, reason: collision with other inner class name */
    class C0133a implements com.github.mikephil.charting.listener.OnChartValueSelectedListener {
        final /* synthetic */ com.bxkj.student.run.app.my.a a;

        C0133a(com.bxkj.student.run.app.my.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onNothingSelected() {
                r0 = this;
                return
        }

        public void onValueSelected(com.github.mikephil.charting.data.Entry r1, com.github.mikephil.charting.highlight.Highlight r2) {
                r0 = this;
                r1.getX()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends com.github.mikephil.charting.formatter.ValueFormatter {
        final /* synthetic */ com.bxkj.student.run.app.my.a a;

        b(com.bxkj.student.run.app.my.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r1, com.github.mikephil.charting.components.AxisBase r2) {
                r0 = this;
                int r1 = (int) r1
                if (r1 != 0) goto L6
                java.lang.String r1 = ""
                return r1
            L6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = "%"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends com.github.mikephil.charting.formatter.ValueFormatter {
        final /* synthetic */ com.bxkj.student.run.app.my.a a;

        c(com.bxkj.student.run.app.my.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String getFormattedValue(float r1, com.github.mikephil.charting.components.AxisBase r2) {
                r0 = this;
                int r1 = (int) r1
                if (r1 != 0) goto L6
                java.lang.String r1 = ""
                return r1
            L6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = "%"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends com.github.mikephil.charting.formatter.ValueFormatter {
        private java.util.ArrayList<java.lang.String> a;
        final /* synthetic */ com.bxkj.student.run.app.my.a b;

        public d(com.bxkj.student.run.app.my.a r1, java.util.ArrayList<java.lang.String> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        public java.lang.String getFormattedValue(float r1, com.github.mikephil.charting.components.AxisBase r2) {
                r0 = this;
                int r1 = (int) r1
                java.util.ArrayList<java.lang.String> r2 = r0.a
                int r2 = r2.size()
                if (r1 >= r2) goto L12
                java.util.ArrayList<java.lang.String> r2 = r0.a
                java.lang.Object r1 = r2.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                return r1
            L12:
                java.lang.String r1 = ""
                return r1
        }
    }

    public a(com.github.mikephil.charting.charts.BarChart r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.a()
            r0.b()
            return
    }

    private void a() {
            r4 = this;
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r1 = 0
            r0.setDrawGridBackground(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r2 = 1
            r0.setTouchEnabled(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r0.setDragEnabled(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r0.setScaleEnabled(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            com.github.mikephil.charting.components.Description r0 = r0.getDescription()
            java.lang.String r3 = ""
            r0.setText(r3)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r0.setDrawBorders(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r3 = 1092616192(0x41200000, float:10.0)
            r0.setExtraBottomOffset(r3)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r0.setDrawValueAboveBar(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r0.setDrawBarShadow(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            com.github.mikephil.charting.components.Legend r0 = r0.getLegend()
            r0.setEnabled(r2)
            com.github.mikephil.charting.components.Legend$LegendForm r3 = com.github.mikephil.charting.components.Legend.LegendForm.CIRCLE
            r0.setForm(r3)
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            r0.setVerticalAlignment(r3)
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r0.setHorizontalAlignment(r3)
            com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL
            r0.setOrientation(r3)
            r0.setDrawInside(r1)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            r0.setPinchZoom(r2)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            com.bxkj.student.run.app.my.a$a r3 = new com.bxkj.student.run.app.my.a$a
            r3.<init>(r4)
            r0.setOnChartValueSelectedListener(r3)
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            com.github.mikephil.charting.components.XAxis r0 = r0.getXAxis()
            r4.b = r0
            r0.setDrawAxisLine(r2)
            com.github.mikephil.charting.components.XAxis r0 = r4.b
            r0.setDrawGridLines(r1)
            com.github.mikephil.charting.components.XAxis r0 = r4.b
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setGranularity(r1)
            com.github.mikephil.charting.components.XAxis r0 = r4.b
            r0.setCenterAxisLabels(r2)
            com.github.mikephil.charting.components.XAxis r0 = r4.b
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            r0.setPosition(r1)
            com.github.mikephil.charting.components.XAxis r0 = r4.b
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.setTextColor(r1)
            return
    }

    private void b() {
            r4 = this;
            com.github.mikephil.charting.charts.BarChart r0 = r4.a
            com.github.mikephil.charting.components.YAxis r0 = r0.getAxisLeft()
            com.github.mikephil.charting.charts.BarChart r1 = r4.a
            com.github.mikephil.charting.components.YAxis r1 = r1.getAxisRight()
            r2 = 1
            r0.setDrawAxisLine(r2)
            r2 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r2)
            r2 = 5
            r3 = 0
            r0.setLabelCount(r2, r3)
            r2 = 0
            r0.setAxisMinimum(r2)
            r1.setAxisMinimum(r2)
            r1.setEnabled(r3)
            com.bxkj.student.run.app.my.a$b r1 = new com.bxkj.student.run.app.my.a$b
            r1.<init>(r4)
            r0.setValueFormatter(r1)
            return
    }

    public void c(java.util.List<com.github.mikephil.charting.data.BarEntry> r2, java.lang.String r3, int r4, java.util.ArrayList<java.lang.String> r5) {
            r1 = this;
            com.github.mikephil.charting.data.BarDataSet r0 = new com.github.mikephil.charting.data.BarDataSet
            r0.<init>(r2, r3)
            r0.setColor(r4)
            r2 = 1096810496(0x41600000, float:14.0)
            r0.setValueTextSize(r2)
            r2 = 1
            r0.setDrawValues(r2)
            r2 = 37
            r0.setHighLightAlpha(r2)
            com.bxkj.student.run.app.my.a$c r2 = new com.bxkj.student.run.app.my.a$c
            r2.<init>(r1)
            r0.setValueFormatter(r2)
            com.bxkj.student.run.app.my.a$d r2 = new com.bxkj.student.run.app.my.a$d
            r2.<init>(r1, r5)
            com.github.mikephil.charting.components.XAxis r3 = r1.b
            r3.setValueFormatter(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r0)
            com.github.mikephil.charting.data.BarData r3 = new com.github.mikephil.charting.data.BarData
            r3.<init>(r2)
            com.github.mikephil.charting.charts.BarChart r2 = r1.a
            r2.setData(r3)
            return
    }
}
