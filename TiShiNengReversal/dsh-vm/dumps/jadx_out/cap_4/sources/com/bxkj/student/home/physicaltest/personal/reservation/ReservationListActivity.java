package com.bxkj.student.home.physicaltest.personal.reservation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ReservationListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private long F0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private int b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f796k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f797p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity a;

        a(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r4 = r3.a
                int r4 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.m0(r4)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.k0(r0)
                int r4 = r4 / r0
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.j0(r0)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r1 = r3.a
                int r1 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.m0(r1)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r2 = r3.a
                int r2 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.k0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.l0(r4)
                r4.q0()
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r4 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.j0(r4)
                int r0 = r0 + 1
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.p0(r4, r0)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r4 = r3.a
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.q0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.p0(r2, r0)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r2 = r1.a
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.q0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.b b;

            a(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.b r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b r4 = r3.b
                    com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r4 = r4.k
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b r1 = r3.b
                    android.content.Context r1 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.b.m(r1)
                    java.lang.Class<com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity> r2 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity.class
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
        /* renamed from: com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b$b, reason: collision with other inner class name */
        class ViewOnClickListenerC0080b implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.b b;

            ViewOnClickListenerC0080b(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.b r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b r4 = r3.b
                    com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = r4.k
                    android.content.Context r4 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.b.n(r4)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r0.s0(r4, r1)
                    return
            }
        }

        b(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
                r11 = this;
                java.lang.String r0 = "scheduleName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r12.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "appointmentBeginTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r1)
                r0.append(r1)
                java.lang.String r1 = "\n"
                r0.append(r1)
                java.lang.String r2 = "appointmentEndTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r2)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r3 = 2131299074(0x7f090b02, float:1.821614E38)
                r12.J(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "meaBeginTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r3)
                r0.append(r3)
                r0.append(r1)
                java.lang.String r1 = "meaEndTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298975(0x7f090a9f, float:1.8215938E38)
                r12.J(r1, r0)
                java.lang.String r0 = "classType"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r0)
                java.lang.String r1 = "0"
                boolean r1 = r0.equals(r1)
                java.lang.String r3 = "2"
                java.lang.String r4 = "1"
                java.lang.String r5 = "totalAppliedNumber"
                java.lang.String r6 = "totalNumber"
                r7 = 2131298908(0x7f090a5c, float:1.8215802E38)
                java.lang.String r8 = "/"
                if (r1 == 0) goto L95
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "混合:"
                r0.append(r1)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r5)
                r0.append(r1)
                r0.append(r8)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r6)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.J(r7, r0)
                goto L12f
            L95:
                boolean r1 = r0.equals(r4)
                java.lang.String r9 = "maleAppliedNumber"
                if (r1 == 0) goto Lc0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "男生："
                r0.append(r1)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r9)
                r0.append(r1)
                r0.append(r8)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r6)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.J(r7, r0)
                goto L12f
            Lc0:
                boolean r1 = r0.equals(r3)
                java.lang.String r10 = "femaleAppliedNumber"
                if (r1 == 0) goto Leb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "女生："
                r0.append(r1)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r10)
                r0.append(r1)
                r0.append(r8)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r6)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.J(r7, r0)
                goto L12f
            Leb:
                java.lang.String r1 = "3"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L12f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "比例:男:"
                r0.append(r1)
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r9)
                r0.append(r1)
                r0.append(r8)
                java.lang.String r1 = "maleTotalNumber"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r1)
                r0.append(r1)
                java.lang.String r1 = "\u3000女:"
                r0.append(r1)
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r10)
                r0.append(r1)
                r0.append(r8)
                java.lang.String r1 = "femaleTotalNumber"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.J(r7, r0)
            L12f:
                java.lang.String r0 = "appointmentType"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r0)
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L13e
                java.lang.String r0 = "个人预约"
                goto L140
            L13e:
                java.lang.String r0 = "班长预约"
            L140:
                r1 = 2131299171(0x7f090b63, float:1.8216336E38)
                r12.J(r1, r0)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b$a r0 = new com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b$a
                r0.<init>(r11, r13)
                r1 = 2131296604(0x7f09015c, float:1.821113E38)
                r12.w(r1, r0)
                r0 = 2131296639(0x7f09017f, float:1.82112E38)
                android.view.View r12 = r12.h(r0)
                android.widget.Button r12 = (android.widget.Button) r12
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r2)
                java.lang.String r1 = "ismeastate"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r1)
                boolean r1 = r4.equals(r1)
                r2 = 0
                if (r1 == 0) goto L174
                java.lang.String r0 = "已预约"
                r12.setText(r0)
                r12.setEnabled(r2)
                goto L1b2
            L174:
                java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L1b2
                java.lang.String r3 = "yyyy-MM-dd HH:mm:ss.SSS"
                r1.<init>(r3)     // Catch: java.text.ParseException -> L1b2
                java.util.Date r0 = r1.parse(r0)     // Catch: java.text.ParseException -> L1b2
                long r0 = r0.getTime()     // Catch: java.text.ParseException -> L1b2
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r3 = r11.k     // Catch: java.text.ParseException -> L1b2
                long r3 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.h0(r3)     // Catch: java.text.ParseException -> L1b2
                int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r7 < 0) goto L196
                java.lang.String r0 = "预约已结束"
                r12.setText(r0)     // Catch: java.text.ParseException -> L1b2
                r12.setEnabled(r2)     // Catch: java.text.ParseException -> L1b2
                goto L1b2
            L196:
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r5)     // Catch: java.text.ParseException -> L1b2
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r6)     // Catch: java.text.ParseException -> L1b2
                if (r0 < r1) goto L1a9
                java.lang.String r0 = "预约人数已满"
                r12.setText(r0)     // Catch: java.text.ParseException -> L1b2
                r12.setEnabled(r2)     // Catch: java.text.ParseException -> L1b2
                goto L1b2
            L1a9:
                r0 = 1
                r12.setEnabled(r0)     // Catch: java.text.ParseException -> L1b2
                java.lang.String r0 = "立即预约"
                r12.setText(r0)     // Catch: java.text.ParseException -> L1b2
            L1b2:
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b$b r0 = new com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b$b
                r0.<init>(r11, r13)
                r12.setOnClickListener(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity a;

        c(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.l0(r0)
                r0.w0()
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.l0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = r3.a
                java.lang.String r1 = "currentTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                long r1 = java.lang.Long.parseLong(r1)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.n0(r0, r1)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = r3.a
                java.lang.String r1 = "meaScheduleList"
                java.lang.Object r4 = r4.get(r1)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.o0(r0, r4)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.g0(r4)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.i0(r0)
                r4.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity a;

        d(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r2 = r1.a
                java.lang.String r0 = "预约成功"
                r2.f0(r0)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r2 = r1.a
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.q0(r2)
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity> r0 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity r2 = (com.bxkj.student.home.physicaltest.personal.reservation.ReservationDetailActivity) r2
                if (r2 == 0) goto L1d
                r2.R()
            L1d:
                return
        }
    }

    public ReservationListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 1
            r1.b0 = r0
            r1.c0 = r0
            r0 = 10
            r1.f796k0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f797p0
            return r0
    }

    static /* bridge */ /* synthetic */ long h0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r2) {
            long r0 = r2.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ int k0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0) {
            int r0 = r0.f796k0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout l0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0) {
            int r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0, long r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0, int r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity r0) {
            r0.r0()
            return
    }

    private void r0() {
            r6 = this;
            android.content.Context r0 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            int r3 = r6.c0
            int r4 = r6.f796k0
            java.lang.String r5 = "2"
            rx.e r1 = r1.O0(r2, r5, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$c r1 = new com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$c
            r1.<init>(r6)
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
            r4 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$a r1 = new com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$a
            r1.<init>(r4)
            r0.m1(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r4, r1)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setLayoutAnimation(r0)
            com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b r0 = new com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$b
            android.content.Context r1 = r4.V
            r2 = 2131493310(0x7f0c01be, float:1.8610097E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.f797p0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            r1 = 1
            r0.X0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            r0.S0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            r0.D()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r4.findViewById(r1)
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
            com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$d r4 = new com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity$d
            r4.<init>(r2)
            r3.setDataListener(r4)
            return
    }
}
