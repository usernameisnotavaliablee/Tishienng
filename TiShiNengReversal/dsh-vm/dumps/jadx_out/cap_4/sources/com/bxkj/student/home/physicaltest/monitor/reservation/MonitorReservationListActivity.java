package com.bxkj.student.home.physicaltest.monitor.reservation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MonitorReservationListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private long F0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private int b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f792k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f793p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity a;

        a(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r4 = r3.a
                int r4 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.m0(r4)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.k0(r0)
                int r4 = r4 / r0
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.j0(r0)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r1 = r3.a
                int r1 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.m0(r1)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r2 = r3.a
                int r2 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.k0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.l0(r4)
                r4.q0()
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r4 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.j0(r4)
                int r0 = r0 + 1
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.p0(r4, r0)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r4 = r3.a
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.q0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.p0(r2, r0)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r2 = r1.a
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.q0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.b b;

            a(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.b r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b r4 = r3.b
                    com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r4 = r4.k
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b r1 = r3.b
                    android.content.Context r1 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.b.m(r1)
                    java.lang.Class<com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity> r2 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity.class
                    r0.<init>(r1, r2)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    r4.startActivity(r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b$b, reason: collision with other inner class name */
        class ViewOnClickListenerC0077b implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.b b;

            ViewOnClickListenerC0077b(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.b r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b r4 = r3.b
                    com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r4.k
                    android.content.Context r4 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.b.n(r4)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r0.s0(r4, r1)
                    return
            }
        }

        b(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
                r8 = this;
                java.lang.String r0 = "scheduleName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r9.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "appointmentBeginTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
                r0.append(r1)
                java.lang.String r1 = "\n"
                r0.append(r1)
                java.lang.String r2 = "appointmentEndTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r2)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r3 = 2131299074(0x7f090b02, float:1.821614E38)
                r9.J(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "meaBeginTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r3)
                r0.append(r3)
                r0.append(r1)
                java.lang.String r1 = "meaEndTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298975(0x7f090a9f, float:1.8215938E38)
                r9.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "班级数:"
                r0.append(r1)
                java.lang.String r1 = "appliedClasses"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
                r0.append(r3)
                java.lang.String r3 = "/"
                r0.append(r3)
                java.lang.String r3 = "appClassAmount"
                int r4 = cn.bluemobi.dylan.http.JsonParse.getInt(r10, r3)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                r4 = 2131298908(0x7f090a5c, float:1.8215802E38)
                r9.J(r4, r0)
                java.lang.String r0 = "appointmentType"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                java.lang.String r4 = "2"
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L92
                java.lang.String r0 = "个人预约"
                goto L94
            L92:
                java.lang.String r0 = "班长预约"
            L94:
                r4 = 2131299171(0x7f090b63, float:1.8216336E38)
                r9.J(r4, r0)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b$a r0 = new com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b$a
                r0.<init>(r8, r10)
                r4 = 2131296604(0x7f09015c, float:1.821113E38)
                r9.w(r4, r0)
                r0 = 2131296639(0x7f09017f, float:1.82112E38)
                android.view.View r9 = r9.h(r0)
                android.widget.Button r9 = (android.widget.Button) r9
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r2)
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> Lf1
                java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
                r2.<init>(r4)     // Catch: java.text.ParseException -> Lf1
                java.util.Date r0 = r2.parse(r0)     // Catch: java.text.ParseException -> Lf1
                long r4 = r0.getTime()     // Catch: java.text.ParseException -> Lf1
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r8.k     // Catch: java.text.ParseException -> Lf1
                long r6 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.h0(r0)     // Catch: java.text.ParseException -> Lf1
                r0 = 0
                int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r2 < 0) goto Ld5
                java.lang.String r1 = "预约已结束"
                r9.setText(r1)     // Catch: java.text.ParseException -> Lf1
                r9.setEnabled(r0)     // Catch: java.text.ParseException -> Lf1
                goto Lf1
            Ld5:
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r10, r1)     // Catch: java.text.ParseException -> Lf1
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r10, r3)     // Catch: java.text.ParseException -> Lf1
                if (r1 < r2) goto Le8
                java.lang.String r1 = "预约班级已满"
                r9.setText(r1)     // Catch: java.text.ParseException -> Lf1
                r9.setEnabled(r0)     // Catch: java.text.ParseException -> Lf1
                goto Lf1
            Le8:
                r0 = 1
                r9.setEnabled(r0)     // Catch: java.text.ParseException -> Lf1
                java.lang.String r0 = "立即预约"
                r9.setText(r0)     // Catch: java.text.ParseException -> Lf1
            Lf1:
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b$b r0 = new com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b$b
                r0.<init>(r8, r10)
                r9.setOnClickListener(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity a;

        c(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.l0(r0)
                r0.w0()
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.l0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r3.a
                java.lang.String r1 = "currentTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                long r1 = java.lang.Long.parseLong(r1)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.n0(r0, r1)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r3.a
                java.lang.String r1 = "meaScheduleList"
                java.lang.Object r4 = r4.get(r1)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.o0(r0, r4)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.g0(r4)
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity.i0(r0)
                r4.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity a;

        d(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r2 = r1.a
                java.lang.String r0 = "预约成功"
                r2.f0(r0)
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity> r0 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationDetailActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                if (r2 == 0) goto L16
                r2.finish()
            L16:
                return
        }
    }

    public MonitorReservationListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 1
            r1.b0 = r0
            r1.c0 = r0
            r0 = 10
            r1.f792k0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f793p0
            return r0
    }

    static /* bridge */ /* synthetic */ long h0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r2) {
            long r0 = r2.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ int k0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0) {
            int r0 = r0.f792k0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout l0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0) {
            int r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0, long r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0, int r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity r0) {
            r0.r0()
            return
    }

    private void r0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            int r3 = r5.c0
            int r4 = r5.f792k0
            rx.e r1 = r1.k0(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$c r1 = new com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492999(0x7f0c0087, float:1.8609466E38)
            return r0
    }

    public void R() {
            r5 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$a r1 = new com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$a
            r1.<init>(r5)
            r0.m1(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r5, r1)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setLayoutAnimation(r0)
            com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b r0 = new com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$b
            android.content.Context r2 = r5.V
            r3 = 2131493310(0x7f0c01be, float:1.8610097E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.a0
            r0.<init>(r5, r2, r3, r4)
            r5.f793p0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r2 = 1
            r0.X0(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.S0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.D()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r5.findViewById(r1)
            r0.setEmptyView(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "预约体测列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void s0(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            cn.bluemobi.dylan.http.HttpRequest r3 = cn.bluemobi.dylan.http.Http.with(r3)
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            rx.e r4 = r0.b1(r4, r1)
            cn.bluemobi.dylan.http.HttpRequest r3 = r3.setObservable(r4)
            com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$d r4 = new com.bxkj.student.home.physicaltest.monitor.reservation.MonitorReservationListActivity$d
            r4.<init>(r2)
            r3.setDataListener(r4)
            return
    }
}
