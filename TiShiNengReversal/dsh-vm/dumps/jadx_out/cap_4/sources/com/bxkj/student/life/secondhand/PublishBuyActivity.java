package com.bxkj.student.life.secondhand;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PublishBuyActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Spinner F0;
    private cn.bluemobi.dylan.base.view.MyGridView G0;
    private java.util.List<java.lang.String> H0;
    private cn.bluemobi.dylan.base.adapter.c I0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> J0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> K0;
    private android.widget.EditText Y;
    private android.widget.EditText Z;
    private android.widget.EditText a0;
    private android.widget.EditText b0;
    private android.widget.EditText c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Button f1061k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f1062p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.secondhand.PublishBuyActivity e;

        a(com.bxkj.student.life.secondhand.PublishBuyActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.secondhand.PublishBuyActivity a;

        b(com.bxkj.student.life.secondhand.PublishBuyActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.secondhand.PublishBuyActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.life.secondhand.PublishBuyActivity.k0(r0, r3)
                androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
                r3.<init>()
                java.lang.String r0 = "name"
                java.lang.String r1 = "请选择物品类型"
                r3.put(r0, r1)
                com.bxkj.student.life.secondhand.PublishBuyActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.secondhand.PublishBuyActivity.j0(r0)
                r1 = 0
                r0.add(r1, r3)
                com.bxkj.student.life.secondhand.PublishBuyActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r3 = com.bxkj.student.life.secondhand.PublishBuyActivity.i0(r3)
                com.bxkj.student.life.secondhand.PublishBuyActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.secondhand.PublishBuyActivity.j0(r0)
                r3.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.secondhand.PublishBuyActivity a;

        c(com.bxkj.student.life.secondhand.PublishBuyActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.life.secondhand.PublishBuyActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public PublishBuyActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.H0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.K0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.life.secondhand.PublishBuyActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.n0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ kotlin.n1 h0(com.bxkj.student.life.secondhand.PublishBuyActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.m0(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a i0(com.bxkj.student.life.secondhand.PublishBuyActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.J0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.life.secondhand.PublishBuyActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.K0
            return r0
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.life.secondhand.PublishBuyActivity r0, java.util.List r1) {
            r0.K0 = r1
            return
    }

    private void l0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.e> r1 = w.e.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.e r1 = (w.e) r1
            rx.e r1 = r1.c()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.secondhand.PublishBuyActivity$b r1 = new com.bxkj.student.life.secondhand.PublishBuyActivity$b
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ kotlin.n1 m0(java.io.File r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.H0
            java.lang.String r2 = r2.getPath()
            r0.add(r2)
            cn.bluemobi.dylan.base.adapter.c r2 = r1.I0
            java.util.List<java.lang.String> r0 = r1.H0
            r2.c(r0)
            r2 = 0
            return r2
    }

    private /* synthetic */ void n0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.W
            com.bxkj.student.life.secondhand.a r3 = new com.bxkj.student.life.secondhand.a
            r3.<init>(r0)
            r1.q(r2, r3)
            return
    }

    private void o0() {
            r13 = this;
            android.widget.Spinner r0 = r13.F0
            int r0 = r0.getSelectedItemPosition()
            r1 = -1
            if (r0 == r1) goto L113
            android.widget.Spinner r0 = r13.F0
            int r0 = r0.getSelectedItemPosition()
            if (r0 != 0) goto L13
            goto L113
        L13:
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r13.J0
            android.widget.Spinner r1 = r13.F0
            int r1 = r1.getSelectedItemPosition()
            java.lang.Object r0 = r0.getItem(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "id"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            android.widget.EditText r0 = r13.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L41
            java.lang.String r0 = "请简单描述一下哦"
            r13.f0(r0)
            return
        L41:
            android.widget.EditText r0 = r13.Z
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L5b
            java.lang.String r0 = "请定一个合适的价格哦"
            r13.f0(r0)
            return
        L5b:
            android.widget.EditText r0 = r13.a0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r0.trim()
            android.widget.EditText r0 = r13.b0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r10 = r0.trim()
            android.widget.EditText r0 = r13.c0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L9d
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L9d
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L9d
            java.lang.String r0 = "至少填写一种联系方式哦"
            r13.f0(r0)
            return
        L9d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<java.lang.String> r2 = r13.H0
            java.util.Iterator r2 = r2.iterator()
        Lad:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Le5
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r5 = new java.io.File
            r5.<init>(r3)
            java.lang.String r3 = r5.getPath()
            byte[] r3 = p0(r3)
            java.lang.String r3 = cn.bluemobi.dylan.base.utils.b.b(r3)
            r1.add(r3)
            java.util.HashMap r7 = new java.util.HashMap
            r12 = 2
            r7.<init>(r12)
            java.lang.String r12 = "imageName"
            java.lang.String r5 = r5.getName()
            r7.put(r12, r5)
            java.lang.String r5 = "imageBase64"
            r7.put(r5, r3)
            r0.add(r7)
            goto Lad
        Le5:
            java.lang.String r7 = com.alibaba.fastjson.JSON.toJSONString(r1)
            android.content.Context r0 = r13.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.i> r1 = w.i.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            w.i r2 = (w.i) r2
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r1.getOpenId()
            int r5 = r13.f1062p0
            rx.e r1 = r2.e(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.secondhand.PublishBuyActivity$c r1 = new com.bxkj.student.life.secondhand.PublishBuyActivity$c
            r1.<init>(r13)
            r0.setDataListener(r1)
            return
        L113:
            java.lang.String r0 = "请选择物品类型"
            r13.f0(r0)
            return
    }

    public static byte[] p0(java.lang.String r9) {
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
            android.widget.Button r0 = r2.f1061k0
            r0.setOnClickListener(r2)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.G0
            com.bxkj.student.life.secondhand.b r1 = new com.bxkj.student.life.secondhand.b
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493000(0x7f0c0088, float:1.8609468E38)
            return r0
    }

    public void R() {
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "type"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L24
            android.content.Intent r0 = r5.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r5.f1062p0 = r0
            if (r0 != 0) goto L1f
            java.lang.String r0 = "发布求购信息"
            r5.setTitle(r0)
            goto L24
        L1f:
            java.lang.String r0 = "发布出售信息"
            r5.setTitle(r0)
        L24:
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.H0
            android.content.Context r2 = r5.V
            r3 = 1092616192(0x41200000, float:10.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r5.I0 = r0
            r1 = 3
            r0.e(r1)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.G0
            cn.bluemobi.dylan.base.adapter.c r1 = r5.I0
            r0.setAdapter(r1)
            com.bxkj.student.life.secondhand.PublishBuyActivity$a r0 = new com.bxkj.student.life.secondhand.PublishBuyActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493315(0x7f0c01c3, float:1.8610107E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.K0
            r0.<init>(r5, r1, r2, r3)
            r5.J0 = r0
            android.widget.Spinner r1 = r5.F0
            r1.setAdapter(r0)
            r5.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "发布求购信息"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r0 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r0 = (cn.bluemobi.dylan.base.view.MyGridView) r0
            r1.G0 = r0
            r0 = 2131298550(0x7f0908f6, float:1.8215076E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Spinner r0 = (android.widget.Spinner) r0
            r1.F0 = r0
            r0 = 2131296932(0x7f0902a4, float:1.8211795E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.Y = r0
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r2 = (cn.bluemobi.dylan.base.view.MyGridView) r2
            r1.G0 = r2
            r2 = 2131296942(0x7f0902ae, float:1.8211815E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.Z = r2
            r2 = 2131296941(0x7f0902ad, float:1.8211813E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.a0 = r2
            r2 = 2131296958(0x7f0902be, float:1.8211847E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.b0 = r2
            r2 = 2131296944(0x7f0902b0, float:1.8211819E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.c0 = r2
            r2 = 2131296629(0x7f090175, float:1.821118E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.f1061k0 = r2
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296629(0x7f090175, float:1.821118E38)
            if (r2 == r0) goto La
            return
        La:
            r1.o0()
            return
    }
}
