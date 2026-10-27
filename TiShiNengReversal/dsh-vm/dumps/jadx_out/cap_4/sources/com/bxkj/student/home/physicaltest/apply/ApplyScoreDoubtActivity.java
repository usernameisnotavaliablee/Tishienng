package com.bxkj.student.home.physicaltest.apply;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyScoreDoubtActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Button F0;
    private java.util.List<java.lang.String> G0;
    private cn.bluemobi.dylan.base.adapter.c H0;
    private android.widget.Spinner I0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> J0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> K0;
    private java.lang.String L0;
    private android.widget.EditText Y;
    private android.widget.EditText Z;
    private android.widget.EditText a0;
    private android.widget.TextView b0;
    private android.widget.EditText c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.EditText f778k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.view.MyGridView f779p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity e;

        a(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "examName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "actualScore"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r1 = "examunit"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "score"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r1 = "分"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299093(0x7f090b15, float:1.8216178E38)
                r3.J(r1, r0)
                java.lang.String r0 = "rank"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131299062(0x7f090af6, float:1.8216115E38)
                r3.J(r0, r4)
                r4 = 2131299116(0x7f090b2c, float:1.8216224E38)
                android.view.View r4 = r3.h(r4)
                r0 = 4
                r4.setVisibility(r0)
                r4 = 2131297100(0x7f09034c, float:1.8212135E38)
                r0 = 0
                r3.N(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity a;

        b(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.p0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.o0(r0, r3)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r3 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.l0(r3)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.m0(r0)
                r3.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.widget.AdapterView.OnItemSelectedListener {
        final /* synthetic */ com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity a;

        c(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r1 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.l0(r1)
                java.lang.Object r1 = r1.getItem(r3)
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r2 = "examName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r2 = r0.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r2 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.l0(r2)
                java.lang.Object r2 = r2.getItem(r3)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "examunit"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                java.lang.String r3 = "身高"
                boolean r3 = r1.contains(r3)
                r4 = 8
                r5 = 0
                if (r3 == 0) goto L65
                java.lang.String r3 = "体重"
                boolean r1 = r1.contains(r3)
                if (r1 == 0) goto L65
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1 = r0.a
                android.widget.EditText r1 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.i0(r1)
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.setVisibility(r5)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1 = r0.a
                android.widget.EditText r1 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.k0(r1)
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.setVisibility(r5)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1 = r0.a
                android.widget.EditText r1 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.j0(r1)
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.setVisibility(r4)
                return
            L65:
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1 = r0.a
                android.widget.EditText r1 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.i0(r1)
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.setVisibility(r4)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1 = r0.a
                android.widget.EditText r1 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.k0(r1)
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.setVisibility(r4)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1 = r0.a
                android.widget.EditText r1 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.j0(r1)
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.setVisibility(r5)
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1 = r0.a
                android.widget.TextView r1 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.n0(r1)
                r1.setText(r2)
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity a;

        d(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r2 = r1.a
                java.lang.String r0 = "申请成功"
                r2.f0(r0)
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity> r0 = com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r2 = (com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity) r2
                if (r2 == 0) goto L18
                r2.l0()
            L18:
                com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    public ApplyScoreDoubtActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.G0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.K0 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 g0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.s0(r1)
            return r0
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.t0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.EditText i0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0) {
            android.widget.EditText r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.EditText j0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0) {
            android.widget.EditText r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.EditText k0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0) {
            android.widget.EditText r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a l0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.J0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List m0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.K0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0, java.util.List r1) {
            r0.K0 = r1
            return
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void q0() {
            r10 = this;
            android.widget.EditText r0 = r10.c0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r0.trim()
            android.widget.EditText r0 = r10.f778k0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = r0.trim()
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L28
            java.lang.String r0 = "申请理由不能为空"
            r10.f0(r0)
            return
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L34
            java.lang.String r0 = "联系电话不能为空"
            r10.f0(r0)
            return
        L34:
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r10.J0
            android.widget.Spinner r1 = r10.I0
            int r1 = r1.getSelectedItemPosition()
            java.lang.Object r0 = r0.getItem(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "examName"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r1 = r10.J0
            android.widget.Spinner r2 = r10.I0
            int r2 = r2.getSelectedItemPosition()
            java.lang.Object r1 = r1.getItem(r2)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "actualScore"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            android.widget.EditText r1 = r10.Y
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.String r2 = "身高"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Laa
            java.lang.String r2 = "体重"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Laa
            android.widget.EditText r0 = r10.Z
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            android.widget.EditText r1 = r10.a0
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        Laa:
            r6 = r1
            android.content.Context r0 = r10.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r10.L0
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r4 = r10.J0
            android.widget.Spinner r9 = r10.I0
            int r9 = r9.getSelectedItemPosition()
            java.lang.Object r4 = r4.getItem(r9)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r9 = "examid"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r9)
            rx.e r1 = r1.B(r2, r3, r4, r5, r6, r7, r8)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity$d r1 = new com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity$d
            r1.<init>(r10)
            r0.setDataListener(r1)
            return
    }

    private void r0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.L0
            rx.e r1 = r1.P(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity$b r1 = new com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ kotlin.n1 s0(java.io.File r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.G0
            java.lang.String r2 = r2.getPath()
            r0.add(r2)
            cn.bluemobi.dylan.base.adapter.c r2 = r1.H0
            java.util.List<java.lang.String> r0 = r1.G0
            r2.c(r0)
            r2 = 0
            return r2
    }

    private /* synthetic */ void t0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.W
            com.bxkj.student.home.physicaltest.apply.a r3 = new com.bxkj.student.home.physicaltest.apply.a
            r3.<init>(r0)
            r1.q(r2, r3)
            return
    }

    public static byte[] u0(java.lang.String r9) {
            r1 = 0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.lang.String r2 = "r"
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r7 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r5 = 0
            java.nio.MappedByteBuffer r9 = r3.map(r4, r5, r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.nio.MappedByteBuffer r9 = r9.load()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            boolean r0 = r9.isLoaded()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            com.orhanobut.logger.j.c(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r0 = (int) r4     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            if (r2 <= 0) goto L41
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r4 = 0
            r9.get(r0, r4, r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            goto L41
        L3d:
            r0 = move-exception
            r9 = r0
            r1 = r3
            goto L4a
        L41:
            r3.close()     // Catch: java.io.IOException -> L44
        L44:
            return r0
        L45:
            r0 = move-exception
            r9 = r0
            goto L4a
        L48:
            r3 = r1
            goto L4e
        L4a:
            r1.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r9
        L4e:
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            return r1
    }

    public void L() {
            r2 = this;
            android.widget.Spinner r0 = r2.I0
            com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity$c r1 = new com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity$c
            r1.<init>(r2)
            r0.setOnItemSelectedListener(r1)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.f779p0
            com.bxkj.student.home.physicaltest.apply.b r1 = new com.bxkj.student.home.physicaltest.apply.b
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            android.widget.Button r0 = r2.F0
            r0.setOnClickListener(r2)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492903(0x7f0c0027, float:1.8609271E38)
            return r0
    }

    public void R() {
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "meaScoreId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r5.L0 = r0
        L16:
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.G0
            android.content.Context r2 = r5.V
            r3 = 1092616192(0x41200000, float:10.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r5.H0 = r0
            r1 = 3
            r0.e(r1)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.f779p0
            cn.bluemobi.dylan.base.adapter.c r1 = r5.H0
            r0.setAdapter(r1)
            com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity$a r0 = new com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493230(0x7f0c016e, float:1.8609934E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.K0
            r0.<init>(r5, r1, r2, r3)
            r5.J0 = r0
            android.widget.Spinner r1 = r5.I0
            r1.setAdapter(r0)
            android.widget.FrameLayout r0 = r5.P()
            r0.setVisibility(r4)
            r5.r0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "体测成绩申诉"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131296949(0x7f0902b5, float:1.821183E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.Y = r2
            r2 = 2131296933(0x7f0902a5, float:1.8211797E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.Z = r2
            r2 = 2131296959(0x7f0902bf, float:1.821185E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.a0 = r2
            r2 = 2131299173(0x7f090b65, float:1.821634E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            r2 = 2131296931(0x7f0902a3, float:1.8211793E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.c0 = r2
            r2 = 2131296941(0x7f0902ad, float:1.8211813E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.f778k0 = r2
            r2 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r2 = (cn.bluemobi.dylan.base.view.MyGridView) r2
            r1.f779p0 = r2
            r2 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.F0 = r2
            r2 = 2131298550(0x7f0908f6, float:1.8215076E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Spinner r2 = (android.widget.Spinner) r2
            r1.I0 = r2
            cn.bluemobi.dylan.base.view.MyGridView r2 = r1.f779p0
            r0 = 8
            r2.setVisibility(r0)
            android.widget.Spinner r2 = r1.I0
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            r0.q0()
            return
    }
}
