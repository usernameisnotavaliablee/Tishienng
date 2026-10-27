package com.bxkj.student.run.app.keep;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SyncKeepDataActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private int a0;
    private java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> b0;

    @org.jetbrains.annotations.NotNull
    private final java.text.DateFormat c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.keep.SyncKeepDataActivity a;

        a(com.bxkj.student.run.app.keep.SyncKeepDataActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                if (r3 == 0) goto L1f
                int r0 = r3.size()
                if (r0 <= 0) goto L1f
                com.bxkj.student.run.app.keep.SyncKeepDataActivity r0 = r2.a
                r1 = 0
                com.bxkj.student.run.app.keep.SyncKeepDataActivity.o0(r0, r1)
                com.bxkj.student.run.app.keep.SyncKeepDataActivity r0 = r2.a
                com.bxkj.student.run.app.keep.SyncKeepDataActivity.n0(r0, r3)
                com.bxkj.student.run.app.keep.SyncKeepDataActivity r3 = r2.a
                r3.x0()
                return
            L1f:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.keep.SyncKeepDataActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.run.app.keep.SyncKeepDataActivity.l0(r0)
                r3.<init>(r0)
                com.bxkj.student.run.app.keep.SyncKeepDataActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.keep.SyncKeepDataActivity.m0(r0)
                if (r0 != 0) goto L38
                java.lang.String r0 = "tv_date"
                kotlin.jvm.internal.g0.S(r0)
                r0 = 0
            L38:
                java.lang.CharSequence r0 = r0.getText()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = "当天没有跑步数据"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.keep.SyncKeepDataActivity a;

        b(com.bxkj.student.run.app.keep.SyncKeepDataActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r2 = this;
                com.bxkj.student.run.app.keep.SyncKeepDataActivity r0 = r2.a
                int r0 = com.bxkj.student.run.app.keep.SyncKeepDataActivity.k0(r0)
                com.bxkj.student.run.app.keep.SyncKeepDataActivity r1 = r2.a
                int r0 = r0 + 1
                com.bxkj.student.run.app.keep.SyncKeepDataActivity.o0(r1, r0)
                com.bxkj.student.run.app.keep.SyncKeepDataActivity r0 = r2.a
                r0.x0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                return
        }
    }

    public SyncKeepDataActivity() {
            r3 = this;
            r3.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            r3.c0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0) {
            r0(r0)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0, android.view.View r1) {
            p0(r0, r1)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0, android.widget.DatePicker r1, int r2, int r3, int r4) {
            v0(r0, r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void j0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0, android.view.View r1) {
            q0(r0, r1)
            return
    }

    public static final /* synthetic */ int k0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0) {
            int r0 = r0.a0
            return r0
    }

    public static final /* synthetic */ android.content.Context l0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static final /* synthetic */ android.widget.TextView m0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    public static final /* synthetic */ void n0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0, java.util.List r1) {
            r0.b0 = r1
            return
    }

    public static final /* synthetic */ void o0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0, int r1) {
            r0.a0 = r1
            return
    }

    private static final void p0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0, android.view.View r1) {
            r0.u0()
            return
    }

    private static final void q0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r1, android.view.View r2) {
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getKeepToken()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L34
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r0 = r1.V
            r2.<init>(r0)
            java.lang.String r0 = "系统检测到您还未绑定Keep账号,请先绑定Keep账号"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setMessage(r0)
            java.lang.String r0 = "暂不绑定"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setLeftButtonText(r0)
            java.lang.String r0 = "去绑定"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setRightButtonText(r0)
            com.bxkj.student.run.app.keep.e r0 = new com.bxkj.student.run.app.keep.e
            r0.<init>(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r2.setRightButtonOnClickListener(r0)
            r1.show()
            return
        L34:
            r1.w0()
            return
    }

    private static final void r0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r3) {
            android.content.Context r0 = r3.V
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r3 = r3.V
            java.lang.Class<com.bxkj.student.run.app.keep.KeepAuthH5Activity> r2 = com.bxkj.student.run.app.keep.KeepAuthH5Activity.class
            r1.<init>(r3, r2)
            r0.startActivity(r1)
            return
    }

    private final java.util.List<java.lang.Integer> s0(java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> r12) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r12.iterator()
            r2 = 1
            r3 = 0
            r4 = 1
        Lc:
            boolean r5 = r1.hasNext()
            java.lang.String r6 = "currentTotalSteps"
            if (r5 == 0) goto L3c
            java.lang.Object r5 = r1.next()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r7 = "currentTotalDuration"
            double r7 = cn.bluemobi.dylan.http.JsonParse.getDouble(r5, r7)
            int r5 = cn.bluemobi.dylan.http.JsonParse.getInt(r5, r6)
            int r6 = r4 * 60
            double r9 = (double) r6
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto L36
            int r5 = r5 - r3
            int r3 = r3 + r5
            int r4 = r4 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L36:
            java.io.PrintStream r5 = java.lang.System.out
            r5.getClass()
            goto Lc
        L3c:
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5e
            int r1 = r12.size()
            int r1 = r1 - r2
            java.lang.Object r12 = r12.get(r1)
            java.util.Map r12 = (java.util.Map) r12
            int r12 = cn.bluemobi.dylan.http.JsonParse.getInt(r12, r6)
            int r12 = r12 - r3
            if (r12 <= 0) goto L5e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.add(r12)
        L5e:
            return r0
    }

    private final java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> t0(java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r8.next()
            java.util.Map r1 = (java.util.Map) r1
            com.bxkj.student.run.app.location.LatLngTimeSpeed r2 = new com.bxkj.student.run.app.location.LatLngTimeSpeed
            r2.<init>()
            java.lang.String r3 = "latitude"
            double r3 = cn.bluemobi.dylan.http.JsonParse.getDouble(r1, r3)
            r2.setLatitude(r3)
            java.lang.String r3 = "longitude"
            double r3 = cn.bluemobi.dylan.http.JsonParse.getDouble(r1, r3)
            r2.setLongitude(r3)
            java.lang.String r3 = "locationType"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r3)
            r2.setLocationType(r3)
            java.lang.String r3 = "speed"
            float r3 = cn.bluemobi.dylan.http.JsonParse.getFloat(r1, r3)
            r2.setSpeed(r3)
            java.lang.String r3 = "currentTotalDuration"
            double r3 = cn.bluemobi.dylan.http.JsonParse.getDouble(r1, r3)
            r1 = 1000(0x3e8, float:1.401E-42)
            double r5 = (double) r1
            double r3 = r3 * r5
            long r3 = (long) r3
            r2.setTime(r3)
            r1 = 0
            r2.setPuase(r1)
            r0.add(r2)
            goto L9
        L55:
            return r0
    }

    private final void u0() {
            r8 = this;
            java.util.Locale r0 = java.util.Locale.CHINA
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setTime(r1)
            r1 = 1
            int r5 = r0.get(r1)
            r1 = 2
            int r6 = r0.get(r1)
            r1 = 5
            int r7 = r0.get(r1)
            android.app.DatePickerDialog r2 = new android.app.DatePickerDialog
            android.content.Context r3 = r8.V
            com.bxkj.student.run.app.keep.b r4 = new com.bxkj.student.run.app.keep.b
            r4.<init>(r8)
            r2.<init>(r3, r4, r5, r6, r7)
            r2.show()
            return
    }

    private static final void v0(com.bxkj.student.run.app.keep.SyncKeepDataActivity r0, android.widget.DatePicker r1, int r2, int r3, int r4) {
            int r3 = r3 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.text.DateFormat r2 = r0.c0     // Catch: java.text.ParseException -> L2d
            java.util.Date r3 = r2.parse(r1)     // Catch: java.text.ParseException -> L2d
            java.lang.String r2 = r2.format(r3)     // Catch: java.text.ParseException -> L2d
            java.lang.String r3 = "format(...)"
            kotlin.jvm.internal.g0.o(r2, r3)     // Catch: java.text.ParseException -> L2d
            r1 = r2
            goto L2e
        L2d:
        L2e:
            android.widget.TextView r0 = r0.Y
            if (r0 != 0) goto L38
            java.lang.String r0 = "tv_date"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        L38:
            r0.setText(r1)
            return
    }

    private final void w0() {
            r10 = this;
            android.content.Context r0 = r10.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getKeepToken()
            android.widget.TextView r3 = r10.Y
            if (r3 != 0) goto L20
            java.lang.String r3 = "tv_date"
            kotlin.jvm.internal.g0.S(r3)
            r3 = 0
        L20:
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r4 = r3.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "-"
            java.lang.String r6 = ""
            r7 = 0
            java.lang.String r3 = kotlin.text.u.x2(r4, r5, r6, r7, r8, r9)
            rx.e r1 = r1.q(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.j r1 = new com.bxkj.student.j
            r1.<init>()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setHttpJsonKey(r1)
            com.bxkj.student.run.app.keep.SyncKeepDataActivity$a r1 = new com.bxkj.student.run.app.keep.SyncKeepDataActivity$a
            r1.<init>(r10)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r3 = this;
            android.widget.TextView r0 = r3.Y
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "tv_date"
            kotlin.jvm.internal.g0.S(r0)
            r0 = r1
        Lb:
            com.bxkj.student.run.app.keep.c r2 = new com.bxkj.student.run.app.keep.c
            r2.<init>(r3)
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r3.Z
            if (r0 != 0) goto L1d
            java.lang.String r0 = "bt_sync"
            kotlin.jvm.internal.g0.S(r0)
            goto L1e
        L1d:
            r1 = r0
        L1e:
            com.bxkj.student.run.app.keep.d r0 = new com.bxkj.student.run.app.keep.d
            r0.<init>(r3)
            r1.setOnClickListener(r0)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493035(0x7f0c00ab, float:1.8609539E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.widget.TextView r0 = r3.Y
            if (r0 != 0) goto La
            java.lang.String r0 = "tv_date"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            java.text.DateFormat r1 = r3.c0
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r1 = r1.format(r2)
            r0.setText(r1)
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "同步keep跑步记录"
            r2.setTitle(r0)
            android.content.Context r0 = r2.V
            r1 = 2131099737(0x7f060059, float:1.7811836E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r2.d0(r0)
            return
    }

    public void T(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298860(0x7f090a2c, float:1.8215705E38)
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r0 = "findViewById(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            r2 = 2131296648(0x7f090188, float:1.8211219E38)
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.g0.o(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Z = r2
            return
    }

    public void onClick(@org.jetbrains.annotations.Nullable android.view.View r1) {
            r0 = this;
            return
    }

    public final void x0() {
            r28 = this;
            r0 = r28
            int r1 = r0.a0
            java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r2 = r0.b0
            r3 = 0
            java.lang.String r4 = "dataList"
            if (r2 != 0) goto Lf
            kotlin.jvm.internal.g0.S(r4)
            r2 = r3
        Lf:
            int r2 = r2.size()
            if (r1 < r2) goto L26
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r2 = r0.V
            r1.<init>(r2)
            java.lang.String r2 = "同步Keep数据成功"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
            r1.show()
            return
        L26:
            java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r1 = r0.b0
            if (r1 != 0) goto L2e
            kotlin.jvm.internal.g0.S(r4)
            goto L2f
        L2e:
            r3 = r1
        L2f:
            int r1 = r0.a0
            java.lang.Object r1 = r3.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "doubtfulScore"
            double r2 = cn.bluemobi.dylan.http.JsonParse.getDouble(r1, r2)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L44
            goto L4a
        L44:
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Ld8
        L4a:
            java.lang.String r2 = "duration"
            double r2 = cn.bluemobi.dylan.http.JsonParse.getDouble(r1, r2)
            long r2 = (long) r2
            java.lang.String r13 = com.bxkj.student.run.app.utils.i.g(r2)
            java.lang.String r4 = "distance"
            double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r1, r4)
            java.lang.String r14 = com.bxkj.student.run.app.utils.i.c(r4)
            java.lang.String r15 = com.bxkj.student.run.app.utils.i.a(r4, r2)
            java.lang.String r16 = com.bxkj.student.run.app.utils.i.b(r4, r2)
            java.lang.String r2 = "geoPoints"
            java.util.List r2 = cn.bluemobi.dylan.http.JsonParse.getList(r1, r2)
            kotlin.jvm.internal.g0.m(r2)
            java.util.List r3 = r0.s0(r2)
            java.lang.String r23 = com.alibaba.fastjson.JSON.toJSONString(r3)
            java.util.List r2 = r0.t0(r2)
            java.lang.String r11 = com.alibaba.fastjson.JSON.toJSONString(r2)
            android.content.Context r2 = r0.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            java.lang.Class<com.bxkj.student.run.app.a> r3 = com.bxkj.student.run.app.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            r4 = r3
            com.bxkj.student.run.app.a r4 = (com.bxkj.student.run.app.a) r4
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r3.getUserId()
            java.lang.String r3 = "startTime"
            long r7 = cn.bluemobi.dylan.http.JsonParse.getLong(r1, r3)
            java.lang.String r3 = "endTime"
            long r9 = cn.bluemobi.dylan.http.JsonParse.getLong(r1, r3)
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r12 = r3.toString()
            r3 = 4
            java.lang.Integer r26 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "id"
            java.lang.String r27 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
            r6 = 2
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            rx.e r1 = r4.l(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            cn.bluemobi.dylan.http.HttpRequest r1 = r2.setObservable(r1)
            com.bxkj.student.run.app.keep.SyncKeepDataActivity$b r2 = new com.bxkj.student.run.app.keep.SyncKeepDataActivity$b
            r2.<init>(r0)
            r1.setDataListener(r2)
            return
        Ld8:
            int r1 = r0.a0
            int r1 = r1 + 1
            r0.a0 = r1
            r0.x0()
            return
    }
}
