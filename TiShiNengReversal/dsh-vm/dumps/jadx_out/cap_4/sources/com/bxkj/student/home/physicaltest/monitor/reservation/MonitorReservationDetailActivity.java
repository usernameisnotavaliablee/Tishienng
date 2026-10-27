package com.bxkj.student.home.physicaltest.monitor.reservation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MonitorReservationDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String Y;
    private android.widget.LinearLayout Z;
    private android.widget.Button a0;
    private long b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity a;

        a(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity r0 = r3.a
                java.lang.String r1 = "currentTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                long r1 = java.lang.Long.parseLong(r1)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity.g0(r0, r1)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity r0 = r3.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity r0 = r3.a
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity.h0(r0, r4)
                return
        }
    }

    public MonitorReservationDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ void g0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity r0, long r1) {
            r0.b0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void h0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity r0, java.util.Map r1) {
            r0.k0(r1)
            return
    }

    private void i0(java.lang.String r4) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            r1 = 1109393408(0x42200000, float:40.0)
            android.content.Context r2 = r3.V
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            r0.setMinHeight(r1)
            r1 = 2
            r2 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r1, r2)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setTextColor(r1)
            r1 = 16
            r0.setGravity(r1)
            r0.setText(r4)
            android.widget.LinearLayout r4 = r3.Z
            r4.addView(r0)
            android.view.View r4 = new android.view.View
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 1065353216(0x3f800000, float:1.0)
            android.content.Context r2 = r3.V
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            r2 = -1
            r0.<init>(r2, r1)
            r4.setLayoutParams(r0)
            android.content.res.Resources r0 = r3.getResources()
            r1 = 2131099732(0x7f060054, float:1.7811826E38)
            int r0 = r0.getColor(r1)
            r4.setBackgroundColor(r0)
            android.widget.LinearLayout r0 = r3.Z
            r0.addView(r4)
            return
    }

    private void j0() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity> r1 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.class
            android.app.Activity r0 = r0.getActivity(r1)
            com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = (com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity) r0
            if (r0 == 0) goto L15
            android.content.Context r1 = r3.V
            java.lang.String r2 = r3.Y
            r0.s0(r1, r2)
        L15:
            return
    }

    private void k0(java.util.Map<java.lang.String, java.lang.Object> r11) {
            r10 = this;
            java.lang.String r0 = "meaSchedule"
            java.lang.Object r0 = r11.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "体测名称："
            r1.append(r2)
            java.lang.String r2 = "scheduleName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.i0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "预约开始时间："
            r1.append(r2)
            java.lang.String r2 = "appointmentBeginTime"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.i0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "预约结束时间："
            r1.append(r2)
            java.lang.String r2 = "appointmentEndTime"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r10.i0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "体测开始时间："
            r1.append(r3)
            java.lang.String r3 = "meaBeginTime"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r10.i0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "体测结束时间："
            r1.append(r3)
            java.lang.String r3 = "meaEndTime"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r10.i0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "预约类型："
            r1.append(r3)
            java.lang.String r3 = "appointmentType"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            java.lang.String r4 = "2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La5
            java.lang.String r3 = "个人预约"
            goto La7
        La5:
            java.lang.String r3 = "班长预约"
        La7:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r10.i0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "班级数:"
            r1.append(r3)
            java.lang.String r3 = "appliedClasses"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            r1.append(r4)
            java.lang.String r4 = "/"
            r1.append(r4)
            java.lang.String r4 = "appClassAmount"
            int r5 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r4)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r10.i0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "体测说明："
            r1.append(r5)
            java.lang.String r5 = "description"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r5)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r10.i0(r1)
            java.lang.String r1 = "meaScheduleExams"
            java.lang.Object r11 = r11.get(r1)
            java.util.List r11 = (java.util.List) r11
            int r1 = r11.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r5 = 0
            r6 = 0
        L103:
            int r7 = r11.size()
            if (r6 >= r7) goto L11a
            java.lang.Object r7 = r11.get(r6)
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r8 = "examName"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r8)
            r1[r6] = r7
            int r6 = r6 + 1
            goto L103
        L11a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r6 = "体测项目："
            r11.append(r6)
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r10.i0(r11)
            java.lang.String r11 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1 = 1
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L17c
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss.SSS"
            r2.<init>(r6)     // Catch: java.text.ParseException -> L17c
            java.util.Date r11 = r2.parse(r11)     // Catch: java.text.ParseException -> L17c
            long r6 = r11.getTime()     // Catch: java.text.ParseException -> L17c
            long r8 = r10.b0     // Catch: java.text.ParseException -> L17c
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 < 0) goto L159
            android.widget.Button r11 = r10.a0     // Catch: java.text.ParseException -> L17c
            java.lang.String r0 = "预约已结束"
            r11.setText(r0)     // Catch: java.text.ParseException -> L17c
            android.widget.Button r11 = r10.a0     // Catch: java.text.ParseException -> L17c
            r11.setEnabled(r5)     // Catch: java.text.ParseException -> L17c
            goto L17c
        L159:
            int r11 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r3)     // Catch: java.text.ParseException -> L17c
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r4)     // Catch: java.text.ParseException -> L17c
            if (r11 < r0) goto L170
            android.widget.Button r11 = r10.a0     // Catch: java.text.ParseException -> L17c
            java.lang.String r0 = "预约班级已满"
            r11.setText(r0)     // Catch: java.text.ParseException -> L17c
            android.widget.Button r11 = r10.a0     // Catch: java.text.ParseException -> L17c
            r11.setEnabled(r5)     // Catch: java.text.ParseException -> L17c
            goto L17c
        L170:
            android.widget.Button r11 = r10.a0     // Catch: java.text.ParseException -> L17c
            r11.setEnabled(r1)     // Catch: java.text.ParseException -> L17c
            android.widget.Button r11 = r10.a0     // Catch: java.text.ParseException -> L17c
            java.lang.String r0 = "立即预约"
            r11.setText(r0)     // Catch: java.text.ParseException -> L17c
        L17c:
            android.widget.LinearLayout r11 = r10.Z
            int r0 = r11.getChildCount()
            int r0 = r0 - r1
            r11.removeViewAt(r0)
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.a0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493006(0x7f0c008e, float:1.860948E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.Y = r0
        L16:
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r4.Y
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.t(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity$a r1 = new com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "体测预约详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298030(0x7f0906ee, float:1.8214022E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.Z = r2
            r2 = 2131296639(0x7f09017f, float:1.82112E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.a0 = r2
            android.widget.FrameLayout r2 = r1.P()
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296639(0x7f09017f, float:1.82112E38)
            if (r2 == r0) goto La
            return
        La:
            r1.j0()
            return
    }
}
