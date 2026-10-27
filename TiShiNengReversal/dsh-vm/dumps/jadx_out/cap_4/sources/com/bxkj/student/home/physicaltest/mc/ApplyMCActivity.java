package com.bxkj.student.home.physicaltest.mc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyMCActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private android.widget.Spinner G0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> H0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> I0;
    private android.widget.EditText Y;
    private cn.bluemobi.dylan.base.view.MyGridView Z;
    private android.widget.Button a0;
    private java.util.List<java.lang.String> b0;
    private cn.bluemobi.dylan.base.adapter.c c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Spinner f786k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> f787p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMCActivity e;

        a(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "statusname"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r2.J(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMCActivity e;

        b(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMCActivity a;

        c(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.m0(r0, r3)
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r3 = com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.i0(r3)
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.j0(r0)
                r3.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMCActivity a;

        d(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0 = r4.a     // Catch: java.lang.Exception -> L4f
                java.lang.String r1 = "data"
                java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L4f
                java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L4f
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.n0(r0, r5)     // Catch: java.lang.Exception -> L4f
                r5 = 0
                r0 = 0
                r1 = 0
            L10:
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r2 = r4.a     // Catch: java.lang.Exception -> L4f
                java.util.List r2 = com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.l0(r2)     // Catch: java.lang.Exception -> L4f
                int r2 = r2.size()     // Catch: java.lang.Exception -> L4f
                if (r0 >= r2) goto L35
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r2 = r4.a     // Catch: java.lang.Exception -> L4f
                java.util.List r2 = com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.l0(r2)     // Catch: java.lang.Exception -> L4f
                java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L4f
                java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L4f
                java.lang.String r3 = "displayorder"
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)     // Catch: java.lang.Exception -> L4f
                r3 = 1
                if (r2 != r3) goto L32
                r1 = r0
            L32:
                int r0 = r0 + 1
                goto L10
            L35:
                if (r1 == 0) goto L40
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0 = r4.a     // Catch: java.lang.Exception -> L4f
                java.util.List r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.l0(r0)     // Catch: java.lang.Exception -> L4f
                java.util.Collections.swap(r0, r5, r1)     // Catch: java.lang.Exception -> L4f
            L40:
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r5 = r4.a     // Catch: java.lang.Exception -> L4f
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r5 = com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.k0(r5)     // Catch: java.lang.Exception -> L4f
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0 = r4.a     // Catch: java.lang.Exception -> L4f
                java.util.List r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.l0(r0)     // Catch: java.lang.Exception -> L4f
                r5.c(r0)     // Catch: java.lang.Exception -> L4f
            L4f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMCActivity a;

        e(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r2 = r1.a
                java.lang.String r0 = "申请成功"
                r2.f0(r0)
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity> r0 = com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r2 = (com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity) r2
                if (r2 == 0) goto L18
                r2.l0()
            L18:
                com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    public ApplyMCActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.F0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.I0 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 g0(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.r0(r1)
            return r0
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.s0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a i0(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f787p0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a k0(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0, java.util.List r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.physicaltest.mc.ApplyMCActivity r0, java.util.List r1) {
            r0.I0 = r1
            return
    }

    private void o0() {
            r12 = this;
            android.widget.Spinner r0 = r12.G0
            int r0 = r0.getSelectedItemPosition()
            r1 = -1
            if (r0 != r1) goto L1a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r12.V
            r0.<init>(r1)
            java.lang.String r1 = "请选择年份"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L1a:
            android.widget.Spinner r2 = r12.f786k0
            int r2 = r2.getSelectedItemPosition()
            if (r2 != r1) goto L33
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r12.V
            r0.<init>(r1)
            java.lang.String r1 = "请选择状态"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L33:
            android.widget.EditText r1 = r12.Y
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r6 = r1.trim()
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L4d
            java.lang.String r0 = "申请理由不能为空"
            r12.f0(r0)
            return
        L4d:
            java.util.List<java.lang.String> r1 = r12.b0
            int r1 = r1.size()
            if (r1 != 0) goto L5b
            java.lang.String r0 = "至少上传一张图片"
            r12.f0(r0)
            return
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List<java.lang.String> r4 = r12.b0
            java.util.Iterator r4 = r4.iterator()
        L6b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb5
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.io.File r7 = new java.io.File
            r7.<init>(r5)
            java.lang.String r5 = r1.toString()
            boolean r5 = r5.isEmpty()
            java.lang.String r8 = ","
            java.lang.String r9 = ""
            if (r5 == 0) goto L8c
            r5 = r9
            goto L8d
        L8c:
            r5 = r8
        L8d:
            r1.append(r5)
            java.lang.String r5 = r7.getName()
            r1.append(r5)
            java.lang.String r5 = r3.toString()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto La2
            r8 = r9
        La2:
            r3.append(r8)
            java.lang.String r5 = r7.getPath()
            byte[] r5 = t0(r5)
            java.lang.String r5 = cn.bluemobi.dylan.base.utils.b.b(r5)
            r3.append(r5)
            goto L6b
        Lb5:
            android.content.Context r4 = r12.V
            cn.bluemobi.dylan.http.HttpRequest r11 = cn.bluemobi.dylan.http.Http.with(r4)
            java.lang.Class<d0.a> r4 = d0.a.class
            java.lang.Object r4 = cn.bluemobi.dylan.http.Http.getApiService(r4)
            d0.a r4 = (d0.a) r4
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r5.getUserId()
            java.lang.String r7 = r1.toString()
            java.lang.String r8 = r3.toString()
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r1 = r12.f787p0
            java.lang.Object r1 = r1.getItem(r2)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "id"
            java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r1 = r12.H0
            java.lang.Object r0 = r1.getItem(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r10 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r3 = r4
            r4 = r5
            java.lang.String r5 = "meaNonStuApply"
            rx.e r0 = r3.T(r4, r5, r6, r7, r8, r9, r10)
            cn.bluemobi.dylan.http.HttpRequest r0 = r11.setObservable(r0)
            com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$e r1 = new com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$e
            r1.<init>(r12)
            r0.setDataListener(r1)
            return
    }

    private void p0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.u0()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$c r1 = new com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$c
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void q0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.k1()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$d r1 = new com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$d
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ kotlin.n1 r0(java.io.File r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.b0
            java.lang.String r2 = r2.getPath()
            r0.add(r2)
            cn.bluemobi.dylan.base.adapter.c r2 = r1.c0
            java.util.List<java.lang.String> r0 = r1.b0
            r2.c(r0)
            r2 = 0
            return r2
    }

    private /* synthetic */ void s0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.W
            com.bxkj.student.home.physicaltest.mc.b r3 = new com.bxkj.student.home.physicaltest.mc.b
            r3.<init>(r0)
            r1.q(r2, r3)
            return
    }

    public static byte[] t0(java.lang.String r9) {
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
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.Z
            com.bxkj.student.home.physicaltest.mc.a r1 = new com.bxkj.student.home.physicaltest.mc.a
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            android.widget.Button r0 = r2.a0
            r0.setOnClickListener(r2)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492900(0x7f0c0024, float:1.8609265E38)
            return r0
    }

    public void R() {
            r5 = this;
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.b0
            android.content.Context r2 = r5.V
            r3 = 1092616192(0x41200000, float:10.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r5.c0 = r0
            r1 = 3
            r0.e(r1)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.Z
            cn.bluemobi.dylan.base.adapter.c r1 = r5.c0
            r0.setAdapter(r1)
            com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$a r0 = new com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$a
            android.content.Context r1 = r5.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.F0
            r3 = 2131493315(0x7f0c01c3, float:1.8610107E38)
            r0.<init>(r5, r1, r3, r2)
            r5.f787p0 = r0
            android.widget.Spinner r1 = r5.f786k0
            r1.setAdapter(r0)
            r5.p0()
            com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$b r0 = new com.bxkj.student.home.physicaltest.mc.ApplyMCActivity$b
            android.content.Context r1 = r5.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.I0
            r0.<init>(r5, r1, r3, r2)
            r5.H0 = r0
            android.widget.Spinner r1 = r5.G0
            r1.setAdapter(r0)
            r5.q0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "申请免测"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296931(0x7f0902a3, float:1.8211793E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Y = r1
            r1 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.view.MyGridView r1 = (cn.bluemobi.dylan.base.view.MyGridView) r1
            r0.Z = r1
            r1 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.a0 = r1
            r1 = 2131298550(0x7f0908f6, float:1.8215076E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Spinner r1 = (android.widget.Spinner) r1
            r0.f786k0 = r1
            r1 = 2131298551(0x7f0908f7, float:1.8215078E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Spinner r1 = (android.widget.Spinner) r1
            r0.G0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            r0.o0()
            return
    }
}
