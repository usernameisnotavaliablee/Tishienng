package com.bxkj.student.home.physicaltest.personal.reservation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ReservationDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String Y;
    private android.widget.LinearLayout Z;
    private android.widget.Button a0;
    private long b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity a;

        a(com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r0 = r3.a
                android.widget.LinearLayout r0 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity.g0(r0)
                r0.removeAllViews()
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r0 = r3.a
                java.lang.String r1 = "currentTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                long r1 = java.lang.Long.parseLong(r1)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity.h0(r0, r1)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r0 = r3.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r0 = r3.a
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity.i0(r0, r4)
                return
        }
    }

    public ReservationDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.LinearLayout g0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r0) {
            android.widget.LinearLayout r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ void h0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r0, long r1) {
            r0.b0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r0, java.util.Map r1) {
            r0.l0(r1)
            return
    }

    private void j0(java.lang.String r4) {
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

    private void k0() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity> r1 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.class
            android.app.Activity r0 = r0.getActivity(r1)
            com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = (com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity) r0
            if (r0 == 0) goto L15
            android.content.Context r1 = r3.V
            java.lang.String r2 = r3.Y
            r0.s0(r1, r2)
        L15:
            return
    }

    private void l0(java.util.Map<java.lang.String, java.lang.Object> r12) {
            r11 = this;
            java.lang.String r0 = "meaSchedule"
            java.lang.Object r0 = r12.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "体测名称："
            r1.append(r2)
            java.lang.String r2 = "scheduleName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "预约开始时间："
            r1.append(r2)
            java.lang.String r2 = "appointmentBeginTime"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "预约结束时间："
            r1.append(r2)
            java.lang.String r2 = "appointmentEndTime"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "体测开始时间："
            r1.append(r3)
            java.lang.String r3 = "meaBeginTime"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "体测结束时间："
            r1.append(r3)
            java.lang.String r3 = "meaEndTime"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.String r1 = "classType"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            java.lang.String r3 = "0"
            boolean r3 = r1.equals(r3)
            java.lang.String r4 = "1"
            java.lang.String r5 = "已预约人数："
            java.lang.String r6 = "totalAppliedNumber"
            java.lang.String r7 = "总人数："
            java.lang.String r8 = "totalNumber"
            if (r3 == 0) goto Ld5
            java.lang.String r1 = "班级类型：混合班"
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r6)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            goto L193
        Ld5:
            boolean r3 = r1.equals(r4)
            if (r3 == 0) goto L10e
            java.lang.String r1 = "班级类型：男生班"
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r6)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            goto L193
        L10e:
            java.lang.String r3 = "2"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L148
            java.lang.String r1 = "班级类型：女生班"
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r6)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            goto L193
        L148:
            java.lang.String r3 = "3"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L193
            java.lang.String r1 = "班级类型：比例班"
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "已预约人数：男:"
            r1.append(r3)
            java.lang.String r3 = "maleAppliedNumber"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            r1.append(r3)
            java.lang.String r3 = ";女："
            r1.append(r3)
            java.lang.String r3 = "femaleAppliedNumber"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
        L193:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "体测说明："
            r1.append(r3)
            java.lang.String r3 = "description"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.j0(r1)
            java.lang.String r1 = "meaScheduleExams"
            java.lang.Object r12 = r12.get(r1)
            java.util.List r12 = (java.util.List) r12
            int r1 = r12.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r3 = 0
            r5 = 0
        L1bd:
            int r7 = r12.size()
            if (r5 >= r7) goto L1d4
            java.lang.Object r7 = r12.get(r5)
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r9 = "examName"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r9)
            r1[r5] = r7
            int r5 = r5 + 1
            goto L1bd
        L1d4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r5 = "体测项目："
            r12.append(r5)
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            r11.j0(r12)
            java.lang.String r12 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            java.lang.String r1 = "ismeastate"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = r4.equals(r1)
            r2 = 1
            if (r1 == 0) goto L20a
            android.widget.Button r12 = r11.a0
            java.lang.String r0 = "已预约"
            r12.setText(r0)
            android.widget.Button r12 = r11.a0
            r12.setEnabled(r3)
            goto L24f
        L20a:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L24f
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss.SSS"
            r1.<init>(r4)     // Catch: java.text.ParseException -> L24f
            java.util.Date r12 = r1.parse(r12)     // Catch: java.text.ParseException -> L24f
            long r4 = r12.getTime()     // Catch: java.text.ParseException -> L24f
            long r9 = r11.b0     // Catch: java.text.ParseException -> L24f
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 < 0) goto L22c
            android.widget.Button r12 = r11.a0     // Catch: java.text.ParseException -> L24f
            java.lang.String r0 = "预约已结束"
            r12.setText(r0)     // Catch: java.text.ParseException -> L24f
            android.widget.Button r12 = r11.a0     // Catch: java.text.ParseException -> L24f
            r12.setEnabled(r3)     // Catch: java.text.ParseException -> L24f
            goto L24f
        L22c:
            int r12 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r6)     // Catch: java.text.ParseException -> L24f
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r8)     // Catch: java.text.ParseException -> L24f
            if (r12 < r0) goto L243
            android.widget.Button r12 = r11.a0     // Catch: java.text.ParseException -> L24f
            java.lang.String r0 = "预约人数已满"
            r12.setText(r0)     // Catch: java.text.ParseException -> L24f
            android.widget.Button r12 = r11.a0     // Catch: java.text.ParseException -> L24f
            r12.setEnabled(r3)     // Catch: java.text.ParseException -> L24f
            goto L24f
        L243:
            android.widget.Button r12 = r11.a0     // Catch: java.text.ParseException -> L24f
            r12.setEnabled(r2)     // Catch: java.text.ParseException -> L24f
            android.widget.Button r12 = r11.a0     // Catch: java.text.ParseException -> L24f
            java.lang.String r0 = "立即预约"
            r12.setText(r0)     // Catch: java.text.ParseException -> L24f
        L24f:
            android.widget.LinearLayout r12 = r11.Z
            int r0 = r12.getChildCount()
            int r0 = r0 - r2
            r12.removeViewAt(r0)
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
            com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity$a r1 = new com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity$a
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
            r1.k0()
            return
    }
}
