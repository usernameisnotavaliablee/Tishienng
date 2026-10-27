package com.bxkj.student.home.physicaltest.monitor.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MonitorRecordListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private long F0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private int b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f790k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f791p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity a;

        a(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r4 = r3.a
                int r4 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.m0(r4)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.k0(r0)
                int r4 = r4 / r0
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.j0(r0)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r1 = r3.a
                int r1 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.m0(r1)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r2 = r3.a
                int r2 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.k0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.l0(r4)
                r4.q0()
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r4 = r3.a
                int r0 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.j0(r4)
                int r0 = r0 + 1
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.p0(r4, r0)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r4 = r3.a
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.q0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.p0(r2, r0)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r2 = r1.a
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.q0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.b c;

            a(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.b r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b r4 = r3.c
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r4 = r4.k
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b r1 = r3.c
                    android.content.Context r1 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.b.m(r1)
                    java.lang.Class<com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordDetailActivity> r2 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordDetailActivity.class
                    r0.<init>(r1, r2)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r3.b
                    int r1 = r1.f()
                    java.lang.String r2 = "position"
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    r4.startActivity(r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b$b, reason: collision with other inner class name */
        class ViewOnClickListenerC0075b implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.b c;

            ViewOnClickListenerC0075b(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.b r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b r4 = r3.c
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r4.k
                    android.content.Context r4 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.b.n(r4)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r2 = r3.b
                    int r2 = r2.f()
                    r0.s0(r4, r1, r2)
                    return
            }
        }

        b(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                java.lang.String r0 = "scheduleName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r7.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "appointmentBeginTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r0.append(r1)
                java.lang.String r1 = "\n"
                r0.append(r1)
                java.lang.String r2 = "appointmentEndTime"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 2131299074(0x7f090b02, float:1.821614E38)
                r7.J(r2, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "meaBeginTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
                r0.append(r3)
                r0.append(r1)
                java.lang.String r1 = "meaEndTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298975(0x7f090a9f, float:1.8215938E38)
                r7.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "班级数:"
                r0.append(r1)
                java.lang.String r1 = "appliedClasses"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                java.lang.String r1 = "appClassAmount"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298908(0x7f090a5c, float:1.8215802E38)
                r7.J(r1, r0)
                java.lang.String r0 = "appointmentType"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                java.lang.String r1 = "2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L92
                java.lang.String r0 = "个人预约"
                goto L94
            L92:
                java.lang.String r0 = "班长预约"
            L94:
                r1 = 2131299171(0x7f090b63, float:1.8216336E38)
                r7.J(r1, r0)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b$a r0 = new com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b$a
                r0.<init>(r6, r8, r7)
                r1 = 2131296604(0x7f09015c, float:1.821113E38)
                r7.w(r1, r0)
                r0 = 2131296639(0x7f09017f, float:1.82112E38)
                android.view.View r0 = r7.h(r0)
                android.widget.Button r0 = (android.widget.Button) r0
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> Lde
                java.lang.String r3 = "yyyy-MM-dd HH:mm:ss.sss"
                r2.<init>(r3)     // Catch: java.text.ParseException -> Lde
                java.util.Date r1 = r2.parse(r1)     // Catch: java.text.ParseException -> Lde
                long r1 = r1.getTime()     // Catch: java.text.ParseException -> Lde
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r3 = r6.k     // Catch: java.text.ParseException -> Lde
                long r3 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.h0(r3)     // Catch: java.text.ParseException -> Lde
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 <= 0) goto Ld5
                java.lang.String r1 = "体测已开始"
                r0.setText(r1)     // Catch: java.text.ParseException -> Lde
                r1 = 0
                r0.setEnabled(r1)     // Catch: java.text.ParseException -> Lde
                goto Lde
            Ld5:
                r1 = 1
                r0.setEnabled(r1)     // Catch: java.text.ParseException -> Lde
                java.lang.String r1 = "取消预约"
                r0.setText(r1)     // Catch: java.text.ParseException -> Lde
            Lde:
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b$b r1 = new com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b$b
                r1.<init>(r6, r8, r7)
                r0.setOnClickListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity a;

        c(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.l0(r0)
                r0.w0()
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.l0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r3.a
                java.lang.String r1 = "currentTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                long r1 = java.lang.Long.parseLong(r1)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.n0(r0, r1)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r3.a
                java.lang.String r1 = "meaScheduleList"
                java.lang.Object r4 = r4.get(r1)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.o0(r0, r4)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.g0(r4)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.i0(r0)
                r4.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ int c;
        final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.d a;

            a(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d r3 = r2.a
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r3 = r3.d
                    java.lang.String r0 = "取消预约成功"
                    r3.f0(r0)
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d r3 = r2.a
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r3 = r3.d
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.g0(r3)
                    java.util.List r3 = r3.d()
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d r0 = r2.a
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0 = r0.d
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.g0(r0)
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d r1 = r2.a
                    int r1 = r1.c
                    java.lang.Object r0 = r0.getItem(r1)
                    r3.remove(r0)
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d r3 = r2.a
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r3 = r3.d
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.g0(r3)
                    com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d r0 = r2.a
                    int r0 = r0.c
                    r3.notifyItemRemoved(r0)
                    cn.bluemobi.dylan.base.utils.a r3 = cn.bluemobi.dylan.base.utils.a.n()
                    java.lang.Class<com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordDetailActivity> r0 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordDetailActivity.class
                    android.app.Activity r3 = r3.getActivity(r0)
                    if (r3 == 0) goto L46
                    r3.finish()
                L46:
                    return
            }
        }

        d(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r1, android.content.Context r2, java.lang.String r3, int r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r4 = this;
                android.content.Context r0 = r4.a
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<d0.a> r1 = d0.a.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                d0.a r1 = (d0.a) r1
                java.lang.String r2 = r4.b
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r3 = r3.getUserId()
                rx.e r1 = r1.M0(r2, r3)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d$a r1 = new com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d$a
                r1.<init>(r4)
                r0.setDataListener(r1)
                return
        }
    }

    public MonitorRecordListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 1
            r1.b0 = r0
            r1.c0 = r0
            r0 = 10
            r1.f790k0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f791p0
            return r0
    }

    static /* bridge */ /* synthetic */ long h0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r2) {
            long r0 = r2.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ int k0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0) {
            int r0 = r0.f790k0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout l0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0) {
            int r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0, long r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0, int r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity r0) {
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
            int r4 = r6.f790k0
            java.lang.String r5 = "1"
            rx.e r1 = r1.q0(r2, r5, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$c r1 = new com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$c
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
            r5 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$a r1 = new com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$a
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
            com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b r0 = new com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$b
            android.content.Context r2 = r5.V
            r3 = 2131493310(0x7f0c01be, float:1.8610097E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.a0
            r0.<init>(r5, r2, r3, r4)
            r5.f791p0 = r0
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
            java.lang.String r0 = "我的预约体测列表"
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

    public void s0(android.content.Context r3, java.lang.String r4, int r5) {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            r0.<init>(r3)
            java.lang.String r1 = "提示"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setTitle(r1)
            java.lang.String r1 = "确定要取消预约吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d r1 = new com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity$d
            r1.<init>(r2, r3, r4, r5)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r0.setRightButtonOnClickListener(r1)
            r3.show()
            return
    }
}
