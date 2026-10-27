package com.bxkj.student.home.teaching.lesson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OnLineLessonActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private int H0;
    protected int I0;
    protected int J0;
    protected int K0;
    java.lang.String L0;
    private java.lang.String Y;
    private java.lang.String Z;
    private android.widget.Spinner a0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout c0;

    /* renamed from: k0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f971k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f972p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity e;

        a(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                java.lang.String r0 = "name"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r2.J(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$a$a, reason: collision with other inner class name */
            class C0098a extends cn.bluemobi.dylan.http.HttpCallBack {
                final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b.a a;

                C0098a(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                        r3 = this;
                        cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$a r1 = r3.a
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b r1 = r1.b
                        android.content.Context r1 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b.m(r1)
                        r0.<init>(r1)
                        java.lang.String r1 = "教师介绍"
                        cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setTitle(r1)
                        java.lang.String r1 = "知道了"
                        cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setOneButtonText(r1)
                        r1 = 2131298672(0x7f090970, float:1.8215324E38)
                        android.view.View r1 = r0.findViewById(r1)
                        android.widget.TextView r1 = (android.widget.TextView) r1
                        r2 = 0
                        r1.setVisibility(r2)
                        java.lang.String r2 = "data"
                        java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$a r2 = r3.a
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b r2 = r2.b
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r2 = r2.k
                        java.lang.CharSequence r4 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.l0(r2, r4)
                        r1.setText(r4)
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$a r4 = r3.a
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b r4 = r4.b
                        android.content.Context r4 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b.n(r4)
                        r2 = 2131099730(0x7f060052, float:1.7811821E38)
                        int r4 = androidx.core.content.ContextCompat.getColor(r4, r2)
                        r1.setLinkTextColor(r4)
                        android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
                        r1.setMovementMethod(r4)
                        r0.show()
                        r4 = 3
                        r0.setMessageGrivity(r4)
                        return
                }
            }

            a(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b r4 = r3.b
                    android.content.Context r4 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b.o(r4)
                    cn.bluemobi.dylan.http.HttpRequest r4 = cn.bluemobi.dylan.http.Http.with(r4)
                    java.lang.Class<d0.a> r0 = d0.a.class
                    java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
                    d0.a r0 = (d0.a) r0
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "teacherId"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    rx.e r0 = r0.J(r1)
                    cn.bluemobi.dylan.http.HttpRequest r4 = r4.setObservable(r0)
                    com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$a$a r0 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$a$a
                    r0.<init>(r3)
                    r4.setDataListener(r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$b, reason: collision with other inner class name */
        class ViewOnClickListenerC0099b implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$b$a */
            class a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
                final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b.ViewOnClickListenerC0099b a;

                a(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b.ViewOnClickListenerC0099b r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void buttonRightOnClick() {
                        r2 = this;
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$b r0 = r2.a
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b r1 = r0.c
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1 = r1.k
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = r0.b
                        int r0 = r0.f()
                        com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.k0(r1, r0)
                        return
                }
            }

            ViewOnClickListenerC0099b(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
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
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "确定要选择该"
                    r0.append(r1)
                    com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r1 = r1.getXuanZeAfterLabelName()
                    r0.append(r1)
                    java.lang.String r1 = "吗？"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r4.append(r0)
                    java.lang.String r0 = "\n"
                    r4.append(r0)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "sysTermName"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r4.append(r1)
                    r4.append(r0)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "sysOrgName"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r4.append(r1)
                    r4.append(r0)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "sysCampusName"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r4.append(r1)
                    r4.append(r0)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "teachingSchoolTimeName"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r4.append(r1)
                    r4.append(r0)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "sysUserName"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r4.append(r1)
                    r4.append(r0)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "teachingCurriculumName"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r4.append(r1)
                    r4.append(r0)
                    java.util.Map r0 = r3.a
                    java.lang.String r1 = "address"
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                    r4.append(r0)
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                    com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b r1 = r3.c
                    android.content.Context r1 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b.p(r1)
                    r0.<init>(r1)
                    r1 = 3
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessageGrivity(r1)
                    java.lang.String r4 = r4.toString()
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r0.setMessage(r4)
                    com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$b$a r0 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$b$a
                    r0.<init>(r3)
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setRightButtonOnClickListener(r0)
                    r4.show()
                    return
            }
        }

        b(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context o(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context p(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.b r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.q(r1, r2)
                return
        }

        public void q(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                java.lang.String r0 = "manNum"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298972(0x7f090a9c, float:1.8215932E38)
                r5.J(r1, r0)
                java.lang.String r0 = "womanNum"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131299193(0x7f090b79, float:1.821638E38)
                r5.J(r1, r0)
                java.lang.String r0 = "blendNum"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298815(0x7f0909ff, float:1.8215614E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teachingCurriculumName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298956(0x7f090a8c, float:1.82159E38)
                r5.J(r1, r0)
                java.lang.String r0 = "sysTermName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298861(0x7f090a2d, float:1.8215707E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teachingSchoolTimeName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131299158(0x7f090b56, float:1.821631E38)
                r5.J(r1, r0)
                java.lang.String r0 = "sysOrgName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r5.J(r1, r0)
                java.lang.String r0 = "type"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r2 = 2131299171(0x7f090b63, float:1.8216336E38)
                r5.J(r2, r1)
                java.lang.String r1 = "sysCampusName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r3 = 2131299090(0x7f090b12, float:1.8216172E38)
                r5.J(r3, r1)
                java.lang.String r1 = "parameter"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r3 = 2131299190(0x7f090b76, float:1.8216374E38)
                r5.J(r3, r1)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r5.J(r2, r0)
                java.lang.String r0 = "feature"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298905(0x7f090a59, float:1.8215796E38)
                r5.J(r1, r0)
                java.lang.String r0 = "address"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298773(0x7f0909d5, float:1.8215529E38)
                r5.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sysUserName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r0.append(r1)
                java.lang.String r1 = "(点击查看)"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299151(0x7f090b4f, float:1.8216295E38)
                r5.J(r1, r0)
                java.lang.String r0 = "canshu"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$a r2 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$a
                r2.<init>(r4, r6)
                r5.w(r1, r2)
                r1 = 2131296623(0x7f09016f, float:1.8211168E38)
                android.view.View r1 = r5.h(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                java.lang.String r2 = "1"
                boolean r2 = r0.equals(r2)
                r3 = 0
                if (r2 == 0) goto Lf4
                r1.setEnabled(r3)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r6 = r6.getXuanZeAfterLabelName()
                r5.append(r6)
                java.lang.String r6 = "已满"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r1.setText(r5)
                return
            Lf4:
                java.lang.String r2 = "2"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L105
                r1.setEnabled(r3)
                java.lang.String r5 = "时间已过"
                r1.setText(r5)
                return
            L105:
                java.lang.String r2 = "3"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L116
                r1.setEnabled(r3)
                java.lang.String r5 = "已选择"
                r1.setText(r5)
                return
            L116:
                r0 = 1
                r1.setEnabled(r0)
                java.lang.String r0 = "选择"
                r1.setText(r0)
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$b r0 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b$b
                r0.<init>(r4, r6, r5)
                r1.setOnClickListener(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity a;

        c(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r2 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.h0(r2)
                r2.D()
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.m0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1 = r0.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.h0(r1)
                r1.D()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements android.widget.AdapterView.OnItemSelectedListener {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity a;

        d(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1 = r0.a
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.j0(r1, r3)
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1 = r0.a
                java.lang.String r2 = java.lang.String.valueOf(r3)
                r1.L0 = r2
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1 = r0.a
                r2 = 1
                r1.J0 = r2
                r1.q0(r2)
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity a;

        e(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r5 = r4.a
                int r0 = r5.K0
                int r5 = r5.I0
                int r0 = r0 / r5
                com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r5 = r5.getSchoolId()
                java.lang.String r1 = "8"
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L75
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r5 = r4.a
                int r1 = r5.J0
                int r2 = r5.K0
                int r3 = r5.I0
                int r2 = r2 % r3
                if (r2 != 0) goto L23
                goto L25
            L23:
                int r0 = r0 + 1
            L25:
                r2 = 0
                if (r1 < r0) goto L72
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r5 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.g0(r5)
                java.util.List r5 = r5.d()
                if (r5 == 0) goto L6d
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r5 = r4.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r5 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.g0(r5)
                java.util.List r5 = r5.d()
                int r5 = r5.size()
                if (r5 <= 0) goto L6d
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r5 = r4.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.g0(r5)
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1 = r4.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.g0(r1)
                java.util.List r1 = r1.d()
                int r1 = r1.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.getItem(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "parameter"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r1)
                int r0 = r0 + 1
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r5.L0 = r0
                goto L94
            L6d:
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r5 = r4.a
                r5.L0 = r2
                goto L94
            L72:
                r5.L0 = r2
                goto L94
            L75:
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r5 = r4.a
                int r1 = r5.J0
                int r2 = r5.K0
                int r3 = r5.I0
                int r2 = r2 % r3
                if (r2 != 0) goto L81
                goto L83
            L81:
                int r0 = r0 + 1
            L83:
                if (r1 < r0) goto L94
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.h0(r5)
                r5.q0()
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r5 = r4.a
                java.lang.String r0 = "没有了"
                r5.f0(r0)
                return
            L94:
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r5 = r4.a
                int r0 = r5.J0
                int r0 = r0 + 1
                r5.J0 = r0
                r0 = 0
                r5.q0(r0)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r2 = r1.a
                r0 = 0
                r2.L0 = r0
                r0 = 1
                r2.J0 = r0
                r0 = 0
                r2.q0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity a;

        f(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.h0(r0)
                r0.w0()
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.h0(r0)
                r0.q0()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.n0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0 = r3.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.K0 = r1
                java.lang.String r0 = "data"
                java.lang.Object r4 = r4.get(r0)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.g0(r0)
                java.util.List r0 = r0.d()
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1 = r3.a
                int r1 = r1.J0
                r2 = 1
                if (r1 != r2) goto L29
                r0 = r4
                goto L2c
            L29:
                r0.addAll(r4)
            L2c:
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getSchoolId()
                java.lang.String r2 = "8"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L5a
                if (r4 == 0) goto L5a
                int r1 = r4.size()
                if (r1 <= 0) goto L5a
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1 = r3.a
                android.widget.Spinner r1 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.i0(r1)
                r2 = 0
                java.lang.Object r4 = r4.get(r2)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r2 = "parameter"
                int r4 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r2)
                r1.setSelection(r4)
            L5a:
                com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.g0(r4)
                r4.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends android.text.style.ClickableSpan {
        final /* synthetic */ android.text.style.URLSpan a;
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.OnLineLessonActivity b;

        g(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r1, android.text.style.URLSpan r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View r2) {
                r1 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "URL-click:"
                r2.append(r0)
                android.text.style.URLSpan r0 = r1.a
                java.lang.String r0 = r0.getURL()
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.orhanobut.logger.j.g(r2, r0)
                return
        }
    }

    public OnLineLessonActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f972p0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.F0 = r0
            r0 = 0
            r1.H0 = r0
            r0 = 10
            r1.I0 = r0
            r0 = 1
            r1.J0 = r0
            r1.K0 = r0
            r0 = 0
            r1.L0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout h0(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Spinner i0(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0) {
            android.widget.Spinner r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0, int r1) {
            r0.H0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0, int r1) {
            r0.o0(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.lang.CharSequence l0(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0, java.lang.String r1) {
            java.lang.CharSequence r0 = r0.p0(r1)
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.home.teaching.lesson.OnLineLessonActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void o0(int r5) {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.G0
            java.lang.Object r5 = r3.getItem(r5)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r3 = "id"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r3)
            rx.e r5 = r1.u1(r2, r5)
            cn.bluemobi.dylan.http.HttpRequest r5 = r0.setObservable(r5)
            com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$c r0 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$c
            r0.<init>(r4)
            r5.setDataListener(r0)
            return
    }

    private java.lang.CharSequence p0(java.lang.String r5) {
            r4 = this;
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r5)
            int r5 = r5.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r2 = 0
            java.lang.Object[] r5 = r0.getSpans(r2, r5, r1)
            android.text.style.URLSpan[] r5 = (android.text.style.URLSpan[]) r5
            int r1 = r5.length
        L17:
            if (r2 >= r1) goto L21
            r3 = r5[r2]
            r4.s0(r0, r3)
            int r2 = r2 + 1
            goto L17
        L21:
            return r0
    }

    private void s0(android.text.SpannableStringBuilder r5, android.text.style.URLSpan r6) {
            r4 = this;
            int r0 = r5.getSpanStart(r6)
            int r1 = r5.getSpanEnd(r6)
            int r2 = r5.getSpanFlags(r6)
            com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$g r3 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$g
            r3.<init>(r4, r6)
            r5.setSpan(r3, r0, r1, r2)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Spinner r0 = r2.a0
            com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$d r1 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$d
            r1.<init>(r2)
            r0.setOnItemSelectedListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492982(0x7f0c0076, float:1.8609431E38)
            return r0
    }

    public void R() {
            r6 = this;
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "teachingId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r6.Y = r0
        L16:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "timeId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r6.Z = r0
        L2c:
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "请选择"
            java.lang.String r2 = "name"
            r0.put(r2, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.f972p0
            r1.add(r0)
            r0 = 1
            r1 = 1
        L3f:
            r3 = 31
            if (r1 >= r3) goto L69
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "第"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "周"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.put(r2, r4)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r6.f972p0
            r4.add(r3)
            int r1 = r1 + 1
            goto L3f
        L69:
            com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$a r1 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$a
            android.content.Context r2 = r6.V
            r3 = 2131493315(0x7f0c01c3, float:1.8610107E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r6.f972p0
            r1.<init>(r6, r2, r3, r4)
            r6.b0 = r1
            android.widget.Spinner r2 = r6.a0
            r2.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.f971k0
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r6.V
            r4 = 0
            r2.<init>(r3, r0, r4)
            r1.setLayoutManager(r2)
            com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b r0 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$b
            android.content.Context r1 = r6.V
            r2 = 2131493274(0x7f0c019a, float:1.8610024E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.F0
            r0.<init>(r6, r1, r2, r3)
            r6.G0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r6.f971k0
            r1.setAdapter(r0)
            r6.r0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r6.c0
            r0.D()
            return
    }

    public void S() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "在线选"
            r0.append(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getXuanAfterLabelName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298550(0x7f0908f6, float:1.8215076E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Spinner r1 = (android.widget.Spinner) r1
            r0.a0 = r1
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.c0 = r1
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.f971k0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void q0(boolean r9) {
            r8 = this;
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            r1 = r0
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r0.getUserId()
            java.lang.String r3 = r8.Z
            java.lang.String r4 = r8.L0
            java.lang.String r5 = r8.Y
            int r6 = r8.J0
            int r7 = r8.I0
            rx.e r0 = r1.v1(r2, r3, r4, r5, r6, r7)
            android.content.Context r1 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r9 = r1.setShowLoadingDialog(r9)
            cn.bluemobi.dylan.http.HttpRequest r9 = r9.setObservable(r0)
            com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$f r0 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$f
            r0.<init>(r8)
            r9.setDataListener(r0)
            return
    }

    public void r0() {
            r2 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getSchoolId()
            java.lang.String r1 = "8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            android.widget.Spinner r0 = r2.a0
            r1 = 0
            r0.setVisibility(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.c0
            r0.S0(r1)
            goto L23
        L1c:
            android.widget.Spinner r0 = r2.a0
            r1 = 8
            r0.setVisibility(r1)
        L23:
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.c0
            com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$e r1 = new com.bxkj.student.home.teaching.lesson.OnLineLessonActivity$e
            r1.<init>(r2)
            r0.m1(r1)
            return
    }
}
