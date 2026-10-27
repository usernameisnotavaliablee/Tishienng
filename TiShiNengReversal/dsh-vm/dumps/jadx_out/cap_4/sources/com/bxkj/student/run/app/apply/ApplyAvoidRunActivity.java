package com.bxkj.student.run.app.apply;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyAvoidRunActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText Y;
    private cn.bluemobi.dylan.base.view.MyGridView Z;
    private android.widget.Button a0;
    private java.util.List<java.lang.String> b0;
    private cn.bluemobi.dylan.base.adapter.c c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Spinner f1151k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.Spinner f1152p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.apply.ApplyAvoidRunActivity a;

        a(com.bxkj.student.run.app.apply.ApplyAvoidRunActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.run.app.apply.ApplyAvoidRunActivity r2 = r1.a
                java.lang.String r0 = "申请成功"
                r2.f0(r0)
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity> r0 = com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r2 = (com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity) r2
                if (r2 == 0) goto L18
                r2.l0()
            L18:
                com.bxkj.student.run.app.apply.ApplyAvoidRunActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    public ApplyAvoidRunActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.apply.ApplyAvoidRunActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.k0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ kotlin.n1 h0(com.bxkj.student.run.app.apply.ApplyAvoidRunActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.j0(r1)
            return r0
    }

    private void i0() {
            r8 = this;
            android.widget.EditText r0 = r8.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1a
            java.lang.String r0 = "申请理由不能为空"
            r8.f0(r0)
            return
        L1a:
            java.util.List<java.lang.String> r1 = r8.b0
            int r1 = r1.size()
            if (r1 != 0) goto L28
            java.lang.String r0 = "至少上传一张图片"
            r8.f0(r0)
            return
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.List<java.lang.String> r3 = r8.b0
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L82
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            java.lang.String r4 = r1.toString()
            boolean r4 = r4.isEmpty()
            java.lang.String r6 = ","
            java.lang.String r7 = ""
            if (r4 == 0) goto L59
            r4 = r7
            goto L5a
        L59:
            r4 = r6
        L5a:
            r1.append(r4)
            java.lang.String r4 = r5.getName()
            r1.append(r4)
            java.lang.String r4 = r2.toString()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L6f
            r6 = r7
        L6f:
            r2.append(r6)
            java.lang.String r4 = r5.getPath()
            byte[] r4 = l0(r4)
            java.lang.String r4 = cn.bluemobi.dylan.base.utils.b.b(r4)
            r2.append(r4)
            goto L38
        L82:
            android.content.Context r3 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r3 = cn.bluemobi.dylan.http.Http.with(r3)
            java.lang.Class<com.bxkj.student.run.app.a> r4 = com.bxkj.student.run.app.a.class
            java.lang.Object r4 = cn.bluemobi.dylan.http.Http.getApiService(r4)
            com.bxkj.student.run.app.a r4 = (com.bxkj.student.run.app.a) r4
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r5.getUserId()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r2.toString()
            rx.e r0 = r4.n(r5, r0, r1, r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r3.setObservable(r0)
            com.bxkj.student.run.app.apply.ApplyAvoidRunActivity$a r1 = new com.bxkj.student.run.app.apply.ApplyAvoidRunActivity$a
            r1.<init>(r8)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ kotlin.n1 j0(java.io.File r2) {
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

    private /* synthetic */ void k0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.W
            com.bxkj.student.run.app.apply.a r3 = new com.bxkj.student.run.app.apply.a
            r3.<init>(r0)
            r1.q(r2, r3)
            return
    }

    public static byte[] l0(java.lang.String r9) {
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
            com.bxkj.student.run.app.apply.b r1 = new com.bxkj.student.run.app.apply.b
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
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "申请免跑"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131296931(0x7f0902a3, float:1.8211793E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.Y = r2
            r2 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r2 = (cn.bluemobi.dylan.base.view.MyGridView) r2
            r1.Z = r2
            r2 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.a0 = r2
            r2 = 2131298550(0x7f0908f6, float:1.8215076E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Spinner r2 = (android.widget.Spinner) r2
            r1.f1151k0 = r2
            r2 = 2131298551(0x7f0908f7, float:1.8215078E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Spinner r2 = (android.widget.Spinner) r2
            r1.f1152p0 = r2
            android.widget.Spinner r2 = r1.f1151k0
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            r0 = 8
            r2.setVisibility(r0)
            android.widget.Spinner r2 = r1.f1152p0
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            r0.i0()
            return
    }
}
