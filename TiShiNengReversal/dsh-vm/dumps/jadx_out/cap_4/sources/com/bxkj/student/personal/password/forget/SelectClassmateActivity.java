package com.bxkj.student.personal.password.forget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SelectClassmateActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private android.widget.Button a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f1141k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.personal.password.forget.SelectClassmateActivity a;

        a(com.bxkj.student.personal.password.forget.SelectClassmateActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bxkj.student.personal.password.forget.SelectClassmateActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.personal.password.forget.SelectClassmateActivity k;

        b(com.bxkj.student.personal.password.forget.SelectClassmateActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(java.util.Map r0, android.widget.CompoundButton r1, boolean r2) {
                java.lang.String r1 = "isChecked"
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.put(r1, r2)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "userName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "isChecked"
                boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r4, r0)
                r1 = 2131296715(0x7f0901cb, float:1.8211355E38)
                r3.m(r1, r0)
                android.view.View r3 = r3.h(r1)
                android.widget.CheckBox r3 = (android.widget.CheckBox) r3
                com.bxkj.student.personal.password.forget.d r0 = new com.bxkj.student.personal.password.forget.d
                r0.<init>(r4)
                r3.setOnCheckedChangeListener(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends com.bxkj.student.common.utils.UniversalItemDecoration {
        final /* synthetic */ com.bxkj.student.personal.password.forget.SelectClassmateActivity g;

        c(com.bxkj.student.personal.password.forget.SelectClassmateActivity r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.utils.UniversalItemDecoration
        public com.bxkj.student.common.utils.UniversalItemDecoration.b a(int r3) {
                r2 = this;
                com.bxkj.student.common.utils.UniversalItemDecoration$a r3 = new com.bxkj.student.common.utils.UniversalItemDecoration$a
                r3.<init>()
                com.bxkj.student.personal.password.forget.SelectClassmateActivity r0 = r2.g
                android.content.Context r0 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.l0(r0)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
                r3.d = r0
                r0 = -1
                r3.f = r0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.password.forget.SelectClassmateActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.personal.password.forget.SelectClassmateActivity.d a;

            a(com.bxkj.student.personal.password.forget.SelectClassmateActivity.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.personal.password.forget.SelectClassmateActivity$d r0 = r2.a
                    com.bxkj.student.personal.password.forget.SelectClassmateActivity r0 = r0.a
                    java.lang.String r1 = "data"
                    java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                    com.bxkj.student.personal.password.forget.SelectClassmateActivity.k0(r0, r3)
                    com.bxkj.student.personal.password.forget.SelectClassmateActivity$d r3 = r2.a
                    com.bxkj.student.personal.password.forget.SelectClassmateActivity r3 = r3.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.h0(r3)
                    com.bxkj.student.personal.password.forget.SelectClassmateActivity$d r0 = r2.a
                    com.bxkj.student.personal.password.forget.SelectClassmateActivity r0 = r0.a
                    java.util.List r0 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.i0(r0)
                    r3.g(r0)
                    return
            }
        }

        d(com.bxkj.student.personal.password.forget.SelectClassmateActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.personal.password.forget.SelectClassmateActivity.d r0, android.view.View r1) {
                r0.b(r1)
                return
        }

        private /* synthetic */ void b(android.view.View r4) {
                r3 = this;
                cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
                r4.j()
                com.bxkj.student.personal.password.forget.SelectClassmateActivity r4 = r3.a
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.personal.password.forget.SelectClassmateActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.p0(r1)
                java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r2 = com.bxkj.student.personal.login.LoginActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                r0 = 202(0xca, float:2.83E-43)
                if (r2 != r0) goto L3e
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.password.forget.SelectClassmateActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.n0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                com.bxkj.student.personal.password.forget.SelectClassmateActivity r2 = r1.a
                android.content.Context r2 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.o0(r2)
                cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
                java.lang.Class<d0.a> r3 = d0.a.class
                java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
                d0.a r3 = (d0.a) r3
                com.bxkj.student.personal.password.forget.SelectClassmateActivity r0 = r1.a
                java.lang.String r0 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.j0(r0)
                rx.e r3 = r3.p1(r0)
                cn.bluemobi.dylan.http.HttpRequest r2 = r2.setObservable(r3)
                com.bxkj.student.personal.password.forget.SelectClassmateActivity$d$a r3 = new com.bxkj.student.personal.password.forget.SelectClassmateActivity$d$a
                r3.<init>(r1)
                r2.setDataListener(r3)
            L3e:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
                r1 = this;
                super.netOnSuccess(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.password.forget.SelectClassmateActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.m0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                com.bxkj.student.personal.password.forget.e r3 = new com.bxkj.student.personal.password.forget.e
                r3.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r3)
                r2.show()
                return
        }
    }

    public SelectClassmateActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0, android.view.View r1) {
            r0.r0(r1)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String j0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0) {
            java.lang.String r0 = r0.f1141k0
            return r0
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0, java.util.List r1) {
            r0.c0 = r1
            return
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.personal.password.forget.SelectClassmateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void q0() {
            r5 = this;
            android.widget.EditText r0 = r5.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L25
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            java.lang.String r1 = "请输入身份证号"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.c0
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "isChecked"
            boolean r4 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r4)
            if (r4 == 0) goto L30
            java.lang.String r4 = "userName"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L53
            java.lang.String r4 = ""
            goto L55
        L53:
            java.lang.String r4 = ","
        L55:
            r1.append(r4)
            r1.append(r3)
            goto L30
        L5c:
            android.content.Context r2 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideOtherStatusMessage()
            java.lang.Class<d0.a> r3 = d0.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            d0.a r3 = (d0.a) r3
            java.lang.String r4 = r5.f1141k0
            java.lang.String r1 = r1.toString()
            rx.e r0 = r3.U(r4, r0, r1)
            cn.bluemobi.dylan.http.HttpRequest r0 = r2.setObservable(r0)
            com.bxkj.student.personal.password.forget.SelectClassmateActivity$d r1 = new com.bxkj.student.personal.password.forget.SelectClassmateActivity$d
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void r0(android.view.View r1) {
            r0 = this;
            r0.q0()
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.a0
            com.bxkj.student.personal.password.forget.c r1 = new com.bxkj.student.personal.password.forget.c
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493026(0x7f0c00a2, float:1.860952E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "userNumber"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.f1141k0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "classmate"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L30
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.jsonToListMap(r0)
            r4.c0 = r0
        L30:
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.personal.password.forget.SelectClassmateActivity$b r0 = new com.bxkj.student.personal.password.forget.SelectClassmateActivity$b
            android.content.Context r1 = r4.V
            r2 = 2131493318(0x7f0c01c6, float:1.8610113E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.c0
            r0.<init>(r4, r1, r2, r3)
            r4.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            com.bxkj.student.personal.password.forget.SelectClassmateActivity$c r1 = new com.bxkj.student.personal.password.forget.SelectClassmateActivity$c
            r1.<init>(r4)
            r0.addItemDecoration(r1)
            return
    }

    public void S() {
            r1 = this;
            r0 = 0
            r1.c0(r0)
            return
    }

    public void T(android.os.Bundle r3) {
            r2 = this;
            r3 = 2131296934(0x7f0902a6, float:1.8211799E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.Y = r3
            r3 = 2131298425(0x7f090879, float:1.8214823E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r2.Z = r3
            r3 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.a0 = r3
            r3 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r0 = 2131299164(0x7f090b5c, float:1.8216322E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "输入身份证号并选择行政班的同班同学"
            r0.setText(r1)
            r0 = 2131231200(0x7f0801e0, float:1.8078474E38)
            r3.setNavigationIcon(r0)
            com.bxkj.student.personal.password.forget.SelectClassmateActivity$a r0 = new com.bxkj.student.personal.password.forget.SelectClassmateActivity$a
            r0.<init>(r2)
            r3.setNavigationOnClickListener(r0)
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Exception -> L54
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Exception -> L54
            r0 = 2131689902(0x7f0f01ae, float:1.9008832E38)
            r3.setBackgroundResource(r0)     // Catch: java.lang.Exception -> L54
        L54:
            com.bxkj.student.common.utils.l.d(r2)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
