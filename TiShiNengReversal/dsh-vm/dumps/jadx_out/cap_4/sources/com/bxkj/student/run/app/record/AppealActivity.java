package com.bxkj.student.run.app.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AppealActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText Y;
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog Z;
    private cn.bluemobi.dylan.base.view.MyGridView a0;
    private android.widget.Button b0;
    private java.util.List<java.lang.String> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.c f1183k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.record.AppealActivity a;

        a(com.bxkj.student.run.app.record.AppealActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.run.app.record.AppealActivity.a r0, android.view.View r1) {
                r0.c(r1)
                return
        }

        public static /* synthetic */ boolean b(android.content.DialogInterface r0, int r1, android.view.KeyEvent r2) {
                r0 = 4
                if (r1 != r0) goto L5
                r0 = 1
                return r0
            L5:
                r0 = 0
                return r0
        }

        private /* synthetic */ void c(android.view.View r1) {
                r0 = this;
                com.bxkj.student.run.app.record.AppealActivity r1 = r0.a
                r1.finish()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                cn.bluemobi.dylan.base.utils.a r3 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.run.app.record.RunRecorderListActivity> r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.class
                android.app.Activity r3 = r3.getActivity(r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = (com.bxkj.student.run.app.record.RunRecorderListActivity) r3
                if (r3 == 0) goto L11
                r3.I0()
            L11:
                com.bxkj.student.run.app.record.AppealActivity r3 = r2.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.record.AppealActivity r1 = r2.a
                android.content.Context r1 = com.bxkj.student.run.app.record.AppealActivity.l0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "申诉成功，等待管理员审核，请耐心等待！"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                com.bxkj.student.run.app.record.d r1 = new com.bxkj.student.run.app.record.d
                r1.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setButtonOnClickListener(r1)
                com.bxkj.student.run.app.record.AppealActivity.k0(r3, r0)
                com.bxkj.student.run.app.record.AppealActivity r3 = r2.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.student.run.app.record.AppealActivity.j0(r3)
                r0 = 0
                r3.setCanceledOnTouchOutside(r0)
                com.bxkj.student.run.app.record.AppealActivity r3 = r2.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.student.run.app.record.AppealActivity.j0(r3)
                r3.show()
                com.bxkj.student.run.app.record.AppealActivity r3 = r2.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.student.run.app.record.AppealActivity.j0(r3)
                com.bxkj.student.run.app.record.e r0 = new com.bxkj.student.run.app.record.e
                r0.<init>()
                r3.setOnKeyListener(r0)
                return
        }
    }

    public AppealActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.record.AppealActivity r0, android.view.View r1) {
            r0.o0(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 h0(com.bxkj.student.run.app.record.AppealActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.p0(r1)
            return r0
    }

    public static /* synthetic */ void i0(com.bxkj.student.run.app.record.AppealActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.q0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog j0(com.bxkj.student.run.app.record.AppealActivity r0) {
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.run.app.record.AppealActivity r0, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1) {
            r0.Z = r1
            return
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.run.app.record.AppealActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void m0() {
            r6 = this;
            android.widget.EditText r0 = r6.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L29
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r6.V
            r0.<init>(r1)
            android.widget.EditText r1 = r6.Y
            java.lang.CharSequence r1 = r1.getHint()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L29:
            java.util.List<java.lang.String> r1 = r6.c0
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
        L32:
            java.util.List<java.lang.String> r3 = r6.c0
            int r3 = r3.size()
            if (r2 >= r3) goto L4b
            java.util.List<java.lang.String> r3 = r6.c0
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.bxkj.base.util.j.b(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L32
        L4b:
            android.content.Context r2 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            java.lang.Class<com.bxkj.student.run.app.a> r3 = com.bxkj.student.run.app.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            com.bxkj.student.run.app.a r3 = (com.bxkj.student.run.app.a) r3
            android.content.Intent r4 = r6.getIntent()
            java.lang.String r5 = "id"
            java.lang.String r4 = r4.getStringExtra(r5)
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            rx.e r0 = r3.b(r4, r0, r1)
            cn.bluemobi.dylan.http.HttpRequest r0 = r2.setObservable(r0)
            com.bxkj.student.run.app.record.AppealActivity$a r1 = new com.bxkj.student.run.app.record.AppealActivity$a
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    public static java.util.Map<java.lang.String, okhttp3.RequestBody> n0(java.lang.String r6, java.util.List<java.io.File> r7) {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r7.size()
            if (r1 >= r2) goto L3a
            java.lang.Object r2 = r7.get(r1)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = "image/png"
            okhttp3.MediaType r3 = okhttp3.MediaType.parse(r3)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r3, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = "\"; filename=\""
            r4.append(r5)
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L6
        L3a:
            return r0
    }

    private /* synthetic */ void o0(android.view.View r1) {
            r0 = this;
            r0.m0()
            return
    }

    private /* synthetic */ kotlin.n1 p0(java.io.File r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.c0
            java.lang.String r2 = r2.getPath()
            r0.add(r2)
            cn.bluemobi.dylan.base.adapter.c r2 = r1.f1183k0
            java.util.List<java.lang.String> r0 = r1.c0
            r2.c(r0)
            r2 = 0
            return r2
    }

    private /* synthetic */ void q0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.W
            com.bxkj.student.run.app.record.c r3 = new com.bxkj.student.run.app.record.c
            r3.<init>(r0)
            r1.q(r2, r3)
            return
    }

    public static byte[] r0(java.lang.String r9) {
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
            android.widget.Button r0 = r2.b0
            com.bxkj.student.run.app.record.a r1 = new com.bxkj.student.run.app.record.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.a0
            com.bxkj.student.run.app.record.b r1 = new com.bxkj.student.run.app.record.b
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492897(0x7f0c0021, float:1.8609259E38)
            return r0
    }

    public void R() {
            r5 = this;
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.c0
            android.content.Context r2 = r5.V
            r3 = 1092616192(0x41200000, float:10.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r5.f1183k0 = r0
            r1 = 3
            r0.e(r1)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.a0
            cn.bluemobi.dylan.base.adapter.c r1 = r5.f1183k0
            r0.setAdapter(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我要申诉"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131296947(0x7f0902b3, float:1.8211825E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.Y = r2
            r2 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r0 = r1.findViewById(r2)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.b0 = r0
            r0 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r0 = r1.findViewById(r0)
            cn.bluemobi.dylan.base.view.MyGridView r0 = (cn.bluemobi.dylan.base.view.MyGridView) r0
            r1.a0 = r0
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.b0 = r2
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
