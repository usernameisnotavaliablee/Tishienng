package com.bxkj.place.apply;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyPlaceActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.ListView G0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> H0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> I0;
    private androidx.cardview.widget.CardView Y;
    private androidx.cardview.widget.CardView Z;
    private android.widget.EditText a0;
    private android.widget.Button b0;
    private java.lang.String c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f678k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f679p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.place.apply.ApplyPlaceActivity e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.place.apply.ApplyPlaceActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0065a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.place.apply.ApplyPlaceActivity.a b;

            ViewOnClickListenerC0065a(com.bxkj.place.apply.ApplyPlaceActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.bxkj.place.apply.ApplyPlaceActivity$a r2 = r1.b
                    com.bxkj.place.apply.ApplyPlaceActivity r2 = r2.e
                    java.util.List r2 = com.bxkj.place.apply.ApplyPlaceActivity.g0(r2)
                    java.util.Map r0 = r1.a
                    r2.remove(r0)
                    com.bxkj.place.apply.ApplyPlaceActivity$a r2 = r1.b
                    r2.notifyDataSetChanged()
                    return
            }
        }

        a(com.bxkj.place.apply.ApplyPlaceActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                int r0 = com.bxkj.place.R.id.tv_name
                java.lang.String r1 = "name"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.place.R.id.tv_number
                java.lang.String r1 = "userNum"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.place.R.id.bt_del
                com.bxkj.place.apply.ApplyPlaceActivity$a$a r1 = new com.bxkj.place.apply.ApplyPlaceActivity$a$a
                r1.<init>(r2, r4)
                r3.w(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog a;
        final /* synthetic */ com.bxkj.place.apply.ApplyPlaceActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.place.apply.ApplyPlaceActivity.b a;

            a(com.bxkj.place.apply.ApplyPlaceActivity.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnOtherStatus(int r2, java.lang.String r3) {
                    r1 = this;
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.place.apply.ApplyPlaceActivity$b r0 = r1.a
                    com.bxkj.place.apply.ApplyPlaceActivity r0 = r0.b
                    android.content.Context r0 = com.bxkj.place.apply.ApplyPlaceActivity.i0(r0)
                    r2.<init>(r0)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                    r2.show()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                    r3 = this;
                    com.bxkj.place.apply.ApplyPlaceActivity$b r0 = r3.a
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.a
                    r0.dismiss()
                    androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                    r0.<init>()
                    java.lang.String r1 = "userNum"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                    r0.put(r1, r2)
                    java.lang.String r1 = "name"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                    r0.put(r1, r2)
                    java.lang.String r1 = "id"
                    java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                    r0.put(r1, r4)
                    com.bxkj.place.apply.ApplyPlaceActivity$b r4 = r3.a
                    com.bxkj.place.apply.ApplyPlaceActivity r4 = r4.b
                    java.util.List r4 = com.bxkj.place.apply.ApplyPlaceActivity.g0(r4)
                    r4.add(r0)
                    com.bxkj.place.apply.ApplyPlaceActivity$b r4 = r3.a
                    com.bxkj.place.apply.ApplyPlaceActivity r4 = r4.b
                    cn.bluemobi.dylan.base.adapter.common.abslistview.a r4 = com.bxkj.place.apply.ApplyPlaceActivity.h0(r4)
                    r4.notifyDataSetChanged()
                    return
            }
        }

        b(com.bxkj.place.apply.ApplyPlaceActivity r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r4 = this;
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r4.a
                r0.show()
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r4.a
                int r1 = com.bxkj.place.R.id.et_number
                android.view.View r0 = r0.findViewById(r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                android.text.Editable r1 = r0.getText()
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = r1.trim()
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L2b
                com.bxkj.place.apply.ApplyPlaceActivity r1 = r4.b
                java.lang.CharSequence r0 = r0.getHint()
                r1.f0(r0)
                return
            L2b:
                com.bxkj.place.apply.ApplyPlaceActivity r0 = r4.b
                android.content.Context r0 = com.bxkj.place.apply.ApplyPlaceActivity.j0(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
                java.lang.Class<c0.b> r2 = c0.b.class
                java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
                c0.b r2 = (c0.b) r2
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r3 = r3.getUserId()
                rx.e r1 = r2.e(r3, r1)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.place.apply.ApplyPlaceActivity$b$a r1 = new com.bxkj.place.apply.ApplyPlaceActivity$b$a
                r1.<init>(r4)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.place.apply.ApplyPlaceActivity a;

        c(com.bxkj.place.apply.ApplyPlaceActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.place.apply.ApplyPlaceActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.place.apply.ApplyPlaceActivity.k0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.place.apply.PlaceListActivity> r0 = com.bxkj.place.apply.PlaceListActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.place.apply.PlaceListActivity r2 = (com.bxkj.place.apply.PlaceListActivity) r2
                r2.C0()
                com.bxkj.place.apply.ApplyPlaceActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    public ApplyPlaceActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.H0 = r0
            return
    }

    static /* synthetic */ java.util.List g0(com.bxkj.place.apply.ApplyPlaceActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.H0
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a h0(com.bxkj.place.apply.ApplyPlaceActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.I0
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.place.apply.ApplyPlaceActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.place.apply.ApplyPlaceActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.place.apply.ApplyPlaceActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void l0() {
            r0 = this;
            r0.o0()
            return
    }

    private void m0() {
            r1 = this;
            int r0 = com.bxkj.place.R.id.et_reason
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.a0 = r0
            int r0 = com.bxkj.place.R.id.bt_commit
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.b0 = r0
            int r0 = com.bxkj.place.R.id.cv_reason
            android.view.View r0 = r1.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r1.Y = r0
            int r0 = com.bxkj.place.R.id.cv_friend
            android.view.View r0 = r1.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r1.Z = r0
            int r0 = com.bxkj.place.R.id.tv_add
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.F0 = r0
            int r0 = com.bxkj.place.R.id.lv
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r1.G0 = r0
            return
    }

    private void n0() {
            r9 = this;
            android.widget.EditText r0 = r9.a0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r0.trim()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.f679p0
            r2 = 2
            if (r1 != r2) goto L24
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L5c
            java.lang.String r0 = "请输入申请理由"
            r9.f0(r0)
            return
        L24:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r9.H0
            int r1 = r1.size()
            if (r1 != 0) goto L32
            java.lang.String r0 = "请输入随行人员"
            r9.f0(r0)
            return
        L32:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r9.H0
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L4d
            java.lang.String r3 = ""
            goto L4f
        L4d:
            java.lang.String r3 = ","
        L4f:
            r0.append(r3)
            java.lang.String r3 = "userNum"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r0.append(r2)
            goto L38
        L5c:
            android.content.Context r1 = r9.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r8 = r1.hideOtherStatusMessage()
            java.lang.Class<c0.b> r1 = c0.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            c0.b r1 = (c0.b) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r9.c0
            java.lang.String r4 = r0.toString()
            int r6 = r9.f679p0
            java.lang.String r7 = "1"
            rx.e r0 = r1.h(r2, r3, r4, r5, r6, r7)
            cn.bluemobi.dylan.http.HttpRequest r0 = r8.setObservable(r0)
            com.bxkj.place.apply.ApplyPlaceActivity$c r1 = new com.bxkj.place.apply.ApplyPlaceActivity$c
            r1.<init>(r9)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.TextView r0 = r1.F0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.b0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.place.R.layout.ac_apply_place
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
            r4.c0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "date"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.f678k0 = r0
        L2c:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "appointType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L43
            android.content.Intent r0 = r4.getIntent()
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r4.f679p0 = r0
        L43:
            int r0 = r4.f679p0
            r1 = 2
            r2 = 8
            r3 = 0
            if (r0 != r1) goto L62
            android.widget.Button r0 = r4.b0
            java.lang.String r1 = "立即申请"
            r0.setText(r1)
            java.lang.String r0 = "申请场地"
            r4.setTitle(r0)
            androidx.cardview.widget.CardView r0 = r4.Y
            r0.setVisibility(r3)
            androidx.cardview.widget.CardView r0 = r4.Z
            r0.setVisibility(r2)
            return
        L62:
            android.widget.Button r0 = r4.b0
            java.lang.String r1 = "立即预约"
            r0.setText(r1)
            java.lang.String r0 = "预约场地"
            r4.setTitle(r0)
            androidx.cardview.widget.CardView r0 = r4.Y
            r0.setVisibility(r2)
            androidx.cardview.widget.CardView r0 = r4.Z
            r0.setVisibility(r3)
            com.bxkj.place.apply.ApplyPlaceActivity$a r0 = new com.bxkj.place.apply.ApplyPlaceActivity$a
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.place.R.layout.item_for_add_info
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.H0
            r0.<init>(r4, r1, r2, r3)
            r4.I0 = r0
            android.widget.ListView r1 = r4.G0
            r1.setAdapter(r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "申请场地"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r0.m0()
            return
    }

    public void o0() {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "请输入要添加的随行人员的学号"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r0.setMessage(r1)
            int r2 = com.bxkj.place.R.layout.dialog_input_account
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setCenterCustomView(r2)
            com.bxkj.place.apply.ApplyPlaceActivity$b r2 = new com.bxkj.place.apply.ApplyPlaceActivity$b
            r2.<init>(r3, r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.setRightButtonOnClickListener(r2)
            r0.show()
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            int r0 = com.bxkj.place.R.id.tv_add
            if (r2 != r0) goto Lc
            r1.l0()
            return
        Lc:
            int r0 = com.bxkj.place.R.id.bt_commit
            if (r2 != r0) goto L13
            r1.n0()
        L13:
            return
    }
}
